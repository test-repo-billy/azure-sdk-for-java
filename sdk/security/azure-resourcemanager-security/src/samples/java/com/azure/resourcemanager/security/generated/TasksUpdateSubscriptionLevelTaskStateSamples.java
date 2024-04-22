// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.resourcemanager.security.models.TaskUpdateActionType;

/**
 * Samples for Tasks UpdateSubscriptionLevelTaskState.
 */
public final class TasksUpdateSubscriptionLevelTaskStateSamples {
    /*
     * x-ms-original-file:
     * specification/security/resource-manager/Microsoft.Security/preview/2015-06-01-preview/examples/Tasks/
     * UpdateTaskSubscriptionLocation_example.json
     */
    /**
     * Sample code: Change security recommendation task state.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void
        changeSecurityRecommendationTaskState(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.tasks().updateSubscriptionLevelTaskStateWithResponse("westeurope",
            "62609ee7-d0a5-8616-9fe4-1df5cca7758d", TaskUpdateActionType.DISMISS, com.azure.core.util.Context.NONE);
    }
}
