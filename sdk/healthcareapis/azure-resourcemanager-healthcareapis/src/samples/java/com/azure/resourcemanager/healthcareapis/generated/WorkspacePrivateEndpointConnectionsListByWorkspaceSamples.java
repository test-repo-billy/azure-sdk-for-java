// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

/**
 * Samples for WorkspacePrivateEndpointConnections ListByWorkspace.
 */
public final class WorkspacePrivateEndpointConnectionsListByWorkspaceSamples {
    /*
     * x-ms-original-file:
     * specification/healthcareapis/resource-manager/Microsoft.HealthcareApis/stable/2024-03-01/examples/privatelink/
     * WorkspaceListPrivateEndpointConnections.json
     */
    /**
     * Sample code: WorkspacePrivateEndpointConnection_List.
     * 
     * @param manager Entry point to HealthcareApisManager.
     */
    public static void
        workspacePrivateEndpointConnectionList(com.azure.resourcemanager.healthcareapis.HealthcareApisManager manager) {
        manager.workspacePrivateEndpointConnections().listByWorkspace("testRG", "workspace1",
            com.azure.core.util.Context.NONE);
    }
}
