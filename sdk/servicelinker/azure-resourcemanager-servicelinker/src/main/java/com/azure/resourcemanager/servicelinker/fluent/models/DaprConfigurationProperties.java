// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.servicelinker.models.AuthType;
import com.azure.resourcemanager.servicelinker.models.DaprProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DaprConfigurationProperties model.
 */
@Fluent
public final class DaprConfigurationProperties {
    /*
     * Supported target resource type, extract from resource id, uppercase
     */
    @JsonProperty(value = "targetType")
    private String targetType;

    /*
     * The authentication type.
     */
    @JsonProperty(value = "authType")
    private AuthType authType;

    /*
     * Indicates some additional properties for dapr client type
     */
    @JsonProperty(value = "daprProperties")
    private DaprProperties daprProperties;

    /**
     * Creates an instance of DaprConfigurationProperties class.
     */
    public DaprConfigurationProperties() {
    }

    /**
     * Get the targetType property: Supported target resource type, extract from resource id, uppercase.
     * 
     * @return the targetType value.
     */
    public String targetType() {
        return this.targetType;
    }

    /**
     * Set the targetType property: Supported target resource type, extract from resource id, uppercase.
     * 
     * @param targetType the targetType value to set.
     * @return the DaprConfigurationProperties object itself.
     */
    public DaprConfigurationProperties withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * Get the authType property: The authentication type.
     * 
     * @return the authType value.
     */
    public AuthType authType() {
        return this.authType;
    }

    /**
     * Set the authType property: The authentication type.
     * 
     * @param authType the authType value to set.
     * @return the DaprConfigurationProperties object itself.
     */
    public DaprConfigurationProperties withAuthType(AuthType authType) {
        this.authType = authType;
        return this;
    }

    /**
     * Get the daprProperties property: Indicates some additional properties for dapr client type.
     * 
     * @return the daprProperties value.
     */
    public DaprProperties daprProperties() {
        return this.daprProperties;
    }

    /**
     * Set the daprProperties property: Indicates some additional properties for dapr client type.
     * 
     * @param daprProperties the daprProperties value to set.
     * @return the DaprConfigurationProperties object itself.
     */
    public DaprConfigurationProperties withDaprProperties(DaprProperties daprProperties) {
        this.daprProperties = daprProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (daprProperties() != null) {
            daprProperties().validate();
        }
    }
}
