/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.eventgrid.v2020_06_01.implementation.EventGridManager;
import java.util.List;
import com.microsoft.azure.management.eventgrid.v2020_06_01.implementation.PrivateEndpointConnectionInner;
import com.microsoft.azure.management.eventgrid.v2020_06_01.implementation.DomainInner;

/**
 * Type representing Domain.
 */
public interface Domain extends HasInner<DomainInner>, Resource, GroupableResourceCore<EventGridManager, DomainInner>, HasResourceGroup, Refreshable<Domain>, Updatable<Domain.Update>, HasManager<EventGridManager> {
    /**
     * @return the endpoint value.
     */
    String endpoint();

    /**
     * @return the inboundIpRules value.
     */
    List<InboundIpRule> inboundIpRules();

    /**
     * @return the inputSchema value.
     */
    InputSchema inputSchema();

    /**
     * @return the inputSchemaMapping value.
     */
    InputSchemaMapping inputSchemaMapping();

    /**
     * @return the metricResourceId value.
     */
    String metricResourceId();

    /**
     * @return the privateEndpointConnections value.
     */
    List<PrivateEndpointConnection> privateEndpointConnections();

    /**
     * @return the provisioningState value.
     */
    DomainProvisioningState provisioningState();

    /**
     * @return the publicNetworkAccess value.
     */
    PublicNetworkAccess publicNetworkAccess();

    /**
     * The entirety of the Domain definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Domain definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Domain definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Domain definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the domain definition allowing to specify InboundIpRules.
         */
        interface WithInboundIpRules {
            /**
             * Specifies inboundIpRules.
             * @param inboundIpRules This can be used to restrict traffic from specific IPs instead of all IPs. Note: These are considered only if PublicNetworkAccess is enabled
             * @return the next definition stage
             */
            WithCreate withInboundIpRules(List<InboundIpRule> inboundIpRules);
        }

        /**
         * The stage of the domain definition allowing to specify InputSchema.
         */
        interface WithInputSchema {
            /**
             * Specifies inputSchema.
             * @param inputSchema This determines the format that Event Grid should expect for incoming events published to the domain. Possible values include: 'EventGridSchema', 'CustomEventSchema', 'CloudEventSchemaV1_0'
             * @return the next definition stage
             */
            WithCreate withInputSchema(InputSchema inputSchema);
        }

        /**
         * The stage of the domain definition allowing to specify InputSchemaMapping.
         */
        interface WithInputSchemaMapping {
            /**
             * Specifies inputSchemaMapping.
             * @param inputSchemaMapping Information about the InputSchemaMapping which specified the info about mapping event payload
             * @return the next definition stage
             */
            WithCreate withInputSchemaMapping(InputSchemaMapping inputSchemaMapping);
        }

        /**
         * The stage of the domain definition allowing to specify PrivateEndpointConnections.
         */
        interface WithPrivateEndpointConnections {
            /**
             * Specifies privateEndpointConnections.
             * @param privateEndpointConnections List of private endpoint connections
             * @return the next definition stage
             */
            WithCreate withPrivateEndpointConnections(List<PrivateEndpointConnectionInner> privateEndpointConnections);
        }

        /**
         * The stage of the domain definition allowing to specify PublicNetworkAccess.
         */
        interface WithPublicNetworkAccess {
            /**
             * Specifies publicNetworkAccess.
             * @param publicNetworkAccess This determines if traffic is allowed over public network. By default it is enabled.
 You can further restrict to specific IPs by configuring &lt;seealso cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainProperties.InboundIpRules" /&gt;. Possible values include: 'Enabled', 'Disabled'
             * @return the next definition stage
             */
            WithCreate withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Domain>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithInboundIpRules, DefinitionStages.WithInputSchema, DefinitionStages.WithInputSchemaMapping, DefinitionStages.WithPrivateEndpointConnections, DefinitionStages.WithPublicNetworkAccess {
        }
    }
    /**
     * The template for a Domain update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Domain>, Resource.UpdateWithTags<Update>, UpdateStages.WithInboundIpRules, UpdateStages.WithPublicNetworkAccess {
    }

    /**
     * Grouping of Domain update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the domain update allowing to specify InboundIpRules.
         */
        interface WithInboundIpRules {
            /**
             * Specifies inboundIpRules.
             * @param inboundIpRules This can be used to restrict traffic from specific IPs instead of all IPs. Note: These are considered only if PublicNetworkAccess is enabled
             * @return the next update stage
             */
            Update withInboundIpRules(List<InboundIpRule> inboundIpRules);
        }

        /**
         * The stage of the domain update allowing to specify PublicNetworkAccess.
         */
        interface WithPublicNetworkAccess {
            /**
             * Specifies publicNetworkAccess.
             * @param publicNetworkAccess This determines if traffic is allowed over public network. By default it is enabled.
 You can further restrict to specific IPs by configuring &lt;seealso cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainUpdateParameterProperties.InboundIpRules" /&gt;. Possible values include: 'Enabled', 'Disabled'
             * @return the next update stage
             */
            Update withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }

    }
}
