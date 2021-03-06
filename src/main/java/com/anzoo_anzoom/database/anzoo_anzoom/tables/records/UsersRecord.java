/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.anzoo_anzoom.tables.records;


import com.anzoo_anzoom.database.anzoo_anzoom.tables.Users;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class UsersRecord extends UpdatableRecordImpl<UsersRecord> implements Record5<Integer, String, String, byte[], Integer> {

    private static final long serialVersionUID = 920097266;

    /**
     * Setter for <code>anzoo_anzoom.users.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>anzoo_anzoom.users.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>anzoo_anzoom.users.full_name</code>.
     */
    public void setFullName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>anzoo_anzoom.users.full_name</code>.
     */
    public String getFullName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>anzoo_anzoom.users.auth_id</code>.
     */
    public void setAuthId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>anzoo_anzoom.users.auth_id</code>.
     */
    public String getAuthId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>anzoo_anzoom.users.encrypted_password</code>.
     */
    public void setEncryptedPassword(byte... value) {
        set(3, value);
    }

    /**
     * Getter for <code>anzoo_anzoom.users.encrypted_password</code>.
     */
    public byte[] getEncryptedPassword() {
        return (byte[]) get(3);
    }

    /**
     * Setter for <code>anzoo_anzoom.users.password_encryption_type_id</code>.
     */
    public void setPasswordEncryptionTypeId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>anzoo_anzoom.users.password_encryption_type_id</code>.
     */
    public Integer getPasswordEncryptionTypeId() {
        return (Integer) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, byte[], Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, byte[], Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Users.USERS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Users.USERS.FULL_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Users.USERS.AUTH_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field4() {
        return Users.USERS.ENCRYPTED_PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Users.USERS.PASSWORD_ENCRYPTION_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getFullName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getAuthId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component4() {
        return getEncryptedPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getPasswordEncryptionTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getFullName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getAuthId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value4() {
        return getEncryptedPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getPasswordEncryptionTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value2(String value) {
        setFullName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value3(String value) {
        setAuthId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value4(byte... value) {
        setEncryptedPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value5(Integer value) {
        setPasswordEncryptionTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord values(Integer value1, String value2, String value3, byte[] value4, Integer value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UsersRecord
     */
    public UsersRecord() {
        super(Users.USERS);
    }

    /**
     * Create a detached, initialised UsersRecord
     */
    public UsersRecord(Integer id, String fullName, String authId, byte[] encryptedPassword, Integer passwordEncryptionTypeId) {
        super(Users.USERS);

        set(0, id);
        set(1, fullName);
        set(2, authId);
        set(3, encryptedPassword);
        set(4, passwordEncryptionTypeId);
    }
}
