// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Model that represents a Capability resource.
 */
@Immutable
public final class CapabilityInner extends ProxyResource {
    /*
     * The standard system metadata of a resource type.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The properties of a capability resource.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private CapabilityProperties innerProperties;

    /**
     * Creates an instance of CapabilityInner class.
     */
    public CapabilityInner() {
    }

    /**
     * Get the systemData property: The standard system metadata of a resource type.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the innerProperties property: The properties of a capability resource.
     * 
     * @return the innerProperties value.
     */
    private CapabilityProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the publisher property: String of the Publisher that this Capability extends.
     * 
     * @return the publisher value.
     */
    public String publisher() {
        return this.innerProperties() == null ? null : this.innerProperties().publisher();
    }

    /**
     * Get the targetType property: String of the Target Type that this Capability extends.
     * 
     * @return the targetType value.
     */
    public String targetType() {
        return this.innerProperties() == null ? null : this.innerProperties().targetType();
    }

    /**
     * Get the description property: Localized string of the description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Get the parametersSchema property: URL to retrieve JSON schema of the Capability parameters.
     * 
     * @return the parametersSchema value.
     */
    public String parametersSchema() {
        return this.innerProperties() == null ? null : this.innerProperties().parametersSchema();
    }

    /**
     * Get the urn property: String of the URN for this Capability Type.
     * 
     * @return the urn value.
     */
    public String urn() {
        return this.innerProperties() == null ? null : this.innerProperties().urn();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
