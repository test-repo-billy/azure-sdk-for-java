// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.models.SecurityGroupNetworkInterface;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The information about security rules applied to the specified VM.
 */
@Fluent
public final class SecurityGroupViewResultInner {
    /*
     * List of network interfaces on the specified VM.
     */
    @JsonProperty(value = "networkInterfaces")
    private List<SecurityGroupNetworkInterface> networkInterfaces;

    /**
     * Creates an instance of SecurityGroupViewResultInner class.
     */
    public SecurityGroupViewResultInner() {
    }

    /**
     * Get the networkInterfaces property: List of network interfaces on the specified VM.
     * 
     * @return the networkInterfaces value.
     */
    public List<SecurityGroupNetworkInterface> networkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * Set the networkInterfaces property: List of network interfaces on the specified VM.
     * 
     * @param networkInterfaces the networkInterfaces value to set.
     * @return the SecurityGroupViewResultInner object itself.
     */
    public SecurityGroupViewResultInner withNetworkInterfaces(List<SecurityGroupNetworkInterface> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkInterfaces() != null) {
            networkInterfaces().forEach(e -> e.validate());
        }
    }
}
