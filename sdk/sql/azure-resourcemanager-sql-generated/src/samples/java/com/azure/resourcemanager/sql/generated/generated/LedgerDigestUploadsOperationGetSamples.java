// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.resourcemanager.sql.generated.models.LedgerDigestUploadsName;

/**
 * Samples for LedgerDigestUploadsOperation Get.
 */
public final class LedgerDigestUploadsOperationGetSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2021-02-01-preview/examples/LedgerDigestUploadsGet.json
     */
    /**
     * Sample code: Gets the current ledger digest upload configuration for a database.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void getsTheCurrentLedgerDigestUploadConfigurationForADatabase(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.ledgerDigestUploadsOperations().getWithResponse("ledgertestrg", "ledgertestserver", "testdb",
            LedgerDigestUploadsName.CURRENT, com.azure.core.util.Context.NONE);
    }
}
