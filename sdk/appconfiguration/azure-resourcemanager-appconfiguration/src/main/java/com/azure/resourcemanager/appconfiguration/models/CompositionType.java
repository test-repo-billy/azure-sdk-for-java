// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The composition type describes how the key-values within the snapshot are composed. The 'key' composition type
 * ensures there are no two key-values containing the same key. The 'key_label' composition type ensures there are no
 * two key-values containing the same key and label.
 */
public final class CompositionType extends ExpandableStringEnum<CompositionType> {
    /**
     * Static value Key for CompositionType.
     */
    public static final CompositionType KEY = fromString("Key");

    /**
     * Static value Key_Label for CompositionType.
     */
    public static final CompositionType KEY_LABEL = fromString("Key_Label");

    /**
     * Creates a new instance of CompositionType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CompositionType() {
    }

    /**
     * Creates or finds a CompositionType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CompositionType.
     */
    @JsonCreator
    public static CompositionType fromString(String name) {
        return fromString(name, CompositionType.class);
    }

    /**
     * Gets known CompositionType values.
     * 
     * @return known CompositionType values.
     */
    public static Collection<CompositionType> values() {
        return values(CompositionType.class);
    }
}
