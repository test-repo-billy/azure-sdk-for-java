// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The health status of the VM.
 */
@Immutable
public final class VirtualMachineHealthStatus {
    /*
     * The health status information for the VM.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private InstanceViewStatus status;

    /**
     * Creates an instance of VirtualMachineHealthStatus class.
     */
    public VirtualMachineHealthStatus() {
    }

    /**
     * Get the status property: The health status information for the VM.
     * 
     * @return the status value.
     */
    public InstanceViewStatus status() {
        return this.status;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (status() != null) {
            status().validate();
        }
    }
}
