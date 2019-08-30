/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The object that represents the operation.
 */
public class ApiOperationDisplay {
    /**
     * Operation type: Read, write, delete, etc.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /**
     * Service provider: Microsoft.StorageCache.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /**
     * Resource on which the operation is performed: cache, etc.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /**
     * Get operation type: Read, write, delete, etc.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set operation type: Read, write, delete, etc.
     *
     * @param operation the operation value to set
     * @return the ApiOperationDisplay object itself.
     */
    public ApiOperationDisplay withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get service provider: Microsoft.StorageCache.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set service provider: Microsoft.StorageCache.
     *
     * @param provider the provider value to set
     * @return the ApiOperationDisplay object itself.
     */
    public ApiOperationDisplay withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get resource on which the operation is performed: cache, etc.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set resource on which the operation is performed: cache, etc.
     *
     * @param resource the resource value to set
     * @return the ApiOperationDisplay object itself.
     */
    public ApiOperationDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

}
