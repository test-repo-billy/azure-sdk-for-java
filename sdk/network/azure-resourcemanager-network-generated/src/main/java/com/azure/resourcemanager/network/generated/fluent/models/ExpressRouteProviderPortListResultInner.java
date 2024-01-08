// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Response for ListExpressRouteProviderPort API service call.
 */
@Fluent
public final class ExpressRouteProviderPortListResultInner {
    /*
     * A list of ExpressRouteProviderPort resources.
     */
    @JsonProperty(value = "value")
    private List<ExpressRouteProviderPortInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of ExpressRouteProviderPortListResultInner class.
     */
    public ExpressRouteProviderPortListResultInner() {
    }

    /**
     * Get the value property: A list of ExpressRouteProviderPort resources.
     * 
     * @return the value value.
     */
    public List<ExpressRouteProviderPortInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of ExpressRouteProviderPort resources.
     * 
     * @param value the value value to set.
     * @return the ExpressRouteProviderPortListResultInner object itself.
     */
    public ExpressRouteProviderPortListResultInner withValue(List<ExpressRouteProviderPortInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
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
