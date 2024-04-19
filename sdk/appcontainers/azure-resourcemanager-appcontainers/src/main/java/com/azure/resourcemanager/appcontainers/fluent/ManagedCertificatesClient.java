// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.appcontainers.fluent.models.ManagedCertificateInner;
import com.azure.resourcemanager.appcontainers.models.ManagedCertificatePatch;

/**
 * An instance of this class provides access to all the operations defined in ManagedCertificatesClient.
 */
public interface ManagedCertificatesClient {
    /**
     * Get the specified Managed Certificate.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param managedCertificateName Name of the Managed Certificate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Managed Certificate along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ManagedCertificateInner> getWithResponse(String resourceGroupName, String environmentName,
        String managedCertificateName, Context context);

    /**
     * Get the specified Managed Certificate.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param managedCertificateName Name of the Managed Certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Managed Certificate.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedCertificateInner get(String resourceGroupName, String environmentName, String managedCertificateName);

    /**
     * Create or Update a Managed Certificate.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param managedCertificateName Name of the Managed Certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server on
     * status code 400.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of managed certificates used for Custom Domain bindings of Container
     * Apps in a Managed Environment.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ManagedCertificateInner>, ManagedCertificateInner>
        beginCreateOrUpdate(String resourceGroupName, String environmentName, String managedCertificateName);

    /**
     * Create or Update a Managed Certificate.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param managedCertificateName Name of the Managed Certificate.
     * @param managedCertificateEnvelope Managed Certificate to be created or updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server on
     * status code 400.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of managed certificates used for Custom Domain bindings of Container
     * Apps in a Managed Environment.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ManagedCertificateInner>, ManagedCertificateInner> beginCreateOrUpdate(
        String resourceGroupName, String environmentName, String managedCertificateName,
        ManagedCertificateInner managedCertificateEnvelope, Context context);

    /**
     * Create or Update a Managed Certificate.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param managedCertificateName Name of the Managed Certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server on
     * status code 400.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed certificates used for Custom Domain bindings of Container Apps in a Managed Environment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedCertificateInner createOrUpdate(String resourceGroupName, String environmentName,
        String managedCertificateName);

    /**
     * Create or Update a Managed Certificate.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param managedCertificateName Name of the Managed Certificate.
     * @param managedCertificateEnvelope Managed Certificate to be created or updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server on
     * status code 400.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed certificates used for Custom Domain bindings of Container Apps in a Managed Environment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedCertificateInner createOrUpdate(String resourceGroupName, String environmentName,
        String managedCertificateName, ManagedCertificateInner managedCertificateEnvelope, Context context);

    /**
     * Deletes the specified Managed Certificate.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param managedCertificateName Name of the Managed Certificate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String environmentName, String managedCertificateName,
        Context context);

    /**
     * Deletes the specified Managed Certificate.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param managedCertificateName Name of the Managed Certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String environmentName, String managedCertificateName);

    /**
     * Update tags of a managed certificate
     * 
     * Patches a managed certificate. Oly patching of tags is supported.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param managedCertificateName Name of the Managed Certificate.
     * @param managedCertificateEnvelope Properties of a managed certificate that need to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed certificates used for Custom Domain bindings of Container Apps in a Managed Environment along
     * with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ManagedCertificateInner> updateWithResponse(String resourceGroupName, String environmentName,
        String managedCertificateName, ManagedCertificatePatch managedCertificateEnvelope, Context context);

    /**
     * Update tags of a managed certificate
     * 
     * Patches a managed certificate. Oly patching of tags is supported.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param managedCertificateName Name of the Managed Certificate.
     * @param managedCertificateEnvelope Properties of a managed certificate that need to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed certificates used for Custom Domain bindings of Container Apps in a Managed Environment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedCertificateInner update(String resourceGroupName, String environmentName, String managedCertificateName,
        ManagedCertificatePatch managedCertificateEnvelope);

    /**
     * Get the Managed Certificates in a given managed environment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Managed Certificates in a given managed environment as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedCertificateInner> list(String resourceGroupName, String environmentName);

    /**
     * Get the Managed Certificates in a given managed environment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Managed Certificates in a given managed environment as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedCertificateInner> list(String resourceGroupName, String environmentName, Context context);
}
