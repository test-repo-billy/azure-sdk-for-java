// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apicenter.fluent.models.WorkspaceInner;

/**
 * An immutable client-side representation of Workspace.
 */
public interface Workspace {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the title property: Workspace title.
     * 
     * @return the title value.
     */
    String title();

    /**
     * Gets the description property: Workspace description.
     * 
     * @return the description value.
     */
    String description();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.apicenter.fluent.models.WorkspaceInner object.
     * 
     * @return the inner object.
     */
    WorkspaceInner innerModel();

    /**
     * The entirety of the Workspace definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The Workspace definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the Workspace definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the Workspace definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serviceName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param serviceName The name of Azure API Center service.
             * @return the next definition stage.
             */
            WithCreate withExistingService(String resourceGroupName, String serviceName);
        }

        /**
         * The stage of the Workspace definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTitle, DefinitionStages.WithDescription {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            Workspace create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Workspace create(Context context);
        }

        /**
         * The stage of the Workspace definition allowing to specify title.
         */
        interface WithTitle {
            /**
             * Specifies the title property: Workspace title..
             * 
             * @param title Workspace title.
             * @return the next definition stage.
             */
            WithCreate withTitle(String title);
        }

        /**
         * The stage of the Workspace definition allowing to specify description.
         */
        interface WithDescription {
            /**
             * Specifies the description property: Workspace description..
             * 
             * @param description Workspace description.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
    }

    /**
     * Begins update for the Workspace resource.
     * 
     * @return the stage of resource update.
     */
    Workspace.Update update();

    /**
     * The template for Workspace update.
     */
    interface Update extends UpdateStages.WithTitle, UpdateStages.WithDescription {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        Workspace apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Workspace apply(Context context);
    }

    /**
     * The Workspace update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the Workspace update allowing to specify title.
         */
        interface WithTitle {
            /**
             * Specifies the title property: Workspace title..
             * 
             * @param title Workspace title.
             * @return the next definition stage.
             */
            Update withTitle(String title);
        }

        /**
         * The stage of the Workspace update allowing to specify description.
         */
        interface WithDescription {
            /**
             * Specifies the description property: Workspace description..
             * 
             * @param description Workspace description.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    Workspace refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Workspace refresh(Context context);
}
