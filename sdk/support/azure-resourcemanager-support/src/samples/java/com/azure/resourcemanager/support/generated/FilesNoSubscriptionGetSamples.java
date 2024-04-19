// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

/**
 * Samples for FilesNoSubscription Get.
 */
public final class FilesNoSubscriptionGetSamples {
    /*
     * x-ms-original-file:
     * specification/support/resource-manager/Microsoft.Support/preview/2023-06-01-preview/examples/GetFileDetails.json
     */
    /**
     * Sample code: Get details of a subscription file.
     * 
     * @param manager Entry point to SupportManager.
     */
    public static void getDetailsOfASubscriptionFile(com.azure.resourcemanager.support.SupportManager manager) {
        manager.filesNoSubscriptions().getWithResponse("testworkspace", "test.txt", com.azure.core.util.Context.NONE);
    }
}
