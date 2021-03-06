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
public class UserContactSubjects implements Serializable {

    private static final long serialVersionUID = 4335129;

    private Integer   id;
    private String    title;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Timestamp deletedAt;

    public UserContactSubjects() {}

    public UserContactSubjects(UserContactSubjects value) {
        this.id = value.id;
        this.title = value.title;
        this.createdAt = value.createdAt;
        this.updatedAt = value.updatedAt;
        this.deletedAt = value.deletedAt;
    }

    public UserContactSubjects(
        Integer   id,
        String    title,
        Timestamp createdAt,
        Timestamp updatedAt,
        Timestamp deletedAt
    ) {
        this.id = id;
        this.title = title;
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

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        StringBuilder sb = new StringBuilder("UserContactSubjects (");

        sb.append(id);
        sb.append(", ").append(title);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(deletedAt);

        sb.append(")");
        return sb.toString();
    }
}
