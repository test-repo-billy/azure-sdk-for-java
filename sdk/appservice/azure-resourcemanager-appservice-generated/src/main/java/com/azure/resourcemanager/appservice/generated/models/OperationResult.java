// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * The operation result definition.
 */
@Fluent
public class OperationResult extends OperationResultProperties {
    /*
     * Gets the tracking id.
     */
    @JsonProperty(value = "trackingId", access = JsonProperty.Access.WRITE_ONLY)
    private String trackingId;

    /*
     * Gets the inputs.
     */
    @JsonProperty(value = "inputs", access = JsonProperty.Access.WRITE_ONLY)
    private Object inputs;

    /*
     * Gets the link to inputs.
     */
    @JsonProperty(value = "inputsLink", access = JsonProperty.Access.WRITE_ONLY)
    private ContentLink inputsLink;

    /*
     * Gets the outputs.
     */
    @JsonProperty(value = "outputs", access = JsonProperty.Access.WRITE_ONLY)
    private Object outputs;

    /*
     * Gets the link to outputs.
     */
    @JsonProperty(value = "outputsLink", access = JsonProperty.Access.WRITE_ONLY)
    private ContentLink outputsLink;

    /*
     * Gets the tracked properties.
     */
    @JsonProperty(value = "trackedProperties", access = JsonProperty.Access.WRITE_ONLY)
    private Object trackedProperties;

    /*
     * Gets the retry histories.
     */
    @JsonProperty(value = "retryHistory")
    private List<RetryHistory> retryHistory;

    /*
     * The iterationCount property.
     */
    @JsonProperty(value = "iterationCount")
    private Integer iterationCount;

    /**
     * Creates an instance of OperationResult class.
     */
    public OperationResult() {
    }

    /**
     * Get the trackingId property: Gets the tracking id.
     * 
     * @return the trackingId value.
     */
    public String trackingId() {
        return this.trackingId;
    }

    /**
     * Get the inputs property: Gets the inputs.
     * 
     * @return the inputs value.
     */
    public Object inputs() {
        return this.inputs;
    }

    /**
     * Get the inputsLink property: Gets the link to inputs.
     * 
     * @return the inputsLink value.
     */
    public ContentLink inputsLink() {
        return this.inputsLink;
    }

    /**
     * Get the outputs property: Gets the outputs.
     * 
     * @return the outputs value.
     */
    public Object outputs() {
        return this.outputs;
    }

    /**
     * Get the outputsLink property: Gets the link to outputs.
     * 
     * @return the outputsLink value.
     */
    public ContentLink outputsLink() {
        return this.outputsLink;
    }

    /**
     * Get the trackedProperties property: Gets the tracked properties.
     * 
     * @return the trackedProperties value.
     */
    public Object trackedProperties() {
        return this.trackedProperties;
    }

    /**
     * Get the retryHistory property: Gets the retry histories.
     * 
     * @return the retryHistory value.
     */
    public List<RetryHistory> retryHistory() {
        return this.retryHistory;
    }

    /**
     * Set the retryHistory property: Gets the retry histories.
     * 
     * @param retryHistory the retryHistory value to set.
     * @return the OperationResult object itself.
     */
    public OperationResult withRetryHistory(List<RetryHistory> retryHistory) {
        this.retryHistory = retryHistory;
        return this;
    }

    /**
     * Get the iterationCount property: The iterationCount property.
     * 
     * @return the iterationCount value.
     */
    public Integer iterationCount() {
        return this.iterationCount;
    }

    /**
     * Set the iterationCount property: The iterationCount property.
     * 
     * @param iterationCount the iterationCount value to set.
     * @return the OperationResult object itself.
     */
    public OperationResult withIterationCount(Integer iterationCount) {
        this.iterationCount = iterationCount;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperationResult withStartTime(OffsetDateTime startTime) {
        super.withStartTime(startTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperationResult withEndTime(OffsetDateTime endTime) {
        super.withEndTime(endTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperationResult withCorrelation(RunActionCorrelation correlation) {
        super.withCorrelation(correlation);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperationResult withStatus(WorkflowStatus status) {
        super.withStatus(status);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperationResult withCode(String code) {
        super.withCode(code);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperationResult withError(Object error) {
        super.withError(error);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (inputsLink() != null) {
            inputsLink().validate();
        }
        if (outputsLink() != null) {
            outputsLink().validate();
        }
        if (retryHistory() != null) {
            retryHistory().forEach(e -> e.validate());
        }
    }
}
