// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/**
 * Samples for Connectors List.
 */
public final class ConnectorsListSamples {
    /*
     * x-ms-original-file:
     * specification/security/resource-manager/Microsoft.Security/preview/2020-01-01-preview/examples/Connectors/
     * GetListConnectorSubscription_example.json
     */
    /**
     * Sample code: Get all cloud accounts connectors of a subscription.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void
        getAllCloudAccountsConnectorsOfASubscription(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.connectors().list(com.azure.core.util.Context.NONE);
    }
}
