// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cosmos.generated.models.ArmResourceProperties;
import com.azure.resourcemanager.cosmos.generated.models.GremlinDatabaseGetPropertiesOptions;
import com.azure.resourcemanager.cosmos.generated.models.GremlinDatabaseGetPropertiesResource;
import com.azure.resourcemanager.cosmos.generated.models.ManagedServiceIdentity;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * An Azure Cosmos DB Gremlin database.
 */
@Fluent
public final class GremlinDatabaseGetResultsInner extends ArmResourceProperties {
    /*
     * The properties of an Azure Cosmos DB SQL database
     */
    @JsonProperty(value = "properties")
    private GremlinDatabaseGetProperties innerProperties;

    /**
     * Creates an instance of GremlinDatabaseGetResultsInner class.
     */
    public GremlinDatabaseGetResultsInner() {
    }

    /**
     * Get the innerProperties property: The properties of an Azure Cosmos DB SQL database.
     * 
     * @return the innerProperties value.
     */
    private GremlinDatabaseGetProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GremlinDatabaseGetResultsInner withIdentity(ManagedServiceIdentity identity) {
        super.withIdentity(identity);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GremlinDatabaseGetResultsInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GremlinDatabaseGetResultsInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the resource property: The resource property.
     * 
     * @return the resource value.
     */
    public GremlinDatabaseGetPropertiesResource resource() {
        return this.innerProperties() == null ? null : this.innerProperties().resource();
    }

    /**
     * Set the resource property: The resource property.
     * 
     * @param resource the resource value to set.
     * @return the GremlinDatabaseGetResultsInner object itself.
     */
    public GremlinDatabaseGetResultsInner withResource(GremlinDatabaseGetPropertiesResource resource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GremlinDatabaseGetProperties();
        }
        this.innerProperties().withResource(resource);
        return this;
    }

    /**
     * Get the options property: The options property.
     * 
     * @return the options value.
     */
    public GremlinDatabaseGetPropertiesOptions options() {
        return this.innerProperties() == null ? null : this.innerProperties().options();
    }

    /**
     * Set the options property: The options property.
     * 
     * @param options the options value to set.
     * @return the GremlinDatabaseGetResultsInner object itself.
     */
    public GremlinDatabaseGetResultsInner withOptions(GremlinDatabaseGetPropertiesOptions options) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GremlinDatabaseGetProperties();
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
