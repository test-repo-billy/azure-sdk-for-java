// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for SecurityAdminConfigurations Get.
 */
public final class SecurityAdminConfigurationsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * NetworkManagerSecurityAdminConfigurationGet.json
     */
    /**
     * Sample code: Get security admin configurations.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void
        getSecurityAdminConfigurations(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.securityAdminConfigurations().getWithResponse("rg1", "testNetworkManager", "myTestSecurityConfig",
            com.azure.core.util.Context.NONE);
    }
}
