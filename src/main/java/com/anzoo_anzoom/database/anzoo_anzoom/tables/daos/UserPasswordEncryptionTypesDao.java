/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.anzoo_anzoom.tables.daos;


import com.anzoo_anzoom.database.anzoo_anzoom.tables.UserPasswordEncryptionTypes;
import com.anzoo_anzoom.database.anzoo_anzoom.tables.records.UserPasswordEncryptionTypesRecord;

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
public class UserPasswordEncryptionTypesDao extends DAOImpl<UserPasswordEncryptionTypesRecord, com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.UserPasswordEncryptionTypes, Integer> {

    /**
     * Create a new UserPasswordEncryptionTypesDao without any configuration
     */
    public UserPasswordEncryptionTypesDao() {
        super(UserPasswordEncryptionTypes.USER_PASSWORD_ENCRYPTION_TYPES, com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.UserPasswordEncryptionTypes.class);
    }

    /**
     * Create a new UserPasswordEncryptionTypesDao with an attached configuration
     */
    public UserPasswordEncryptionTypesDao(Configuration configuration) {
        super(UserPasswordEncryptionTypes.USER_PASSWORD_ENCRYPTION_TYPES, com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.UserPasswordEncryptionTypes.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.UserPasswordEncryptionTypes object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.UserPasswordEncryptionTypes> fetchById(Integer... values) {
        return fetch(UserPasswordEncryptionTypes.USER_PASSWORD_ENCRYPTION_TYPES.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.UserPasswordEncryptionTypes fetchOneById(Integer value) {
        return fetchOne(UserPasswordEncryptionTypes.USER_PASSWORD_ENCRYPTION_TYPES.ID, value);
    }

    /**
     * Fetch records that have <code>type_name IN (values)</code>
     */
    public List<com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.UserPasswordEncryptionTypes> fetchByTypeName(String... values) {
        return fetch(UserPasswordEncryptionTypes.USER_PASSWORD_ENCRYPTION_TYPES.TYPE_NAME, values);
    }

    /**
     * Fetch records that have <code>secret_key IN (values)</code>
     */
    public List<com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.UserPasswordEncryptionTypes> fetchBySecretKey(byte[]... values) {
        return fetch(UserPasswordEncryptionTypes.USER_PASSWORD_ENCRYPTION_TYPES.SECRET_KEY, values);
    }

    /**
     * Fetch records that have <code>title IN (values)</code>
     */
    public List<com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.UserPasswordEncryptionTypes> fetchByTitle(String... values) {
        return fetch(UserPasswordEncryptionTypes.USER_PASSWORD_ENCRYPTION_TYPES.TITLE, values);
    }

    /**
     * Fetch records that have <code>created_at IN (values)</code>
     */
    public List<com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.UserPasswordEncryptionTypes> fetchByCreatedAt(Timestamp... values) {
        return fetch(UserPasswordEncryptionTypes.USER_PASSWORD_ENCRYPTION_TYPES.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>deleted_at IN (values)</code>
     */
    public List<com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos.UserPasswordEncryptionTypes> fetchByDeletedAt(Timestamp... values) {
        return fetch(UserPasswordEncryptionTypes.USER_PASSWORD_ENCRYPTION_TYPES.DELETED_AT, values);
    }
}
