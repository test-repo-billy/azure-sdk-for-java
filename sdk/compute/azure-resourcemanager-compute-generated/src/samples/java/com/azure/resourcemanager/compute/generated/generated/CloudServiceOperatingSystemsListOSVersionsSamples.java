// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

/**
 * Samples for CloudServiceOperatingSystems ListOSVersions.
 */
public final class CloudServiceOperatingSystemsListOSVersionsSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/CloudserviceRP/stable/2022-09-04/examples/
     * CloudServiceOSVersion_List.json
     */
    /**
     * Sample code: List Cloud Service OS Versions in a subscription.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        listCloudServiceOSVersionsInASubscription(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.cloudServiceOperatingSystems().listOSVersions("westus2", com.azure.core.util.Context.NONE);
    }
}
