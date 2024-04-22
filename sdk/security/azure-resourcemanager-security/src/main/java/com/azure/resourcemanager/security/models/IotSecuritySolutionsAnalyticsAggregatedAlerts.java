// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of IotSecuritySolutionsAnalyticsAggregatedAlerts.
 */
public interface IotSecuritySolutionsAnalyticsAggregatedAlerts {
    /**
     * Use this method to get the aggregated alert list of yours IoT Security solution.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param solutionName The name of the IoT Security solution.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IoT Security solution aggregated alert data as paginated response with {@link PagedIterable}.
     */
    PagedIterable<IoTSecurityAggregatedAlert> list(String resourceGroupName, String solutionName);

    /**
     * Use this method to get the aggregated alert list of yours IoT Security solution.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param solutionName The name of the IoT Security solution.
     * @param top Number of results to retrieve.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IoT Security solution aggregated alert data as paginated response with {@link PagedIterable}.
     */
    PagedIterable<IoTSecurityAggregatedAlert> list(String resourceGroupName, String solutionName, Integer top,
        Context context);

    /**
     * Use this method to get a single the aggregated alert of yours IoT Security solution. This aggregation is
     * performed by alert name.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param solutionName The name of the IoT Security solution.
     * @param aggregatedAlertName Identifier of the aggregated alert.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security Solution Aggregated Alert information along with {@link Response}.
     */
    Response<IoTSecurityAggregatedAlert> getWithResponse(String resourceGroupName, String solutionName,
        String aggregatedAlertName, Context context);

    /**
     * Use this method to get a single the aggregated alert of yours IoT Security solution. This aggregation is
     * performed by alert name.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param solutionName The name of the IoT Security solution.
     * @param aggregatedAlertName Identifier of the aggregated alert.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security Solution Aggregated Alert information.
     */
    IoTSecurityAggregatedAlert get(String resourceGroupName, String solutionName, String aggregatedAlertName);

    /**
     * Use this method to dismiss an aggregated IoT Security Solution Alert.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param solutionName The name of the IoT Security solution.
     * @param aggregatedAlertName Identifier of the aggregated alert.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> dismissWithResponse(String resourceGroupName, String solutionName, String aggregatedAlertName,
        Context context);

    /**
     * Use this method to dismiss an aggregated IoT Security Solution Alert.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param solutionName The name of the IoT Security solution.
     * @param aggregatedAlertName Identifier of the aggregated alert.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void dismiss(String resourceGroupName, String solutionName, String aggregatedAlertName);
}
