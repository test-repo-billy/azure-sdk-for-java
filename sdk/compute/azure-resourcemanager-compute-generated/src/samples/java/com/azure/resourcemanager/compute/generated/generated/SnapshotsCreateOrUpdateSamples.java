// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.resourcemanager.compute.generated.models.CreationData;
import com.azure.resourcemanager.compute.generated.models.DiskCreateOption;
import com.azure.resourcemanager.compute.generated.models.ProvisionedBandwidthCopyOption;

/**
 * Samples for Snapshots CreateOrUpdate.
 */
public final class SnapshotsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/snapshotExamples/Snapshot_Create_FromAnExistingSnapshot.json
     */
    /**
     * Sample code: Create a snapshot from an existing snapshot in the same or a different subscription.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void createASnapshotFromAnExistingSnapshotInTheSameOrADifferentSubscription(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.snapshots()
            .define("mySnapshot2")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.COPY)
                .withSourceResourceId(
                    "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/snapshots/mySnapshot1"))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/snapshotExamples/Snapshot_Create_FromAnElasticSanVolumeSnapshot.json
     */
    /**
     * Sample code: Create a snapshot from an elastic san volume snapshot.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void createASnapshotFromAnElasticSanVolumeSnapshot(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.snapshots()
            .define("mySnapshot")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.COPY_FROM_SAN_SNAPSHOT)
                .withElasticSanResourceId(
                    "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.ElasticSan/elasticSans/myElasticSan/volumegroups/myElasticSanVolumeGroup/snapshots/myElasticSanVolumeSnapshot"))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/snapshotExamples/Snapshot_Create_EnhancedProvisionedBandwidthCopySpeed.json
     */
    /**
     * Sample code: Create a snapshot from an existing snapshot in the same or a different subscription in a different
     * region with quicker copy speed.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        createASnapshotFromAnExistingSnapshotInTheSameOrADifferentSubscriptionInADifferentRegionWithQuickerCopySpeed(
            com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.snapshots()
            .define("mySnapshot2")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.COPY_START)
                .withSourceResourceId(
                    "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/snapshots/mySnapshot1")
                .withProvisionedBandwidthCopySpeed(ProvisionedBandwidthCopyOption.ENHANCED))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/snapshotExamples/Snapshot_Create_FromAnExistingSnapshotInDifferentRegion.json
     */
    /**
     * Sample code: Create a snapshot from an existing snapshot in the same or a different subscription in a different
     * region.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void createASnapshotFromAnExistingSnapshotInTheSameOrADifferentSubscriptionInADifferentRegion(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.snapshots()
            .define("mySnapshot2")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.COPY_START)
                .withSourceResourceId(
                    "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/snapshots/mySnapshot1"))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/snapshotExamples/Snapshot_Create_ByImportingAnUnmanagedBlobFromTheSameSubscription.json
     */
    /**
     * Sample code: Create a snapshot by importing an unmanaged blob from the same subscription.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void createASnapshotByImportingAnUnmanagedBlobFromTheSameSubscription(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.snapshots()
            .define("mySnapshot1")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.IMPORT)
                .withSourceUri("https://mystorageaccount.blob.core.windows.net/osimages/osimage.vhd"))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/snapshotExamples/Snapshot_Create_ByImportingAnUnmanagedBlobFromADifferentSubscription.json
     */
    /**
     * Sample code: Create a snapshot by importing an unmanaged blob from a different subscription.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void createASnapshotByImportingAnUnmanagedBlobFromADifferentSubscription(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.snapshots()
            .define("mySnapshot1")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.IMPORT)
                .withStorageAccountId(
                    "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Storage/storageAccounts/myStorageAccount")
                .withSourceUri("https://mystorageaccount.blob.core.windows.net/osimages/osimage.vhd"))
            .create();
    }
}
