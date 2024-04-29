// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.models.DiskAccessInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The List disk access operation response.
 */
@Fluent
public final class DiskAccessList {
    /*
     * A list of disk access resources.
     */
    @JsonProperty(value = "value", required = true)
    private List<DiskAccessInner> value;

    /*
     * The uri to fetch the next page of disk access resources. Call ListNext() with this to fetch the next page of disk access resources.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of DiskAccessList class.
     */
    public DiskAccessList() {
    }

    /**
     * Get the value property: A list of disk access resources.
     * 
     * @return the value value.
     */
    public List<DiskAccessInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of disk access resources.
     * 
     * @param value the value value to set.
     * @return the DiskAccessList object itself.
     */
    public DiskAccessList withValue(List<DiskAccessInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of disk access resources. Call ListNext() with this to
     * fetch the next page of disk access resources.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of disk access resources. Call ListNext() with this to
     * fetch the next page of disk access resources.
     * 
     * @param nextLink the nextLink value to set.
     * @return the DiskAccessList object itself.
     */
    public DiskAccessList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property value in model DiskAccessList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DiskAccessList.class);
}
