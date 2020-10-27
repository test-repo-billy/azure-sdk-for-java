/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_04_15;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for OriginGroupResourceState.
 */
public final class OriginGroupResourceState extends ExpandableStringEnum<OriginGroupResourceState> {
    /** Static value Creating for OriginGroupResourceState. */
    public static final OriginGroupResourceState CREATING = fromString("Creating");

    /** Static value Active for OriginGroupResourceState. */
    public static final OriginGroupResourceState ACTIVE = fromString("Active");

    /** Static value Deleting for OriginGroupResourceState. */
    public static final OriginGroupResourceState DELETING = fromString("Deleting");

    /**
     * Creates or finds a OriginGroupResourceState from its string representation.
     * @param name a name to look for
     * @return the corresponding OriginGroupResourceState
     */
    @JsonCreator
    public static OriginGroupResourceState fromString(String name) {
        return fromString(name, OriginGroupResourceState.class);
    }

    /**
     * @return known OriginGroupResourceState values
     */
    public static Collection<OriginGroupResourceState> values() {
        return values(OriginGroupResourceState.class);
    }
}
