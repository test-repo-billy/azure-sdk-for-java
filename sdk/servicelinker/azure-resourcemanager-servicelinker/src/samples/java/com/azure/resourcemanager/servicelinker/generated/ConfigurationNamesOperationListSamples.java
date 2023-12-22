// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.generated;

/**
 * Samples for ConfigurationNamesOperation List.
 */
public final class ConfigurationNamesOperationListSamples {
    /*
     * x-ms-original-file:
     * specification/servicelinker/resource-manager/Microsoft.ServiceLinker/preview/2023-11-01-preview/examples/
     * ConfigurationNamesList.json
     */
    /**
     * Sample code: GetConfigurationNames.
     * 
     * @param manager Entry point to ServiceLinkerManager.
     */
    public static void getConfigurationNames(com.azure.resourcemanager.servicelinker.ServiceLinkerManager manager) {
        manager.configurationNamesOperations().list(null, null, com.azure.core.util.Context.NONE);
    }
}
