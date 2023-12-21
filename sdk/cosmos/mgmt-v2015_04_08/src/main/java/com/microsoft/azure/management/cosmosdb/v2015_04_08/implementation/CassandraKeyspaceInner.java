/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * An Azure Cosmos DB Cassandra keyspace.
 */
@JsonFlatten
@SkipParentValidation
public class CassandraKeyspaceInner extends Resource {
    /**
     * Name of the Cosmos DB Cassandra keyspace.
     */
    @JsonProperty(value = "properties.id", required = true)
    private String cassandraKeyspaceId;

    /**
     * Get name of the Cosmos DB Cassandra keyspace.
     *
     * @return the cassandraKeyspaceId value
     */
    public String cassandraKeyspaceId() {
        return this.cassandraKeyspaceId;
    }

    /**
     * Set name of the Cosmos DB Cassandra keyspace.
     *
     * @param cassandraKeyspaceId the cassandraKeyspaceId value to set
     * @return the CassandraKeyspaceInner object itself.
     */
    public CassandraKeyspaceInner withCassandraKeyspaceId(String cassandraKeyspaceId) {
        this.cassandraKeyspaceId = cassandraKeyspaceId;
        return this;
    }

}
