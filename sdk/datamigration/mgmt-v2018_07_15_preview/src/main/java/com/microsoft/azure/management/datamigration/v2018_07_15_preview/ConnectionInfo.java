/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Defines the connection properties of a server.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ConnectionInfo")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "MiSqlConnectionInfo", value = MiSqlConnectionInfo.class),
    @JsonSubTypes.Type(name = "PostgreSqlConnectionInfo", value = PostgreSqlConnectionInfo.class),
    @JsonSubTypes.Type(name = "OracleConnectionInfo", value = OracleConnectionInfo.class),
    @JsonSubTypes.Type(name = "MySqlConnectionInfo", value = MySqlConnectionInfo.class),
    @JsonSubTypes.Type(name = "MongoDbConnectionInfo", value = MongoDbConnectionInfo.class),
    @JsonSubTypes.Type(name = "SqlConnectionInfo", value = SqlConnectionInfo.class)
})
public class ConnectionInfo {
    /**
     * User name.
     */
    @JsonProperty(value = "userName")
    private String userName;

    /**
     * Password credential.
     */
    @JsonProperty(value = "password")
    private String password;

    /**
     * Get user name.
     *
     * @return the userName value
     */
    public String userName() {
        return this.userName;
    }

    /**
     * Set user name.
     *
     * @param userName the userName value to set
     * @return the ConnectionInfo object itself.
     */
    public ConnectionInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get password credential.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set password credential.
     *
     * @param password the password value to set
     * @return the ConnectionInfo object itself.
     */
    public ConnectionInfo withPassword(String password) {
        this.password = password;
        return this;
    }

}
