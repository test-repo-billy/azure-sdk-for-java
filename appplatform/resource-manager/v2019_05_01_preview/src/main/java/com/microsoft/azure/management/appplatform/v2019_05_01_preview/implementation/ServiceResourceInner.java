/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2019_05_01_preview.implementation;

import com.microsoft.azure.management.appplatform.v2019_05_01_preview.ClusterResourceProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Service resource.
 */
@SkipParentValidation
public class ServiceResourceInner extends Resource {
    /**
     * Properties of the Service resource.
     */
    @JsonProperty(value = "properties")
    private ClusterResourceProperties properties;

    /**
     * Get properties of the Service resource.
     *
     * @return the properties value
     */
    public ClusterResourceProperties properties() {
        return this.properties;
    }

    /**
     * Set properties of the Service resource.
     *
     * @param properties the properties value to set
     * @return the ServiceResourceInner object itself.
     */
    public ServiceResourceInner withProperties(ClusterResourceProperties properties) {
        this.properties = properties;
        return this;
    }

}
