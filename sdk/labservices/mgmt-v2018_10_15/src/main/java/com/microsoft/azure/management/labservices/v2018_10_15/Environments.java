/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.labservices.v2018_10_15;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.labservices.v2018_10_15.implementation.EnvironmentsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Environments.
 */
public interface Environments extends SupportsCreating<Environment.DefinitionStages.Blank>, HasInner<EnvironmentsInner> {
    /**
     * Claims the environment and assigns it to the user.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @param environmentSettingName The name of the environment Setting.
     * @param environmentName The name of the environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable claimAsync(String resourceGroupName, String labAccountName, String labName, String environmentSettingName, String environmentName);

    /**
     * Resets the user password on an environment This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @param environmentSettingName The name of the environment Setting.
     * @param environmentName The name of the environment.
     * @param resetPasswordPayload Represents the payload for resetting passwords.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable resetPasswordAsync(String resourceGroupName, String labAccountName, String labName, String environmentSettingName, String environmentName, ResetPasswordPayload resetPasswordPayload);

    /**
     * Starts an environment by starting all resources inside the environment. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @param environmentSettingName The name of the environment Setting.
     * @param environmentName The name of the environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable startAsync(String resourceGroupName, String labAccountName, String labName, String environmentSettingName, String environmentName);

    /**
     * Stops an environment by stopping all resources inside the environment This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @param environmentSettingName The name of the environment Setting.
     * @param environmentName The name of the environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable stopAsync(String resourceGroupName, String labAccountName, String labName, String environmentSettingName, String environmentName);

    /**
     * Get environment.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @param environmentSettingName The name of the environment Setting.
     * @param environmentName The name of the environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Environment> getAsync(String resourceGroupName, String labAccountName, String labName, String environmentSettingName, String environmentName);

    /**
     * List environments in a given environment setting.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @param environmentSettingName The name of the environment Setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Environment> listAsync(final String resourceGroupName, final String labAccountName, final String labName, final String environmentSettingName);

    /**
     * Delete environment. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @param environmentSettingName The name of the environment Setting.
     * @param environmentName The name of the environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String labAccountName, String labName, String environmentSettingName, String environmentName);

}
