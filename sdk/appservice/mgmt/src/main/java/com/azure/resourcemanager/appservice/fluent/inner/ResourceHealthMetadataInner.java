// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResourceHealthMetadata model. */
@JsonFlatten
@Fluent
public class ResourceHealthMetadataInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceHealthMetadataInner.class);

    /*
     * The category that the resource matches in the RHC Policy File
     */
    @JsonProperty(value = "properties.category")
    private String category;

    /*
     * Is there a health signal for the resource
     */
    @JsonProperty(value = "properties.signalAvailability")
    private Boolean signalAvailability;

    /**
     * Get the category property: The category that the resource matches in the RHC Policy File.
     *
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category property: The category that the resource matches in the RHC Policy File.
     *
     * @param category the category value to set.
     * @return the ResourceHealthMetadataInner object itself.
     */
    public ResourceHealthMetadataInner withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the signalAvailability property: Is there a health signal for the resource.
     *
     * @return the signalAvailability value.
     */
    public Boolean signalAvailability() {
        return this.signalAvailability;
    }

    /**
     * Set the signalAvailability property: Is there a health signal for the resource.
     *
     * @param signalAvailability the signalAvailability value to set.
     * @return the ResourceHealthMetadataInner object itself.
     */
    public ResourceHealthMetadataInner withSignalAvailability(Boolean signalAvailability) {
        this.signalAvailability = signalAvailability;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
