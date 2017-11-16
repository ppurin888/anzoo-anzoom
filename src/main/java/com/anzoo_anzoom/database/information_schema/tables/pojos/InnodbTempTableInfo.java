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
public class InnodbTempTableInfo implements Serializable {

    private static final long serialVersionUID = -1946402516;

    private ULong    tableId;
    private String   name;
    private UInteger nCols;
    private UInteger space;
    private String   perTableTablespace;
    private String   isCompressed;

    public InnodbTempTableInfo() {}

    public InnodbTempTableInfo(InnodbTempTableInfo value) {
        this.tableId = value.tableId;
        this.name = value.name;
        this.nCols = value.nCols;
        this.space = value.space;
        this.perTableTablespace = value.perTableTablespace;
        this.isCompressed = value.isCompressed;
    }

    public InnodbTempTableInfo(
        ULong    tableId,
        String   name,
        UInteger nCols,
        UInteger space,
        String   perTableTablespace,
        String   isCompressed
    ) {
        this.tableId = tableId;
        this.name = name;
        this.nCols = nCols;
        this.space = space;
        this.perTableTablespace = perTableTablespace;
        this.isCompressed = isCompressed;
    }

    public ULong getTableId() {
        return this.tableId;
    }

    public void setTableId(ULong tableId) {
        this.tableId = tableId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UInteger getNCols() {
        return this.nCols;
    }

    public void setNCols(UInteger nCols) {
        this.nCols = nCols;
    }

    public UInteger getSpace() {
        return this.space;
    }

    public void setSpace(UInteger space) {
        this.space = space;
    }

    public String getPerTableTablespace() {
        return this.perTableTablespace;
    }

    public void setPerTableTablespace(String perTableTablespace) {
        this.perTableTablespace = perTableTablespace;
    }

    public String getIsCompressed() {
        return this.isCompressed;
    }

    public void setIsCompressed(String isCompressed) {
        this.isCompressed = isCompressed;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InnodbTempTableInfo (");

        sb.append(tableId);
        sb.append(", ").append(name);
        sb.append(", ").append(nCols);
        sb.append(", ").append(space);
        sb.append(", ").append(perTableTablespace);
        sb.append(", ").append(isCompressed);

        sb.append(")");
        return sb.toString();
    }
}