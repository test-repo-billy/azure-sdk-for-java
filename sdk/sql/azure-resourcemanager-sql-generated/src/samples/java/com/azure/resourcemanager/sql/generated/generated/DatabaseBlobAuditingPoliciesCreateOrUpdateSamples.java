// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.resourcemanager.sql.generated.models.BlobAuditingPolicyState;
import java.util.Arrays;
import java.util.UUID;

/**
 * Samples for DatabaseBlobAuditingPolicies CreateOrUpdate.
 */
public final class DatabaseBlobAuditingPoliciesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2021-11-01-preview/examples/
     * DatabaseAzureMonitorAuditingCreateMin.json
     */
    /**
     * Sample code: Create or update a database's azure monitor auditing policy with minimal parameters.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void createOrUpdateADatabaseSAzureMonitorAuditingPolicyWithMinimalParameters(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.databaseBlobAuditingPolicies().define()
            .withExistingDatabase("blobauditingtest-4799", "blobauditingtest-6440", "testdb")
            .withIsAzureMonitorTargetEnabled(true).withState(BlobAuditingPolicyState.ENABLED).create();
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2021-11-01-preview/examples/
     * DatabaseBlobAuditingCreateMax.json
     */
    /**
     * Sample code: Create or update a database's blob auditing policy with all parameters.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void createOrUpdateADatabaseSBlobAuditingPolicyWithAllParameters(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.databaseBlobAuditingPolicies().define()
            .withExistingDatabase("blobauditingtest-4799", "blobauditingtest-6440", "testdb").withRetentionDays(6)
            .withAuditActionsAndGroups(Arrays.asList("DATABASE_LOGOUT_GROUP", "DATABASE_ROLE_MEMBER_CHANGE_GROUP",
                "UPDATE on database::TestDatabaseName by public"))
            .withIsStorageSecondaryKeyInUse(false).withIsAzureMonitorTargetEnabled(true).withQueueDelayMs(4000)
            .withState(BlobAuditingPolicyState.ENABLED).withStorageEndpoint("https://mystorage.blob.core.windows.net")
            .withStorageAccountAccessKey(
                "sdlfkjabc+sdlfkjsdlkfsjdfLDKFTERLKFDFKLjsdfksjdflsdkfD2342309432849328476458/3RSD==")
            .withStorageAccountSubscriptionId(UUID.fromString("00000000-1234-0000-5678-000000000000")).create();
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2021-11-01-preview/examples/
     * DatabaseBlobAuditingCreateMin.json
     */
    /**
     * Sample code: Create or update a database's blob auditing policy with minimal parameters.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void createOrUpdateADatabaseSBlobAuditingPolicyWithMinimalParameters(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.databaseBlobAuditingPolicies().define()
            .withExistingDatabase("blobauditingtest-4799", "blobauditingtest-6440", "testdb")
            .withState(BlobAuditingPolicyState.ENABLED).withStorageEndpoint("https://mystorage.blob.core.windows.net")
            .withStorageAccountAccessKey(
                "sdlfkjabc+sdlfkjsdlkfsjdfLDKFTERLKFDFKLjsdfksjdflsdkfD2342309432849328476458/3RSD==")
            .create();
    }
}
