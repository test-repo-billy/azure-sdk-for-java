// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.resourcemanager.cosmos.generated.models.MongoCluster;
import com.azure.resourcemanager.cosmos.generated.models.NodeGroupSpec;
import com.azure.resourcemanager.cosmos.generated.models.NodeKind;
import java.util.Arrays;

/**
 * Samples for MongoClusters Update.
 */
public final class MongoClustersUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2024-01-15-preview/examples/mongo-cluster/
     * CosmosDBMongoClusterAddNode.json
     */
    /**
     * Sample code: Add new shard nodes.
     * 
     * @param manager Entry point to CosmosDBManager.
     */
    public static void addNewShardNodes(com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        MongoCluster resource = manager.mongoClusters()
            .getByResourceGroupWithResponse("TestResourceGroup", "myMongoCluster", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withNodeGroupSpecs(Arrays.asList(new NodeGroupSpec().withKind(NodeKind.SHARD).withNodeCount(4))).apply();
    }

    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2024-01-15-preview/examples/mongo-cluster/
     * CosmosDBMongoClusterUpdate.json
     */
    /**
     * Sample code: Update the mongo cluster.
     * 
     * @param manager Entry point to CosmosDBManager.
     */
    public static void updateTheMongoCluster(com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        MongoCluster resource = manager.mongoClusters()
            .getByResourceGroupWithResponse("TestResourceGroup", "myMongoCluster", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withAdministratorLogin("mongoAdmin").withAdministratorLoginPassword("password")
            .withServerVersion("5.0").withNodeGroupSpecs(Arrays.asList(new NodeGroupSpec().withSku("M50")
                .withDiskSizeGB(256L).withEnableHa(true).withKind(NodeKind.SHARD).withNodeCount(4)))
            .apply();
    }
}
