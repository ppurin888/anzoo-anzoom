/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.anzoo_anzoom.tables.daos;


import com.anzoo_anzoom.database.anzoo_anzoom.tables.AnjuTags;
import com.anzoo_anzoom.database.anzoo_anzoom.tables.records.AnjuTagsRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class AnjuTagsDao extends DAOImpl<AnjuTagsRecord, com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.AnjuTags, Integer> {

    /**
     * Create a new AnjuTagsDao without any configuration
     */
    public AnjuTagsDao() {
        super(AnjuTags.ANJU_TAGS, com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.AnjuTags.class);
    }

    /**
     * Create a new AnjuTagsDao with an attached configuration
     */
    public AnjuTagsDao(Configuration configuration) {
        super(AnjuTags.ANJU_TAGS, com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.AnjuTags.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.AnjuTags object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.AnjuTags> fetchById(Integer... values) {
        return fetch(AnjuTags.ANJU_TAGS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.AnjuTags fetchOneById(Integer value) {
        return fetchOne(AnjuTags.ANJU_TAGS.ID, value);
    }

    /**
     * Fetch records that have <code>tag IN (values)</code>
     */
    public List<com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.AnjuTags> fetchByTag(String... values) {
        return fetch(AnjuTags.ANJU_TAGS.TAG, values);
    }

    /**
     * Fetch a unique record that has <code>tag = value</code>
     */
    public com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.AnjuTags fetchOneByTag(String value) {
        return fetchOne(AnjuTags.ANJU_TAGS.TAG, value);
    }

    /**
     * Fetch records that have <code>tag_count IN (values)</code>
     */
    public List<com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.AnjuTags> fetchByTagCount(Integer... values) {
        return fetch(AnjuTags.ANJU_TAGS.TAG_COUNT, values);
    }
}