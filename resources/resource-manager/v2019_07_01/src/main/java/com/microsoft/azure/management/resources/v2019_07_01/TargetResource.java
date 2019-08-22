/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Target resource.
 */
public class TargetResource {
    /**
     * The ID of the resource.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The name of the resource.
     */
    @JsonProperty(value = "resourceName")
    private String resourceName;

    /**
     * The type of the resource.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /**
     * Get the ID of the resource.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the ID of the resource.
     *
     * @param id the id value to set
     * @return the TargetResource object itself.
     */
    public TargetResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name of the resource.
     *
     * @return the resourceName value
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Set the name of the resource.
     *
     * @param resourceName the resourceName value to set
     * @return the TargetResource object itself.
     */
    public TargetResource withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * Get the type of the resource.
     *
     * @return the resourceType value
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the type of the resource.
     *
     * @param resourceType the resourceType value to set
     * @return the TargetResource object itself.
     */
    public TargetResource withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

}
