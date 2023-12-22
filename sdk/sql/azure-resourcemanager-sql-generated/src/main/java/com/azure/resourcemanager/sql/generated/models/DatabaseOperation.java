// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.resourcemanager.sql.generated.fluent.models.DatabaseOperationInner;
import java.time.OffsetDateTime;

/**
 * An immutable client-side representation of DatabaseOperation.
 */
public interface DatabaseOperation {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the databaseName property: The name of the database the operation is being performed on.
     * 
     * @return the databaseName value.
     */
    String databaseName();

    /**
     * Gets the operation property: The name of operation.
     * 
     * @return the operation value.
     */
    String operation();

    /**
     * Gets the operationFriendlyName property: The friendly name of operation.
     * 
     * @return the operationFriendlyName value.
     */
    String operationFriendlyName();

    /**
     * Gets the percentComplete property: The percentage of the operation completed.
     * 
     * @return the percentComplete value.
     */
    Integer percentComplete();

    /**
     * Gets the serverName property: The name of the server.
     * 
     * @return the serverName value.
     */
    String serverName();

    /**
     * Gets the startTime property: The operation start time.
     * 
     * @return the startTime value.
     */
    OffsetDateTime startTime();

    /**
     * Gets the state property: The operation state.
     * 
     * @return the state value.
     */
    ManagementOperationState state();

    /**
     * Gets the errorCode property: The operation error code.
     * 
     * @return the errorCode value.
     */
    Integer errorCode();

    /**
     * Gets the errorDescription property: The operation error description.
     * 
     * @return the errorDescription value.
     */
    String errorDescription();

    /**
     * Gets the errorSeverity property: The operation error severity.
     * 
     * @return the errorSeverity value.
     */
    Integer errorSeverity();

    /**
     * Gets the isUserError property: Whether or not the error is a user error.
     * 
     * @return the isUserError value.
     */
    Boolean isUserError();

    /**
     * Gets the estimatedCompletionTime property: The estimated completion time of the operation.
     * 
     * @return the estimatedCompletionTime value.
     */
    OffsetDateTime estimatedCompletionTime();

    /**
     * Gets the description property: The operation description.
     * 
     * @return the description value.
     */
    String description();

    /**
     * Gets the isCancellable property: Whether the operation can be cancelled.
     * 
     * @return the isCancellable value.
     */
    Boolean isCancellable();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.DatabaseOperationInner object.
     * 
     * @return the inner object.
     */
    DatabaseOperationInner innerModel();
}
