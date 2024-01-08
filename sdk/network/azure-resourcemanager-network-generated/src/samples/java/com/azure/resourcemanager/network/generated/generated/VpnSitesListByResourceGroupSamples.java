// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for VpnSites ListByResourceGroup.
 */
public final class VpnSitesListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/VpnSiteListByResourceGroup.
     * json
     */
    /**
     * Sample code: VpnSiteListByResourceGroup.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void vpnSiteListByResourceGroup(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.vpnSites().listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
