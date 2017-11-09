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
public class SessionVariables implements Serializable {

    private static final long serialVersionUID = 509893621;

    private String variableName;
    private String variableValue;

    public SessionVariables() {}

    public SessionVariables(SessionVariables value) {
        this.variableName = value.variableName;
        this.variableValue = value.variableValue;
    }

    public SessionVariables(
        String variableName,
        String variableValue
    ) {
        this.variableName = variableName;
        this.variableValue = variableValue;
    }

    public String getVariableName() {
        return this.variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public String getVariableValue() {
        return this.variableValue;
    }

    public void setVariableValue(String variableValue) {
        this.variableValue = variableValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SessionVariables (");

        sb.append(variableName);
        sb.append(", ").append(variableValue);

        sb.append(")");
        return sb.toString();
    }
}
