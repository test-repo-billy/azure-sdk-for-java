// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.fluent.models.CertificateInner;

/**
 * Resource collection API of Certificates.
 */
public interface Certificates {
    /**
     * Get the Certificates in a given managed environment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Certificates in a given managed environment as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Certificate> list(String resourceGroupName, String environmentName);

    /**
     * Get the Certificates in a given managed environment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Certificates in a given managed environment as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Certificate> list(String resourceGroupName, String environmentName, Context context);

    /**
     * Get the specified Certificate.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param certificateName Name of the Certificate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Certificate along with {@link Response}.
     */
    Response<Certificate> getWithResponse(String resourceGroupName, String environmentName, String certificateName,
        Context context);

    /**
     * Get the specified Certificate.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param certificateName Name of the Certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Certificate.
     */
    Certificate get(String resourceGroupName, String environmentName, String certificateName);

    /**
     * Create or Update a Certificate.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param certificateName Name of the Certificate.
     * @param certificateEnvelope Certificate to be created or updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return certificate used for Custom Domain bindings of Container Apps in a Managed Environment along with
     * {@link Response}.
     */
    Response<Certificate> createOrUpdateWithResponse(String resourceGroupName, String environmentName,
        String certificateName, CertificateInner certificateEnvelope, Context context);

    /**
     * Create or Update a Certificate.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param certificateName Name of the Certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return certificate used for Custom Domain bindings of Container Apps in a Managed Environment.
     */
    Certificate createOrUpdate(String resourceGroupName, String environmentName, String certificateName);

    /**
     * Deletes the specified Certificate.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param certificateName Name of the Certificate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String environmentName, String certificateName,
        Context context);

    /**
     * Deletes the specified Certificate.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param certificateName Name of the Certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String environmentName, String certificateName);

    /**
     * Update properties of a certificate
     * 
     * Patches a certificate. Currently only patching of tags is supported.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param certificateName Name of the Certificate.
     * @param certificateEnvelope Properties of a certificate that need to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return certificate used for Custom Domain bindings of Container Apps in a Managed Environment along with
     * {@link Response}.
     */
    Response<Certificate> updateWithResponse(String resourceGroupName, String environmentName, String certificateName,
        CertificatePatch certificateEnvelope, Context context);

    /**
     * Update properties of a certificate
     * 
     * Patches a certificate. Currently only patching of tags is supported.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param certificateName Name of the Certificate.
     * @param certificateEnvelope Properties of a certificate that need to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return certificate used for Custom Domain bindings of Container Apps in a Managed Environment.
     */
    Certificate update(String resourceGroupName, String environmentName, String certificateName,
        CertificatePatch certificateEnvelope);
}
