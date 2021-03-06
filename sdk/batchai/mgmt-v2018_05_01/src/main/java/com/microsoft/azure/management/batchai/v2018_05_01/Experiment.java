/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.batchai.v2018_05_01.implementation.ExperimentInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.batchai.v2018_05_01.implementation.BatchAIManager;
import org.joda.time.DateTime;

/**
 * Type representing Experiment.
 */
public interface Experiment extends HasInner<ExperimentInner>, Indexable, Refreshable<Experiment>, Updatable<Experiment.Update>, HasManager<BatchAIManager> {
    /**
     * @return the creationTime value.
     */
    DateTime creationTime();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the provisioningStateTransitionTime value.
     */
    DateTime provisioningStateTransitionTime();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the Experiment definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithWorkspace, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Experiment definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Experiment definition.
         */
        interface Blank extends WithWorkspace {
        }

        /**
         * The stage of the experiment definition allowing to specify Workspace.
         */
        interface WithWorkspace {
           /**
            * Specifies resourceGroupName, workspaceName.
            * @param resourceGroupName Name of the resource group to which the resource belongs
            * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long
            * @return the next definition stage
            */
            WithCreate withExistingWorkspace(String resourceGroupName, String workspaceName);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Experiment> {
        }
    }
    /**
     * The template for a Experiment update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Experiment> {
    }

    /**
     * Grouping of Experiment update stages.
     */
    interface UpdateStages {
    }
}
