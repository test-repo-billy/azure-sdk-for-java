// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of Linkers.
 */
public interface Linkers {
    /**
     * Returns list of Linkers which connects to the resource.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource to be connected.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Linker as paginated response with {@link PagedIterable}.
     */
    PagedIterable<LinkerResource> list(String resourceUri);

    /**
     * Returns list of Linkers which connects to the resource.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource to be connected.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Linker as paginated response with {@link PagedIterable}.
     */
    PagedIterable<LinkerResource> list(String resourceUri, Context context);

    /**
     * Returns Linker resource for a given name.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource to be connected.
     * @param linkerName The name Linker resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return linker of source and target resource along with {@link Response}.
     */
    Response<LinkerResource> getWithResponse(String resourceUri, String linkerName, Context context);

    /**
     * Returns Linker resource for a given name.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource to be connected.
     * @param linkerName The name Linker resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return linker of source and target resource.
     */
    LinkerResource get(String resourceUri, String linkerName);

    /**
     * Validate a link.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource to be connected.
     * @param linkerName The name Linker resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the validation operation result for a linker.
     */
    ValidateOperationResult validate(String resourceUri, String linkerName);

    /**
     * Validate a link.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource to be connected.
     * @param linkerName The name Linker resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the validation operation result for a linker.
     */
    ValidateOperationResult validate(String resourceUri, String linkerName, Context context);

    /**
     * list source configurations for a linker.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource to be connected.
     * @param linkerName The name Linker resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configurations for source resource, include appSettings, connectionString and serviceBindings along with
     * {@link Response}.
     */
    Response<SourceConfigurationResult> listConfigurationsWithResponse(String resourceUri, String linkerName,
        Context context);

    /**
     * list source configurations for a linker.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource to be connected.
     * @param linkerName The name Linker resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configurations for source resource, include appSettings, connectionString and serviceBindings.
     */
    SourceConfigurationResult listConfigurations(String resourceUri, String linkerName);

    /**
     * Returns Linker resource for a given name.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return linker of source and target resource along with {@link Response}.
     */
    LinkerResource getById(String id);

    /**
     * Returns Linker resource for a given name.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return linker of source and target resource along with {@link Response}.
     */
    Response<LinkerResource> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new LinkerResource resource.
     * 
     * @param name resource name.
     * @return the first stage of the new LinkerResource definition.
     */
    LinkerResource.DefinitionStages.Blank define(String name);
}
