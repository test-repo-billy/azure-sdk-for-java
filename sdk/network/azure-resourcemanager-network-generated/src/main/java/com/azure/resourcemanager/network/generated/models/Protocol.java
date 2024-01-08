// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Network protocol.
 */
public final class Protocol extends ExpandableStringEnum<Protocol> {
    /**
     * Static value Tcp for Protocol.
     */
    public static final Protocol TCP = fromString("Tcp");

    /**
     * Static value Http for Protocol.
     */
    public static final Protocol HTTP = fromString("Http");

    /**
     * Static value Https for Protocol.
     */
    public static final Protocol HTTPS = fromString("Https");

    /**
     * Static value Icmp for Protocol.
     */
    public static final Protocol ICMP = fromString("Icmp");

    /**
     * Creates a new instance of Protocol value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Protocol() {
    }

    /**
     * Creates or finds a Protocol from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding Protocol.
     */
    @JsonCreator
    public static Protocol fromString(String name) {
        return fromString(name, Protocol.class);
    }

    /**
     * Gets known Protocol values.
     * 
     * @return known Protocol values.
     */
    public static Collection<Protocol> values() {
        return values(Protocol.class);
    }
}
