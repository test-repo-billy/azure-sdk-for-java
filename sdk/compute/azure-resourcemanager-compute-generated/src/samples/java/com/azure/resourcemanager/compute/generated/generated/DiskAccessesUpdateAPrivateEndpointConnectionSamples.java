// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.resourcemanager.compute.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.compute.generated.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.compute.generated.models.PrivateLinkServiceConnectionState;

/**
 * Samples for DiskAccesses UpdateAPrivateEndpointConnection.
 */
public final class DiskAccessesUpdateAPrivateEndpointConnectionSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-04-02/examples/diskAccessExamples/
     * DiskAccessPrivateEndpointConnection_Approve.json
     */
    /**
     * Sample code: Approve a Private Endpoint Connection under a disk access resource.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void approveAPrivateEndpointConnectionUnderADiskAccessResource(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.diskAccesses().updateAPrivateEndpointConnection("myResourceGroup", "myDiskAccess",
            "myPrivateEndpointConnection",
            new PrivateEndpointConnectionInner().withPrivateLinkServiceConnectionState(
                new PrivateLinkServiceConnectionState().withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                    .withDescription("Approving myPrivateEndpointConnection")),
            com.azure.core.util.Context.NONE);
    }
}
