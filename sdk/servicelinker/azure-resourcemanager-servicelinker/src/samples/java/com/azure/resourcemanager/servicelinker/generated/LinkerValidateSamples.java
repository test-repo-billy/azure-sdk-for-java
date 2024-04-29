// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.generated;

/**
 * Samples for Linker Validate.
 */
public final class LinkerValidateSamples {
    /*
     * x-ms-original-file: specification/servicelinker/resource-manager/Microsoft.ServiceLinker/preview/2023-04-01-preview/examples/ValidateLinkerSuccess.json
     */
    /**
     * Sample code: ValidateLinkerSuccess.
     * 
     * @param manager Entry point to ServiceLinkerManager.
     */
    public static void validateLinkerSuccess(com.azure.resourcemanager.servicelinker.ServiceLinkerManager manager) {
        manager.linkers()
            .validate(
                "subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/test-rg/providers/Microsoft.Web/sites/test-app",
                "linkName", com.azure.core.util.Context.NONE);
    }
}
