// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Cosmos DB MongoDB collection resource object.
 */
@Fluent
public class MongoDBCollectionResource {
    /*
     * Name of the Cosmos DB MongoDB collection
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * A key-value pair of shard keys to be applied for the request.
     */
    @JsonProperty(value = "shardKey")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> shardKey;

    /*
     * List of index keys
     */
    @JsonProperty(value = "indexes")
    private List<MongoIndex> indexes;

    /*
     * Analytical TTL.
     */
    @JsonProperty(value = "analyticalStorageTtl")
    private Integer analyticalStorageTtl;

    /*
     * Parameters to indicate the information about the restore
     */
    @JsonProperty(value = "restoreParameters")
    private ResourceRestoreParameters restoreParameters;

    /*
     * Enum to indicate the mode of resource creation.
     */
    @JsonProperty(value = "createMode")
    private CreateMode createMode;

    /**
     * Creates an instance of MongoDBCollectionResource class.
     */
    public MongoDBCollectionResource() {
    }

    /**
     * Get the id property: Name of the Cosmos DB MongoDB collection.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Name of the Cosmos DB MongoDB collection.
     * 
     * @param id the id value to set.
     * @return the MongoDBCollectionResource object itself.
     */
    public MongoDBCollectionResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the shardKey property: A key-value pair of shard keys to be applied for the request.
     * 
     * @return the shardKey value.
     */
    public Map<String, String> shardKey() {
        return this.shardKey;
    }

    /**
     * Set the shardKey property: A key-value pair of shard keys to be applied for the request.
     * 
     * @param shardKey the shardKey value to set.
     * @return the MongoDBCollectionResource object itself.
     */
    public MongoDBCollectionResource withShardKey(Map<String, String> shardKey) {
        this.shardKey = shardKey;
        return this;
    }

    /**
     * Get the indexes property: List of index keys.
     * 
     * @return the indexes value.
     */
    public List<MongoIndex> indexes() {
        return this.indexes;
    }

    /**
     * Set the indexes property: List of index keys.
     * 
     * @param indexes the indexes value to set.
     * @return the MongoDBCollectionResource object itself.
     */
    public MongoDBCollectionResource withIndexes(List<MongoIndex> indexes) {
        this.indexes = indexes;
        return this;
    }

    /**
     * Get the analyticalStorageTtl property: Analytical TTL.
     * 
     * @return the analyticalStorageTtl value.
     */
    public Integer analyticalStorageTtl() {
        return this.analyticalStorageTtl;
    }

    /**
     * Set the analyticalStorageTtl property: Analytical TTL.
     * 
     * @param analyticalStorageTtl the analyticalStorageTtl value to set.
     * @return the MongoDBCollectionResource object itself.
     */
    public MongoDBCollectionResource withAnalyticalStorageTtl(Integer analyticalStorageTtl) {
        this.analyticalStorageTtl = analyticalStorageTtl;
        return this;
    }

    /**
     * Get the restoreParameters property: Parameters to indicate the information about the restore.
     * 
     * @return the restoreParameters value.
     */
    public ResourceRestoreParameters restoreParameters() {
        return this.restoreParameters;
    }

    /**
     * Set the restoreParameters property: Parameters to indicate the information about the restore.
     * 
     * @param restoreParameters the restoreParameters value to set.
     * @return the MongoDBCollectionResource object itself.
     */
    public MongoDBCollectionResource withRestoreParameters(ResourceRestoreParameters restoreParameters) {
        this.restoreParameters = restoreParameters;
        return this;
    }

    /**
     * Get the createMode property: Enum to indicate the mode of resource creation.
     * 
     * @return the createMode value.
     */
    public CreateMode createMode() {
        return this.createMode;
    }

    /**
     * Set the createMode property: Enum to indicate the mode of resource creation.
     * 
     * @param createMode the createMode value to set.
     * @return the MongoDBCollectionResource object itself.
     */
    public MongoDBCollectionResource withCreateMode(CreateMode createMode) {
        this.createMode = createMode;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property id in model MongoDBCollectionResource"));
        }
        if (indexes() != null) {
            indexes().forEach(e -> e.validate());
        }
        if (restoreParameters() != null) {
            restoreParameters().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MongoDBCollectionResource.class);
}
