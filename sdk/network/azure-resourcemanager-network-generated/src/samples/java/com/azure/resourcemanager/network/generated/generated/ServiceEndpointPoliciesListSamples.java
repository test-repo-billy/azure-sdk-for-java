// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for ServiceEndpointPolicies List.
 */
public final class ServiceEndpointPoliciesListSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/ServiceEndpointPolicyListAll.
     * json
     */
    /**
     * Sample code: List all service endpoint policy.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void
        listAllServiceEndpointPolicy(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.serviceEndpointPolicies().list(com.azure.core.util.Context.NONE);
    }
}
