// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.sql.generated.models.MaintenanceWindowTimeRange;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Maintenance windows.
 */
@Fluent
public final class MaintenanceWindowsInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private MaintenanceWindowsProperties innerProperties;

    /**
     * Creates an instance of MaintenanceWindowsInner class.
     */
    public MaintenanceWindowsInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     * 
     * @return the innerProperties value.
     */
    private MaintenanceWindowsProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the timeRanges property: The timeRanges property.
     * 
     * @return the timeRanges value.
     */
    public List<MaintenanceWindowTimeRange> timeRanges() {
        return this.innerProperties() == null ? null : this.innerProperties().timeRanges();
    }

    /**
     * Set the timeRanges property: The timeRanges property.
     * 
     * @param timeRanges the timeRanges value to set.
     * @return the MaintenanceWindowsInner object itself.
     */
    public MaintenanceWindowsInner withTimeRanges(List<MaintenanceWindowTimeRange> timeRanges) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MaintenanceWindowsProperties();
        }
        this.innerProperties().withTimeRanges(timeRanges);
        return this;
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
