// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.ServerConnectionPolicyInner;

/**
 * An immutable client-side representation of ServerConnectionPolicy.
 */
public interface ServerConnectionPolicy {
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
     * Gets the location property: Resource location.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the kind property: Metadata used for the Azure portal experience.
     * 
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the connectionType property: The server connection type.
     * 
     * @return the connectionType value.
     */
    ServerConnectionType connectionType();

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
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.ServerConnectionPolicyInner object.
     * 
     * @return the inner object.
     */
    ServerConnectionPolicyInner innerModel();

    /**
     * The entirety of the ServerConnectionPolicy definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The ServerConnectionPolicy definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the ServerConnectionPolicy definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the ServerConnectionPolicy definition allowing to specify parent resource.
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
         * The stage of the ServerConnectionPolicy definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithConnectionType {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            ServerConnectionPolicy create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ServerConnectionPolicy create(Context context);
        }

        /**
         * The stage of the ServerConnectionPolicy definition allowing to specify connectionType.
         */
        interface WithConnectionType {
            /**
             * Specifies the connectionType property: The server connection type..
             * 
             * @param connectionType The server connection type.
             * @return the next definition stage.
             */
            WithCreate withConnectionType(ServerConnectionType connectionType);
        }
    }

    /**
     * Begins update for the ServerConnectionPolicy resource.
     * 
     * @return the stage of resource update.
     */
    ServerConnectionPolicy.Update update();

    /**
     * The template for ServerConnectionPolicy update.
     */
    interface Update extends UpdateStages.WithConnectionType {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        ServerConnectionPolicy apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ServerConnectionPolicy apply(Context context);
    }

    /**
     * The ServerConnectionPolicy update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the ServerConnectionPolicy update allowing to specify connectionType.
         */
        interface WithConnectionType {
            /**
             * Specifies the connectionType property: The server connection type..
             * 
             * @param connectionType The server connection type.
             * @return the next definition stage.
             */
            Update withConnectionType(ServerConnectionType connectionType);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    ServerConnectionPolicy refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ServerConnectionPolicy refresh(Context context);
}
