// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Verbosity level.
 */
public final class VerbosityLevel extends ExpandableStringEnum<VerbosityLevel> {
    /**
     * Static value Normal for VerbosityLevel.
     */
    public static final VerbosityLevel NORMAL = fromString("Normal");

    /**
     * Static value Minimum for VerbosityLevel.
     */
    public static final VerbosityLevel MINIMUM = fromString("Minimum");

    /**
     * Static value Full for VerbosityLevel.
     */
    public static final VerbosityLevel FULL = fromString("Full");

    /**
     * Creates a new instance of VerbosityLevel value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VerbosityLevel() {
    }

    /**
     * Creates or finds a VerbosityLevel from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding VerbosityLevel.
     */
    @JsonCreator
    public static VerbosityLevel fromString(String name) {
        return fromString(name, VerbosityLevel.class);
    }

    /**
     * Gets known VerbosityLevel values.
     * 
     * @return known VerbosityLevel values.
     */
    public static Collection<VerbosityLevel> values() {
        return values(VerbosityLevel.class);
    }
}
