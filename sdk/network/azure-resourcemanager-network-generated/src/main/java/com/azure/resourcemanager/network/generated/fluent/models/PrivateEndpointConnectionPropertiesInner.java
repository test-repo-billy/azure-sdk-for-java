// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the PrivateEndpointConnectProperties.
 */
@Fluent
public final class PrivateEndpointConnectionPropertiesInner {
    /*
     * The resource of private end point.
     */
    @JsonProperty(value = "privateEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private PrivateEndpointInner privateEndpoint;

    /*
     * A collection of information about the state of the connection between service consumer and provider.
     */
    @JsonProperty(value = "privateLinkServiceConnectionState")
    private PrivateLinkServiceConnectionState privateLinkServiceConnectionState;

    /*
     * The provisioning state of the private endpoint connection resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The consumer link id.
     */
    @JsonProperty(value = "linkIdentifier", access = JsonProperty.Access.WRITE_ONLY)
    private String linkIdentifier;

    /*
     * The location of the private endpoint.
     */
    @JsonProperty(value = "privateEndpointLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String privateEndpointLocation;

    /**
     * Creates an instance of PrivateEndpointConnectionPropertiesInner class.
     */
    public PrivateEndpointConnectionPropertiesInner() {
    }

    /**
     * Get the privateEndpoint property: The resource of private end point.
     * 
     * @return the privateEndpoint value.
     */
    public PrivateEndpointInner privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Get the privateLinkServiceConnectionState property: A collection of information about the state of the
     * connection between service consumer and provider.
     * 
     * @return the privateLinkServiceConnectionState value.
     */
    public PrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set the privateLinkServiceConnectionState property: A collection of information about the state of the
     * connection between service consumer and provider.
     * 
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the PrivateEndpointConnectionPropertiesInner object itself.
     */
    public PrivateEndpointConnectionPropertiesInner
        withPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the private endpoint connection resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the linkIdentifier property: The consumer link id.
     * 
     * @return the linkIdentifier value.
     */
    public String linkIdentifier() {
        return this.linkIdentifier;
    }

    /**
     * Get the privateEndpointLocation property: The location of the private endpoint.
     * 
     * @return the privateEndpointLocation value.
     */
    public String privateEndpointLocation() {
        return this.privateEndpointLocation;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateEndpoint() != null) {
            privateEndpoint().validate();
        }
        if (privateLinkServiceConnectionState() != null) {
            privateLinkServiceConnectionState().validate();
        }
    }
}
