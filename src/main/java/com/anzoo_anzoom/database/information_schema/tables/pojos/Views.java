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
public class Views implements Serializable {

    private static final long serialVersionUID = -592974452;

    private String tableCatalog;
    private String tableSchema;
    private String tableName;
    private String viewDefinition;
    private String checkOption;
    private String isUpdatable;
    private String definer;
    private String securityType;
    private String characterSetClient;
    private String collationConnection;
    private String algorithm;

    public Views() {}

    public Views(Views value) {
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.viewDefinition = value.viewDefinition;
        this.checkOption = value.checkOption;
        this.isUpdatable = value.isUpdatable;
        this.definer = value.definer;
        this.securityType = value.securityType;
        this.characterSetClient = value.characterSetClient;
        this.collationConnection = value.collationConnection;
        this.algorithm = value.algorithm;
    }

    public Views(
        String tableCatalog,
        String tableSchema,
        String tableName,
        String viewDefinition,
        String checkOption,
        String isUpdatable,
        String definer,
        String securityType,
        String characterSetClient,
        String collationConnection,
        String algorithm
    ) {
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.viewDefinition = viewDefinition;
        this.checkOption = checkOption;
        this.isUpdatable = isUpdatable;
        this.definer = definer;
        this.securityType = securityType;
        this.characterSetClient = characterSetClient;
        this.collationConnection = collationConnection;
        this.algorithm = algorithm;
    }

    public String getTableCatalog() {
        return this.tableCatalog;
    }

    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    public String getTableSchema() {
        return this.tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    public String getTableName() {
        return this.tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getViewDefinition() {
        return this.viewDefinition;
    }

    public void setViewDefinition(String viewDefinition) {
        this.viewDefinition = viewDefinition;
    }

    public String getCheckOption() {
        return this.checkOption;
    }

    public void setCheckOption(String checkOption) {
        this.checkOption = checkOption;
    }

    public String getIsUpdatable() {
        return this.isUpdatable;
    }

    public void setIsUpdatable(String isUpdatable) {
        this.isUpdatable = isUpdatable;
    }

    public String getDefiner() {
        return this.definer;
    }

    public void setDefiner(String definer) {
        this.definer = definer;
    }

    public String getSecurityType() {
        return this.securityType;
    }

    public void setSecurityType(String securityType) {
        this.securityType = securityType;
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

    public String getAlgorithm() {
        return this.algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Views (");

        sb.append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(viewDefinition);
        sb.append(", ").append(checkOption);
        sb.append(", ").append(isUpdatable);
        sb.append(", ").append(definer);
        sb.append(", ").append(securityType);
        sb.append(", ").append(characterSetClient);
        sb.append(", ").append(collationConnection);
        sb.append(", ").append(algorithm);

        sb.append(")");
        return sb.toString();
    }
}
