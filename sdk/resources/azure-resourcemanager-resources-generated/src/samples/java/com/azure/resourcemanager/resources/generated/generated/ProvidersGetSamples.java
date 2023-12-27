// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.generated;

/**
 * Samples for Providers Get.
 */
public final class ProvidersGetSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2023-07-01/examples/GetProvider.json
     */
    /**
     * Sample code: Get provider.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void getProvider(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.providers().getWithResponse("Microsoft.TestRP1", null, com.azure.core.util.Context.NONE);
    }
}
