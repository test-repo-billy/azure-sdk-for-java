// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.applicationinsights.fluent.models.ComponentLinkedStorageAccountsInner;

/**
 * An immutable client-side representation of ComponentLinkedStorageAccounts.
 */
public interface ComponentLinkedStorageAccounts {
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
     * Gets the linkedStorageAccount property: Linked storage account resource ID.
     * 
     * @return the linkedStorageAccount value.
     */
    String linkedStorageAccount();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.applicationinsights.fluent.models.ComponentLinkedStorageAccountsInner
     * object.
     * 
     * @return the inner object.
     */
    ComponentLinkedStorageAccountsInner innerModel();

    /**
     * The entirety of the ComponentLinkedStorageAccounts definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The ComponentLinkedStorageAccounts definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the ComponentLinkedStorageAccounts definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the ComponentLinkedStorageAccounts definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, resourceName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param resourceName The name of the Application Insights component resource.
             * @return the next definition stage.
             */
            WithCreate withExistingComponent(String resourceGroupName, String resourceName);
        }

        /**
         * The stage of the ComponentLinkedStorageAccounts definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithLinkedStorageAccount {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            ComponentLinkedStorageAccounts create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ComponentLinkedStorageAccounts create(Context context);
        }

        /**
         * The stage of the ComponentLinkedStorageAccounts definition allowing to specify linkedStorageAccount.
         */
        interface WithLinkedStorageAccount {
            /**
             * Specifies the linkedStorageAccount property: Linked storage account resource ID.
             * 
             * @param linkedStorageAccount Linked storage account resource ID.
             * @return the next definition stage.
             */
            WithCreate withLinkedStorageAccount(String linkedStorageAccount);
        }
    }

    /**
     * Begins update for the ComponentLinkedStorageAccounts resource.
     * 
     * @return the stage of resource update.
     */
    ComponentLinkedStorageAccounts.Update update();

    /**
     * The template for ComponentLinkedStorageAccounts update.
     */
    interface Update extends UpdateStages.WithLinkedStorageAccount {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        ComponentLinkedStorageAccounts apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ComponentLinkedStorageAccounts apply(Context context);
    }

    /**
     * The ComponentLinkedStorageAccounts update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the ComponentLinkedStorageAccounts update allowing to specify linkedStorageAccount.
         */
        interface WithLinkedStorageAccount {
            /**
             * Specifies the linkedStorageAccount property: Linked storage account resource ID.
             * 
             * @param linkedStorageAccount Linked storage account resource ID.
             * @return the next definition stage.
             */
            Update withLinkedStorageAccount(String linkedStorageAccount);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    ComponentLinkedStorageAccounts refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ComponentLinkedStorageAccounts refresh(Context context);
}
