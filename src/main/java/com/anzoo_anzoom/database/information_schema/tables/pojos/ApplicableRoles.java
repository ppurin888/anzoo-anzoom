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
public class ApplicableRoles implements Serializable {

    private static final long serialVersionUID = 1682390729;

    private String grantee;
    private String roleName;
    private String isGrantable;
    private String isDefault;

    public ApplicableRoles() {}

    public ApplicableRoles(ApplicableRoles value) {
        this.grantee = value.grantee;
        this.roleName = value.roleName;
        this.isGrantable = value.isGrantable;
        this.isDefault = value.isDefault;
    }

    public ApplicableRoles(
        String grantee,
        String roleName,
        String isGrantable,
        String isDefault
    ) {
        this.grantee = grantee;
        this.roleName = roleName;
        this.isGrantable = isGrantable;
        this.isDefault = isDefault;
    }

    public String getGrantee() {
        return this.grantee;
    }

    public void setGrantee(String grantee) {
        this.grantee = grantee;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getIsGrantable() {
        return this.isGrantable;
    }

    public void setIsGrantable(String isGrantable) {
        this.isGrantable = isGrantable;
    }

    public String getIsDefault() {
        return this.isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ApplicableRoles (");

        sb.append(grantee);
        sb.append(", ").append(roleName);
        sb.append(", ").append(isGrantable);
        sb.append(", ").append(isDefault);

        sb.append(")");
        return sb.toString();
    }
}
