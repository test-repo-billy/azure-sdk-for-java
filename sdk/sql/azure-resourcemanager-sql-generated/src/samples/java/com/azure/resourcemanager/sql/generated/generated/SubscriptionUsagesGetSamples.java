// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

/**
 * Samples for SubscriptionUsages Get.
 */
public final class SubscriptionUsagesGetSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/SubscriptionUsageGet.json
     */
    /**
     * Sample code: Get specific subscription usage in the given location.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void
        getSpecificSubscriptionUsageInTheGivenLocation(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.subscriptionUsages().getWithResponse("WestUS", "ServerQuota", com.azure.core.util.Context.NONE);
    }
}
