/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.information_schema.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;

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
public class InnodbFtDeleted implements Serializable {

    private static final long serialVersionUID = 284879767;

    private ULong docId;

    public InnodbFtDeleted() {}

    public InnodbFtDeleted(InnodbFtDeleted value) {
        this.docId = value.docId;
    }

    public InnodbFtDeleted(
        ULong docId
    ) {
        this.docId = docId;
    }

    public ULong getDocId() {
        return this.docId;
    }

    public void setDocId(ULong docId) {
        this.docId = docId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InnodbFtDeleted (");

        sb.append(docId);

        sb.append(")");
        return sb.toString();
    }
}
