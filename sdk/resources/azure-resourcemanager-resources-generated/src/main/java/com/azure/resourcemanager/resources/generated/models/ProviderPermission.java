// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The provider permission.
 */
@Fluent
public final class ProviderPermission {
    /*
     * The application id.
     */
    @JsonProperty(value = "applicationId")
    private String applicationId;

    /*
     * Role definition properties.
     */
    @JsonProperty(value = "roleDefinition")
    private RoleDefinition roleDefinition;

    /*
     * Role definition properties.
     */
    @JsonProperty(value = "managedByRoleDefinition")
    private RoleDefinition managedByRoleDefinition;

    /*
     * The provider authorization consent state.
     */
    @JsonProperty(value = "providerAuthorizationConsentState")
    private ProviderAuthorizationConsentState providerAuthorizationConsentState;

    /**
     * Creates an instance of ProviderPermission class.
     */
    public ProviderPermission() {
    }

    /**
     * Get the applicationId property: The application id.
     * 
     * @return the applicationId value.
     */
    public String applicationId() {
        return this.applicationId;
    }

    /**
     * Set the applicationId property: The application id.
     * 
     * @param applicationId the applicationId value to set.
     * @return the ProviderPermission object itself.
     */
    public ProviderPermission withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Get the roleDefinition property: Role definition properties.
     * 
     * @return the roleDefinition value.
     */
    public RoleDefinition roleDefinition() {
        return this.roleDefinition;
    }

    /**
     * Set the roleDefinition property: Role definition properties.
     * 
     * @param roleDefinition the roleDefinition value to set.
     * @return the ProviderPermission object itself.
     */
    public ProviderPermission withRoleDefinition(RoleDefinition roleDefinition) {
        this.roleDefinition = roleDefinition;
        return this;
    }

    /**
     * Get the managedByRoleDefinition property: Role definition properties.
     * 
     * @return the managedByRoleDefinition value.
     */
    public RoleDefinition managedByRoleDefinition() {
        return this.managedByRoleDefinition;
    }

    /**
     * Set the managedByRoleDefinition property: Role definition properties.
     * 
     * @param managedByRoleDefinition the managedByRoleDefinition value to set.
     * @return the ProviderPermission object itself.
     */
    public ProviderPermission withManagedByRoleDefinition(RoleDefinition managedByRoleDefinition) {
        this.managedByRoleDefinition = managedByRoleDefinition;
        return this;
    }

    /**
     * Get the providerAuthorizationConsentState property: The provider authorization consent state.
     * 
     * @return the providerAuthorizationConsentState value.
     */
    public ProviderAuthorizationConsentState providerAuthorizationConsentState() {
        return this.providerAuthorizationConsentState;
    }

    /**
     * Set the providerAuthorizationConsentState property: The provider authorization consent state.
     * 
     * @param providerAuthorizationConsentState the providerAuthorizationConsentState value to set.
     * @return the ProviderPermission object itself.
     */
    public ProviderPermission
        withProviderAuthorizationConsentState(ProviderAuthorizationConsentState providerAuthorizationConsentState) {
        this.providerAuthorizationConsentState = providerAuthorizationConsentState;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (roleDefinition() != null) {
            roleDefinition().validate();
        }
        if (managedByRoleDefinition() != null) {
            managedByRoleDefinition().validate();
        }
    }
}
