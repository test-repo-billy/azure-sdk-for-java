// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Represents the properties of an elastic pool database activity.
 */
@Immutable
public final class ElasticPoolDatabaseActivityProperties {
    /*
     * The database name.
     */
    @JsonProperty(value = "databaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseName;

    /*
     * The time the operation finished (ISO8601 format).
     */
    @JsonProperty(value = "endTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endTime;

    /*
     * The error code if available.
     */
    @JsonProperty(value = "errorCode", access = JsonProperty.Access.WRITE_ONLY)
    private Integer errorCode;

    /*
     * The error message if available.
     */
    @JsonProperty(value = "errorMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String errorMessage;

    /*
     * The error severity if available.
     */
    @JsonProperty(value = "errorSeverity", access = JsonProperty.Access.WRITE_ONLY)
    private Integer errorSeverity;

    /*
     * The operation name.
     */
    @JsonProperty(value = "operation", access = JsonProperty.Access.WRITE_ONLY)
    private String operation;

    /*
     * The unique operation ID.
     */
    @JsonProperty(value = "operationId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID operationId;

    /*
     * The percentage complete if available.
     */
    @JsonProperty(value = "percentComplete", access = JsonProperty.Access.WRITE_ONLY)
    private Integer percentComplete;

    /*
     * The name for the elastic pool the database is moving into if available.
     */
    @JsonProperty(value = "requestedElasticPoolName", access = JsonProperty.Access.WRITE_ONLY)
    private String requestedElasticPoolName;

    /*
     * The name of the current elastic pool the database is in if available.
     */
    @JsonProperty(value = "currentElasticPoolName", access = JsonProperty.Access.WRITE_ONLY)
    private String currentElasticPoolName;

    /*
     * The name of the current service objective if available.
     */
    @JsonProperty(value = "currentServiceObjective", access = JsonProperty.Access.WRITE_ONLY)
    private String currentServiceObjective;

    /*
     * The name of the requested service objective if available.
     */
    @JsonProperty(value = "requestedServiceObjective", access = JsonProperty.Access.WRITE_ONLY)
    private String requestedServiceObjective;

    /*
     * The name of the server the elastic pool is in.
     */
    @JsonProperty(value = "serverName", access = JsonProperty.Access.WRITE_ONLY)
    private String serverName;

    /*
     * The time the operation started (ISO8601 format).
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /*
     * The current state of the operation.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private String state;

    /**
     * Creates an instance of ElasticPoolDatabaseActivityProperties class.
     */
    public ElasticPoolDatabaseActivityProperties() {
    }

    /**
     * Get the databaseName property: The database name.
     * 
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Get the endTime property: The time the operation finished (ISO8601 format).
     * 
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Get the errorCode property: The error code if available.
     * 
     * @return the errorCode value.
     */
    public Integer errorCode() {
        return this.errorCode;
    }

    /**
     * Get the errorMessage property: The error message if available.
     * 
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Get the errorSeverity property: The error severity if available.
     * 
     * @return the errorSeverity value.
     */
    public Integer errorSeverity() {
        return this.errorSeverity;
    }

    /**
     * Get the operation property: The operation name.
     * 
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Get the operationId property: The unique operation ID.
     * 
     * @return the operationId value.
     */
    public UUID operationId() {
        return this.operationId;
    }

    /**
     * Get the percentComplete property: The percentage complete if available.
     * 
     * @return the percentComplete value.
     */
    public Integer percentComplete() {
        return this.percentComplete;
    }

    /**
     * Get the requestedElasticPoolName property: The name for the elastic pool the database is moving into if
     * available.
     * 
     * @return the requestedElasticPoolName value.
     */
    public String requestedElasticPoolName() {
        return this.requestedElasticPoolName;
    }

    /**
     * Get the currentElasticPoolName property: The name of the current elastic pool the database is in if available.
     * 
     * @return the currentElasticPoolName value.
     */
    public String currentElasticPoolName() {
        return this.currentElasticPoolName;
    }

    /**
     * Get the currentServiceObjective property: The name of the current service objective if available.
     * 
     * @return the currentServiceObjective value.
     */
    public String currentServiceObjective() {
        return this.currentServiceObjective;
    }

    /**
     * Get the requestedServiceObjective property: The name of the requested service objective if available.
     * 
     * @return the requestedServiceObjective value.
     */
    public String requestedServiceObjective() {
        return this.requestedServiceObjective;
    }

    /**
     * Get the serverName property: The name of the server the elastic pool is in.
     * 
     * @return the serverName value.
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Get the startTime property: The time the operation started (ISO8601 format).
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the state property: The current state of the operation.
     * 
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
