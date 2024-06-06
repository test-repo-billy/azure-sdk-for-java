// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The resource management error additional info. */
@Immutable
public final class ErrorAdditionalInfo {
    /*
     * The additional info type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The additional info.
     */
    @JsonProperty(value = "info", access = JsonProperty.Access.WRITE_ONLY)
    private Object info;

    /** Creates an instance of ErrorAdditionalInfo class. */
    public ErrorAdditionalInfo() {}

    /**
     * Get the type property: The additional info type.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Get the info property: The additional info.
     *
     * @return the info value.
     */
    public Object getInfo() {
        return this.info;
    }
}
