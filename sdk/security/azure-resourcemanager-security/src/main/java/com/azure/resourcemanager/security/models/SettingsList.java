// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.security.fluent.models.SettingInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Subscription settings list.
 */
@Fluent
public final class SettingsList {
    /*
     * The settings list.
     */
    @JsonProperty(value = "value")
    private List<SettingInner> value;

    /*
     * The URI to fetch the next page.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of SettingsList class.
     */
    public SettingsList() {
    }

    /**
     * Get the value property: The settings list.
     * 
     * @return the value value.
     */
    public List<SettingInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The settings list.
     * 
     * @param value the value value to set.
     * @return the SettingsList object itself.
     */
    public SettingsList withValue(List<SettingInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page.
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
