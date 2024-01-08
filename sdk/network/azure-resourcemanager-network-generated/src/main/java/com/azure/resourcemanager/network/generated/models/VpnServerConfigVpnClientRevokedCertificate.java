// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the revoked VPN client certificate of VpnServerConfiguration.
 */
@Fluent
public final class VpnServerConfigVpnClientRevokedCertificate {
    /*
     * The certificate name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The revoked VPN client certificate thumbprint.
     */
    @JsonProperty(value = "thumbprint")
    private String thumbprint;

    /**
     * Creates an instance of VpnServerConfigVpnClientRevokedCertificate class.
     */
    public VpnServerConfigVpnClientRevokedCertificate() {
    }

    /**
     * Get the name property: The certificate name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The certificate name.
     * 
     * @param name the name value to set.
     * @return the VpnServerConfigVpnClientRevokedCertificate object itself.
     */
    public VpnServerConfigVpnClientRevokedCertificate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the thumbprint property: The revoked VPN client certificate thumbprint.
     * 
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint property: The revoked VPN client certificate thumbprint.
     * 
     * @param thumbprint the thumbprint value to set.
     * @return the VpnServerConfigVpnClientRevokedCertificate object itself.
     */
    public VpnServerConfigVpnClientRevokedCertificate withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
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
