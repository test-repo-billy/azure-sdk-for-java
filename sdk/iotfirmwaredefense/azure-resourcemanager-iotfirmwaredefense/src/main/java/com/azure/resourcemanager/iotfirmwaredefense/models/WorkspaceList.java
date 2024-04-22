// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.iotfirmwaredefense.fluent.models.WorkspaceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Return a list of firmware analysis workspaces.
 */
@Fluent
public final class WorkspaceList {
    /*
     * The list of firmware analysis workspaces.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<WorkspaceInner> value;

    /*
     * The uri to fetch the next page of asset.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of WorkspaceList class.
     */
    public WorkspaceList() {
    }

    /**
     * Get the value property: The list of firmware analysis workspaces.
     * 
     * @return the value value.
     */
    public List<WorkspaceInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of asset.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of asset.
     * 
     * @param nextLink the nextLink value to set.
     * @return the WorkspaceList object itself.
     */
    public WorkspaceList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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
