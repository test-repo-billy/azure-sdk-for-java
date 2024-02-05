// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.fluent.models.DataTransferJobProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters to create Data Transfer Job.
 */
@Fluent
public final class CreateJobRequest extends ArmProxyResource {
    /*
     * Data Transfer Create Job Properties
     */
    @JsonProperty(value = "properties", required = true)
    private DataTransferJobProperties properties;

    /**
     * Creates an instance of CreateJobRequest class.
     */
    public CreateJobRequest() {
    }

    /**
     * Get the properties property: Data Transfer Create Job Properties.
     * 
     * @return the properties value.
     */
    public DataTransferJobProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Data Transfer Create Job Properties.
     * 
     * @param properties the properties value to set.
     * @return the CreateJobRequest object itself.
     */
    public CreateJobRequest withProperties(DataTransferJobProperties properties) {
        this.properties = properties;
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
        if (properties() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property properties in model CreateJobRequest"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CreateJobRequest.class);
}
