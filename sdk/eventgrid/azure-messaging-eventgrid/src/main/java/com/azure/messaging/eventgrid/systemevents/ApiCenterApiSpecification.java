// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * API specification details.
 */
@Fluent
public final class ApiCenterApiSpecification implements JsonSerializable<ApiCenterApiSpecification> {
    /*
     * Specification name.
     */
    private String name;

    /*
     * Specification version.
     */
    private String version;

    /**
     * Creates an instance of ApiCenterApiSpecification class.
     */
    public ApiCenterApiSpecification() {
    }

    /**
     * Get the name property: Specification name.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Specification name.
     * 
     * @param name the name value to set.
     * @return the ApiCenterApiSpecification object itself.
     */
    public ApiCenterApiSpecification setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the version property: Specification version.
     * 
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: Specification version.
     * 
     * @param version the version value to set.
     * @return the ApiCenterApiSpecification object itself.
     */
    public ApiCenterApiSpecification setVersion(String version) {
        this.version = version;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("version", this.version);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApiCenterApiSpecification from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApiCenterApiSpecification if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApiCenterApiSpecification.
     */
    public static ApiCenterApiSpecification fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApiCenterApiSpecification deserializedApiCenterApiSpecification = new ApiCenterApiSpecification();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedApiCenterApiSpecification.name = reader.getString();
                } else if ("version".equals(fieldName)) {
                    deserializedApiCenterApiSpecification.version = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApiCenterApiSpecification;
        });
    }
}
