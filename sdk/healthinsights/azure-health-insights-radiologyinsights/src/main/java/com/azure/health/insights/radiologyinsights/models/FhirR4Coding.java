// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A Coding is a representation of a defined concept using a symbol from a defined "code system".
 * Based on [FHIR Coding](https://www.hl7.org/fhir/R4/datatypes.html#Coding).
 */
@Fluent
public final class FhirR4Coding extends FhirR4Element {
    /*
     * Identity of the terminology system
     */
    @Generated
    @JsonProperty(value = "system")
    private String system;

    /*
     * Version of the system - if relevant
     */
    @Generated
    @JsonProperty(value = "version")
    private String version;

    /*
     * Symbol in syntax defined by the system
     */
    @Generated
    @JsonProperty(value = "code")
    private String code;

    /*
     * Representation defined by the system
     */
    @Generated
    @JsonProperty(value = "display")
    private String display;

    /**
     * Creates an instance of FhirR4Coding class.
     */
    @Generated
    public FhirR4Coding() {
    }

    /**
     * Get the system property: Identity of the terminology system.
     * 
     * @return the system value.
     */
    @Generated
    public String getSystem() {
        return this.system;
    }

    /**
     * Set the system property: Identity of the terminology system.
     * 
     * @param system the system value to set.
     * @return the FhirR4Coding object itself.
     */
    @Generated
    public FhirR4Coding setSystem(String system) {
        this.system = system;
        return this;
    }

    /**
     * Get the version property: Version of the system - if relevant.
     * 
     * @return the version value.
     */
    @Generated
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: Version of the system - if relevant.
     * 
     * @param version the version value to set.
     * @return the FhirR4Coding object itself.
     */
    @Generated
    public FhirR4Coding setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the code property: Symbol in syntax defined by the system.
     * 
     * @return the code value.
     */
    @Generated
    public String getCode() {
        return this.code;
    }

    /**
     * Set the code property: Symbol in syntax defined by the system.
     * 
     * @param code the code value to set.
     * @return the FhirR4Coding object itself.
     */
    @Generated
    public FhirR4Coding setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the display property: Representation defined by the system.
     * 
     * @return the display value.
     */
    @Generated
    public String getDisplay() {
        return this.display;
    }

    /**
     * Set the display property: Representation defined by the system.
     * 
     * @param display the display value to set.
     * @return the FhirR4Coding object itself.
     */
    @Generated
    public FhirR4Coding setDisplay(String display) {
        this.display = display;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public FhirR4Coding setId(String id) {
        super.setId(id);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public FhirR4Coding setExtension(List<FhirR4Extension> extension) {
        super.setExtension(extension);
        return this;
    }
}
