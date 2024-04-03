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
 * A patient record, including their clinical information and data.
 */
@Fluent
public final class PatientRecord {

    /*
     * A given identifier for the patient. Has to be unique across all patients in a single request.
     */
    @Generated
    @JsonProperty(value = "id")
    private final String id;

    /*
     * Patient structured information, including demographics and known structured clinical information.
     */
    @Generated
    @JsonProperty(value = "info")
    private PatientDetails info;

    /*
     * Patient encounters/visits.
     */
    @Generated
    @JsonProperty(value = "encounters")
    private List<Encounter> encounters;

    /*
     * Patient unstructured clinical data, given as documents.
     */
    @Generated
    @JsonProperty(value = "patientDocuments")
    private List<PatientDocument> patientDocuments;

    /**
     * Creates an instance of PatientRecord class.
     *
     * @param id the id value to set.
     */
    @Generated
    @JsonCreator
    public PatientRecord(@JsonProperty(value = "id") String id) {
        this.id = id;
    }

    /**
     * Get the id property: A given identifier for the patient. Has to be unique across all patients in a single
     * request.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the info property: Patient structured information, including demographics and known structured clinical
     * information.
     *
     * @return the info value.
     */
    @Generated
    public PatientDetails getInfo() {
        return this.info;
    }

    /**
     * Set the info property: Patient structured information, including demographics and known structured clinical
     * information.
     *
     * @param info the info value to set.
     * @return the PatientRecord object itself.
     */
    @Generated
    public PatientRecord setInfo(PatientDetails info) {
        this.info = info;
        return this;
    }

    /**
     * Get the encounters property: Patient encounters/visits.
     *
     * @return the encounters value.
     */
    @Generated
    public List<Encounter> getEncounters() {
        return this.encounters;
    }

    /**
     * Set the encounters property: Patient encounters/visits.
     *
     * @param encounters the encounters value to set.
     * @return the PatientRecord object itself.
     */
    @Generated
    public PatientRecord setEncounters(List<Encounter> encounters) {
        this.encounters = encounters;
        return this;
    }

    /**
     * Get the patientDocuments property: Patient unstructured clinical data, given as documents.
     *
     * @return the patientDocuments value.
     */
    @Generated
    public List<PatientDocument> getPatientDocuments() {
        return this.patientDocuments;
    }

    /**
     * Set the patientDocuments property: Patient unstructured clinical data, given as documents.
     *
     * @param patientDocuments the patientDocuments value to set.
     * @return the PatientRecord object itself.
     */
    @Generated
    public PatientRecord setPatientDocuments(List<PatientDocument> patientDocuments) {
        this.patientDocuments = patientDocuments;
        return this;
    }
}
