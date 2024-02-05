// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.fluent.models.TableCreateUpdateProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Parameters to create and update Cosmos DB Table.
 */
@Fluent
public final class TableCreateUpdateParameters extends ArmResourceProperties {
    /*
     * Properties to create and update Azure Cosmos DB Table.
     */
    @JsonProperty(value = "properties", required = true)
    private TableCreateUpdateProperties innerProperties = new TableCreateUpdateProperties();

    /**
     * Creates an instance of TableCreateUpdateParameters class.
     */
    public TableCreateUpdateParameters() {
    }

    /**
     * Get the innerProperties property: Properties to create and update Azure Cosmos DB Table.
     * 
     * @return the innerProperties value.
     */
    private TableCreateUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableCreateUpdateParameters withIdentity(ManagedServiceIdentity identity) {
        super.withIdentity(identity);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableCreateUpdateParameters withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableCreateUpdateParameters withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the resource property: The standard JSON format of a Table.
     * 
     * @return the resource value.
     */
    public TableResource resource() {
        return this.innerProperties() == null ? null : this.innerProperties().resource();
    }

    /**
     * Set the resource property: The standard JSON format of a Table.
     * 
     * @param resource the resource value to set.
     * @return the TableCreateUpdateParameters object itself.
     */
    public TableCreateUpdateParameters withResource(TableResource resource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TableCreateUpdateProperties();
        }
        this.innerProperties().withResource(resource);
        return this;
    }

    /**
     * Get the options property: A key-value pair of options to be applied for the request. This corresponds to the
     * headers sent with the request.
     * 
     * @return the options value.
     */
    public CreateUpdateOptions options() {
        return this.innerProperties() == null ? null : this.innerProperties().options();
    }

    /**
     * Set the options property: A key-value pair of options to be applied for the request. This corresponds to the
     * headers sent with the request.
     * 
     * @param options the options value to set.
     * @return the TableCreateUpdateParameters object itself.
     */
    public TableCreateUpdateParameters withOptions(CreateUpdateOptions options) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TableCreateUpdateProperties();
        }
        this.innerProperties().withOptions(options);
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
        if (innerProperties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property innerProperties in model TableCreateUpdateParameters"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TableCreateUpdateParameters.class);
}
