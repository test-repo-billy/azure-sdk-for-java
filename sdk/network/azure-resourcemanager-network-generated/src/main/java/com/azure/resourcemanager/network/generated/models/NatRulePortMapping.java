// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Individual port mappings for inbound NAT rule created for backend pool.
 */
@Fluent
public final class NatRulePortMapping {
    /*
     * Name of inbound NAT rule.
     */
    @JsonProperty(value = "inboundNatRuleName")
    private String inboundNatRuleName;

    /*
     * Frontend port.
     */
    @JsonProperty(value = "frontendPort")
    private Integer frontendPort;

    /*
     * Backend port.
     */
    @JsonProperty(value = "backendPort")
    private Integer backendPort;

    /**
     * Creates an instance of NatRulePortMapping class.
     */
    public NatRulePortMapping() {
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
     * Set the inboundNatRuleName property: Name of inbound NAT rule.
     * 
     * @param inboundNatRuleName the inboundNatRuleName value to set.
     * @return the NatRulePortMapping object itself.
     */
    public NatRulePortMapping withInboundNatRuleName(String inboundNatRuleName) {
        this.inboundNatRuleName = inboundNatRuleName;
        return this;
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
     * Set the frontendPort property: Frontend port.
     * 
     * @param frontendPort the frontendPort value to set.
     * @return the NatRulePortMapping object itself.
     */
    public NatRulePortMapping withFrontendPort(Integer frontendPort) {
        this.frontendPort = frontendPort;
        return this;
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
     * Set the backendPort property: Backend port.
     * 
     * @param backendPort the backendPort value to set.
     * @return the NatRulePortMapping object itself.
     */
    public NatRulePortMapping withBackendPort(Integer backendPort) {
        this.backendPort = backendPort;
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
