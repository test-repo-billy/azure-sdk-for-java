// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

/**
 * Samples for ServerKeys Delete.
 */
public final class ServerKeysDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/ServerKeyDelete.json
     */
    /**
     * Sample code: Delete the server key.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void deleteTheServerKey(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.serverKeys().delete("sqlcrudtest-7398", "sqlcrudtest-4645",
            "someVault_someKey_01234567890123456789012345678901", com.azure.core.util.Context.NONE);
    }
}
