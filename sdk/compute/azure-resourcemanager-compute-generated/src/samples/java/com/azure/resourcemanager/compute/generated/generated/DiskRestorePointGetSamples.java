// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

/**
 * Samples for DiskRestorePoint Get.
 */
public final class DiskRestorePointGetSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/
     * diskRestorePointExamples/DiskRestorePoint_Get_WhenSourceResourceIsFromDifferentRegion.json
     */
    /**
     * Sample code: Get an incremental disk restorePoint when source resource is from a different region.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void getAnIncrementalDiskRestorePointWhenSourceResourceIsFromADifferentRegion(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.diskRestorePoints().getWithResponse("myResourceGroup", "rpc", "vmrp",
            "TestDisk45ceb03433006d1baee0_b70cd924-3362-4a80-93c2-9415eaa12745", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/
     * diskRestorePointExamples/DiskRestorePoint_Get.json
     */
    /**
     * Sample code: Get an incremental disk restorePoint resource.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        getAnIncrementalDiskRestorePointResource(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.diskRestorePoints().getWithResponse("myResourceGroup", "rpc", "vmrp",
            "TestDisk45ceb03433006d1baee0_b70cd924-3362-4a80-93c2-9415eaa12745", com.azure.core.util.Context.NONE);
    }
}
