// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Usage metric of a database.
 */
@Immutable
public final class DatabaseUsageInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private DatabaseUsageProperties innerProperties;

    /**
     * Creates an instance of DatabaseUsageInner class.
     */
    public DatabaseUsageInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     * 
     * @return the innerProperties value.
     */
    private DatabaseUsageProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the displayName property: User-readable name of the metric.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Get the currentValue property: Current value of the metric.
     * 
     * @return the currentValue value.
     */
    public Double currentValue() {
        return this.innerProperties() == null ? null : this.innerProperties().currentValue();
    }

    /**
     * Get the limit property: Boundary value of the metric.
     * 
     * @return the limit value.
     */
    public Double limit() {
        return this.innerProperties() == null ? null : this.innerProperties().limit();
    }

    /**
     * Get the unit property: Unit of the metric.
     * 
     * @return the unit value.
     */
    public String unit() {
        return this.innerProperties() == null ? null : this.innerProperties().unit();
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
