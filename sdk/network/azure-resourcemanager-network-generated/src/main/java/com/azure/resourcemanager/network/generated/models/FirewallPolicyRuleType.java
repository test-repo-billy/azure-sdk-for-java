// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Rule Type.
 */
public final class FirewallPolicyRuleType extends ExpandableStringEnum<FirewallPolicyRuleType> {
    /**
     * Static value ApplicationRule for FirewallPolicyRuleType.
     */
    public static final FirewallPolicyRuleType APPLICATION_RULE = fromString("ApplicationRule");

    /**
     * Static value NetworkRule for FirewallPolicyRuleType.
     */
    public static final FirewallPolicyRuleType NETWORK_RULE = fromString("NetworkRule");

    /**
     * Static value NatRule for FirewallPolicyRuleType.
     */
    public static final FirewallPolicyRuleType NAT_RULE = fromString("NatRule");

    /**
     * Creates a new instance of FirewallPolicyRuleType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public FirewallPolicyRuleType() {
    }

    /**
     * Creates or finds a FirewallPolicyRuleType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding FirewallPolicyRuleType.
     */
    @JsonCreator
    public static FirewallPolicyRuleType fromString(String name) {
        return fromString(name, FirewallPolicyRuleType.class);
    }

    /**
     * Gets known FirewallPolicyRuleType values.
     * 
     * @return known FirewallPolicyRuleType values.
     */
    public static Collection<FirewallPolicyRuleType> values() {
        return values(FirewallPolicyRuleType.class);
    }
}
