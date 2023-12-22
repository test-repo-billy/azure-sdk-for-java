// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.resourcemanager.network.generated.models.Direction;
import com.azure.resourcemanager.network.generated.models.NetworkConfigurationDiagnosticParameters;
import com.azure.resourcemanager.network.generated.models.NetworkConfigurationDiagnosticProfile;
import java.util.Arrays;

/**
 * Samples for NetworkWatchers GetNetworkConfigurationDiagnostic.
 */
public final class NetworkWatchersGetNetworkConfigurationDiagnosticSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * NetworkWatcherNetworkConfigurationDiagnostic.json
     */
    /**
     * Sample code: Network configuration diagnostic.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void
        networkConfigurationDiagnostic(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.networkWatchers().getNetworkConfigurationDiagnostic("rg1", "nw1",
            new NetworkConfigurationDiagnosticParameters()
                .withTargetResourceId(
                    "/subscriptions/subid/resourceGroups/rg2/providers/Microsoft.Compute/virtualMachines/vm1")
                .withProfiles(Arrays.asList(
                    new NetworkConfigurationDiagnosticProfile().withDirection(Direction.INBOUND).withProtocol("TCP")
                        .withSource("10.1.0.4").withDestination("12.11.12.14").withDestinationPort("12100"))),
            com.azure.core.util.Context.NONE);
    }
}
