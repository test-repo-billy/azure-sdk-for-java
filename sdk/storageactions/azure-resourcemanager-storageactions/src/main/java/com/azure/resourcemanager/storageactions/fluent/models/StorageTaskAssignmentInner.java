// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageactions.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Fetch the Storage task assignment ARM ids.
 */
@Immutable
public final class StorageTaskAssignmentInner {
    /*
     * ARM Id of the storage task assignments, associated with the storage tasks.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Creates an instance of StorageTaskAssignmentInner class.
     */
    public StorageTaskAssignmentInner() {
    }

    /**
     * Get the id property: ARM Id of the storage task assignments, associated with the storage tasks.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
