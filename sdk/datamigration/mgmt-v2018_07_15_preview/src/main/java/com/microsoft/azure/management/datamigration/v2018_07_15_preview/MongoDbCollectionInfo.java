/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a supported collection within a MongoDB database.
 */
public class MongoDbCollectionInfo extends MongoDbObjectInfo {
    /**
     * The name of the database containing the collection.
     */
    @JsonProperty(value = "databaseName", required = true)
    private String databaseName;

    /**
     * Whether the collection is a capped collection (i.e. whether it has a
     * fixed size and acts like a circular buffer).
     */
    @JsonProperty(value = "isCapped", required = true)
    private boolean isCapped;

    /**
     * Whether the collection is system collection.
     */
    @JsonProperty(value = "isSystemCollection", required = true)
    private boolean isSystemCollection;

    /**
     * Whether the collection is a view of another collection.
     */
    @JsonProperty(value = "isView", required = true)
    private boolean isView;

    /**
     * The shard key on the collection, or null if the collection is not
     * sharded.
     */
    @JsonProperty(value = "shardKey")
    private MongoDbShardKeyInfo shardKey;

    /**
     * Whether the database has sharding enabled. Note that the migration task
     * will enable sharding on the target if necessary.
     */
    @JsonProperty(value = "supportsSharding", required = true)
    private boolean supportsSharding;

    /**
     * The name of the collection that this is a view of, if IsView is true.
     */
    @JsonProperty(value = "viewOf")
    private String viewOf;

    /**
     * Get the name of the database containing the collection.
     *
     * @return the databaseName value
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the name of the database containing the collection.
     *
     * @param databaseName the databaseName value to set
     * @return the MongoDbCollectionInfo object itself.
     */
    public MongoDbCollectionInfo withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get whether the collection is a capped collection (i.e. whether it has a fixed size and acts like a circular buffer).
     *
     * @return the isCapped value
     */
    public boolean isCapped() {
        return this.isCapped;
    }

    /**
     * Set whether the collection is a capped collection (i.e. whether it has a fixed size and acts like a circular buffer).
     *
     * @param isCapped the isCapped value to set
     * @return the MongoDbCollectionInfo object itself.
     */
    public MongoDbCollectionInfo withIsCapped(boolean isCapped) {
        this.isCapped = isCapped;
        return this;
    }

    /**
     * Get whether the collection is system collection.
     *
     * @return the isSystemCollection value
     */
    public boolean isSystemCollection() {
        return this.isSystemCollection;
    }

    /**
     * Set whether the collection is system collection.
     *
     * @param isSystemCollection the isSystemCollection value to set
     * @return the MongoDbCollectionInfo object itself.
     */
    public MongoDbCollectionInfo withIsSystemCollection(boolean isSystemCollection) {
        this.isSystemCollection = isSystemCollection;
        return this;
    }

    /**
     * Get whether the collection is a view of another collection.
     *
     * @return the isView value
     */
    public boolean isView() {
        return this.isView;
    }

    /**
     * Set whether the collection is a view of another collection.
     *
     * @param isView the isView value to set
     * @return the MongoDbCollectionInfo object itself.
     */
    public MongoDbCollectionInfo withIsView(boolean isView) {
        this.isView = isView;
        return this;
    }

    /**
     * Get the shard key on the collection, or null if the collection is not sharded.
     *
     * @return the shardKey value
     */
    public MongoDbShardKeyInfo shardKey() {
        return this.shardKey;
    }

    /**
     * Set the shard key on the collection, or null if the collection is not sharded.
     *
     * @param shardKey the shardKey value to set
     * @return the MongoDbCollectionInfo object itself.
     */
    public MongoDbCollectionInfo withShardKey(MongoDbShardKeyInfo shardKey) {
        this.shardKey = shardKey;
        return this;
    }

    /**
     * Get whether the database has sharding enabled. Note that the migration task will enable sharding on the target if necessary.
     *
     * @return the supportsSharding value
     */
    public boolean supportsSharding() {
        return this.supportsSharding;
    }

    /**
     * Set whether the database has sharding enabled. Note that the migration task will enable sharding on the target if necessary.
     *
     * @param supportsSharding the supportsSharding value to set
     * @return the MongoDbCollectionInfo object itself.
     */
    public MongoDbCollectionInfo withSupportsSharding(boolean supportsSharding) {
        this.supportsSharding = supportsSharding;
        return this;
    }

    /**
     * Get the name of the collection that this is a view of, if IsView is true.
     *
     * @return the viewOf value
     */
    public String viewOf() {
        return this.viewOf;
    }

    /**
     * Set the name of the collection that this is a view of, if IsView is true.
     *
     * @param viewOf the viewOf value to set
     * @return the MongoDbCollectionInfo object itself.
     */
    public MongoDbCollectionInfo withViewOf(String viewOf) {
        this.viewOf = viewOf;
        return this;
    }

}
