/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.information_schema.tables;


import com.anzoo_anzoom.database.information_schema.InformationSchema;
import com.anzoo_anzoom.database.information_schema.tables.records.KeyColumnUsageRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class KeyColumnUsage extends TableImpl<KeyColumnUsageRecord> {

    private static final long serialVersionUID = 1253193085;

    /**
     * The reference instance of <code>information_schema.KEY_COLUMN_USAGE</code>
     */
    public static final KeyColumnUsage KEY_COLUMN_USAGE = new KeyColumnUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<KeyColumnUsageRecord> getRecordType() {
        return KeyColumnUsageRecord.class;
    }

    /**
     * The column <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_CATALOG</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> CONSTRAINT_CATALOG = createField("CONSTRAINT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_SCHEMA</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> CONSTRAINT_SCHEMA = createField("CONSTRAINT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_NAME</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> CONSTRAINT_NAME = createField("CONSTRAINT_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.KEY_COLUMN_USAGE.TABLE_CATALOG</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.KEY_COLUMN_USAGE.TABLE_SCHEMA</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.KEY_COLUMN_USAGE.TABLE_NAME</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.KEY_COLUMN_USAGE.COLUMN_NAME</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.KEY_COLUMN_USAGE.ORDINAL_POSITION</code>.
     */
    public final TableField<KeyColumnUsageRecord, Long> ORDINAL_POSITION = createField("ORDINAL_POSITION", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.KEY_COLUMN_USAGE.POSITION_IN_UNIQUE_CONSTRAINT</code>.
     */
    public final TableField<KeyColumnUsageRecord, Long> POSITION_IN_UNIQUE_CONSTRAINT = createField("POSITION_IN_UNIQUE_CONSTRAINT", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_TABLE_SCHEMA</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> REFERENCED_TABLE_SCHEMA = createField("REFERENCED_TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_TABLE_NAME</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> REFERENCED_TABLE_NAME = createField("REFERENCED_TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_COLUMN_NAME</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> REFERENCED_COLUMN_NAME = createField("REFERENCED_COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>information_schema.KEY_COLUMN_USAGE</code> table reference
     */
    public KeyColumnUsage() {
        this(DSL.name("KEY_COLUMN_USAGE"), null);
    }

    /**
     * Create an aliased <code>information_schema.KEY_COLUMN_USAGE</code> table reference
     */
    public KeyColumnUsage(String alias) {
        this(DSL.name(alias), KEY_COLUMN_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.KEY_COLUMN_USAGE</code> table reference
     */
    public KeyColumnUsage(Name alias) {
        this(alias, KEY_COLUMN_USAGE);
    }

    private KeyColumnUsage(Name alias, Table<KeyColumnUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private KeyColumnUsage(Name alias, Table<KeyColumnUsageRecord> aliased, Field<?>[] parameters) {
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
    public KeyColumnUsage as(String alias) {
        return new KeyColumnUsage(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyColumnUsage as(Name alias) {
        return new KeyColumnUsage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public KeyColumnUsage rename(String name) {
        return new KeyColumnUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public KeyColumnUsage rename(Name name) {
        return new KeyColumnUsage(name, null);
    }
}