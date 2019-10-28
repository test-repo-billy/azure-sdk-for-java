/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.implementation.DatasetInner;

/**
 * The Azure Search Index.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = AzureSearchIndexDataset.class)
@JsonTypeName("AzureSearchIndex")
@JsonFlatten
public class AzureSearchIndexDataset extends DatasetInner {
    /**
     * The name of the Azure Search Index. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.indexName", required = true)
    private Object indexName;

    /**
     * Get the name of the Azure Search Index. Type: string (or Expression with resultType string).
     *
     * @return the indexName value
     */
    public Object indexName() {
        return this.indexName;
    }

    /**
     * Set the name of the Azure Search Index. Type: string (or Expression with resultType string).
     *
     * @param indexName the indexName value to set
     * @return the AzureSearchIndexDataset object itself.
     */
    public AzureSearchIndexDataset withIndexName(Object indexName) {
        this.indexName = indexName;
        return this;
    }

}
