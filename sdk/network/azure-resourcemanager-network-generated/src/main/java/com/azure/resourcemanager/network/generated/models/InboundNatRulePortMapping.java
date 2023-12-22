// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Individual port mappings for inbound NAT rule created for backend pool.
 */
@Immutable
public final class InboundNatRulePortMapping {
    /*
     * Name of inbound NAT rule.
     */
    @JsonProperty(value = "inboundNatRuleName", access = JsonProperty.Access.WRITE_ONLY)
    private String inboundNatRuleName;

    /*
     * The reference to the transport protocol used by the inbound NAT rule.
     */
    @JsonProperty(value = "protocol", access = JsonProperty.Access.WRITE_ONLY)
    private TransportProtocol protocol;

    /*
     * Frontend port.
     */
    @JsonProperty(value = "frontendPort", access = JsonProperty.Access.WRITE_ONLY)
    private Integer frontendPort;

    /*
     * Backend port.
     */
    @JsonProperty(value = "backendPort", access = JsonProperty.Access.WRITE_ONLY)
    private Integer backendPort;

    /**
     * Creates an instance of InboundNatRulePortMapping class.
     */
    public InboundNatRulePortMapping() {
    }

    /**
     * Get the inboundNatRuleName property: Name of inbound NAT rule.
     * 
     * @return the inboundNatRuleName value.
     */
    public String inboundNatRuleName() {
        return this.inboundNatRuleName;
    }

    /**
     * Get the protocol property: The reference to the transport protocol used by the inbound NAT rule.
     * 
     * @return the protocol value.
     */
    public TransportProtocol protocol() {
        return this.protocol;
    }

    /**
     * Get the frontendPort property: Frontend port.
     * 
     * @return the frontendPort value.
     */
    public Integer frontendPort() {
        return this.frontendPort;
    }

    /**
     * Get the backendPort property: Backend port.
     * 
     * @return the backendPort value.
     */
    public Integer backendPort() {
        return this.backendPort;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
