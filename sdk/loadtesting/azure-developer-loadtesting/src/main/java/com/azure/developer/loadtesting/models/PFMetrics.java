// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.developer.loadtesting.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Metrics for pass/fail criteria.
 */
public final class PFMetrics extends ExpandableStringEnum<PFMetrics> {
    /**
     * Pass fail criteria for response time metric in milliseconds.
     */
    @Generated
    public static final PFMetrics RESPONSE_TIME_MS = fromString("response_time_ms");

    /**
     * Pass fail criteria for latency metric in milliseconds.
     */
    @Generated
    public static final PFMetrics LATENCY = fromString("latency");

    /**
     * Pass fail criteria for error metric.
     */
    @Generated
    public static final PFMetrics ERROR = fromString("error");

    /**
     * Pass fail criteria for total requests.
     */
    @Generated
    public static final PFMetrics REQUESTS = fromString("requests");

    /**
     * Pass fail criteria for request per second.
     */
    @Generated
    public static final PFMetrics REQUESTS_PER_SEC = fromString("requests_per_sec");

    /**
     * Creates a new instance of PFMetrics value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public PFMetrics() {
    }

    /**
     * Creates or finds a PFMetrics from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PFMetrics.
     */
    @Generated
    @JsonCreator
    public static PFMetrics fromString(String name) {
        return fromString(name, PFMetrics.class);
    }

    /**
     * Gets known PFMetrics values.
     * 
     * @return known PFMetrics values.
     */
    @Generated
    public static Collection<PFMetrics> values() {
        return values(PFMetrics.class);
    }
}
