// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** The ResourceIdentity model. */
@Fluent
public final class ResourceIdentity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceIdentity.class);

    /*
     * The Azure Active Directory principal id.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID principalId;

    /*
     * The identity type. Set this to 'SystemAssigned' in order to
     * automatically create and assign an Azure Active Directory principal for
     * the resource.
     */
    @JsonProperty(value = "type")
    private IdentityType type;

    /*
     * The Azure Active Directory tenant id.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID tenantId;

    /**
     * Get the principalId property: The Azure Active Directory principal id.
     *
     * @return the principalId value.
     */
    public UUID principalId() {
        return this.principalId;
    }

    /**
     * Get the type property: The identity type. Set this to 'SystemAssigned' in order to automatically create and
     * assign an Azure Active Directory principal for the resource.
     *
     * @return the type value.
     */
    public IdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: The identity type. Set this to 'SystemAssigned' in order to automatically create and
     * assign an Azure Active Directory principal for the resource.
     *
     * @param type the type value to set.
     * @return the ResourceIdentity object itself.
     */
    public ResourceIdentity withType(IdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the tenantId property: The Azure Active Directory tenant id.
     *
     * @return the tenantId value.
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
