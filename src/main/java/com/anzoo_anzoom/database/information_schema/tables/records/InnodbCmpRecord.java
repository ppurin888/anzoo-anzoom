/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.information_schema.tables.records;


import com.anzoo_anzoom.database.information_schema.tables.InnodbCmp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


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
public class InnodbCmpRecord extends TableRecordImpl<InnodbCmpRecord> implements Record6<Integer, Integer, Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = -381556589;

    /**
     * Setter for <code>information_schema.INNODB_CMP.page_size</code>.
     */
    public void setPageSize(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_CMP.page_size</code>.
     */
    public Integer getPageSize() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>information_schema.INNODB_CMP.compress_ops</code>.
     */
    public void setCompressOps(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_CMP.compress_ops</code>.
     */
    public Integer getCompressOps() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>information_schema.INNODB_CMP.compress_ops_ok</code>.
     */
    public void setCompressOpsOk(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_CMP.compress_ops_ok</code>.
     */
    public Integer getCompressOpsOk() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>information_schema.INNODB_CMP.compress_time</code>.
     */
    public void setCompressTime(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_CMP.compress_time</code>.
     */
    public Integer getCompressTime() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>information_schema.INNODB_CMP.uncompress_ops</code>.
     */
    public void setUncompressOps(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_CMP.uncompress_ops</code>.
     */
    public Integer getUncompressOps() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>information_schema.INNODB_CMP.uncompress_time</code>.
     */
    public void setUncompressTime(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_CMP.uncompress_time</code>.
     */
    public Integer getUncompressTime() {
        return (Integer) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Integer, Integer, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return InnodbCmp.INNODB_CMP.PAGE_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return InnodbCmp.INNODB_CMP.COMPRESS_OPS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return InnodbCmp.INNODB_CMP.COMPRESS_OPS_OK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return InnodbCmp.INNODB_CMP.COMPRESS_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return InnodbCmp.INNODB_CMP.UNCOMPRESS_OPS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return InnodbCmp.INNODB_CMP.UNCOMPRESS_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getPageSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getCompressOps();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getCompressOpsOk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getCompressTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getUncompressOps();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getUncompressTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPageSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCompressOps();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getCompressOpsOk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getCompressTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getUncompressOps();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getUncompressTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbCmpRecord value1(Integer value) {
        setPageSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbCmpRecord value2(Integer value) {
        setCompressOps(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbCmpRecord value3(Integer value) {
        setCompressOpsOk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbCmpRecord value4(Integer value) {
        setCompressTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbCmpRecord value5(Integer value) {
        setUncompressOps(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbCmpRecord value6(Integer value) {
        setUncompressTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbCmpRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Integer value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbCmpRecord
     */
    public InnodbCmpRecord() {
        super(InnodbCmp.INNODB_CMP);
    }

    /**
     * Create a detached, initialised InnodbCmpRecord
     */
    public InnodbCmpRecord(Integer pageSize, Integer compressOps, Integer compressOpsOk, Integer compressTime, Integer uncompressOps, Integer uncompressTime) {
        super(InnodbCmp.INNODB_CMP);

        set(0, pageSize);
        set(1, compressOps);
        set(2, compressOpsOk);
        set(3, compressTime);
        set(4, uncompressOps);
        set(5, uncompressTime);
    }
}
