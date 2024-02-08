// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Contains the list of patients, and configuration data.
 */
@Fluent
public final class RadiologyInsightsData {

    /*
     * The list of patients, including their clinical information and data.
     */
    @Generated
    @JsonProperty(value = "patients")
    private List<PatientRecord> patients;

    /*
     * Configuration affecting the Radiology Insights model's inference.
     */
    @Generated
    @JsonProperty(value = "configuration")
    private RadiologyInsightsModelConfiguration configuration;

    /**
     * Creates an instance of RadiologyInsightsData class.
     *
     * @param patients the patients value to set.
     */
    @Generated
    @JsonCreator
    public RadiologyInsightsData(@JsonProperty(value = "patients") List<PatientRecord> patients) {
        this.patients = patients;
    }

    /**
     * Get the patients property: The list of patients, including their clinical information and data.
     *
     * @return the patients value.
     */
    @Generated
    public List<PatientRecord> getPatients() {
        return this.patients;
    }

    /**
     * Get the configuration property: Configuration affecting the Radiology Insights model's inference.
     *
     * @return the configuration value.
     */
    @Generated
    public RadiologyInsightsModelConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * Set the configuration property: Configuration affecting the Radiology Insights model's inference.
     *
     * @param configuration the configuration value to set.
     * @return the RadiologyInsightsData object itself.
     */
    @Generated
    public RadiologyInsightsData setConfiguration(RadiologyInsightsModelConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
}
