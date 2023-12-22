// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

/**
 * Samples for Snapshots RevokeAccess.
 */
public final class SnapshotsRevokeAccessSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-04-02/examples/snapshotExamples/
     * Snapshot_EndGetAccess.json
     */
    /**
     * Sample code: Revoke access to a snapshot.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void revokeAccessToASnapshot(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.snapshots().revokeAccess("myResourceGroup", "mySnapshot", com.azure.core.util.Context.NONE);
    }
}
