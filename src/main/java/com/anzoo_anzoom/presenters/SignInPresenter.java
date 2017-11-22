package com.anzoo_anzoom.presenters;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.nio.charset.StandardCharsets;

public class SignInPresenter {

    private final String authId;
    private final String password;

    public SignInPresenter(@JsonProperty(value = "auth_id") String authId,
                           @JsonProperty(value = "password") String password) {
        this.authId = new String(authId.getBytes(), StandardCharsets.UTF_8);
        this.password = new String(password.getBytes(), StandardCharsets.UTF_8);
    }

    public String getAuthId() {
        return authId;
    }

    public String getPassword() {
        return password;
    }
}
