// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

/**
 * Samples for DiskRestorePoint ListByRestorePoint.
 */
public final class DiskRestorePointListByRestorePointSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-04-02/examples/
     * diskRestorePointExamples/DiskRestorePoint_ListByVmRestorePoint.json
     */
    /**
     * Sample code: Get an incremental disk restorePoint resource.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        getAnIncrementalDiskRestorePointResource(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.diskRestorePoints().listByRestorePoint("myResourceGroup", "rpc", "vmrp",
            com.azure.core.util.Context.NONE);
    }
}
