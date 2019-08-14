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
 * Output for the task that validates connection to Azure Database for
 * PostgreSQL and target server requirements for Oracle source.
 */
public class ConnectToTargetOracleAzureDbForPostgreSqlSyncTaskOutput {
    /**
     * Version of the target server.
     */
    @JsonProperty(value = "targetServerVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String targetServerVersion;

    /**
     * List of databases on target server.
     */
    @JsonProperty(value = "databases", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> databases;

    /**
     * Target server brand version.
     */
    @JsonProperty(value = "targetServerBrandVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String targetServerBrandVersion;

    /**
     * Validation errors associated with the task.
     */
    @JsonProperty(value = "validationErrors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReportableException> validationErrors;

    /**
     * Get version of the target server.
     *
     * @return the targetServerVersion value
     */
    public String targetServerVersion() {
        return this.targetServerVersion;
    }

    /**
     * Get list of databases on target server.
     *
     * @return the databases value
     */
    public List<String> databases() {
        return this.databases;
    }

    /**
     * Get target server brand version.
     *
     * @return the targetServerBrandVersion value
     */
    public String targetServerBrandVersion() {
        return this.targetServerBrandVersion;
    }

    /**
     * Get validation errors associated with the task.
     *
     * @return the validationErrors value
     */
    public List<ReportableException> validationErrors() {
        return this.validationErrors;
    }

}
