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
public class Engines implements Serializable {

    private static final long serialVersionUID = -40863915;

    private String engine;
    private String support;
    private String comment;
    private String transactions;
    private String xa;
    private String savepoints;

    public Engines() {}

    public Engines(Engines value) {
        this.engine = value.engine;
        this.support = value.support;
        this.comment = value.comment;
        this.transactions = value.transactions;
        this.xa = value.xa;
        this.savepoints = value.savepoints;
    }

    public Engines(
        String engine,
        String support,
        String comment,
        String transactions,
        String xa,
        String savepoints
    ) {
        this.engine = engine;
        this.support = support;
        this.comment = comment;
        this.transactions = transactions;
        this.xa = xa;
        this.savepoints = savepoints;
    }

    public String getEngine() {
        return this.engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getSupport() {
        return this.support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTransactions() {
        return this.transactions;
    }

    public void setTransactions(String transactions) {
        this.transactions = transactions;
    }

    public String getXa() {
        return this.xa;
    }

    public void setXa(String xa) {
        this.xa = xa;
    }

    public String getSavepoints() {
        return this.savepoints;
    }

    public void setSavepoints(String savepoints) {
        this.savepoints = savepoints;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Engines (");

        sb.append(engine);
        sb.append(", ").append(support);
        sb.append(", ").append(comment);
        sb.append(", ").append(transactions);
        sb.append(", ").append(xa);
        sb.append(", ").append(savepoints);

        sb.append(")");
        return sb.toString();
    }
}
