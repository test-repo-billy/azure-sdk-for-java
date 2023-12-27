// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMInstanceRequiredIDs;
import java.util.Arrays;

/**
 * Samples for VirtualMachineScaleSets DeleteInstances.
 */
public final class VirtualMachineScaleSetsDeleteInstancesSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-09-01/examples/
     * virtualMachineScaleSetExamples/VirtualMachineScaleSet_DeleteInstances_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSet_DeleteInstances_MaximumSet_Gen.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineScaleSetDeleteInstancesMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachineScaleSets().deleteInstances("rgcompute", "aaaaaaaaaaaaaaaaaaaa",
            new VirtualMachineScaleSetVMInstanceRequiredIDs()
                .withInstanceIds(Arrays.asList("aaaaaaaaaaaaaaaaaaaaaaaaa")),
            true, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-09-01/examples/
     * virtualMachineScaleSetExamples/VirtualMachineScaleSet_DeleteInstances_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSet_DeleteInstances_MinimumSet_Gen.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineScaleSetDeleteInstancesMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachineScaleSets().deleteInstances("rgcompute", "aaaaaaaaaaaaaaa",
            new VirtualMachineScaleSetVMInstanceRequiredIDs()
                .withInstanceIds(Arrays.asList("aaaaaaaaaaaaaaaaaaaaaaaaa")),
            null, com.azure.core.util.Context.NONE);
    }
}
