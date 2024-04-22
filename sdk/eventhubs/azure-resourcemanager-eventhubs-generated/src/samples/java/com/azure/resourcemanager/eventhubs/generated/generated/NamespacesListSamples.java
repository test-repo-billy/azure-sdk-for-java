// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.generated;

/**
 * Samples for Namespaces List.
 */
public final class NamespacesListSamples {
    /*
     * x-ms-original-file: specification/eventhub/resource-manager/Microsoft.EventHub/preview/2024-05-01-preview/examples/NameSpaces/EHNameSpaceList.json
     */
    /**
     * Sample code: NamespacesListBySubscription.
     * 
     * @param manager Entry point to EventHubsManager.
     */
    public static void
        namespacesListBySubscription(com.azure.resourcemanager.eventhubs.generated.EventHubsManager manager) {
        manager.namespaces().list(com.azure.core.util.Context.NONE);
    }
}
