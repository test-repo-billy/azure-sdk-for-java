// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Managed database create mode. PointInTimeRestore: Create a database by restoring a point in time backup of an
 * existing database. SourceDatabaseName, SourceManagedInstanceName and PointInTime must be specified.
 * RestoreExternalBackup: Create a database by restoring from external backup files. Collation, StorageContainerUri and
 * StorageContainerSasToken must be specified. Recovery: Creates a database by restoring a geo-replicated backup.
 * RecoverableDatabaseId must be specified as the recoverable database resource ID to restore.
 * RestoreLongTermRetentionBackup: Create a database by restoring from a long term retention backup
 * (longTermRetentionBackupResourceId required).
 */
public final class ManagedDatabaseCreateMode extends ExpandableStringEnum<ManagedDatabaseCreateMode> {
    /**
     * Static value Default for ManagedDatabaseCreateMode.
     */
    public static final ManagedDatabaseCreateMode DEFAULT = fromString("Default");

    /**
     * Static value RestoreExternalBackup for ManagedDatabaseCreateMode.
     */
    public static final ManagedDatabaseCreateMode RESTORE_EXTERNAL_BACKUP = fromString("RestoreExternalBackup");

    /**
     * Static value PointInTimeRestore for ManagedDatabaseCreateMode.
     */
    public static final ManagedDatabaseCreateMode POINT_IN_TIME_RESTORE = fromString("PointInTimeRestore");

    /**
     * Static value Recovery for ManagedDatabaseCreateMode.
     */
    public static final ManagedDatabaseCreateMode RECOVERY = fromString("Recovery");

    /**
     * Static value RestoreLongTermRetentionBackup for ManagedDatabaseCreateMode.
     */
    public static final ManagedDatabaseCreateMode RESTORE_LONG_TERM_RETENTION_BACKUP
        = fromString("RestoreLongTermRetentionBackup");

    /**
     * Creates a new instance of ManagedDatabaseCreateMode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ManagedDatabaseCreateMode() {
    }

    /**
     * Creates or finds a ManagedDatabaseCreateMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ManagedDatabaseCreateMode.
     */
    @JsonCreator
    public static ManagedDatabaseCreateMode fromString(String name) {
        return fromString(name, ManagedDatabaseCreateMode.class);
    }

    /**
     * Gets known ManagedDatabaseCreateMode values.
     * 
     * @return known ManagedDatabaseCreateMode values.
     */
    public static Collection<ManagedDatabaseCreateMode> values() {
        return values(ManagedDatabaseCreateMode.class);
    }
}
