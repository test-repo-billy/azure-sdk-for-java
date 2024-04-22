// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

/**
 * Samples for ContainerAppsAuthConfigs Delete.
 */
public final class ContainerAppsAuthConfigsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/app/resource-manager/Microsoft.App/preview/2023-11-02-preview/examples/AuthConfigs_Delete.json
     */
    /**
     * Sample code: Delete Container App AuthConfig.
     * 
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void
        deleteContainerAppAuthConfig(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.containerAppsAuthConfigs().deleteWithResponse("workerapps-rg-xj", "testcanadacentral", "current",
            com.azure.core.util.Context.NONE);
    }
}
