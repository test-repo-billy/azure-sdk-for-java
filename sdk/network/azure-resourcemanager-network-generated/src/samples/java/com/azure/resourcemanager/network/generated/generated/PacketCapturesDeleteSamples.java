// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for PacketCaptures Delete.
 */
public final class PacketCapturesDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * NetworkWatcherPacketCaptureDelete.json
     */
    /**
     * Sample code: Delete packet capture.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void deletePacketCapture(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.packetCaptures().delete("rg1", "nw1", "pc1", com.azure.core.util.Context.NONE);
    }
}
