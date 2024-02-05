// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

/**
 * Samples for MongoDBResources MigrateMongoDBDatabaseToAutoscale.
 */
public final class MongoDBResourcesMigrateMongoDBDatabaseToAutoscaleSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2024-01-15-preview/examples/
     * CosmosDBMongoDBDatabaseMigrateToAutoscale.json
     */
    /**
     * Sample code: CosmosDBMongoDBDatabaseMigrateToAutoscale.
     * 
     * @param manager Entry point to CosmosDBManager.
     */
    public static void
        cosmosDBMongoDBDatabaseMigrateToAutoscale(com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.mongoDBResources().migrateMongoDBDatabaseToAutoscale("rg1", "ddb1", "databaseName",
            com.azure.core.util.Context.NONE);
    }
}
