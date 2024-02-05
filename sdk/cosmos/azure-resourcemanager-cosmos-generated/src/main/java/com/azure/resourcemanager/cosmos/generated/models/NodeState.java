// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The state of the node in Cassandra ring.
 */
public final class NodeState extends ExpandableStringEnum<NodeState> {
    /**
     * Static value Normal for NodeState.
     */
    public static final NodeState NORMAL = fromString("Normal");

    /**
     * Static value Leaving for NodeState.
     */
    public static final NodeState LEAVING = fromString("Leaving");

    /**
     * Static value Joining for NodeState.
     */
    public static final NodeState JOINING = fromString("Joining");

    /**
     * Static value Moving for NodeState.
     */
    public static final NodeState MOVING = fromString("Moving");

    /**
     * Static value Stopped for NodeState.
     */
    public static final NodeState STOPPED = fromString("Stopped");

    /**
     * Creates a new instance of NodeState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public NodeState() {
    }

    /**
     * Creates or finds a NodeState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding NodeState.
     */
    @JsonCreator
    public static NodeState fromString(String name) {
        return fromString(name, NodeState.class);
    }

    /**
     * Gets known NodeState values.
     * 
     * @return known NodeState values.
     */
    public static Collection<NodeState> values() {
        return values(NodeState.class);
    }
}
