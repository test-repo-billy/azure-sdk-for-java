// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is the safety profile of the Gallery Artifact Version.
 */
@Fluent
public class GalleryArtifactSafetyProfileBase {
    /*
     * Indicates whether or not removing this Gallery Image Version from replicated regions is allowed.
     */
    @JsonProperty(value = "allowDeletionOfReplicatedLocations")
    private Boolean allowDeletionOfReplicatedLocations;

    /**
     * Creates an instance of GalleryArtifactSafetyProfileBase class.
     */
    public GalleryArtifactSafetyProfileBase() {
    }

    /**
     * Get the allowDeletionOfReplicatedLocations property: Indicates whether or not removing this Gallery Image Version
     * from replicated regions is allowed.
     * 
     * @return the allowDeletionOfReplicatedLocations value.
     */
    public Boolean allowDeletionOfReplicatedLocations() {
        return this.allowDeletionOfReplicatedLocations;
    }

    /**
     * Set the allowDeletionOfReplicatedLocations property: Indicates whether or not removing this Gallery Image Version
     * from replicated regions is allowed.
     * 
     * @param allowDeletionOfReplicatedLocations the allowDeletionOfReplicatedLocations value to set.
     * @return the GalleryArtifactSafetyProfileBase object itself.
     */
    public GalleryArtifactSafetyProfileBase
        withAllowDeletionOfReplicatedLocations(Boolean allowDeletionOfReplicatedLocations) {
        this.allowDeletionOfReplicatedLocations = allowDeletionOfReplicatedLocations;
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
