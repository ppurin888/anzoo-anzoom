/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.information_schema.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;

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
public class InnodbTablespacesEncryption implements Serializable {

    private static final long serialVersionUID = -505699501;

    private UInteger space;
    private String   name;
    private UInteger encryptionScheme;
    private UInteger keyserverRequests;
    private UInteger minKeyVersion;
    private UInteger currentKeyVersion;
    private ULong    keyRotationPageNumber;
    private ULong    keyRotationMaxPageNumber;
    private UInteger currentKeyId;
    private UInteger rotatingOrFlushing;

    public InnodbTablespacesEncryption() {}

    public InnodbTablespacesEncryption(InnodbTablespacesEncryption value) {
        this.space = value.space;
        this.name = value.name;
        this.encryptionScheme = value.encryptionScheme;
        this.keyserverRequests = value.keyserverRequests;
        this.minKeyVersion = value.minKeyVersion;
        this.currentKeyVersion = value.currentKeyVersion;
        this.keyRotationPageNumber = value.keyRotationPageNumber;
        this.keyRotationMaxPageNumber = value.keyRotationMaxPageNumber;
        this.currentKeyId = value.currentKeyId;
        this.rotatingOrFlushing = value.rotatingOrFlushing;
    }

    public InnodbTablespacesEncryption(
        UInteger space,
        String   name,
        UInteger encryptionScheme,
        UInteger keyserverRequests,
        UInteger minKeyVersion,
        UInteger currentKeyVersion,
        ULong    keyRotationPageNumber,
        ULong    keyRotationMaxPageNumber,
        UInteger currentKeyId,
        UInteger rotatingOrFlushing
    ) {
        this.space = space;
        this.name = name;
        this.encryptionScheme = encryptionScheme;
        this.keyserverRequests = keyserverRequests;
        this.minKeyVersion = minKeyVersion;
        this.currentKeyVersion = currentKeyVersion;
        this.keyRotationPageNumber = keyRotationPageNumber;
        this.keyRotationMaxPageNumber = keyRotationMaxPageNumber;
        this.currentKeyId = currentKeyId;
        this.rotatingOrFlushing = rotatingOrFlushing;
    }

    public UInteger getSpace() {
        return this.space;
    }

    public void setSpace(UInteger space) {
        this.space = space;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UInteger getEncryptionScheme() {
        return this.encryptionScheme;
    }

    public void setEncryptionScheme(UInteger encryptionScheme) {
        this.encryptionScheme = encryptionScheme;
    }

    public UInteger getKeyserverRequests() {
        return this.keyserverRequests;
    }

    public void setKeyserverRequests(UInteger keyserverRequests) {
        this.keyserverRequests = keyserverRequests;
    }

    public UInteger getMinKeyVersion() {
        return this.minKeyVersion;
    }

    public void setMinKeyVersion(UInteger minKeyVersion) {
        this.minKeyVersion = minKeyVersion;
    }

    public UInteger getCurrentKeyVersion() {
        return this.currentKeyVersion;
    }

    public void setCurrentKeyVersion(UInteger currentKeyVersion) {
        this.currentKeyVersion = currentKeyVersion;
    }

    public ULong getKeyRotationPageNumber() {
        return this.keyRotationPageNumber;
    }

    public void setKeyRotationPageNumber(ULong keyRotationPageNumber) {
        this.keyRotationPageNumber = keyRotationPageNumber;
    }

    public ULong getKeyRotationMaxPageNumber() {
        return this.keyRotationMaxPageNumber;
    }

    public void setKeyRotationMaxPageNumber(ULong keyRotationMaxPageNumber) {
        this.keyRotationMaxPageNumber = keyRotationMaxPageNumber;
    }

    public UInteger getCurrentKeyId() {
        return this.currentKeyId;
    }

    public void setCurrentKeyId(UInteger currentKeyId) {
        this.currentKeyId = currentKeyId;
    }

    public UInteger getRotatingOrFlushing() {
        return this.rotatingOrFlushing;
    }

    public void setRotatingOrFlushing(UInteger rotatingOrFlushing) {
        this.rotatingOrFlushing = rotatingOrFlushing;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InnodbTablespacesEncryption (");

        sb.append(space);
        sb.append(", ").append(name);
        sb.append(", ").append(encryptionScheme);
        sb.append(", ").append(keyserverRequests);
        sb.append(", ").append(minKeyVersion);
        sb.append(", ").append(currentKeyVersion);
        sb.append(", ").append(keyRotationPageNumber);
        sb.append(", ").append(keyRotationMaxPageNumber);
        sb.append(", ").append(currentKeyId);
        sb.append(", ").append(rotatingOrFlushing);

        sb.append(")");
        return sb.toString();
    }
}