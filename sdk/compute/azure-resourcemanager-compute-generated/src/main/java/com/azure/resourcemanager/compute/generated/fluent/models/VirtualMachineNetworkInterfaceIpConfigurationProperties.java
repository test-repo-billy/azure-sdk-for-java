// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.compute.generated.models.IpVersions;
import com.azure.resourcemanager.compute.generated.models.VirtualMachinePublicIpAddressConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Describes a virtual machine network interface IP configuration properties.
 */
@Fluent
public final class VirtualMachineNetworkInterfaceIpConfigurationProperties {
    /*
     * Specifies the identifier of the subnet.
     */
    @JsonProperty(value = "subnet")
    private SubResource subnet;

    /*
     * Specifies the primary network interface in case the virtual machine has more than 1 network interface.
     */
    @JsonProperty(value = "primary")
    private Boolean primary;

    /*
     * The publicIPAddressConfiguration.
     */
    @JsonProperty(value = "publicIPAddressConfiguration")
    private VirtualMachinePublicIpAddressConfiguration publicIpAddressConfiguration;

    /*
     * Available from Api-Version 2017-03-30 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4.  Possible values are: 'IPv4' and 'IPv6'.
     */
    @JsonProperty(value = "privateIPAddressVersion")
    private IpVersions privateIpAddressVersion;

    /*
     * Specifies an array of references to application security group.
     */
    @JsonProperty(value = "applicationSecurityGroups")
    private List<SubResource> applicationSecurityGroups;

    /*
     * Specifies an array of references to backend address pools of application gateways. A virtual machine can reference backend address pools of multiple application gateways. Multiple virtual machines cannot use the same application gateway.
     */
    @JsonProperty(value = "applicationGatewayBackendAddressPools")
    private List<SubResource> applicationGatewayBackendAddressPools;

    /*
     * Specifies an array of references to backend address pools of load balancers. A virtual machine can reference backend address pools of one public and one internal load balancer. [Multiple virtual machines cannot use the same basic sku load balancer].
     */
    @JsonProperty(value = "loadBalancerBackendAddressPools")
    private List<SubResource> loadBalancerBackendAddressPools;

    /**
     * Creates an instance of VirtualMachineNetworkInterfaceIpConfigurationProperties class.
     */
    public VirtualMachineNetworkInterfaceIpConfigurationProperties() {
    }

    /**
     * Get the subnet property: Specifies the identifier of the subnet.
     * 
     * @return the subnet value.
     */
    public SubResource subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: Specifies the identifier of the subnet.
     * 
     * @param subnet the subnet value to set.
     * @return the VirtualMachineNetworkInterfaceIpConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceIpConfigurationProperties withSubnet(SubResource subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the primary property: Specifies the primary network interface in case the virtual machine has more than 1
     * network interface.
     * 
     * @return the primary value.
     */
    public Boolean primary() {
        return this.primary;
    }

    /**
     * Set the primary property: Specifies the primary network interface in case the virtual machine has more than 1
     * network interface.
     * 
     * @param primary the primary value to set.
     * @return the VirtualMachineNetworkInterfaceIpConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceIpConfigurationProperties withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Get the publicIpAddressConfiguration property: The publicIPAddressConfiguration.
     * 
     * @return the publicIpAddressConfiguration value.
     */
    public VirtualMachinePublicIpAddressConfiguration publicIpAddressConfiguration() {
        return this.publicIpAddressConfiguration;
    }

    /**
     * Set the publicIpAddressConfiguration property: The publicIPAddressConfiguration.
     * 
     * @param publicIpAddressConfiguration the publicIpAddressConfiguration value to set.
     * @return the VirtualMachineNetworkInterfaceIpConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceIpConfigurationProperties
        withPublicIpAddressConfiguration(VirtualMachinePublicIpAddressConfiguration publicIpAddressConfiguration) {
        this.publicIpAddressConfiguration = publicIpAddressConfiguration;
        return this;
    }

    /**
     * Get the privateIpAddressVersion property: Available from Api-Version 2017-03-30 onwards, it represents whether
     * the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     * 
     * @return the privateIpAddressVersion value.
     */
    public IpVersions privateIpAddressVersion() {
        return this.privateIpAddressVersion;
    }

    /**
     * Set the privateIpAddressVersion property: Available from Api-Version 2017-03-30 onwards, it represents whether
     * the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     * 
     * @param privateIpAddressVersion the privateIpAddressVersion value to set.
     * @return the VirtualMachineNetworkInterfaceIpConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceIpConfigurationProperties
        withPrivateIpAddressVersion(IpVersions privateIpAddressVersion) {
        this.privateIpAddressVersion = privateIpAddressVersion;
        return this;
    }

    /**
     * Get the applicationSecurityGroups property: Specifies an array of references to application security group.
     * 
     * @return the applicationSecurityGroups value.
     */
    public List<SubResource> applicationSecurityGroups() {
        return this.applicationSecurityGroups;
    }

    /**
     * Set the applicationSecurityGroups property: Specifies an array of references to application security group.
     * 
     * @param applicationSecurityGroups the applicationSecurityGroups value to set.
     * @return the VirtualMachineNetworkInterfaceIpConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceIpConfigurationProperties
        withApplicationSecurityGroups(List<SubResource> applicationSecurityGroups) {
        this.applicationSecurityGroups = applicationSecurityGroups;
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
        return this.applicationGatewayBackendAddressPools;
    }

    /**
     * Set the applicationGatewayBackendAddressPools property: Specifies an array of references to backend address pools
     * of application gateways. A virtual machine can reference backend address pools of multiple application gateways.
     * Multiple virtual machines cannot use the same application gateway.
     * 
     * @param applicationGatewayBackendAddressPools the applicationGatewayBackendAddressPools value to set.
     * @return the VirtualMachineNetworkInterfaceIpConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceIpConfigurationProperties
        withApplicationGatewayBackendAddressPools(List<SubResource> applicationGatewayBackendAddressPools) {
        this.applicationGatewayBackendAddressPools = applicationGatewayBackendAddressPools;
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
        return this.loadBalancerBackendAddressPools;
    }

    /**
     * Set the loadBalancerBackendAddressPools property: Specifies an array of references to backend address pools of
     * load balancers. A virtual machine can reference backend address pools of one public and one internal load
     * balancer. [Multiple virtual machines cannot use the same basic sku load balancer].
     * 
     * @param loadBalancerBackendAddressPools the loadBalancerBackendAddressPools value to set.
     * @return the VirtualMachineNetworkInterfaceIpConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceIpConfigurationProperties
        withLoadBalancerBackendAddressPools(List<SubResource> loadBalancerBackendAddressPools) {
        this.loadBalancerBackendAddressPools = loadBalancerBackendAddressPools;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (publicIpAddressConfiguration() != null) {
            publicIpAddressConfiguration().validate();
        }
    }
}
