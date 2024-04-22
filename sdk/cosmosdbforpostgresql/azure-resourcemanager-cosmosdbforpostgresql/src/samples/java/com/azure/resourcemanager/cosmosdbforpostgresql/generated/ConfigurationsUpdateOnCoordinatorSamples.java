// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.generated;

import com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models.ServerConfigurationInner;

/**
 * Samples for Configurations UpdateOnCoordinator.
 */
public final class ConfigurationsUpdateOnCoordinatorSamples {
    /*
     * x-ms-original-file:
     * specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/preview/2023-03-02-preview/examples/
     * ConfigurationUpdateCoordinator.json
     */
    /**
     * Sample code: Update single configuration of coordinator.
     * 
     * @param manager Entry point to CosmosDBForPostgreSqlManager.
     */
    public static void updateSingleConfigurationOfCoordinator(
        com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager manager) {
        manager.configurations().updateOnCoordinator("TestResourceGroup", "testcluster", "array_nulls",
            new ServerConfigurationInner().withValue("on"), com.azure.core.util.Context.NONE);
    }
}
