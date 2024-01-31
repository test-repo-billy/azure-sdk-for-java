// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Status of the operation represented by the requested Id.
 */
public final class PurgeState extends ExpandableStringEnum<PurgeState> {
    /**
     * Static value pending for PurgeState.
     */
    public static final PurgeState PENDING = fromString("pending");

    /**
     * Static value completed for PurgeState.
     */
    public static final PurgeState COMPLETED = fromString("completed");

    /**
     * Creates a new instance of PurgeState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PurgeState() {
    }

    /**
     * Creates or finds a PurgeState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PurgeState.
     */
    @JsonCreator
    public static PurgeState fromString(String name) {
        return fromString(name, PurgeState.class);
    }

    /**
     * Gets known PurgeState values.
     * 
     * @return known PurgeState values.
     */
    public static Collection<PurgeState> values() {
        return values(PurgeState.class);
    }
}
