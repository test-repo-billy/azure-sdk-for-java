// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for WebApplicationFirewallPolicies Delete.
 */
public final class WebApplicationFirewallPoliciesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/WafPolicyDelete.json
     */
    /**
     * Sample code: Deletes a WAF policy within a resource group.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void
        deletesAWAFPolicyWithinAResourceGroup(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.webApplicationFirewallPolicies().delete("rg1", "Policy1", com.azure.core.util.Context.NONE);
    }
}
