// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.Context;

/**
 * Resource collection API of DatabaseEncryptionProtectors.
 */
public interface DatabaseEncryptionProtectors {
    /**
     * Revalidates an existing encryption protector for a particular database.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param encryptionProtectorName The name of the encryption protector to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void revalidate(String resourceGroupName, String serverName, String databaseName,
        EncryptionProtectorName encryptionProtectorName);

    /**
     * Revalidates an existing encryption protector for a particular database.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param encryptionProtectorName The name of the encryption protector to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void revalidate(String resourceGroupName, String serverName, String databaseName,
        EncryptionProtectorName encryptionProtectorName, Context context);

    /**
     * Reverts an existing encryption protector for a particular database.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param encryptionProtectorName The name of the encryption protector to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void revert(String resourceGroupName, String serverName, String databaseName,
        EncryptionProtectorName encryptionProtectorName);

    /**
     * Reverts an existing encryption protector for a particular database.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param encryptionProtectorName The name of the encryption protector to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void revert(String resourceGroupName, String serverName, String databaseName,
        EncryptionProtectorName encryptionProtectorName, Context context);
}
