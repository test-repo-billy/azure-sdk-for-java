// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.resourcemanager.sql.generated.fluent.models.VirtualClusterInner;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of VirtualCluster.
 */
public interface VirtualCluster {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the subnetId property: Subnet resource ID for the virtual cluster.
     * 
     * @return the subnetId value.
     */
    String subnetId();

    /**
     * Gets the version property: Virtual cluster version.
     * 
     * @return the version value.
     */
    String version();

    /**
     * Gets the childResources property: List of resources in this virtual cluster.
     * 
     * @return the childResources value.
     */
    List<String> childResources();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.VirtualClusterInner object.
     * 
     * @return the inner object.
     */
    VirtualClusterInner innerModel();
}
