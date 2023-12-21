/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_04_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2018_04_01.ApplicationGatewayFirewallRuleSet;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response for ApplicationGatewayAvailableWafRuleSets API service call.
 */
public class ApplicationGatewayAvailableWafRuleSetsResultInner {
    /**
     * The list of application gateway rule sets.
     */
    @JsonProperty(value = "value")
    private List<ApplicationGatewayFirewallRuleSet> value;

    /**
     * Get the list of application gateway rule sets.
     *
     * @return the value value
     */
    public List<ApplicationGatewayFirewallRuleSet> value() {
        return this.value;
    }

    /**
     * Set the list of application gateway rule sets.
     *
     * @param value the value value to set
     * @return the ApplicationGatewayAvailableWafRuleSetsResultInner object itself.
     */
    public ApplicationGatewayAvailableWafRuleSetsResultInner withValue(List<ApplicationGatewayFirewallRuleSet> value) {
        this.value = value;
        return this;
    }

}
