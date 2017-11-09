/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.information_schema.tables;


import com.anzoo_anzoom.database.information_schema.InformationSchema;
import com.anzoo_anzoom.database.information_schema.tables.records.GlobalVariablesRecord;

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
public class GlobalVariables extends TableImpl<GlobalVariablesRecord> {

    private static final long serialVersionUID = 1222774046;

    /**
     * The reference instance of <code>information_schema.GLOBAL_VARIABLES</code>
     */
    public static final GlobalVariables GLOBAL_VARIABLES = new GlobalVariables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GlobalVariablesRecord> getRecordType() {
        return GlobalVariablesRecord.class;
    }

    /**
     * The column <code>information_schema.GLOBAL_VARIABLES.VARIABLE_NAME</code>.
     */
    public final TableField<GlobalVariablesRecord, String> VARIABLE_NAME = createField("VARIABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.GLOBAL_VARIABLES.VARIABLE_VALUE</code>.
     */
    public final TableField<GlobalVariablesRecord, String> VARIABLE_VALUE = createField("VARIABLE_VALUE", org.jooq.impl.SQLDataType.VARCHAR(2048).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>information_schema.GLOBAL_VARIABLES</code> table reference
     */
    public GlobalVariables() {
        this(DSL.name("GLOBAL_VARIABLES"), null);
    }

    /**
     * Create an aliased <code>information_schema.GLOBAL_VARIABLES</code> table reference
     */
    public GlobalVariables(String alias) {
        this(DSL.name(alias), GLOBAL_VARIABLES);
    }

    /**
     * Create an aliased <code>information_schema.GLOBAL_VARIABLES</code> table reference
     */
    public GlobalVariables(Name alias) {
        this(alias, GLOBAL_VARIABLES);
    }

    private GlobalVariables(Name alias, Table<GlobalVariablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private GlobalVariables(Name alias, Table<GlobalVariablesRecord> aliased, Field<?>[] parameters) {
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
    public GlobalVariables as(String alias) {
        return new GlobalVariables(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GlobalVariables as(Name alias) {
        return new GlobalVariables(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GlobalVariables rename(String name) {
        return new GlobalVariables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GlobalVariables rename(Name name) {
        return new GlobalVariables(name, null);
    }
}
