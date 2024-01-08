// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of LedgerDigestUploadsOperations.
 */
public interface LedgerDigestUploadsOperations {
    /**
     * Gets the current ledger digest upload configuration for a database.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param ledgerDigestUploads The ledgerDigestUploads parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current ledger digest upload configuration for a database along with {@link Response}.
     */
    Response<LedgerDigestUploads> getWithResponse(String resourceGroupName, String serverName, String databaseName,
        LedgerDigestUploadsName ledgerDigestUploads, Context context);

    /**
     * Gets the current ledger digest upload configuration for a database.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param ledgerDigestUploads The ledgerDigestUploads parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current ledger digest upload configuration for a database.
     */
    LedgerDigestUploads get(String resourceGroupName, String serverName, String databaseName,
        LedgerDigestUploadsName ledgerDigestUploads);

    /**
     * Gets all ledger digest upload settings on a database.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all ledger digest upload settings on a database as paginated response with {@link PagedIterable}.
     */
    PagedIterable<LedgerDigestUploads> listByDatabase(String resourceGroupName, String serverName, String databaseName);

    /**
     * Gets all ledger digest upload settings on a database.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all ledger digest upload settings on a database as paginated response with {@link PagedIterable}.
     */
    PagedIterable<LedgerDigestUploads> listByDatabase(String resourceGroupName, String serverName, String databaseName,
        Context context);

    /**
     * Disables uploading ledger digests to an Azure Storage account or an Azure Confidential Ledger instance.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param ledgerDigestUploads The ledgerDigestUploads parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure SQL Database ledger digest upload settings.
     */
    LedgerDigestUploads disable(String resourceGroupName, String serverName, String databaseName,
        LedgerDigestUploadsName ledgerDigestUploads);

    /**
     * Disables uploading ledger digests to an Azure Storage account or an Azure Confidential Ledger instance.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param ledgerDigestUploads The ledgerDigestUploads parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure SQL Database ledger digest upload settings.
     */
    LedgerDigestUploads disable(String resourceGroupName, String serverName, String databaseName,
        LedgerDigestUploadsName ledgerDigestUploads, Context context);

    /**
     * Gets the current ledger digest upload configuration for a database.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current ledger digest upload configuration for a database along with {@link Response}.
     */
    LedgerDigestUploads getById(String id);

    /**
     * Gets the current ledger digest upload configuration for a database.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current ledger digest upload configuration for a database along with {@link Response}.
     */
    Response<LedgerDigestUploads> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new LedgerDigestUploads resource.
     * 
     * @param name resource name.
     * @return the first stage of the new LedgerDigestUploads definition.
     */
    LedgerDigestUploads.DefinitionStages.Blank define(LedgerDigestUploadsName name);
}
