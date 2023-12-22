// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.JobAgentInner;
import java.util.Map;

/**
 * An immutable client-side representation of JobAgent.
 */
public interface JobAgent {
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
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the sku property: The name and tier of the SKU.
     * 
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the databaseId property: Resource ID of the database to store job metadata in.
     * 
     * @return the databaseId value.
     */
    String databaseId();

    /**
     * Gets the state property: The state of the job agent.
     * 
     * @return the state value.
     */
    JobAgentState state();

    /**
     * Gets the region of the resource.
     * 
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     * 
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.JobAgentInner object.
     * 
     * @return the inner object.
     */
    JobAgentInner innerModel();

    /**
     * The entirety of the JobAgent definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The JobAgent definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the JobAgent definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the JobAgent definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }

        /**
         * The stage of the JobAgent definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serverName.
             * 
             * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this
             * value from the Azure Resource Manager API or the portal.
             * @param serverName The name of the server.
             * @return the next definition stage.
             */
            WithCreate withExistingServer(String resourceGroupName, String serverName);
        }

        /**
         * The stage of the JobAgent definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithSku, DefinitionStages.WithDatabaseId {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            JobAgent create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            JobAgent create(Context context);
        }

        /**
         * The stage of the JobAgent definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the JobAgent definition allowing to specify sku.
         */
        interface WithSku {
            /**
             * Specifies the sku property: The name and tier of the SKU..
             * 
             * @param sku The name and tier of the SKU.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the JobAgent definition allowing to specify databaseId.
         */
        interface WithDatabaseId {
            /**
             * Specifies the databaseId property: Resource ID of the database to store job metadata in..
             * 
             * @param databaseId Resource ID of the database to store job metadata in.
             * @return the next definition stage.
             */
            WithCreate withDatabaseId(String databaseId);
        }
    }

    /**
     * Begins update for the JobAgent resource.
     * 
     * @return the stage of resource update.
     */
    JobAgent.Update update();

    /**
     * The template for JobAgent update.
     */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        JobAgent apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        JobAgent apply(Context context);
    }

    /**
     * The JobAgent update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the JobAgent update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    JobAgent refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    JobAgent refresh(Context context);
}
