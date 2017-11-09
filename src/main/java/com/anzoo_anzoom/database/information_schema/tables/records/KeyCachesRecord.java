/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.information_schema.tables.records;


import com.anzoo_anzoom.database.information_schema.tables.KeyCaches;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;
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
public class KeyCachesRecord extends TableRecordImpl<KeyCachesRecord> implements Record12<String, UInteger, UInteger, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> {

    private static final long serialVersionUID = 1173170481;

    /**
     * Setter for <code>information_schema.KEY_CACHES.KEY_CACHE_NAME</code>.
     */
    public void setKeyCacheName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.KEY_CACHES.KEY_CACHE_NAME</code>.
     */
    public String getKeyCacheName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.KEY_CACHES.SEGMENTS</code>.
     */
    public void setSegments(UInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.KEY_CACHES.SEGMENTS</code>.
     */
    public UInteger getSegments() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>information_schema.KEY_CACHES.SEGMENT_NUMBER</code>.
     */
    public void setSegmentNumber(UInteger value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.KEY_CACHES.SEGMENT_NUMBER</code>.
     */
    public UInteger getSegmentNumber() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>information_schema.KEY_CACHES.FULL_SIZE</code>.
     */
    public void setFullSize(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.KEY_CACHES.FULL_SIZE</code>.
     */
    public ULong getFullSize() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>information_schema.KEY_CACHES.BLOCK_SIZE</code>.
     */
    public void setBlockSize(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.KEY_CACHES.BLOCK_SIZE</code>.
     */
    public ULong getBlockSize() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>information_schema.KEY_CACHES.USED_BLOCKS</code>.
     */
    public void setUsedBlocks(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.KEY_CACHES.USED_BLOCKS</code>.
     */
    public ULong getUsedBlocks() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>information_schema.KEY_CACHES.UNUSED_BLOCKS</code>.
     */
    public void setUnusedBlocks(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.KEY_CACHES.UNUSED_BLOCKS</code>.
     */
    public ULong getUnusedBlocks() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>information_schema.KEY_CACHES.DIRTY_BLOCKS</code>.
     */
    public void setDirtyBlocks(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.KEY_CACHES.DIRTY_BLOCKS</code>.
     */
    public ULong getDirtyBlocks() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>information_schema.KEY_CACHES.READ_REQUESTS</code>.
     */
    public void setReadRequests(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.KEY_CACHES.READ_REQUESTS</code>.
     */
    public ULong getReadRequests() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>information_schema.KEY_CACHES.READS</code>.
     */
    public void setReads(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.KEY_CACHES.READS</code>.
     */
    public ULong getReads() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>information_schema.KEY_CACHES.WRITE_REQUESTS</code>.
     */
    public void setWriteRequests(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>information_schema.KEY_CACHES.WRITE_REQUESTS</code>.
     */
    public ULong getWriteRequests() {
        return (ULong) get(10);
    }

    /**
     * Setter for <code>information_schema.KEY_CACHES.WRITES</code>.
     */
    public void setWrites(ULong value) {
        set(11, value);
    }

    /**
     * Getter for <code>information_schema.KEY_CACHES.WRITES</code>.
     */
    public ULong getWrites() {
        return (ULong) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<String, UInteger, UInteger, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<String, UInteger, UInteger, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return KeyCaches.KEY_CACHES.KEY_CACHE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field2() {
        return KeyCaches.KEY_CACHES.SEGMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field3() {
        return KeyCaches.KEY_CACHES.SEGMENT_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return KeyCaches.KEY_CACHES.FULL_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return KeyCaches.KEY_CACHES.BLOCK_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field6() {
        return KeyCaches.KEY_CACHES.USED_BLOCKS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field7() {
        return KeyCaches.KEY_CACHES.UNUSED_BLOCKS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field8() {
        return KeyCaches.KEY_CACHES.DIRTY_BLOCKS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field9() {
        return KeyCaches.KEY_CACHES.READ_REQUESTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field10() {
        return KeyCaches.KEY_CACHES.READS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field11() {
        return KeyCaches.KEY_CACHES.WRITE_REQUESTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field12() {
        return KeyCaches.KEY_CACHES.WRITES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getKeyCacheName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component2() {
        return getSegments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component3() {
        return getSegmentNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component4() {
        return getFullSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component5() {
        return getBlockSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component6() {
        return getUsedBlocks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component7() {
        return getUnusedBlocks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component8() {
        return getDirtyBlocks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component9() {
        return getReadRequests();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component10() {
        return getReads();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component11() {
        return getWriteRequests();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component12() {
        return getWrites();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getKeyCacheName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value2() {
        return getSegments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value3() {
        return getSegmentNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value4() {
        return getFullSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value5() {
        return getBlockSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value6() {
        return getUsedBlocks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value7() {
        return getUnusedBlocks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value8() {
        return getDirtyBlocks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value9() {
        return getReadRequests();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value10() {
        return getReads();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value11() {
        return getWriteRequests();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value12() {
        return getWrites();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyCachesRecord value1(String value) {
        setKeyCacheName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyCachesRecord value2(UInteger value) {
        setSegments(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyCachesRecord value3(UInteger value) {
        setSegmentNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyCachesRecord value4(ULong value) {
        setFullSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyCachesRecord value5(ULong value) {
        setBlockSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyCachesRecord value6(ULong value) {
        setUsedBlocks(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyCachesRecord value7(ULong value) {
        setUnusedBlocks(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyCachesRecord value8(ULong value) {
        setDirtyBlocks(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyCachesRecord value9(ULong value) {
        setReadRequests(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyCachesRecord value10(ULong value) {
        setReads(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyCachesRecord value11(ULong value) {
        setWriteRequests(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyCachesRecord value12(ULong value) {
        setWrites(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyCachesRecord values(String value1, UInteger value2, UInteger value3, ULong value4, ULong value5, ULong value6, ULong value7, ULong value8, ULong value9, ULong value10, ULong value11, ULong value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached KeyCachesRecord
     */
    public KeyCachesRecord() {
        super(KeyCaches.KEY_CACHES);
    }

    /**
     * Create a detached, initialised KeyCachesRecord
     */
    public KeyCachesRecord(String keyCacheName, UInteger segments, UInteger segmentNumber, ULong fullSize, ULong blockSize, ULong usedBlocks, ULong unusedBlocks, ULong dirtyBlocks, ULong readRequests, ULong reads, ULong writeRequests, ULong writes) {
        super(KeyCaches.KEY_CACHES);

        set(0, keyCacheName);
        set(1, segments);
        set(2, segmentNumber);
        set(3, fullSize);
        set(4, blockSize);
        set(5, usedBlocks);
        set(6, unusedBlocks);
        set(7, dirtyBlocks);
        set(8, readRequests);
        set(9, reads);
        set(10, writeRequests);
        set(11, writes);
    }
}
