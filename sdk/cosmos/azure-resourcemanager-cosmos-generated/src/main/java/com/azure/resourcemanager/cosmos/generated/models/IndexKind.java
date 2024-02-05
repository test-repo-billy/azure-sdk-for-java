// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Indicates the type of index.
 */
public final class IndexKind extends ExpandableStringEnum<IndexKind> {
    /**
     * Static value Hash for IndexKind.
     */
    public static final IndexKind HASH = fromString("Hash");

    /**
     * Static value Range for IndexKind.
     */
    public static final IndexKind RANGE = fromString("Range");

    /**
     * Static value Spatial for IndexKind.
     */
    public static final IndexKind SPATIAL = fromString("Spatial");

    /**
     * Creates a new instance of IndexKind value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public IndexKind() {
    }

    /**
     * Creates or finds a IndexKind from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding IndexKind.
     */
    @JsonCreator
    public static IndexKind fromString(String name) {
        return fromString(name, IndexKind.class);
    }

    /**
     * Gets known IndexKind values.
     * 
     * @return known IndexKind values.
     */
    public static Collection<IndexKind> values() {
        return values(IndexKind.class);
    }
}
