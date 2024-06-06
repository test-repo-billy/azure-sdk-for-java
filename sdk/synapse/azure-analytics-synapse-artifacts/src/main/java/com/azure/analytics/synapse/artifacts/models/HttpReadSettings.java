// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Http read settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("HttpReadSettings")
@Fluent
public final class HttpReadSettings extends StoreReadSettings {
    /*
     * The HTTP method used to call the RESTful API. The default is GET. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "requestMethod")
    private Object requestMethod;

    /*
     * The HTTP request body to the RESTful API if requestMethod is POST. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "requestBody")
    private Object requestBody;

    /*
     * The additional HTTP headers in the request to the RESTful API. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "additionalHeaders")
    private Object additionalHeaders;

    /*
     * Specifies the timeout for a HTTP client to get HTTP response from HTTP server.
     */
    @JsonProperty(value = "requestTimeout")
    private Object requestTimeout;

    /*
     * Indicates whether to enable partition discovery. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "enablePartitionDiscovery")
    private Object enablePartitionDiscovery;

    /*
     * Specify the root path where partition discovery starts from. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "partitionRootPath")
    private Object partitionRootPath;

    /*
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or
     * Expression with resultType array of objects).
     */
    @JsonProperty(value = "additionalColumns")
    private Object additionalColumns;

    /** Creates an instance of HttpReadSettings class. */
    public HttpReadSettings() {}

    /**
     * Get the requestMethod property: The HTTP method used to call the RESTful API. The default is GET. Type: string
     * (or Expression with resultType string).
     *
     * @return the requestMethod value.
     */
    public Object getRequestMethod() {
        return this.requestMethod;
    }

    /**
     * Set the requestMethod property: The HTTP method used to call the RESTful API. The default is GET. Type: string
     * (or Expression with resultType string).
     *
     * @param requestMethod the requestMethod value to set.
     * @return the HttpReadSettings object itself.
     */
    public HttpReadSettings setRequestMethod(Object requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }

    /**
     * Get the requestBody property: The HTTP request body to the RESTful API if requestMethod is POST. Type: string (or
     * Expression with resultType string).
     *
     * @return the requestBody value.
     */
    public Object getRequestBody() {
        return this.requestBody;
    }

    /**
     * Set the requestBody property: The HTTP request body to the RESTful API if requestMethod is POST. Type: string (or
     * Expression with resultType string).
     *
     * @param requestBody the requestBody value to set.
     * @return the HttpReadSettings object itself.
     */
    public HttpReadSettings setRequestBody(Object requestBody) {
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Get the additionalHeaders property: The additional HTTP headers in the request to the RESTful API. Type: string
     * (or Expression with resultType string).
     *
     * @return the additionalHeaders value.
     */
    public Object getAdditionalHeaders() {
        return this.additionalHeaders;
    }

    /**
     * Set the additionalHeaders property: The additional HTTP headers in the request to the RESTful API. Type: string
     * (or Expression with resultType string).
     *
     * @param additionalHeaders the additionalHeaders value to set.
     * @return the HttpReadSettings object itself.
     */
    public HttpReadSettings setAdditionalHeaders(Object additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
        return this;
    }

    /**
     * Get the requestTimeout property: Specifies the timeout for a HTTP client to get HTTP response from HTTP server.
     *
     * @return the requestTimeout value.
     */
    public Object getRequestTimeout() {
        return this.requestTimeout;
    }

    /**
     * Set the requestTimeout property: Specifies the timeout for a HTTP client to get HTTP response from HTTP server.
     *
     * @param requestTimeout the requestTimeout value to set.
     * @return the HttpReadSettings object itself.
     */
    public HttpReadSettings setRequestTimeout(Object requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }

    /**
     * Get the enablePartitionDiscovery property: Indicates whether to enable partition discovery. Type: boolean (or
     * Expression with resultType boolean).
     *
     * @return the enablePartitionDiscovery value.
     */
    public Object getEnablePartitionDiscovery() {
        return this.enablePartitionDiscovery;
    }

    /**
     * Set the enablePartitionDiscovery property: Indicates whether to enable partition discovery. Type: boolean (or
     * Expression with resultType boolean).
     *
     * @param enablePartitionDiscovery the enablePartitionDiscovery value to set.
     * @return the HttpReadSettings object itself.
     */
    public HttpReadSettings setEnablePartitionDiscovery(Object enablePartitionDiscovery) {
        this.enablePartitionDiscovery = enablePartitionDiscovery;
        return this;
    }

    /**
     * Get the partitionRootPath property: Specify the root path where partition discovery starts from. Type: string (or
     * Expression with resultType string).
     *
     * @return the partitionRootPath value.
     */
    public Object getPartitionRootPath() {
        return this.partitionRootPath;
    }

    /**
     * Set the partitionRootPath property: Specify the root path where partition discovery starts from. Type: string (or
     * Expression with resultType string).
     *
     * @param partitionRootPath the partitionRootPath value to set.
     * @return the HttpReadSettings object itself.
     */
    public HttpReadSettings setPartitionRootPath(Object partitionRootPath) {
        this.partitionRootPath = partitionRootPath;
        return this;
    }

    /**
     * Get the additionalColumns property: Specifies the additional columns to be added to source data. Type: array of
     * objects(AdditionalColumns) (or Expression with resultType array of objects).
     *
     * @return the additionalColumns value.
     */
    public Object getAdditionalColumns() {
        return this.additionalColumns;
    }

    /**
     * Set the additionalColumns property: Specifies the additional columns to be added to source data. Type: array of
     * objects(AdditionalColumns) (or Expression with resultType array of objects).
     *
     * @param additionalColumns the additionalColumns value to set.
     * @return the HttpReadSettings object itself.
     */
    public HttpReadSettings setAdditionalColumns(Object additionalColumns) {
        this.additionalColumns = additionalColumns;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HttpReadSettings setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }
}
