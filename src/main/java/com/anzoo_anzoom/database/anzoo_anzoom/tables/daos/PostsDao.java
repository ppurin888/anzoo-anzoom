/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.anzoo_anzoom.tables.daos;


import com.anzoo_anzoom.database.anzoo_anzoom.tables.Posts;
import com.anzoo_anzoom.database.anzoo_anzoom.tables.records.PostsRecord;

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
public class PostsDao extends DAOImpl<PostsRecord, com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.Posts, Integer> {

    /**
     * Create a new PostsDao without any configuration
     */
    public PostsDao() {
        super(Posts.POSTS, com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.Posts.class);
    }

    /**
     * Create a new PostsDao with an attached configuration
     */
    public PostsDao(Configuration configuration) {
        super(Posts.POSTS, com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.Posts.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.Posts object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.Posts> fetchById(Integer... values) {
        return fetch(Posts.POSTS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.Posts fetchOneById(Integer value) {
        return fetchOne(Posts.POSTS.ID, value);
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.Posts> fetchByUserId(Integer... values) {
        return fetch(Posts.POSTS.USER_ID, values);
    }

    /**
     * Fetch records that have <code>photo_url IN (values)</code>
     */
    public List<com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.Posts> fetchByPhotoUrl(String... values) {
        return fetch(Posts.POSTS.PHOTO_URL, values);
    }

    /**
     * Fetch records that have <code>content IN (values)</code>
     */
    public List<com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.Posts> fetchByContent(String... values) {
        return fetch(Posts.POSTS.CONTENT, values);
    }

    /**
     * Fetch records that have <code>beer_score IN (values)</code>
     */
    public List<com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.Posts> fetchByBeerScore(Integer... values) {
        return fetch(Posts.POSTS.BEER_SCORE, values);
    }

    /**
     * Fetch records that have <code>soju_score IN (values)</code>
     */
    public List<com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.Posts> fetchBySojuScore(Integer... values) {
        return fetch(Posts.POSTS.SOJU_SCORE, values);
    }

    /**
     * Fetch records that have <code>traditional_alcoholic_drinks_score IN (values)</code>
     */
    public List<com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.Posts> fetchByTraditionalAlcoholicDrinksScore(Integer... values) {
        return fetch(Posts.POSTS.TRADITIONAL_ALCOHOLIC_DRINKS_SCORE, values);
    }

    /**
     * Fetch records that have <code>created_at IN (values)</code>
     */
    public List<com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.Posts> fetchByCreatedAt(Timestamp... values) {
        return fetch(Posts.POSTS.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>updated_at IN (values)</code>
     */
    public List<com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.Posts> fetchByUpdatedAt(Timestamp... values) {
        return fetch(Posts.POSTS.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>deleted_at IN (values)</code>
     */
    public List<com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.Posts> fetchByDeletedAt(Timestamp... values) {
        return fetch(Posts.POSTS.DELETED_AT, values);
    }
}
