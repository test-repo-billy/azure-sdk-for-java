// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The initial recommendation status of the machine group or machine.
 */
public final class RecommendationStatus extends ExpandableStringEnum<RecommendationStatus> {
    /**
     * Static value Recommended for RecommendationStatus.
     */
    public static final RecommendationStatus RECOMMENDED = fromString("Recommended");

    /**
     * Static value NotRecommended for RecommendationStatus.
     */
    public static final RecommendationStatus NOT_RECOMMENDED = fromString("NotRecommended");

    /**
     * Static value NotAvailable for RecommendationStatus.
     */
    public static final RecommendationStatus NOT_AVAILABLE = fromString("NotAvailable");

    /**
     * Static value NoStatus for RecommendationStatus.
     */
    public static final RecommendationStatus NO_STATUS = fromString("NoStatus");

    /**
     * Creates a new instance of RecommendationStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RecommendationStatus() {
    }

    /**
     * Creates or finds a RecommendationStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RecommendationStatus.
     */
    @JsonCreator
    public static RecommendationStatus fromString(String name) {
        return fromString(name, RecommendationStatus.class);
    }

    /**
     * Gets known RecommendationStatus values.
     * 
     * @return known RecommendationStatus values.
     */
    public static Collection<RecommendationStatus> values() {
        return values(RecommendationStatus.class);
    }
}
