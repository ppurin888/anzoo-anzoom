package com.anzoo_anzoom.controllers.users;

import com.anzoo_anzoom.database.anzoo_anzoom.tables.Users;
import com.anzoo_anzoom.presenters.SignInPresenter;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.jooq.DSLContext;
import org.jooq.Record1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8;

@Component
public class UserController {

    private final DSLContext dsl;
    private final String secretKey;


    @Autowired
    public UserController(DSLContext dsl, @Value("${security.oauth2.resource.jwt.key-value}") String secretKey) {
        this.dsl = dsl;
        this.secretKey = secretKey;

    }

    public Mono<ServerResponse> signIn(ServerRequest request) {

        return request.bodyToMono(SignInPresenter.class)
                .flatMap(signInPresenter -> {
                    Map<String, Object> resultMap = new HashMap<>();

                    Users users = Users.USERS;

                    String password = signInPresenter.getPassword();

                    Record1<byte[]> hashedPasswordRecord = dsl.select(users.ENCRYPTED_PASSWORD)
                            .from(users)
                            .where(users.AUTH_ID.eq(signInPresenter.getAuthId()))
                            .fetchOne();

                    String hashedPassword = hashedPasswordRecord.getValue(users.ENCRYPTED_PASSWORD, String.class);

                    boolean isValidPassword = BCrypt.checkpw(password, hashedPassword);

                    // if true,
                    if (isValidPassword) {
                        try {
                            Algorithm algorithmHS = Algorithm.HMAC256(secretKey);
                            long issuedAt = System.currentTimeMillis();
                            int threeHours = 1000 * 60 * 180;
                            Timestamp expiredAt = new Timestamp(issuedAt + threeHours);
                            String token = JWT.create()
                                    .withIssuer("anzoo-anzoom.com")
                                    .withExpiresAt(expiredAt)
                                    .withIssuedAt(new Timestamp(issuedAt))
                                    .withClaim("auth_id", signInPresenter.getAuthId())
                                    .withClaim("user", true)
                                    .sign(algorithmHS);

                            resultMap.put("success", true);
                            resultMap.put("message", "로그인이 완료되었습니다.");

                            return ServerResponse.ok().header(HttpHeaders.AUTHORIZATION, "Bearer " + token).contentType(APPLICATION_JSON_UTF8).body(Mono.just(resultMap), new ParameterizedTypeReference<>() {});
                        } catch (UnsupportedEncodingException ex) {
                            // Do nothing
                        }
                    } else {
                        resultMap.put("success", false);
                        resultMap.put("message", "아이디와 패스워드를 확인해주세요.");
                    }

                    return ServerResponse.ok().contentType(APPLICATION_JSON_UTF8).body(Mono.just(resultMap), new ParameterizedTypeReference<>() {});
        }).switchIfEmpty(ServerResponse.badRequest().build());
    }

}
