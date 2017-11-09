package com.anzoo_anzoom;

import com.anzoo_anzoom.controllers.users.SignUpController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration
public class RoutingConfiguration {

    private final SignUpController signUpController;

    @Autowired
    public RoutingConfiguration(SignUpController signUpController) {
        this.signUpController = signUpController;
    }

    @Bean
    public RouterFunction<?> routes() {
        return route(POST("/sign-up").and(accept(APPLICATION_JSON)), signUpController::signUp);
    }
}
