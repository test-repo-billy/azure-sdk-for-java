// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

/**
 * Samples for SubscriptionUsages ListByLocation.
 */
public final class SubscriptionUsagesListByLocationSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/
     * SubscriptionUsageListByLocation.json
     */
    /**
     * Sample code: List subscription usages in the given location.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void
        listSubscriptionUsagesInTheGivenLocation(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.subscriptionUsages().listByLocation("WestUS", com.azure.core.util.Context.NONE);
    }
}
