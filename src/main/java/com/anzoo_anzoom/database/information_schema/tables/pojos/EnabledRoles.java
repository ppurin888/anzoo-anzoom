/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.information_schema.tables.pojos;


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
public class EnabledRoles implements Serializable {

    private static final long serialVersionUID = -985187256;

    private String roleName;

    public EnabledRoles() {}

    public EnabledRoles(EnabledRoles value) {
        this.roleName = value.roleName;
    }

    public EnabledRoles(
        String roleName
    ) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EnabledRoles (");

        sb.append(roleName);

        sb.append(")");
        return sb.toString();
    }
}
