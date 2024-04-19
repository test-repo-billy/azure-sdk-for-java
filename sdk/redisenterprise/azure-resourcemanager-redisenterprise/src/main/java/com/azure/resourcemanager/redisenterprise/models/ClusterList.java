// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.redisenterprise.fluent.models.ClusterInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The response of a list-all operation.
 */
@Fluent
public final class ClusterList {
    /*
     * List of clusters.
     */
    @JsonProperty(value = "value")
    private List<ClusterInner> value;

    /*
     * The URI to fetch the next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of ClusterList class.
     */
    public ClusterList() {
    }

    /**
     * Get the value property: List of clusters.
     * 
     * @return the value value.
     */
    public List<ClusterInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of clusters.
     * 
     * @param value the value value to set.
     * @return the ClusterList object itself.
     */
    public ClusterList withValue(List<ClusterInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of results.
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
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
