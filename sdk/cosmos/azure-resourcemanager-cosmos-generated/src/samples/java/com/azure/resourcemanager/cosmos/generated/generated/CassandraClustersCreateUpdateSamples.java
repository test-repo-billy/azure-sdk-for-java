// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.resourcemanager.cosmos.generated.models.AuthenticationMethod;
import com.azure.resourcemanager.cosmos.generated.models.Certificate;
import com.azure.resourcemanager.cosmos.generated.models.ClusterResourceProperties;
import com.azure.resourcemanager.cosmos.generated.models.SeedNode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for CassandraClusters CreateUpdate.
 */
public final class CassandraClustersCreateUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2024-01-15-preview/examples/
     * CosmosDBManagedCassandraClusterCreate.json
     */
    /**
     * Sample code: CosmosDBManagedCassandraClusterCreate.
     * 
     * @param manager Entry point to CosmosDBManager.
     */
    public static void
        cosmosDBManagedCassandraClusterCreate(com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.cassandraClusters().define("cassandra-prod").withRegion("West US")
            .withExistingResourceGroup("cassandra-prod-rg").withTags(mapOf())
            .withProperties(new ClusterResourceProperties().withDelegatedManagementSubnetId(
                "/subscriptions/536e130b-d7d6-4ac7-98a5-de20d69588d2/resourceGroups/customer-vnet-rg/providers/Microsoft.Network/virtualNetworks/customer-vnet/subnets/management")
                .withCassandraVersion("3.11").withClusterNameOverride("ClusterNameIllegalForAzureResource")
                .withAuthenticationMethod(AuthenticationMethod.CASSANDRA)
                .withInitialCassandraAdminPassword("fakeTokenPlaceholder")
                .withClientCertificates(Arrays.asList(new Certificate().withPem(
                    "-----BEGIN CERTIFICATE-----\n...Base64 encoded certificate...\n-----END CERTIFICATE-----")))
                .withExternalGossipCertificates(Arrays.asList(new Certificate().withPem(
                    "-----BEGIN CERTIFICATE-----\n...Base64 encoded certificate...\n-----END CERTIFICATE-----")))
                .withExternalSeedNodes(Arrays.asList(new SeedNode().withIpAddress("10.52.221.2"),
                    new SeedNode().withIpAddress("10.52.221.3"), new SeedNode().withIpAddress("10.52.221.4")))
                .withHoursBetweenBackups(24))
            .create();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
