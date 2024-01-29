// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMInstanceIDs;
import java.util.Arrays;

/**
 * Samples for VirtualMachineScaleSets Redeploy.
 */
public final class VirtualMachineScaleSetsRedeploySamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-09-01/examples/
     * virtualMachineScaleSetExamples/VirtualMachineScaleSet_Redeploy_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSet_Redeploy_MinimumSet_Gen.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineScaleSetRedeployMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachineScaleSets().redeploy("rgcompute", "aaaaaaaaaaaaaaaaaaaaaa", null,
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-09-01/examples/
     * virtualMachineScaleSetExamples/VirtualMachineScaleSet_Redeploy_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSet_Redeploy_MaximumSet_Gen.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void virtualMachineScaleSetRedeployMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachineScaleSets().redeploy("rgcompute", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
            new VirtualMachineScaleSetVMInstanceIDs().withInstanceIds(Arrays.asList("aaaaaaaaaaaaaaaaa")),
            com.azure.core.util.Context.NONE);
    }
}
