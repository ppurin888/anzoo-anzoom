package com.anzoo_anzoom.controllers.users;

import com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.Users;
import com.anzoo_anzoom.presenters.SignUpPresenter;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

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
        //   2. 자잘한 보안 사항 ex) 아이디 길이, 패스워드 길이, 특수문자 포함여부 등등..
        //   3. 포맷
        // 3. 패스워드 암호화
        // 4. Insert
        // 5. 해당 계정으로 access token 발급
        // 6. JWT 생성
        // 7. Redirect to: main

        // Sample response
        return request.bodyToMono(SignUpPresenter.class)
                .flatMap(presenter -> {
                    final Users user = new Users();
                    user.setAuthId(presenter.getAuthId());
                    user.setFullName(presenter.getFullName());

                    if (user.getAuthId() == null ||
                            user.getFullName() == null)
                        return null;

                    return ServerResponse.ok().contentType(APPLICATION_JSON).body(Mono.just(user), Users.class);
                }).switchIfEmpty(ServerResponse.badRequest().build());
    }
}
