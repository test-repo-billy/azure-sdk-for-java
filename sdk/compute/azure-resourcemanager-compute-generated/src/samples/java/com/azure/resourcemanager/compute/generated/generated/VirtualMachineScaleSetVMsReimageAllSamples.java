// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

/**
 * Samples for VirtualMachineScaleSetVMs ReimageAll.
 */
public final class VirtualMachineScaleSetVMsReimageAllSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/virtualMachineScaleSetExamples/VirtualMachineScaleSetVM_ReimageAll_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSetVM_ReimageAll_MinimumSet_Gen.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineScaleSetVMReimageAllMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachineScaleSetVMs()
            .reimageAll("rgcompute", "aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/virtualMachineScaleSetExamples/VirtualMachineScaleSetVM_ReimageAll_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSetVM_ReimageAll_MaximumSet_Gen.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineScaleSetVMReimageAllMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachineScaleSetVMs()
            .reimageAll("rgcompute", "aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaa",
                com.azure.core.util.Context.NONE);
    }
}
