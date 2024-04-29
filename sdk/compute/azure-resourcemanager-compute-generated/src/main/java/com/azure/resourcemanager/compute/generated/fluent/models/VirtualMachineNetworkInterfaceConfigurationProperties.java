// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.models.DeleteOptions;
import com.azure.resourcemanager.compute.generated.models.NetworkInterfaceAuxiliaryMode;
import com.azure.resourcemanager.compute.generated.models.NetworkInterfaceAuxiliarySku;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineNetworkInterfaceDnsSettingsConfiguration;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineNetworkInterfaceIpConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Describes a virtual machine network profile's IP configuration.
 */
@Fluent
public final class VirtualMachineNetworkInterfaceConfigurationProperties {
    /*
     * Specifies the primary network interface in case the virtual machine has more than 1 network interface.
     */
    @JsonProperty(value = "primary")
    private Boolean primary;

    /*
     * Specify what happens to the network interface when the VM is deleted
     */
    @JsonProperty(value = "deleteOption")
    private DeleteOptions deleteOption;

    /*
     * Specifies whether the network interface is accelerated networking-enabled.
     */
    @JsonProperty(value = "enableAcceleratedNetworking")
    private Boolean enableAcceleratedNetworking;

    /*
     * Specifies whether the network interface is disabled for tcp state tracking.
     */
    @JsonProperty(value = "disableTcpStateTracking")
    private Boolean disableTcpStateTracking;

    /*
     * Specifies whether the network interface is FPGA networking-enabled.
     */
    @JsonProperty(value = "enableFpga")
    private Boolean enableFpga;

    /*
     * Whether IP forwarding enabled on this NIC.
     */
    @JsonProperty(value = "enableIPForwarding")
    private Boolean enableIpForwarding;

    /*
     * The network security group.
     */
    @JsonProperty(value = "networkSecurityGroup")
    private SubResource networkSecurityGroup;

    /*
     * The dns settings to be applied on the network interfaces.
     */
    @JsonProperty(value = "dnsSettings")
    private VirtualMachineNetworkInterfaceDnsSettingsConfiguration dnsSettings;

    /*
     * Specifies the IP configurations of the network interface.
     */
    @JsonProperty(value = "ipConfigurations", required = true)
    private List<VirtualMachineNetworkInterfaceIpConfiguration> ipConfigurations;

    /*
     * The dscpConfiguration property.
     */
    @JsonProperty(value = "dscpConfiguration")
    private SubResource dscpConfiguration;

    /*
     * Specifies whether the Auxiliary mode is enabled for the Network Interface resource.
     */
    @JsonProperty(value = "auxiliaryMode")
    private NetworkInterfaceAuxiliaryMode auxiliaryMode;

    /*
     * Specifies whether the Auxiliary sku is enabled for the Network Interface resource.
     */
    @JsonProperty(value = "auxiliarySku")
    private NetworkInterfaceAuxiliarySku auxiliarySku;

    /**
     * Creates an instance of VirtualMachineNetworkInterfaceConfigurationProperties class.
     */
    public VirtualMachineNetworkInterfaceConfigurationProperties() {
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
     * @return the VirtualMachineNetworkInterfaceConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceConfigurationProperties withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Get the deleteOption property: Specify what happens to the network interface when the VM is deleted.
     * 
     * @return the deleteOption value.
     */
    public DeleteOptions deleteOption() {
        return this.deleteOption;
    }

    /**
     * Set the deleteOption property: Specify what happens to the network interface when the VM is deleted.
     * 
     * @param deleteOption the deleteOption value to set.
     * @return the VirtualMachineNetworkInterfaceConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceConfigurationProperties withDeleteOption(DeleteOptions deleteOption) {
        this.deleteOption = deleteOption;
        return this;
    }

    /**
     * Get the enableAcceleratedNetworking property: Specifies whether the network interface is accelerated
     * networking-enabled.
     * 
     * @return the enableAcceleratedNetworking value.
     */
    public Boolean enableAcceleratedNetworking() {
        return this.enableAcceleratedNetworking;
    }

    /**
     * Set the enableAcceleratedNetworking property: Specifies whether the network interface is accelerated
     * networking-enabled.
     * 
     * @param enableAcceleratedNetworking the enableAcceleratedNetworking value to set.
     * @return the VirtualMachineNetworkInterfaceConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceConfigurationProperties
        withEnableAcceleratedNetworking(Boolean enableAcceleratedNetworking) {
        this.enableAcceleratedNetworking = enableAcceleratedNetworking;
        return this;
    }

    /**
     * Get the disableTcpStateTracking property: Specifies whether the network interface is disabled for tcp state
     * tracking.
     * 
     * @return the disableTcpStateTracking value.
     */
    public Boolean disableTcpStateTracking() {
        return this.disableTcpStateTracking;
    }

    /**
     * Set the disableTcpStateTracking property: Specifies whether the network interface is disabled for tcp state
     * tracking.
     * 
     * @param disableTcpStateTracking the disableTcpStateTracking value to set.
     * @return the VirtualMachineNetworkInterfaceConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceConfigurationProperties
        withDisableTcpStateTracking(Boolean disableTcpStateTracking) {
        this.disableTcpStateTracking = disableTcpStateTracking;
        return this;
    }

    /**
     * Get the enableFpga property: Specifies whether the network interface is FPGA networking-enabled.
     * 
     * @return the enableFpga value.
     */
    public Boolean enableFpga() {
        return this.enableFpga;
    }

    /**
     * Set the enableFpga property: Specifies whether the network interface is FPGA networking-enabled.
     * 
     * @param enableFpga the enableFpga value to set.
     * @return the VirtualMachineNetworkInterfaceConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceConfigurationProperties withEnableFpga(Boolean enableFpga) {
        this.enableFpga = enableFpga;
        return this;
    }

    /**
     * Get the enableIpForwarding property: Whether IP forwarding enabled on this NIC.
     * 
     * @return the enableIpForwarding value.
     */
    public Boolean enableIpForwarding() {
        return this.enableIpForwarding;
    }

    /**
     * Set the enableIpForwarding property: Whether IP forwarding enabled on this NIC.
     * 
     * @param enableIpForwarding the enableIpForwarding value to set.
     * @return the VirtualMachineNetworkInterfaceConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceConfigurationProperties withEnableIpForwarding(Boolean enableIpForwarding) {
        this.enableIpForwarding = enableIpForwarding;
        return this;
    }

    /**
     * Get the networkSecurityGroup property: The network security group.
     * 
     * @return the networkSecurityGroup value.
     */
    public SubResource networkSecurityGroup() {
        return this.networkSecurityGroup;
    }

    /**
     * Set the networkSecurityGroup property: The network security group.
     * 
     * @param networkSecurityGroup the networkSecurityGroup value to set.
     * @return the VirtualMachineNetworkInterfaceConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceConfigurationProperties
        withNetworkSecurityGroup(SubResource networkSecurityGroup) {
        this.networkSecurityGroup = networkSecurityGroup;
        return this;
    }

    /**
     * Get the dnsSettings property: The dns settings to be applied on the network interfaces.
     * 
     * @return the dnsSettings value.
     */
    public VirtualMachineNetworkInterfaceDnsSettingsConfiguration dnsSettings() {
        return this.dnsSettings;
    }

    /**
     * Set the dnsSettings property: The dns settings to be applied on the network interfaces.
     * 
     * @param dnsSettings the dnsSettings value to set.
     * @return the VirtualMachineNetworkInterfaceConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceConfigurationProperties
        withDnsSettings(VirtualMachineNetworkInterfaceDnsSettingsConfiguration dnsSettings) {
        this.dnsSettings = dnsSettings;
        return this;
    }

    /**
     * Get the ipConfigurations property: Specifies the IP configurations of the network interface.
     * 
     * @return the ipConfigurations value.
     */
    public List<VirtualMachineNetworkInterfaceIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the ipConfigurations property: Specifies the IP configurations of the network interface.
     * 
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the VirtualMachineNetworkInterfaceConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceConfigurationProperties
        withIpConfigurations(List<VirtualMachineNetworkInterfaceIpConfiguration> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the dscpConfiguration property: The dscpConfiguration property.
     * 
     * @return the dscpConfiguration value.
     */
    public SubResource dscpConfiguration() {
        return this.dscpConfiguration;
    }

    /**
     * Set the dscpConfiguration property: The dscpConfiguration property.
     * 
     * @param dscpConfiguration the dscpConfiguration value to set.
     * @return the VirtualMachineNetworkInterfaceConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceConfigurationProperties withDscpConfiguration(SubResource dscpConfiguration) {
        this.dscpConfiguration = dscpConfiguration;
        return this;
    }

    /**
     * Get the auxiliaryMode property: Specifies whether the Auxiliary mode is enabled for the Network Interface
     * resource.
     * 
     * @return the auxiliaryMode value.
     */
    public NetworkInterfaceAuxiliaryMode auxiliaryMode() {
        return this.auxiliaryMode;
    }

    /**
     * Set the auxiliaryMode property: Specifies whether the Auxiliary mode is enabled for the Network Interface
     * resource.
     * 
     * @param auxiliaryMode the auxiliaryMode value to set.
     * @return the VirtualMachineNetworkInterfaceConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceConfigurationProperties
        withAuxiliaryMode(NetworkInterfaceAuxiliaryMode auxiliaryMode) {
        this.auxiliaryMode = auxiliaryMode;
        return this;
    }

    /**
     * Get the auxiliarySku property: Specifies whether the Auxiliary sku is enabled for the Network Interface resource.
     * 
     * @return the auxiliarySku value.
     */
    public NetworkInterfaceAuxiliarySku auxiliarySku() {
        return this.auxiliarySku;
    }

    /**
     * Set the auxiliarySku property: Specifies whether the Auxiliary sku is enabled for the Network Interface resource.
     * 
     * @param auxiliarySku the auxiliarySku value to set.
     * @return the VirtualMachineNetworkInterfaceConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceConfigurationProperties
        withAuxiliarySku(NetworkInterfaceAuxiliarySku auxiliarySku) {
        this.auxiliarySku = auxiliarySku;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dnsSettings() != null) {
            dnsSettings().validate();
        }
        if (ipConfigurations() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property ipConfigurations in model VirtualMachineNetworkInterfaceConfigurationProperties"));
        } else {
            ipConfigurations().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER
        = new ClientLogger(VirtualMachineNetworkInterfaceConfigurationProperties.class);
}
