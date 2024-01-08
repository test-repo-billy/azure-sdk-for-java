// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/OperationList.json
     */
    /**
     * Sample code: Get a list of operations for a resource provider.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void
        getAListOfOperationsForAResourceProvider(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
