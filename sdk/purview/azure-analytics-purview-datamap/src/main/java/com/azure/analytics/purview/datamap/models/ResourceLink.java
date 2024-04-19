// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * ResourceLink.
 */
@Fluent
public final class ResourceLink implements JsonSerializable<ResourceLink> {
    /*
     * Display name for url.
     */
    @Generated
    private String displayName;

    /*
     * web url. http or https
     */
    @Generated
    private String url;

    /**
     * Creates an instance of ResourceLink class.
     */
    @Generated
    public ResourceLink() {
    }

    /**
     * Get the displayName property: Display name for url.
     * 
     * @return the displayName value.
     */
    @Generated
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name for url.
     * 
     * @param displayName the displayName value to set.
     * @return the ResourceLink object itself.
     */
    @Generated
    public ResourceLink setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the url property: web url. http or https.
     * 
     * @return the url value.
     */
    @Generated
    public String getUrl() {
        return this.url;
    }

    /**
     * Set the url property: web url. http or https.
     * 
     * @param url the url value to set.
     * @return the ResourceLink object itself.
     */
    @Generated
    public ResourceLink setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeStringField("url", this.url);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceLink from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceLink if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResourceLink.
     */
    @Generated
    public static ResourceLink fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceLink deserializedResourceLink = new ResourceLink();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("displayName".equals(fieldName)) {
                    deserializedResourceLink.displayName = reader.getString();
                } else if ("url".equals(fieldName)) {
                    deserializedResourceLink.url = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourceLink;
        });
    }
}
