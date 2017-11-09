/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.anzoo_anzoom.tables.daos;


import com.anzoo_anzoom.database.anzoo_anzoom.tables.Comments;
import com.anzoo_anzoom.database.anzoo_anzoom.tables.records.CommentsRecord;

import java.sql.Timestamp;
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
public class CommentsDao extends DAOImpl<CommentsRecord, com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.Comments, Integer> {

    /**
     * Create a new CommentsDao without any configuration
     */
    public CommentsDao() {
        super(Comments.COMMENTS, com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.Comments.class);
    }

    /**
     * Create a new CommentsDao with an attached configuration
     */
    public CommentsDao(Configuration configuration) {
        super(Comments.COMMENTS, com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.Comments.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.Comments object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.Comments> fetchById(Integer... values) {
        return fetch(Comments.COMMENTS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.Comments fetchOneById(Integer value) {
        return fetchOne(Comments.COMMENTS.ID, value);
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.Comments> fetchByUserId(Integer... values) {
        return fetch(Comments.COMMENTS.USER_ID, values);
    }

    /**
     * Fetch records that have <code>post_id IN (values)</code>
     */
    public List<com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.Comments> fetchByPostId(Integer... values) {
        return fetch(Comments.COMMENTS.POST_ID, values);
    }

    /**
     * Fetch records that have <code>content IN (values)</code>
     */
    public List<com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.Comments> fetchByContent(String... values) {
        return fetch(Comments.COMMENTS.CONTENT, values);
    }

    /**
     * Fetch records that have <code>created_at IN (values)</code>
     */
    public List<com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.Comments> fetchByCreatedAt(Timestamp... values) {
        return fetch(Comments.COMMENTS.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>updated_at IN (values)</code>
     */
    public List<com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.Comments> fetchByUpdatedAt(Timestamp... values) {
        return fetch(Comments.COMMENTS.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>deleted_at IN (values)</code>
     */
    public List<com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.Comments> fetchByDeletedAt(Timestamp... values) {
        return fetch(Comments.COMMENTS.DELETED_AT, values);
    }
}