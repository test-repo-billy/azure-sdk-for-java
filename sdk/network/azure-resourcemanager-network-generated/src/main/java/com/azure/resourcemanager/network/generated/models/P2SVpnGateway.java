// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.P2SVpnGatewayInner;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of P2SVpnGateway.
 */
public interface P2SVpnGateway {
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
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the id property: Resource ID.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the virtualHub property: The VirtualHub to which the gateway belongs.
     * 
     * @return the virtualHub value.
     */
    SubResource virtualHub();

    /**
     * Gets the p2SConnectionConfigurations property: List of all p2s connection configurations of the gateway.
     * 
     * @return the p2SConnectionConfigurations value.
     */
    List<P2SConnectionConfiguration> p2SConnectionConfigurations();

    /**
     * Gets the provisioningState property: The provisioning state of the P2S VPN gateway resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the vpnGatewayScaleUnit property: The scale unit for this p2s vpn gateway.
     * 
     * @return the vpnGatewayScaleUnit value.
     */
    Integer vpnGatewayScaleUnit();

    /**
     * Gets the vpnServerConfiguration property: The VpnServerConfiguration to which the p2sVpnGateway is attached to.
     * 
     * @return the vpnServerConfiguration value.
     */
    SubResource vpnServerConfiguration();

    /**
     * Gets the vpnClientConnectionHealth property: All P2S VPN clients' connection health status.
     * 
     * @return the vpnClientConnectionHealth value.
     */
    VpnClientConnectionHealth vpnClientConnectionHealth();

    /**
     * Gets the customDnsServers property: List of all customer specified DNS servers IP addresses.
     * 
     * @return the customDnsServers value.
     */
    List<String> customDnsServers();

    /**
     * Gets the isRoutingPreferenceInternet property: Enable Routing Preference property for the Public IP Interface of
     * the P2SVpnGateway.
     * 
     * @return the isRoutingPreferenceInternet value.
     */
    Boolean isRoutingPreferenceInternet();

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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.P2SVpnGatewayInner object.
     * 
     * @return the inner object.
     */
    P2SVpnGatewayInner innerModel();

    /**
     * The entirety of the P2SVpnGateway definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The P2SVpnGateway definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the P2SVpnGateway definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the P2SVpnGateway definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /**
         * The stage of the P2SVpnGateway definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName The resource group name of the P2SVpnGateway.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the P2SVpnGateway definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithVirtualHub,
            DefinitionStages.WithP2SConnectionConfigurations, DefinitionStages.WithVpnGatewayScaleUnit,
            DefinitionStages.WithVpnServerConfiguration, DefinitionStages.WithCustomDnsServers,
            DefinitionStages.WithIsRoutingPreferenceInternet {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            P2SVpnGateway create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            P2SVpnGateway create(Context context);
        }

        /**
         * The stage of the P2SVpnGateway definition allowing to specify tags.
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
         * The stage of the P2SVpnGateway definition allowing to specify virtualHub.
         */
        interface WithVirtualHub {
            /**
             * Specifies the virtualHub property: The VirtualHub to which the gateway belongs..
             * 
             * @param virtualHub The VirtualHub to which the gateway belongs.
             * @return the next definition stage.
             */
            WithCreate withVirtualHub(SubResource virtualHub);
        }

        /**
         * The stage of the P2SVpnGateway definition allowing to specify p2SConnectionConfigurations.
         */
        interface WithP2SConnectionConfigurations {
            /**
             * Specifies the p2SConnectionConfigurations property: List of all p2s connection configurations of the
             * gateway..
             * 
             * @param p2SConnectionConfigurations List of all p2s connection configurations of the gateway.
             * @return the next definition stage.
             */
            WithCreate withP2SConnectionConfigurations(List<P2SConnectionConfiguration> p2SConnectionConfigurations);
        }

        /**
         * The stage of the P2SVpnGateway definition allowing to specify vpnGatewayScaleUnit.
         */
        interface WithVpnGatewayScaleUnit {
            /**
             * Specifies the vpnGatewayScaleUnit property: The scale unit for this p2s vpn gateway..
             * 
             * @param vpnGatewayScaleUnit The scale unit for this p2s vpn gateway.
             * @return the next definition stage.
             */
            WithCreate withVpnGatewayScaleUnit(Integer vpnGatewayScaleUnit);
        }

        /**
         * The stage of the P2SVpnGateway definition allowing to specify vpnServerConfiguration.
         */
        interface WithVpnServerConfiguration {
            /**
             * Specifies the vpnServerConfiguration property: The VpnServerConfiguration to which the p2sVpnGateway is
             * attached to..
             * 
             * @param vpnServerConfiguration The VpnServerConfiguration to which the p2sVpnGateway is attached to.
             * @return the next definition stage.
             */
            WithCreate withVpnServerConfiguration(SubResource vpnServerConfiguration);
        }

        /**
         * The stage of the P2SVpnGateway definition allowing to specify customDnsServers.
         */
        interface WithCustomDnsServers {
            /**
             * Specifies the customDnsServers property: List of all customer specified DNS servers IP addresses..
             * 
             * @param customDnsServers List of all customer specified DNS servers IP addresses.
             * @return the next definition stage.
             */
            WithCreate withCustomDnsServers(List<String> customDnsServers);
        }

        /**
         * The stage of the P2SVpnGateway definition allowing to specify isRoutingPreferenceInternet.
         */
        interface WithIsRoutingPreferenceInternet {
            /**
             * Specifies the isRoutingPreferenceInternet property: Enable Routing Preference property for the Public IP
             * Interface of the P2SVpnGateway..
             * 
             * @param isRoutingPreferenceInternet Enable Routing Preference property for the Public IP Interface of the
             * P2SVpnGateway.
             * @return the next definition stage.
             */
            WithCreate withIsRoutingPreferenceInternet(Boolean isRoutingPreferenceInternet);
        }
    }

    /**
     * Begins update for the P2SVpnGateway resource.
     * 
     * @return the stage of resource update.
     */
    P2SVpnGateway.Update update();

    /**
     * The template for P2SVpnGateway update.
     */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        P2SVpnGateway apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        P2SVpnGateway apply(Context context);
    }

    /**
     * The P2SVpnGateway update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the P2SVpnGateway update allowing to specify tags.
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
    P2SVpnGateway refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    P2SVpnGateway refresh(Context context);

    /**
     * Resets the primary of the p2s vpn gateway in the specified resource group.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnGateway Resource.
     */
    P2SVpnGateway reset();

    /**
     * Resets the primary of the p2s vpn gateway in the specified resource group.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnGateway Resource.
     */
    P2SVpnGateway reset(Context context);

    /**
     * Generates VPN profile for P2S client of the P2SVpnGateway in the specified resource group.
     * 
     * @param parameters Parameters supplied to the generate P2SVpnGateway VPN client package operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpn Profile Response for package generation.
     */
    VpnProfileResponse generateVpnProfile(P2SVpnProfileParameters parameters);

    /**
     * Generates VPN profile for P2S client of the P2SVpnGateway in the specified resource group.
     * 
     * @param parameters Parameters supplied to the generate P2SVpnGateway VPN client package operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpn Profile Response for package generation.
     */
    VpnProfileResponse generateVpnProfile(P2SVpnProfileParameters parameters, Context context);

    /**
     * Gets the connection health of P2S clients of the virtual wan P2SVpnGateway in the specified resource group.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the connection health of P2S clients of the virtual wan P2SVpnGateway in the specified resource group.
     */
    P2SVpnGateway getP2SVpnConnectionHealth();

    /**
     * Gets the connection health of P2S clients of the virtual wan P2SVpnGateway in the specified resource group.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the connection health of P2S clients of the virtual wan P2SVpnGateway in the specified resource group.
     */
    P2SVpnGateway getP2SVpnConnectionHealth(Context context);

    /**
     * Gets the sas url to get the connection health detail of P2S clients of the virtual wan P2SVpnGateway in the
     * specified resource group.
     * 
     * @param request Request parameters supplied to get p2s vpn connections detailed health.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sas url to get the connection health detail of P2S clients of the virtual wan P2SVpnGateway in the
     * specified resource group.
     */
    P2SVpnConnectionHealth getP2SVpnConnectionHealthDetailed(P2SVpnConnectionHealthRequest request);

    /**
     * Gets the sas url to get the connection health detail of P2S clients of the virtual wan P2SVpnGateway in the
     * specified resource group.
     * 
     * @param request Request parameters supplied to get p2s vpn connections detailed health.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sas url to get the connection health detail of P2S clients of the virtual wan P2SVpnGateway in the
     * specified resource group.
     */
    P2SVpnConnectionHealth getP2SVpnConnectionHealthDetailed(P2SVpnConnectionHealthRequest request, Context context);
}
