package com.anzoo_anzoom.presenters;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.nio.charset.StandardCharsets;

public class SignUpPresenter {

    private final String authId;
    private final String fullName;
    private final String password;
    private final String email;
    private final String phoneNumber;

    public SignUpPresenter(@JsonProperty(value = "auth_id") String authId,
                           @JsonProperty(value = "full_name") String fullName,
                           @JsonProperty(value = "password") String password,
                           @JsonProperty(value = "email") String email,
                           @JsonProperty(value = "phone_number") String phoneNumber) {
        this.authId = authId;
        this.fullName = new String(fullName.getBytes(), StandardCharsets.UTF_8);
        this.password = new String(password.getBytes(), StandardCharsets.UTF_8);
        this.email = new String(email.getBytes(), StandardCharsets.UTF_8);
        this.phoneNumber = phoneNumber;
    }

    public String getAuthId() {
        return authId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
