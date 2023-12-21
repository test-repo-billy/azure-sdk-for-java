// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Collection;

/** Defines values for EntityAvailabilityStatus. */
public final class EntityAvailabilityStatus extends ExpandableStringEnum<EntityAvailabilityStatus> {
    /** Static value Available for EntityAvailabilityStatus. */
    public static final EntityAvailabilityStatus AVAILABLE = fromString("Available");

    /** Static value Limited for EntityAvailabilityStatus. */
    public static final EntityAvailabilityStatus LIMITED = fromString("Limited");

    /** Static value Renaming for EntityAvailabilityStatus. */
    public static final EntityAvailabilityStatus RENAMING = fromString("Renaming");

    /** Static value Restoring for EntityAvailabilityStatus. */
    public static final EntityAvailabilityStatus RESTORING = fromString("Restoring");

    /** Static value Unknown for EntityAvailabilityStatus. */
    public static final EntityAvailabilityStatus UNKNOWN = fromString("Unknown");

    /**
     * Creates or finds a EntityAvailabilityStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EntityAvailabilityStatus.
     */
    @JsonCreator
    public static EntityAvailabilityStatus fromString(String name) {
        return fromString(name, EntityAvailabilityStatus.class);
    }

    /** @return known EntityAvailabilityStatus values. */
    public static Collection<EntityAvailabilityStatus> values() {
        return values(EntityAvailabilityStatus.class);
    }
}
