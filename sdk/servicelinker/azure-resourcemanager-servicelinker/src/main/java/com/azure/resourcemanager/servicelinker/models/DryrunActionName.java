// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The name of action for you dryrun job.
 */
public final class DryrunActionName extends ExpandableStringEnum<DryrunActionName> {
    /**
     * Static value createOrUpdate for DryrunActionName.
     */
    public static final DryrunActionName CREATE_OR_UPDATE = fromString("createOrUpdate");

    /**
     * Creates a new instance of DryrunActionName value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DryrunActionName() {
    }

    /**
     * Creates or finds a DryrunActionName from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DryrunActionName.
     */
    @JsonCreator
    public static DryrunActionName fromString(String name) {
        return fromString(name, DryrunActionName.class);
    }

    /**
     * Gets known DryrunActionName values.
     * 
     * @return known DryrunActionName values.
     */
    public static Collection<DryrunActionName> values() {
        return values(DryrunActionName.class);
    }
}
