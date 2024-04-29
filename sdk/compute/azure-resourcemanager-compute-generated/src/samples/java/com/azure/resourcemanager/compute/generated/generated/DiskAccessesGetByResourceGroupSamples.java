// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

/**
 * Samples for DiskAccesses GetByResourceGroup.
 */
public final class DiskAccessesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskAccessExamples/DiskAccess_Get.json
     */
    /**
     * Sample code: Get information about a disk access resource.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        getInformationAboutADiskAccessResource(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.diskAccesses()
            .getByResourceGroupWithResponse("myResourceGroup", "myDiskAccess", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskAccessExamples/DiskAccess_Get_WithPrivateEndpoints.json
     */
    /**
     * Sample code: Get information about a disk access resource with private endpoints.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void getInformationAboutADiskAccessResourceWithPrivateEndpoints(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.diskAccesses()
            .getByResourceGroupWithResponse("myResourceGroup", "myDiskAccess", com.azure.core.util.Context.NONE);
    }
}
