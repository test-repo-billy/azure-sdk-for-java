// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Possible intrusion detection bypass traffic protocols.
 */
public final class FirewallPolicyIntrusionDetectionProtocol
    extends ExpandableStringEnum<FirewallPolicyIntrusionDetectionProtocol> {
    /**
     * Static value TCP for FirewallPolicyIntrusionDetectionProtocol.
     */
    public static final FirewallPolicyIntrusionDetectionProtocol TCP = fromString("TCP");

    /**
     * Static value UDP for FirewallPolicyIntrusionDetectionProtocol.
     */
    public static final FirewallPolicyIntrusionDetectionProtocol UDP = fromString("UDP");

    /**
     * Static value ICMP for FirewallPolicyIntrusionDetectionProtocol.
     */
    public static final FirewallPolicyIntrusionDetectionProtocol ICMP = fromString("ICMP");

    /**
     * Static value ANY for FirewallPolicyIntrusionDetectionProtocol.
     */
    public static final FirewallPolicyIntrusionDetectionProtocol ANY = fromString("ANY");

    /**
     * Creates a new instance of FirewallPolicyIntrusionDetectionProtocol value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public FirewallPolicyIntrusionDetectionProtocol() {
    }

    /**
     * Creates or finds a FirewallPolicyIntrusionDetectionProtocol from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding FirewallPolicyIntrusionDetectionProtocol.
     */
    @JsonCreator
    public static FirewallPolicyIntrusionDetectionProtocol fromString(String name) {
        return fromString(name, FirewallPolicyIntrusionDetectionProtocol.class);
    }

    /**
     * Gets known FirewallPolicyIntrusionDetectionProtocol values.
     * 
     * @return known FirewallPolicyIntrusionDetectionProtocol values.
     */
    public static Collection<FirewallPolicyIntrusionDetectionProtocol> values() {
        return values(FirewallPolicyIntrusionDetectionProtocol.class);
    }
}
