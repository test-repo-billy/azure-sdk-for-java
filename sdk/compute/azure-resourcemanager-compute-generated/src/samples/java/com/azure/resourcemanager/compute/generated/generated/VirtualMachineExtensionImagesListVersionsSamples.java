// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

/**
 * Samples for VirtualMachineExtensionImages ListVersions.
 */
public final class VirtualMachineExtensionImagesListVersionsSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/virtualMachineExtensionImageExamples/VirtualMachineExtensionImage_ListVersions_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineExtensionImage_ListVersions_MinimumSet_Gen.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineExtensionImageListVersionsMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachineExtensionImages()
            .listVersionsWithResponse("aaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaa", null, null, null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/virtualMachineExtensionImageExamples/VirtualMachineExtensionImage_ListVersions_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineExtensionImage_ListVersions_MaximumSet_Gen.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineExtensionImageListVersionsMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachineExtensionImages()
            .listVersionsWithResponse("aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaa",
                "aaaaaaaaaaaaaaaaaaaaaaaaa", 22, "a", com.azure.core.util.Context.NONE);
    }
}
