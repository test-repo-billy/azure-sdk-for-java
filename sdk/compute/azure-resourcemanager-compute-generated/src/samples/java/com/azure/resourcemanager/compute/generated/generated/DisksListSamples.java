// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

/**
 * Samples for Disks List.
 */
public final class DisksListSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_ListBySubscription.json
     */
    /**
     * Sample code: List all managed disks in a subscription.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        listAllManagedDisksInASubscription(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().list(com.azure.core.util.Context.NONE);
    }
}
