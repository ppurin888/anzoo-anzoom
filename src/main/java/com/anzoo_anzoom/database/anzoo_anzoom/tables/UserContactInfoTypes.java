/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.anzoo_anzoom.tables;


import com.anzoo_anzoom.database.anzoo_anzoom.AnzooAnzoom;
import com.anzoo_anzoom.database.anzoo_anzoom.Indexes;
import com.anzoo_anzoom.database.anzoo_anzoom.Keys;
import com.anzoo_anzoom.database.anzoo_anzoom.tables.records.UserContactInfoTypesRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class UserContactInfoTypes extends TableImpl<UserContactInfoTypesRecord> {

    private static final long serialVersionUID = -1508326582;

    /**
     * The reference instance of <code>anzoo_anzoom.user_contact_info_types</code>
     */
    public static final UserContactInfoTypes USER_CONTACT_INFO_TYPES = new UserContactInfoTypes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserContactInfoTypesRecord> getRecordType() {
        return UserContactInfoTypesRecord.class;
    }

    /**
     * The column <code>anzoo_anzoom.user_contact_info_types.id</code>.
     */
    public final TableField<UserContactInfoTypesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>anzoo_anzoom.user_contact_info_types.type_name</code>.
     */
    public final TableField<UserContactInfoTypesRecord, String> TYPE_NAME = createField("type_name", org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "");

    /**
     * The column <code>anzoo_anzoom.user_contact_info_types.created_at</code>.
     */
    public final TableField<UserContactInfoTypesRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>anzoo_anzoom.user_contact_info_types.updated_at</code>.
     */
    public final TableField<UserContactInfoTypesRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>anzoo_anzoom.user_contact_info_types.deleted_at</code>.
     */
    public final TableField<UserContactInfoTypesRecord, Timestamp> DELETED_AT = createField("deleted_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>anzoo_anzoom.user_contact_info_types</code> table reference
     */
    public UserContactInfoTypes() {
        this(DSL.name("user_contact_info_types"), null);
    }

    /**
     * Create an aliased <code>anzoo_anzoom.user_contact_info_types</code> table reference
     */
    public UserContactInfoTypes(String alias) {
        this(DSL.name(alias), USER_CONTACT_INFO_TYPES);
    }

    /**
     * Create an aliased <code>anzoo_anzoom.user_contact_info_types</code> table reference
     */
    public UserContactInfoTypes(Name alias) {
        this(alias, USER_CONTACT_INFO_TYPES);
    }

    private UserContactInfoTypes(Name alias, Table<UserContactInfoTypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserContactInfoTypes(Name alias, Table<UserContactInfoTypesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return AnzooAnzoom.ANZOO_ANZOOM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.USER_CONTACT_INFO_TYPES_PRIMARY, Indexes.USER_CONTACT_INFO_TYPES_USER_CONTACT_INFO_TYPES_TYPE_NAME_UINDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UserContactInfoTypesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER_CONTACT_INFO_TYPES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserContactInfoTypesRecord> getPrimaryKey() {
        return Keys.KEY_USER_CONTACT_INFO_TYPES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserContactInfoTypesRecord>> getKeys() {
        return Arrays.<UniqueKey<UserContactInfoTypesRecord>>asList(Keys.KEY_USER_CONTACT_INFO_TYPES_PRIMARY, Keys.KEY_USER_CONTACT_INFO_TYPES_USER_CONTACT_INFO_TYPES_TYPE_NAME_UINDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserContactInfoTypes as(String alias) {
        return new UserContactInfoTypes(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserContactInfoTypes as(Name alias) {
        return new UserContactInfoTypes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserContactInfoTypes rename(String name) {
        return new UserContactInfoTypes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserContactInfoTypes rename(Name name) {
        return new UserContactInfoTypes(name, null);
    }
}
