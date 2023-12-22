// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for AvailableServiceAliases List.
 */
public final class AvailableServiceAliasesListSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/AvailableServiceAliasesList.
     * json
     */
    /**
     * Sample code: Get available service aliases.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void getAvailableServiceAliases(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.availableServiceAliases().list("westcentralus", com.azure.core.util.Context.NONE);
    }
}
