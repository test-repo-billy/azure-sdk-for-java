// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a virtual machines network configuration's DNS settings.
 */
@Fluent
public final class VirtualMachinePublicIpAddressDnsSettingsConfiguration {
    /*
     * The Domain name label prefix of the PublicIPAddress resources that will be created. The generated name label is
     * the concatenation of the domain name label and vm network profile unique ID.
     */
    @JsonProperty(value = "domainNameLabel", required = true)
    private String domainNameLabel;

    /*
     * The Domain name label scope of the PublicIPAddress resources that will be created. The generated name label is
     * the concatenation of the hashed domain name label with policy according to the domain name label scope and vm
     * network profile unique ID.
     */
    @JsonProperty(value = "domainNameLabelScope")
    private DomainNameLabelScopeTypes domainNameLabelScope;

    /**
     * Creates an instance of VirtualMachinePublicIpAddressDnsSettingsConfiguration class.
     */
    public VirtualMachinePublicIpAddressDnsSettingsConfiguration() {
    }

    /**
     * Get the domainNameLabel property: The Domain name label prefix of the PublicIPAddress resources that will be
     * created. The generated name label is the concatenation of the domain name label and vm network profile unique
     * ID.
     * 
     * @return the domainNameLabel value.
     */
    public String domainNameLabel() {
        return this.domainNameLabel;
    }

    /**
     * Set the domainNameLabel property: The Domain name label prefix of the PublicIPAddress resources that will be
     * created. The generated name label is the concatenation of the domain name label and vm network profile unique
     * ID.
     * 
     * @param domainNameLabel the domainNameLabel value to set.
     * @return the VirtualMachinePublicIpAddressDnsSettingsConfiguration object itself.
     */
    public VirtualMachinePublicIpAddressDnsSettingsConfiguration withDomainNameLabel(String domainNameLabel) {
        this.domainNameLabel = domainNameLabel;
        return this;
    }

    /**
     * Get the domainNameLabelScope property: The Domain name label scope of the PublicIPAddress resources that will be
     * created. The generated name label is the concatenation of the hashed domain name label with policy according to
     * the domain name label scope and vm network profile unique ID.
     * 
     * @return the domainNameLabelScope value.
     */
    public DomainNameLabelScopeTypes domainNameLabelScope() {
        return this.domainNameLabelScope;
    }

    /**
     * Set the domainNameLabelScope property: The Domain name label scope of the PublicIPAddress resources that will be
     * created. The generated name label is the concatenation of the hashed domain name label with policy according to
     * the domain name label scope and vm network profile unique ID.
     * 
     * @param domainNameLabelScope the domainNameLabelScope value to set.
     * @return the VirtualMachinePublicIpAddressDnsSettingsConfiguration object itself.
     */
    public VirtualMachinePublicIpAddressDnsSettingsConfiguration
        withDomainNameLabelScope(DomainNameLabelScopeTypes domainNameLabelScope) {
        this.domainNameLabelScope = domainNameLabelScope;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (domainNameLabel() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property domainNameLabel in model VirtualMachinePublicIpAddressDnsSettingsConfiguration"));
        }
    }

    private static final ClientLogger LOGGER
        = new ClientLogger(VirtualMachinePublicIpAddressDnsSettingsConfiguration.class);
}
