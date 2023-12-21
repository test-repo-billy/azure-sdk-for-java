// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Status. */
public final class Status extends ExpandableStringEnum<Status> {
    /** Static value NotStarted for Status. */
    public static final Status NOT_STARTED = fromString("NotStarted");

    /** Static value InProgress for Status. */
    public static final Status IN_PROGRESS = fromString("InProgress");

    /** Static value SlowedDown for Status. */
    public static final Status SLOWED_DOWN = fromString("SlowedDown");

    /** Static value Completed for Status. */
    public static final Status COMPLETED = fromString("Completed");

    /** Static value Failed for Status. */
    public static final Status FAILED = fromString("Failed");

    /** Static value Canceled for Status. */
    public static final Status CANCELED = fromString("Canceled");

    /**
     * Creates or finds a Status from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Status.
     */
    @JsonCreator
    public static Status fromString(String name) {
        return fromString(name, Status.class);
    }

    /**
     * Gets known Status values.
     *
     * @return known Status values.
     */
    public static Collection<Status> values() {
        return values(Status.class);
    }
}
