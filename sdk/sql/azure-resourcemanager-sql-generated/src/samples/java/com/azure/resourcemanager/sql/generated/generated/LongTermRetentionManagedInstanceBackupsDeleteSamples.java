// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

/**
 * Samples for LongTermRetentionManagedInstanceBackups Delete.
 */
public final class LongTermRetentionManagedInstanceBackupsDeleteSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2021-05-01-preview/examples/
     * ManagedInstanceLongTermRetentionBackupDelete.json
     */
    /**
     * Sample code: Delete the long term retention backup.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void deleteTheLongTermRetentionBackup(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.longTermRetentionManagedInstanceBackups().delete("japaneast", "testInstance", "testDatabase",
            "55555555-6666-7777-8888-999999999999;131637960820000000", com.azure.core.util.Context.NONE);
    }
}
