// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Access to be allowed or denied.
 */
public final class Access extends ExpandableStringEnum<Access> {
    /**
     * Static value Allow for Access.
     */
    public static final Access ALLOW = fromString("Allow");

    /**
     * Static value Deny for Access.
     */
    public static final Access DENY = fromString("Deny");

    /**
     * Creates a new instance of Access value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Access() {
    }

    /**
     * Creates or finds a Access from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding Access.
     */
    @JsonCreator
    public static Access fromString(String name) {
        return fromString(name, Access.class);
    }

    /**
     * Gets known Access values.
     * 
     * @return known Access values.
     */
    public static Collection<Access> values() {
        return values(Access.class);
    }
}
