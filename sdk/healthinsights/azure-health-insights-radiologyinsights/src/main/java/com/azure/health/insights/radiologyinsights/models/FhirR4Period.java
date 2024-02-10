// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A time period defined by a start and end date and optionally time
 * Based on [FHIR Period](https://www.hl7.org/fhir/R4/datatypes.html#Period).
 */
@Fluent
public final class FhirR4Period extends FhirR4Element {
    /*
     * Starting time with inclusive boundary
     */
    @Generated
    @JsonProperty(value = "start")
    private String start;

    /*
     * End time with inclusive boundary, if not ongoing
     */
    @Generated
    @JsonProperty(value = "end")
    private String end;

    /**
     * Creates an instance of FhirR4Period class.
     */
    @Generated
    public FhirR4Period() {
    }

    /**
     * Get the start property: Starting time with inclusive boundary.
     * 
     * @return the start value.
     */
    @Generated
    public String getStart() {
        return this.start;
    }

    /**
     * Set the start property: Starting time with inclusive boundary.
     * 
     * @param start the start value to set.
     * @return the FhirR4Period object itself.
     */
    @Generated
    public FhirR4Period setStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * Get the end property: End time with inclusive boundary, if not ongoing.
     * 
     * @return the end value.
     */
    @Generated
    public String getEnd() {
        return this.end;
    }

    /**
     * Set the end property: End time with inclusive boundary, if not ongoing.
     * 
     * @param end the end value to set.
     * @return the FhirR4Period object itself.
     */
    @Generated
    public FhirR4Period setEnd(String end) {
        this.end = end;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public FhirR4Period setId(String id) {
        super.setId(id);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public FhirR4Period setExtension(List<FhirR4Extension> extension) {
        super.setExtension(extension);
        return this;
    }
}
