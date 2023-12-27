// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for ExpandTypesForListVMs.
 */
public final class ExpandTypesForListVMs extends ExpandableStringEnum<ExpandTypesForListVMs> {
    /**
     * Static value instanceView for ExpandTypesForListVMs.
     */
    public static final ExpandTypesForListVMs INSTANCE_VIEW = fromString("instanceView");

    /**
     * Creates a new instance of ExpandTypesForListVMs value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ExpandTypesForListVMs() {
    }

    /**
     * Creates or finds a ExpandTypesForListVMs from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ExpandTypesForListVMs.
     */
    @JsonCreator
    public static ExpandTypesForListVMs fromString(String name) {
        return fromString(name, ExpandTypesForListVMs.class);
    }

    /**
     * Gets known ExpandTypesForListVMs values.
     * 
     * @return known ExpandTypesForListVMs values.
     */
    public static Collection<ExpandTypesForListVMs> values() {
        return values(ExpandTypesForListVMs.class);
    }
}
