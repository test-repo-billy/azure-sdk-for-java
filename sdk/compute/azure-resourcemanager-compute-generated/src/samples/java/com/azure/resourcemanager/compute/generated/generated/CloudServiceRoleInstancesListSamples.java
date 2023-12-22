// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

/**
 * Samples for CloudServiceRoleInstances List.
 */
public final class CloudServiceRoleInstancesListSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/CloudserviceRP/stable/2022-09-04/examples/
     * CloudServiceRolesInstance_List.json
     */
    /**
     * Sample code: List Role Instances in a Cloud Service.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        listRoleInstancesInACloudService(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.cloudServiceRoleInstances().list("ConstosoRG", "{cs-name}", null, com.azure.core.util.Context.NONE);
    }
}
