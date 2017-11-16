/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.information_schema.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

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
public class Routines implements Serializable {

    private static final long serialVersionUID = -89215329;

    private String    specificName;
    private String    routineCatalog;
    private String    routineSchema;
    private String    routineName;
    private String    routineType;
    private String    dataType;
    private Integer   characterMaximumLength;
    private Integer   characterOctetLength;
    private ULong     numericPrecision;
    private Integer   numericScale;
    private ULong     datetimePrecision;
    private String    characterSetName;
    private String    collationName;
    private String    dtdIdentifier;
    private String    routineBody;
    private String    routineDefinition;
    private String    externalName;
    private String    externalLanguage;
    private String    parameterStyle;
    private String    isDeterministic;
    private String    sqlDataAccess;
    private String    sqlPath;
    private String    securityType;
    private Timestamp created;
    private Timestamp lastAltered;
    private String    sqlMode;
    private String    routineComment;
    private String    definer;
    private String    characterSetClient;
    private String    collationConnection;
    private String    databaseCollation;

    public Routines() {}

    public Routines(Routines value) {
        this.specificName = value.specificName;
        this.routineCatalog = value.routineCatalog;
        this.routineSchema = value.routineSchema;
        this.routineName = value.routineName;
        this.routineType = value.routineType;
        this.dataType = value.dataType;
        this.characterMaximumLength = value.characterMaximumLength;
        this.characterOctetLength = value.characterOctetLength;
        this.numericPrecision = value.numericPrecision;
        this.numericScale = value.numericScale;
        this.datetimePrecision = value.datetimePrecision;
        this.characterSetName = value.characterSetName;
        this.collationName = value.collationName;
        this.dtdIdentifier = value.dtdIdentifier;
        this.routineBody = value.routineBody;
        this.routineDefinition = value.routineDefinition;
        this.externalName = value.externalName;
        this.externalLanguage = value.externalLanguage;
        this.parameterStyle = value.parameterStyle;
        this.isDeterministic = value.isDeterministic;
        this.sqlDataAccess = value.sqlDataAccess;
        this.sqlPath = value.sqlPath;
        this.securityType = value.securityType;
        this.created = value.created;
        this.lastAltered = value.lastAltered;
        this.sqlMode = value.sqlMode;
        this.routineComment = value.routineComment;
        this.definer = value.definer;
        this.characterSetClient = value.characterSetClient;
        this.collationConnection = value.collationConnection;
        this.databaseCollation = value.databaseCollation;
    }

    public Routines(
        String    specificName,
        String    routineCatalog,
        String    routineSchema,
        String    routineName,
        String    routineType,
        String    dataType,
        Integer   characterMaximumLength,
        Integer   characterOctetLength,
        ULong     numericPrecision,
        Integer   numericScale,
        ULong     datetimePrecision,
        String    characterSetName,
        String    collationName,
        String    dtdIdentifier,
        String    routineBody,
        String    routineDefinition,
        String    externalName,
        String    externalLanguage,
        String    parameterStyle,
        String    isDeterministic,
        String    sqlDataAccess,
        String    sqlPath,
        String    securityType,
        Timestamp created,
        Timestamp lastAltered,
        String    sqlMode,
        String    routineComment,
        String    definer,
        String    characterSetClient,
        String    collationConnection,
        String    databaseCollation
    ) {
        this.specificName = specificName;
        this.routineCatalog = routineCatalog;
        this.routineSchema = routineSchema;
        this.routineName = routineName;
        this.routineType = routineType;
        this.dataType = dataType;
        this.characterMaximumLength = characterMaximumLength;
        this.characterOctetLength = characterOctetLength;
        this.numericPrecision = numericPrecision;
        this.numericScale = numericScale;
        this.datetimePrecision = datetimePrecision;
        this.characterSetName = characterSetName;
        this.collationName = collationName;
        this.dtdIdentifier = dtdIdentifier;
        this.routineBody = routineBody;
        this.routineDefinition = routineDefinition;
        this.externalName = externalName;
        this.externalLanguage = externalLanguage;
        this.parameterStyle = parameterStyle;
        this.isDeterministic = isDeterministic;
        this.sqlDataAccess = sqlDataAccess;
        this.sqlPath = sqlPath;
        this.securityType = securityType;
        this.created = created;
        this.lastAltered = lastAltered;
        this.sqlMode = sqlMode;
        this.routineComment = routineComment;
        this.definer = definer;
        this.characterSetClient = characterSetClient;
        this.collationConnection = collationConnection;
        this.databaseCollation = databaseCollation;
    }

    public String getSpecificName() {
        return this.specificName;
    }

    public void setSpecificName(String specificName) {
        this.specificName = specificName;
    }

    public String getRoutineCatalog() {
        return this.routineCatalog;
    }

    public void setRoutineCatalog(String routineCatalog) {
        this.routineCatalog = routineCatalog;
    }

    public String getRoutineSchema() {
        return this.routineSchema;
    }

    public void setRoutineSchema(String routineSchema) {
        this.routineSchema = routineSchema;
    }

    public String getRoutineName() {
        return this.routineName;
    }

    public void setRoutineName(String routineName) {
        this.routineName = routineName;
    }

    public String getRoutineType() {
        return this.routineType;
    }

    public void setRoutineType(String routineType) {
        this.routineType = routineType;
    }

    public String getDataType() {
        return this.dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Integer getCharacterMaximumLength() {
        return this.characterMaximumLength;
    }

    public void setCharacterMaximumLength(Integer characterMaximumLength) {
        this.characterMaximumLength = characterMaximumLength;
    }

    public Integer getCharacterOctetLength() {
        return this.characterOctetLength;
    }

    public void setCharacterOctetLength(Integer characterOctetLength) {
        this.characterOctetLength = characterOctetLength;
    }

    public ULong getNumericPrecision() {
        return this.numericPrecision;
    }

    public void setNumericPrecision(ULong numericPrecision) {
        this.numericPrecision = numericPrecision;
    }

    public Integer getNumericScale() {
        return this.numericScale;
    }

    public void setNumericScale(Integer numericScale) {
        this.numericScale = numericScale;
    }

    public ULong getDatetimePrecision() {
        return this.datetimePrecision;
    }

    public void setDatetimePrecision(ULong datetimePrecision) {
        this.datetimePrecision = datetimePrecision;
    }

    public String getCharacterSetName() {
        return this.characterSetName;
    }

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    public String getCollationName() {
        return this.collationName;
    }

    public void setCollationName(String collationName) {
        this.collationName = collationName;
    }

    public String getDtdIdentifier() {
        return this.dtdIdentifier;
    }

    public void setDtdIdentifier(String dtdIdentifier) {
        this.dtdIdentifier = dtdIdentifier;
    }

    public String getRoutineBody() {
        return this.routineBody;
    }

    public void setRoutineBody(String routineBody) {
        this.routineBody = routineBody;
    }

    public String getRoutineDefinition() {
        return this.routineDefinition;
    }

    public void setRoutineDefinition(String routineDefinition) {
        this.routineDefinition = routineDefinition;
    }

    public String getExternalName() {
        return this.externalName;
    }

    public void setExternalName(String externalName) {
        this.externalName = externalName;
    }

    public String getExternalLanguage() {
        return this.externalLanguage;
    }

    public void setExternalLanguage(String externalLanguage) {
        this.externalLanguage = externalLanguage;
    }

    public String getParameterStyle() {
        return this.parameterStyle;
    }

    public void setParameterStyle(String parameterStyle) {
        this.parameterStyle = parameterStyle;
    }

    public String getIsDeterministic() {
        return this.isDeterministic;
    }

    public void setIsDeterministic(String isDeterministic) {
        this.isDeterministic = isDeterministic;
    }

    public String getSqlDataAccess() {
        return this.sqlDataAccess;
    }

    public void setSqlDataAccess(String sqlDataAccess) {
        this.sqlDataAccess = sqlDataAccess;
    }

    public String getSqlPath() {
        return this.sqlPath;
    }

    public void setSqlPath(String sqlPath) {
        this.sqlPath = sqlPath;
    }

    public String getSecurityType() {
        return this.securityType;
    }

    public void setSecurityType(String securityType) {
        this.securityType = securityType;
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

    public String getSqlMode() {
        return this.sqlMode;
    }

    public void setSqlMode(String sqlMode) {
        this.sqlMode = sqlMode;
    }

    public String getRoutineComment() {
        return this.routineComment;
    }

    public void setRoutineComment(String routineComment) {
        this.routineComment = routineComment;
    }

    public String getDefiner() {
        return this.definer;
    }

    public void setDefiner(String definer) {
        this.definer = definer;
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
        StringBuilder sb = new StringBuilder("Routines (");

        sb.append(specificName);
        sb.append(", ").append(routineCatalog);
        sb.append(", ").append(routineSchema);
        sb.append(", ").append(routineName);
        sb.append(", ").append(routineType);
        sb.append(", ").append(dataType);
        sb.append(", ").append(characterMaximumLength);
        sb.append(", ").append(characterOctetLength);
        sb.append(", ").append(numericPrecision);
        sb.append(", ").append(numericScale);
        sb.append(", ").append(datetimePrecision);
        sb.append(", ").append(characterSetName);
        sb.append(", ").append(collationName);
        sb.append(", ").append(dtdIdentifier);
        sb.append(", ").append(routineBody);
        sb.append(", ").append(routineDefinition);
        sb.append(", ").append(externalName);
        sb.append(", ").append(externalLanguage);
        sb.append(", ").append(parameterStyle);
        sb.append(", ").append(isDeterministic);
        sb.append(", ").append(sqlDataAccess);
        sb.append(", ").append(sqlPath);
        sb.append(", ").append(securityType);
        sb.append(", ").append(created);
        sb.append(", ").append(lastAltered);
        sb.append(", ").append(sqlMode);
        sb.append(", ").append(routineComment);
        sb.append(", ").append(definer);
        sb.append(", ").append(characterSetClient);
        sb.append(", ").append(collationConnection);
        sb.append(", ").append(databaseCollation);

        sb.append(")");
        return sb.toString();
    }
}
