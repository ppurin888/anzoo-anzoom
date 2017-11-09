/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.information_schema.tables.records;


import com.anzoo_anzoom.database.information_schema.tables.UserPrivileges;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


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
public class UserPrivilegesRecord extends TableRecordImpl<UserPrivilegesRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = -1399261483;

    /**
     * Setter for <code>information_schema.USER_PRIVILEGES.GRANTEE</code>.
     */
    public void setGrantee(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.USER_PRIVILEGES.GRANTEE</code>.
     */
    public String getGrantee() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.USER_PRIVILEGES.TABLE_CATALOG</code>.
     */
    public void setTableCatalog(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.USER_PRIVILEGES.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.USER_PRIVILEGES.PRIVILEGE_TYPE</code>.
     */
    public void setPrivilegeType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.USER_PRIVILEGES.PRIVILEGE_TYPE</code>.
     */
    public String getPrivilegeType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.USER_PRIVILEGES.IS_GRANTABLE</code>.
     */
    public void setIsGrantable(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.USER_PRIVILEGES.IS_GRANTABLE</code>.
     */
    public String getIsGrantable() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return UserPrivileges.USER_PRIVILEGES.GRANTEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return UserPrivileges.USER_PRIVILEGES.TABLE_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return UserPrivileges.USER_PRIVILEGES.PRIVILEGE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return UserPrivileges.USER_PRIVILEGES.IS_GRANTABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getGrantee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPrivilegeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getIsGrantable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getGrantee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPrivilegeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getIsGrantable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPrivilegesRecord value1(String value) {
        setGrantee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPrivilegesRecord value2(String value) {
        setTableCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPrivilegesRecord value3(String value) {
        setPrivilegeType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPrivilegesRecord value4(String value) {
        setIsGrantable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPrivilegesRecord values(String value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserPrivilegesRecord
     */
    public UserPrivilegesRecord() {
        super(UserPrivileges.USER_PRIVILEGES);
    }

    /**
     * Create a detached, initialised UserPrivilegesRecord
     */
    public UserPrivilegesRecord(String grantee, String tableCatalog, String privilegeType, String isGrantable) {
        super(UserPrivileges.USER_PRIVILEGES);

        set(0, grantee);
        set(1, tableCatalog);
        set(2, privilegeType);
        set(3, isGrantable);
    }
}
