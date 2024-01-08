// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteLinkInner;
import com.azure.resourcemanager.network.generated.models.ExpressRouteLinkAdminState;
import com.azure.resourcemanager.network.generated.models.ExpressRoutePortsBillingType;
import com.azure.resourcemanager.network.generated.models.ExpressRoutePortsEncapsulation;
import java.util.Arrays;

/**
 * Samples for ExpressRoutePorts CreateOrUpdate.
 */
public final class ExpressRoutePortsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/ExpressRoutePortUpdateLink.
     * json
     */
    /**
     * Sample code: ExpressRoutePortUpdateLink.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void expressRoutePortUpdateLink(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.expressRoutePorts().define("portName").withRegion("westus").withExistingResourceGroup("rg1")
            .withPeeringLocation("peeringLocationName").withBandwidthInGbps(100)
            .withEncapsulation(ExpressRoutePortsEncapsulation.QINQ)
            .withLinks(Arrays.asList(
                new ExpressRouteLinkInner().withName("link1").withAdminState(ExpressRouteLinkAdminState.ENABLED)))
            .withBillingType(ExpressRoutePortsBillingType.UNLIMITED_DATA).create();
    }

    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/ExpressRoutePortCreate.json
     */
    /**
     * Sample code: ExpressRoutePortCreate.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void expressRoutePortCreate(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.expressRoutePorts().define("portName").withRegion("westus").withExistingResourceGroup("rg1")
            .withPeeringLocation("peeringLocationName").withBandwidthInGbps(100)
            .withEncapsulation(ExpressRoutePortsEncapsulation.QINQ)
            .withBillingType(ExpressRoutePortsBillingType.UNLIMITED_DATA).create();
    }
}
