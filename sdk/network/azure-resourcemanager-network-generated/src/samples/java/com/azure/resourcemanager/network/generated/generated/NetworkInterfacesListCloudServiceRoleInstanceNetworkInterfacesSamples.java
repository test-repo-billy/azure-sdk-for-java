// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for NetworkInterfaces ListCloudServiceRoleInstanceNetworkInterfaces.
 */
public final class NetworkInterfacesListCloudServiceRoleInstanceNetworkInterfacesSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * CloudServiceRoleInstanceNetworkInterfaceList.json
     */
    /**
     * Sample code: List cloud service role instance network interfaces.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void listCloudServiceRoleInstanceNetworkInterfaces(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.networkInterfaces().listCloudServiceRoleInstanceNetworkInterfaces("rg1", "cs1", "TestVMRole_IN_0",
            com.azure.core.util.Context.NONE);
    }
}
