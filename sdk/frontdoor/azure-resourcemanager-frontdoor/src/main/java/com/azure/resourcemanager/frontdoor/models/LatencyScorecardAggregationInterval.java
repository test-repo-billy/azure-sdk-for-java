// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for LatencyScorecardAggregationInterval.
 */
public final class LatencyScorecardAggregationInterval
    extends ExpandableStringEnum<LatencyScorecardAggregationInterval> {
    /**
     * Static value Daily for LatencyScorecardAggregationInterval.
     */
    public static final LatencyScorecardAggregationInterval DAILY = fromString("Daily");

    /**
     * Static value Weekly for LatencyScorecardAggregationInterval.
     */
    public static final LatencyScorecardAggregationInterval WEEKLY = fromString("Weekly");

    /**
     * Static value Monthly for LatencyScorecardAggregationInterval.
     */
    public static final LatencyScorecardAggregationInterval MONTHLY = fromString("Monthly");

    /**
     * Creates a new instance of LatencyScorecardAggregationInterval value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LatencyScorecardAggregationInterval() {
    }

    /**
     * Creates or finds a LatencyScorecardAggregationInterval from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding LatencyScorecardAggregationInterval.
     */
    @JsonCreator
    public static LatencyScorecardAggregationInterval fromString(String name) {
        return fromString(name, LatencyScorecardAggregationInterval.class);
    }

    /**
     * Gets known LatencyScorecardAggregationInterval values.
     * 
     * @return known LatencyScorecardAggregationInterval values.
     */
    public static Collection<LatencyScorecardAggregationInterval> values() {
        return values(LatencyScorecardAggregationInterval.class);
    }
}
