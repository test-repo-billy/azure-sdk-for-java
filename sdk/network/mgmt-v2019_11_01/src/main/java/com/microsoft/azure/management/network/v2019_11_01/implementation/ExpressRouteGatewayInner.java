/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01.implementation;

import com.microsoft.azure.management.network.v2019_11_01.ExpressRouteGatewayPropertiesAutoScaleConfiguration;
import java.util.List;
import com.microsoft.azure.management.network.v2019_11_01.ProvisioningState;
import com.microsoft.azure.management.network.v2019_11_01.VirtualHubId;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * ExpressRoute gateway resource.
 */
@JsonFlatten
@SkipParentValidation
public class ExpressRouteGatewayInner extends Resource {
    /**
     * Configuration for auto scaling.
     */
    @JsonProperty(value = "properties.autoScaleConfiguration")
    private ExpressRouteGatewayPropertiesAutoScaleConfiguration autoScaleConfiguration;

    /**
     * List of ExpressRoute connections to the ExpressRoute gateway.
     */
    @JsonProperty(value = "properties.expressRouteConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<ExpressRouteConnectionInner> expressRouteConnections;

    /**
     * The provisioning state of the express route gateway resource. Possible
     * values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The Virtual Hub where the ExpressRoute gateway is or will be deployed.
     */
    @JsonProperty(value = "properties.virtualHub", required = true)
    private VirtualHubId virtualHub;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get configuration for auto scaling.
     *
     * @return the autoScaleConfiguration value
     */
    public ExpressRouteGatewayPropertiesAutoScaleConfiguration autoScaleConfiguration() {
        return this.autoScaleConfiguration;
    }

    /**
     * Set configuration for auto scaling.
     *
     * @param autoScaleConfiguration the autoScaleConfiguration value to set
     * @return the ExpressRouteGatewayInner object itself.
     */
    public ExpressRouteGatewayInner withAutoScaleConfiguration(ExpressRouteGatewayPropertiesAutoScaleConfiguration autoScaleConfiguration) {
        this.autoScaleConfiguration = autoScaleConfiguration;
        return this;
    }

    /**
     * Get list of ExpressRoute connections to the ExpressRoute gateway.
     *
     * @return the expressRouteConnections value
     */
    public List<ExpressRouteConnectionInner> expressRouteConnections() {
        return this.expressRouteConnections;
    }

    /**
     * Get the provisioning state of the express route gateway resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the Virtual Hub where the ExpressRoute gateway is or will be deployed.
     *
     * @return the virtualHub value
     */
    public VirtualHubId virtualHub() {
        return this.virtualHub;
    }

    /**
     * Set the Virtual Hub where the ExpressRoute gateway is or will be deployed.
     *
     * @param virtualHub the virtualHub value to set
     * @return the ExpressRouteGatewayInner object itself.
     */
    public ExpressRouteGatewayInner withVirtualHub(VirtualHubId virtualHub) {
        this.virtualHub = virtualHub;
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

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the ExpressRouteGatewayInner object itself.
     */
    public ExpressRouteGatewayInner withId(String id) {
        this.id = id;
        return this;
    }

}
