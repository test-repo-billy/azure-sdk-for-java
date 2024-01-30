// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DataConnector Properties.
 */
@Fluent
public final class DataConnectorProperties {
    /*
     * AuthCredentials abstract base class for Auth Purpose.
     */
    @JsonProperty(value = "credentials", required = true)
    private AuthCredentials credentials;

    /**
     * Creates an instance of DataConnectorProperties class.
     */
    public DataConnectorProperties() {
    }

    /**
     * Get the credentials property: AuthCredentials abstract base class for Auth Purpose.
     * 
     * @return the credentials value.
     */
    public AuthCredentials credentials() {
        return this.credentials;
    }

    /**
     * Set the credentials property: AuthCredentials abstract base class for Auth Purpose.
     * 
     * @param credentials the credentials value to set.
     * @return the DataConnectorProperties object itself.
     */
    public DataConnectorProperties withCredentials(AuthCredentials credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (credentials() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property credentials in model DataConnectorProperties"));
        } else {
            credentials().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DataConnectorProperties.class);
}
