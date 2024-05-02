// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.generated;

/**
 * Samples for PrivateEndpointConnections Get.
 */
public final class PrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/PrivateEndpointConnections_Get.json
     */
    /**
     * Sample code: PrivateEndpointConnections_Get.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void privateEndpointConnectionsGet(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.privateEndpointConnections()
            .getWithResponse("examples-rg", "examples-farmbeatsResourceName", "privateEndpointConnectionName",
                com.azure.core.util.Context.NONE);
    }
}
