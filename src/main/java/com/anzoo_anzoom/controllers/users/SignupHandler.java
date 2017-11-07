package com.anzoo_anzoom.controllers.users;

import com.anzoo_anzoom.models.User;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatus;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.Map;

public class SignupHandler {
    public static Mono<ServerResponse> signup(ServerRequest request) {
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

        ParameterizedTypeReference<Map<String, Object>> typeReference = new ParameterizedTypeReference<Map<String, Object>>() {};
        Mono<Map<String, Object>> monoUser = request.bodyToMono(typeReference);
        User user = User.of(monoUser.block());

        // Transaction Start
        if (userRepostiroy.valid(user)) {
            boolean isSuccess = userService.save(user);
            // Transaction End

            if (isSuccess) {


                return ServerResponse.ok().syncBody(user);
            } else {
                return ServerResponse.status(HttpStatus.INTERNAL_SERVER_ERROR).syncBody("");
            }
        } else {
            return ServerResponse.badRequest().syncBody("");
        }
    }
}
