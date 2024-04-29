// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineNetworkInterfaceIpConfigurationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Describes a virtual machine network profile's IP configuration.
 */
@Fluent
public final class VirtualMachineNetworkInterfaceIpConfiguration {
    /*
     * The IP configuration name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Describes a virtual machine network interface IP configuration properties.
     */
    @JsonProperty(value = "properties")
    private VirtualMachineNetworkInterfaceIpConfigurationProperties innerProperties;

    /**
     * Creates an instance of VirtualMachineNetworkInterfaceIpConfiguration class.
     */
    public VirtualMachineNetworkInterfaceIpConfiguration() {
    }

    /**
     * Get the name property: The IP configuration name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The IP configuration name.
     * 
     * @param name the name value to set.
     * @return the VirtualMachineNetworkInterfaceIpConfiguration object itself.
     */
    public VirtualMachineNetworkInterfaceIpConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the innerProperties property: Describes a virtual machine network interface IP configuration properties.
     * 
     * @return the innerProperties value.
     */
    private VirtualMachineNetworkInterfaceIpConfigurationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the subnet property: Specifies the identifier of the subnet.
     * 
     * @return the subnet value.
     */
    public SubResource subnet() {
        return this.innerProperties() == null ? null : this.innerProperties().subnet();
    }

    /**
     * Set the subnet property: Specifies the identifier of the subnet.
     * 
     * @param subnet the subnet value to set.
     * @return the VirtualMachineNetworkInterfaceIpConfiguration object itself.
     */
    public VirtualMachineNetworkInterfaceIpConfiguration withSubnet(SubResource subnet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineNetworkInterfaceIpConfigurationProperties();
        }
        this.innerProperties().withSubnet(subnet);
        return this;
    }

    /**
     * Get the primary property: Specifies the primary network interface in case the virtual machine has more than 1
     * network interface.
     * 
     * @return the primary value.
     */
    public Boolean primary() {
        return this.innerProperties() == null ? null : this.innerProperties().primary();
    }

    /**
     * Set the primary property: Specifies the primary network interface in case the virtual machine has more than 1
     * network interface.
     * 
     * @param primary the primary value to set.
     * @return the VirtualMachineNetworkInterfaceIpConfiguration object itself.
     */
    public VirtualMachineNetworkInterfaceIpConfiguration withPrimary(Boolean primary) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineNetworkInterfaceIpConfigurationProperties();
        }
        this.innerProperties().withPrimary(primary);
        return this;
    }

    /**
     * Get the publicIpAddressConfiguration property: The publicIPAddressConfiguration.
     * 
     * @return the publicIpAddressConfiguration value.
     */
    public VirtualMachinePublicIpAddressConfiguration publicIpAddressConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().publicIpAddressConfiguration();
    }

    /**
     * Set the publicIpAddressConfiguration property: The publicIPAddressConfiguration.
     * 
     * @param publicIpAddressConfiguration the publicIpAddressConfiguration value to set.
     * @return the VirtualMachineNetworkInterfaceIpConfiguration object itself.
     */
    public VirtualMachineNetworkInterfaceIpConfiguration
        withPublicIpAddressConfiguration(VirtualMachinePublicIpAddressConfiguration publicIpAddressConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineNetworkInterfaceIpConfigurationProperties();
        }
        this.innerProperties().withPublicIpAddressConfiguration(publicIpAddressConfiguration);
        return this;
    }

    /**
     * Get the privateIpAddressVersion property: Available from Api-Version 2017-03-30 onwards, it represents whether
     * the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     * 
     * @return the privateIpAddressVersion value.
     */
    public IpVersions privateIpAddressVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().privateIpAddressVersion();
    }

    /**
     * Set the privateIpAddressVersion property: Available from Api-Version 2017-03-30 onwards, it represents whether
     * the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     * 
     * @param privateIpAddressVersion the privateIpAddressVersion value to set.
     * @return the VirtualMachineNetworkInterfaceIpConfiguration object itself.
     */
    public VirtualMachineNetworkInterfaceIpConfiguration
        withPrivateIpAddressVersion(IpVersions privateIpAddressVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineNetworkInterfaceIpConfigurationProperties();
        }
        this.innerProperties().withPrivateIpAddressVersion(privateIpAddressVersion);
        return this;
    }

    /**
     * Get the applicationSecurityGroups property: Specifies an array of references to application security group.
     * 
     * @return the applicationSecurityGroups value.
     */
    public List<SubResource> applicationSecurityGroups() {
        return this.innerProperties() == null ? null : this.innerProperties().applicationSecurityGroups();
    }

    /**
     * Set the applicationSecurityGroups property: Specifies an array of references to application security group.
     * 
     * @param applicationSecurityGroups the applicationSecurityGroups value to set.
     * @return the VirtualMachineNetworkInterfaceIpConfiguration object itself.
     */
    public VirtualMachineNetworkInterfaceIpConfiguration
        withApplicationSecurityGroups(List<SubResource> applicationSecurityGroups) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineNetworkInterfaceIpConfigurationProperties();
        }
        this.innerProperties().withApplicationSecurityGroups(applicationSecurityGroups);
        return this;
    }

    /**
     * Get the applicationGatewayBackendAddressPools property: Specifies an array of references to backend address pools
     * of application gateways. A virtual machine can reference backend address pools of multiple application gateways.
     * Multiple virtual machines cannot use the same application gateway.
     * 
     * @return the applicationGatewayBackendAddressPools value.
     */
    public List<SubResource> applicationGatewayBackendAddressPools() {
        return this.innerProperties() == null ? null : this.innerProperties().applicationGatewayBackendAddressPools();
    }

    /**
     * Set the applicationGatewayBackendAddressPools property: Specifies an array of references to backend address pools
     * of application gateways. A virtual machine can reference backend address pools of multiple application gateways.
     * Multiple virtual machines cannot use the same application gateway.
     * 
     * @param applicationGatewayBackendAddressPools the applicationGatewayBackendAddressPools value to set.
     * @return the VirtualMachineNetworkInterfaceIpConfiguration object itself.
     */
    public VirtualMachineNetworkInterfaceIpConfiguration
        withApplicationGatewayBackendAddressPools(List<SubResource> applicationGatewayBackendAddressPools) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineNetworkInterfaceIpConfigurationProperties();
        }
        this.innerProperties().withApplicationGatewayBackendAddressPools(applicationGatewayBackendAddressPools);
        return this;
    }

    /**
     * Get the loadBalancerBackendAddressPools property: Specifies an array of references to backend address pools of
     * load balancers. A virtual machine can reference backend address pools of one public and one internal load
     * balancer. [Multiple virtual machines cannot use the same basic sku load balancer].
     * 
     * @return the loadBalancerBackendAddressPools value.
     */
    public List<SubResource> loadBalancerBackendAddressPools() {
        return this.innerProperties() == null ? null : this.innerProperties().loadBalancerBackendAddressPools();
    }

    /**
     * Set the loadBalancerBackendAddressPools property: Specifies an array of references to backend address pools of
     * load balancers. A virtual machine can reference backend address pools of one public and one internal load
     * balancer. [Multiple virtual machines cannot use the same basic sku load balancer].
     * 
     * @param loadBalancerBackendAddressPools the loadBalancerBackendAddressPools value to set.
     * @return the VirtualMachineNetworkInterfaceIpConfiguration object itself.
     */
    public VirtualMachineNetworkInterfaceIpConfiguration
        withLoadBalancerBackendAddressPools(List<SubResource> loadBalancerBackendAddressPools) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineNetworkInterfaceIpConfigurationProperties();
        }
        this.innerProperties().withLoadBalancerBackendAddressPools(loadBalancerBackendAddressPools);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property name in model VirtualMachineNetworkInterfaceIpConfiguration"));
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VirtualMachineNetworkInterfaceIpConfiguration.class);
}
