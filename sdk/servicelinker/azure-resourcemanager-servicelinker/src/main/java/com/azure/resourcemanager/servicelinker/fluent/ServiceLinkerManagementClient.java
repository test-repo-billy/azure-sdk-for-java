// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/**
 * The interface for ServiceLinkerManagementClient class.
 */
public interface ServiceLinkerManagementClient {
    /**
     * Gets server parameter.
     * 
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     * 
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the ConnectorsClient object to access its operations.
     * 
     * @return the ConnectorsClient object.
     */
    ConnectorsClient getConnectors();

    /**
     * Gets the LinkersClient object to access its operations.
     * 
     * @return the LinkersClient object.
     */
    LinkersClient getLinkers();

    /**
     * Gets the LinkersOperationsClient object to access its operations.
     * 
     * @return the LinkersOperationsClient object.
     */
    LinkersOperationsClient getLinkersOperations();

    /**
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the ConfigurationNamesOperationsClient object to access its operations.
     * 
     * @return the ConfigurationNamesOperationsClient object.
     */
    ConfigurationNamesOperationsClient getConfigurationNamesOperations();
}
