// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Application gateway client authentication configuration.
 */
@Fluent
public final class ApplicationGatewayClientAuthConfiguration {
    /*
     * Verify client certificate issuer name on the application gateway.
     */
    @JsonProperty(value = "verifyClientCertIssuerDN")
    private Boolean verifyClientCertIssuerDN;

    /*
     * Verify client certificate revocation status.
     */
    @JsonProperty(value = "verifyClientRevocation")
    private ApplicationGatewayClientRevocationOptions verifyClientRevocation;

    /**
     * Creates an instance of ApplicationGatewayClientAuthConfiguration class.
     */
    public ApplicationGatewayClientAuthConfiguration() {
    }

    /**
     * Get the verifyClientCertIssuerDN property: Verify client certificate issuer name on the application gateway.
     * 
     * @return the verifyClientCertIssuerDN value.
     */
    public Boolean verifyClientCertIssuerDN() {
        return this.verifyClientCertIssuerDN;
    }

    /**
     * Set the verifyClientCertIssuerDN property: Verify client certificate issuer name on the application gateway.
     * 
     * @param verifyClientCertIssuerDN the verifyClientCertIssuerDN value to set.
     * @return the ApplicationGatewayClientAuthConfiguration object itself.
     */
    public ApplicationGatewayClientAuthConfiguration withVerifyClientCertIssuerDN(Boolean verifyClientCertIssuerDN) {
        this.verifyClientCertIssuerDN = verifyClientCertIssuerDN;
        return this;
    }

    /**
     * Get the verifyClientRevocation property: Verify client certificate revocation status.
     * 
     * @return the verifyClientRevocation value.
     */
    public ApplicationGatewayClientRevocationOptions verifyClientRevocation() {
        return this.verifyClientRevocation;
    }

    /**
     * Set the verifyClientRevocation property: Verify client certificate revocation status.
     * 
     * @param verifyClientRevocation the verifyClientRevocation value to set.
     * @return the ApplicationGatewayClientAuthConfiguration object itself.
     */
    public ApplicationGatewayClientAuthConfiguration
        withVerifyClientRevocation(ApplicationGatewayClientRevocationOptions verifyClientRevocation) {
        this.verifyClientRevocation = verifyClientRevocation;
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
