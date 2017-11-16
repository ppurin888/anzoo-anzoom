/*
 * This file is generated by jOOQ.
*/
package com.anzoo_anzoom.database.information_schema.tables.records;


import com.anzoo_anzoom.database.information_schema.tables.Routines;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.impl.TableRecordImpl;
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
public class RoutinesRecord extends TableRecordImpl<RoutinesRecord> {

    private static final long serialVersionUID = 633294098;

    /**
     * Setter for <code>information_schema.ROUTINES.SPECIFIC_NAME</code>.
     */
    public void setSpecificName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.SPECIFIC_NAME</code>.
     */
    public String getSpecificName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.ROUTINE_CATALOG</code>.
     */
    public void setRoutineCatalog(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.ROUTINE_CATALOG</code>.
     */
    public String getRoutineCatalog() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.ROUTINE_SCHEMA</code>.
     */
    public void setRoutineSchema(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.ROUTINE_SCHEMA</code>.
     */
    public String getRoutineSchema() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.ROUTINE_NAME</code>.
     */
    public void setRoutineName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.ROUTINE_NAME</code>.
     */
    public String getRoutineName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.ROUTINE_TYPE</code>.
     */
    public void setRoutineType(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.ROUTINE_TYPE</code>.
     */
    public String getRoutineType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.DATA_TYPE</code>.
     */
    public void setDataType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.DATA_TYPE</code>.
     */
    public String getDataType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    public void setCharacterMaximumLength(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    public Integer getCharacterMaximumLength() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.CHARACTER_OCTET_LENGTH</code>.
     */
    public void setCharacterOctetLength(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.CHARACTER_OCTET_LENGTH</code>.
     */
    public Integer getCharacterOctetLength() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.NUMERIC_PRECISION</code>.
     */
    public void setNumericPrecision(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.NUMERIC_PRECISION</code>.
     */
    public ULong getNumericPrecision() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.NUMERIC_SCALE</code>.
     */
    public void setNumericScale(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.NUMERIC_SCALE</code>.
     */
    public Integer getNumericScale() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.DATETIME_PRECISION</code>.
     */
    public void setDatetimePrecision(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.DATETIME_PRECISION</code>.
     */
    public ULong getDatetimePrecision() {
        return (ULong) get(10);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.CHARACTER_SET_NAME</code>.
     */
    public void setCharacterSetName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.CHARACTER_SET_NAME</code>.
     */
    public String getCharacterSetName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.COLLATION_NAME</code>.
     */
    public void setCollationName(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.COLLATION_NAME</code>.
     */
    public String getCollationName() {
        return (String) get(12);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.DTD_IDENTIFIER</code>.
     */
    public void setDtdIdentifier(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.DTD_IDENTIFIER</code>.
     */
    public String getDtdIdentifier() {
        return (String) get(13);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.ROUTINE_BODY</code>.
     */
    public void setRoutineBody(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.ROUTINE_BODY</code>.
     */
    public String getRoutineBody() {
        return (String) get(14);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.ROUTINE_DEFINITION</code>.
     */
    public void setRoutineDefinition(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.ROUTINE_DEFINITION</code>.
     */
    public String getRoutineDefinition() {
        return (String) get(15);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.EXTERNAL_NAME</code>.
     */
    public void setExternalName(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.EXTERNAL_NAME</code>.
     */
    public String getExternalName() {
        return (String) get(16);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.EXTERNAL_LANGUAGE</code>.
     */
    public void setExternalLanguage(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.EXTERNAL_LANGUAGE</code>.
     */
    public String getExternalLanguage() {
        return (String) get(17);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.PARAMETER_STYLE</code>.
     */
    public void setParameterStyle(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.PARAMETER_STYLE</code>.
     */
    public String getParameterStyle() {
        return (String) get(18);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.IS_DETERMINISTIC</code>.
     */
    public void setIsDeterministic(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.IS_DETERMINISTIC</code>.
     */
    public String getIsDeterministic() {
        return (String) get(19);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.SQL_DATA_ACCESS</code>.
     */
    public void setSqlDataAccess(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.SQL_DATA_ACCESS</code>.
     */
    public String getSqlDataAccess() {
        return (String) get(20);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.SQL_PATH</code>.
     */
    public void setSqlPath(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.SQL_PATH</code>.
     */
    public String getSqlPath() {
        return (String) get(21);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.SECURITY_TYPE</code>.
     */
    public void setSecurityType(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.SECURITY_TYPE</code>.
     */
    public String getSecurityType() {
        return (String) get(22);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.CREATED</code>.
     */
    public void setCreated(Timestamp value) {
        set(23, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.CREATED</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(23);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.LAST_ALTERED</code>.
     */
    public void setLastAltered(Timestamp value) {
        set(24, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.LAST_ALTERED</code>.
     */
    public Timestamp getLastAltered() {
        return (Timestamp) get(24);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.SQL_MODE</code>.
     */
    public void setSqlMode(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.SQL_MODE</code>.
     */
    public String getSqlMode() {
        return (String) get(25);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.ROUTINE_COMMENT</code>.
     */
    public void setRoutineComment(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.ROUTINE_COMMENT</code>.
     */
    public String getRoutineComment() {
        return (String) get(26);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.DEFINER</code>.
     */
    public void setDefiner(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.DEFINER</code>.
     */
    public String getDefiner() {
        return (String) get(27);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.CHARACTER_SET_CLIENT</code>.
     */
    public void setCharacterSetClient(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.CHARACTER_SET_CLIENT</code>.
     */
    public String getCharacterSetClient() {
        return (String) get(28);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.COLLATION_CONNECTION</code>.
     */
    public void setCollationConnection(String value) {
        set(29, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.COLLATION_CONNECTION</code>.
     */
    public String getCollationConnection() {
        return (String) get(29);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.DATABASE_COLLATION</code>.
     */
    public void setDatabaseCollation(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.DATABASE_COLLATION</code>.
     */
    public String getDatabaseCollation() {
        return (String) get(30);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoutinesRecord
     */
    public RoutinesRecord() {
        super(Routines.ROUTINES);
    }

    /**
     * Create a detached, initialised RoutinesRecord
     */
    public RoutinesRecord(String specificName, String routineCatalog, String routineSchema, String routineName, String routineType, String dataType, Integer characterMaximumLength, Integer characterOctetLength, ULong numericPrecision, Integer numericScale, ULong datetimePrecision, String characterSetName, String collationName, String dtdIdentifier, String routineBody, String routineDefinition, String externalName, String externalLanguage, String parameterStyle, String isDeterministic, String sqlDataAccess, String sqlPath, String securityType, Timestamp created, Timestamp lastAltered, String sqlMode, String routineComment, String definer, String characterSetClient, String collationConnection, String databaseCollation) {
        super(Routines.ROUTINES);

        set(0, specificName);
        set(1, routineCatalog);
        set(2, routineSchema);
        set(3, routineName);
        set(4, routineType);
        set(5, dataType);
        set(6, characterMaximumLength);
        set(7, characterOctetLength);
        set(8, numericPrecision);
        set(9, numericScale);
        set(10, datetimePrecision);
        set(11, characterSetName);
        set(12, collationName);
        set(13, dtdIdentifier);
        set(14, routineBody);
        set(15, routineDefinition);
        set(16, externalName);
        set(17, externalLanguage);
        set(18, parameterStyle);
        set(19, isDeterministic);
        set(20, sqlDataAccess);
        set(21, sqlPath);
        set(22, securityType);
        set(23, created);
        set(24, lastAltered);
        set(25, sqlMode);
        set(26, routineComment);
        set(27, definer);
        set(28, characterSetClient);
        set(29, collationConnection);
        set(30, databaseCollation);
    }
}
