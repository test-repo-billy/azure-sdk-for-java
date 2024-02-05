// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The response to a live token query.
 */
@Immutable
public final class LiveTokenResponseInner {
    /*
     * JWT token for accessing live metrics stream data.
     */
    @JsonProperty(value = "liveToken", access = JsonProperty.Access.WRITE_ONLY)
    private String liveToken;

    /**
     * Creates an instance of LiveTokenResponseInner class.
     */
    public LiveTokenResponseInner() {
    }

    /**
     * Get the liveToken property: JWT token for accessing live metrics stream data.
     * 
     * @return the liveToken value.
     */
    public String liveToken() {
        return this.liveToken;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
