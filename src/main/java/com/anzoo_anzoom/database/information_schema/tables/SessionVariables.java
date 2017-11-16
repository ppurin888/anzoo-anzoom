/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.information_schema.tables;


import com.anzoo_anzoom.database.information_schema.InformationSchema;
import com.anzoo_anzoom.database.information_schema.tables.records.SessionVariablesRecord;

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
public class SessionVariables extends TableImpl<SessionVariablesRecord> {

    private static final long serialVersionUID = -66053727;

    /**
     * The reference instance of <code>information_schema.SESSION_VARIABLES</code>
     */
    public static final SessionVariables SESSION_VARIABLES = new SessionVariables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SessionVariablesRecord> getRecordType() {
        return SessionVariablesRecord.class;
    }

    /**
     * The column <code>information_schema.SESSION_VARIABLES.VARIABLE_NAME</code>.
     */
    public final TableField<SessionVariablesRecord, String> VARIABLE_NAME = createField("VARIABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.SESSION_VARIABLES.VARIABLE_VALUE</code>.
     */
    public final TableField<SessionVariablesRecord, String> VARIABLE_VALUE = createField("VARIABLE_VALUE", org.jooq.impl.SQLDataType.VARCHAR(1024), this, "");

    /**
     * Create a <code>information_schema.SESSION_VARIABLES</code> table reference
     */
    public SessionVariables() {
        this(DSL.name("SESSION_VARIABLES"), null);
    }

    /**
     * Create an aliased <code>information_schema.SESSION_VARIABLES</code> table reference
     */
    public SessionVariables(String alias) {
        this(DSL.name(alias), SESSION_VARIABLES);
    }

    /**
     * Create an aliased <code>information_schema.SESSION_VARIABLES</code> table reference
     */
    public SessionVariables(Name alias) {
        this(alias, SESSION_VARIABLES);
    }

    private SessionVariables(Name alias, Table<SessionVariablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private SessionVariables(Name alias, Table<SessionVariablesRecord> aliased, Field<?>[] parameters) {
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
    public SessionVariables as(String alias) {
        return new SessionVariables(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SessionVariables as(Name alias) {
        return new SessionVariables(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SessionVariables rename(String name) {
        return new SessionVariables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SessionVariables rename(Name name) {
        return new SessionVariables(name, null);
    }
}
