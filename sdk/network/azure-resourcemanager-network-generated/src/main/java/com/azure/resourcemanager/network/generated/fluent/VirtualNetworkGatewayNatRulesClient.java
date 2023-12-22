// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkGatewayNatRuleInner;

/**
 * An instance of this class provides access to all the operations defined in VirtualNetworkGatewayNatRulesClient.
 */
public interface VirtualNetworkGatewayNatRulesClient {
    /**
     * Retrieves the details of a nat rule.
     * 
     * @param resourceGroupName The resource group name of the Virtual Network Gateway.
     * @param virtualNetworkGatewayName The name of the gateway.
     * @param natRuleName The name of the nat rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualNetworkGatewayNatRule Resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VirtualNetworkGatewayNatRuleInner> getWithResponse(String resourceGroupName,
        String virtualNetworkGatewayName, String natRuleName, Context context);

    /**
     * Retrieves the details of a nat rule.
     * 
     * @param resourceGroupName The resource group name of the Virtual Network Gateway.
     * @param virtualNetworkGatewayName The name of the gateway.
     * @param natRuleName The name of the nat rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualNetworkGatewayNatRule Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualNetworkGatewayNatRuleInner get(String resourceGroupName, String virtualNetworkGatewayName,
        String natRuleName);

    /**
     * Creates a nat rule to a scalable virtual network gateway if it doesn't exist else updates the existing nat rules.
     * 
     * @param resourceGroupName The resource group name of the Virtual Network Gateway.
     * @param virtualNetworkGatewayName The name of the gateway.
     * @param natRuleName The name of the nat rule.
     * @param natRuleParameters Parameters supplied to create or Update a Nat Rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of virtualNetworkGatewayNatRule Resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualNetworkGatewayNatRuleInner>, VirtualNetworkGatewayNatRuleInner> beginCreateOrUpdate(
        String resourceGroupName, String virtualNetworkGatewayName, String natRuleName,
        VirtualNetworkGatewayNatRuleInner natRuleParameters);

    /**
     * Creates a nat rule to a scalable virtual network gateway if it doesn't exist else updates the existing nat rules.
     * 
     * @param resourceGroupName The resource group name of the Virtual Network Gateway.
     * @param virtualNetworkGatewayName The name of the gateway.
     * @param natRuleName The name of the nat rule.
     * @param natRuleParameters Parameters supplied to create or Update a Nat Rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of virtualNetworkGatewayNatRule Resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualNetworkGatewayNatRuleInner>, VirtualNetworkGatewayNatRuleInner> beginCreateOrUpdate(
        String resourceGroupName, String virtualNetworkGatewayName, String natRuleName,
        VirtualNetworkGatewayNatRuleInner natRuleParameters, Context context);

    /**
     * Creates a nat rule to a scalable virtual network gateway if it doesn't exist else updates the existing nat rules.
     * 
     * @param resourceGroupName The resource group name of the Virtual Network Gateway.
     * @param virtualNetworkGatewayName The name of the gateway.
     * @param natRuleName The name of the nat rule.
     * @param natRuleParameters Parameters supplied to create or Update a Nat Rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualNetworkGatewayNatRule Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualNetworkGatewayNatRuleInner createOrUpdate(String resourceGroupName, String virtualNetworkGatewayName,
        String natRuleName, VirtualNetworkGatewayNatRuleInner natRuleParameters);

    /**
     * Creates a nat rule to a scalable virtual network gateway if it doesn't exist else updates the existing nat rules.
     * 
     * @param resourceGroupName The resource group name of the Virtual Network Gateway.
     * @param virtualNetworkGatewayName The name of the gateway.
     * @param natRuleName The name of the nat rule.
     * @param natRuleParameters Parameters supplied to create or Update a Nat Rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualNetworkGatewayNatRule Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualNetworkGatewayNatRuleInner createOrUpdate(String resourceGroupName, String virtualNetworkGatewayName,
        String natRuleName, VirtualNetworkGatewayNatRuleInner natRuleParameters, Context context);

    /**
     * Deletes a nat rule.
     * 
     * @param resourceGroupName The resource group name of the Virtual Network Gateway.
     * @param virtualNetworkGatewayName The name of the gateway.
     * @param natRuleName The name of the nat rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String virtualNetworkGatewayName,
        String natRuleName);

    /**
     * Deletes a nat rule.
     * 
     * @param resourceGroupName The resource group name of the Virtual Network Gateway.
     * @param virtualNetworkGatewayName The name of the gateway.
     * @param natRuleName The name of the nat rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String virtualNetworkGatewayName,
        String natRuleName, Context context);

    /**
     * Deletes a nat rule.
     * 
     * @param resourceGroupName The resource group name of the Virtual Network Gateway.
     * @param virtualNetworkGatewayName The name of the gateway.
     * @param natRuleName The name of the nat rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualNetworkGatewayName, String natRuleName);

    /**
     * Deletes a nat rule.
     * 
     * @param resourceGroupName The resource group name of the Virtual Network Gateway.
     * @param virtualNetworkGatewayName The name of the gateway.
     * @param natRuleName The name of the nat rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualNetworkGatewayName, String natRuleName, Context context);

    /**
     * Retrieves all nat rules for a particular virtual network gateway.
     * 
     * @param resourceGroupName The resource group name of the virtual network gateway.
     * @param virtualNetworkGatewayName The name of the gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list all nat rules to a virtual network gateway as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualNetworkGatewayNatRuleInner> listByVirtualNetworkGateway(String resourceGroupName,
        String virtualNetworkGatewayName);

    /**
     * Retrieves all nat rules for a particular virtual network gateway.
     * 
     * @param resourceGroupName The resource group name of the virtual network gateway.
     * @param virtualNetworkGatewayName The name of the gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list all nat rules to a virtual network gateway as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualNetworkGatewayNatRuleInner> listByVirtualNetworkGateway(String resourceGroupName,
        String virtualNetworkGatewayName, Context context);
}
