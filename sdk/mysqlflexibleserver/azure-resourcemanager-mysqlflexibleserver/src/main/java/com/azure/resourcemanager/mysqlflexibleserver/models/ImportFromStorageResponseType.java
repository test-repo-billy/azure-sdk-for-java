// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/**
 * ImportFromStorage Response Properties.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "objectType",
    defaultImpl = ImportFromStorageResponseType.class,
    visible = true)
@JsonTypeName("ImportFromStorageResponse")
@Fluent
public final class ImportFromStorageResponseType extends OperationProgressResponseType {
    /*
     * Identifies the type of source operation
     */
    @JsonTypeId
    @JsonProperty(value = "objectType", required = true)
    private ObjectType objectType = ObjectType.IMPORT_FROM_STORAGE_RESPONSE;

    /*
     * The estimated time of operation completion.
     */
    @JsonProperty(value = "estimatedCompletionTime")
    private OffsetDateTime estimatedCompletionTime;

    /**
     * Creates an instance of ImportFromStorageResponseType class.
     */
    public ImportFromStorageResponseType() {
    }

    /**
     * Get the objectType property: Identifies the type of source operation.
     * 
     * @return the objectType value.
     */
    @Override
    public ObjectType objectType() {
        return this.objectType;
    }

    /**
     * Get the estimatedCompletionTime property: The estimated time of operation completion.
     * 
     * @return the estimatedCompletionTime value.
     */
    public OffsetDateTime estimatedCompletionTime() {
        return this.estimatedCompletionTime;
    }

    /**
     * Set the estimatedCompletionTime property: The estimated time of operation completion.
     * 
     * @param estimatedCompletionTime the estimatedCompletionTime value to set.
     * @return the ImportFromStorageResponseType object itself.
     */
    public ImportFromStorageResponseType withEstimatedCompletionTime(OffsetDateTime estimatedCompletionTime) {
        this.estimatedCompletionTime = estimatedCompletionTime;
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
    }
}
