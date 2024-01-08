// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for ExpressRouteGateways ListByResourceGroup.
 */
public final class ExpressRouteGatewaysListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * ExpressRouteGatewayListByResourceGroup.json
     */
    /**
     * Sample code: ExpressRouteGatewayListByResourceGroup.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void
        expressRouteGatewayListByResourceGroup(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.expressRouteGateways().listByResourceGroupWithResponse("resourceGroupName",
            com.azure.core.util.Context.NONE);
    }
}
