// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Objects;

/**
 * The ServicePrincipalInKVCredentialPatch model.
 */
@Fluent
public final class ServicePrincipalInKVCredentialPatch extends DataSourceCredentialPatch {
    /*
     * The parameters property.
     */
    private ServicePrincipalInKVParamPatch parameters;

    /**
     * Creates an instance of ServicePrincipalInKVCredentialPatch class.
     */
    public ServicePrincipalInKVCredentialPatch() {
    }

    /**
     * Get the parameters property: The parameters property.
     * 
     * @return the parameters value.
     */
    public ServicePrincipalInKVParamPatch getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The parameters property.
     * 
     * @param parameters the parameters value to set.
     * @return the ServicePrincipalInKVCredentialPatch object itself.
     */
    public ServicePrincipalInKVCredentialPatch setParameters(ServicePrincipalInKVParamPatch parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServicePrincipalInKVCredentialPatch setDataSourceCredentialName(String dataSourceCredentialName) {
        super.setDataSourceCredentialName(dataSourceCredentialName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServicePrincipalInKVCredentialPatch
        setDataSourceCredentialDescription(String dataSourceCredentialDescription) {
        super.setDataSourceCredentialDescription(dataSourceCredentialDescription);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("dataSourceCredentialType",
            Objects.toString(DataSourceCredentialType.SERVICE_PRINCIPAL_IN_KV, null));
        jsonWriter.writeStringField("dataSourceCredentialName", getDataSourceCredentialName());
        jsonWriter.writeStringField("dataSourceCredentialDescription", getDataSourceCredentialDescription());
        jsonWriter.writeJsonField("parameters", this.parameters);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServicePrincipalInKVCredentialPatch from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServicePrincipalInKVCredentialPatch if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing the polymorphic discriminator.
     * @throws IOException If an error occurs while reading the ServicePrincipalInKVCredentialPatch.
     */
    public static ServicePrincipalInKVCredentialPatch fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServicePrincipalInKVCredentialPatch deserializedServicePrincipalInKVCredentialPatch
                = new ServicePrincipalInKVCredentialPatch();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dataSourceCredentialType".equals(fieldName)) {
                    String dataSourceCredentialType = reader.getString();
                    if (!"ServicePrincipalInKV".equals(dataSourceCredentialType)) {
                        throw new IllegalStateException(
                            "'dataSourceCredentialType' was expected to be non-null and equal to 'ServicePrincipalInKV'. The found 'dataSourceCredentialType' was '"
                                + dataSourceCredentialType + "'.");
                    }
                } else if ("dataSourceCredentialName".equals(fieldName)) {
                    deserializedServicePrincipalInKVCredentialPatch.setDataSourceCredentialName(reader.getString());
                } else if ("dataSourceCredentialDescription".equals(fieldName)) {
                    deserializedServicePrincipalInKVCredentialPatch
                        .setDataSourceCredentialDescription(reader.getString());
                } else if ("parameters".equals(fieldName)) {
                    deserializedServicePrincipalInKVCredentialPatch.parameters
                        = ServicePrincipalInKVParamPatch.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServicePrincipalInKVCredentialPatch;
        });
    }
}
