// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

/**
 * Samples for ManagedInstanceAdvancedThreatProtectionSettings ListByInstance.
 */
public final class ManagedInstanceAdvancedThreatProtectionSettingsListByInstanceSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-02-01-preview/examples/
     * ManagedInstanceAdvancedThreatProtectionSettingsListByInstance.json
     */
    /**
     * Sample code: List the managed instance's Advanced Threat Protection settings.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void listTheManagedInstanceSAdvancedThreatProtectionSettings(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.managedInstanceAdvancedThreatProtectionSettings().listByInstance("threatprotection-4799",
            "threatprotection-6440", com.azure.core.util.Context.NONE);
    }
}
