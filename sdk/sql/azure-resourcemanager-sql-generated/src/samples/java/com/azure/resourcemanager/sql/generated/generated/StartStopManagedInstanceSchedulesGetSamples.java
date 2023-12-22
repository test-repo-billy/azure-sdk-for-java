// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.resourcemanager.sql.generated.models.StartStopScheduleName;

/**
 * Samples for StartStopManagedInstanceSchedules Get.
 */
public final class StartStopManagedInstanceSchedulesGetSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-08-01-preview/examples/
     * StartStopManagedInstanceScheduleGet.json
     */
    /**
     * Sample code: Gets the managed instance's Start/Stop schedule.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void
        getsTheManagedInstanceSStartStopSchedule(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.startStopManagedInstanceSchedules().getWithResponse("schedulerg", "schedulemi",
            StartStopScheduleName.DEFAULT, com.azure.core.util.Context.NONE);
    }
}
