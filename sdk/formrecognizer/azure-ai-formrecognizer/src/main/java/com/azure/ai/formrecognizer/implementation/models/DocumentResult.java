// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/** A set of extracted fields corresponding to the input document. */
@Fluent
public final class DocumentResult {
    /*
     * Document type.
     */
    @JsonProperty(value = "docType", required = true)
    private String docType;

    /*
     * Model identifier.
     */
    @JsonProperty(value = "modelId")
    private UUID modelId;

    /*
     * First and last page number where the document is found.
     */
    @JsonProperty(value = "pageRange", required = true)
    private List<Integer> pageRange;

    /*
     * Predicted document type confidence.
     */
    @JsonProperty(value = "docTypeConfidence")
    private Float docTypeConfidence;

    /*
     * Dictionary of named field values.
     */
    @JsonProperty(value = "fields", required = true)
    private Map<String, FieldValue> fields;

    /**
     * Get the docType property: Document type.
     *
     * @return the docType value.
     */
    public String getDocType() {
        return this.docType;
    }

    /**
     * Set the docType property: Document type.
     *
     * @param docType the docType value to set.
     * @return the DocumentResult object itself.
     */
    public DocumentResult setDocType(String docType) {
        this.docType = docType;
        return this;
    }

    /**
     * Get the modelId property: Model identifier.
     *
     * @return the modelId value.
     */
    public UUID getModelId() {
        return this.modelId;
    }

    /**
     * Set the modelId property: Model identifier.
     *
     * @param modelId the modelId value to set.
     * @return the DocumentResult object itself.
     */
    public DocumentResult setModelId(UUID modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * Get the pageRange property: First and last page number where the document is found.
     *
     * @return the pageRange value.
     */
    public List<Integer> getPageRange() {
        return this.pageRange;
    }

    /**
     * Set the pageRange property: First and last page number where the document is found.
     *
     * @param pageRange the pageRange value to set.
     * @return the DocumentResult object itself.
     */
    public DocumentResult setPageRange(List<Integer> pageRange) {
        this.pageRange = pageRange;
        return this;
    }

    /**
     * Get the docTypeConfidence property: Predicted document type confidence.
     *
     * @return the docTypeConfidence value.
     */
    public Float getDocTypeConfidence() {
        return this.docTypeConfidence;
    }

    /**
     * Set the docTypeConfidence property: Predicted document type confidence.
     *
     * @param docTypeConfidence the docTypeConfidence value to set.
     * @return the DocumentResult object itself.
     */
    public DocumentResult setDocTypeConfidence(Float docTypeConfidence) {
        this.docTypeConfidence = docTypeConfidence;
        return this;
    }

    /**
     * Get the fields property: Dictionary of named field values.
     *
     * @return the fields value.
     */
    public Map<String, FieldValue> getFields() {
        return this.fields;
    }

    /**
     * Set the fields property: Dictionary of named field values.
     *
     * @param fields the fields value to set.
     * @return the DocumentResult object itself.
     */
    public DocumentResult setFields(Map<String, FieldValue> fields) {
        this.fields = fields;
        return this;
    }
}
