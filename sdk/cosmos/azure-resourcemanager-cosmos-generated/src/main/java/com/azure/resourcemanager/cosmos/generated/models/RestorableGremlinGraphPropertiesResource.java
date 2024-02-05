// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The resource of an Azure Cosmos DB Gremlin graph event.
 */
@Immutable
public final class RestorableGremlinGraphPropertiesResource {
    /*
     * A system generated property. A unique identifier.
     */
    @JsonProperty(value = "_rid", access = JsonProperty.Access.WRITE_ONLY)
    private String rid;

    /*
     * The operation type of this graph event.
     */
    @JsonProperty(value = "operationType", access = JsonProperty.Access.WRITE_ONLY)
    private OperationType operationType;

    /*
     * A state of this graph to identify if this graph is restorable in same account.
     */
    @JsonProperty(value = "canUndelete", access = JsonProperty.Access.WRITE_ONLY)
    private String canUndelete;

    /*
     * The reason why this graph can not be restored in same account.
     */
    @JsonProperty(value = "canUndeleteReason", access = JsonProperty.Access.WRITE_ONLY)
    private String canUndeleteReason;

    /*
     * The time when this graph event happened.
     */
    @JsonProperty(value = "eventTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private String eventTimestamp;

    /*
     * The name of this Gremlin graph.
     */
    @JsonProperty(value = "ownerId", access = JsonProperty.Access.WRITE_ONLY)
    private String ownerId;

    /*
     * The resource ID of this Gremlin graph.
     */
    @JsonProperty(value = "ownerResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String ownerResourceId;

    /**
     * Creates an instance of RestorableGremlinGraphPropertiesResource class.
     */
    public RestorableGremlinGraphPropertiesResource() {
    }

    /**
     * Get the rid property: A system generated property. A unique identifier.
     * 
     * @return the rid value.
     */
    public String rid() {
        return this.rid;
    }

    /**
     * Get the operationType property: The operation type of this graph event.
     * 
     * @return the operationType value.
     */
    public OperationType operationType() {
        return this.operationType;
    }

    /**
     * Get the canUndelete property: A state of this graph to identify if this graph is restorable in same account.
     * 
     * @return the canUndelete value.
     */
    public String canUndelete() {
        return this.canUndelete;
    }

    /**
     * Get the canUndeleteReason property: The reason why this graph can not be restored in same account.
     * 
     * @return the canUndeleteReason value.
     */
    public String canUndeleteReason() {
        return this.canUndeleteReason;
    }

    /**
     * Get the eventTimestamp property: The time when this graph event happened.
     * 
     * @return the eventTimestamp value.
     */
    public String eventTimestamp() {
        return this.eventTimestamp;
    }

    /**
     * Get the ownerId property: The name of this Gremlin graph.
     * 
     * @return the ownerId value.
     */
    public String ownerId() {
        return this.ownerId;
    }

    /**
     * Get the ownerResourceId property: The resource ID of this Gremlin graph.
     * 
     * @return the ownerResourceId value.
     */
    public String ownerResourceId() {
        return this.ownerResourceId;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
