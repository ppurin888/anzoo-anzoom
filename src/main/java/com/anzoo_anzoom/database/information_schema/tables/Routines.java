/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.information_schema.tables;


import com.anzoo_anzoom.database.information_schema.InformationSchema;
import com.anzoo_anzoom.database.information_schema.tables.records.RoutinesRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
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
public class Routines extends TableImpl<RoutinesRecord> {

    private static final long serialVersionUID = 577836267;

    /**
     * The reference instance of <code>information_schema.ROUTINES</code>
     */
    public static final Routines ROUTINES = new Routines();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoutinesRecord> getRecordType() {
        return RoutinesRecord.class;
    }

    /**
     * The column <code>information_schema.ROUTINES.SPECIFIC_NAME</code>.
     */
    public final TableField<RoutinesRecord, String> SPECIFIC_NAME = createField("SPECIFIC_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.ROUTINES.ROUTINE_CATALOG</code>.
     */
    public final TableField<RoutinesRecord, String> ROUTINE_CATALOG = createField("ROUTINE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.ROUTINES.ROUTINE_SCHEMA</code>.
     */
    public final TableField<RoutinesRecord, String> ROUTINE_SCHEMA = createField("ROUTINE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.ROUTINES.ROUTINE_NAME</code>.
     */
    public final TableField<RoutinesRecord, String> ROUTINE_NAME = createField("ROUTINE_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.ROUTINES.ROUTINE_TYPE</code>.
     */
    public final TableField<RoutinesRecord, String> ROUTINE_TYPE = createField("ROUTINE_TYPE", org.jooq.impl.SQLDataType.VARCHAR(9).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.ROUTINES.DATA_TYPE</code>.
     */
    public final TableField<RoutinesRecord, String> DATA_TYPE = createField("DATA_TYPE", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.ROUTINES.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    public final TableField<RoutinesRecord, Integer> CHARACTER_MAXIMUM_LENGTH = createField("CHARACTER_MAXIMUM_LENGTH", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.ROUTINES.CHARACTER_OCTET_LENGTH</code>.
     */
    public final TableField<RoutinesRecord, Integer> CHARACTER_OCTET_LENGTH = createField("CHARACTER_OCTET_LENGTH", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.ROUTINES.NUMERIC_PRECISION</code>.
     */
    public final TableField<RoutinesRecord, ULong> NUMERIC_PRECISION = createField("NUMERIC_PRECISION", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.ROUTINES.NUMERIC_SCALE</code>.
     */
    public final TableField<RoutinesRecord, Integer> NUMERIC_SCALE = createField("NUMERIC_SCALE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.ROUTINES.DATETIME_PRECISION</code>.
     */
    public final TableField<RoutinesRecord, ULong> DATETIME_PRECISION = createField("DATETIME_PRECISION", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.ROUTINES.CHARACTER_SET_NAME</code>.
     */
    public final TableField<RoutinesRecord, String> CHARACTER_SET_NAME = createField("CHARACTER_SET_NAME", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.ROUTINES.COLLATION_NAME</code>.
     */
    public final TableField<RoutinesRecord, String> COLLATION_NAME = createField("COLLATION_NAME", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.ROUTINES.DTD_IDENTIFIER</code>.
     */
    public final TableField<RoutinesRecord, String> DTD_IDENTIFIER = createField("DTD_IDENTIFIER", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>information_schema.ROUTINES.ROUTINE_BODY</code>.
     */
    public final TableField<RoutinesRecord, String> ROUTINE_BODY = createField("ROUTINE_BODY", org.jooq.impl.SQLDataType.VARCHAR(8).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.ROUTINES.ROUTINE_DEFINITION</code>.
     */
    public final TableField<RoutinesRecord, String> ROUTINE_DEFINITION = createField("ROUTINE_DEFINITION", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>information_schema.ROUTINES.EXTERNAL_NAME</code>.
     */
    public final TableField<RoutinesRecord, String> EXTERNAL_NAME = createField("EXTERNAL_NAME", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.ROUTINES.EXTERNAL_LANGUAGE</code>.
     */
    public final TableField<RoutinesRecord, String> EXTERNAL_LANGUAGE = createField("EXTERNAL_LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.ROUTINES.PARAMETER_STYLE</code>.
     */
    public final TableField<RoutinesRecord, String> PARAMETER_STYLE = createField("PARAMETER_STYLE", org.jooq.impl.SQLDataType.VARCHAR(8).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.ROUTINES.IS_DETERMINISTIC</code>.
     */
    public final TableField<RoutinesRecord, String> IS_DETERMINISTIC = createField("IS_DETERMINISTIC", org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.ROUTINES.SQL_DATA_ACCESS</code>.
     */
    public final TableField<RoutinesRecord, String> SQL_DATA_ACCESS = createField("SQL_DATA_ACCESS", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.ROUTINES.SQL_PATH</code>.
     */
    public final TableField<RoutinesRecord, String> SQL_PATH = createField("SQL_PATH", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.ROUTINES.SECURITY_TYPE</code>.
     */
    public final TableField<RoutinesRecord, String> SECURITY_TYPE = createField("SECURITY_TYPE", org.jooq.impl.SQLDataType.VARCHAR(7).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.ROUTINES.CREATED</code>.
     */
    public final TableField<RoutinesRecord, Timestamp> CREATED = createField("CREATED", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>information_schema.ROUTINES.LAST_ALTERED</code>.
     */
    public final TableField<RoutinesRecord, Timestamp> LAST_ALTERED = createField("LAST_ALTERED", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>information_schema.ROUTINES.SQL_MODE</code>.
     */
    public final TableField<RoutinesRecord, String> SQL_MODE = createField("SQL_MODE", org.jooq.impl.SQLDataType.VARCHAR(8192).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.ROUTINES.ROUTINE_COMMENT</code>.
     */
    public final TableField<RoutinesRecord, String> ROUTINE_COMMENT = createField("ROUTINE_COMMENT", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>information_schema.ROUTINES.DEFINER</code>.
     */
    public final TableField<RoutinesRecord, String> DEFINER = createField("DEFINER", org.jooq.impl.SQLDataType.VARCHAR(93).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.ROUTINES.CHARACTER_SET_CLIENT</code>.
     */
    public final TableField<RoutinesRecord, String> CHARACTER_SET_CLIENT = createField("CHARACTER_SET_CLIENT", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.ROUTINES.COLLATION_CONNECTION</code>.
     */
    public final TableField<RoutinesRecord, String> COLLATION_CONNECTION = createField("COLLATION_CONNECTION", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.ROUTINES.DATABASE_COLLATION</code>.
     */
    public final TableField<RoutinesRecord, String> DATABASE_COLLATION = createField("DATABASE_COLLATION", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>information_schema.ROUTINES</code> table reference
     */
    public Routines() {
        this(DSL.name("ROUTINES"), null);
    }

    /**
     * Create an aliased <code>information_schema.ROUTINES</code> table reference
     */
    public Routines(String alias) {
        this(DSL.name(alias), ROUTINES);
    }

    /**
     * Create an aliased <code>information_schema.ROUTINES</code> table reference
     */
    public Routines(Name alias) {
        this(alias, ROUTINES);
    }

    private Routines(Name alias, Table<RoutinesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Routines(Name alias, Table<RoutinesRecord> aliased, Field<?>[] parameters) {
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
    public Routines as(String alias) {
        return new Routines(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Routines as(Name alias) {
        return new Routines(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Routines rename(String name) {
        return new Routines(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Routines rename(Name name) {
        return new Routines(name, null);
    }
}
