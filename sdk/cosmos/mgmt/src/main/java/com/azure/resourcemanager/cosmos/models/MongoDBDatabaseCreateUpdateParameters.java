// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The MongoDBDatabaseCreateUpdateParameters model. */
@JsonFlatten
@Fluent
public class MongoDBDatabaseCreateUpdateParameters extends ArmResourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MongoDBDatabaseCreateUpdateParameters.class);

    /*
     * The standard JSON format of a MongoDB database
     */
    @JsonProperty(value = "properties.resource", required = true)
    private MongoDBDatabaseResource resource;

    /*
     * A key-value pair of options to be applied for the request. This
     * corresponds to the headers sent with the request.
     */
    @JsonProperty(value = "properties.options", required = true)
    private Map<String, String> options;

    /**
     * Get the resource property: The standard JSON format of a MongoDB database.
     *
     * @return the resource value.
     */
    public MongoDBDatabaseResource resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The standard JSON format of a MongoDB database.
     *
     * @param resource the resource value to set.
     * @return the MongoDBDatabaseCreateUpdateParameters object itself.
     */
    public MongoDBDatabaseCreateUpdateParameters withResource(MongoDBDatabaseResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the options property: A key-value pair of options to be applied for the request. This corresponds to the
     * headers sent with the request.
     *
     * @return the options value.
     */
    public Map<String, String> options() {
        return this.options;
    }

    /**
     * Set the options property: A key-value pair of options to be applied for the request. This corresponds to the
     * headers sent with the request.
     *
     * @param options the options value to set.
     * @return the MongoDBDatabaseCreateUpdateParameters object itself.
     */
    public MongoDBDatabaseCreateUpdateParameters withOptions(Map<String, String> options) {
        this.options = options;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (resource() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property resource in model MongoDBDatabaseCreateUpdateParameters"));
        } else {
            resource().validate();
        }
        if (options() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property options in model MongoDBDatabaseCreateUpdateParameters"));
        }
    }
}
