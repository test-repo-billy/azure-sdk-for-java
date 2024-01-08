// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.IpAllocationMethod;
import com.azure.resourcemanager.network.generated.models.IpVersion;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Frontend IP address of the load balancer.
 */
@Fluent
public final class FrontendIpConfigurationInner extends SubResource {
    /*
     * Properties of the load balancer probe.
     */
    @JsonProperty(value = "properties")
    private FrontendIpConfigurationPropertiesFormatInner innerProperties;

    /*
     * The name of the resource that is unique within the set of frontend IP configurations used by the load balancer.
     * This name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * A list of availability zones denoting the IP allocated for the resource needs to come from.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /**
     * Creates an instance of FrontendIpConfigurationInner class.
     */
    public FrontendIpConfigurationInner() {
    }

    /**
     * Get the innerProperties property: Properties of the load balancer probe.
     * 
     * @return the innerProperties value.
     */
    private FrontendIpConfigurationPropertiesFormatInner innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within the set of frontend IP configurations used
     * by the load balancer. This name can be used to access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within the set of frontend IP configurations used
     * by the load balancer. This name can be used to access the resource.
     * 
     * @param name the name value to set.
     * @return the FrontendIpConfigurationInner object itself.
     */
    public FrontendIpConfigurationInner withName(String name) {
        this.name = name;
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
     * Get the type property: Type of the resource.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the zones property: A list of availability zones denoting the IP allocated for the resource needs to come
     * from.
     * 
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: A list of availability zones denoting the IP allocated for the resource needs to come
     * from.
     * 
     * @param zones the zones value to set.
     * @return the FrontendIpConfigurationInner object itself.
     */
    public FrontendIpConfigurationInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FrontendIpConfigurationInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the inboundNatRules property: An array of references to inbound rules that use this frontend IP.
     * 
     * @return the inboundNatRules value.
     */
    public List<SubResource> inboundNatRules() {
        return this.innerProperties() == null ? null : this.innerProperties().inboundNatRules();
    }

    /**
     * Get the inboundNatPools property: An array of references to inbound pools that use this frontend IP.
     * 
     * @return the inboundNatPools value.
     */
    public List<SubResource> inboundNatPools() {
        return this.innerProperties() == null ? null : this.innerProperties().inboundNatPools();
    }

    /**
     * Get the outboundRules property: An array of references to outbound rules that use this frontend IP.
     * 
     * @return the outboundRules value.
     */
    public List<SubResource> outboundRules() {
        return this.innerProperties() == null ? null : this.innerProperties().outboundRules();
    }

    /**
     * Get the loadBalancingRules property: An array of references to load balancing rules that use this frontend IP.
     * 
     * @return the loadBalancingRules value.
     */
    public List<SubResource> loadBalancingRules() {
        return this.innerProperties() == null ? null : this.innerProperties().loadBalancingRules();
    }

    /**
     * Get the privateIpAddress property: The private IP address of the IP configuration.
     * 
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().privateIpAddress();
    }

    /**
     * Set the privateIpAddress property: The private IP address of the IP configuration.
     * 
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the FrontendIpConfigurationInner object itself.
     */
    public FrontendIpConfigurationInner withPrivateIpAddress(String privateIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FrontendIpConfigurationPropertiesFormatInner();
        }
        this.innerProperties().withPrivateIpAddress(privateIpAddress);
        return this;
    }

    /**
     * Get the privateIpAllocationMethod property: The Private IP allocation method.
     * 
     * @return the privateIpAllocationMethod value.
     */
    public IpAllocationMethod privateIpAllocationMethod() {
        return this.innerProperties() == null ? null : this.innerProperties().privateIpAllocationMethod();
    }

    /**
     * Set the privateIpAllocationMethod property: The Private IP allocation method.
     * 
     * @param privateIpAllocationMethod the privateIpAllocationMethod value to set.
     * @return the FrontendIpConfigurationInner object itself.
     */
    public FrontendIpConfigurationInner withPrivateIpAllocationMethod(IpAllocationMethod privateIpAllocationMethod) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FrontendIpConfigurationPropertiesFormatInner();
        }
        this.innerProperties().withPrivateIpAllocationMethod(privateIpAllocationMethod);
        return this;
    }

    /**
     * Get the privateIpAddressVersion property: Whether the specific ipconfiguration is IPv4 or IPv6. Default is taken
     * as IPv4.
     * 
     * @return the privateIpAddressVersion value.
     */
    public IpVersion privateIpAddressVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().privateIpAddressVersion();
    }

    /**
     * Set the privateIpAddressVersion property: Whether the specific ipconfiguration is IPv4 or IPv6. Default is taken
     * as IPv4.
     * 
     * @param privateIpAddressVersion the privateIpAddressVersion value to set.
     * @return the FrontendIpConfigurationInner object itself.
     */
    public FrontendIpConfigurationInner withPrivateIpAddressVersion(IpVersion privateIpAddressVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FrontendIpConfigurationPropertiesFormatInner();
        }
        this.innerProperties().withPrivateIpAddressVersion(privateIpAddressVersion);
        return this;
    }

    /**
     * Get the subnet property: The reference to the subnet resource.
     * 
     * @return the subnet value.
     */
    public SubnetInner subnet() {
        return this.innerProperties() == null ? null : this.innerProperties().subnet();
    }

    /**
     * Set the subnet property: The reference to the subnet resource.
     * 
     * @param subnet the subnet value to set.
     * @return the FrontendIpConfigurationInner object itself.
     */
    public FrontendIpConfigurationInner withSubnet(SubnetInner subnet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FrontendIpConfigurationPropertiesFormatInner();
        }
        this.innerProperties().withSubnet(subnet);
        return this;
    }

    /**
     * Get the publicIpAddress property: The reference to the Public IP resource.
     * 
     * @return the publicIpAddress value.
     */
    public PublicIpAddressInner publicIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().publicIpAddress();
    }

    /**
     * Set the publicIpAddress property: The reference to the Public IP resource.
     * 
     * @param publicIpAddress the publicIpAddress value to set.
     * @return the FrontendIpConfigurationInner object itself.
     */
    public FrontendIpConfigurationInner withPublicIpAddress(PublicIpAddressInner publicIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FrontendIpConfigurationPropertiesFormatInner();
        }
        this.innerProperties().withPublicIpAddress(publicIpAddress);
        return this;
    }

    /**
     * Get the publicIpPrefix property: The reference to the Public IP Prefix resource.
     * 
     * @return the publicIpPrefix value.
     */
    public SubResource publicIpPrefix() {
        return this.innerProperties() == null ? null : this.innerProperties().publicIpPrefix();
    }

    /**
     * Set the publicIpPrefix property: The reference to the Public IP Prefix resource.
     * 
     * @param publicIpPrefix the publicIpPrefix value to set.
     * @return the FrontendIpConfigurationInner object itself.
     */
    public FrontendIpConfigurationInner withPublicIpPrefix(SubResource publicIpPrefix) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FrontendIpConfigurationPropertiesFormatInner();
        }
        this.innerProperties().withPublicIpPrefix(publicIpPrefix);
        return this;
    }

    /**
     * Get the gatewayLoadBalancer property: The reference to gateway load balancer frontend IP.
     * 
     * @return the gatewayLoadBalancer value.
     */
    public SubResource gatewayLoadBalancer() {
        return this.innerProperties() == null ? null : this.innerProperties().gatewayLoadBalancer();
    }

    /**
     * Set the gatewayLoadBalancer property: The reference to gateway load balancer frontend IP.
     * 
     * @param gatewayLoadBalancer the gatewayLoadBalancer value to set.
     * @return the FrontendIpConfigurationInner object itself.
     */
    public FrontendIpConfigurationInner withGatewayLoadBalancer(SubResource gatewayLoadBalancer) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FrontendIpConfigurationPropertiesFormatInner();
        }
        this.innerProperties().withGatewayLoadBalancer(gatewayLoadBalancer);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the frontend IP configuration resource.
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
