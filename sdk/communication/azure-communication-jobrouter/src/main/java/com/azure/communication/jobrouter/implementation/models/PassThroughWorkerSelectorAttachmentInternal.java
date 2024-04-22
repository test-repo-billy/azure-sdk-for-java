// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.implementation.models;

import com.azure.communication.jobrouter.models.LabelOperator;
import com.azure.communication.jobrouter.models.WorkerSelectorAttachmentKind;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Attaches a worker selector where the value is passed through from a job's label with the same key.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "kind",
    defaultImpl = PassThroughWorkerSelectorAttachmentInternal.class,
    visible = true)
@JsonTypeName("passThrough")
@Fluent
public final class PassThroughWorkerSelectorAttachmentInternal extends WorkerSelectorAttachmentInternal {

    /*
     * The label key to query against.
     */
    @Generated
    @JsonProperty(value = "key")
    private final String key;

    /*
     * Describes how the value of the label is compared to the value pass through.
     */
    @Generated
    @JsonProperty(value = "labelOperator")
    private final LabelOperator labelOperator;

    /*
     * Describes how long the attached label selector is valid in seconds.
     */
    @Generated
    @JsonProperty(value = "expiresAfterSeconds")
    private Double expiresAfterSeconds;

    /**
     * Creates an instance of PassThroughWorkerSelectorAttachmentInternal class.
     *
     * @param key the key value to set.
     * @param labelOperator the labelOperator value to set.
     */
    @Generated
    @JsonCreator
    public PassThroughWorkerSelectorAttachmentInternal(@JsonProperty(value = "key") String key,
        @JsonProperty(value = "labelOperator") LabelOperator labelOperator) {
        this.key = key;
        this.labelOperator = labelOperator;
    }

    /**
     * Get the key property: The label key to query against.
     *
     * @return the key value.
     */
    @Generated
    public String getKey() {
        return this.key;
    }

    /**
     * Get the labelOperator property: Describes how the value of the label is compared to the value pass through.
     *
     * @return the labelOperator value.
     */
    @Generated
    public LabelOperator getLabelOperator() {
        return this.labelOperator;
    }

    /**
     * Get the expiresAfterSeconds property: Describes how long the attached label selector is valid in seconds.
     *
     * @return the expiresAfterSeconds value.
     */
    @Generated
    public Double getExpiresAfterSeconds() {
        return this.expiresAfterSeconds;
    }

    /**
     * Set the expiresAfterSeconds property: Describes how long the attached label selector is valid in seconds.
     *
     * @param expiresAfterSeconds the expiresAfterSeconds value to set.
     * @return the PassThroughWorkerSelectorAttachmentInternal object itself.
     */
    @Generated
    public PassThroughWorkerSelectorAttachmentInternal setExpiresAfterSeconds(Double expiresAfterSeconds) {
        this.expiresAfterSeconds = expiresAfterSeconds;
        return this;
    }

    /*
     * The type discriminator describing a sub-type of WorkerSelectorAttachment.
     */
    @Generated
    @JsonTypeId
    @JsonProperty(value = "kind")
    private WorkerSelectorAttachmentKind kind = WorkerSelectorAttachmentKind.PASS_THROUGH;

    /**
     * Get the kind property: The type discriminator describing a sub-type of WorkerSelectorAttachment.
     *
     * @return the kind value.
     */
    @Generated
    @Override
    public WorkerSelectorAttachmentKind getKind() {
        return this.kind;
    }
}
