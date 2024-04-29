// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.generated;

/**
 * Samples for PrivateEndpointConnections Delete.
 */
public final class PrivateEndpointConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/PrivateEndpointConnections_Delete.json
     */
    /**
     * Sample code: PrivateEndpointConnections_Delete.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void privateEndpointConnectionsDelete(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.privateEndpointConnections()
            .delete("examples-rg", "examples-farmbeatsResourceName", "privateEndpointConnectionName",
                com.azure.core.util.Context.NONE);
    }
}
