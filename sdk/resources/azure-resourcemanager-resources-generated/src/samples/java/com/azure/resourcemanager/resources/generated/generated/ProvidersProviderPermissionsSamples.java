// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.generated;

/**
 * Samples for Providers ProviderPermissions.
 */
public final class ProvidersProviderPermissionsSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2023-07-01/examples/GetProviderPermissions.
     * json
     */
    /**
     * Sample code: Get provider resource types.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void getProviderResourceTypes(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.providers().providerPermissionsWithResponse("Microsoft.TestRP", com.azure.core.util.Context.NONE);
    }
}
