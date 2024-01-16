// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

/**
 * Samples for VirtualMachineScaleSetVMRunCommands Delete.
 */
public final class VirtualMachineScaleSetVMRunCommandsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-09-01/examples/runCommandExamples/
     * VirtualMachineScaleSetVMRunCommand_Delete.json
     */
    /**
     * Sample code: Delete VirtualMachineScaleSet VM run command.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        deleteVirtualMachineScaleSetVMRunCommand(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachineScaleSetVMRunCommands().delete("myResourceGroup", "myvmScaleSet", "0", "myRunCommand",
            com.azure.core.util.Context.NONE);
    }
}
