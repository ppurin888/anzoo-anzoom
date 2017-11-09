package com.anzoo_anzoom.controllers.users;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

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

//        ParameterizedTypeReference<Map<String, Object>> typeReference = new ParameterizedTypeReference<Map<String, Object>>() {};
//        Mono<Map<String, Object>> monoUser = request.bodyToMono(typeReference);
//        User user = User.of(monoUser.block());

//        return ServerResponse.ok().body();

        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).syncBody("{\"content\":\"Hello World\"}");
    }
}
