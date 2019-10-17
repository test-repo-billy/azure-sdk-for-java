/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Firewall Policy NAT Rule.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ruleType")
@JsonTypeName("FirewallPolicyNatRule")
public class FirewallPolicyNatRule extends FirewallPolicyRule {
    /**
     * The action type of a Nat rule.
     */
    @JsonProperty(value = "action")
    private FirewallPolicyNatRuleAction action;

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
     * The match conditions for incoming traffic.
     */
    @JsonProperty(value = "ruleCondition")
    private FirewallPolicyRuleCondition ruleCondition;

    /**
     * Get the action type of a Nat rule.
     *
     * @return the action value
     */
    public FirewallPolicyNatRuleAction action() {
        return this.action;
    }

    /**
     * Set the action type of a Nat rule.
     *
     * @param action the action value to set
     * @return the FirewallPolicyNatRule object itself.
     */
    public FirewallPolicyNatRule withAction(FirewallPolicyNatRuleAction action) {
        this.action = action;
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
     * @return the FirewallPolicyNatRule object itself.
     */
    public FirewallPolicyNatRule withTranslatedAddress(String translatedAddress) {
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
     * @return the FirewallPolicyNatRule object itself.
     */
    public FirewallPolicyNatRule withTranslatedPort(String translatedPort) {
        this.translatedPort = translatedPort;
        return this;
    }

    /**
     * Get the match conditions for incoming traffic.
     *
     * @return the ruleCondition value
     */
    public FirewallPolicyRuleCondition ruleCondition() {
        return this.ruleCondition;
    }

    /**
     * Set the match conditions for incoming traffic.
     *
     * @param ruleCondition the ruleCondition value to set
     * @return the FirewallPolicyNatRule object itself.
     */
    public FirewallPolicyNatRule withRuleCondition(FirewallPolicyRuleCondition ruleCondition) {
        this.ruleCondition = ruleCondition;
        return this;
    }

}
