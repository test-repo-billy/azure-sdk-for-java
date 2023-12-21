/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_03_31_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input for the task that validates connection to Azure SQL Database Managed
 * Instance.
 */
public class ConnectToTargetSqlMITaskInput {
    /**
     * Connection information for target SQL Server.
     */
    @JsonProperty(value = "targetConnectionInfo", required = true)
    private SqlConnectionInfo targetConnectionInfo;

    /**
     * Get connection information for target SQL Server.
     *
     * @return the targetConnectionInfo value
     */
    public SqlConnectionInfo targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    /**
     * Set connection information for target SQL Server.
     *
     * @param targetConnectionInfo the targetConnectionInfo value to set
     * @return the ConnectToTargetSqlMITaskInput object itself.
     */
    public ConnectToTargetSqlMITaskInput withTargetConnectionInfo(SqlConnectionInfo targetConnectionInfo) {
        this.targetConnectionInfo = targetConnectionInfo;
        return this;
    }

}
