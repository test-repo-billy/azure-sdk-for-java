// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

/**
 * Samples for ServerCommunicationLinks Get.
 */
public final class ServerCommunicationLinksGetSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/stable/2014-04-01/examples/ServerCommunicationLinkGet.json
     */
    /**
     * Sample code: Get a server communication link.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void getAServerCommunicationLink(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.serverCommunicationLinks().getWithResponse("sqlcrudtest-7398", "sqlcrudtest-4645", "link1",
            com.azure.core.util.Context.NONE);
    }
}
