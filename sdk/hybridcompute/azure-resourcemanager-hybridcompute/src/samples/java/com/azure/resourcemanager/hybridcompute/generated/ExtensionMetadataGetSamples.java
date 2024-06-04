// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

/**
 * Samples for ExtensionMetadata Get.
 */
public final class ExtensionMetadataGetSamples {
    /*
     * x-ms-original-file: specification/hybridcompute/resource-manager/Microsoft.HybridCompute/preview/2024-03-31-preview/examples/extension/ExtensionMetadata_Get.json
     */
    /**
     * Sample code: GET an extensions metadata.
     * 
     * @param manager Entry point to HybridComputeManager.
     */
    public static void gETAnExtensionsMetadata(com.azure.resourcemanager.hybridcompute.HybridComputeManager manager) {
        manager.extensionMetadatas()
            .getWithResponse("EastUS", "microsoft.azure.monitor", "azuremonitorlinuxagent", "1.9.1",
                com.azure.core.util.Context.NONE);
    }
}
