package com.anzoo_anzoom;

import com.anzoo_anzoom.controllers.users.SignupHandler;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.http.server.reactive.ReactorHttpHandlerAdapter;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import reactor.ipc.netty.http.server.HttpServer;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

public class WebApplication {

    public static void main(String[] args) {
        HttpHandler httpHandler = RouterFunctions.toHttpHandler(routes());

        HttpServer.create("0.0.0.0")
                .newHandler(new ReactorHttpHandlerAdapter(httpHandler))
                .doOnNext(mono -> System.out.println("Server listening on " + mono.address()))
                .block()
                .onClose()
                .block();
    }

    private static RouterFunction<?> routes() {
        return route(POST("/signup").and(accept(APPLICATION_JSON)), SignupHandler::signup);
    }
}
