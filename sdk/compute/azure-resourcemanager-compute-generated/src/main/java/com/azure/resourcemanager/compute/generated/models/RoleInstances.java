// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Specifies a list of role instances from the cloud service.
 */
@Fluent
public final class RoleInstances {
    /*
     * List of cloud service role instance names. Value of '*' will signify all role instances of the cloud service.
     */
    @JsonProperty(value = "roleInstances", required = true)
    private List<String> roleInstances;

    /**
     * Creates an instance of RoleInstances class.
     */
    public RoleInstances() {
    }

    /**
     * Get the roleInstances property: List of cloud service role instance names. Value of '*' will signify all role
     * instances of the cloud service.
     * 
     * @return the roleInstances value.
     */
    public List<String> roleInstances() {
        return this.roleInstances;
    }

    /**
     * Set the roleInstances property: List of cloud service role instance names. Value of '*' will signify all role
     * instances of the cloud service.
     * 
     * @param roleInstances the roleInstances value to set.
     * @return the RoleInstances object itself.
     */
    public RoleInstances withRoleInstances(List<String> roleInstances) {
        this.roleInstances = roleInstances;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (roleInstances() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property roleInstances in model RoleInstances"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RoleInstances.class);
}
