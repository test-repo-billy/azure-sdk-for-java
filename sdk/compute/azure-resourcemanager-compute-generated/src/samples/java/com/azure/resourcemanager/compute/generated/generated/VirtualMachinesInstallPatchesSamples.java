// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.resourcemanager.compute.generated.models.VirtualMachineInstallPatchesParameters;
import com.azure.resourcemanager.compute.generated.models.VMGuestPatchClassificationWindows;
import com.azure.resourcemanager.compute.generated.models.VMGuestPatchRebootSetting;
import com.azure.resourcemanager.compute.generated.models.WindowsParameters;
import java.time.OffsetDateTime;
import java.util.Arrays;

/**
 * Samples for VirtualMachines InstallPatches.
 */
public final class VirtualMachinesInstallPatchesSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/virtualMachineExamples/VirtualMachine_InstallPatches.json
     */
    /**
     * Sample code: Install patch state of a virtual machine.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        installPatchStateOfAVirtualMachine(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.virtualMachines()
            .installPatches("myResourceGroupName", "myVMName",
                new VirtualMachineInstallPatchesParameters().withMaximumDuration("PT4H")
                    .withRebootSetting(VMGuestPatchRebootSetting.IF_REQUIRED)
                    .withWindowsParameters(new WindowsParameters()
                        .withClassificationsToInclude(Arrays.asList(VMGuestPatchClassificationWindows.CRITICAL,
                            VMGuestPatchClassificationWindows.SECURITY))
                        .withMaxPatchPublishDate(OffsetDateTime.parse("2020-11-19T02:36:43.0539904+00:00"))),
                com.azure.core.util.Context.NONE);
    }
}
