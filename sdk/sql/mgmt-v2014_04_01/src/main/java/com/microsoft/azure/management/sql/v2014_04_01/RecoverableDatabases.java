/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01;

import rx.Observable;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.RecoverableDatabasesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing RecoverableDatabases.
 */
public interface RecoverableDatabases extends HasInner<RecoverableDatabasesInner> {
    /**
     * Gets a recoverable database, which is a resource representing a database's geo backup.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecoverableDatabase> getAsync(String resourceGroupName, String serverName, String databaseName);

    /**
     * Gets a list of recoverable databases.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecoverableDatabase> listByServerAsync(String resourceGroupName, String serverName);

}
