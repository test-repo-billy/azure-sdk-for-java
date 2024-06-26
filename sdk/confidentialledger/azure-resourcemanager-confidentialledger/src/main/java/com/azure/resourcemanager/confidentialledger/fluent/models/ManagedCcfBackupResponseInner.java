// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object representing the backup response of a Managed CCF Resource.
 */
@Immutable
public final class ManagedCcfBackupResponseInner {
    /*
     * Response body stating if the managed CCF resource is being backed up.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Creates an instance of ManagedCcfBackupResponseInner class.
     */
    public ManagedCcfBackupResponseInner() {
    }

    /**
     * Get the message property: Response body stating if the managed CCF resource is being backed up.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
