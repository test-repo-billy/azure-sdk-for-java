// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.health.deidentification.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Request body for de-identification operation.
 */
@Fluent
public final class DeidentificationContent implements JsonSerializable<DeidentificationContent> {
    /*
     * Input text to de-identify.
     */
    @Generated
    private final String inputText;

    /*
     * Operation to perform on the input.
     */
    @Generated
    private OperationType operation;

    /*
     * Data type of the input.
     */
    @Generated
    private DocumentDataType dataType;

    /*
     * Format of the redacted output. Only valid when OperationType is "Redact".
     */
    @Generated
    private String redactionFormat;

    /**
     * Creates an instance of DeidentificationContent class.
     * 
     * @param inputText the inputText value to set.
     */
    @Generated
    public DeidentificationContent(String inputText) {
        this.inputText = inputText;
    }

    /**
     * Get the inputText property: Input text to de-identify.
     * 
     * @return the inputText value.
     */
    @Generated
    public String getInputText() {
        return this.inputText;
    }

    /**
     * Get the operation property: Operation to perform on the input.
     * 
     * @return the operation value.
     */
    @Generated
    public OperationType getOperation() {
        return this.operation;
    }

    /**
     * Set the operation property: Operation to perform on the input.
     * 
     * @param operation the operation value to set.
     * @return the DeidentificationContent object itself.
     */
    @Generated
    public DeidentificationContent setOperation(OperationType operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the dataType property: Data type of the input.
     * 
     * @return the dataType value.
     */
    @Generated
    public DocumentDataType getDataType() {
        return this.dataType;
    }

    /**
     * Set the dataType property: Data type of the input.
     * 
     * @param dataType the dataType value to set.
     * @return the DeidentificationContent object itself.
     */
    @Generated
    public DeidentificationContent setDataType(DocumentDataType dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * Get the redactionFormat property: Format of the redacted output. Only valid when OperationType is "Redact".
     * 
     * @return the redactionFormat value.
     */
    @Generated
    public String getRedactionFormat() {
        return this.redactionFormat;
    }

    /**
     * Set the redactionFormat property: Format of the redacted output. Only valid when OperationType is "Redact".
     * 
     * @param redactionFormat the redactionFormat value to set.
     * @return the DeidentificationContent object itself.
     */
    @Generated
    public DeidentificationContent setRedactionFormat(String redactionFormat) {
        this.redactionFormat = redactionFormat;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("inputText", this.inputText);
        jsonWriter.writeStringField("operation", this.operation == null ? null : this.operation.toString());
        jsonWriter.writeStringField("dataType", this.dataType == null ? null : this.dataType.toString());
        jsonWriter.writeStringField("redactionFormat", this.redactionFormat);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DeidentificationContent from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DeidentificationContent if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DeidentificationContent.
     */
    @Generated
    public static DeidentificationContent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String inputText = null;
            OperationType operation = null;
            DocumentDataType dataType = null;
            String redactionFormat = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("inputText".equals(fieldName)) {
                    inputText = reader.getString();
                } else if ("operation".equals(fieldName)) {
                    operation = OperationType.fromString(reader.getString());
                } else if ("dataType".equals(fieldName)) {
                    dataType = DocumentDataType.fromString(reader.getString());
                } else if ("redactionFormat".equals(fieldName)) {
                    redactionFormat = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            DeidentificationContent deserializedDeidentificationContent = new DeidentificationContent(inputText);
            deserializedDeidentificationContent.operation = operation;
            deserializedDeidentificationContent.dataType = dataType;
            deserializedDeidentificationContent.redactionFormat = redactionFormat;

            return deserializedDeidentificationContent;
        });
    }
}
