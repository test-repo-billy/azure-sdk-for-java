// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.resourcemanager.sql.generated.fluent.models.AdvisorInner;
import com.azure.resourcemanager.sql.generated.models.AutoExecuteStatus;

/**
 * Samples for ServerAdvisors Update.
 */
public final class ServerAdvisorsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/ServerAdvisorUpdate.json
     */
    /**
     * Sample code: Update server advisor.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void updateServerAdvisor(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.serverAdvisors().updateWithResponse("workloadinsight-demos", "misosisvr", "CreateIndex",
            new AdvisorInner().withAutoExecuteStatus(AutoExecuteStatus.DISABLED), com.azure.core.util.Context.NONE);
    }
}
