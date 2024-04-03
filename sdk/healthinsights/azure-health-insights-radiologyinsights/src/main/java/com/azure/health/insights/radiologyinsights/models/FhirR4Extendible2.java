// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Finding reference for recommendation.
 */
@Immutable
public final class FhirR4Extendible2 {

    /*
     * Additional Content defined by implementations
     */
    @Generated
    @JsonProperty(value = "extension")
    private List<FhirR4Extension> extension;

    /*
     * Finding linked to a recommendation.
     */
    @Generated
    @JsonProperty(value = "finding")
    private FhirR4Observation finding;

    /*
     * Critical result linked to a recommendation.
     */
    @Generated
    @JsonProperty(value = "criticalFinding")
    private CriticalResult criticalFinding;

    /*
     * Recommendation finding status.
     */
    @Generated
    @JsonProperty(value = "recommendationFindingStatus")
    private final RecommendationFindingStatusType recommendationFindingStatus;

    /**
     * Creates an instance of FhirR4Extendible2 class.
     *
     * @param recommendationFindingStatus the recommendationFindingStatus value to set.
     */
    @Generated
    @JsonCreator
    private FhirR4Extendible2(@JsonProperty(
        value = "recommendationFindingStatus") RecommendationFindingStatusType recommendationFindingStatus) {
        this.recommendationFindingStatus = recommendationFindingStatus;
    }

    /**
     * Get the extension property: Additional Content defined by implementations.
     *
     * @return the extension value.
     */
    @Generated
    public List<FhirR4Extension> getExtension() {
        return this.extension;
    }

    /**
     * Get the finding property: Finding linked to a recommendation.
     *
     * @return the finding value.
     */
    @Generated
    public FhirR4Observation getFinding() {
        return this.finding;
    }

    /**
     * Get the criticalFinding property: Critical result linked to a recommendation.
     *
     * @return the criticalFinding value.
     */
    @Generated
    public CriticalResult getCriticalFinding() {
        return this.criticalFinding;
    }

    /**
     * Get the recommendationFindingStatus property: Recommendation finding status.
     *
     * @return the recommendationFindingStatus value.
     */
    @Generated
    public RecommendationFindingStatusType getRecommendationFindingStatus() {
        return this.recommendationFindingStatus;
    }
}
