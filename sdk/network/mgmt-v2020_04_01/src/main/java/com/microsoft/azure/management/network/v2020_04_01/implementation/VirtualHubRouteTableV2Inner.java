/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2020_04_01.VirtualHubRouteV2;
import com.microsoft.azure.management.network.v2020_04_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * VirtualHubRouteTableV2 Resource.
 */
@JsonFlatten
public class VirtualHubRouteTableV2Inner extends SubResource {
    /**
     * List of all routes.
     */
    @JsonProperty(value = "properties.routes")
    private List<VirtualHubRouteV2> routes;

    /**
     * List of all connections attached to this route table v2.
     */
    @JsonProperty(value = "properties.attachedConnections")
    private List<String> attachedConnections;

    /**
     * The provisioning state of the virtual hub route table v2 resource.
     * Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get list of all routes.
     *
     * @return the routes value
     */
    public List<VirtualHubRouteV2> routes() {
        return this.routes;
    }

    /**
     * Set list of all routes.
     *
     * @param routes the routes value to set
     * @return the VirtualHubRouteTableV2Inner object itself.
     */
    public VirtualHubRouteTableV2Inner withRoutes(List<VirtualHubRouteV2> routes) {
        this.routes = routes;
        return this;
    }

    /**
     * Get list of all connections attached to this route table v2.
     *
     * @return the attachedConnections value
     */
    public List<String> attachedConnections() {
        return this.attachedConnections;
    }

    /**
     * Set list of all connections attached to this route table v2.
     *
     * @param attachedConnections the attachedConnections value to set
     * @return the VirtualHubRouteTableV2Inner object itself.
     */
    public VirtualHubRouteTableV2Inner withAttachedConnections(List<String> attachedConnections) {
        this.attachedConnections = attachedConnections;
        return this;
    }

    /**
     * Get the provisioning state of the virtual hub route table v2 resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the VirtualHubRouteTableV2Inner object itself.
     */
    public VirtualHubRouteTableV2Inner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

}
