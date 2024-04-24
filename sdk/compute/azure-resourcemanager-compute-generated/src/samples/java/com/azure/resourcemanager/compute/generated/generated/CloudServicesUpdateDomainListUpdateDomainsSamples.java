// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

/**
 * Samples for CloudServicesUpdateDomain ListUpdateDomains.
 */
public final class CloudServicesUpdateDomainListUpdateDomainsSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/CloudserviceRP/stable/2022-09-04/examples/CloudServiceUpdateDomain_List.json
     */
    /**
     * Sample code: List Update Domains in Cloud Service.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        listUpdateDomainsInCloudService(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.cloudServicesUpdateDomains()
            .listUpdateDomains("ConstosoRG", "{cs-name}", com.azure.core.util.Context.NONE);
    }
}
