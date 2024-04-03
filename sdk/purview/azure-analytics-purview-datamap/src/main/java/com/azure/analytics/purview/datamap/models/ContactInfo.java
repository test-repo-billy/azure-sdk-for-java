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
 * ContactInfo.
 */
@Fluent
public final class ContactInfo implements JsonSerializable<ContactInfo> {
    /*
     * Azure Active Directory object Id.
     */
    @Generated
    private String id;

    /*
     * additional information to describe this contact.
     */
    @Generated
    private String info;

    /**
     * Creates an instance of ContactInfo class.
     */
    @Generated
    public ContactInfo() {
    }

    /**
     * Get the id property: Azure Active Directory object Id.
     * 
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Azure Active Directory object Id.
     * 
     * @param id the id value to set.
     * @return the ContactInfo object itself.
     */
    @Generated
    public ContactInfo setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the info property: additional information to describe this contact.
     * 
     * @return the info value.
     */
    @Generated
    public String getInfo() {
        return this.info;
    }

    /**
     * Set the info property: additional information to describe this contact.
     * 
     * @param info the info value to set.
     * @return the ContactInfo object itself.
     */
    @Generated
    public ContactInfo setInfo(String info) {
        this.info = info;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("info", this.info);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ContactInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ContactInfo if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ContactInfo.
     */
    @Generated
    public static ContactInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ContactInfo deserializedContactInfo = new ContactInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedContactInfo.id = reader.getString();
                } else if ("info".equals(fieldName)) {
                    deserializedContactInfo.info = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedContactInfo;
        });
    }
}
