// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Options regarding follow up recommendation inferences and finding inferences.
 */
@Fluent
public final class RadiologyInsightsInferenceOptions {

    /*
     * Follow-up recommendation options.
     */
    @Generated
    @JsonProperty(value = "followupRecommendationOptions")
    private FollowupRecommendationOptions followupRecommendationOptions;

    /*
     * Finding options.
     */
    @Generated
    @JsonProperty(value = "findingOptions")
    private FindingOptions findingOptions;

    /**
     * Creates an instance of RadiologyInsightsInferenceOptions class.
     */
    @Generated
    public RadiologyInsightsInferenceOptions() {
    }

    /**
     * Get the followupRecommendationOptions property: Follow-up recommendation options.
     *
     * @return the followupRecommendationOptions value.
     */
    @Generated
    public FollowupRecommendationOptions getFollowupRecommendationOptions() {
        return this.followupRecommendationOptions;
    }

    /**
     * Set the followupRecommendationOptions property: Follow-up recommendation options.
     *
     * @param followupRecommendationOptions the followupRecommendationOptions value to set.
     * @return the RadiologyInsightsInferenceOptions object itself.
     */
    @Generated
    public RadiologyInsightsInferenceOptions
        setFollowupRecommendationOptions(FollowupRecommendationOptions followupRecommendationOptions) {
        this.followupRecommendationOptions = followupRecommendationOptions;
        return this;
    }

    /**
     * Get the findingOptions property: Finding options.
     *
     * @return the findingOptions value.
     */
    @Generated
    public FindingOptions getFindingOptions() {
        return this.findingOptions;
    }

    /**
     * Set the findingOptions property: Finding options.
     *
     * @param findingOptions the findingOptions value to set.
     * @return the RadiologyInsightsInferenceOptions object itself.
     */
    @Generated
    public RadiologyInsightsInferenceOptions setFindingOptions(FindingOptions findingOptions) {
        this.findingOptions = findingOptions;
        return this;
    }
}
