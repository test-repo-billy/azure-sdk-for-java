// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Network protocol this rule applies to.
 */
public final class SecurityConfigurationRuleProtocol extends ExpandableStringEnum<SecurityConfigurationRuleProtocol> {
    /**
     * Static value Tcp for SecurityConfigurationRuleProtocol.
     */
    public static final SecurityConfigurationRuleProtocol TCP = fromString("Tcp");

    /**
     * Static value Udp for SecurityConfigurationRuleProtocol.
     */
    public static final SecurityConfigurationRuleProtocol UDP = fromString("Udp");

    /**
     * Static value Icmp for SecurityConfigurationRuleProtocol.
     */
    public static final SecurityConfigurationRuleProtocol ICMP = fromString("Icmp");

    /**
     * Static value Esp for SecurityConfigurationRuleProtocol.
     */
    public static final SecurityConfigurationRuleProtocol ESP = fromString("Esp");

    /**
     * Static value Any for SecurityConfigurationRuleProtocol.
     */
    public static final SecurityConfigurationRuleProtocol ANY = fromString("Any");

    /**
     * Static value Ah for SecurityConfigurationRuleProtocol.
     */
    public static final SecurityConfigurationRuleProtocol AH = fromString("Ah");

    /**
     * Creates a new instance of SecurityConfigurationRuleProtocol value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SecurityConfigurationRuleProtocol() {
    }

    /**
     * Creates or finds a SecurityConfigurationRuleProtocol from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SecurityConfigurationRuleProtocol.
     */
    @JsonCreator
    public static SecurityConfigurationRuleProtocol fromString(String name) {
        return fromString(name, SecurityConfigurationRuleProtocol.class);
    }

    /**
     * Gets known SecurityConfigurationRuleProtocol values.
     * 
     * @return known SecurityConfigurationRuleProtocol values.
     */
    public static Collection<SecurityConfigurationRuleProtocol> values() {
        return values(SecurityConfigurationRuleProtocol.class);
    }
}
