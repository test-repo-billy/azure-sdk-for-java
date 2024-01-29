// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The configuration parameters used while performing resilient VM deletion.
 */
@Fluent
public final class ResilientVMDeletionPolicy {
    /*
     * Specifies whether resilient VM deletion should be enabled on the virtual machine scale set. The default value is
     * false.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Creates an instance of ResilientVMDeletionPolicy class.
     */
    public ResilientVMDeletionPolicy() {
    }

    /**
     * Get the enabled property: Specifies whether resilient VM deletion should be enabled on the virtual machine scale
     * set. The default value is false.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Specifies whether resilient VM deletion should be enabled on the virtual machine scale
     * set. The default value is false.
     * 
     * @param enabled the enabled value to set.
     * @return the ResilientVMDeletionPolicy object itself.
     */
    public ResilientVMDeletionPolicy withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
