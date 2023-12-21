/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input for the task that collects user tables for the given list of
 * databases.
 */
public class GetUserTablesSqlSyncTaskInput {
    /**
     * Connection information for SQL Server.
     */
    @JsonProperty(value = "sourceConnectionInfo", required = true)
    private SqlConnectionInfo sourceConnectionInfo;

    /**
     * Connection information for SQL DB.
     */
    @JsonProperty(value = "targetConnectionInfo", required = true)
    private SqlConnectionInfo targetConnectionInfo;

    /**
     * List of source database names to collect tables for.
     */
    @JsonProperty(value = "selectedSourceDatabases", required = true)
    private List<String> selectedSourceDatabases;

    /**
     * List of target database names to collect tables for.
     */
    @JsonProperty(value = "selectedTargetDatabases", required = true)
    private List<String> selectedTargetDatabases;

    /**
     * Get connection information for SQL Server.
     *
     * @return the sourceConnectionInfo value
     */
    public SqlConnectionInfo sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Set connection information for SQL Server.
     *
     * @param sourceConnectionInfo the sourceConnectionInfo value to set
     * @return the GetUserTablesSqlSyncTaskInput object itself.
     */
    public GetUserTablesSqlSyncTaskInput withSourceConnectionInfo(SqlConnectionInfo sourceConnectionInfo) {
        this.sourceConnectionInfo = sourceConnectionInfo;
        return this;
    }

    /**
     * Get connection information for SQL DB.
     *
     * @return the targetConnectionInfo value
     */
    public SqlConnectionInfo targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    /**
     * Set connection information for SQL DB.
     *
     * @param targetConnectionInfo the targetConnectionInfo value to set
     * @return the GetUserTablesSqlSyncTaskInput object itself.
     */
    public GetUserTablesSqlSyncTaskInput withTargetConnectionInfo(SqlConnectionInfo targetConnectionInfo) {
        this.targetConnectionInfo = targetConnectionInfo;
        return this;
    }

    /**
     * Get list of source database names to collect tables for.
     *
     * @return the selectedSourceDatabases value
     */
    public List<String> selectedSourceDatabases() {
        return this.selectedSourceDatabases;
    }

    /**
     * Set list of source database names to collect tables for.
     *
     * @param selectedSourceDatabases the selectedSourceDatabases value to set
     * @return the GetUserTablesSqlSyncTaskInput object itself.
     */
    public GetUserTablesSqlSyncTaskInput withSelectedSourceDatabases(List<String> selectedSourceDatabases) {
        this.selectedSourceDatabases = selectedSourceDatabases;
        return this;
    }

    /**
     * Get list of target database names to collect tables for.
     *
     * @return the selectedTargetDatabases value
     */
    public List<String> selectedTargetDatabases() {
        return this.selectedTargetDatabases;
    }

    /**
     * Set list of target database names to collect tables for.
     *
     * @param selectedTargetDatabases the selectedTargetDatabases value to set
     * @return the GetUserTablesSqlSyncTaskInput object itself.
     */
    public GetUserTablesSqlSyncTaskInput withSelectedTargetDatabases(List<String> selectedTargetDatabases) {
        this.selectedTargetDatabases = selectedTargetDatabases;
        return this;
    }

}
