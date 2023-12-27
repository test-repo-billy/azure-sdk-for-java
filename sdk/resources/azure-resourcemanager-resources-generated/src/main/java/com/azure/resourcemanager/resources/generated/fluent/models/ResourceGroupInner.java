// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.resources.generated.models.ResourceGroupProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Resource group information.
 */
@Fluent
public final class ResourceGroupInner extends Resource {
    /*
     * The resource group properties.
     */
    @JsonProperty(value = "properties")
    private ResourceGroupProperties properties;

    /*
     * The ID of the resource that manages this resource group.
     */
    @JsonProperty(value = "managedBy")
    private String managedBy;

    /**
     * Creates an instance of ResourceGroupInner class.
     */
    public ResourceGroupInner() {
    }

    /**
     * Get the properties property: The resource group properties.
     * 
     * @return the properties value.
     */
    public ResourceGroupProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The resource group properties.
     * 
     * @param properties the properties value to set.
     * @return the ResourceGroupInner object itself.
     */
    public ResourceGroupInner withProperties(ResourceGroupProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the managedBy property: The ID of the resource that manages this resource group.
     * 
     * @return the managedBy value.
     */
    public String managedBy() {
        return this.managedBy;
    }

    /**
     * Set the managedBy property: The ID of the resource that manages this resource group.
     * 
     * @param managedBy the managedBy value to set.
     * @return the ResourceGroupInner object itself.
     */
    public ResourceGroupInner withManagedBy(String managedBy) {
        this.managedBy = managedBy;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceGroupInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceGroupInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
