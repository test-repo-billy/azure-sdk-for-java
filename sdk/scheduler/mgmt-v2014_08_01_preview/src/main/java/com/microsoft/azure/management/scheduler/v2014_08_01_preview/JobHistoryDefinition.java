/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.scheduler.v2014_08_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.scheduler.v2014_08_01_preview.implementation.SchedulerManager;
import com.microsoft.azure.management.scheduler.v2014_08_01_preview.implementation.JobHistoryDefinitionInner;

/**
 * Type representing JobHistoryDefinition.
 */
public interface JobHistoryDefinition extends HasInner<JobHistoryDefinitionInner>, HasManager<SchedulerManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    JobHistoryDefinitionProperties properties();

    /**
     * @return the type value.
     */
    String type();

}
