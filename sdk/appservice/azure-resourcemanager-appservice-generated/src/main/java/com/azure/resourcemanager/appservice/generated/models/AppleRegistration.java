// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The configuration settings of the registration for the Apple provider.
 */
@Fluent
public final class AppleRegistration {
    /*
     * The Client ID of the app used for login.
     */
    @JsonProperty(value = "clientId")
    private String clientId;

    /*
     * The app setting name that contains the client secret.
     */
    @JsonProperty(value = "clientSecretSettingName")
    private String clientSecretSettingName;

    /**
     * Creates an instance of AppleRegistration class.
     */
    public AppleRegistration() {
    }

    /**
     * Get the clientId property: The Client ID of the app used for login.
     * 
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The Client ID of the app used for login.
     * 
     * @param clientId the clientId value to set.
     * @return the AppleRegistration object itself.
     */
    public AppleRegistration withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientSecretSettingName property: The app setting name that contains the client secret.
     * 
     * @return the clientSecretSettingName value.
     */
    public String clientSecretSettingName() {
        return this.clientSecretSettingName;
    }

    /**
     * Set the clientSecretSettingName property: The app setting name that contains the client secret.
     * 
     * @param clientSecretSettingName the clientSecretSettingName value to set.
     * @return the AppleRegistration object itself.
     */
    public AppleRegistration withClientSecretSettingName(String clientSecretSettingName) {
        this.clientSecretSettingName = clientSecretSettingName;
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
