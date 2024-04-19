// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.fluent.models.JsonDatasetTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * Json dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = JsonDataset.class, visible = true)
@JsonTypeName("Json")
@Fluent
public final class JsonDataset extends Dataset {
    /*
     * Type of dataset.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "Json";

    /*
     * Json dataset properties.
     */
    @JsonProperty(value = "typeProperties")
    private JsonDatasetTypeProperties innerTypeProperties;

    /**
     * Creates an instance of JsonDataset class.
     */
    public JsonDataset() {
    }

    /**
     * Get the type property: Type of dataset.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the innerTypeProperties property: Json dataset properties.
     * 
     * @return the innerTypeProperties value.
     */
    private JsonDatasetTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the location property: The location of the json data storage.
     * 
     * @return the location value.
     */
    public DatasetLocation location() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().location();
    }

    /**
     * Set the location property: The location of the json data storage.
     * 
     * @param location the location value to set.
     * @return the JsonDataset object itself.
     */
    public JsonDataset withLocation(DatasetLocation location) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new JsonDatasetTypeProperties();
        }
        this.innerTypeProperties().withLocation(location);
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
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encodingName();
    }

    /**
     * Set the encodingName property: The code page name of the preferred encoding. If not specified, the default value
     * is UTF-8, unless BOM denotes another Unicode encoding. Refer to the name column of the table in the following
     * link to set supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type: string (or
     * Expression with resultType string).
     * 
     * @param encodingName the encodingName value to set.
     * @return the JsonDataset object itself.
     */
    public JsonDataset withEncodingName(Object encodingName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new JsonDatasetTypeProperties();
        }
        this.innerTypeProperties().withEncodingName(encodingName);
        return this;
    }

    /**
     * Get the compression property: The data compression method used for the json dataset.
     * 
     * @return the compression value.
     */
    public DatasetCompression compression() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().compression();
    }

    /**
     * Set the compression property: The data compression method used for the json dataset.
     * 
     * @param compression the compression value to set.
     * @return the JsonDataset object itself.
     */
    public JsonDataset withCompression(DatasetCompression compression) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new JsonDatasetTypeProperties();
        }
        this.innerTypeProperties().withCompression(compression);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() != null) {
            innerTypeProperties().validate();
        }
    }
}
