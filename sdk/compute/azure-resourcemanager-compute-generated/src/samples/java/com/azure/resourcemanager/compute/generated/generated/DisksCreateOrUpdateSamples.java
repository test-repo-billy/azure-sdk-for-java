// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.resourcemanager.compute.generated.models.CreationData;
import com.azure.resourcemanager.compute.generated.models.DataAccessAuthMode;
import com.azure.resourcemanager.compute.generated.models.DiskCreateOption;
import com.azure.resourcemanager.compute.generated.models.DiskSecurityProfile;
import com.azure.resourcemanager.compute.generated.models.DiskSecurityTypes;
import com.azure.resourcemanager.compute.generated.models.DiskSku;
import com.azure.resourcemanager.compute.generated.models.DiskStorageAccountTypes;
import com.azure.resourcemanager.compute.generated.models.Encryption;
import com.azure.resourcemanager.compute.generated.models.EncryptionType;
import com.azure.resourcemanager.compute.generated.models.ExtendedLocation;
import com.azure.resourcemanager.compute.generated.models.ExtendedLocationTypes;
import com.azure.resourcemanager.compute.generated.models.ImageDiskReference;
import com.azure.resourcemanager.compute.generated.models.NetworkAccessPolicy;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemTypes;

/**
 * Samples for Disks CreateOrUpdate.
 */
public final class DisksCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Create_FromImportSecure.json
     */
    /**
     * Sample code: Create a managed disk from ImportSecure create option.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void createAManagedDiskFromImportSecureCreateOption(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().define("myDisk").withRegion("West US").withExistingResourceGroup("myResourceGroup")
            .withOsType(OperatingSystemTypes.WINDOWS)
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.IMPORT_SECURE).withStorageAccountId(
                "subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Storage/storageAccounts/myStorageAccount")
                .withSourceUri("https://mystorageaccount.blob.core.windows.net/osimages/osimage.vhd")
                .withSecurityDataUri("https://mystorageaccount.blob.core.windows.net/osimages/vmgs.vhd"))
            .withSecurityProfile(new DiskSecurityProfile()
                .withSecurityType(DiskSecurityTypes.CONFIDENTIAL_VM_VMGUEST_STATE_ONLY_ENCRYPTED_WITH_PLATFORM_KEY))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Create_WithDiskEncryptionSet.json
     */
    /**
     * Sample code: Create a managed disk and associate with disk encryption set.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void createAManagedDiskAndAssociateWithDiskEncryptionSet(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().define("myDisk").withRegion("West US").withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.EMPTY)).withDiskSizeGB(200)
            .withEncryption(new Encryption().withDiskEncryptionSetId(
                "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSets/{existing-diskEncryptionSet-name}"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Create_FromAnExistingManagedDisk.json
     */
    /**
     * Sample code: Create a managed disk from an existing managed disk in the same or different subscription.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void createAManagedDiskFromAnExistingManagedDiskInTheSameOrDifferentSubscription(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().define("myDisk2").withRegion("West US").withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.COPY).withSourceResourceId(
                "subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/disks/myDisk1"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Create_WithLogicalSectorSize.json
     */
    /**
     * Sample code: Create an ultra managed disk with logicalSectorSize 512E.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void createAnUltraManagedDiskWithLogicalSectorSize512E(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().define("myDisk").withRegion("West US").withExistingResourceGroup("myResourceGroup")
            .withSku(new DiskSku().withName(DiskStorageAccountTypes.ULTRA_SSD_LRS))
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.EMPTY).withLogicalSectorSize(512))
            .withDiskSizeGB(200).create();
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Create_Empty.json
     */
    /**
     * Sample code: Create an empty managed disk.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void createAnEmptyManagedDisk(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().define("myDisk").withRegion("West US").withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.EMPTY)).withDiskSizeGB(200).create();
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Create_WithOptimizedForFrequentAttach.json
     */
    /**
     * Sample code: Create a managed disk with optimizedForFrequentAttach.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void createAManagedDiskWithOptimizedForFrequentAttach(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().define("myDisk").withRegion("West US").withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.EMPTY)).withDiskSizeGB(200)
            .withOptimizedForFrequentAttach(true).create();
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Create_ByCopyingASnapshot.json
     */
    /**
     * Sample code: Create a managed disk by copying a snapshot.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        createAManagedDiskByCopyingASnapshot(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().define("myDisk").withRegion("West US").withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.COPY).withSourceResourceId(
                "subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/snapshots/mySnapshot"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Create_WithUltraSSD_ReadOnly.json
     */
    /**
     * Sample code: Create a managed disk with ultra account type with readOnly property set.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void createAManagedDiskWithUltraAccountTypeWithReadOnlyPropertySet(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().define("myUltraReadOnlyDisk").withRegion("West US").withExistingResourceGroup("myResourceGroup")
            .withSku(new DiskSku().withName(DiskStorageAccountTypes.ULTRA_SSD_LRS))
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.EMPTY).withLogicalSectorSize(4096))
            .withDiskSizeGB(200).withDiskIopsReadWrite(125L).withDiskMBpsReadWrite(3000L)
            .withEncryption(new Encryption().withType(EncryptionType.ENCRYPTION_AT_REST_WITH_PLATFORM_KEY)).create();
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Create_InExtendedLocation.json
     */
    /**
     * Sample code: Create an empty managed disk in extended location.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        createAnEmptyManagedDiskInExtendedLocation(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().define("myDisk").withRegion("West US").withExistingResourceGroup("myResourceGroup")
            .withExtendedLocation(
                new ExtendedLocation().withName("{edge-zone-id}").withType(ExtendedLocationTypes.EDGE_ZONE))
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.EMPTY)).withDiskSizeGB(200).create();
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Create_FromAnAzureComputeGalleryCommunityImage.json
     */
    /**
     * Sample code: Create a managed disk from an Azure Compute Gallery community image.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void createAManagedDiskFromAnAzureComputeGalleryCommunityImage(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().define("myDisk").withRegion("West US").withExistingResourceGroup("myResourceGroup")
            .withOsType(OperatingSystemTypes.WINDOWS)
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.FROM_IMAGE)
                .withGalleryImageReference(new ImageDiskReference().withCommunityGalleryImageId(
                    "/CommunityGalleries/{communityGalleryPublicGalleryName}/Images/{imageName}/Versions/1.0.0")))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Create_UploadDisk.json
     */
    /**
     * Sample code: Create a managed upload disk.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void createAManagedUploadDisk(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().define("myDisk").withRegion("West US").withExistingResourceGroup("myResourceGroup")
            .withCreationData(
                new CreationData().withCreateOption(DiskCreateOption.UPLOAD).withUploadSizeBytes(10737418752L))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Create_WithDataAccessAuthMode.json
     */
    /**
     * Sample code: Create a managed disk with dataAccessAuthMode.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        createAManagedDiskWithDataAccessAuthMode(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().define("myDisk").withRegion("West US").withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.EMPTY)).withDiskSizeGB(200)
            .withDataAccessAuthMode(DataAccessAuthMode.AZURE_ACTIVE_DIRECTORY).create();
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Create_FromAnElasticSanVolumeSnapshot.json
     */
    /**
     * Sample code: Create a managed disk from elastic san volume snapshot.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void createAManagedDiskFromElasticSanVolumeSnapshot(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().define("myDisk").withRegion("West US").withExistingResourceGroup("myResourceGroup")
            .withCreationData(
                new CreationData().withCreateOption(DiskCreateOption.COPY_FROM_SAN_SNAPSHOT).withElasticSanResourceId(
                    "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.ElasticSan/elasticSans/myElasticSan/volumegroups/myElasticSanVolumeGroup/snapshots/myElasticSanVolumeSnapshot"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Create_ByImportingBlobFromADifferentSubscription.json
     */
    /**
     * Sample code: Create a managed disk by importing an unmanaged blob from a different subscription.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void createAManagedDiskByImportingAnUnmanagedBlobFromADifferentSubscription(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().define("myDisk").withRegion("West US").withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.IMPORT).withStorageAccountId(
                "subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Storage/storageAccounts/myStorageAccount")
                .withSourceUri("https://mystorageaccount.blob.core.windows.net/osimages/osimage.vhd"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Create_WithDiskAccess.json
     */
    /**
     * Sample code: Create a managed disk and associate with disk access resource.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void createAManagedDiskAndAssociateWithDiskAccessResource(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().define("myDisk").withRegion("West US").withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.EMPTY)).withDiskSizeGB(200)
            .withNetworkAccessPolicy(NetworkAccessPolicy.ALLOW_PRIVATE)
            .withDiskAccessId(
                "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskAccesses/{existing-diskAccess-name}")
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Create_PerformancePlus.json
     */
    /**
     * Sample code: Create a managed disk with performancePlus.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        createAManagedDiskWithPerformancePlus(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().define("myDisk").withRegion("West US").withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.UPLOAD).withPerformancePlus(true))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Create_WithPremiumV2_LRSAccountType.json
     */
    /**
     * Sample code: Create a managed disk with premium v2 account type.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        createAManagedDiskWithPremiumV2AccountType(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().define("myPremiumV2Disk").withRegion("West US").withExistingResourceGroup("myResourceGroup")
            .withSku(new DiskSku().withName(DiskStorageAccountTypes.PREMIUM_V2_LRS))
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.EMPTY)).withDiskSizeGB(200)
            .withDiskIopsReadWrite(125L).withDiskMBpsReadWrite(3000L).create();
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Create_WithSecurityProfile.json
     */
    /**
     * Sample code: Create a managed disk with security profile.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        createAManagedDiskWithSecurityProfile(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().define("myDisk").withRegion("North Central US").withExistingResourceGroup("myResourceGroup")
            .withOsType(OperatingSystemTypes.WINDOWS)
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.FROM_IMAGE)
                .withImageReference(new ImageDiskReference().withId(
                    "/Subscriptions/{subscriptionId}/Providers/Microsoft.Compute/Locations/uswest/Publishers/Microsoft/ArtifactTypes/VMImage/Offers/{offer}")))
            .withSecurityProfile(new DiskSecurityProfile().withSecurityType(DiskSecurityTypes.TRUSTED_LAUNCH)).create();
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Create_FromAPlatformImage.json
     */
    /**
     * Sample code: Create a managed disk from a platform image.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        createAManagedDiskFromAPlatformImage(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().define("myDisk").withRegion("West US").withExistingResourceGroup("myResourceGroup")
            .withOsType(OperatingSystemTypes.WINDOWS)
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.FROM_IMAGE)
                .withImageReference(new ImageDiskReference().withId(
                    "/Subscriptions/{subscriptionId}/Providers/Microsoft.Compute/Locations/westus/Publishers/{publisher}/ArtifactTypes/VMImage/Offers/{offer}/Skus/{sku}/Versions/1.0.0")))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Create_FromAnAzureComputeGalleryDirectSharedImage.json
     */
    /**
     * Sample code: Create a managed disk from an Azure Compute Gallery direct shared image.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void createAManagedDiskFromAnAzureComputeGalleryDirectSharedImage(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().define("myDisk").withRegion("West US").withExistingResourceGroup("myResourceGroup")
            .withOsType(OperatingSystemTypes.WINDOWS)
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.FROM_IMAGE)
                .withGalleryImageReference(new ImageDiskReference().withSharedGalleryImageId(
                    "/SharedGalleries/{sharedGalleryUniqueName}/Images/{imageName}/Versions/1.0.0")))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Create_ByImportingBlobFromTheSameSubscription.json
     */
    /**
     * Sample code: Create a managed disk by importing an unmanaged blob from the same subscription.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void createAManagedDiskByImportingAnUnmanagedBlobFromTheSameSubscription(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().define("myDisk").withRegion("West US").withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.IMPORT)
                .withSourceUri("https://mystorageaccount.blob.core.windows.net/osimages/osimage.vhd"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Create_FromUploadPreparedSecure.json
     */
    /**
     * Sample code: Create a managed disk from UploadPreparedSecure create option.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void createAManagedDiskFromUploadPreparedSecureCreateOption(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().define("myDisk").withRegion("West US").withExistingResourceGroup("myResourceGroup")
            .withOsType(OperatingSystemTypes.WINDOWS)
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.UPLOAD_PREPARED_SECURE)
                .withUploadSizeBytes(10737418752L))
            .withSecurityProfile(new DiskSecurityProfile().withSecurityType(DiskSecurityTypes.TRUSTED_LAUNCH)).create();
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Create_ConfidentialVMSupportedDiskEncryptedWithCMK.json
     */
    /**
     * Sample code: Create a confidential VM supported disk encrypted with customer managed key.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void createAConfidentialVMSupportedDiskEncryptedWithCustomerManagedKey(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().define("myDisk").withRegion("West US").withExistingResourceGroup("myResourceGroup")
            .withOsType(OperatingSystemTypes.WINDOWS)
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.FROM_IMAGE)
                .withImageReference(new ImageDiskReference().withId(
                    "/Subscriptions/{subscriptionId}/Providers/Microsoft.Compute/Locations/westus/Publishers/{publisher}/ArtifactTypes/VMImage/Offers/{offer}/Skus/{sku}/Versions/1.0.0")))
            .withSecurityProfile(new DiskSecurityProfile()
                .withSecurityType(DiskSecurityTypes.CONFIDENTIAL_VM_DISK_ENCRYPTED_WITH_CUSTOMER_KEY)
                .withSecureVMDiskEncryptionSetId(
                    "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSets/{diskEncryptionSetName}"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Create_WithSSDZRSAccountType.json
     */
    /**
     * Sample code: Create a managed disk with ssd zrs account type.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        createAManagedDiskWithSsdZrsAccountType(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().define("myDisk").withRegion("West US").withExistingResourceGroup("myResourceGroup")
            .withSku(new DiskSku().withName(DiskStorageAccountTypes.PREMIUM_ZRS))
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.EMPTY)).withDiskSizeGB(200).create();
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Create_FromAnAzureComputeGalleryImage.json
     */
    /**
     * Sample code: Create a managed disk from an Azure Compute Gallery image.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void createAManagedDiskFromAnAzureComputeGalleryImage(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.disks().define("myDisk").withRegion("West US").withExistingResourceGroup("myResourceGroup")
            .withOsType(OperatingSystemTypes.WINDOWS)
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.FROM_IMAGE)
                .withGalleryImageReference(new ImageDiskReference().withId(
                    "/Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Providers/Microsoft.Compute/Galleries/{galleryName}/Images/{imageName}/Versions/1.0.0")))
            .create();
    }
}
