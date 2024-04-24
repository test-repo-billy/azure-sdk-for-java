// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.VnetInfoResourceInner;
import java.util.List;

/**
 * An immutable client-side representation of VnetInfoResource.
 */
public interface VnetInfoResource {
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
     * Gets the kind property: Kind of resource.
     * 
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the vnetResourceId property: The Virtual Network's resource ID.
     * 
     * @return the vnetResourceId value.
     */
    String vnetResourceId();

    /**
     * Gets the certThumbprint property: The client certificate thumbprint.
     * 
     * @return the certThumbprint value.
     */
    String certThumbprint();

    /**
     * Gets the certBlob property: A certificate file (.cer) blob containing the public key of the private key used to
     * authenticate a
     * Point-To-Site VPN connection.
     * 
     * @return the certBlob value.
     */
    String certBlob();

    /**
     * Gets the routes property: The routes that this Virtual Network connection uses.
     * 
     * @return the routes value.
     */
    List<VnetRoute> routes();

    /**
     * Gets the resyncRequired property: &lt;code&gt;true&lt;/code&gt; if a resync is required; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the resyncRequired value.
     */
    Boolean resyncRequired();

    /**
     * Gets the dnsServers property: DNS servers to be used by this Virtual Network. This should be a comma-separated
     * list of IP addresses.
     * 
     * @return the dnsServers value.
     */
    String dnsServers();

    /**
     * Gets the isSwift property: Flag that is used to denote if this is VNET injection.
     * 
     * @return the isSwift value.
     */
    Boolean isSwift();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.VnetInfoResourceInner object.
     * 
     * @return the inner object.
     */
    VnetInfoResourceInner innerModel();

    /**
     * The entirety of the VnetInfoResource definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The VnetInfoResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the VnetInfoResource definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the VnetInfoResource definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, name, slot.
             * 
             * @param resourceGroupName Name of the resource group to which the resource belongs.
             * @param name Name of the app.
             * @param slot Name of the deployment slot. If a slot is not specified, the API will add or update
             * connections for the production slot.
             * @return the next definition stage.
             */
            WithCreate withExistingSlot(String resourceGroupName, String name, String slot);
        }

        /**
         * The stage of the VnetInfoResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithKind, DefinitionStages.WithVnetResourceId,
            DefinitionStages.WithCertBlob, DefinitionStages.WithDnsServers, DefinitionStages.WithIsSwift {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            VnetInfoResource create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            VnetInfoResource create(Context context);
        }

        /**
         * The stage of the VnetInfoResource definition allowing to specify kind.
         */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             * 
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the VnetInfoResource definition allowing to specify vnetResourceId.
         */
        interface WithVnetResourceId {
            /**
             * Specifies the vnetResourceId property: The Virtual Network's resource ID..
             * 
             * @param vnetResourceId The Virtual Network's resource ID.
             * @return the next definition stage.
             */
            WithCreate withVnetResourceId(String vnetResourceId);
        }

        /**
         * The stage of the VnetInfoResource definition allowing to specify certBlob.
         */
        interface WithCertBlob {
            /**
             * Specifies the certBlob property: A certificate file (.cer) blob containing the public key of the private
             * key used to authenticate a
             * Point-To-Site VPN connection..
             * 
             * @param certBlob A certificate file (.cer) blob containing the public key of the private key used to
             * authenticate a
             * Point-To-Site VPN connection.
             * @return the next definition stage.
             */
            WithCreate withCertBlob(String certBlob);
        }

        /**
         * The stage of the VnetInfoResource definition allowing to specify dnsServers.
         */
        interface WithDnsServers {
            /**
             * Specifies the dnsServers property: DNS servers to be used by this Virtual Network. This should be a
             * comma-separated list of IP addresses..
             * 
             * @param dnsServers DNS servers to be used by this Virtual Network. This should be a comma-separated list
             * of IP addresses.
             * @return the next definition stage.
             */
            WithCreate withDnsServers(String dnsServers);
        }

        /**
         * The stage of the VnetInfoResource definition allowing to specify isSwift.
         */
        interface WithIsSwift {
            /**
             * Specifies the isSwift property: Flag that is used to denote if this is VNET injection.
             * 
             * @param isSwift Flag that is used to denote if this is VNET injection.
             * @return the next definition stage.
             */
            WithCreate withIsSwift(Boolean isSwift);
        }
    }

    /**
     * Begins update for the VnetInfoResource resource.
     * 
     * @return the stage of resource update.
     */
    VnetInfoResource.Update update();

    /**
     * The template for VnetInfoResource update.
     */
    interface Update extends UpdateStages.WithKind, UpdateStages.WithVnetResourceId, UpdateStages.WithCertBlob,
        UpdateStages.WithDnsServers, UpdateStages.WithIsSwift {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        VnetInfoResource apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        VnetInfoResource apply(Context context);
    }

    /**
     * The VnetInfoResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the VnetInfoResource update allowing to specify kind.
         */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             * 
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            Update withKind(String kind);
        }

        /**
         * The stage of the VnetInfoResource update allowing to specify vnetResourceId.
         */
        interface WithVnetResourceId {
            /**
             * Specifies the vnetResourceId property: The Virtual Network's resource ID..
             * 
             * @param vnetResourceId The Virtual Network's resource ID.
             * @return the next definition stage.
             */
            Update withVnetResourceId(String vnetResourceId);
        }

        /**
         * The stage of the VnetInfoResource update allowing to specify certBlob.
         */
        interface WithCertBlob {
            /**
             * Specifies the certBlob property: A certificate file (.cer) blob containing the public key of the private
             * key used to authenticate a
             * Point-To-Site VPN connection..
             * 
             * @param certBlob A certificate file (.cer) blob containing the public key of the private key used to
             * authenticate a
             * Point-To-Site VPN connection.
             * @return the next definition stage.
             */
            Update withCertBlob(String certBlob);
        }

        /**
         * The stage of the VnetInfoResource update allowing to specify dnsServers.
         */
        interface WithDnsServers {
            /**
             * Specifies the dnsServers property: DNS servers to be used by this Virtual Network. This should be a
             * comma-separated list of IP addresses..
             * 
             * @param dnsServers DNS servers to be used by this Virtual Network. This should be a comma-separated list
             * of IP addresses.
             * @return the next definition stage.
             */
            Update withDnsServers(String dnsServers);
        }

        /**
         * The stage of the VnetInfoResource update allowing to specify isSwift.
         */
        interface WithIsSwift {
            /**
             * Specifies the isSwift property: Flag that is used to denote if this is VNET injection.
             * 
             * @param isSwift Flag that is used to denote if this is VNET injection.
             * @return the next definition stage.
             */
            Update withIsSwift(Boolean isSwift);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    VnetInfoResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    VnetInfoResource refresh(Context context);
}
