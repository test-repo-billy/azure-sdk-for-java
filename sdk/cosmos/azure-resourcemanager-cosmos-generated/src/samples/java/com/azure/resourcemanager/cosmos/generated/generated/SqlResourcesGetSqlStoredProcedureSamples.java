// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

/**
 * Samples for SqlResources GetSqlStoredProcedure.
 */
public final class SqlResourcesGetSqlStoredProcedureSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2024-01-15-preview/examples/
     * CosmosDBSqlStoredProcedureGet.json
     */
    /**
     * Sample code: CosmosDBSqlStoredProcedureGet.
     * 
     * @param manager Entry point to CosmosDBManager.
     */
    public static void
        cosmosDBSqlStoredProcedureGet(com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.sqlResources().getSqlStoredProcedureWithResponse("rgName", "ddb1", "databaseName", "containerName",
            "storedProcedureName", com.azure.core.util.Context.NONE);
    }
}
