// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of Connectors.
 */
public interface Connectors {
    /**
     * Cloud accounts connectors of a subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return for a subscription, list of all cloud account connectors and their settings as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<ConnectorSetting> list();

    /**
     * Cloud accounts connectors of a subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return for a subscription, list of all cloud account connectors and their settings as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<ConnectorSetting> list(Context context);

    /**
     * Details of a specific cloud account connector.
     * 
     * @param connectorName Name of the cloud account connector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the connector setting along with {@link Response}.
     */
    Response<ConnectorSetting> getWithResponse(String connectorName, Context context);

    /**
     * Details of a specific cloud account connector.
     * 
     * @param connectorName Name of the cloud account connector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the connector setting.
     */
    ConnectorSetting get(String connectorName);

    /**
     * Delete a cloud account connector from a subscription.
     * 
     * @param connectorName Name of the cloud account connector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String connectorName, Context context);

    /**
     * Delete a cloud account connector from a subscription.
     * 
     * @param connectorName Name of the cloud account connector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String connectorName);

    /**
     * Details of a specific cloud account connector.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the connector setting along with {@link Response}.
     */
    ConnectorSetting getById(String id);

    /**
     * Details of a specific cloud account connector.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the connector setting along with {@link Response}.
     */
    Response<ConnectorSetting> getByIdWithResponse(String id, Context context);

    /**
     * Delete a cloud account connector from a subscription.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a cloud account connector from a subscription.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ConnectorSetting resource.
     * 
     * @param name resource name.
     * @return the first stage of the new ConnectorSetting definition.
     */
    ConnectorSetting.DefinitionStages.Blank define(String name);
}
