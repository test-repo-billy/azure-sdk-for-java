// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * NFS Azure File Properties.
 */
@Fluent
public final class NfsAzureFileProperties {
    /*
     * Server for NFS azure file.
     */
    @JsonProperty(value = "server")
    private String server;

    /*
     * Access mode for storage
     */
    @JsonProperty(value = "accessMode")
    private AccessMode accessMode;

    /*
     * NFS Azure file share name.
     */
    @JsonProperty(value = "shareName")
    private String shareName;

    /**
     * Creates an instance of NfsAzureFileProperties class.
     */
    public NfsAzureFileProperties() {
    }

    /**
     * Get the server property: Server for NFS azure file.
     * 
     * @return the server value.
     */
    public String server() {
        return this.server;
    }

    /**
     * Set the server property: Server for NFS azure file.
     * 
     * @param server the server value to set.
     * @return the NfsAzureFileProperties object itself.
     */
    public NfsAzureFileProperties withServer(String server) {
        this.server = server;
        return this;
    }

    /**
     * Get the accessMode property: Access mode for storage.
     * 
     * @return the accessMode value.
     */
    public AccessMode accessMode() {
        return this.accessMode;
    }

    /**
     * Set the accessMode property: Access mode for storage.
     * 
     * @param accessMode the accessMode value to set.
     * @return the NfsAzureFileProperties object itself.
     */
    public NfsAzureFileProperties withAccessMode(AccessMode accessMode) {
        this.accessMode = accessMode;
        return this;
    }

    /**
     * Get the shareName property: NFS Azure file share name.
     * 
     * @return the shareName value.
     */
    public String shareName() {
        return this.shareName;
    }

    /**
     * Set the shareName property: NFS Azure file share name.
     * 
     * @param shareName the shareName value to set.
     * @return the NfsAzureFileProperties object itself.
     */
    public NfsAzureFileProperties withShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
