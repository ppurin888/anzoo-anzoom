/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.information_schema.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

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
public class Events implements Serializable {

    private static final long serialVersionUID = -1980773939;

    private String    eventCatalog;
    private String    eventSchema;
    private String    eventName;
    private String    definer;
    private String    timeZone;
    private String    eventBody;
    private String    eventDefinition;
    private String    eventType;
    private Timestamp executeAt;
    private String    intervalValue;
    private String    intervalField;
    private String    sqlMode;
    private Timestamp starts;
    private Timestamp ends;
    private String    status;
    private String    onCompletion;
    private Timestamp created;
    private Timestamp lastAltered;
    private Timestamp lastExecuted;
    private String    eventComment;
    private Long      originator;
    private String    characterSetClient;
    private String    collationConnection;
    private String    databaseCollation;

    public Events() {}

    public Events(Events value) {
        this.eventCatalog = value.eventCatalog;
        this.eventSchema = value.eventSchema;
        this.eventName = value.eventName;
        this.definer = value.definer;
        this.timeZone = value.timeZone;
        this.eventBody = value.eventBody;
        this.eventDefinition = value.eventDefinition;
        this.eventType = value.eventType;
        this.executeAt = value.executeAt;
        this.intervalValue = value.intervalValue;
        this.intervalField = value.intervalField;
        this.sqlMode = value.sqlMode;
        this.starts = value.starts;
        this.ends = value.ends;
        this.status = value.status;
        this.onCompletion = value.onCompletion;
        this.created = value.created;
        this.lastAltered = value.lastAltered;
        this.lastExecuted = value.lastExecuted;
        this.eventComment = value.eventComment;
        this.originator = value.originator;
        this.characterSetClient = value.characterSetClient;
        this.collationConnection = value.collationConnection;
        this.databaseCollation = value.databaseCollation;
    }

    public Events(
        String    eventCatalog,
        String    eventSchema,
        String    eventName,
        String    definer,
        String    timeZone,
        String    eventBody,
        String    eventDefinition,
        String    eventType,
        Timestamp executeAt,
        String    intervalValue,
        String    intervalField,
        String    sqlMode,
        Timestamp starts,
        Timestamp ends,
        String    status,
        String    onCompletion,
        Timestamp created,
        Timestamp lastAltered,
        Timestamp lastExecuted,
        String    eventComment,
        Long      originator,
        String    characterSetClient,
        String    collationConnection,
        String    databaseCollation
    ) {
        this.eventCatalog = eventCatalog;
        this.eventSchema = eventSchema;
        this.eventName = eventName;
        this.definer = definer;
        this.timeZone = timeZone;
        this.eventBody = eventBody;
        this.eventDefinition = eventDefinition;
        this.eventType = eventType;
        this.executeAt = executeAt;
        this.intervalValue = intervalValue;
        this.intervalField = intervalField;
        this.sqlMode = sqlMode;
        this.starts = starts;
        this.ends = ends;
        this.status = status;
        this.onCompletion = onCompletion;
        this.created = created;
        this.lastAltered = lastAltered;
        this.lastExecuted = lastExecuted;
        this.eventComment = eventComment;
        this.originator = originator;
        this.characterSetClient = characterSetClient;
        this.collationConnection = collationConnection;
        this.databaseCollation = databaseCollation;
    }

    public String getEventCatalog() {
        return this.eventCatalog;
    }

    public void setEventCatalog(String eventCatalog) {
        this.eventCatalog = eventCatalog;
    }

    public String getEventSchema() {
        return this.eventSchema;
    }

    public void setEventSchema(String eventSchema) {
        this.eventSchema = eventSchema;
    }

    public String getEventName() {
        return this.eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDefiner() {
        return this.definer;
    }

    public void setDefiner(String definer) {
        this.definer = definer;
    }

    public String getTimeZone() {
        return this.timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getEventBody() {
        return this.eventBody;
    }

    public void setEventBody(String eventBody) {
        this.eventBody = eventBody;
    }

    public String getEventDefinition() {
        return this.eventDefinition;
    }

    public void setEventDefinition(String eventDefinition) {
        this.eventDefinition = eventDefinition;
    }

    public String getEventType() {
        return this.eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Timestamp getExecuteAt() {
        return this.executeAt;
    }

    public void setExecuteAt(Timestamp executeAt) {
        this.executeAt = executeAt;
    }

    public String getIntervalValue() {
        return this.intervalValue;
    }

    public void setIntervalValue(String intervalValue) {
        this.intervalValue = intervalValue;
    }

    public String getIntervalField() {
        return this.intervalField;
    }

    public void setIntervalField(String intervalField) {
        this.intervalField = intervalField;
    }

    public String getSqlMode() {
        return this.sqlMode;
    }

    public void setSqlMode(String sqlMode) {
        this.sqlMode = sqlMode;
    }

    public Timestamp getStarts() {
        return this.starts;
    }

    public void setStarts(Timestamp starts) {
        this.starts = starts;
    }

    public Timestamp getEnds() {
        return this.ends;
    }

    public void setEnds(Timestamp ends) {
        this.ends = ends;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOnCompletion() {
        return this.onCompletion;
    }

    public void setOnCompletion(String onCompletion) {
        this.onCompletion = onCompletion;
    }

    public Timestamp getCreated() {
        return this.created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getLastAltered() {
        return this.lastAltered;
    }

    public void setLastAltered(Timestamp lastAltered) {
        this.lastAltered = lastAltered;
    }

    public Timestamp getLastExecuted() {
        return this.lastExecuted;
    }

    public void setLastExecuted(Timestamp lastExecuted) {
        this.lastExecuted = lastExecuted;
    }

    public String getEventComment() {
        return this.eventComment;
    }

    public void setEventComment(String eventComment) {
        this.eventComment = eventComment;
    }

    public Long getOriginator() {
        return this.originator;
    }

    public void setOriginator(Long originator) {
        this.originator = originator;
    }

    public String getCharacterSetClient() {
        return this.characterSetClient;
    }

    public void setCharacterSetClient(String characterSetClient) {
        this.characterSetClient = characterSetClient;
    }

    public String getCollationConnection() {
        return this.collationConnection;
    }

    public void setCollationConnection(String collationConnection) {
        this.collationConnection = collationConnection;
    }

    public String getDatabaseCollation() {
        return this.databaseCollation;
    }

    public void setDatabaseCollation(String databaseCollation) {
        this.databaseCollation = databaseCollation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Events (");

        sb.append(eventCatalog);
        sb.append(", ").append(eventSchema);
        sb.append(", ").append(eventName);
        sb.append(", ").append(definer);
        sb.append(", ").append(timeZone);
        sb.append(", ").append(eventBody);
        sb.append(", ").append(eventDefinition);
        sb.append(", ").append(eventType);
        sb.append(", ").append(executeAt);
        sb.append(", ").append(intervalValue);
        sb.append(", ").append(intervalField);
        sb.append(", ").append(sqlMode);
        sb.append(", ").append(starts);
        sb.append(", ").append(ends);
        sb.append(", ").append(status);
        sb.append(", ").append(onCompletion);
        sb.append(", ").append(created);
        sb.append(", ").append(lastAltered);
        sb.append(", ").append(lastExecuted);
        sb.append(", ").append(eventComment);
        sb.append(", ").append(originator);
        sb.append(", ").append(characterSetClient);
        sb.append(", ").append(collationConnection);
        sb.append(", ").append(databaseCollation);

        sb.append(")");
        return sb.toString();
    }
}
