// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.models.InboundNatRulePortMapping;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The response for a QueryInboundNatRulePortMapping API.
 */
@Fluent
public final class BackendAddressInboundNatRulePortMappingsInner {
    /*
     * Collection of inbound NAT rule port mappings.
     */
    @JsonProperty(value = "inboundNatRulePortMappings")
    private List<InboundNatRulePortMapping> inboundNatRulePortMappings;

    /**
     * Creates an instance of BackendAddressInboundNatRulePortMappingsInner class.
     */
    public BackendAddressInboundNatRulePortMappingsInner() {
    }

    /**
     * Get the inboundNatRulePortMappings property: Collection of inbound NAT rule port mappings.
     * 
     * @return the inboundNatRulePortMappings value.
     */
    public List<InboundNatRulePortMapping> inboundNatRulePortMappings() {
        return this.inboundNatRulePortMappings;
    }

    /**
     * Set the inboundNatRulePortMappings property: Collection of inbound NAT rule port mappings.
     * 
     * @param inboundNatRulePortMappings the inboundNatRulePortMappings value to set.
     * @return the BackendAddressInboundNatRulePortMappingsInner object itself.
     */
    public BackendAddressInboundNatRulePortMappingsInner
        withInboundNatRulePortMappings(List<InboundNatRulePortMapping> inboundNatRulePortMappings) {
        this.inboundNatRulePortMappings = inboundNatRulePortMappings;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (inboundNatRulePortMappings() != null) {
            inboundNatRulePortMappings().forEach(e -> e.validate());
        }
    }
}
