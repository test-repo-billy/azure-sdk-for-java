// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of ResourceProviders.
 */
public interface ResourceProviders {
    /**
     * Get details of a single job execution.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName Job Name.
     * @param jobExecutionName Job execution name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of a single job execution along with {@link Response}.
     */
    Response<JobExecution> jobExecutionWithResponse(String resourceGroupName, String jobName, String jobExecutionName,
        Context context);

    /**
     * Get details of a single job execution.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName Job Name.
     * @param jobExecutionName Job execution name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of a single job execution.
     */
    JobExecution jobExecution(String resourceGroupName, String jobName, String jobExecutionName);

    /**
     * Get the verification id of a subscription used for verifying custom domains.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the verification id of a subscription used for verifying custom domains along with {@link Response}.
     */
    Response<String> getCustomDomainVerificationIdWithResponse(Context context);

    /**
     * Get the verification id of a subscription used for verifying custom domains.
     * 
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the verification id of a subscription used for verifying custom domains.
     */
    String getCustomDomainVerificationId();
}
