// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computefleet.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes a virtual machine scale set network profile's network configurations.
 */
@Fluent
public final class VirtualMachineScaleSetNetworkConfiguration
    implements JsonSerializable<VirtualMachineScaleSetNetworkConfiguration> {
    /*
     * The network configuration name.
     */
    private String name;

    /*
     * Describes a virtual machine scale set network profile's IP configuration.
     */
    private VirtualMachineScaleSetNetworkConfigurationProperties properties;

    /**
     * Creates an instance of VirtualMachineScaleSetNetworkConfiguration class.
     */
    public VirtualMachineScaleSetNetworkConfiguration() {
    }

    /**
     * Get the name property: The network configuration name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The network configuration name.
     * 
     * @param name the name value to set.
     * @return the VirtualMachineScaleSetNetworkConfiguration object itself.
     */
    public VirtualMachineScaleSetNetworkConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the properties property: Describes a virtual machine scale set network profile's IP configuration.
     * 
     * @return the properties value.
     */
    public VirtualMachineScaleSetNetworkConfigurationProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Describes a virtual machine scale set network profile's IP configuration.
     * 
     * @param properties the properties value to set.
     * @return the VirtualMachineScaleSetNetworkConfiguration object itself.
     */
    public VirtualMachineScaleSetNetworkConfiguration
        withProperties(VirtualMachineScaleSetNetworkConfigurationProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property name in model VirtualMachineScaleSetNetworkConfiguration"));
        }
        if (properties() != null) {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VirtualMachineScaleSetNetworkConfiguration.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualMachineScaleSetNetworkConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualMachineScaleSetNetworkConfiguration if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VirtualMachineScaleSetNetworkConfiguration.
     */
    public static VirtualMachineScaleSetNetworkConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualMachineScaleSetNetworkConfiguration deserializedVirtualMachineScaleSetNetworkConfiguration
                = new VirtualMachineScaleSetNetworkConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetNetworkConfiguration.name = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetNetworkConfiguration.properties
                        = VirtualMachineScaleSetNetworkConfigurationProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualMachineScaleSetNetworkConfiguration;
        });
    }
}
