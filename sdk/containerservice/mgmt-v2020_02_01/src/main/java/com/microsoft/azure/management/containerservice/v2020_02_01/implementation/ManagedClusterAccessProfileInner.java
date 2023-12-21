/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_02_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Managed cluster Access Profile.
 */
@JsonFlatten
public class ManagedClusterAccessProfileInner extends Resource {
    /**
     * Base64-encoded Kubernetes configuration file.
     */
    @JsonProperty(value = "properties.kubeConfig")
    private byte[] kubeConfig;

    /**
     * Get base64-encoded Kubernetes configuration file.
     *
     * @return the kubeConfig value
     */
    public byte[] kubeConfig() {
        return this.kubeConfig;
    }

    /**
     * Set base64-encoded Kubernetes configuration file.
     *
     * @param kubeConfig the kubeConfig value to set
     * @return the ManagedClusterAccessProfileInner object itself.
     */
    public ManagedClusterAccessProfileInner withKubeConfig(byte[] kubeConfig) {
        this.kubeConfig = kubeConfig;
        return this;
    }

}
