// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/**
 * Resource collection API of LoadBalancerNetworkInterfaces.
 */
public interface LoadBalancerNetworkInterfaces {
    /**
     * Gets associated load balancer network interfaces.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return associated load balancer network interfaces as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NetworkInterface> list(String resourceGroupName, String loadBalancerName);

    /**
     * Gets associated load balancer network interfaces.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return associated load balancer network interfaces as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NetworkInterface> list(String resourceGroupName, String loadBalancerName, Context context);
}
