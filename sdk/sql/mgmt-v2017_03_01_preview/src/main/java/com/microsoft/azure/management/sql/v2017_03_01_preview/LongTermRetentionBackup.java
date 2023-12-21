/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2017_03_01_preview.implementation.LongTermRetentionBackupInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2017_03_01_preview.implementation.SqlManager;
import org.joda.time.DateTime;

/**
 * Type representing LongTermRetentionBackup.
 */
public interface LongTermRetentionBackup extends HasInner<LongTermRetentionBackupInner>, Indexable, Refreshable<LongTermRetentionBackup>, HasManager<SqlManager> {
    /**
     * @return the backupExpirationTime value.
     */
    DateTime backupExpirationTime();

    /**
     * @return the backupTime value.
     */
    DateTime backupTime();

    /**
     * @return the databaseDeletionTime value.
     */
    DateTime databaseDeletionTime();

    /**
     * @return the databaseName value.
     */
    String databaseName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the serverCreateTime value.
     */
    DateTime serverCreateTime();

    /**
     * @return the serverName value.
     */
    String serverName();

    /**
     * @return the type value.
     */
    String type();

}
