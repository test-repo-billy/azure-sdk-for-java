// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appconfiguration.fluent.models.ReplicaInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The result of a request to list replicas.
 */
@Fluent
public final class ReplicaListResult {
    /*
     * The collection value.
     */
    @JsonProperty(value = "value")
    private List<ReplicaInner> value;

    /*
     * The URI that can be used to request the next set of paged results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of ReplicaListResult class.
     */
    public ReplicaListResult() {
    }

    /**
     * Get the value property: The collection value.
     * 
     * @return the value value.
     */
    public List<ReplicaInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The collection value.
     * 
     * @param value the value value to set.
     * @return the ReplicaListResult object itself.
     */
    public ReplicaListResult withValue(List<ReplicaInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI that can be used to request the next set of paged results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI that can be used to request the next set of paged results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ReplicaListResult object itself.
     */
    public ReplicaListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
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
