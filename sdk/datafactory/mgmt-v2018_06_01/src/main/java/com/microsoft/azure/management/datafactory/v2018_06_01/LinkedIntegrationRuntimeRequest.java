/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data factory name for linked integration runtime request.
 */
public class LinkedIntegrationRuntimeRequest {
    /**
     * The data factory name for linked integration runtime.
     */
    @JsonProperty(value = "factoryName", required = true)
    private String linkedFactoryName;

    /**
     * Get the data factory name for linked integration runtime.
     *
     * @return the linkedFactoryName value
     */
    public String linkedFactoryName() {
        return this.linkedFactoryName;
    }

    /**
     * Set the data factory name for linked integration runtime.
     *
     * @param linkedFactoryName the linkedFactoryName value to set
     * @return the LinkedIntegrationRuntimeRequest object itself.
     */
    public LinkedIntegrationRuntimeRequest withLinkedFactoryName(String linkedFactoryName) {
        this.linkedFactoryName = linkedFactoryName;
        return this;
    }

}
