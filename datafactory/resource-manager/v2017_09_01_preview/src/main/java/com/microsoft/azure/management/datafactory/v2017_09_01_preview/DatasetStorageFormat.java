/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The format definition of a storage.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DatasetStorageFormat")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ParquetFormat", value = ParquetFormat.class),
    @JsonSubTypes.Type(name = "OrcFormat", value = OrcFormat.class),
    @JsonSubTypes.Type(name = "AvroFormat", value = AvroFormat.class),
    @JsonSubTypes.Type(name = "JsonFormat", value = JsonFormat.class),
    @JsonSubTypes.Type(name = "TextFormat", value = TextFormat.class)
})
public class DatasetStorageFormat {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Serializer. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "serializer")
    private Object serializer;

    /**
     * Deserializer. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "deserializer")
    private Object deserializer;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the DatasetStorageFormat object itself.
     */
    public DatasetStorageFormat withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get serializer. Type: string (or Expression with resultType string).
     *
     * @return the serializer value
     */
    public Object serializer() {
        return this.serializer;
    }

    /**
     * Set serializer. Type: string (or Expression with resultType string).
     *
     * @param serializer the serializer value to set
     * @return the DatasetStorageFormat object itself.
     */
    public DatasetStorageFormat withSerializer(Object serializer) {
        this.serializer = serializer;
        return this;
    }

    /**
     * Get deserializer. Type: string (or Expression with resultType string).
     *
     * @return the deserializer value
     */
    public Object deserializer() {
        return this.deserializer;
    }

    /**
     * Set deserializer. Type: string (or Expression with resultType string).
     *
     * @param deserializer the deserializer value to set
     * @return the DatasetStorageFormat object itself.
     */
    public DatasetStorageFormat withDeserializer(Object deserializer) {
        this.deserializer = deserializer;
        return this;
    }

}
