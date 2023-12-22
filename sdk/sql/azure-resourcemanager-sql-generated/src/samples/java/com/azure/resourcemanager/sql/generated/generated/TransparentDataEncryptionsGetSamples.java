// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.resourcemanager.sql.generated.models.TransparentDataEncryptionName;

/**
 * Samples for TransparentDataEncryptions Get.
 */
public final class TransparentDataEncryptionsGetSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2022-08-01-preview/examples/TransparentDataEncryptionGet
     * .json
     */
    /**
     * Sample code: Get a database's transparent data encryption.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void
        getADatabaseSTransparentDataEncryption(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.transparentDataEncryptions().getWithResponse("security-tde-resourcegroup", "securitytde", "testdb",
            TransparentDataEncryptionName.CURRENT, com.azure.core.util.Context.NONE);
    }
}
