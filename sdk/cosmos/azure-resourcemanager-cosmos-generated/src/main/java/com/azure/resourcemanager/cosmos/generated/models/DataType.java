// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The datatype for which the indexing behavior is applied to.
 */
public final class DataType extends ExpandableStringEnum<DataType> {
    /**
     * Static value String for DataType.
     */
    public static final DataType STRING = fromString("String");

    /**
     * Static value Number for DataType.
     */
    public static final DataType NUMBER = fromString("Number");

    /**
     * Static value Point for DataType.
     */
    public static final DataType POINT = fromString("Point");

    /**
     * Static value Polygon for DataType.
     */
    public static final DataType POLYGON = fromString("Polygon");

    /**
     * Static value LineString for DataType.
     */
    public static final DataType LINE_STRING = fromString("LineString");

    /**
     * Static value MultiPolygon for DataType.
     */
    public static final DataType MULTI_POLYGON = fromString("MultiPolygon");

    /**
     * Creates a new instance of DataType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DataType() {
    }

    /**
     * Creates or finds a DataType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DataType.
     */
    @JsonCreator
    public static DataType fromString(String name) {
        return fromString(name, DataType.class);
    }

    /**
     * Gets known DataType values.
     * 
     * @return known DataType values.
     */
    public static Collection<DataType> values() {
        return values(DataType.class);
    }
}
