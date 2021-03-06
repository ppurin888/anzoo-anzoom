/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.anzoo_anzoom.tables.records;


import com.anzoo_anzoom.database.anzoo_anzoom.tables.UserContactInfoTypes;

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
public class UserContactInfoTypesRecord extends UpdatableRecordImpl<UserContactInfoTypesRecord> implements Record5<Integer, String, Timestamp, Timestamp, Timestamp> {

    private static final long serialVersionUID = 588072867;

    /**
     * Setter for <code>anzoo_anzoom.user_contact_info_types.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>anzoo_anzoom.user_contact_info_types.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>anzoo_anzoom.user_contact_info_types.type_name</code>.
     */
    public void setTypeName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>anzoo_anzoom.user_contact_info_types.type_name</code>.
     */
    public String getTypeName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>anzoo_anzoom.user_contact_info_types.created_at</code>.
     */
    public void setCreatedAt(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>anzoo_anzoom.user_contact_info_types.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>anzoo_anzoom.user_contact_info_types.updated_at</code>.
     */
    public void setUpdatedAt(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>anzoo_anzoom.user_contact_info_types.updated_at</code>.
     */
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>anzoo_anzoom.user_contact_info_types.deleted_at</code>.
     */
    public void setDeletedAt(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>anzoo_anzoom.user_contact_info_types.deleted_at</code>.
     */
    public Timestamp getDeletedAt() {
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
    public Row5<Integer, String, Timestamp, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Timestamp, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UserContactInfoTypes.USER_CONTACT_INFO_TYPES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return UserContactInfoTypes.USER_CONTACT_INFO_TYPES.TYPE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return UserContactInfoTypes.USER_CONTACT_INFO_TYPES.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return UserContactInfoTypes.USER_CONTACT_INFO_TYPES.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return UserContactInfoTypes.USER_CONTACT_INFO_TYPES.DELETED_AT;
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
        return getTypeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getDeletedAt();
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
        return getTypeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getDeletedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserContactInfoTypesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserContactInfoTypesRecord value2(String value) {
        setTypeName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserContactInfoTypesRecord value3(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserContactInfoTypesRecord value4(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserContactInfoTypesRecord value5(Timestamp value) {
        setDeletedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserContactInfoTypesRecord values(Integer value1, String value2, Timestamp value3, Timestamp value4, Timestamp value5) {
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
     * Create a detached UserContactInfoTypesRecord
     */
    public UserContactInfoTypesRecord() {
        super(UserContactInfoTypes.USER_CONTACT_INFO_TYPES);
    }

    /**
     * Create a detached, initialised UserContactInfoTypesRecord
     */
    public UserContactInfoTypesRecord(Integer id, String typeName, Timestamp createdAt, Timestamp updatedAt, Timestamp deletedAt) {
        super(UserContactInfoTypes.USER_CONTACT_INFO_TYPES);

        set(0, id);
        set(1, typeName);
        set(2, createdAt);
        set(3, updatedAt);
        set(4, deletedAt);
    }
}
