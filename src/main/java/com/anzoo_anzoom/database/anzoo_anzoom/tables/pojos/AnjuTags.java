/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.anzoo_anzoom.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class AnjuTags implements Serializable {

    private static final long serialVersionUID = -2007302619;

    private Integer id;
    private String  tag;
    private Integer tagCount;

    public AnjuTags() {}

    public AnjuTags(AnjuTags value) {
        this.id = value.id;
        this.tag = value.tag;
        this.tagCount = value.tagCount;
    }

    public AnjuTags(
        Integer id,
        String  tag,
        Integer tagCount
    ) {
        this.id = id;
        this.tag = tag;
        this.tagCount = tagCount;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getTagCount() {
        return this.tagCount;
    }

    public void setTagCount(Integer tagCount) {
        this.tagCount = tagCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AnjuTags (");

        sb.append(id);
        sb.append(", ").append(tag);
        sb.append(", ").append(tagCount);

        sb.append(")");
        return sb.toString();
    }
}
