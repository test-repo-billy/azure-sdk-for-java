// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PacketCaptureListResult model. */
@Fluent
public final class PacketCaptureListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PacketCaptureListResultInner.class);

    /*
     * Information about packet capture sessions.
     */
    @JsonProperty(value = "value")
    private List<PacketCaptureResultInner> value;

    /**
     * Get the value property: Information about packet capture sessions.
     *
     * @return the value value.
     */
    public List<PacketCaptureResultInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Information about packet capture sessions.
     *
     * @param value the value value to set.
     * @return the PacketCaptureListResultInner object itself.
     */
    public PacketCaptureListResultInner withValue(List<PacketCaptureResultInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
