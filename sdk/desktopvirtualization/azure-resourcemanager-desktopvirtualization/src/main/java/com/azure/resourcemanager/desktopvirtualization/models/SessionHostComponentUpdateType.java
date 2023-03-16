// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The type of maintenance for session host components. */
public final class SessionHostComponentUpdateType extends ExpandableStringEnum<SessionHostComponentUpdateType> {
    /** Static value Default for SessionHostComponentUpdateType. */
    public static final SessionHostComponentUpdateType DEFAULT = fromString("Default");

    /** Static value Scheduled for SessionHostComponentUpdateType. */
    public static final SessionHostComponentUpdateType SCHEDULED = fromString("Scheduled");

    /**
     * Creates a new instance of SessionHostComponentUpdateType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SessionHostComponentUpdateType() {
    }

    /**
     * Creates or finds a SessionHostComponentUpdateType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SessionHostComponentUpdateType.
     */
    @JsonCreator
    public static SessionHostComponentUpdateType fromString(String name) {
        return fromString(name, SessionHostComponentUpdateType.class);
    }

    /**
     * Gets known SessionHostComponentUpdateType values.
     *
     * @return known SessionHostComponentUpdateType values.
     */
    public static Collection<SessionHostComponentUpdateType> values() {
        return values(SessionHostComponentUpdateType.class);
    }
}
