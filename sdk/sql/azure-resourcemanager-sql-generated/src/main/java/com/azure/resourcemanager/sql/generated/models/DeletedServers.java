// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of DeletedServers.
 */
public interface DeletedServers {
    /**
     * Gets a list of all deleted servers in a subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all deleted servers in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DeletedServer> list();

    /**
     * Gets a list of all deleted servers in a subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all deleted servers in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DeletedServer> list(Context context);

    /**
     * Gets a deleted server.
     * 
     * @param locationName The name of the region where the resource is located.
     * @param deletedServerName The name of the deleted server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted server along with {@link Response}.
     */
    Response<DeletedServer> getWithResponse(String locationName, String deletedServerName, Context context);

    /**
     * Gets a deleted server.
     * 
     * @param locationName The name of the region where the resource is located.
     * @param deletedServerName The name of the deleted server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted server.
     */
    DeletedServer get(String locationName, String deletedServerName);

    /**
     * Gets a list of deleted servers for a location.
     * 
     * @param locationName The name of the region where the resource is located.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of deleted servers for a location as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DeletedServer> listByLocation(String locationName);

    /**
     * Gets a list of deleted servers for a location.
     * 
     * @param locationName The name of the region where the resource is located.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of deleted servers for a location as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DeletedServer> listByLocation(String locationName, Context context);

    /**
     * Recovers a deleted server.
     * 
     * @param locationName The name of the region where the resource is located.
     * @param deletedServerName The name of the deleted server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted server.
     */
    DeletedServer recover(String locationName, String deletedServerName);

    /**
     * Recovers a deleted server.
     * 
     * @param locationName The name of the region where the resource is located.
     * @param deletedServerName The name of the deleted server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted server.
     */
    DeletedServer recover(String locationName, String deletedServerName, Context context);
}
