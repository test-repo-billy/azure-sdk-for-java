// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A value that indicates whether capture description is enabled.
 */
@Fluent
public final class CaptureIdentity {
    /*
     * Type of Azure Active Directory Managed Identity.
     */
    @JsonProperty(value = "type")
    private CaptureIdentityType type;

    /*
     * ARM ID of Managed User Identity. This property is required is the type is UserAssignedIdentity. If type is SystemAssigned, then the System Assigned Identity Associated with the namespace will be used.
     */
    @JsonProperty(value = "userAssignedIdentity")
    private String userAssignedIdentity;

    /**
     * Creates an instance of CaptureIdentity class.
     */
    public CaptureIdentity() {
    }

    /**
     * Get the type property: Type of Azure Active Directory Managed Identity.
     * 
     * @return the type value.
     */
    public CaptureIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: Type of Azure Active Directory Managed Identity.
     * 
     * @param type the type value to set.
     * @return the CaptureIdentity object itself.
     */
    public CaptureIdentity withType(CaptureIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the userAssignedIdentity property: ARM ID of Managed User Identity. This property is required is the type is
     * UserAssignedIdentity. If type is SystemAssigned, then the System Assigned Identity Associated with the namespace
     * will be used.
     * 
     * @return the userAssignedIdentity value.
     */
    public String userAssignedIdentity() {
        return this.userAssignedIdentity;
    }

    /**
     * Set the userAssignedIdentity property: ARM ID of Managed User Identity. This property is required is the type is
     * UserAssignedIdentity. If type is SystemAssigned, then the System Assigned Identity Associated with the namespace
     * will be used.
     * 
     * @param userAssignedIdentity the userAssignedIdentity value to set.
     * @return the CaptureIdentity object itself.
     */
    public CaptureIdentity withUserAssignedIdentity(String userAssignedIdentity) {
        this.userAssignedIdentity = userAssignedIdentity;
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
