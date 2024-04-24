// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

/**
 * Samples for VirtualMachines ListByResourceGroup.
 */
public final class VirtualMachinesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/virtualMachineExamples/VirtualMachine_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachine_List_MaximumSet_Gen.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        virtualMachineListMaximumSetGen(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines()
            .listByResourceGroup("rgcompute", "aaaaaaaaaaaaaaaaaaaaaaa", null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/virtualMachineExamples/VirtualMachine_List_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachine_List_MinimumSet_Gen.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        virtualMachineListMinimumSetGen(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().listByResourceGroup("rgcompute", null, null, com.azure.core.util.Context.NONE);
    }
}
