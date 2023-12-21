/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_03_01.implementation;

import com.microsoft.azure.management.cosmosdb.v2020_03_01.ThroughputSettingsGetPropertiesResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.ARMResourceProperties;

/**
 * An Azure Cosmos DB resource throughput.
 */
@JsonFlatten
public class ThroughputSettingsGetResultsInner extends ARMResourceProperties {
    /**
     * The resource property.
     */
    @JsonProperty(value = "properties.resource")
    private ThroughputSettingsGetPropertiesResource resource;

    /**
     * Get the resource value.
     *
     * @return the resource value
     */
    public ThroughputSettingsGetPropertiesResource resource() {
        return this.resource;
    }

    /**
     * Set the resource value.
     *
     * @param resource the resource value to set
     * @return the ThroughputSettingsGetResultsInner object itself.
     */
    public ThroughputSettingsGetResultsInner withResource(ThroughputSettingsGetPropertiesResource resource) {
        this.resource = resource;
        return this;
    }

}
