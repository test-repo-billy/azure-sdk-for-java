/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_08_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of a NAT rule.
 */
public class AzureFirewallNatRule {
    /**
     * Name of the NAT rule.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Description of the rule.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * List of source IP addresses for this rule.
     */
    @JsonProperty(value = "sourceAddresses")
    private List<String> sourceAddresses;

    /**
     * List of destination IP addresses for this rule.
     */
    @JsonProperty(value = "destinationAddresses")
    private List<String> destinationAddresses;

    /**
     * List of destination ports.
     */
    @JsonProperty(value = "destinationPorts")
    private List<String> destinationPorts;

    /**
     * Array of AzureFirewallNetworkRuleProtocols applicable to this NAT rule.
     */
    @JsonProperty(value = "protocols")
    private List<AzureFirewallNetworkRuleProtocol> protocols;

    /**
     * The translated address for this NAT rule.
     */
    @JsonProperty(value = "translatedAddress")
    private String translatedAddress;

    /**
     * The translated port for this NAT rule.
     */
    @JsonProperty(value = "translatedPort")
    private String translatedPort;

    /**
     * Get name of the NAT rule.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the NAT rule.
     *
     * @param name the name value to set
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get description of the rule.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of the rule.
     *
     * @param description the description value to set
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get list of source IP addresses for this rule.
     *
     * @return the sourceAddresses value
     */
    public List<String> sourceAddresses() {
        return this.sourceAddresses;
    }

    /**
     * Set list of source IP addresses for this rule.
     *
     * @param sourceAddresses the sourceAddresses value to set
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withSourceAddresses(List<String> sourceAddresses) {
        this.sourceAddresses = sourceAddresses;
        return this;
    }

    /**
     * Get list of destination IP addresses for this rule.
     *
     * @return the destinationAddresses value
     */
    public List<String> destinationAddresses() {
        return this.destinationAddresses;
    }

    /**
     * Set list of destination IP addresses for this rule.
     *
     * @param destinationAddresses the destinationAddresses value to set
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withDestinationAddresses(List<String> destinationAddresses) {
        this.destinationAddresses = destinationAddresses;
        return this;
    }

    /**
     * Get list of destination ports.
     *
     * @return the destinationPorts value
     */
    public List<String> destinationPorts() {
        return this.destinationPorts;
    }

    /**
     * Set list of destination ports.
     *
     * @param destinationPorts the destinationPorts value to set
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withDestinationPorts(List<String> destinationPorts) {
        this.destinationPorts = destinationPorts;
        return this;
    }

    /**
     * Get array of AzureFirewallNetworkRuleProtocols applicable to this NAT rule.
     *
     * @return the protocols value
     */
    public List<AzureFirewallNetworkRuleProtocol> protocols() {
        return this.protocols;
    }

    /**
     * Set array of AzureFirewallNetworkRuleProtocols applicable to this NAT rule.
     *
     * @param protocols the protocols value to set
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withProtocols(List<AzureFirewallNetworkRuleProtocol> protocols) {
        this.protocols = protocols;
        return this;
    }

    /**
     * Get the translated address for this NAT rule.
     *
     * @return the translatedAddress value
     */
    public String translatedAddress() {
        return this.translatedAddress;
    }

    /**
     * Set the translated address for this NAT rule.
     *
     * @param translatedAddress the translatedAddress value to set
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withTranslatedAddress(String translatedAddress) {
        this.translatedAddress = translatedAddress;
        return this;
    }

    /**
     * Get the translated port for this NAT rule.
     *
     * @return the translatedPort value
     */
    public String translatedPort() {
        return this.translatedPort;
    }

    /**
     * Set the translated port for this NAT rule.
     *
     * @param translatedPort the translatedPort value to set
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withTranslatedPort(String translatedPort) {
        this.translatedPort = translatedPort;
        return this;
    }

}
