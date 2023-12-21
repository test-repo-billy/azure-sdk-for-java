/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2017_11_15_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Migration Validation Result.
 */
public class MigrationValidationResult {
    /**
     * Migration validation result identifier.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Migration Identifier.
     */
    @JsonProperty(value = "migrationId", access = JsonProperty.Access.WRITE_ONLY)
    private String migrationId;

    /**
     * Validation summary results for each database.
     */
    @JsonProperty(value = "summaryResults")
    private Map<String, MigrationValidationDatabaseSummaryResult> summaryResults;

    /**
     * Current status of validation at the migration level. Status from the
     * database validation result status will be aggregated here. Possible
     * values include: 'Default', 'NotStarted', 'Initialized', 'InProgress',
     * 'Completed', 'CompletedWithIssues', 'Failed', 'Stopped'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private ValidationStatus status;

    /**
     * Get migration validation result identifier.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get migration Identifier.
     *
     * @return the migrationId value
     */
    public String migrationId() {
        return this.migrationId;
    }

    /**
     * Get validation summary results for each database.
     *
     * @return the summaryResults value
     */
    public Map<String, MigrationValidationDatabaseSummaryResult> summaryResults() {
        return this.summaryResults;
    }

    /**
     * Set validation summary results for each database.
     *
     * @param summaryResults the summaryResults value to set
     * @return the MigrationValidationResult object itself.
     */
    public MigrationValidationResult withSummaryResults(Map<String, MigrationValidationDatabaseSummaryResult> summaryResults) {
        this.summaryResults = summaryResults;
        return this;
    }

    /**
     * Get current status of validation at the migration level. Status from the database validation result status will be aggregated here. Possible values include: 'Default', 'NotStarted', 'Initialized', 'InProgress', 'Completed', 'CompletedWithIssues', 'Failed', 'Stopped'.
     *
     * @return the status value
     */
    public ValidationStatus status() {
        return this.status;
    }

}
