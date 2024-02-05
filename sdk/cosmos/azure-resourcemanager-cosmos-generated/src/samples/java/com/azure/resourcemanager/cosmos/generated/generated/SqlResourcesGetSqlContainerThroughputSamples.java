// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

/**
 * Samples for SqlResources GetSqlContainerThroughput.
 */
public final class SqlResourcesGetSqlContainerThroughputSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2024-01-15-preview/examples/
     * CosmosDBSqlContainerThroughputGet.json
     */
    /**
     * Sample code: CosmosDBSqlContainerThroughputGet.
     * 
     * @param manager Entry point to CosmosDBManager.
     */
    public static void
        cosmosDBSqlContainerThroughputGet(com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.sqlResources().getSqlContainerThroughputWithResponse("rg1", "ddb1", "databaseName", "containerName",
            com.azure.core.util.Context.NONE);
    }
}
