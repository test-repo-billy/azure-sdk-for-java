// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.NatGatewaySku;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Nat Gateway resource.
 */
@Fluent
public final class NatGatewayInner extends Resource {
    /*
     * The nat gateway SKU.
     */
    @JsonProperty(value = "sku")
    private NatGatewaySku sku;

    /*
     * Nat Gateway properties.
     */
    @JsonProperty(value = "properties")
    private NatGatewayPropertiesFormat innerProperties;

    /*
     * A list of availability zones denoting the zone in which Nat Gateway should be deployed.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Creates an instance of NatGatewayInner class.
     */
    public NatGatewayInner() {
    }

    /**
     * Get the sku property: The nat gateway SKU.
     * 
     * @return the sku value.
     */
    public NatGatewaySku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The nat gateway SKU.
     * 
     * @param sku the sku value to set.
     * @return the NatGatewayInner object itself.
     */
    public NatGatewayInner withSku(NatGatewaySku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the innerProperties property: Nat Gateway properties.
     * 
     * @return the innerProperties value.
     */
    private NatGatewayPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the zones property: A list of availability zones denoting the zone in which Nat Gateway should be deployed.
     * 
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: A list of availability zones denoting the zone in which Nat Gateway should be deployed.
     * 
     * @param zones the zones value to set.
     * @return the NatGatewayInner object itself.
     */
    public NatGatewayInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the id property: Resource ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     * 
     * @param id the id value to set.
     * @return the NatGatewayInner object itself.
     */
    public NatGatewayInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NatGatewayInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NatGatewayInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the idleTimeoutInMinutes property: The idle timeout of the nat gateway.
     * 
     * @return the idleTimeoutInMinutes value.
     */
    public Integer idleTimeoutInMinutes() {
        return this.innerProperties() == null ? null : this.innerProperties().idleTimeoutInMinutes();
    }

    /**
     * Set the idleTimeoutInMinutes property: The idle timeout of the nat gateway.
     * 
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set.
     * @return the NatGatewayInner object itself.
     */
    public NatGatewayInner withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NatGatewayPropertiesFormat();
        }
        this.innerProperties().withIdleTimeoutInMinutes(idleTimeoutInMinutes);
        return this;
    }

    /**
     * Get the publicIpAddresses property: An array of public ip addresses associated with the nat gateway resource.
     * 
     * @return the publicIpAddresses value.
     */
    public List<SubResource> publicIpAddresses() {
        return this.innerProperties() == null ? null : this.innerProperties().publicIpAddresses();
    }

    /**
     * Set the publicIpAddresses property: An array of public ip addresses associated with the nat gateway resource.
     * 
     * @param publicIpAddresses the publicIpAddresses value to set.
     * @return the NatGatewayInner object itself.
     */
    public NatGatewayInner withPublicIpAddresses(List<SubResource> publicIpAddresses) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NatGatewayPropertiesFormat();
        }
        this.innerProperties().withPublicIpAddresses(publicIpAddresses);
        return this;
    }

    /**
     * Get the publicIpPrefixes property: An array of public ip prefixes associated with the nat gateway resource.
     * 
     * @return the publicIpPrefixes value.
     */
    public List<SubResource> publicIpPrefixes() {
        return this.innerProperties() == null ? null : this.innerProperties().publicIpPrefixes();
    }

    /**
     * Set the publicIpPrefixes property: An array of public ip prefixes associated with the nat gateway resource.
     * 
     * @param publicIpPrefixes the publicIpPrefixes value to set.
     * @return the NatGatewayInner object itself.
     */
    public NatGatewayInner withPublicIpPrefixes(List<SubResource> publicIpPrefixes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NatGatewayPropertiesFormat();
        }
        this.innerProperties().withPublicIpPrefixes(publicIpPrefixes);
        return this;
    }

    /**
     * Get the subnets property: An array of references to the subnets using this nat gateway resource.
     * 
     * @return the subnets value.
     */
    public List<SubResource> subnets() {
        return this.innerProperties() == null ? null : this.innerProperties().subnets();
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the NAT gateway resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
    }

    /**
     * Get the provisioningState property: The provisioning state of the NAT gateway resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
