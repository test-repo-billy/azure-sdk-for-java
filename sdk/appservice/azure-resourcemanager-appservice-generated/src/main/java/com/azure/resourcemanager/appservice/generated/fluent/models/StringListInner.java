// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * String list resource.
 */
@Fluent
public final class StringListInner extends ProxyOnlyResource {
    /*
     * List of string resources.
     */
    @JsonProperty(value = "properties")
    private List<String> properties;

    /**
     * Creates an instance of StringListInner class.
     */
    public StringListInner() {
    }

    /**
     * Get the properties property: List of string resources.
     * 
     * @return the properties value.
     */
    public List<String> properties() {
        return this.properties;
    }

    /**
     * Set the properties property: List of string resources.
     * 
     * @param properties the properties value to set.
     * @return the StringListInner object itself.
     */
    public StringListInner withProperties(List<String> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StringListInner withKind(String kind) {
        super.withKind(kind);
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
