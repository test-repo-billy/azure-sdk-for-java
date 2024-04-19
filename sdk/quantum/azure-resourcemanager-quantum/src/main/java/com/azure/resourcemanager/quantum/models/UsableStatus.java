// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Whether the current workspace is ready to accept Jobs.
 */
public final class UsableStatus extends ExpandableStringEnum<UsableStatus> {
    /**
     * Static value Yes for UsableStatus.
     */
    public static final UsableStatus YES = fromString("Yes");

    /**
     * Static value No for UsableStatus.
     */
    public static final UsableStatus NO = fromString("No");

    /**
     * Static value Partial for UsableStatus.
     */
    public static final UsableStatus PARTIAL = fromString("Partial");

    /**
     * Creates a new instance of UsableStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public UsableStatus() {
    }

    /**
     * Creates or finds a UsableStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding UsableStatus.
     */
    @JsonCreator
    public static UsableStatus fromString(String name) {
        return fromString(name, UsableStatus.class);
    }

    /**
     * Gets known UsableStatus values.
     * 
     * @return known UsableStatus values.
     */
    public static Collection<UsableStatus> values() {
        return values(UsableStatus.class);
    }
}
