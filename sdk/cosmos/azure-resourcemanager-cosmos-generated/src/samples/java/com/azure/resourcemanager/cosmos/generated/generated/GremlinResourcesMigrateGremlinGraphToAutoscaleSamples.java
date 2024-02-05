// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

/**
 * Samples for GremlinResources MigrateGremlinGraphToAutoscale.
 */
public final class GremlinResourcesMigrateGremlinGraphToAutoscaleSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2024-01-15-preview/examples/
     * CosmosDBGremlinGraphMigrateToAutoscale.json
     */
    /**
     * Sample code: CosmosDBGremlinGraphMigrateToAutoscale.
     * 
     * @param manager Entry point to CosmosDBManager.
     */
    public static void
        cosmosDBGremlinGraphMigrateToAutoscale(com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.gremlinResources().migrateGremlinGraphToAutoscale("rg1", "ddb1", "databaseName", "graphName",
            com.azure.core.util.Context.NONE);
    }
}
