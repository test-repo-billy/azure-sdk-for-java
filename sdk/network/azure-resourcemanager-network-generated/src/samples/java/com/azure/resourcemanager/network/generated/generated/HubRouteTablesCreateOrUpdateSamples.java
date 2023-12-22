// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.resourcemanager.network.generated.models.HubRoute;
import java.util.Arrays;

/**
 * Samples for HubRouteTables CreateOrUpdate.
 */
public final class HubRouteTablesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/HubRouteTablePut.json
     */
    /**
     * Sample code: RouteTablePut.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void routeTablePut(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.hubRouteTables().define("hubRouteTable1").withExistingVirtualHub("rg1", "virtualHub1")
            .withRoutes(Arrays.asList(new HubRoute().withName("route1").withDestinationType("CIDR")
                .withDestinations(Arrays.asList("10.0.0.0/8", "20.0.0.0/8", "30.0.0.0/8")).withNextHopType("ResourceId")
                .withNextHop(
                    "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/azureFirewalls/azureFirewall1")))
            .withLabels(Arrays.asList("label1", "label2")).create();
    }
}
