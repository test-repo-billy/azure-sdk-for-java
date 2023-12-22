// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.AdminRuleCollectionInner;
import java.util.List;

/**
 * An immutable client-side representation of AdminRuleCollection.
 */
public interface AdminRuleCollection {
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
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the systemData property: The system metadata related to this resource.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the description property: A description of the admin rule collection.
     * 
     * @return the description value.
     */
    String description();

    /**
     * Gets the appliesToGroups property: Groups for configuration.
     * 
     * @return the appliesToGroups value.
     */
    List<NetworkManagerSecurityGroupItem> appliesToGroups();

    /**
     * Gets the provisioningState property: The provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the resourceGuid property: Unique identifier for this resource.
     * 
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.AdminRuleCollectionInner object.
     * 
     * @return the inner object.
     */
    AdminRuleCollectionInner innerModel();

    /**
     * The entirety of the AdminRuleCollection definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The AdminRuleCollection definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the AdminRuleCollection definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the AdminRuleCollection definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, networkManagerName, configurationName.
             * 
             * @param resourceGroupName The name of the resource group.
             * @param networkManagerName The name of the network manager.
             * @param configurationName The name of the network manager Security Configuration.
             * @return the next definition stage.
             */
            WithCreate withExistingSecurityAdminConfiguration(String resourceGroupName, String networkManagerName,
                String configurationName);
        }

        /**
         * The stage of the AdminRuleCollection definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithDescription, DefinitionStages.WithAppliesToGroups {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            AdminRuleCollection create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            AdminRuleCollection create(Context context);
        }

        /**
         * The stage of the AdminRuleCollection definition allowing to specify description.
         */
        interface WithDescription {
            /**
             * Specifies the description property: A description of the admin rule collection..
             * 
             * @param description A description of the admin rule collection.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the AdminRuleCollection definition allowing to specify appliesToGroups.
         */
        interface WithAppliesToGroups {
            /**
             * Specifies the appliesToGroups property: Groups for configuration.
             * 
             * @param appliesToGroups Groups for configuration.
             * @return the next definition stage.
             */
            WithCreate withAppliesToGroups(List<NetworkManagerSecurityGroupItem> appliesToGroups);
        }
    }

    /**
     * Begins update for the AdminRuleCollection resource.
     * 
     * @return the stage of resource update.
     */
    AdminRuleCollection.Update update();

    /**
     * The template for AdminRuleCollection update.
     */
    interface Update extends UpdateStages.WithDescription, UpdateStages.WithAppliesToGroups {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        AdminRuleCollection apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        AdminRuleCollection apply(Context context);
    }

    /**
     * The AdminRuleCollection update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the AdminRuleCollection update allowing to specify description.
         */
        interface WithDescription {
            /**
             * Specifies the description property: A description of the admin rule collection..
             * 
             * @param description A description of the admin rule collection.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the AdminRuleCollection update allowing to specify appliesToGroups.
         */
        interface WithAppliesToGroups {
            /**
             * Specifies the appliesToGroups property: Groups for configuration.
             * 
             * @param appliesToGroups Groups for configuration.
             * @return the next definition stage.
             */
            Update withAppliesToGroups(List<NetworkManagerSecurityGroupItem> appliesToGroups);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    AdminRuleCollection refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    AdminRuleCollection refresh(Context context);
}
