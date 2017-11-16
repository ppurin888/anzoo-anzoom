package com.anzoo_anzoom.controllers.users;

import com.anzoo_anzoom.database.anzoo_anzoom.tables.UserContactInfoTypes;
import com.anzoo_anzoom.database.anzoo_anzoom.tables.UserPasswordEncryptionTypes;
import com.anzoo_anzoom.database.anzoo_anzoom.tables.Users;
import com.anzoo_anzoom.database.anzoo_anzoom.tables.records.UsersRecord;
import com.anzoo_anzoom.presenters.SignUpPresenter;
import org.jooq.DSLContext;
import org.jooq.Record1;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Component
public class SignUpController {

    private final DSLContext dsl;

    @Autowired
    public SignUpController(DSLContext dsl) {
        this.dsl = dsl;
    }

    public Mono<ServerResponse> signUp(ServerRequest request) {
        // 1. parameters: auth_id, password, email, etc..
        // 2. validation
        //   1. auth_id 중복 여부
        // 3. 패스워드 암호화(bcrypt)
        // 4. Insert
        // 5. 해당 계정으로 access token 발급
        // 6. JWT 생성
        // 7. Redirect to: main
        // -> 생성된 해쉬를 원래 비밀번호로 검증한다. 맞을 경우 true를 반환한다. 주로 회원 로그인 로직에서 사용된다.
        // boolean isValidPassword = BCrypt.checkpw(password, passwordHashed);


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

                        return ServerResponse.ok().contentType(APPLICATION_JSON).body(Mono.just(resultMap), new ParameterizedTypeReference<Map<String, Object>>() {});
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

                            return ServerResponse.ok().contentType(APPLICATION_JSON).body(Mono.just(resultMap), new ParameterizedTypeReference<Map<String, Object>>() {});
                        }

                        user.setAuthId(presenter.getAuthId());
                        user.setEncryptedPassword(encryptedPassword.getBytes());
                        user.setFullName(presenter.getFullName());
                        user.setPasswordEncryptionTypeId(encryptionTypeId.getValue(0, encryptionTypes.ID));

                        UsersRecord userId = dsl.insertInto(users).values(user).returning(users.ID).fetchOne();

                        UserContactInfoTypes contactInfoTypes = UserContactInfoTypes.USER_CONTACT_INFO_TYPES;
                        dsl.select(contactInfoTypes.ID, contactInfoTypes.TYPE_NAME)
                           .from(contactInfoTypes)
                           .where(contactInfoTypes.TYPE_NAME.eq("email").or(contactInfoTypes.TYPE_NAME.eq("phone_number")))
                           .and(contactInfoTypes.DELETED_AT.isNull())
                           .fetch();

                        // TODO: contact info 생성해주면됨.

                        return ServerResponse.badRequest().build();
                    }
                }).switchIfEmpty(ServerResponse.badRequest().build());
    }
}
