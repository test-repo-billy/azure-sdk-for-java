// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Defines a function that boosts scores based on the magnitude of a numeric
 * field.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("magnitude")
@Fluent
public final class MagnitudeScoringFunction extends ScoringFunction {
    /*
     * Parameter values for the magnitude scoring function.
     */
    @JsonProperty(value = "magnitude", required = true)
    private MagnitudeScoringParameters parameters;

    /**
     * Get the parameters property: Parameter values for the magnitude scoring
     * function.
     *
     * @return the parameters value.
     */
    public MagnitudeScoringParameters getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Parameter values for the magnitude scoring
     * function.
     *
     * @param parameters the parameters value to set.
     * @return the MagnitudeScoringFunction object itself.
     */
    public MagnitudeScoringFunction setParameters(MagnitudeScoringParameters parameters) {
        this.parameters = parameters;
        return this;
    }
}
