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
 * A series of measurements taken by a device
 * Based on [FHIR SampledData](https://www.hl7.org/fhir/R4/datatypes.html#SampledData).
 */
@Fluent
public final class FhirR4SampledData extends FhirR4Element {

    /*
     * Zero value and units
     */
    @Generated
    @JsonProperty(value = "origin")
    private FhirR4Quantity origin;

    /*
     * Number of milliseconds between samples
     */
    @Generated
    @JsonProperty(value = "period")
    private double period;

    /*
     * Multiply data by this before adding to origin
     */
    @Generated
    @JsonProperty(value = "factor")
    private Double factor;

    /*
     * Lower limit of detection
     */
    @Generated
    @JsonProperty(value = "lowerLimit")
    private Double lowerLimit;

    /*
     * Upper limit of detection
     */
    @Generated
    @JsonProperty(value = "upperLimit")
    private Double upperLimit;

    /*
     * Number of sample points at each time point
     */
    @Generated
    @JsonProperty(value = "dimensions")
    private int dimensions;

    /*
     * Decimal values with spaces, or "E" | "U" | "L"
     */
    @Generated
    @JsonProperty(value = "data")
    private String data;

    /**
     * Creates an instance of FhirR4SampledData class.
     *
     * @param origin the origin value to set.
     * @param period the period value to set.
     * @param dimensions the dimensions value to set.
     */
    @Generated
    @JsonCreator
    public FhirR4SampledData(@JsonProperty(value = "origin") FhirR4Quantity origin,
        @JsonProperty(value = "period") double period, @JsonProperty(value = "dimensions") int dimensions) {
        this.origin = origin;
        this.period = period;
        this.dimensions = dimensions;
    }

    /**
     * Get the origin property: Zero value and units.
     *
     * @return the origin value.
     */
    @Generated
    public FhirR4Quantity getOrigin() {
        return this.origin;
    }

    /**
     * Get the period property: Number of milliseconds between samples.
     *
     * @return the period value.
     */
    @Generated
    public double getPeriod() {
        return this.period;
    }

    /**
     * Get the factor property: Multiply data by this before adding to origin.
     *
     * @return the factor value.
     */
    @Generated
    public Double getFactor() {
        return this.factor;
    }

    /**
     * Set the factor property: Multiply data by this before adding to origin.
     *
     * @param factor the factor value to set.
     * @return the FhirR4SampledData object itself.
     */
    @Generated
    public FhirR4SampledData setFactor(Double factor) {
        this.factor = factor;
        return this;
    }

    /**
     * Get the lowerLimit property: Lower limit of detection.
     *
     * @return the lowerLimit value.
     */
    @Generated
    public Double getLowerLimit() {
        return this.lowerLimit;
    }

    /**
     * Set the lowerLimit property: Lower limit of detection.
     *
     * @param lowerLimit the lowerLimit value to set.
     * @return the FhirR4SampledData object itself.
     */
    @Generated
    public FhirR4SampledData setLowerLimit(Double lowerLimit) {
        this.lowerLimit = lowerLimit;
        return this;
    }

    /**
     * Get the upperLimit property: Upper limit of detection.
     *
     * @return the upperLimit value.
     */
    @Generated
    public Double getUpperLimit() {
        return this.upperLimit;
    }

    /**
     * Set the upperLimit property: Upper limit of detection.
     *
     * @param upperLimit the upperLimit value to set.
     * @return the FhirR4SampledData object itself.
     */
    @Generated
    public FhirR4SampledData setUpperLimit(Double upperLimit) {
        this.upperLimit = upperLimit;
        return this;
    }

    /**
     * Get the dimensions property: Number of sample points at each time point.
     *
     * @return the dimensions value.
     */
    @Generated
    public int getDimensions() {
        return this.dimensions;
    }

    /**
     * Get the data property: Decimal values with spaces, or "E" | "U" | "L".
     *
     * @return the data value.
     */
    @Generated
    public String getData() {
        return this.data;
    }

    /**
     * Set the data property: Decimal values with spaces, or "E" | "U" | "L".
     *
     * @param data the data value to set.
     * @return the FhirR4SampledData object itself.
     */
    @Generated
    public FhirR4SampledData setData(String data) {
        this.data = data;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public FhirR4SampledData setId(String id) {
        super.setId(id);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public FhirR4SampledData setExtension(List<FhirR4Extension> extension) {
        super.setExtension(extension);
        return this;
    }
}
