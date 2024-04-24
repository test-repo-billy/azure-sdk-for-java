// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.fluent.models.ProcessThreadInfoInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Collection of Kudu thread information elements.
 */
@Fluent
public final class ProcessThreadInfoCollection {
    /*
     * Collection of resources.
     */
    @JsonProperty(value = "value", required = true)
    private List<ProcessThreadInfoInner> value;

    /*
     * Link to next page of resources.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of ProcessThreadInfoCollection class.
     */
    public ProcessThreadInfoCollection() {
    }

    /**
     * Get the value property: Collection of resources.
     * 
     * @return the value value.
     */
    public List<ProcessThreadInfoInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of resources.
     * 
     * @param value the value value to set.
     * @return the ProcessThreadInfoCollection object itself.
     */
    public ProcessThreadInfoCollection withValue(List<ProcessThreadInfoInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to next page of resources.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property value in model ProcessThreadInfoCollection"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ProcessThreadInfoCollection.class);
}
