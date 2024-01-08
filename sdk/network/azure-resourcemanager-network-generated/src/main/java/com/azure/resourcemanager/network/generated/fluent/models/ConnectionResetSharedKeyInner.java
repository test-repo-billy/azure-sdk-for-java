// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The virtual network connection reset shared key.
 */
@Fluent
public final class ConnectionResetSharedKeyInner {
    /*
     * The virtual network connection reset shared key length, should between 1 and 128.
     */
    @JsonProperty(value = "keyLength", required = true)
    private int keyLength;

    /**
     * Creates an instance of ConnectionResetSharedKeyInner class.
     */
    public ConnectionResetSharedKeyInner() {
    }

    /**
     * Get the keyLength property: The virtual network connection reset shared key length, should between 1 and 128.
     * 
     * @return the keyLength value.
     */
    public int keyLength() {
        return this.keyLength;
    }

    /**
     * Set the keyLength property: The virtual network connection reset shared key length, should between 1 and 128.
     * 
     * @param keyLength the keyLength value to set.
     * @return the ConnectionResetSharedKeyInner object itself.
     */
    public ConnectionResetSharedKeyInner withKeyLength(int keyLength) {
        this.keyLength = keyLength;
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
