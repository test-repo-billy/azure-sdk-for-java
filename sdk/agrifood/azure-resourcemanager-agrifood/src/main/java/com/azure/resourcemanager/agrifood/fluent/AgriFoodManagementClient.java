// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/**
 * The interface for AgriFoodManagementClient class.
 */
public interface AgriFoodManagementClient {
    /**
     * Gets The ID of the target subscription. The value must be an UUID.
     * 
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

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
     * Gets the CheckNameAvailabilitiesClient object to access its operations.
     * 
     * @return the CheckNameAvailabilitiesClient object.
     */
    CheckNameAvailabilitiesClient getCheckNameAvailabilities();

    /**
     * Gets the DataConnectorsClient object to access its operations.
     * 
     * @return the DataConnectorsClient object.
     */
    DataConnectorsClient getDataConnectors();

    /**
     * Gets the DataManagerForAgricultureExtensionsClient object to access its operations.
     * 
     * @return the DataManagerForAgricultureExtensionsClient object.
     */
    DataManagerForAgricultureExtensionsClient getDataManagerForAgricultureExtensions();

    /**
     * Gets the DataManagerForAgricultureResourcesClient object to access its operations.
     * 
     * @return the DataManagerForAgricultureResourcesClient object.
     */
    DataManagerForAgricultureResourcesClient getDataManagerForAgricultureResources();

    /**
     * Gets the OperationResultsClient object to access its operations.
     * 
     * @return the OperationResultsClient object.
     */
    OperationResultsClient getOperationResults();

    /**
     * Gets the ExtensionsClient object to access its operations.
     * 
     * @return the ExtensionsClient object.
     */
    ExtensionsClient getExtensions();

    /**
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     * 
     * @return the PrivateEndpointConnectionsClient object.
     */
    PrivateEndpointConnectionsClient getPrivateEndpointConnections();

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     * 
     * @return the PrivateLinkResourcesClient object.
     */
    PrivateLinkResourcesClient getPrivateLinkResources();

    /**
     * Gets the SolutionsClient object to access its operations.
     * 
     * @return the SolutionsClient object.
     */
    SolutionsClient getSolutions();

    /**
     * Gets the SolutionsDiscoverabilitiesClient object to access its operations.
     * 
     * @return the SolutionsDiscoverabilitiesClient object.
     */
    SolutionsDiscoverabilitiesClient getSolutionsDiscoverabilities();
}
