// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Describes the list of all possible values for a specific filter value.
 */
@Fluent
public final class SignatureOverridesFilterValuesResponseInner {
    /*
     * Describes the possible values
     */
    @JsonProperty(value = "filterValues")
    private List<String> filterValues;

    /**
     * Creates an instance of SignatureOverridesFilterValuesResponseInner class.
     */
    public SignatureOverridesFilterValuesResponseInner() {
    }

    /**
     * Get the filterValues property: Describes the possible values.
     * 
     * @return the filterValues value.
     */
    public List<String> filterValues() {
        return this.filterValues;
    }

    /**
     * Set the filterValues property: Describes the possible values.
     * 
     * @param filterValues the filterValues value to set.
     * @return the SignatureOverridesFilterValuesResponseInner object itself.
     */
    public SignatureOverridesFilterValuesResponseInner withFilterValues(List<String> filterValues) {
        this.filterValues = filterValues;
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
