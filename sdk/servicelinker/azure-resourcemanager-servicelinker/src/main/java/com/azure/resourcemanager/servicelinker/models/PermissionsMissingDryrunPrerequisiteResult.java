// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * The represent of missing permissions.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "type",
    defaultImpl = PermissionsMissingDryrunPrerequisiteResult.class,
    visible = true)
@JsonTypeName("permissionsMissing")
@Fluent
public final class PermissionsMissingDryrunPrerequisiteResult extends DryrunPrerequisiteResult {
    /*
     * The type of dryrun result.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private DryrunPrerequisiteResultType type = DryrunPrerequisiteResultType.PERMISSIONS_MISSING;

    /*
     * The permission scope
     */
    @JsonProperty(value = "scope")
    private String scope;

    /*
     * The permission list
     */
    @JsonProperty(value = "permissions")
    private List<String> permissions;

    /*
     * The recommended role to resolve permissions missing
     */
    @JsonProperty(value = "recommendedRole")
    private String recommendedRole;

    /**
     * Creates an instance of PermissionsMissingDryrunPrerequisiteResult class.
     */
    public PermissionsMissingDryrunPrerequisiteResult() {
    }

    /**
     * Get the type property: The type of dryrun result.
     * 
     * @return the type value.
     */
    @Override
    public DryrunPrerequisiteResultType type() {
        return this.type;
    }

    /**
     * Get the scope property: The permission scope.
     * 
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: The permission scope.
     * 
     * @param scope the scope value to set.
     * @return the PermissionsMissingDryrunPrerequisiteResult object itself.
     */
    public PermissionsMissingDryrunPrerequisiteResult withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the permissions property: The permission list.
     * 
     * @return the permissions value.
     */
    public List<String> permissions() {
        return this.permissions;
    }

    /**
     * Set the permissions property: The permission list.
     * 
     * @param permissions the permissions value to set.
     * @return the PermissionsMissingDryrunPrerequisiteResult object itself.
     */
    public PermissionsMissingDryrunPrerequisiteResult withPermissions(List<String> permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get the recommendedRole property: The recommended role to resolve permissions missing.
     * 
     * @return the recommendedRole value.
     */
    public String recommendedRole() {
        return this.recommendedRole;
    }

    /**
     * Set the recommendedRole property: The recommended role to resolve permissions missing.
     * 
     * @param recommendedRole the recommendedRole value to set.
     * @return the PermissionsMissingDryrunPrerequisiteResult object itself.
     */
    public PermissionsMissingDryrunPrerequisiteResult withRecommendedRole(String recommendedRole) {
        this.recommendedRole = recommendedRole;
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
    }
}
