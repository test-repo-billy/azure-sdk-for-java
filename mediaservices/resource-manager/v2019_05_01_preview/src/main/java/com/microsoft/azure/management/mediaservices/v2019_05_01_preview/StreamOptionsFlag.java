/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for StreamOptionsFlag.
 */
public final class StreamOptionsFlag extends ExpandableStringEnum<StreamOptionsFlag> {
    /** Static value Default for StreamOptionsFlag. */
    public static final StreamOptionsFlag DEFAULT = fromString("Default");

    /** Static value LowLatency for StreamOptionsFlag. */
    public static final StreamOptionsFlag LOW_LATENCY = fromString("LowLatency");

    /**
     * Creates or finds a StreamOptionsFlag from its string representation.
     * @param name a name to look for
     * @return the corresponding StreamOptionsFlag
     */
    @JsonCreator
    public static StreamOptionsFlag fromString(String name) {
        return fromString(name, StreamOptionsFlag.class);
    }

    /**
     * @return known StreamOptionsFlag values
     */
    public static Collection<StreamOptionsFlag> values() {
        return values(StreamOptionsFlag.class);
    }
}
