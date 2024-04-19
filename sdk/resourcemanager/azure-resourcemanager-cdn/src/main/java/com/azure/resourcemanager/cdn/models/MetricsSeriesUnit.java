// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for MetricsSeriesUnit.
 */
public final class MetricsSeriesUnit extends ExpandableStringEnum<MetricsSeriesUnit> {
    /**
     * Static value count for MetricsSeriesUnit.
     */
    public static final MetricsSeriesUnit COUNT = fromString("count");

    /**
     * Static value bytes for MetricsSeriesUnit.
     */
    public static final MetricsSeriesUnit BYTES = fromString("bytes");

    /**
     * Static value bitsPerSecond for MetricsSeriesUnit.
     */
    public static final MetricsSeriesUnit BITS_PER_SECOND = fromString("bitsPerSecond");

    /**
     * Static value milliSeconds for MetricsSeriesUnit.
     */
    public static final MetricsSeriesUnit MILLI_SECONDS = fromString("milliSeconds");

    /**
     * Creates a new instance of MetricsSeriesUnit value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MetricsSeriesUnit() {
    }

    /**
     * Creates or finds a MetricsSeriesUnit from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding MetricsSeriesUnit.
     */
    @JsonCreator
    public static MetricsSeriesUnit fromString(String name) {
        return fromString(name, MetricsSeriesUnit.class);
    }

    /**
     * Gets known MetricsSeriesUnit values.
     * 
     * @return known MetricsSeriesUnit values.
     */
    public static Collection<MetricsSeriesUnit> values() {
        return values(MetricsSeriesUnit.class);
    }
}
