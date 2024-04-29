// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

/**
 * Samples for CloudServiceRoleInstances GetRemoteDesktopFile.
 */
public final class CloudServiceRoleInstancesGetRemoteDesktopFileSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/CloudserviceRP/stable/2022-09-04/examples/CloudServiceRoleInstance_Get_RemoteDesktopFile.json
     */
    /**
     * Sample code: Get Cloud Service Role.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void getCloudServiceRole(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.cloudServiceRoleInstances()
            .getRemoteDesktopFileWithResponse("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "rgcloudService", "aaaa",
                com.azure.core.util.Context.NONE);
    }
}
