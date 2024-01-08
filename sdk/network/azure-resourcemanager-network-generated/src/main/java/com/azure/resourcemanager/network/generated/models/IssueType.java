// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The type of issue.
 */
public final class IssueType extends ExpandableStringEnum<IssueType> {
    /**
     * Static value Unknown for IssueType.
     */
    public static final IssueType UNKNOWN = fromString("Unknown");

    /**
     * Static value AgentStopped for IssueType.
     */
    public static final IssueType AGENT_STOPPED = fromString("AgentStopped");

    /**
     * Static value GuestFirewall for IssueType.
     */
    public static final IssueType GUEST_FIREWALL = fromString("GuestFirewall");

    /**
     * Static value DnsResolution for IssueType.
     */
    public static final IssueType DNS_RESOLUTION = fromString("DnsResolution");

    /**
     * Static value SocketBind for IssueType.
     */
    public static final IssueType SOCKET_BIND = fromString("SocketBind");

    /**
     * Static value NetworkSecurityRule for IssueType.
     */
    public static final IssueType NETWORK_SECURITY_RULE = fromString("NetworkSecurityRule");

    /**
     * Static value UserDefinedRoute for IssueType.
     */
    public static final IssueType USER_DEFINED_ROUTE = fromString("UserDefinedRoute");

    /**
     * Static value PortThrottled for IssueType.
     */
    public static final IssueType PORT_THROTTLED = fromString("PortThrottled");

    /**
     * Static value Platform for IssueType.
     */
    public static final IssueType PLATFORM = fromString("Platform");

    /**
     * Creates a new instance of IssueType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public IssueType() {
    }

    /**
     * Creates or finds a IssueType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding IssueType.
     */
    @JsonCreator
    public static IssueType fromString(String name) {
        return fromString(name, IssueType.class);
    }

    /**
     * Gets known IssueType values.
     * 
     * @return known IssueType values.
     */
    public static Collection<IssueType> values() {
        return values(IssueType.class);
    }
}
