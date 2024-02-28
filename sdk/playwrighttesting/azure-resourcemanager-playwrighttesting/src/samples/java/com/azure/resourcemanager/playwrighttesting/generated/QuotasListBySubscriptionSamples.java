// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.playwrighttesting.generated;

/**
 * Samples for Quotas ListBySubscription.
 */
public final class QuotasListBySubscriptionSamples {
    /*
     * x-ms-original-file:
     * specification/playwrighttesting/resource-manager/Microsoft.AzurePlaywrightService/preview/2023-10-01-preview/
     * examples/Quotas_ListBySubscription.json
     */
    /**
     * Sample code: Quotas_ListBySubscription.
     * 
     * @param manager Entry point to PlaywrightTestingManager.
     */
    public static void
        quotasListBySubscription(com.azure.resourcemanager.playwrighttesting.PlaywrightTestingManager manager) {
        manager.quotas().listBySubscription("eastus", com.azure.core.util.Context.NONE);
    }
}
