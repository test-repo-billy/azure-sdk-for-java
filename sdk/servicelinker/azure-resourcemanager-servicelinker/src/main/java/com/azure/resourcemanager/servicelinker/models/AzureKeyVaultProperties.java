// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The resource properties when type is Azure Key Vault.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "type",
    defaultImpl = AzureKeyVaultProperties.class,
    visible = true)
@JsonTypeName("KeyVault")
@Fluent
public final class AzureKeyVaultProperties extends AzureResourcePropertiesBase {
    /*
     * The azure resource type.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private AzureResourceType type = AzureResourceType.KEY_VAULT;

    /*
     * True if connect via Kubernetes CSI Driver.
     */
    @JsonProperty(value = "connectAsKubernetesCsiDriver")
    private Boolean connectAsKubernetesCsiDriver;

    /**
     * Creates an instance of AzureKeyVaultProperties class.
     */
    public AzureKeyVaultProperties() {
    }

    /**
     * Get the type property: The azure resource type.
     * 
     * @return the type value.
     */
    @Override
    public AzureResourceType type() {
        return this.type;
    }

    /**
     * Get the connectAsKubernetesCsiDriver property: True if connect via Kubernetes CSI Driver.
     * 
     * @return the connectAsKubernetesCsiDriver value.
     */
    public Boolean connectAsKubernetesCsiDriver() {
        return this.connectAsKubernetesCsiDriver;
    }

    /**
     * Set the connectAsKubernetesCsiDriver property: True if connect via Kubernetes CSI Driver.
     * 
     * @param connectAsKubernetesCsiDriver the connectAsKubernetesCsiDriver value to set.
     * @return the AzureKeyVaultProperties object itself.
     */
    public AzureKeyVaultProperties withConnectAsKubernetesCsiDriver(Boolean connectAsKubernetesCsiDriver) {
        this.connectAsKubernetesCsiDriver = connectAsKubernetesCsiDriver;
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
