// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The expression traces.
 */
@Fluent
public final class ExpressionTraces {
    /*
     * Anything
     */
    @JsonProperty(value = "value")
    private Object value;

    /*
     * The inputs property.
     */
    @JsonProperty(value = "inputs")
    private List<ExpressionRoot> inputs;

    /*
     * The link used to get the next page of recommendations.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of ExpressionTraces class.
     */
    public ExpressionTraces() {
    }

    /**
     * Get the value property: Anything.
     * 
     * @return the value value.
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set the value property: Anything.
     * 
     * @param value the value value to set.
     * @return the ExpressionTraces object itself.
     */
    public ExpressionTraces withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Get the inputs property: The inputs property.
     * 
     * @return the inputs value.
     */
    public List<ExpressionRoot> inputs() {
        return this.inputs;
    }

    /**
     * Set the inputs property: The inputs property.
     * 
     * @param inputs the inputs value to set.
     * @return the ExpressionTraces object itself.
     */
    public ExpressionTraces withInputs(List<ExpressionRoot> inputs) {
        this.inputs = inputs;
        return this;
    }

    /**
     * Get the nextLink property: The link used to get the next page of recommendations.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of recommendations.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ExpressionTraces object itself.
     */
    public ExpressionTraces withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (inputs() != null) {
            inputs().forEach(e -> e.validate());
        }
    }
}
