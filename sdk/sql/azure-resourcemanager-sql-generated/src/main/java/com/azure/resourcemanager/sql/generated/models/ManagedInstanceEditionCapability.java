// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The managed server capability.
 */
@Fluent
public final class ManagedInstanceEditionCapability {
    /*
     * The managed server version name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The supported families.
     */
    @JsonProperty(value = "supportedFamilies", access = JsonProperty.Access.WRITE_ONLY)
    private List<ManagedInstanceFamilyCapability> supportedFamilies;

    /*
     * The list of supported storage capabilities for this edition
     */
    @JsonProperty(value = "supportedStorageCapabilities", access = JsonProperty.Access.WRITE_ONLY)
    private List<StorageCapability> supportedStorageCapabilities;

    /*
     * Whether or not zone redundancy is supported for the edition.
     */
    @JsonProperty(value = "zoneRedundant", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean zoneRedundant;

    /*
     * The status of the capability.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private CapabilityStatus status;

    /*
     * The reason for the capability not being available.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /**
     * Creates an instance of ManagedInstanceEditionCapability class.
     */
    public ManagedInstanceEditionCapability() {
    }

    /**
     * Get the name property: The managed server version name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the supportedFamilies property: The supported families.
     * 
     * @return the supportedFamilies value.
     */
    public List<ManagedInstanceFamilyCapability> supportedFamilies() {
        return this.supportedFamilies;
    }

    /**
     * Get the supportedStorageCapabilities property: The list of supported storage capabilities for this edition.
     * 
     * @return the supportedStorageCapabilities value.
     */
    public List<StorageCapability> supportedStorageCapabilities() {
        return this.supportedStorageCapabilities;
    }

    /**
     * Get the zoneRedundant property: Whether or not zone redundancy is supported for the edition.
     * 
     * @return the zoneRedundant value.
     */
    public Boolean zoneRedundant() {
        return this.zoneRedundant;
    }

    /**
     * Get the status property: The status of the capability.
     * 
     * @return the status value.
     */
    public CapabilityStatus status() {
        return this.status;
    }

    /**
     * Get the reason property: The reason for the capability not being available.
     * 
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason property: The reason for the capability not being available.
     * 
     * @param reason the reason value to set.
     * @return the ManagedInstanceEditionCapability object itself.
     */
    public ManagedInstanceEditionCapability withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (supportedFamilies() != null) {
            supportedFamilies().forEach(e -> e.validate());
        }
        if (supportedStorageCapabilities() != null) {
            supportedStorageCapabilities().forEach(e -> e.validate());
        }
    }
}
