// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

/**
 * Samples for DiskAccesses GetAPrivateEndpointConnection.
 */
public final class DiskAccessesGetAPrivateEndpointConnectionSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-04-02/examples/diskAccessExamples/
     * DiskAccessPrivateEndpointConnection_Get.json
     */
    /**
     * Sample code: Get information about a private endpoint connection under a disk access resource.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void getInformationAboutAPrivateEndpointConnectionUnderADiskAccessResource(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.diskAccesses().getAPrivateEndpointConnectionWithResponse("myResourceGroup", "myDiskAccess",
            "myPrivateEndpointConnection", com.azure.core.util.Context.NONE);
    }
}
