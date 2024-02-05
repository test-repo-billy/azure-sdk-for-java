// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.resourcemanager.cosmos.generated.models.CreateUpdateOptions;
import com.azure.resourcemanager.cosmos.generated.models.SqlUserDefinedFunctionResource;

/**
 * Samples for SqlResources CreateUpdateSqlUserDefinedFunction.
 */
public final class SqlResourcesCreateUpdateSqlUserDefinedFunctionSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2024-01-15-preview/examples/
     * CosmosDBSqlUserDefinedFunctionCreateUpdate.json
     */
    /**
     * Sample code: CosmosDBSqlUserDefinedFunctionCreateUpdate.
     * 
     * @param manager Entry point to CosmosDBManager.
     */
    public static void
        cosmosDBSqlUserDefinedFunctionCreateUpdate(com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.sqlResources().defineUpdateSqlUserDefinedFunction("userDefinedFunctionName").withRegion((String) null)
            .withExistingContainer("rg1", "ddb1", "databaseName", "containerName")
            .withResource(new SqlUserDefinedFunctionResource().withId("userDefinedFunctionName").withBody("body"))
            .withOptions(new CreateUpdateOptions()).create();
    }
}
