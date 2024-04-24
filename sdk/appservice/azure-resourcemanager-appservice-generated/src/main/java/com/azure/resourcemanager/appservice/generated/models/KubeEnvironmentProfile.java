// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specification for a Kubernetes Environment to use for this resource.
 */
@Fluent
public final class KubeEnvironmentProfile {
    /*
     * Resource ID of the Kubernetes Environment.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Name of the Kubernetes Environment.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Resource type of the Kubernetes Environment.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Creates an instance of KubeEnvironmentProfile class.
     */
    public KubeEnvironmentProfile() {
    }

    /**
     * Get the id property: Resource ID of the Kubernetes Environment.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID of the Kubernetes Environment.
     * 
     * @param id the id value to set.
     * @return the KubeEnvironmentProfile object itself.
     */
    public KubeEnvironmentProfile withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Name of the Kubernetes Environment.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Resource type of the Kubernetes Environment.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
