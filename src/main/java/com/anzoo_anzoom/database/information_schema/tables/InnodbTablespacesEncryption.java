/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.information_schema.tables;


import com.anzoo_anzoom.database.information_schema.InformationSchema;
import com.anzoo_anzoom.database.information_schema.tables.records.InnodbTablespacesEncryptionRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


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
public class InnodbTablespacesEncryption extends TableImpl<InnodbTablespacesEncryptionRecord> {

    private static final long serialVersionUID = 1352749948;

    /**
     * The reference instance of <code>information_schema.INNODB_TABLESPACES_ENCRYPTION</code>
     */
    public static final InnodbTablespacesEncryption INNODB_TABLESPACES_ENCRYPTION = new InnodbTablespacesEncryption();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbTablespacesEncryptionRecord> getRecordType() {
        return InnodbTablespacesEncryptionRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_TABLESPACES_ENCRYPTION.SPACE</code>.
     */
    public final TableField<InnodbTablespacesEncryptionRecord, UInteger> SPACE = createField("SPACE", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLESPACES_ENCRYPTION.NAME</code>.
     */
    public final TableField<InnodbTablespacesEncryptionRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(655).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLESPACES_ENCRYPTION.ENCRYPTION_SCHEME</code>.
     */
    public final TableField<InnodbTablespacesEncryptionRecord, UInteger> ENCRYPTION_SCHEME = createField("ENCRYPTION_SCHEME", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLESPACES_ENCRYPTION.KEYSERVER_REQUESTS</code>.
     */
    public final TableField<InnodbTablespacesEncryptionRecord, UInteger> KEYSERVER_REQUESTS = createField("KEYSERVER_REQUESTS", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLESPACES_ENCRYPTION.MIN_KEY_VERSION</code>.
     */
    public final TableField<InnodbTablespacesEncryptionRecord, UInteger> MIN_KEY_VERSION = createField("MIN_KEY_VERSION", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLESPACES_ENCRYPTION.CURRENT_KEY_VERSION</code>.
     */
    public final TableField<InnodbTablespacesEncryptionRecord, UInteger> CURRENT_KEY_VERSION = createField("CURRENT_KEY_VERSION", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLESPACES_ENCRYPTION.KEY_ROTATION_PAGE_NUMBER</code>.
     */
    public final TableField<InnodbTablespacesEncryptionRecord, ULong> KEY_ROTATION_PAGE_NUMBER = createField("KEY_ROTATION_PAGE_NUMBER", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLESPACES_ENCRYPTION.KEY_ROTATION_MAX_PAGE_NUMBER</code>.
     */
    public final TableField<InnodbTablespacesEncryptionRecord, ULong> KEY_ROTATION_MAX_PAGE_NUMBER = createField("KEY_ROTATION_MAX_PAGE_NUMBER", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLESPACES_ENCRYPTION.CURRENT_KEY_ID</code>.
     */
    public final TableField<InnodbTablespacesEncryptionRecord, UInteger> CURRENT_KEY_ID = createField("CURRENT_KEY_ID", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLESPACES_ENCRYPTION.ROTATING_OR_FLUSHING</code>.
     */
    public final TableField<InnodbTablespacesEncryptionRecord, UInteger> ROTATING_OR_FLUSHING = createField("ROTATING_OR_FLUSHING", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * Create a <code>information_schema.INNODB_TABLESPACES_ENCRYPTION</code> table reference
     */
    public InnodbTablespacesEncryption() {
        this(DSL.name("INNODB_TABLESPACES_ENCRYPTION"), null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_TABLESPACES_ENCRYPTION</code> table reference
     */
    public InnodbTablespacesEncryption(String alias) {
        this(DSL.name(alias), INNODB_TABLESPACES_ENCRYPTION);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_TABLESPACES_ENCRYPTION</code> table reference
     */
    public InnodbTablespacesEncryption(Name alias) {
        this(alias, INNODB_TABLESPACES_ENCRYPTION);
    }

    private InnodbTablespacesEncryption(Name alias, Table<InnodbTablespacesEncryptionRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbTablespacesEncryption(Name alias, Table<InnodbTablespacesEncryptionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbTablespacesEncryption as(String alias) {
        return new InnodbTablespacesEncryption(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbTablespacesEncryption as(Name alias) {
        return new InnodbTablespacesEncryption(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbTablespacesEncryption rename(String name) {
        return new InnodbTablespacesEncryption(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbTablespacesEncryption rename(Name name) {
        return new InnodbTablespacesEncryption(name, null);
    }
}
