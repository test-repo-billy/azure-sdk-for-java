// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.resourcemanager.cosmos.generated.fluent.models.CassandraClusterPublicStatusInner;
import java.util.List;

/**
 * An immutable client-side representation of CassandraClusterPublicStatus.
 */
public interface CassandraClusterPublicStatus {
    /**
     * Gets the etag property: The eTag property.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the reaperStatus property: The reaperStatus property.
     * 
     * @return the reaperStatus value.
     */
    ManagedCassandraReaperStatus reaperStatus();

    /**
     * Gets the connectionErrors property: List relevant information about any connection errors to the Datacenters.
     * 
     * @return the connectionErrors value.
     */
    List<ConnectionError> connectionErrors();

    /**
     * Gets the errors property: List relevant information about any errors about cluster, data center and connection
     * error.
     * 
     * @return the errors value.
     */
    List<CassandraError> errors();

    /**
     * Gets the dataCenters property: List of the status of each datacenter in this cluster.
     * 
     * @return the dataCenters value.
     */
    List<CassandraClusterPublicStatusDataCentersItem> dataCenters();

    /**
     * Gets the inner com.azure.resourcemanager.cosmos.generated.fluent.models.CassandraClusterPublicStatusInner object.
     * 
     * @return the inner object.
     */
    CassandraClusterPublicStatusInner innerModel();
}
