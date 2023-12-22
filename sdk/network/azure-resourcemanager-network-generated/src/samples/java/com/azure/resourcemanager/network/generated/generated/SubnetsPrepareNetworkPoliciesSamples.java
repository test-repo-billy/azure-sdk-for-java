// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.resourcemanager.network.generated.models.PrepareNetworkPoliciesRequest;

/**
 * Samples for Subnets PrepareNetworkPolicies.
 */
public final class SubnetsPrepareNetworkPoliciesSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/SubnetPrepareNetworkPolicies.
     * json
     */
    /**
     * Sample code: Prepare Network Policies.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void prepareNetworkPolicies(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.subnets().prepareNetworkPolicies("rg1", "test-vnet", "subnet1",
            new PrepareNetworkPoliciesRequest().withServiceName("Microsoft.Sql/managedInstances"),
            com.azure.core.util.Context.NONE);
    }
}
