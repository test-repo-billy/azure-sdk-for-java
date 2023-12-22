// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Whether or not to restrict outbound network access for this server. Value is optional but if passed in, must be
 * 'Enabled' or 'Disabled'.
 */
public final class ServerNetworkAccessFlag extends ExpandableStringEnum<ServerNetworkAccessFlag> {
    /**
     * Static value Enabled for ServerNetworkAccessFlag.
     */
    public static final ServerNetworkAccessFlag ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for ServerNetworkAccessFlag.
     */
    public static final ServerNetworkAccessFlag DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of ServerNetworkAccessFlag value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ServerNetworkAccessFlag() {
    }

    /**
     * Creates or finds a ServerNetworkAccessFlag from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ServerNetworkAccessFlag.
     */
    @JsonCreator
    public static ServerNetworkAccessFlag fromString(String name) {
        return fromString(name, ServerNetworkAccessFlag.class);
    }

    /**
     * Gets known ServerNetworkAccessFlag values.
     * 
     * @return known ServerNetworkAccessFlag values.
     */
    public static Collection<ServerNetworkAccessFlag> values() {
        return values(ServerNetworkAccessFlag.class);
    }
}
