// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.generated;

/**
 * Samples for ApplicationGroup ListByNamespace.
 */
public final class ApplicationGroupListByNamespaceSamples {
    /*
     * x-ms-original-file: specification/eventhub/resource-manager/Microsoft.EventHub/preview/2024-05-01-preview/examples/ApplicationGroup/ApplicationGroupListByNamespace.json
     */
    /**
     * Sample code: ListApplicationGroups.
     * 
     * @param manager Entry point to EventHubsManager.
     */
    public static void listApplicationGroups(com.azure.resourcemanager.eventhubs.generated.EventHubsManager manager) {
        manager.applicationGroups()
            .listByNamespace("contosotest", "contoso-ua-test-eh-system-1", com.azure.core.util.Context.NONE);
    }
}
