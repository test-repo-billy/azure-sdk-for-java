/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_08_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.ARMResourceProperties;

/**
 * An Azure Cosmos DB Cassandra keyspace.
 */
@JsonFlatten
public class CassandraKeyspaceGetResultsInner extends ARMResourceProperties {
    /**
     * Name of the Cosmos DB Cassandra keyspace.
     */
    @JsonProperty(value = "properties.id", required = true)
    private String cassandraKeyspaceGetResultsId;

    /**
     * A system generated property. A unique identifier.
     */
    @JsonProperty(value = "properties._rid", access = JsonProperty.Access.WRITE_ONLY)
    private String _rid;

    /**
     * A system generated property that denotes the last updated timestamp of
     * the resource.
     */
    @JsonProperty(value = "properties._ts", access = JsonProperty.Access.WRITE_ONLY)
    private Object _ts;

    /**
     * A system generated property representing the resource etag required for
     * optimistic concurrency control.
     */
    @JsonProperty(value = "properties._etag", access = JsonProperty.Access.WRITE_ONLY)
    private String _etag;

    /**
     * Get name of the Cosmos DB Cassandra keyspace.
     *
     * @return the cassandraKeyspaceGetResultsId value
     */
    public String cassandraKeyspaceGetResultsId() {
        return this.cassandraKeyspaceGetResultsId;
    }

    /**
     * Set name of the Cosmos DB Cassandra keyspace.
     *
     * @param cassandraKeyspaceGetResultsId the cassandraKeyspaceGetResultsId value to set
     * @return the CassandraKeyspaceGetResultsInner object itself.
     */
    public CassandraKeyspaceGetResultsInner withCassandraKeyspaceGetResultsId(String cassandraKeyspaceGetResultsId) {
        this.cassandraKeyspaceGetResultsId = cassandraKeyspaceGetResultsId;
        return this;
    }

    /**
     * Get a system generated property. A unique identifier.
     *
     * @return the _rid value
     */
    public String _rid() {
        return this._rid;
    }

    /**
     * Get a system generated property that denotes the last updated timestamp of the resource.
     *
     * @return the _ts value
     */
    public Object _ts() {
        return this._ts;
    }

    /**
     * Get a system generated property representing the resource etag required for optimistic concurrency control.
     *
     * @return the _etag value
     */
    public String _etag() {
        return this._etag;
    }

}
