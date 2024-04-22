// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.security.models.Identity;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Security operator under a given subscription and pricing.
 */
@Fluent
public final class SecurityOperatorInner extends ProxyResource {
    /*
     * Identity for the resource.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /**
     * Creates an instance of SecurityOperatorInner class.
     */
    public SecurityOperatorInner() {
    }

    /**
     * Get the identity property: Identity for the resource.
     * 
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Identity for the resource.
     * 
     * @param identity the identity value to set.
     * @return the SecurityOperatorInner object itself.
     */
    public SecurityOperatorInner withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
    }
}
