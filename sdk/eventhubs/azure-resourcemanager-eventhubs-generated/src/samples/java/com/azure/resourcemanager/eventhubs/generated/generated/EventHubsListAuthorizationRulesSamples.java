// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.generated;

/**
 * Samples for EventHubs ListAuthorizationRules.
 */
public final class EventHubsListAuthorizationRulesSamples {
    /*
     * x-ms-original-file: specification/eventhub/resource-manager/Microsoft.EventHub/preview/2024-05-01-preview/examples/EventHubs/EHEventHubAuthorizationRuleListAll.json
     */
    /**
     * Sample code: EventHubAuthorizationRuleListAll.
     * 
     * @param manager Entry point to EventHubsManager.
     */
    public static void
        eventHubAuthorizationRuleListAll(com.azure.resourcemanager.eventhubs.generated.EventHubsManager manager) {
        manager.eventHubs()
            .listAuthorizationRules("ArunMonocle", "sdk-Namespace-960", "sdk-EventHub-532",
                com.azure.core.util.Context.NONE);
    }
}
