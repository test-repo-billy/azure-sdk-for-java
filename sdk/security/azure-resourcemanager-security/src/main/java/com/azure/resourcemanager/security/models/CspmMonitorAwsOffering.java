// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The CSPM monitoring for AWS offering.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "offeringType")
@JsonTypeName("CspmMonitorAws")
@Fluent
public final class CspmMonitorAwsOffering extends CloudOffering {
    /*
     * The native cloud connection configuration
     */
    @JsonProperty(value = "nativeCloudConnection")
    private CspmMonitorAwsOfferingNativeCloudConnection nativeCloudConnection;

    /**
     * Creates an instance of CspmMonitorAwsOffering class.
     */
    public CspmMonitorAwsOffering() {
    }

    /**
     * Get the nativeCloudConnection property: The native cloud connection configuration.
     * 
     * @return the nativeCloudConnection value.
     */
    public CspmMonitorAwsOfferingNativeCloudConnection nativeCloudConnection() {
        return this.nativeCloudConnection;
    }

    /**
     * Set the nativeCloudConnection property: The native cloud connection configuration.
     * 
     * @param nativeCloudConnection the nativeCloudConnection value to set.
     * @return the CspmMonitorAwsOffering object itself.
     */
    public CspmMonitorAwsOffering
        withNativeCloudConnection(CspmMonitorAwsOfferingNativeCloudConnection nativeCloudConnection) {
        this.nativeCloudConnection = nativeCloudConnection;
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
        if (nativeCloudConnection() != null) {
            nativeCloudConnection().validate();
        }
    }
}
