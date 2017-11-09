/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.information_schema.tables;


import com.anzoo_anzoom.database.information_schema.InformationSchema;
import com.anzoo_anzoom.database.information_schema.tables.records.SpatialRefSysRecord;

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
public class SpatialRefSys extends TableImpl<SpatialRefSysRecord> {

    private static final long serialVersionUID = -1578258919;

    /**
     * The reference instance of <code>information_schema.SPATIAL_REF_SYS</code>
     */
    public static final SpatialRefSys SPATIAL_REF_SYS = new SpatialRefSys();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SpatialRefSysRecord> getRecordType() {
        return SpatialRefSysRecord.class;
    }

    /**
     * The column <code>information_schema.SPATIAL_REF_SYS.SRID</code>.
     */
    public final TableField<SpatialRefSysRecord, Short> SRID = createField("SRID", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>information_schema.SPATIAL_REF_SYS.AUTH_NAME</code>.
     */
    public final TableField<SpatialRefSysRecord, String> AUTH_NAME = createField("AUTH_NAME", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.SPATIAL_REF_SYS.AUTH_SRID</code>.
     */
    public final TableField<SpatialRefSysRecord, Integer> AUTH_SRID = createField("AUTH_SRID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.SPATIAL_REF_SYS.SRTEXT</code>.
     */
    public final TableField<SpatialRefSysRecord, String> SRTEXT = createField("SRTEXT", org.jooq.impl.SQLDataType.VARCHAR(2048).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>information_schema.SPATIAL_REF_SYS</code> table reference
     */
    public SpatialRefSys() {
        this(DSL.name("SPATIAL_REF_SYS"), null);
    }

    /**
     * Create an aliased <code>information_schema.SPATIAL_REF_SYS</code> table reference
     */
    public SpatialRefSys(String alias) {
        this(DSL.name(alias), SPATIAL_REF_SYS);
    }

    /**
     * Create an aliased <code>information_schema.SPATIAL_REF_SYS</code> table reference
     */
    public SpatialRefSys(Name alias) {
        this(alias, SPATIAL_REF_SYS);
    }

    private SpatialRefSys(Name alias, Table<SpatialRefSysRecord> aliased) {
        this(alias, aliased, null);
    }

    private SpatialRefSys(Name alias, Table<SpatialRefSysRecord> aliased, Field<?>[] parameters) {
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
    public SpatialRefSys as(String alias) {
        return new SpatialRefSys(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpatialRefSys as(Name alias) {
        return new SpatialRefSys(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SpatialRefSys rename(String name) {
        return new SpatialRefSys(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SpatialRefSys rename(Name name) {
        return new SpatialRefSys(name, null);
    }
}