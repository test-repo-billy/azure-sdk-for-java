// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Connectivity analysis evaluation state.
 */
public final class EvaluationState extends ExpandableStringEnum<EvaluationState> {
    /**
     * Static value NotStarted for EvaluationState.
     */
    public static final EvaluationState NOT_STARTED = fromString("NotStarted");

    /**
     * Static value InProgress for EvaluationState.
     */
    public static final EvaluationState IN_PROGRESS = fromString("InProgress");

    /**
     * Static value Completed for EvaluationState.
     */
    public static final EvaluationState COMPLETED = fromString("Completed");

    /**
     * Creates a new instance of EvaluationState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EvaluationState() {
    }

    /**
     * Creates or finds a EvaluationState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding EvaluationState.
     */
    @JsonCreator
    public static EvaluationState fromString(String name) {
        return fromString(name, EvaluationState.class);
    }

    /**
     * Gets known EvaluationState values.
     * 
     * @return known EvaluationState values.
     */
    public static Collection<EvaluationState> values() {
        return values(EvaluationState.class);
    }
}
