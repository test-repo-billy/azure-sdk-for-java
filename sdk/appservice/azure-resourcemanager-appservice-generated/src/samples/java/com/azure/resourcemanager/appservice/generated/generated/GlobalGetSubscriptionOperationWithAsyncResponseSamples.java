// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

/**
 * Samples for Global GetSubscriptionOperationWithAsyncResponse.
 */
public final class GlobalGetSubscriptionOperationWithAsyncResponseSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/GetSubscriptionOperationWithAsyncResponse.json
     */
    /**
     * Sample code: Gets an operation in a subscription and given region.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void getsAnOperationInASubscriptionAndGivenRegion(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.globals()
            .getSubscriptionOperationWithAsyncResponseWithResponse("West US", "34adfa4f-cedf-4dc0-ba29-b6d1a69ab5d5",
                com.azure.core.util.Context.NONE);
    }
}
