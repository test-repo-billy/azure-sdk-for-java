// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The protocol to use in test evaluation.
 */
public final class ConnectionMonitorTestConfigurationProtocol
    extends ExpandableStringEnum<ConnectionMonitorTestConfigurationProtocol> {
    /**
     * Static value Tcp for ConnectionMonitorTestConfigurationProtocol.
     */
    public static final ConnectionMonitorTestConfigurationProtocol TCP = fromString("Tcp");

    /**
     * Static value Http for ConnectionMonitorTestConfigurationProtocol.
     */
    public static final ConnectionMonitorTestConfigurationProtocol HTTP = fromString("Http");

    /**
     * Static value Icmp for ConnectionMonitorTestConfigurationProtocol.
     */
    public static final ConnectionMonitorTestConfigurationProtocol ICMP = fromString("Icmp");

    /**
     * Creates a new instance of ConnectionMonitorTestConfigurationProtocol value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ConnectionMonitorTestConfigurationProtocol() {
    }

    /**
     * Creates or finds a ConnectionMonitorTestConfigurationProtocol from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ConnectionMonitorTestConfigurationProtocol.
     */
    @JsonCreator
    public static ConnectionMonitorTestConfigurationProtocol fromString(String name) {
        return fromString(name, ConnectionMonitorTestConfigurationProtocol.class);
    }

    /**
     * Gets known ConnectionMonitorTestConfigurationProtocol values.
     * 
     * @return known ConnectionMonitorTestConfigurationProtocol values.
     */
    public static Collection<ConnectionMonitorTestConfigurationProtocol> values() {
        return values(ConnectionMonitorTestConfigurationProtocol.class);
    }
}
