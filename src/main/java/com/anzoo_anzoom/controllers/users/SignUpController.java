package com.anzoo_anzoom.controllers.users;

import com.anzoo_anzoom.database.anzoo_anzoom.tables.*;

import com.anzoo_anzoom.database.anzoo_anzoom.tables.records.UserContactInfosRecord;
import com.anzoo_anzoom.database.anzoo_anzoom.tables.records.UsersRecord;
import com.anzoo_anzoom.presenters.SignUpPresenter;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.jooq.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8;

@Component
public class SignUpController {

    private final DSLContext dsl;
    private final String secretKey;

    @Autowired
    public SignUpController(DSLContext dsl,
                            @Value("${security.oauth2.resource.jwt.key-value}") String secretKey) {
        this.dsl = dsl;
        this.secretKey = secretKey;
    }

    @Transactional
    public Mono<ServerResponse> signUp(ServerRequest request) {
        // 1. parameters: auth_id, password, email, etc..
        // 2. validation
        //   1. auth_id 중복 여부
        // 3. 패스워드 암호화(bcrypt)
        // 4. Insert
        // 5. JWT 생성

        // Sample response
        // bodyToMono: RequestBody(가상) -> Mono<Body>(가상) -> Mono<SignUpPresenter>
        /*
          flatMap(new Function<SignUpPresenter, Mono<?>>() {
            @Override
            Mono<?> apply(SignUpPresenter presenter) {
                // Do something
            }
          }
          flatMap(presenter -> { ... })
         */
        return request.bodyToMono(SignUpPresenter.class)
                .flatMap(presenter -> {
                    Map<String, Object> resultMap = new HashMap<>();

                    UsersRecord user = new UsersRecord();
                    user.setAuthId(presenter.getAuthId());

                    Users users = Users.USERS;

                    boolean duplicatedAuthId = dsl.select()
                            .from(users)
                            .where(users.AUTH_ID.eq(user.getAuthId()))
                            .limit(1)
                            .fetch()
                    // .getValue(users.AUTH_ID) -> String null
                    .isNotEmpty();

                    if (duplicatedAuthId) {
                        resultMap.put("success", false);
                        resultMap.put("message", "아이디가 중복되었습니다.");

                        return ServerResponse.ok().contentType(APPLICATION_JSON_UTF8).body(Mono.just(resultMap), new ParameterizedTypeReference<>() {});
                    } else {
                        String encryptedPassword = BCrypt.hashpw(presenter.getPassword(), BCrypt.gensalt(12));

                        UserPasswordEncryptionTypes encryptionTypes = UserPasswordEncryptionTypes.USER_PASSWORD_ENCRYPTION_TYPES;

                        Result<Record1<Integer>> encryptionTypeId = dsl.select(encryptionTypes.ID)
                             .from(encryptionTypes)
                             .where(encryptionTypes.TYPE_NAME.eq("bcrypt").and(encryptionTypes.SECRET_KEY.isNull()))
                             .fetch();

                        if (encryptionTypeId.isEmpty()) {
                            resultMap.put("success", false);
                            resultMap.put("message", "해당하는 암호화 알고리즘이 없습니다.");

                            return ServerResponse.ok().contentType(APPLICATION_JSON_UTF8).body(Mono.just(resultMap), new ParameterizedTypeReference<>() {});
                        }

                        user.setAuthId(presenter.getAuthId());
                        user.setEncryptedPassword(encryptedPassword.getBytes(StandardCharsets.UTF_8));
                        user.setFullName(presenter.getFullName());
                        user.setPasswordEncryptionTypeId(encryptionTypeId.getValue(0, encryptionTypes.ID));

                        UsersRecord userId = dsl.insertInto(users).set(user).returning(users.ID).fetchOne();

                        UserContactInfoTypes contactInfoTypes = UserContactInfoTypes.USER_CONTACT_INFO_TYPES;
                        UserContactInfos contactInfos = UserContactInfos.USER_CONTACT_INFOS;

                        Record1<Integer> contactInfoTypeEmailId = dsl.select(contactInfoTypes.ID)
                           .from(contactInfoTypes)
                           .where(contactInfoTypes.TYPE_NAME.eq("email"))
                           .fetchOne();

                        UserContactInfosRecord emailRecord = new UserContactInfosRecord();
                        emailRecord.setUserId(userId.getValue(users.ID, Integer.class));
                        emailRecord.setTypeId(contactInfoTypeEmailId.get(contactInfoTypes.ID));
                        emailRecord.setInfo(presenter.getEmail());

                        Record1<Integer> contactInfoTypePhoneNumber = dsl.select(contactInfoTypes.ID)
                            .from(contactInfoTypes)
                            .where(contactInfoTypes.TYPE_NAME.eq("phone_number"))
                            .fetchOne();

                        UserContactInfosRecord phoneNumberRecord = new UserContactInfosRecord();
                        phoneNumberRecord.setUserId(userId.getValue(users.ID, Integer.class));
                        phoneNumberRecord.setTypeId(contactInfoTypePhoneNumber.get(contactInfoTypes.ID));
                        phoneNumberRecord.setInfo(presenter.getPhoneNumber());

                        dsl.insertInto(contactInfos).set(emailRecord).execute();
                        dsl.insertInto(contactInfos).set(phoneNumberRecord).execute();

                        try {
                            Algorithm algorithmHS = Algorithm.HMAC256(secretKey);
                            long issuedAt = System.currentTimeMillis();
                            int threeHours = 1000 * 60 * 180;
                            Timestamp expiredAt = new Timestamp(issuedAt + threeHours);
                            String token = JWT.create()
                                    .withIssuer("anzoo-anzoom.com")
                                    .withExpiresAt(expiredAt)
                                    .withIssuedAt(new Timestamp(issuedAt))
                                    .withClaim("auth_id", presenter.getAuthId())
                                    .withClaim("full_name", presenter.getFullName())
                                    .withClaim("user", true)
                                    .sign(algorithmHS);

                            resultMap.put("success", true);
                            resultMap.put("message", "회원가입이 완료되었습니다.");

                            return ServerResponse.ok().header(HttpHeaders.AUTHORIZATION, "Bearer " + token).contentType(APPLICATION_JSON_UTF8).body(Mono.just(resultMap), new ParameterizedTypeReference<>() {});
                        } catch (UnsupportedEncodingException ex) {
                            // Do nothing
                        }

                        return ServerResponse.badRequest().build();
                    }
                }).switchIfEmpty(ServerResponse.badRequest().build());
    }
}
