// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.PacketCaptureQueryStatusResultInner;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * An immutable client-side representation of PacketCaptureQueryStatusResult.
 */
public interface PacketCaptureQueryStatusResult {
    /**
     * Gets the name property: The name of the packet capture resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the id property: The ID of the packet capture resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the captureStartTime property: The start time of the packet capture session.
     * 
     * @return the captureStartTime value.
     */
    OffsetDateTime captureStartTime();

    /**
     * Gets the packetCaptureStatus property: The status of the packet capture session.
     * 
     * @return the packetCaptureStatus value.
     */
    PcStatus packetCaptureStatus();

    /**
     * Gets the stopReason property: The reason the current packet capture session was stopped.
     * 
     * @return the stopReason value.
     */
    String stopReason();

    /**
     * Gets the packetCaptureError property: List of errors of packet capture session.
     * 
     * @return the packetCaptureError value.
     */
    List<PcError> packetCaptureError();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.PacketCaptureQueryStatusResultInner
     * object.
     * 
     * @return the inner object.
     */
    PacketCaptureQueryStatusResultInner innerModel();
}
