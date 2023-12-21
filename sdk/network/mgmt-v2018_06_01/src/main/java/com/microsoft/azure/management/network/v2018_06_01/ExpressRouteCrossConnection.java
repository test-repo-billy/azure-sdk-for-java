/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_06_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.management.network.v2018_06_01.implementation.ExpressRouteCrossConnectionPeeringInner;
import com.microsoft.azure.management.network.v2018_06_01.implementation.ExpressRouteCrossConnectionInner;

/**
 * Type representing ExpressRouteCrossConnection.
 */
public interface ExpressRouteCrossConnection extends HasInner<ExpressRouteCrossConnectionInner>, Resource, GroupableResourceCore<NetworkManager, ExpressRouteCrossConnectionInner>, HasResourceGroup, Refreshable<ExpressRouteCrossConnection>, Updatable<ExpressRouteCrossConnection.Update>, HasManager<NetworkManager> {
    /**
     * @return the bandwidthInMbps value.
     */
    Integer bandwidthInMbps();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the expressRouteCircuit value.
     */
    ExpressRouteCircuitReference expressRouteCircuit();

    /**
     * @return the peeringLocation value.
     */
    String peeringLocation();

    /**
     * @return the peerings value.
     */
    List<ExpressRouteCrossConnectionPeering> peerings();

    /**
     * @return the primaryAzurePort value.
     */
    String primaryAzurePort();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the secondaryAzurePort value.
     */
    String secondaryAzurePort();

    /**
     * @return the serviceProviderNotes value.
     */
    String serviceProviderNotes();

    /**
     * @return the serviceProviderProvisioningState value.
     */
    ServiceProviderProvisioningState serviceProviderProvisioningState();

    /**
     * @return the sTag value.
     */
    Integer sTag();

    /**
     * The entirety of the ExpressRouteCrossConnection definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ExpressRouteCrossConnection definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ExpressRouteCrossConnection definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the ExpressRouteCrossConnection definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the expressroutecrossconnection definition allowing to specify BandwidthInMbps.
         */
        interface WithBandwidthInMbps {
            /**
             * Specifies bandwidthInMbps.
             * @param bandwidthInMbps The circuit bandwidth In Mbps
             * @return the next definition stage
             */
            WithCreate withBandwidthInMbps(Integer bandwidthInMbps);
        }

        /**
         * The stage of the expressroutecrossconnection definition allowing to specify ExpressRouteCircuit.
         */
        interface WithExpressRouteCircuit {
            /**
             * Specifies expressRouteCircuit.
             * @param expressRouteCircuit The ExpressRouteCircuit
             * @return the next definition stage
             */
            WithCreate withExpressRouteCircuit(ExpressRouteCircuitReference expressRouteCircuit);
        }

        /**
         * The stage of the expressroutecrossconnection definition allowing to specify PeeringLocation.
         */
        interface WithPeeringLocation {
            /**
             * Specifies peeringLocation.
             * @param peeringLocation The peering location of the ExpressRoute circuit
             * @return the next definition stage
             */
            WithCreate withPeeringLocation(String peeringLocation);
        }

        /**
         * The stage of the expressroutecrossconnection definition allowing to specify Peerings.
         */
        interface WithPeerings {
            /**
             * Specifies peerings.
             * @param peerings The list of peerings
             * @return the next definition stage
             */
            WithCreate withPeerings(List<ExpressRouteCrossConnectionPeeringInner> peerings);
        }

        /**
         * The stage of the expressroutecrossconnection definition allowing to specify ServiceProviderNotes.
         */
        interface WithServiceProviderNotes {
            /**
             * Specifies serviceProviderNotes.
             * @param serviceProviderNotes Additional read only notes set by the connectivity provider
             * @return the next definition stage
             */
            WithCreate withServiceProviderNotes(String serviceProviderNotes);
        }

        /**
         * The stage of the expressroutecrossconnection definition allowing to specify ServiceProviderProvisioningState.
         */
        interface WithServiceProviderProvisioningState {
            /**
             * Specifies serviceProviderProvisioningState.
             * @param serviceProviderProvisioningState The provisioning state of the circuit in the connectivity provider system. Possible values are 'NotProvisioned', 'Provisioning', 'Provisioned'. Possible values include: 'NotProvisioned', 'Provisioning', 'Provisioned', 'Deprovisioning'
             * @return the next definition stage
             */
            WithCreate withServiceProviderProvisioningState(ServiceProviderProvisioningState serviceProviderProvisioningState);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ExpressRouteCrossConnection>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithBandwidthInMbps, DefinitionStages.WithExpressRouteCircuit, DefinitionStages.WithPeeringLocation, DefinitionStages.WithPeerings, DefinitionStages.WithServiceProviderNotes, DefinitionStages.WithServiceProviderProvisioningState {
        }
    }
    /**
     * The template for a ExpressRouteCrossConnection update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ExpressRouteCrossConnection>, Resource.UpdateWithTags<Update>, UpdateStages.WithBandwidthInMbps, UpdateStages.WithExpressRouteCircuit, UpdateStages.WithPeeringLocation, UpdateStages.WithPeerings, UpdateStages.WithServiceProviderNotes, UpdateStages.WithServiceProviderProvisioningState {
    }

    /**
     * Grouping of ExpressRouteCrossConnection update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the expressroutecrossconnection update allowing to specify BandwidthInMbps.
         */
        interface WithBandwidthInMbps {
            /**
             * Specifies bandwidthInMbps.
             * @param bandwidthInMbps The circuit bandwidth In Mbps
             * @return the next update stage
             */
            Update withBandwidthInMbps(Integer bandwidthInMbps);
        }

        /**
         * The stage of the expressroutecrossconnection update allowing to specify ExpressRouteCircuit.
         */
        interface WithExpressRouteCircuit {
            /**
             * Specifies expressRouteCircuit.
             * @param expressRouteCircuit The ExpressRouteCircuit
             * @return the next update stage
             */
            Update withExpressRouteCircuit(ExpressRouteCircuitReference expressRouteCircuit);
        }

        /**
         * The stage of the expressroutecrossconnection update allowing to specify PeeringLocation.
         */
        interface WithPeeringLocation {
            /**
             * Specifies peeringLocation.
             * @param peeringLocation The peering location of the ExpressRoute circuit
             * @return the next update stage
             */
            Update withPeeringLocation(String peeringLocation);
        }

        /**
         * The stage of the expressroutecrossconnection update allowing to specify Peerings.
         */
        interface WithPeerings {
            /**
             * Specifies peerings.
             * @param peerings The list of peerings
             * @return the next update stage
             */
            Update withPeerings(List<ExpressRouteCrossConnectionPeeringInner> peerings);
        }

        /**
         * The stage of the expressroutecrossconnection update allowing to specify ServiceProviderNotes.
         */
        interface WithServiceProviderNotes {
            /**
             * Specifies serviceProviderNotes.
             * @param serviceProviderNotes Additional read only notes set by the connectivity provider
             * @return the next update stage
             */
            Update withServiceProviderNotes(String serviceProviderNotes);
        }

        /**
         * The stage of the expressroutecrossconnection update allowing to specify ServiceProviderProvisioningState.
         */
        interface WithServiceProviderProvisioningState {
            /**
             * Specifies serviceProviderProvisioningState.
             * @param serviceProviderProvisioningState The provisioning state of the circuit in the connectivity provider system. Possible values are 'NotProvisioned', 'Provisioning', 'Provisioned'. Possible values include: 'NotProvisioned', 'Provisioning', 'Provisioned', 'Deprovisioning'
             * @return the next update stage
             */
            Update withServiceProviderProvisioningState(ServiceProviderProvisioningState serviceProviderProvisioningState);
        }

    }
}
