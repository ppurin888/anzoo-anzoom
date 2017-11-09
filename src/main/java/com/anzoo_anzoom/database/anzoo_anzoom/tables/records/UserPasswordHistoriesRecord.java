/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.anzoo_anzoom.tables.records;


import com.anzoo_anzoom.database.anzoo_anzoom.tables.UserPasswordHistories;

import java.sql.Timestamp;

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
public class UserPasswordHistoriesRecord extends UpdatableRecordImpl<UserPasswordHistoriesRecord> implements Record5<Integer, byte[], Integer, Integer, Timestamp> {

    private static final long serialVersionUID = -571437975;

    /**
     * Setter for <code>anzoo_anzoom.user_password_histories.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>anzoo_anzoom.user_password_histories.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>anzoo_anzoom.user_password_histories.encrypted_password</code>.
     */
    public void setEncryptedPassword(byte... value) {
        set(1, value);
    }

    /**
     * Getter for <code>anzoo_anzoom.user_password_histories.encrypted_password</code>.
     */
    public byte[] getEncryptedPassword() {
        return (byte[]) get(1);
    }

    /**
     * Setter for <code>anzoo_anzoom.user_password_histories.encryption_type_id</code>.
     */
    public void setEncryptionTypeId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>anzoo_anzoom.user_password_histories.encryption_type_id</code>.
     */
    public Integer getEncryptionTypeId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>anzoo_anzoom.user_password_histories.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>anzoo_anzoom.user_password_histories.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>anzoo_anzoom.user_password_histories.created_at</code>.
     */
    public void setCreatedAt(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>anzoo_anzoom.user_password_histories.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(4);
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
    public Row5<Integer, byte[], Integer, Integer, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, byte[], Integer, Integer, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UserPasswordHistories.USER_PASSWORD_HISTORIES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field2() {
        return UserPasswordHistories.USER_PASSWORD_HISTORIES.ENCRYPTED_PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return UserPasswordHistories.USER_PASSWORD_HISTORIES.ENCRYPTION_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return UserPasswordHistories.USER_PASSWORD_HISTORIES.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return UserPasswordHistories.USER_PASSWORD_HISTORIES.CREATED_AT;
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
    public byte[] component2() {
        return getEncryptedPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getEncryptionTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCreatedAt();
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
    public byte[] value2() {
        return getEncryptedPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getEncryptionTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPasswordHistoriesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPasswordHistoriesRecord value2(byte... value) {
        setEncryptedPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPasswordHistoriesRecord value3(Integer value) {
        setEncryptionTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPasswordHistoriesRecord value4(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPasswordHistoriesRecord value5(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPasswordHistoriesRecord values(Integer value1, byte[] value2, Integer value3, Integer value4, Timestamp value5) {
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
     * Create a detached UserPasswordHistoriesRecord
     */
    public UserPasswordHistoriesRecord() {
        super(UserPasswordHistories.USER_PASSWORD_HISTORIES);
    }

    /**
     * Create a detached, initialised UserPasswordHistoriesRecord
     */
    public UserPasswordHistoriesRecord(Integer id, byte[] encryptedPassword, Integer encryptionTypeId, Integer userId, Timestamp createdAt) {
        super(UserPasswordHistories.USER_PASSWORD_HISTORIES);

        set(0, id);
        set(1, encryptedPassword);
        set(2, encryptionTypeId);
        set(3, userId);
        set(4, createdAt);
    }
}
