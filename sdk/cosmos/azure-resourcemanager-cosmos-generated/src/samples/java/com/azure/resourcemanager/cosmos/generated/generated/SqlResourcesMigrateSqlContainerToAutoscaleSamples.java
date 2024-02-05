// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

/**
 * Samples for SqlResources MigrateSqlContainerToAutoscale.
 */
public final class SqlResourcesMigrateSqlContainerToAutoscaleSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2024-01-15-preview/examples/
     * CosmosDBSqlContainerMigrateToAutoscale.json
     */
    /**
     * Sample code: CosmosDBSqlContainerMigrateToAutoscale.
     * 
     * @param manager Entry point to CosmosDBManager.
     */
    public static void
        cosmosDBSqlContainerMigrateToAutoscale(com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.sqlResources().migrateSqlContainerToAutoscale("rg1", "ddb1", "databaseName", "containerName",
            com.azure.core.util.Context.NONE);
    }
}
