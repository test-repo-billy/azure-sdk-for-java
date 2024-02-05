// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cosmos.generated.models.ArmResourceProperties;
import com.azure.resourcemanager.cosmos.generated.models.ManagedServiceIdentity;
import com.azure.resourcemanager.cosmos.generated.models.MongoDBDatabaseGetPropertiesOptions;
import com.azure.resourcemanager.cosmos.generated.models.MongoDBDatabaseGetPropertiesResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * An Azure Cosmos DB MongoDB database.
 */
@Fluent
public final class MongoDBDatabaseGetResultsInner extends ArmResourceProperties {
    /*
     * The properties of an Azure Cosmos DB MongoDB database
     */
    @JsonProperty(value = "properties")
    private MongoDBDatabaseGetProperties innerProperties;

    /**
     * Creates an instance of MongoDBDatabaseGetResultsInner class.
     */
    public MongoDBDatabaseGetResultsInner() {
    }

    /**
     * Get the innerProperties property: The properties of an Azure Cosmos DB MongoDB database.
     * 
     * @return the innerProperties value.
     */
    private MongoDBDatabaseGetProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MongoDBDatabaseGetResultsInner withIdentity(ManagedServiceIdentity identity) {
        super.withIdentity(identity);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MongoDBDatabaseGetResultsInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MongoDBDatabaseGetResultsInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the resource property: The resource property.
     * 
     * @return the resource value.
     */
    public MongoDBDatabaseGetPropertiesResource resource() {
        return this.innerProperties() == null ? null : this.innerProperties().resource();
    }

    /**
     * Set the resource property: The resource property.
     * 
     * @param resource the resource value to set.
     * @return the MongoDBDatabaseGetResultsInner object itself.
     */
    public MongoDBDatabaseGetResultsInner withResource(MongoDBDatabaseGetPropertiesResource resource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MongoDBDatabaseGetProperties();
        }
        this.innerProperties().withResource(resource);
        return this;
    }

    /**
     * Get the options property: The options property.
     * 
     * @return the options value.
     */
    public MongoDBDatabaseGetPropertiesOptions options() {
        return this.innerProperties() == null ? null : this.innerProperties().options();
    }

    /**
     * Set the options property: The options property.
     * 
     * @param options the options value to set.
     * @return the MongoDBDatabaseGetResultsInner object itself.
     */
    public MongoDBDatabaseGetResultsInner withOptions(MongoDBDatabaseGetPropertiesOptions options) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MongoDBDatabaseGetProperties();
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
