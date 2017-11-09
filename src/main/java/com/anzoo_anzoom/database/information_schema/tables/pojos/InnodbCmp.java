/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.information_schema.tables.pojos;


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
public class InnodbCmp implements Serializable {

    private static final long serialVersionUID = -1994774299;

    private Integer pageSize;
    private Integer compressOps;
    private Integer compressOpsOk;
    private Integer compressTime;
    private Integer uncompressOps;
    private Integer uncompressTime;

    public InnodbCmp() {}

    public InnodbCmp(InnodbCmp value) {
        this.pageSize = value.pageSize;
        this.compressOps = value.compressOps;
        this.compressOpsOk = value.compressOpsOk;
        this.compressTime = value.compressTime;
        this.uncompressOps = value.uncompressOps;
        this.uncompressTime = value.uncompressTime;
    }

    public InnodbCmp(
        Integer pageSize,
        Integer compressOps,
        Integer compressOpsOk,
        Integer compressTime,
        Integer uncompressOps,
        Integer uncompressTime
    ) {
        this.pageSize = pageSize;
        this.compressOps = compressOps;
        this.compressOpsOk = compressOpsOk;
        this.compressTime = compressTime;
        this.uncompressOps = uncompressOps;
        this.uncompressTime = uncompressTime;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCompressOps() {
        return this.compressOps;
    }

    public void setCompressOps(Integer compressOps) {
        this.compressOps = compressOps;
    }

    public Integer getCompressOpsOk() {
        return this.compressOpsOk;
    }

    public void setCompressOpsOk(Integer compressOpsOk) {
        this.compressOpsOk = compressOpsOk;
    }

    public Integer getCompressTime() {
        return this.compressTime;
    }

    public void setCompressTime(Integer compressTime) {
        this.compressTime = compressTime;
    }

    public Integer getUncompressOps() {
        return this.uncompressOps;
    }

    public void setUncompressOps(Integer uncompressOps) {
        this.uncompressOps = uncompressOps;
    }

    public Integer getUncompressTime() {
        return this.uncompressTime;
    }

    public void setUncompressTime(Integer uncompressTime) {
        this.uncompressTime = uncompressTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InnodbCmp (");

        sb.append(pageSize);
        sb.append(", ").append(compressOps);
        sb.append(", ").append(compressOpsOk);
        sb.append(", ").append(compressTime);
        sb.append(", ").append(uncompressOps);
        sb.append(", ").append(uncompressTime);

        sb.append(")");
        return sb.toString();
    }
}
