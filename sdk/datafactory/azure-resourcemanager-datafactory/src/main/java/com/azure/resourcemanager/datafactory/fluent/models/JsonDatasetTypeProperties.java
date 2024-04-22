// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetLocation;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Json dataset properties.
 */
@Fluent
public final class JsonDatasetTypeProperties {
    /*
     * The location of the json data storage.
     */
    @JsonProperty(value = "location", required = true)
    private DatasetLocation location;

    /*
     * The code page name of the preferred encoding. If not specified, the default value is UTF-8, unless BOM denotes another Unicode encoding. Refer to the name column of the table in the following link to set supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "encodingName")
    private Object encodingName;

    /*
     * The data compression method used for the json dataset.
     */
    @JsonProperty(value = "compression")
    private DatasetCompression compression;

    /**
     * Creates an instance of JsonDatasetTypeProperties class.
     */
    public JsonDatasetTypeProperties() {
    }

    /**
     * Get the location property: The location of the json data storage.
     * 
     * @return the location value.
     */
    public DatasetLocation location() {
        return this.location;
    }

    /**
     * Set the location property: The location of the json data storage.
     * 
     * @param location the location value to set.
     * @return the JsonDatasetTypeProperties object itself.
     */
    public JsonDatasetTypeProperties withLocation(DatasetLocation location) {
        this.location = location;
        return this;
    }

    /**
     * Get the encodingName property: The code page name of the preferred encoding. If not specified, the default value
     * is UTF-8, unless BOM denotes another Unicode encoding. Refer to the name column of the table in the following
     * link to set supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type: string (or
     * Expression with resultType string).
     * 
     * @return the encodingName value.
     */
    public Object encodingName() {
        return this.encodingName;
    }

    /**
     * Set the encodingName property: The code page name of the preferred encoding. If not specified, the default value
     * is UTF-8, unless BOM denotes another Unicode encoding. Refer to the name column of the table in the following
     * link to set supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type: string (or
     * Expression with resultType string).
     * 
     * @param encodingName the encodingName value to set.
     * @return the JsonDatasetTypeProperties object itself.
     */
    public JsonDatasetTypeProperties withEncodingName(Object encodingName) {
        this.encodingName = encodingName;
        return this;
    }

    /**
     * Get the compression property: The data compression method used for the json dataset.
     * 
     * @return the compression value.
     */
    public DatasetCompression compression() {
        return this.compression;
    }

    /**
     * Set the compression property: The data compression method used for the json dataset.
     * 
     * @param compression the compression value to set.
     * @return the JsonDatasetTypeProperties object itself.
     */
    public JsonDatasetTypeProperties withCompression(DatasetCompression compression) {
        this.compression = compression;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (location() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property location in model JsonDatasetTypeProperties"));
        } else {
            location().validate();
        }
        if (compression() != null) {
            compression().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(JsonDatasetTypeProperties.class);
}
