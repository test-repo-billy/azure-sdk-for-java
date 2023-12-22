// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.generated;

/**
 * Samples for Linker Get.
 */
public final class LinkerGetSamples {
    /*
     * x-ms-original-file:
     * specification/servicelinker/resource-manager/Microsoft.ServiceLinker/preview/2023-11-01-preview/examples/Linker.
     * json
     */
    /**
     * Sample code: Linker.
     * 
     * @param manager Entry point to ServiceLinkerManager.
     */
    public static void linker(com.azure.resourcemanager.servicelinker.ServiceLinkerManager manager) {
        manager.linkers().getWithResponse(
            "subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/test-rg/providers/Microsoft.Web/sites/test-app",
            "linkName", com.azure.core.util.Context.NONE);
    }
}
