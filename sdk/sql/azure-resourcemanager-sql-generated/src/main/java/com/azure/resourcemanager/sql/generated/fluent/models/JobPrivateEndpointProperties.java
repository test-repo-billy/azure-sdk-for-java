// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of job agent private endpoint.
 */
@Fluent
public final class JobPrivateEndpointProperties {
    /*
     * ARM resource id of the server the private endpoint will target.
     */
    @JsonProperty(value = "targetServerAzureResourceId", required = true)
    private String targetServerAzureResourceId;

    /*
     * Private endpoint id of the private endpoint.
     */
    @JsonProperty(value = "privateEndpointId", access = JsonProperty.Access.WRITE_ONLY)
    private String privateEndpointId;

    /**
     * Creates an instance of JobPrivateEndpointProperties class.
     */
    public JobPrivateEndpointProperties() {
    }

    /**
     * Get the targetServerAzureResourceId property: ARM resource id of the server the private endpoint will target.
     * 
     * @return the targetServerAzureResourceId value.
     */
    public String targetServerAzureResourceId() {
        return this.targetServerAzureResourceId;
    }

    /**
     * Set the targetServerAzureResourceId property: ARM resource id of the server the private endpoint will target.
     * 
     * @param targetServerAzureResourceId the targetServerAzureResourceId value to set.
     * @return the JobPrivateEndpointProperties object itself.
     */
    public JobPrivateEndpointProperties withTargetServerAzureResourceId(String targetServerAzureResourceId) {
        this.targetServerAzureResourceId = targetServerAzureResourceId;
        return this;
    }

    /**
     * Get the privateEndpointId property: Private endpoint id of the private endpoint.
     * 
     * @return the privateEndpointId value.
     */
    public String privateEndpointId() {
        return this.privateEndpointId;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targetServerAzureResourceId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property targetServerAzureResourceId in model JobPrivateEndpointProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(JobPrivateEndpointProperties.class);
}
