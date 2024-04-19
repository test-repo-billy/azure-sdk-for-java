// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/**
 * Samples for AzureDevOpsOrgs Get.
 */
public final class AzureDevOpsOrgsGetSamples {
    /*
     * x-ms-original-file:
     * specification/security/resource-manager/Microsoft.Security/preview/2023-09-01-preview/examples/
     * SecurityConnectorsDevOps/GetAzureDevOpsOrgs_example.json
     */
    /**
     * Sample code: Get_AzureDevOpsOrgs.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void getAzureDevOpsOrgs(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.azureDevOpsOrgs().getWithResponse("myRg", "mySecurityConnectorName", "myAzDevOpsOrg",
            com.azure.core.util.Context.NONE);
    }
}
