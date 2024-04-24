// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.resourcemanager.appservice.generated.fluent.models.RestoreRequestInner;
import com.azure.resourcemanager.appservice.generated.models.DatabaseBackupSetting;
import com.azure.resourcemanager.appservice.generated.models.DatabaseType;
import java.util.Arrays;

/**
 * Samples for WebApps Restore.
 */
public final class WebAppsRestoreSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/RestoreWebAppBackup.json
     */
    /**
     * Sample code: Restore web app from backup.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void
        restoreWebAppFromBackup(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.webApps()
            .restore("testrg123", "sitef6141", "123244", new RestoreRequestInner()
                .withStorageAccountUrl(
                    "DefaultEndpointsProtocol=https;AccountName=storagesample;AccountKey=<account-key>")
                .withOverwrite(true)
                .withSiteName("sitef6141")
                .withDatabases(Arrays.asList(
                    new DatabaseBackupSetting().withDatabaseType(DatabaseType.SQL_AZURE)
                        .withName("backenddb")
                        .withConnectionStringName("backend")
                        .withConnectionString(
                            "DSN=data-source-name[;SERVER=value] [;PWD=value] [;UID=value] [;<Attribute>=<value>]"),
                    new DatabaseBackupSetting().withDatabaseType(DatabaseType.SQL_AZURE)
                        .withName("statsdb")
                        .withConnectionStringName("stats")
                        .withConnectionString(
                            "DSN=data-source-name[;SERVER=value] [;PWD=value] [;UID=value] [;<Attribute>=<value>]"))),
                com.azure.core.util.Context.NONE);
    }
}
