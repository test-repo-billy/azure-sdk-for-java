// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.resourcemanager.sql.generated.models.SecurityAlertPolicyName;

/**
 * Samples for DatabaseSecurityAlertPolicies Get.
 */
public final class DatabaseSecurityAlertPoliciesGetSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/DatabaseSecurityAlertGet.
     * json
     */
    /**
     * Sample code: Get a database's threat detection policy.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void getADatabaseSThreatDetectionPolicy(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.databaseSecurityAlertPolicies().getWithResponse("securityalert-6852", "securityalert-2080", "testdb",
            SecurityAlertPolicyName.DEFAULT, com.azure.core.util.Context.NONE);
    }
}
