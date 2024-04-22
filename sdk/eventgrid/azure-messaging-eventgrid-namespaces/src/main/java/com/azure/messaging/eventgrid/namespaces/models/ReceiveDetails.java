// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.messaging.eventgrid.namespaces.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import com.azure.core.models.CloudEvent;

/**
 * Receive operation details per Cloud Event.
 */
@Immutable
public final class ReceiveDetails implements JsonSerializable<ReceiveDetails> {

    /*
     * The Event Broker details.
     */
    @Generated
    private final BrokerProperties brokerProperties;

    /*
     * Cloud Event details.
     */
    @Generated
    private final CloudEvent event;

    /**
     * Creates an instance of ReceiveDetails class.
     *
     * @param brokerProperties the brokerProperties value to set.
     * @param event the event value to set.
     */
    @Generated
    private ReceiveDetails(BrokerProperties brokerProperties, CloudEvent event) {
        this.brokerProperties = brokerProperties;
        this.event = event;
    }

    /**
     * Get the brokerProperties property: The Event Broker details.
     *
     * @return the brokerProperties value.
     */
    @Generated
    public BrokerProperties getBrokerProperties() {
        return this.brokerProperties;
    }

    /**
     * Get the event property: Cloud Event details.
     *
     * @return the event value.
     */
    @Generated
    public CloudEvent getEvent() {
        return this.event;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("brokerProperties", this.brokerProperties);
        jsonWriter.writeJsonField("event", this.event);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ReceiveDetails from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ReceiveDetails if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ReceiveDetails.
     */
    @Generated
    public static ReceiveDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BrokerProperties brokerProperties = null;
            CloudEvent event = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("brokerProperties".equals(fieldName)) {
                    brokerProperties = BrokerProperties.fromJson(reader);
                } else if ("event".equals(fieldName)) {
                    event = CloudEvent.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return new ReceiveDetails(brokerProperties, event);
        });
    }
}
