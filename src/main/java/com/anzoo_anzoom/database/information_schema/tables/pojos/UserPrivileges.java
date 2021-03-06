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
public class UserPrivileges implements Serializable {

    private static final long serialVersionUID = -513336879;

    private String grantee;
    private String tableCatalog;
    private String privilegeType;
    private String isGrantable;

    public UserPrivileges() {}

    public UserPrivileges(UserPrivileges value) {
        this.grantee = value.grantee;
        this.tableCatalog = value.tableCatalog;
        this.privilegeType = value.privilegeType;
        this.isGrantable = value.isGrantable;
    }

    public UserPrivileges(
        String grantee,
        String tableCatalog,
        String privilegeType,
        String isGrantable
    ) {
        this.grantee = grantee;
        this.tableCatalog = tableCatalog;
        this.privilegeType = privilegeType;
        this.isGrantable = isGrantable;
    }

    public String getGrantee() {
        return this.grantee;
    }

    public void setGrantee(String grantee) {
        this.grantee = grantee;
    }

    public String getTableCatalog() {
        return this.tableCatalog;
    }

    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    public String getPrivilegeType() {
        return this.privilegeType;
    }

    public void setPrivilegeType(String privilegeType) {
        this.privilegeType = privilegeType;
    }

    public String getIsGrantable() {
        return this.isGrantable;
    }

    public void setIsGrantable(String isGrantable) {
        this.isGrantable = isGrantable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserPrivileges (");

        sb.append(grantee);
        sb.append(", ").append(tableCatalog);
        sb.append(", ").append(privilegeType);
        sb.append(", ").append(isGrantable);

        sb.append(")");
        return sb.toString();
    }
}
