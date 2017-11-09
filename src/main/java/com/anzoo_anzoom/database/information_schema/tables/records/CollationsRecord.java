/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.information_schema.tables.records;


import com.anzoo_anzoom.database.information_schema.tables.Collations;

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
public class CollationsRecord extends TableRecordImpl<CollationsRecord> implements Record6<String, String, Long, String, String, Long> {

    private static final long serialVersionUID = 1097656819;

    /**
     * Setter for <code>information_schema.COLLATIONS.COLLATION_NAME</code>.
     */
    public void setCollationName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.COLLATIONS.COLLATION_NAME</code>.
     */
    public String getCollationName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.COLLATIONS.CHARACTER_SET_NAME</code>.
     */
    public void setCharacterSetName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.COLLATIONS.CHARACTER_SET_NAME</code>.
     */
    public String getCharacterSetName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.COLLATIONS.ID</code>.
     */
    public void setId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.COLLATIONS.ID</code>.
     */
    public Long getId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>information_schema.COLLATIONS.IS_DEFAULT</code>.
     */
    public void setIsDefault(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.COLLATIONS.IS_DEFAULT</code>.
     */
    public String getIsDefault() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.COLLATIONS.IS_COMPILED</code>.
     */
    public void setIsCompiled(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.COLLATIONS.IS_COMPILED</code>.
     */
    public String getIsCompiled() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.COLLATIONS.SORTLEN</code>.
     */
    public void setSortlen(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.COLLATIONS.SORTLEN</code>.
     */
    public Long getSortlen() {
        return (Long) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, Long, String, String, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, Long, String, String, Long> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Collations.COLLATIONS.COLLATION_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Collations.COLLATIONS.CHARACTER_SET_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Collations.COLLATIONS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Collations.COLLATIONS.IS_DEFAULT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Collations.COLLATIONS.IS_COMPILED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return Collations.COLLATIONS.SORTLEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getCollationName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getCharacterSetName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getIsDefault();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getIsCompiled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getSortlen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getCollationName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCharacterSetName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getIsDefault();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getIsCompiled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getSortlen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollationsRecord value1(String value) {
        setCollationName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollationsRecord value2(String value) {
        setCharacterSetName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollationsRecord value3(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollationsRecord value4(String value) {
        setIsDefault(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollationsRecord value5(String value) {
        setIsCompiled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollationsRecord value6(Long value) {
        setSortlen(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollationsRecord values(String value1, String value2, Long value3, String value4, String value5, Long value6) {
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
     * Create a detached CollationsRecord
     */
    public CollationsRecord() {
        super(Collations.COLLATIONS);
    }

    /**
     * Create a detached, initialised CollationsRecord
     */
    public CollationsRecord(String collationName, String characterSetName, Long id, String isDefault, String isCompiled, Long sortlen) {
        super(Collations.COLLATIONS);

        set(0, collationName);
        set(1, characterSetName);
        set(2, id);
        set(3, isDefault);
        set(4, isCompiled);
        set(5, sortlen);
    }
}