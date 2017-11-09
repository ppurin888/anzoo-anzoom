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
public class Comments implements Serializable {

    private static final long serialVersionUID = -1907136641;

    private Integer   id;
    private Integer   userId;
    private Integer   postId;
    private String    content;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Timestamp deletedAt;

    public Comments() {}

    public Comments(Comments value) {
        this.id = value.id;
        this.userId = value.userId;
        this.postId = value.postId;
        this.content = value.content;
        this.createdAt = value.createdAt;
        this.updatedAt = value.updatedAt;
        this.deletedAt = value.deletedAt;
    }

    public Comments(
        Integer   id,
        Integer   userId,
        Integer   postId,
        String    content,
        Timestamp createdAt,
        Timestamp updatedAt,
        Timestamp deletedAt
    ) {
        this.id = id;
        this.userId = userId;
        this.postId = postId;
        this.content = content;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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

    public Integer getPostId() {
        return this.postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Timestamp getDeletedAt() {
        return this.deletedAt;
    }

    public void setDeletedAt(Timestamp deletedAt) {
        this.deletedAt = deletedAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Comments (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(postId);
        sb.append(", ").append(content);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(deletedAt);

        sb.append(")");
        return sb.toString();
    }
}