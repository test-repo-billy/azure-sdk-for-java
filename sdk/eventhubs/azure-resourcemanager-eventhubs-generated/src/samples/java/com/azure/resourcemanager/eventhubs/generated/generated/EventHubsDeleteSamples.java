// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.generated;

/**
 * Samples for EventHubs Delete.
 */
public final class EventHubsDeleteSamples {
    /*
     * x-ms-original-file: specification/eventhub/resource-manager/Microsoft.EventHub/preview/2024-05-01-preview/examples/EventHubs/EHEventHubDelete.json
     */
    /**
     * Sample code: EventHubDelete.
     * 
     * @param manager Entry point to EventHubsManager.
     */
    public static void eventHubDelete(com.azure.resourcemanager.eventhubs.generated.EventHubsManager manager) {
        manager.eventHubs()
            .deleteWithResponse("ArunMonocle", "sdk-Namespace-5357", "sdk-EventHub-6547",
                com.azure.core.util.Context.NONE);
    }
}
