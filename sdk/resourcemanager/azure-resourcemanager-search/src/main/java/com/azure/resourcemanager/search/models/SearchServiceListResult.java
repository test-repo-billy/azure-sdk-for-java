// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.search.fluent.models.SearchServiceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response containing a list of Azure Cognitive Search services. */
@Immutable
public final class SearchServiceListResult {
    /*
     * The list of search services.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<SearchServiceInner> value;

    /*
     * Request URL that can be used to query next page of search services.
     * Returned when the total number of requested search services exceed
     * maximum page size.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: The list of search services.
     *
     * @return the value value.
     */
    public List<SearchServiceInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: Request URL that can be used to query next page of search services. Returned when the
     * total number of requested search services exceed maximum page size.
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
