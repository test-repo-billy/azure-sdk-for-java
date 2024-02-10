// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * A resource with narrative, extensions, and contained resources
 * Based on [FHIR DomainResource](https://www.hl7.org/fhir/domainresource.html).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "resourceType",
    defaultImpl = FhirR4DomainResource.class)
@JsonTypeName("Fhir_R4_DomainResource")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Observation", value = FhirR4Observation.class),
    @JsonSubTypes.Type(name = "Condition", value = FhirR4Condition.class),
    @JsonSubTypes.Type(name = "ResearchStudy", value = FhirR4ResearchStudy.class) })
@Fluent
public class FhirR4DomainResource extends FhirR4Resource {
    /*
     * Text summary of the resource, for human interpretation
     */
    @Generated
    @JsonProperty(value = "text")
    private FhirR4Narrative text;

    /*
     * Contained, inline Resources
     */
    @Generated
    @JsonProperty(value = "contained")
    private List<FhirR4Resource> contained;

    /*
     * Additional Content defined by implementations
     */
    @Generated
    @JsonProperty(value = "extension")
    private List<FhirR4Extension> extension;

    /*
     * Extensions that cannot be ignored
     */
    @Generated
    @JsonProperty(value = "modifierExtension")
    private List<FhirR4Extension> modifierExtension;

    /**
     * Creates an instance of FhirR4DomainResource class.
     * 
     * @param resourceType the resourceType value to set.
     */
    @Generated
    @JsonCreator
    public FhirR4DomainResource(@JsonProperty(value = "resourceType") String resourceType) {
        super(resourceType);
    }

    /**
     * Get the text property: Text summary of the resource, for human interpretation.
     * 
     * @return the text value.
     */
    @Generated
    public FhirR4Narrative getText() {
        return this.text;
    }

    /**
     * Set the text property: Text summary of the resource, for human interpretation.
     * 
     * @param text the text value to set.
     * @return the FhirR4DomainResource object itself.
     */
    @Generated
    public FhirR4DomainResource setText(FhirR4Narrative text) {
        this.text = text;
        return this;
    }

    /**
     * Get the contained property: Contained, inline Resources.
     * 
     * @return the contained value.
     */
    @Generated
    public List<FhirR4Resource> getContained() {
        return this.contained;
    }

    /**
     * Set the contained property: Contained, inline Resources.
     * 
     * @param contained the contained value to set.
     * @return the FhirR4DomainResource object itself.
     */
    @Generated
    public FhirR4DomainResource setContained(List<FhirR4Resource> contained) {
        this.contained = contained;
        return this;
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
     * Set the extension property: Additional Content defined by implementations.
     * 
     * @param extension the extension value to set.
     * @return the FhirR4DomainResource object itself.
     */
    @Generated
    public FhirR4DomainResource setExtension(List<FhirR4Extension> extension) {
        this.extension = extension;
        return this;
    }

    /**
     * Get the modifierExtension property: Extensions that cannot be ignored.
     * 
     * @return the modifierExtension value.
     */
    @Generated
    public List<FhirR4Extension> getModifierExtension() {
        return this.modifierExtension;
    }

    /**
     * Set the modifierExtension property: Extensions that cannot be ignored.
     * 
     * @param modifierExtension the modifierExtension value to set.
     * @return the FhirR4DomainResource object itself.
     */
    @Generated
    public FhirR4DomainResource setModifierExtension(List<FhirR4Extension> modifierExtension) {
        this.modifierExtension = modifierExtension;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public FhirR4DomainResource setId(String id) {
        super.setId(id);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public FhirR4DomainResource setMeta(FhirR4Meta meta) {
        super.setMeta(meta);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public FhirR4DomainResource setImplicitRules(String implicitRules) {
        super.setImplicitRules(implicitRules);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public FhirR4DomainResource setLanguage(String language) {
        super.setLanguage(language);
        return this;
    }
}
