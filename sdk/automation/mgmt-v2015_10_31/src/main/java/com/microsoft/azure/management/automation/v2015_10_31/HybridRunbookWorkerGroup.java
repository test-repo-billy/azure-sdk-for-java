/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.automation.v2015_10_31.implementation.HybridRunbookWorkerGroupInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.automation.v2015_10_31.implementation.AutomationManager;
import java.util.List;

/**
 * Type representing HybridRunbookWorkerGroup.
 */
public interface HybridRunbookWorkerGroup extends HasInner<HybridRunbookWorkerGroupInner>, Indexable, Refreshable<HybridRunbookWorkerGroup>, Updatable<HybridRunbookWorkerGroup.Update>, HasManager<AutomationManager> {
    /**
     * @return the credential value.
     */
    RunAsCredentialAssociationProperty credential();

    /**
     * @return the groupType value.
     */
    GroupTypeEnum groupType();

    /**
     * @return the hybridRunbookWorkers value.
     */
    List<HybridRunbookWorker> hybridRunbookWorkers();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * The template for a HybridRunbookWorkerGroup update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<HybridRunbookWorkerGroup> {
    }

    /**
     * Grouping of HybridRunbookWorkerGroup update stages.
     */
    interface UpdateStages {
    }
}
