package com.anzoo_anzoom.models;

import java.util.Map;

public class User {

    private final String email;
    private final String fullName;
    private final String phoneNumber;
    private final String authId;
    private final String password;

    User(String email,
                String fullName,
                String phoneNumber,
                String authId,
                String password) {
        this.email = email;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.authId = authId;
        this.password = password;
    }

    public static User of(Map<String, Object> args) {
        String email = (String) args.get("email");
        String fullName = (String) args.get("full_name");
        String phoneNumber = (String) args.get("phone_number");
        String authId = (String) args.get("auth_id");
        String password = (String) args.get("password");

        return new User(email, fullName, phoneNumber, authId, password);
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAuthId() {
        return authId;
    }

    public String getPassword() {
        return password;
    }
}
