// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.generated;

/**
 * Samples for KeyValues Get.
 */
public final class KeyValuesGetSamples {
    /*
     * x-ms-original-file:
     * specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/preview/2023-08-01-preview/examples/
     * ConfigurationStoresGetKeyValue.json
     */
    /**
     * Sample code: KeyValues_Get.
     * 
     * @param manager Entry point to AppConfigurationManager.
     */
    public static void keyValuesGet(com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager) {
        manager.keyValues().getWithResponse("myResourceGroup", "contoso", "myKey$myLabel",
            com.azure.core.util.Context.NONE);
    }
}
