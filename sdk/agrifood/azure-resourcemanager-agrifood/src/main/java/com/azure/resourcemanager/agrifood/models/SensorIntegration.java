// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.exception.ManagementError;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Sensor integration request model.
 */
@Fluent
public final class SensorIntegration {
    /*
     * Sensor integration enable state.
     */
    @JsonProperty(value = "enabled")
    private String enabled;

    /*
     * Sensor integration instance provisioning state.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Error response
     * 
     * Common error response for all Azure Resource Manager APIs to return error details for failed operations. (This
     * also follows the OData error response format.).
     */
    @JsonProperty(value = "provisioningInfo")
    private ManagementError provisioningInfo;

    /**
     * Creates an instance of SensorIntegration class.
     */
    public SensorIntegration() {
    }

    /**
     * Get the enabled property: Sensor integration enable state.
     * 
     * @return the enabled value.
     */
    public String enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Sensor integration enable state.
     * 
     * @param enabled the enabled value to set.
     * @return the SensorIntegration object itself.
     */
    public SensorIntegration withEnabled(String enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the provisioningState property: Sensor integration instance provisioning state.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the provisioningInfo property: Error response
     * 
     * Common error response for all Azure Resource Manager APIs to return error details for failed operations. (This
     * also follows the OData error response format.).
     * 
     * @return the provisioningInfo value.
     */
    public ManagementError provisioningInfo() {
        return this.provisioningInfo;
    }

    /**
     * Set the provisioningInfo property: Error response
     * 
     * Common error response for all Azure Resource Manager APIs to return error details for failed operations. (This
     * also follows the OData error response format.).
     * 
     * @param provisioningInfo the provisioningInfo value to set.
     * @return the SensorIntegration object itself.
     */
    public SensorIntegration withProvisioningInfo(ManagementError provisioningInfo) {
        this.provisioningInfo = provisioningInfo;
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
