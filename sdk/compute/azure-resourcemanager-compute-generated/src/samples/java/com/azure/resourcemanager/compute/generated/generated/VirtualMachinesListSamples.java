// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

/**
 * Samples for VirtualMachines List.
 */
public final class VirtualMachinesListSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-09-01/examples/
     * virtualMachineExamples/VirtualMachine_ListAll_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachine_ListAll_MinimumSet_Gen.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        virtualMachineListAllMinimumSetGen(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().list(null, null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-09-01/examples/
     * virtualMachineExamples/VirtualMachine_ListAll_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachine_ListAll_MaximumSet_Gen.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        virtualMachineListAllMaximumSetGen(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines().list("aaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", null,
            com.azure.core.util.Context.NONE);
    }
}
