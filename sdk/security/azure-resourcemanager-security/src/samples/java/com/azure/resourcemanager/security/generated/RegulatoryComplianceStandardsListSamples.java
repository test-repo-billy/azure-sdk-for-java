// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/**
 * Samples for RegulatoryComplianceStandards List.
 */
public final class RegulatoryComplianceStandardsListSamples {
    /*
     * x-ms-original-file:
     * specification/security/resource-manager/Microsoft.Security/preview/2019-01-01-preview/examples/
     * RegulatoryCompliance/getRegulatoryComplianceStandardList_example.json
     */
    /**
     * Sample code: Get all supported regulatory compliance standards details and state.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void getAllSupportedRegulatoryComplianceStandardsDetailsAndState(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.regulatoryComplianceStandards().list(null, com.azure.core.util.Context.NONE);
    }
}
