/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.information_schema.tables;


import com.anzoo_anzoom.database.information_schema.InformationSchema;
import com.anzoo_anzoom.database.information_schema.tables.records.InnodbSysTablestatsRecord;

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
public class InnodbSysTablestats extends TableImpl<InnodbSysTablestatsRecord> {

    private static final long serialVersionUID = 689110454;

    /**
     * The reference instance of <code>information_schema.INNODB_SYS_TABLESTATS</code>
     */
    public static final InnodbSysTablestats INNODB_SYS_TABLESTATS = new InnodbSysTablestats();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbSysTablestatsRecord> getRecordType() {
        return InnodbSysTablestatsRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_SYS_TABLESTATS.TABLE_ID</code>.
     */
    public final TableField<InnodbSysTablestatsRecord, ULong> TABLE_ID = createField("TABLE_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_TABLESTATS.NAME</code>.
     */
    public final TableField<InnodbSysTablestatsRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(193).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_TABLESTATS.STATS_INITIALIZED</code>.
     */
    public final TableField<InnodbSysTablestatsRecord, String> STATS_INITIALIZED = createField("STATS_INITIALIZED", org.jooq.impl.SQLDataType.VARCHAR(193).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_TABLESTATS.NUM_ROWS</code>.
     */
    public final TableField<InnodbSysTablestatsRecord, ULong> NUM_ROWS = createField("NUM_ROWS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_TABLESTATS.CLUST_INDEX_SIZE</code>.
     */
    public final TableField<InnodbSysTablestatsRecord, ULong> CLUST_INDEX_SIZE = createField("CLUST_INDEX_SIZE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_TABLESTATS.OTHER_INDEX_SIZE</code>.
     */
    public final TableField<InnodbSysTablestatsRecord, ULong> OTHER_INDEX_SIZE = createField("OTHER_INDEX_SIZE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_TABLESTATS.MODIFIED_COUNTER</code>.
     */
    public final TableField<InnodbSysTablestatsRecord, ULong> MODIFIED_COUNTER = createField("MODIFIED_COUNTER", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_TABLESTATS.AUTOINC</code>.
     */
    public final TableField<InnodbSysTablestatsRecord, ULong> AUTOINC = createField("AUTOINC", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_TABLESTATS.REF_COUNT</code>.
     */
    public final TableField<InnodbSysTablestatsRecord, Integer> REF_COUNT = createField("REF_COUNT", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>information_schema.INNODB_SYS_TABLESTATS</code> table reference
     */
    public InnodbSysTablestats() {
        this(DSL.name("INNODB_SYS_TABLESTATS"), null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_TABLESTATS</code> table reference
     */
    public InnodbSysTablestats(String alias) {
        this(DSL.name(alias), INNODB_SYS_TABLESTATS);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_TABLESTATS</code> table reference
     */
    public InnodbSysTablestats(Name alias) {
        this(alias, INNODB_SYS_TABLESTATS);
    }

    private InnodbSysTablestats(Name alias, Table<InnodbSysTablestatsRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbSysTablestats(Name alias, Table<InnodbSysTablestatsRecord> aliased, Field<?>[] parameters) {
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
    public InnodbSysTablestats as(String alias) {
        return new InnodbSysTablestats(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysTablestats as(Name alias) {
        return new InnodbSysTablestats(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysTablestats rename(String name) {
        return new InnodbSysTablestats(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysTablestats rename(Name name) {
        return new InnodbSysTablestats(name, null);
    }
}
