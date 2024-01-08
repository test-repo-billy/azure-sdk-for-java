// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.models.OperationMode;
import com.azure.resourcemanager.sql.generated.models.StorageKeyType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains the database information after successful export.
 */
@Fluent
public final class DatabaseExtensionsProperties {
    /*
     * Operation Mode.
     */
    @JsonProperty(value = "operationMode", required = true)
    private OperationMode operationMode;

    /*
     * Storage key type.
     */
    @JsonProperty(value = "storageKeyType", required = true)
    private StorageKeyType storageKeyType;

    /*
     * Storage key.
     */
    @JsonProperty(value = "storageKey", required = true)
    private String storageKey;

    /*
     * Storage Uri.
     */
    @JsonProperty(value = "storageUri", required = true)
    private String storageUri;

    /**
     * Creates an instance of DatabaseExtensionsProperties class.
     */
    public DatabaseExtensionsProperties() {
    }

    /**
     * Get the operationMode property: Operation Mode.
     * 
     * @return the operationMode value.
     */
    public OperationMode operationMode() {
        return this.operationMode;
    }

    /**
     * Set the operationMode property: Operation Mode.
     * 
     * @param operationMode the operationMode value to set.
     * @return the DatabaseExtensionsProperties object itself.
     */
    public DatabaseExtensionsProperties withOperationMode(OperationMode operationMode) {
        this.operationMode = operationMode;
        return this;
    }

    /**
     * Get the storageKeyType property: Storage key type.
     * 
     * @return the storageKeyType value.
     */
    public StorageKeyType storageKeyType() {
        return this.storageKeyType;
    }

    /**
     * Set the storageKeyType property: Storage key type.
     * 
     * @param storageKeyType the storageKeyType value to set.
     * @return the DatabaseExtensionsProperties object itself.
     */
    public DatabaseExtensionsProperties withStorageKeyType(StorageKeyType storageKeyType) {
        this.storageKeyType = storageKeyType;
        return this;
    }

    /**
     * Get the storageKey property: Storage key.
     * 
     * @return the storageKey value.
     */
    public String storageKey() {
        return this.storageKey;
    }

    /**
     * Set the storageKey property: Storage key.
     * 
     * @param storageKey the storageKey value to set.
     * @return the DatabaseExtensionsProperties object itself.
     */
    public DatabaseExtensionsProperties withStorageKey(String storageKey) {
        this.storageKey = storageKey;
        return this;
    }

    /**
     * Get the storageUri property: Storage Uri.
     * 
     * @return the storageUri value.
     */
    public String storageUri() {
        return this.storageUri;
    }

    /**
     * Set the storageUri property: Storage Uri.
     * 
     * @param storageUri the storageUri value to set.
     * @return the DatabaseExtensionsProperties object itself.
     */
    public DatabaseExtensionsProperties withStorageUri(String storageUri) {
        this.storageUri = storageUri;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (operationMode() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property operationMode in model DatabaseExtensionsProperties"));
        }
        if (storageKeyType() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property storageKeyType in model DatabaseExtensionsProperties"));
        }
        if (storageKey() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property storageKey in model DatabaseExtensionsProperties"));
        }
        if (storageUri() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property storageUri in model DatabaseExtensionsProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DatabaseExtensionsProperties.class);
}
