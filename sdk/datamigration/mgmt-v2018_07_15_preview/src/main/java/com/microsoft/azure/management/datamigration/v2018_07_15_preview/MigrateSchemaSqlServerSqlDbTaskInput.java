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
 * Input for task that migrates Schema for SQL Server databases to Azure SQL
 * databases.
 */
public class MigrateSchemaSqlServerSqlDbTaskInput extends SqlMigrationTaskInput {
    /**
     * Databases to migrate.
     */
    @JsonProperty(value = "selectedDatabases", required = true)
    private List<MigrateSchemaSqlServerSqlDbDatabaseInput> selectedDatabases;

    /**
     * Get databases to migrate.
     *
     * @return the selectedDatabases value
     */
    public List<MigrateSchemaSqlServerSqlDbDatabaseInput> selectedDatabases() {
        return this.selectedDatabases;
    }

    /**
     * Set databases to migrate.
     *
     * @param selectedDatabases the selectedDatabases value to set
     * @return the MigrateSchemaSqlServerSqlDbTaskInput object itself.
     */
    public MigrateSchemaSqlServerSqlDbTaskInput withSelectedDatabases(List<MigrateSchemaSqlServerSqlDbDatabaseInput> selectedDatabases) {
        this.selectedDatabases = selectedDatabases;
        return this;
    }

}
