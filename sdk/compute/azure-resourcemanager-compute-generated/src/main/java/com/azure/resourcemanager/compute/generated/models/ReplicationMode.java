// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Optional parameter which specifies the mode to be used for replication. This property is not updatable.
 */
public final class ReplicationMode extends ExpandableStringEnum<ReplicationMode> {
    /**
     * Static value Full for ReplicationMode.
     */
    public static final ReplicationMode FULL = fromString("Full");

    /**
     * Static value Shallow for ReplicationMode.
     */
    public static final ReplicationMode SHALLOW = fromString("Shallow");

    /**
     * Creates a new instance of ReplicationMode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ReplicationMode() {
    }

    /**
     * Creates or finds a ReplicationMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ReplicationMode.
     */
    @JsonCreator
    public static ReplicationMode fromString(String name) {
        return fromString(name, ReplicationMode.class);
    }

    /**
     * Gets known ReplicationMode values.
     * 
     * @return known ReplicationMode values.
     */
    public static Collection<ReplicationMode> values() {
        return values(ReplicationMode.class);
    }
}
