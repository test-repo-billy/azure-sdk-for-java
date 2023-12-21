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
 * Cosmos DB Cassandra table partition key.
 */
public class CassandraPartitionKey {
    /**
     * Name of the Cosmos DB Cassandra table partition key.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get name of the Cosmos DB Cassandra table partition key.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the Cosmos DB Cassandra table partition key.
     *
     * @param name the name value to set
     * @return the CassandraPartitionKey object itself.
     */
    public CassandraPartitionKey withName(String name) {
        this.name = name;
        return this;
    }

}
