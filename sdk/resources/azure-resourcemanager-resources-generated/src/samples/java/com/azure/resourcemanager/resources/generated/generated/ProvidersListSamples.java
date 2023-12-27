// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.generated;

/**
 * Samples for Providers List.
 */
public final class ProvidersListSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2023-07-01/examples/GetProviders.json
     */
    /**
     * Sample code: Get providers.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void getProviders(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.providers().list(null, com.azure.core.util.Context.NONE);
    }
}
