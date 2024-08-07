// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.face.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Audit entry for a response in the session.
 */
@Immutable
public final class AuditLivenessResponseInfo implements JsonSerializable<AuditLivenessResponseInfo> {

    /*
     * The response body. The schema of this field will depend on the request.url and request.method used by the client.
     */
    @Generated
    private final LivenessResponseBody body;

    /*
     * The HTTP status code returned to the client.
     */
    @Generated
    private final int statusCode;

    /*
     * The server measured latency for this request in milliseconds.
     */
    @Generated
    private final long latencyInMilliseconds;

    /**
     * Creates an instance of AuditLivenessResponseInfo class.
     *
     * @param body the body value to set.
     * @param statusCode the statusCode value to set.
     * @param latencyInMilliseconds the latencyInMilliseconds value to set.
     */
    @Generated
    private AuditLivenessResponseInfo(LivenessResponseBody body, int statusCode, long latencyInMilliseconds) {
        this.body = body;
        this.statusCode = statusCode;
        this.latencyInMilliseconds = latencyInMilliseconds;
    }

    /**
     * Get the body property: The response body. The schema of this field will depend on the request.url and
     * request.method used by the client.
     *
     * @return the body value.
     */
    @Generated
    public LivenessResponseBody getBody() {
        return this.body;
    }

    /**
     * Get the statusCode property: The HTTP status code returned to the client.
     *
     * @return the statusCode value.
     */
    @Generated
    public int getStatusCode() {
        return this.statusCode;
    }

    /**
     * Get the latencyInMilliseconds property: The server measured latency for this request in milliseconds.
     *
     * @return the latencyInMilliseconds value.
     */
    @Generated
    public long getLatencyInMilliseconds() {
        return this.latencyInMilliseconds;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("body", this.body);
        jsonWriter.writeIntField("statusCode", this.statusCode);
        jsonWriter.writeLongField("latencyInMilliseconds", this.latencyInMilliseconds);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AuditLivenessResponseInfo from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AuditLivenessResponseInfo if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AuditLivenessResponseInfo.
     */
    @Generated
    public static AuditLivenessResponseInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LivenessResponseBody body = null;
            int statusCode = 0;
            long latencyInMilliseconds = 0L;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("body".equals(fieldName)) {
                    body = LivenessResponseBody.fromJson(reader);
                } else if ("statusCode".equals(fieldName)) {
                    statusCode = reader.getInt();
                } else if ("latencyInMilliseconds".equals(fieldName)) {
                    latencyInMilliseconds = reader.getLong();
                } else {
                    reader.skipChildren();
                }
            }
            return new AuditLivenessResponseInfo(body, statusCode, latencyInMilliseconds);
        });
    }
}
