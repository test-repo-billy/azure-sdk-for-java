// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.network.generated.models.ExpressRoutePortAuthorizationUseStatus;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ExpressRoute Port Authorization Properties
 * 
 * Properties of ExpressRoutePort Authorization.
 */
@Immutable
public final class ExpressRoutePortAuthorizationPropertiesFormat {
    /*
     * The authorization key.
     */
    @JsonProperty(value = "authorizationKey", access = JsonProperty.Access.WRITE_ONLY)
    private String authorizationKey;

    /*
     * The authorization use status.
     */
    @JsonProperty(value = "authorizationUseStatus", access = JsonProperty.Access.WRITE_ONLY)
    private ExpressRoutePortAuthorizationUseStatus authorizationUseStatus;

    /*
     * The reference to the ExpressRoute circuit resource using the authorization.
     */
    @JsonProperty(value = "circuitResourceUri", access = JsonProperty.Access.WRITE_ONLY)
    private String circuitResourceUri;

    /*
     * The provisioning state of the authorization resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of ExpressRoutePortAuthorizationPropertiesFormat class.
     */
    public ExpressRoutePortAuthorizationPropertiesFormat() {
    }

    /**
     * Get the authorizationKey property: The authorization key.
     * 
     * @return the authorizationKey value.
     */
    public String authorizationKey() {
        return this.authorizationKey;
    }

    /**
     * Get the authorizationUseStatus property: The authorization use status.
     * 
     * @return the authorizationUseStatus value.
     */
    public ExpressRoutePortAuthorizationUseStatus authorizationUseStatus() {
        return this.authorizationUseStatus;
    }

    /**
     * Get the circuitResourceUri property: The reference to the ExpressRoute circuit resource using the authorization.
     * 
     * @return the circuitResourceUri value.
     */
    public String circuitResourceUri() {
        return this.circuitResourceUri;
    }

    /**
     * Get the provisioningState property: The provisioning state of the authorization resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
