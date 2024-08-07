// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Structure for any Identity provider.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "kind",
    defaultImpl = OpenShiftManagedClusterBaseIdentityProvider.class,
    visible = true)
@JsonTypeName("OpenShiftManagedClusterBaseIdentityProvider")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AADIdentityProvider", value = OpenShiftManagedClusterAadIdentityProvider.class) })
@Immutable
public class OpenShiftManagedClusterBaseIdentityProvider {
    /*
     * The kind of the provider.
     */
    @JsonTypeId
    @JsonProperty(value = "kind", required = true)
    private String kind = "OpenShiftManagedClusterBaseIdentityProvider";

    /**
     * Creates an instance of OpenShiftManagedClusterBaseIdentityProvider class.
     */
    public OpenShiftManagedClusterBaseIdentityProvider() {
    }

    /**
     * Get the kind property: The kind of the provider.
     * 
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
