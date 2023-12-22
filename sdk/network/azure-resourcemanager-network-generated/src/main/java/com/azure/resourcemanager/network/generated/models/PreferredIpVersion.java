// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The preferred IP version to use in test evaluation. The connection monitor may choose to use a different version
 * depending on other parameters.
 */
public final class PreferredIpVersion extends ExpandableStringEnum<PreferredIpVersion> {
    /**
     * Static value IPv4 for PreferredIpVersion.
     */
    public static final PreferredIpVersion IPV4 = fromString("IPv4");

    /**
     * Static value IPv6 for PreferredIpVersion.
     */
    public static final PreferredIpVersion IPV6 = fromString("IPv6");

    /**
     * Creates a new instance of PreferredIpVersion value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PreferredIpVersion() {
    }

    /**
     * Creates or finds a PreferredIpVersion from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PreferredIpVersion.
     */
    @JsonCreator
    public static PreferredIpVersion fromString(String name) {
        return fromString(name, PreferredIpVersion.class);
    }

    /**
     * Gets known PreferredIpVersion values.
     * 
     * @return known PreferredIpVersion values.
     */
    public static Collection<PreferredIpVersion> values() {
        return values(PreferredIpVersion.class);
    }
}
