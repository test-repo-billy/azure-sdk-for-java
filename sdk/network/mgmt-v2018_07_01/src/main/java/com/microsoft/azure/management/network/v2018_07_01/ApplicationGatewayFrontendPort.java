/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Frontend port of an application gateway.
 */
@JsonFlatten
public class ApplicationGatewayFrontendPort extends SubResource {
    /**
     * Frontend port.
     */
    @JsonProperty(value = "properties.port")
    private Integer port;

    /**
     * Provisioning state of the frontend port resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Name of the frontend port that is unique within an Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get frontend port.
     *
     * @return the port value
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set frontend port.
     *
     * @param port the port value to set
     * @return the ApplicationGatewayFrontendPort object itself.
     */
    public ApplicationGatewayFrontendPort withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get provisioning state of the frontend port resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set provisioning state of the frontend port resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the ApplicationGatewayFrontendPort object itself.
     */
    public ApplicationGatewayFrontendPort withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get name of the frontend port that is unique within an Application Gateway.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the frontend port that is unique within an Application Gateway.
     *
     * @param name the name value to set
     * @return the ApplicationGatewayFrontendPort object itself.
     */
    public ApplicationGatewayFrontendPort withName(String name) {
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

    /**
     * Set a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set
     * @return the ApplicationGatewayFrontendPort object itself.
     */
    public ApplicationGatewayFrontendPort withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get type of the resource.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set type of the resource.
     *
     * @param type the type value to set
     * @return the ApplicationGatewayFrontendPort object itself.
     */
    public ApplicationGatewayFrontendPort withType(String type) {
        this.type = type;
        return this;
    }

}
