// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.resourcemanager.sql.generated.fluent.models.LongTermRetentionBackupOperationResultInner;
import java.util.UUID;

/**
 * An immutable client-side representation of LongTermRetentionBackupOperationResult.
 */
public interface LongTermRetentionBackupOperationResult {
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
     * Gets the requestId property: Request Id.
     * 
     * @return the requestId value.
     */
    UUID requestId();

    /**
     * Gets the operationType property: Operation type.
     * 
     * @return the operationType value.
     */
    String operationType();

    /**
     * Gets the fromBackupResourceId property: Source backup resource id.
     * 
     * @return the fromBackupResourceId value.
     */
    String fromBackupResourceId();

    /**
     * Gets the toBackupResourceId property: Target backup resource id.
     * 
     * @return the toBackupResourceId value.
     */
    String toBackupResourceId();

    /**
     * Gets the targetBackupStorageRedundancy property: The storage redundancy type of the copied backup.
     * 
     * @return the targetBackupStorageRedundancy value.
     */
    BackupStorageRedundancy targetBackupStorageRedundancy();

    /**
     * Gets the status property: Operation status.
     * 
     * @return the status value.
     */
    String status();

    /**
     * Gets the message property: Progress message.
     * 
     * @return the message value.
     */
    String message();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.LongTermRetentionBackupOperationResultInner
     * object.
     * 
     * @return the inner object.
     */
    LongTermRetentionBackupOperationResultInner innerModel();
}
