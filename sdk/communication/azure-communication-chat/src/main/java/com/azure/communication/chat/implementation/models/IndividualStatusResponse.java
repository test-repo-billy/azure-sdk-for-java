// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.chat.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;

import java.io.IOException;

/** The IndividualStatusResponse model. */
@Immutable
public final class IndividualStatusResponse implements JsonSerializable<IndividualStatusResponse> {
    /*
     * Identifies the resource to which the individual status corresponds.
     */
    private String id;

    /*
     * The status code of the resource operation.
     *
     * Possible values include:
     * 200 for a successful update or delete,
     * 201 for successful creation,
     * 400 for a malformed input,
     * 403 for lacking permission to execute the operation,
     * 404 for resource not found.
     */
    private Integer statusCode;

    /*
     * The message explaining why the operation failed for the resource
     * identified by the key; null if the operation succeeded.
     */
    private String message;

    /*
     * Identifies the type of the resource to which the individual status
     * corresponds.
     */
    private String type;

    /**
     * Get the id property: Identifies the resource to which the individual status corresponds.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the statusCode property: The status code of the resource operation.
     *
     * <p>Possible values include: 200 for a successful update or delete, 201 for successful creation, 400 for a
     * malformed input, 403 for lacking permission to execute the operation, 404 for resource not found.
     *
     * @return the statusCode value.
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * Get the message property: The message explaining why the operation failed for the resource identified by the key;
     * null if the operation succeeded.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the type property: Identifies the type of the resource to which the individual status corresponds.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SendChatMessageOptions from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SendChatMessageOptions if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SendChatMessageOptions.
     */
    public static IndividualStatusResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            final IndividualStatusResponse response = new IndividualStatusResponse();
            while (jsonReader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("id".equals(fieldName)) {
                    response.id = reader.getString();
                } else if ("statusCode".equals(fieldName)) {
                    response.statusCode = reader.getNullable(JsonReader::getInt);
                } else if ("message".equals(fieldName)) {
                    response.message = reader.getString();
                } else if ("type".equals(fieldName)) {
                    response.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return response;
        });
    }
}
