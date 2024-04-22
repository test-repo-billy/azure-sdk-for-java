// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An option to store configuration into different place.
 */
@Fluent
public final class ConfigurationStore {
    /*
     * The app configuration id to store configuration
     */
    @JsonProperty(value = "appConfigurationId")
    private String appConfigurationId;

    /**
     * Creates an instance of ConfigurationStore class.
     */
    public ConfigurationStore() {
    }

    /**
     * Get the appConfigurationId property: The app configuration id to store configuration.
     * 
     * @return the appConfigurationId value.
     */
    public String appConfigurationId() {
        return this.appConfigurationId;
    }

    /**
     * Set the appConfigurationId property: The app configuration id to store configuration.
     * 
     * @param appConfigurationId the appConfigurationId value to set.
     * @return the ConfigurationStore object itself.
     */
    public ConfigurationStore withAppConfigurationId(String appConfigurationId) {
        this.appConfigurationId = appConfigurationId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
