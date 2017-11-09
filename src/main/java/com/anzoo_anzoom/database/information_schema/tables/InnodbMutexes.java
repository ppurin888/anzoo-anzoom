/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.information_schema.tables;


import com.anzoo_anzoom.database.information_schema.InformationSchema;
import com.anzoo_anzoom.database.information_schema.tables.records.InnodbMutexesRecord;

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
public class InnodbMutexes extends TableImpl<InnodbMutexesRecord> {

    private static final long serialVersionUID = -522807812;

    /**
     * The reference instance of <code>information_schema.INNODB_MUTEXES</code>
     */
    public static final InnodbMutexes INNODB_MUTEXES = new InnodbMutexes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbMutexesRecord> getRecordType() {
        return InnodbMutexesRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_MUTEXES.NAME</code>.
     */
    public final TableField<InnodbMutexesRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(4000).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_MUTEXES.CREATE_FILE</code>.
     */
    public final TableField<InnodbMutexesRecord, String> CREATE_FILE = createField("CREATE_FILE", org.jooq.impl.SQLDataType.VARCHAR(4000).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_MUTEXES.CREATE_LINE</code>.
     */
    public final TableField<InnodbMutexesRecord, UInteger> CREATE_LINE = createField("CREATE_LINE", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_MUTEXES.OS_WAITS</code>.
     */
    public final TableField<InnodbMutexesRecord, ULong> OS_WAITS = createField("OS_WAITS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>information_schema.INNODB_MUTEXES</code> table reference
     */
    public InnodbMutexes() {
        this(DSL.name("INNODB_MUTEXES"), null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_MUTEXES</code> table reference
     */
    public InnodbMutexes(String alias) {
        this(DSL.name(alias), INNODB_MUTEXES);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_MUTEXES</code> table reference
     */
    public InnodbMutexes(Name alias) {
        this(alias, INNODB_MUTEXES);
    }

    private InnodbMutexes(Name alias, Table<InnodbMutexesRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbMutexes(Name alias, Table<InnodbMutexesRecord> aliased, Field<?>[] parameters) {
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
    public InnodbMutexes as(String alias) {
        return new InnodbMutexes(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbMutexes as(Name alias) {
        return new InnodbMutexes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbMutexes rename(String name) {
        return new InnodbMutexes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbMutexes rename(Name name) {
        return new InnodbMutexes(name, null);
    }
}
