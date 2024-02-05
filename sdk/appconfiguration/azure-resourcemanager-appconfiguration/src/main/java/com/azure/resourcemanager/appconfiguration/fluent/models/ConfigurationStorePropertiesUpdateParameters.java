// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appconfiguration.models.DataPlaneProxyProperties;
import com.azure.resourcemanager.appconfiguration.models.EncryptionProperties;
import com.azure.resourcemanager.appconfiguration.models.PublicNetworkAccess;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties for updating a configuration store.
 */
@Fluent
public final class ConfigurationStorePropertiesUpdateParameters {
    /*
     * The encryption settings of the configuration store.
     */
    @JsonProperty(value = "encryption")
    private EncryptionProperties encryption;

    /*
     * Disables all authentication methods other than AAD authentication.
     */
    @JsonProperty(value = "disableLocalAuth")
    private Boolean disableLocalAuth;

    /*
     * Control permission for data plane traffic coming from public networks while private endpoint is enabled.
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * Property specifying whether protection against purge is enabled for this configuration store.
     */
    @JsonProperty(value = "enablePurgeProtection")
    private Boolean enablePurgeProtection;

    /*
     * Property specifying the configuration of data plane proxy for Azure Resource Manager (ARM).
     */
    @JsonProperty(value = "dataPlaneProxy")
    private DataPlaneProxyProperties dataPlaneProxy;

    /**
     * Creates an instance of ConfigurationStorePropertiesUpdateParameters class.
     */
    public ConfigurationStorePropertiesUpdateParameters() {
    }

    /**
     * Get the encryption property: The encryption settings of the configuration store.
     * 
     * @return the encryption value.
     */
    public EncryptionProperties encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: The encryption settings of the configuration store.
     * 
     * @param encryption the encryption value to set.
     * @return the ConfigurationStorePropertiesUpdateParameters object itself.
     */
    public ConfigurationStorePropertiesUpdateParameters withEncryption(EncryptionProperties encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the disableLocalAuth property: Disables all authentication methods other than AAD authentication.
     * 
     * @return the disableLocalAuth value.
     */
    public Boolean disableLocalAuth() {
        return this.disableLocalAuth;
    }

    /**
     * Set the disableLocalAuth property: Disables all authentication methods other than AAD authentication.
     * 
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the ConfigurationStorePropertiesUpdateParameters object itself.
     */
    public ConfigurationStorePropertiesUpdateParameters withDisableLocalAuth(Boolean disableLocalAuth) {
        this.disableLocalAuth = disableLocalAuth;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Control permission for data plane traffic coming from public networks
     * while private endpoint is enabled.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Control permission for data plane traffic coming from public networks
     * while private endpoint is enabled.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the ConfigurationStorePropertiesUpdateParameters object itself.
     */
    public ConfigurationStorePropertiesUpdateParameters
        withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the enablePurgeProtection property: Property specifying whether protection against purge is enabled for this
     * configuration store.
     * 
     * @return the enablePurgeProtection value.
     */
    public Boolean enablePurgeProtection() {
        return this.enablePurgeProtection;
    }

    /**
     * Set the enablePurgeProtection property: Property specifying whether protection against purge is enabled for this
     * configuration store.
     * 
     * @param enablePurgeProtection the enablePurgeProtection value to set.
     * @return the ConfigurationStorePropertiesUpdateParameters object itself.
     */
    public ConfigurationStorePropertiesUpdateParameters withEnablePurgeProtection(Boolean enablePurgeProtection) {
        this.enablePurgeProtection = enablePurgeProtection;
        return this;
    }

    /**
     * Get the dataPlaneProxy property: Property specifying the configuration of data plane proxy for Azure Resource
     * Manager (ARM).
     * 
     * @return the dataPlaneProxy value.
     */
    public DataPlaneProxyProperties dataPlaneProxy() {
        return this.dataPlaneProxy;
    }

    /**
     * Set the dataPlaneProxy property: Property specifying the configuration of data plane proxy for Azure Resource
     * Manager (ARM).
     * 
     * @param dataPlaneProxy the dataPlaneProxy value to set.
     * @return the ConfigurationStorePropertiesUpdateParameters object itself.
     */
    public ConfigurationStorePropertiesUpdateParameters withDataPlaneProxy(DataPlaneProxyProperties dataPlaneProxy) {
        this.dataPlaneProxy = dataPlaneProxy;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (encryption() != null) {
            encryption().validate();
        }
        if (dataPlaneProxy() != null) {
            dataPlaneProxy().validate();
        }
    }
}
