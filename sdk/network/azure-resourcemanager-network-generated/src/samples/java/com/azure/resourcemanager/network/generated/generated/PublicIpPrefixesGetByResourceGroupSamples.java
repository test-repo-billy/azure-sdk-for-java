// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for PublicIpPrefixes GetByResourceGroup.
 */
public final class PublicIpPrefixesGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/PublicIpPrefixGet.json
     */
    /**
     * Sample code: Get public IP prefix.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void getPublicIPPrefix(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.publicIpPrefixes().getByResourceGroupWithResponse("rg1", "test-ipprefix", null,
            com.azure.core.util.Context.NONE);
    }
}
