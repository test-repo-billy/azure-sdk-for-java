// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for AzureFirewalls ListLearnedPrefixes.
 */
public final class AzureFirewallsListLearnedPrefixesSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * AzureFirewallListLearnedIPPrefixes.json
     */
    /**
     * Sample code: AzureFirewallListLearnedPrefixes.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void
        azureFirewallListLearnedPrefixes(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.azureFirewalls().listLearnedPrefixes("rg1", "azureFirewall1", com.azure.core.util.Context.NONE);
    }
}
