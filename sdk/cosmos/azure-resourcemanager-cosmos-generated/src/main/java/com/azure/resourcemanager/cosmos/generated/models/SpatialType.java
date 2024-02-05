// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Indicates the spatial type of index.
 */
public final class SpatialType extends ExpandableStringEnum<SpatialType> {
    /**
     * Static value Point for SpatialType.
     */
    public static final SpatialType POINT = fromString("Point");

    /**
     * Static value LineString for SpatialType.
     */
    public static final SpatialType LINE_STRING = fromString("LineString");

    /**
     * Static value Polygon for SpatialType.
     */
    public static final SpatialType POLYGON = fromString("Polygon");

    /**
     * Static value MultiPolygon for SpatialType.
     */
    public static final SpatialType MULTI_POLYGON = fromString("MultiPolygon");

    /**
     * Creates a new instance of SpatialType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SpatialType() {
    }

    /**
     * Creates or finds a SpatialType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SpatialType.
     */
    @JsonCreator
    public static SpatialType fromString(String name) {
        return fromString(name, SpatialType.class);
    }

    /**
     * Gets known SpatialType values.
     * 
     * @return known SpatialType values.
     */
    public static Collection<SpatialType> values() {
        return values(SpatialType.class);
    }
}
