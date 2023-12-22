// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

/**
 * Samples for VirtualMachineExtensionImages Get.
 */
public final class VirtualMachineExtensionImagesGetSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-09-01/examples/
     * virtualMachineExtensionImageExamples/VirtualMachineExtensionImage_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineExtensionImage_Get_MinimumSet_Gen.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineExtensionImageGetMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachineExtensionImages().getWithResponse("aaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aa",
            "aaa", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-09-01/examples/
     * virtualMachineExtensionImageExamples/VirtualMachineExtensionImage_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineExtensionImage_Get_MaximumSet_Gen.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineExtensionImageGetMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachineExtensionImages().getWithResponse("aaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa",
            "aaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaa", com.azure.core.util.Context.NONE);
    }
}
