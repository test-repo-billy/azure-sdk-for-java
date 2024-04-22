// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.implementation.metrics.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Represents a metric metadata value.
 */
@Fluent
public final class MetadataValue implements JsonSerializable<MetadataValue> {
    /*
     * The name of the metadata.
     */
    private LocalizableString name;

    /*
     * The value of the metadata.
     */
    private String value;

    /**
     * Creates an instance of MetadataValue class.
     */
    public MetadataValue() {
    }

    /**
     * Get the name property: The name of the metadata.
     * 
     * @return the name value.
     */
    public LocalizableString getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the metadata.
     * 
     * @param name the name value to set.
     * @return the MetadataValue object itself.
     */
    public MetadataValue setName(LocalizableString name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: The value of the metadata.
     * 
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value of the metadata.
     * 
     * @param value the value value to set.
     * @return the MetadataValue object itself.
     */
    public MetadataValue setValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("name", this.name);
        jsonWriter.writeStringField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MetadataValue from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MetadataValue if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MetadataValue.
     */
    public static MetadataValue fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MetadataValue deserializedMetadataValue = new MetadataValue();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedMetadataValue.name = LocalizableString.fromJson(reader);
                } else if ("value".equals(fieldName)) {
                    deserializedMetadataValue.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMetadataValue;
        });
    }
}
