// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.resourcemanager.cosmos.generated.models.PhysicalPartitionId;
import com.azure.resourcemanager.cosmos.generated.models.RetrieveThroughputParameters;
import com.azure.resourcemanager.cosmos.generated.models.RetrieveThroughputPropertiesResource;
import java.util.Arrays;

/**
 * Samples for SqlResources SqlContainerRetrieveThroughputDistribution.
 */
public final class SqlResourcesSqlContainerRetrieveThroughputDistributionSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2024-01-15-preview/examples/
     * CosmosDBSqlContainerRetrieveThroughputDistribution.json
     */
    /**
     * Sample code: CosmosDBSqlContainerRetrieveThroughputDistribution.
     * 
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBSqlContainerRetrieveThroughputDistribution(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.sqlResources().sqlContainerRetrieveThroughputDistribution("rg1", "ddb1", "databaseName",
            "containerName",
            new RetrieveThroughputParameters()
                .withResource(new RetrieveThroughputPropertiesResource().withPhysicalPartitionIds(
                    Arrays.asList(new PhysicalPartitionId().withId("0"), new PhysicalPartitionId().withId("1")))),
            com.azure.core.util.Context.NONE);
    }
}
