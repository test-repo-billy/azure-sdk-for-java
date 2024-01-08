// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.AzureFirewallIpConfigurationPropertiesFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IP configuration of an Azure Firewall.
 */
@Fluent
public final class AzureFirewallIpConfiguration extends SubResource {
    /*
     * Properties of the azure firewall IP configuration.
     */
    @JsonProperty(value = "properties")
    private AzureFirewallIpConfigurationPropertiesFormat innerProperties;

    /*
     * Name of the resource that is unique within a resource group. This name can be used to access the resource.
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

    /**
     * Creates an instance of AzureFirewallIpConfiguration class.
     */
    public AzureFirewallIpConfiguration() {
    }

    /**
     * Get the innerProperties property: Properties of the azure firewall IP configuration.
     * 
     * @return the innerProperties value.
     */
    private AzureFirewallIpConfigurationPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @param name the name value to set.
     * @return the AzureFirewallIpConfiguration object itself.
     */
    public AzureFirewallIpConfiguration withName(String name) {
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
     * {@inheritDoc}
     */
    @Override
    public AzureFirewallIpConfiguration withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the privateIpAddress property: The Firewall Internal Load Balancer IP to be used as the next hop in User
     * Defined Routes.
     * 
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().privateIpAddress();
    }

    /**
     * Get the subnet property: Reference to the subnet resource. This resource must be named 'AzureFirewallSubnet' or
     * 'AzureFirewallManagementSubnet'.
     * 
     * @return the subnet value.
     */
    public SubResource subnet() {
        return this.innerProperties() == null ? null : this.innerProperties().subnet();
    }

    /**
     * Set the subnet property: Reference to the subnet resource. This resource must be named 'AzureFirewallSubnet' or
     * 'AzureFirewallManagementSubnet'.
     * 
     * @param subnet the subnet value to set.
     * @return the AzureFirewallIpConfiguration object itself.
     */
    public AzureFirewallIpConfiguration withSubnet(SubResource subnet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureFirewallIpConfigurationPropertiesFormat();
        }
        this.innerProperties().withSubnet(subnet);
        return this;
    }

    /**
     * Get the publicIpAddress property: Reference to the PublicIP resource. This field is a mandatory input if subnet
     * is not null.
     * 
     * @return the publicIpAddress value.
     */
    public SubResource publicIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().publicIpAddress();
    }

    /**
     * Set the publicIpAddress property: Reference to the PublicIP resource. This field is a mandatory input if subnet
     * is not null.
     * 
     * @param publicIpAddress the publicIpAddress value to set.
     * @return the AzureFirewallIpConfiguration object itself.
     */
    public AzureFirewallIpConfiguration withPublicIpAddress(SubResource publicIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureFirewallIpConfigurationPropertiesFormat();
        }
        this.innerProperties().withPublicIpAddress(publicIpAddress);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the Azure firewall IP configuration resource.
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
