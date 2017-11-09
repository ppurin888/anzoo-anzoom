/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos;


import java.io.Serializable;

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
public class UserContactInfos implements Serializable {

    private static final long serialVersionUID = 1703129783;

    private Integer id;
    private Integer userId;
    private Integer typeId;

    public UserContactInfos() {}

    public UserContactInfos(UserContactInfos value) {
        this.id = value.id;
        this.userId = value.userId;
        this.typeId = value.typeId;
    }

    public UserContactInfos(
        Integer id,
        Integer userId,
        Integer typeId
    ) {
        this.id = id;
        this.userId = userId;
        this.typeId = typeId;
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

    public Integer getTypeId() {
        return this.typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserContactInfos (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(typeId);

        sb.append(")");
        return sb.toString();
    }
}
