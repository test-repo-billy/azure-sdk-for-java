/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cosmos DB SQL container resource object.
 */
public class SqlContainerResource {
    /**
     * Name of the Cosmos DB SQL container.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * The configuration of the indexing policy. By default, the indexing is
     * automatic for all document paths within the container.
     */
    @JsonProperty(value = "indexingPolicy")
    private IndexingPolicy indexingPolicy;

    /**
     * The configuration of the partition key to be used for partitioning data
     * into multiple partitions.
     */
    @JsonProperty(value = "partitionKey")
    private ContainerPartitionKey partitionKey;

    /**
     * Default time to live.
     */
    @JsonProperty(value = "defaultTtl")
    private Integer defaultTtl;

    /**
     * The unique key policy configuration for specifying uniqueness
     * constraints on documents in the collection in the Azure Cosmos DB
     * service.
     */
    @JsonProperty(value = "uniqueKeyPolicy")
    private UniqueKeyPolicy uniqueKeyPolicy;

    /**
     * The conflict resolution policy for the container.
     */
    @JsonProperty(value = "conflictResolutionPolicy")
    private ConflictResolutionPolicy conflictResolutionPolicy;

    /**
     * Get name of the Cosmos DB SQL container.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set name of the Cosmos DB SQL container.
     *
     * @param id the id value to set
     * @return the SqlContainerResource object itself.
     */
    public SqlContainerResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the configuration of the indexing policy. By default, the indexing is automatic for all document paths within the container.
     *
     * @return the indexingPolicy value
     */
    public IndexingPolicy indexingPolicy() {
        return this.indexingPolicy;
    }

    /**
     * Set the configuration of the indexing policy. By default, the indexing is automatic for all document paths within the container.
     *
     * @param indexingPolicy the indexingPolicy value to set
     * @return the SqlContainerResource object itself.
     */
    public SqlContainerResource withIndexingPolicy(IndexingPolicy indexingPolicy) {
        this.indexingPolicy = indexingPolicy;
        return this;
    }

    /**
     * Get the configuration of the partition key to be used for partitioning data into multiple partitions.
     *
     * @return the partitionKey value
     */
    public ContainerPartitionKey partitionKey() {
        return this.partitionKey;
    }

    /**
     * Set the configuration of the partition key to be used for partitioning data into multiple partitions.
     *
     * @param partitionKey the partitionKey value to set
     * @return the SqlContainerResource object itself.
     */
    public SqlContainerResource withPartitionKey(ContainerPartitionKey partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }

    /**
     * Get default time to live.
     *
     * @return the defaultTtl value
     */
    public Integer defaultTtl() {
        return this.defaultTtl;
    }

    /**
     * Set default time to live.
     *
     * @param defaultTtl the defaultTtl value to set
     * @return the SqlContainerResource object itself.
     */
    public SqlContainerResource withDefaultTtl(Integer defaultTtl) {
        this.defaultTtl = defaultTtl;
        return this;
    }

    /**
     * Get the unique key policy configuration for specifying uniqueness constraints on documents in the collection in the Azure Cosmos DB service.
     *
     * @return the uniqueKeyPolicy value
     */
    public UniqueKeyPolicy uniqueKeyPolicy() {
        return this.uniqueKeyPolicy;
    }

    /**
     * Set the unique key policy configuration for specifying uniqueness constraints on documents in the collection in the Azure Cosmos DB service.
     *
     * @param uniqueKeyPolicy the uniqueKeyPolicy value to set
     * @return the SqlContainerResource object itself.
     */
    public SqlContainerResource withUniqueKeyPolicy(UniqueKeyPolicy uniqueKeyPolicy) {
        this.uniqueKeyPolicy = uniqueKeyPolicy;
        return this;
    }

    /**
     * Get the conflict resolution policy for the container.
     *
     * @return the conflictResolutionPolicy value
     */
    public ConflictResolutionPolicy conflictResolutionPolicy() {
        return this.conflictResolutionPolicy;
    }

    /**
     * Set the conflict resolution policy for the container.
     *
     * @param conflictResolutionPolicy the conflictResolutionPolicy value to set
     * @return the SqlContainerResource object itself.
     */
    public SqlContainerResource withConflictResolutionPolicy(ConflictResolutionPolicy conflictResolutionPolicy) {
        this.conflictResolutionPolicy = conflictResolutionPolicy;
        return this;
    }

}
