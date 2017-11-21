/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuthenticationAccessTokens implements Serializable {

    private static final long serialVersionUID = -562550476;

    private Integer   id;
    private Integer   userId;
    private String    accessToken;
    private Timestamp expiredAt;
    private Timestamp createdAt;
    private Timestamp deletedAt;

    public AuthenticationAccessTokens() {}

    public AuthenticationAccessTokens(AuthenticationAccessTokens value) {
        this.id = value.id;
        this.userId = value.userId;
        this.accessToken = value.accessToken;
        this.expiredAt = value.expiredAt;
        this.createdAt = value.createdAt;
        this.deletedAt = value.deletedAt;
    }

    public AuthenticationAccessTokens(
        Integer   id,
        Integer   userId,
        String    accessToken,
        Timestamp expiredAt,
        Timestamp createdAt,
        Timestamp deletedAt
    ) {
        this.id = id;
        this.userId = userId;
        this.accessToken = accessToken;
        this.expiredAt = expiredAt;
        this.createdAt = createdAt;
        this.deletedAt = deletedAt;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Timestamp getExpiredAt() {
        return this.expiredAt;
    }

    public void setExpiredAt(Timestamp expiredAt) {
        this.expiredAt = expiredAt;
    }

    public Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getDeletedAt() {
        return this.deletedAt;
    }

    public void setDeletedAt(Timestamp deletedAt) {
        this.deletedAt = deletedAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AuthenticationAccessTokens (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(accessToken);
        sb.append(", ").append(expiredAt);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(deletedAt);

        sb.append(")");
        return sb.toString();
    }
}
