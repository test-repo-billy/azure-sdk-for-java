/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2019_08_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.batch.v2019_08_01.implementation.ApplicationPackagesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ApplicationPackages.
 */
public interface ApplicationPackages extends SupportsCreating<ApplicationPackage.DefinitionStages.Blank>, HasInner<ApplicationPackagesInner> {
    /**
     * Activates the specified application package. This should be done after the `ApplicationPackage` was created and uploaded. This needs to be done before an `ApplicationPackage` can be used on Pools or Tasks.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationName The name of the application. This must be unique within the account.
     * @param versionName The version of the application.
     * @param format The format of the application package binary file.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApplicationPackage> activateAsync(String resourceGroupName, String accountName, String applicationName, String versionName, String format);

    /**
     * Gets information about the specified application package.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationName The name of the application. This must be unique within the account.
     * @param versionName The version of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApplicationPackage> getAsync(String resourceGroupName, String accountName, String applicationName, String versionName);

    /**
     * Lists all of the application packages in the specified application.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationName The name of the application. This must be unique within the account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApplicationPackage> listAsync(final String resourceGroupName, final String accountName, final String applicationName);

    /**
     * Deletes an application package record and its associated binary file.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationName The name of the application. This must be unique within the account.
     * @param versionName The version of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String accountName, String applicationName, String versionName);

}
