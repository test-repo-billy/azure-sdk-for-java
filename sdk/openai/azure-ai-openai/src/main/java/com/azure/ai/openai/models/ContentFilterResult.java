// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about filtered content severity level and if it has been filtered or not.
 */
@Immutable
public final class ContentFilterResult {

    /*
     * Ratings for the intensity and risk level of filtered content.
     */
    @Generated
    @JsonProperty(value = "severity")
    private final ContentFilterSeverity severity;

    /*
     * A value indicating whether or not the content has been filtered.
     */
    @Generated
    @JsonProperty(value = "filtered")
    private final boolean filtered;

    /**
     * Get the severity property: Ratings for the intensity and risk level of filtered content.
     *
     * @return the severity value.
     */
    @Generated
    public ContentFilterSeverity getSeverity() {
        return this.severity;
    }

    /**
     * Get the filtered property: A value indicating whether or not the content has been filtered.
     *
     * @return the filtered value.
     */
    @Generated
    public boolean isFiltered() {
        return this.filtered;
    }

    /**
     * Creates an instance of ContentFilterResult class.
     *
     * @param filtered the filtered value to set.
     * @param severity the severity value to set.
     */
    @Generated
    @JsonCreator
    private ContentFilterResult(@JsonProperty(value = "filtered") boolean filtered,
        @JsonProperty(value = "severity") ContentFilterSeverity severity) {
        this.filtered = filtered;
        this.severity = severity;
    }
}
