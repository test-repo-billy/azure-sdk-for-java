// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.notificationhubs.models.PrivateEndpointConnectionProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a Private Endpoint Connection ARM resource - a sub-resource of Notification Hubs namespace.
 */
@Fluent
public final class PrivateEndpointConnectionResourceInner extends ProxyResource {
    /*
     * Private Endpoint Connection properties.
     */
    @JsonProperty(value = "properties")
    private PrivateEndpointConnectionProperties properties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of PrivateEndpointConnectionResourceInner class.
     */
    public PrivateEndpointConnectionResourceInner() {
    }

    /**
     * Get the properties property: Private Endpoint Connection properties.
     * 
     * @return the properties value.
     */
    public PrivateEndpointConnectionProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Private Endpoint Connection properties.
     * 
     * @param properties the properties value to set.
     * @return the PrivateEndpointConnectionResourceInner object itself.
     */
    public PrivateEndpointConnectionResourceInner withProperties(PrivateEndpointConnectionProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
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
