// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/**
 * The interface for AppConfigurationManagementClient class.
 */
public interface AppConfigurationManagementClient {
    /**
     * Gets The Microsoft Azure subscription ID.
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
     * Gets the ConfigurationStoresClient object to access its operations.
     * 
     * @return the ConfigurationStoresClient object.
     */
    ConfigurationStoresClient getConfigurationStores();

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
     * Gets the KeyValuesClient object to access its operations.
     * 
     * @return the KeyValuesClient object.
     */
    KeyValuesClient getKeyValues();

    /**
     * Gets the ReplicasClient object to access its operations.
     * 
     * @return the ReplicasClient object.
     */
    ReplicasClient getReplicas();

    /**
     * Gets the SnapshotsClient object to access its operations.
     * 
     * @return the SnapshotsClient object.
     */
    SnapshotsClient getSnapshots();
}
