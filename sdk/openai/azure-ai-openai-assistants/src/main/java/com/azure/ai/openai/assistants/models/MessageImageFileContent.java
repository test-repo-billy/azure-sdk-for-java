// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.assistants.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A representation of image file content in a thread message.
 */
@Immutable
public final class MessageImageFileContent extends MessageContent {

    /*
     * The image file for this thread message content item.
     */
    @Generated
    private final MessageImageFileDetails imageFile;

    /**
     * Creates an instance of MessageImageFileContent class.
     *
     * @param imageFile the imageFile value to set.
     */
    @Generated
    private MessageImageFileContent(MessageImageFileDetails imageFile) {
        this.imageFile = imageFile;
    }

    /**
     * Get the imageFile property: The image file for this thread message content item.
     *
     * @return the imageFile value.
     */
    @Generated
    public MessageImageFileDetails getImageFile() {
        return this.imageFile;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("image_file", this.imageFile);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MessageImageFileContent from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of MessageImageFileContent if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MessageImageFileContent.
     */
    @Generated
    public static MessageImageFileContent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MessageImageFileDetails imageFile = null;
            String type = "image_file";
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("image_file".equals(fieldName)) {
                    imageFile = MessageImageFileDetails.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            MessageImageFileContent deserializedMessageImageFileContent = new MessageImageFileContent(imageFile);
            deserializedMessageImageFileContent.type = type;
            return deserializedMessageImageFileContent;
        });
    }

    /*
     * The object type.
     */
    @Generated
    private String type = "image_file";

    /**
     * Get the type property: The object type.
     *
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }
}
