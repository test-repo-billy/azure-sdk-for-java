/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The ip configuration for a container network interface.
 */
@JsonFlatten
public class ContainerNetworkInterfaceIpConfiguration {
    /**
     * The provisioning state of the container network interface IP
     * configuration resource. Possible values include: 'Succeeded',
     * 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The name of the resource. This name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Sub Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the provisioning state of the container network interface IP configuration resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the name of the resource. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the ContainerNetworkInterfaceIpConfiguration object itself.
     */
    public ContainerNetworkInterfaceIpConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get sub Resource type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
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
