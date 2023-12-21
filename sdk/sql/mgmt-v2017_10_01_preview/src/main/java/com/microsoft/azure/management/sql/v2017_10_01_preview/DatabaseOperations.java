/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_10_01_preview;

import rx.Observable;
import rx.Completable;
import java.util.UUID;
import com.microsoft.azure.management.sql.v2017_10_01_preview.implementation.DatabaseOperationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing DatabaseOperations.
 */
public interface DatabaseOperations extends HasInner<DatabaseOperationsInner> {
    /**
     * Cancels the asynchronous operation on the database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param operationId The operation identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable cancelAsync(String resourceGroupName, String serverName, String databaseName, UUID operationId);

    /**
     * Gets a list of operations performed on the database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DatabaseOperation> listByDatabaseAsync(final String resourceGroupName, final String serverName, final String databaseName);

}
