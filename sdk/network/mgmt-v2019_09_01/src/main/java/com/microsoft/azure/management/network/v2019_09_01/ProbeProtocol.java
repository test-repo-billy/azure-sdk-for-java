/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ProbeProtocol.
 */
public final class ProbeProtocol extends ExpandableStringEnum<ProbeProtocol> {
    /** Static value Http for ProbeProtocol. */
    public static final ProbeProtocol HTTP = fromString("Http");

    /** Static value Tcp for ProbeProtocol. */
    public static final ProbeProtocol TCP = fromString("Tcp");

    /** Static value Https for ProbeProtocol. */
    public static final ProbeProtocol HTTPS = fromString("Https");

    /**
     * Creates or finds a ProbeProtocol from its string representation.
     * @param name a name to look for
     * @return the corresponding ProbeProtocol
     */
    @JsonCreator
    public static ProbeProtocol fromString(String name) {
        return fromString(name, ProbeProtocol.class);
    }

    /**
     * @return known ProbeProtocol values
     */
    public static Collection<ProbeProtocol> values() {
        return values(ProbeProtocol.class);
    }
}
