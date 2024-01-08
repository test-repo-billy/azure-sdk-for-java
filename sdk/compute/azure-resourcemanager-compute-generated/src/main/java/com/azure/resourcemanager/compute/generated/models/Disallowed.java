// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Describes the disallowed disk types.
 */
@Fluent
public final class Disallowed {
    /*
     * A list of disk types.
     */
    @JsonProperty(value = "diskTypes")
    private List<String> diskTypes;

    /**
     * Creates an instance of Disallowed class.
     */
    public Disallowed() {
    }

    /**
     * Get the diskTypes property: A list of disk types.
     * 
     * @return the diskTypes value.
     */
    public List<String> diskTypes() {
        return this.diskTypes;
    }

    /**
     * Set the diskTypes property: A list of disk types.
     * 
     * @param diskTypes the diskTypes value to set.
     * @return the Disallowed object itself.
     */
    public Disallowed withDiskTypes(List<String> diskTypes) {
        this.diskTypes = diskTypes;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
