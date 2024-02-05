// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The data plane proxy settings for a configuration store.
 */
@Fluent
public final class DataPlaneProxyProperties {
    /*
     * The data plane proxy authentication mode. This property manages the authentication mode of request to the data
     * plane resources.
     */
    @JsonProperty(value = "authenticationMode")
    private AuthenticationMode authenticationMode;

    /*
     * The data plane proxy private link delegation. This property manages if a request from delegated ARM private link
     * is allowed when the data plane resource requires private link.
     */
    @JsonProperty(value = "privateLinkDelegation")
    private PrivateLinkDelegation privateLinkDelegation;

    /**
     * Creates an instance of DataPlaneProxyProperties class.
     */
    public DataPlaneProxyProperties() {
    }

    /**
     * Get the authenticationMode property: The data plane proxy authentication mode. This property manages the
     * authentication mode of request to the data plane resources.
     * 
     * @return the authenticationMode value.
     */
    public AuthenticationMode authenticationMode() {
        return this.authenticationMode;
    }

    /**
     * Set the authenticationMode property: The data plane proxy authentication mode. This property manages the
     * authentication mode of request to the data plane resources.
     * 
     * @param authenticationMode the authenticationMode value to set.
     * @return the DataPlaneProxyProperties object itself.
     */
    public DataPlaneProxyProperties withAuthenticationMode(AuthenticationMode authenticationMode) {
        this.authenticationMode = authenticationMode;
        return this;
    }

    /**
     * Get the privateLinkDelegation property: The data plane proxy private link delegation. This property manages if a
     * request from delegated ARM private link is allowed when the data plane resource requires private link.
     * 
     * @return the privateLinkDelegation value.
     */
    public PrivateLinkDelegation privateLinkDelegation() {
        return this.privateLinkDelegation;
    }

    /**
     * Set the privateLinkDelegation property: The data plane proxy private link delegation. This property manages if a
     * request from delegated ARM private link is allowed when the data plane resource requires private link.
     * 
     * @param privateLinkDelegation the privateLinkDelegation value to set.
     * @return the DataPlaneProxyProperties object itself.
     */
    public DataPlaneProxyProperties withPrivateLinkDelegation(PrivateLinkDelegation privateLinkDelegation) {
        this.privateLinkDelegation = privateLinkDelegation;
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
