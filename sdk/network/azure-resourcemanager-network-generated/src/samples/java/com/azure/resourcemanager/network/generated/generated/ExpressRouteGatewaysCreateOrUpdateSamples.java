// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.resourcemanager.network.generated.models.ExpressRouteGatewayPropertiesAutoScaleConfiguration;
import com.azure.resourcemanager.network.generated.models.ExpressRouteGatewayPropertiesAutoScaleConfigurationBounds;
import com.azure.resourcemanager.network.generated.models.VirtualHubId;

/**
 * Samples for ExpressRouteGateways CreateOrUpdate.
 */
public final class ExpressRouteGatewaysCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/ExpressRouteGatewayCreate.
     * json
     */
    /**
     * Sample code: ExpressRouteGatewayCreate.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void expressRouteGatewayCreate(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.expressRouteGateways().define("gateway-2").withRegion("westus")
            .withExistingResourceGroup("resourceGroupName")
            .withAutoScaleConfiguration(new ExpressRouteGatewayPropertiesAutoScaleConfiguration()
                .withBounds(new ExpressRouteGatewayPropertiesAutoScaleConfigurationBounds().withMin(3)))
            .withVirtualHub(new VirtualHubId().withId(
                "/subscriptions/subid/resourceGroups/resourceGroupId/providers/Microsoft.Network/virtualHubs/virtualHubName"))
            .withAllowNonVirtualWanTraffic(false).create();
    }
}
