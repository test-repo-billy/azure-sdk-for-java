// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for PrivateDnsZoneGroups List.
 */
public final class PrivateDnsZoneGroupsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * PrivateEndpointDnsZoneGroupList.json
     */
    /**
     * Sample code: List private endpoints in resource group.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void
        listPrivateEndpointsInResourceGroup(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.privateDnsZoneGroups().list("testPe", "rg1", com.azure.core.util.Context.NONE);
    }
}
