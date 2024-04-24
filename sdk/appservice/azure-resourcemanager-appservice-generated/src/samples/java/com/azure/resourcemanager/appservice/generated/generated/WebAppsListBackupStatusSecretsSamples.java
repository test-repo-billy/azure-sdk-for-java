// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.resourcemanager.appservice.generated.fluent.models.BackupRequestInner;
import com.azure.resourcemanager.appservice.generated.models.BackupSchedule;
import com.azure.resourcemanager.appservice.generated.models.DatabaseBackupSetting;
import com.azure.resourcemanager.appservice.generated.models.DatabaseType;
import com.azure.resourcemanager.appservice.generated.models.FrequencyUnit;
import java.time.OffsetDateTime;
import java.util.Arrays;

/**
 * Samples for WebApps ListBackupStatusSecrets.
 */
public final class WebAppsListBackupStatusSecretsSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/GetWebAppBackupWithSecrets.json
     */
    /**
     * Sample code: Get web app backup with secrets.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void
        getWebAppBackupWithSecrets(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.webApps()
            .listBackupStatusSecretsWithResponse("testrg123", "sitef6141", "12345", new BackupRequestInner()
                .withBackupName("abcdwe")
                .withEnabled(true)
                .withStorageAccountUrl(
                    "DefaultEndpointsProtocol=https;AccountName=storagesample;AccountKey=<account-key>")
                .withBackupSchedule(new BackupSchedule().withFrequencyInterval(7)
                    .withFrequencyUnit(FrequencyUnit.DAY)
                    .withKeepAtLeastOneBackup(true)
                    .withRetentionPeriodInDays(30)
                    .withStartTime(OffsetDateTime.parse("2022-09-02T17:33:11.641Z")))
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
