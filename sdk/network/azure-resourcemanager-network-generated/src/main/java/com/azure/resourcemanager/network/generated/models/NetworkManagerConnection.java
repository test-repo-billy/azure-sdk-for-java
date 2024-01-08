// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkManagerConnectionInner;

/**
 * An immutable client-side representation of NetworkManagerConnection.
 */
public interface NetworkManagerConnection {
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
     * Gets the networkManagerId property: Network Manager Id.
     * 
     * @return the networkManagerId value.
     */
    String networkManagerId();

    /**
     * Gets the connectionState property: Connection state.
     * 
     * @return the connectionState value.
     */
    ScopeConnectionState connectionState();

    /**
     * Gets the description property: A description of the network manager connection.
     * 
     * @return the description value.
     */
    String description();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.NetworkManagerConnectionInner object.
     * 
     * @return the inner object.
     */
    NetworkManagerConnectionInner innerModel();

    /**
     * The entirety of the NetworkManagerConnection definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithCreate {
    }

    /**
     * The NetworkManagerConnection definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the NetworkManagerConnection definition.
         */
        interface Blank extends WithCreate {
        }

        /**
         * The stage of the NetworkManagerConnection definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithNetworkManagerId, DefinitionStages.WithDescription {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            NetworkManagerConnection create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            NetworkManagerConnection create(Context context);
        }

        /**
         * The stage of the NetworkManagerConnection definition allowing to specify networkManagerId.
         */
        interface WithNetworkManagerId {
            /**
             * Specifies the networkManagerId property: Network Manager Id..
             * 
             * @param networkManagerId Network Manager Id.
             * @return the next definition stage.
             */
            WithCreate withNetworkManagerId(String networkManagerId);
        }

        /**
         * The stage of the NetworkManagerConnection definition allowing to specify description.
         */
        interface WithDescription {
            /**
             * Specifies the description property: A description of the network manager connection..
             * 
             * @param description A description of the network manager connection.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
    }

    /**
     * Begins update for the NetworkManagerConnection resource.
     * 
     * @return the stage of resource update.
     */
    NetworkManagerConnection.Update update();

    /**
     * The template for NetworkManagerConnection update.
     */
    interface Update extends UpdateStages.WithNetworkManagerId, UpdateStages.WithDescription {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        NetworkManagerConnection apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        NetworkManagerConnection apply(Context context);
    }

    /**
     * The NetworkManagerConnection update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the NetworkManagerConnection update allowing to specify networkManagerId.
         */
        interface WithNetworkManagerId {
            /**
             * Specifies the networkManagerId property: Network Manager Id..
             * 
             * @param networkManagerId Network Manager Id.
             * @return the next definition stage.
             */
            Update withNetworkManagerId(String networkManagerId);
        }

        /**
         * The stage of the NetworkManagerConnection update allowing to specify description.
         */
        interface WithDescription {
            /**
             * Specifies the description property: A description of the network manager connection..
             * 
             * @param description A description of the network manager connection.
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
    NetworkManagerConnection refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    NetworkManagerConnection refresh(Context context);
}
