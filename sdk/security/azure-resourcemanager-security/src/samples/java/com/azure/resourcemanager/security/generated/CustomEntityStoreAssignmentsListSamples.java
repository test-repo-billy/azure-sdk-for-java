// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/**
 * Samples for CustomEntityStoreAssignments List.
 */
public final class CustomEntityStoreAssignmentsListSamples {
    /*
     * x-ms-original-file:
     * specification/security/resource-manager/Microsoft.Security/preview/2021-07-01-preview/examples/
     * CustomEntityStoreAssignments/customEntityStoreAssignmentListBySubscription_example.json
     */
    /**
     * Sample code: List custom entity store assignments in a subscription.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void
        listCustomEntityStoreAssignmentsInASubscription(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.customEntityStoreAssignments().list(com.azure.core.util.Context.NONE);
    }
}
