package com.anzoo_anzoom;

import com.anzoo_anzoom.controllers.users.SignUpController;
import com.anzoo_anzoom.controllers.users.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration
public class RoutingConfiguration {

    private final SignUpController signUpController;
    private final UserController userController;

    @Autowired
    public RoutingConfiguration(SignUpController signUpController, UserController userController) {
        this.signUpController = signUpController;
        this.userController = userController;
    }

    @Bean
    public RouterFunction<?> routes() {
        return route(POST("/sign-up").and(accept(APPLICATION_JSON_UTF8)), signUpController::signUp)
                .andRoute(POST("/sign-in").and(accept(APPLICATION_JSON_UTF8)), userController::signIn);
    }
}
