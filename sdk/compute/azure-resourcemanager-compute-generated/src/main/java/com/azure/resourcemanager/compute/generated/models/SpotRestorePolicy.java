// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the Spot-Try-Restore properties for the virtual machine scale set. With this property customer can enable
 * or disable automatic restore of the evicted Spot VMSS VM instances opportunistically based on capacity availability
 * and pricing constraint.
 */
@Fluent
public final class SpotRestorePolicy {
    /*
     * Enables the Spot-Try-Restore feature where evicted VMSS SPOT instances will be tried to be restored
     * opportunistically based on capacity availability and pricing constraints
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * Timeout value expressed as an ISO 8601 time duration after which the platform will not try to restore the VMSS
     * SPOT instances
     */
    @JsonProperty(value = "restoreTimeout")
    private String restoreTimeout;

    /**
     * Creates an instance of SpotRestorePolicy class.
     */
    public SpotRestorePolicy() {
    }

    /**
     * Get the enabled property: Enables the Spot-Try-Restore feature where evicted VMSS SPOT instances will be tried
     * to be restored opportunistically based on capacity availability and pricing constraints.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Enables the Spot-Try-Restore feature where evicted VMSS SPOT instances will be tried
     * to be restored opportunistically based on capacity availability and pricing constraints.
     * 
     * @param enabled the enabled value to set.
     * @return the SpotRestorePolicy object itself.
     */
    public SpotRestorePolicy withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the restoreTimeout property: Timeout value expressed as an ISO 8601 time duration after which the platform
     * will not try to restore the VMSS SPOT instances.
     * 
     * @return the restoreTimeout value.
     */
    public String restoreTimeout() {
        return this.restoreTimeout;
    }

    /**
     * Set the restoreTimeout property: Timeout value expressed as an ISO 8601 time duration after which the platform
     * will not try to restore the VMSS SPOT instances.
     * 
     * @param restoreTimeout the restoreTimeout value to set.
     * @return the SpotRestorePolicy object itself.
     */
    public SpotRestorePolicy withRestoreTimeout(String restoreTimeout) {
        this.restoreTimeout = restoreTimeout;
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
