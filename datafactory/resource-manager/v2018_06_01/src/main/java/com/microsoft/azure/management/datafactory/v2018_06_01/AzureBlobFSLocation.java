/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The location of azure blobFS dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = AzureBlobFSLocation.class)
@JsonTypeName("AzureBlobFSLocation")
public class AzureBlobFSLocation extends DatasetLocation {
    /**
     * Specify the fileSystem of azure blobFS. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "fileSystem")
    private Object fileSystem;

    /**
     * Get specify the fileSystem of azure blobFS. Type: string (or Expression with resultType string).
     *
     * @return the fileSystem value
     */
    public Object fileSystem() {
        return this.fileSystem;
    }

    /**
     * Set specify the fileSystem of azure blobFS. Type: string (or Expression with resultType string).
     *
     * @param fileSystem the fileSystem value to set
     * @return the AzureBlobFSLocation object itself.
     */
    public AzureBlobFSLocation withFileSystem(Object fileSystem) {
        this.fileSystem = fileSystem;
        return this;
    }

}
