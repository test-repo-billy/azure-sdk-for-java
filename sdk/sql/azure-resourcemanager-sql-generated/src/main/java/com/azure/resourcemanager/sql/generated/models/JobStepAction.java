// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The action to be executed by a job step.
 */
@Fluent
public final class JobStepAction {
    /*
     * Type of action being executed by the job step.
     */
    @JsonProperty(value = "type")
    private JobStepActionType type;

    /*
     * The source of the action to execute.
     */
    @JsonProperty(value = "source")
    private JobStepActionSource source;

    /*
     * The action value, for example the text of the T-SQL script to execute.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Creates an instance of JobStepAction class.
     */
    public JobStepAction() {
    }

    /**
     * Get the type property: Type of action being executed by the job step.
     * 
     * @return the type value.
     */
    public JobStepActionType type() {
        return this.type;
    }

    /**
     * Set the type property: Type of action being executed by the job step.
     * 
     * @param type the type value to set.
     * @return the JobStepAction object itself.
     */
    public JobStepAction withType(JobStepActionType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the source property: The source of the action to execute.
     * 
     * @return the source value.
     */
    public JobStepActionSource source() {
        return this.source;
    }

    /**
     * Set the source property: The source of the action to execute.
     * 
     * @param source the source value to set.
     * @return the JobStepAction object itself.
     */
    public JobStepAction withSource(JobStepActionSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the value property: The action value, for example the text of the T-SQL script to execute.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The action value, for example the text of the T-SQL script to execute.
     * 
     * @param value the value value to set.
     * @return the JobStepAction object itself.
     */
    public JobStepAction withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property value in model JobStepAction"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(JobStepAction.class);
}
