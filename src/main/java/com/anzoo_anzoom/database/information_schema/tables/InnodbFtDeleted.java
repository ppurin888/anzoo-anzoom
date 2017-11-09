/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.information_schema.tables;


import com.anzoo_anzoom.database.information_schema.InformationSchema;
import com.anzoo_anzoom.database.information_schema.tables.records.InnodbFtDeletedRecord;

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
public class InnodbFtDeleted extends TableImpl<InnodbFtDeletedRecord> {

    private static final long serialVersionUID = -489478449;

    /**
     * The reference instance of <code>information_schema.INNODB_FT_DELETED</code>
     */
    public static final InnodbFtDeleted INNODB_FT_DELETED = new InnodbFtDeleted();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbFtDeletedRecord> getRecordType() {
        return InnodbFtDeletedRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_FT_DELETED.DOC_ID</code>.
     */
    public final TableField<InnodbFtDeletedRecord, ULong> DOC_ID = createField("DOC_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>information_schema.INNODB_FT_DELETED</code> table reference
     */
    public InnodbFtDeleted() {
        this(DSL.name("INNODB_FT_DELETED"), null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_FT_DELETED</code> table reference
     */
    public InnodbFtDeleted(String alias) {
        this(DSL.name(alias), INNODB_FT_DELETED);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_FT_DELETED</code> table reference
     */
    public InnodbFtDeleted(Name alias) {
        this(alias, INNODB_FT_DELETED);
    }

    private InnodbFtDeleted(Name alias, Table<InnodbFtDeletedRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbFtDeleted(Name alias, Table<InnodbFtDeletedRecord> aliased, Field<?>[] parameters) {
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
    public InnodbFtDeleted as(String alias) {
        return new InnodbFtDeleted(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbFtDeleted as(Name alias) {
        return new InnodbFtDeleted(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbFtDeleted rename(String name) {
        return new InnodbFtDeleted(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbFtDeleted rename(Name name) {
        return new InnodbFtDeleted(name, null);
    }
}