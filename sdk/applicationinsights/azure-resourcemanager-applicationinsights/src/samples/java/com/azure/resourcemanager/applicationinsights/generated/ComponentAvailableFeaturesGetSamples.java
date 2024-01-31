// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

/**
 * Samples for ComponentAvailableFeatures Get.
 */
public final class ComponentAvailableFeaturesGetSamples {
    /*
     * x-ms-original-file:
     * specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2015-05-01/examples/
     * AvailableBillingFeaturesGet.json
     */
    /**
     * Sample code: ComponentCurrentBillingFeaturesGet.
     * 
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void componentCurrentBillingFeaturesGet(
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager.componentAvailableFeatures().getWithResponse("my-resource-group", "my-component",
            com.azure.core.util.Context.NONE);
    }
}
