// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Laterality discrepancy type.
 */
public final class LateralityDiscrepancyType extends ExpandableStringEnum<LateralityDiscrepancyType> {
    /**
     * Mismatch between order and text.
     */
    @Generated
    public static final LateralityDiscrepancyType ORDER_LATERALITY_MISMATCH = fromString("orderLateralityMismatch");

    /**
     * Contradiction in text.
     */
    @Generated
    public static final LateralityDiscrepancyType TEXT_LATERALITY_CONTRADICTION
        = fromString("textLateralityContradiction");

    /**
     * Missing laterality in text.
     */
    @Generated
    public static final LateralityDiscrepancyType TEXT_LATERALITY_MISSING = fromString("textLateralityMissing");

    /**
     * Creates a new instance of LateralityDiscrepancyType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public LateralityDiscrepancyType() {
    }

    /**
     * Creates or finds a LateralityDiscrepancyType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding LateralityDiscrepancyType.
     */
    @Generated
    @JsonCreator
    public static LateralityDiscrepancyType fromString(String name) {
        return fromString(name, LateralityDiscrepancyType.class);
    }

    /**
     * Gets known LateralityDiscrepancyType values.
     * 
     * @return known LateralityDiscrepancyType values.
     */
    @Generated
    public static Collection<LateralityDiscrepancyType> values() {
        return values(LateralityDiscrepancyType.class);
    }
}
