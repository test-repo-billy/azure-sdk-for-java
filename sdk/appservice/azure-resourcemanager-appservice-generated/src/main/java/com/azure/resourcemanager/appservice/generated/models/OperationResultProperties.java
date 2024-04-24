// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The run operation result properties.
 */
@Fluent
public class OperationResultProperties {
    /*
     * The start time of the workflow scope repetition.
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * The end time of the workflow scope repetition.
     */
    @JsonProperty(value = "endTime")
    private OffsetDateTime endTime;

    /*
     * The correlation properties.
     */
    @JsonProperty(value = "correlation")
    private RunActionCorrelation correlation;

    /*
     * The status of the workflow scope repetition.
     */
    @JsonProperty(value = "status")
    private WorkflowStatus status;

    /*
     * The workflow scope repetition code.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * Anything
     */
    @JsonProperty(value = "error")
    private Object error;

    /**
     * Creates an instance of OperationResultProperties class.
     */
    public OperationResultProperties() {
    }

    /**
     * Get the startTime property: The start time of the workflow scope repetition.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The start time of the workflow scope repetition.
     * 
     * @param startTime the startTime value to set.
     * @return the OperationResultProperties object itself.
     */
    public OperationResultProperties withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: The end time of the workflow scope repetition.
     * 
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: The end time of the workflow scope repetition.
     * 
     * @param endTime the endTime value to set.
     * @return the OperationResultProperties object itself.
     */
    public OperationResultProperties withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the correlation property: The correlation properties.
     * 
     * @return the correlation value.
     */
    public RunActionCorrelation correlation() {
        return this.correlation;
    }

    /**
     * Set the correlation property: The correlation properties.
     * 
     * @param correlation the correlation value to set.
     * @return the OperationResultProperties object itself.
     */
    public OperationResultProperties withCorrelation(RunActionCorrelation correlation) {
        this.correlation = correlation;
        return this;
    }

    /**
     * Get the status property: The status of the workflow scope repetition.
     * 
     * @return the status value.
     */
    public WorkflowStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the workflow scope repetition.
     * 
     * @param status the status value to set.
     * @return the OperationResultProperties object itself.
     */
    public OperationResultProperties withStatus(WorkflowStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the code property: The workflow scope repetition code.
     * 
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: The workflow scope repetition code.
     * 
     * @param code the code value to set.
     * @return the OperationResultProperties object itself.
     */
    public OperationResultProperties withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the error property: Anything.
     * 
     * @return the error value.
     */
    public Object error() {
        return this.error;
    }

    /**
     * Set the error property: Anything.
     * 
     * @param error the error value to set.
     * @return the OperationResultProperties object itself.
     */
    public OperationResultProperties withError(Object error) {
        this.error = error;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (correlation() != null) {
            correlation().validate();
        }
    }
}
