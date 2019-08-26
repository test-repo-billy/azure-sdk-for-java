/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.implementation.ReplicationRecoveryServicesProvidersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ReplicationRecoveryServicesProviders.
 */
public interface ReplicationRecoveryServicesProviders extends HasInner<ReplicationRecoveryServicesProvidersInner> {
    /**
     * Refresh details from the recovery services provider.
     * The operation to refresh the information from the recovery services provider.
     *
     * @param fabricName Fabric name.
     * @param providerName Recovery services provider name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecoveryServicesProvider> refreshProviderAsync(String fabricName, String providerName);

    /**
     * Deletes provider from fabric. Note: Deleting provider for any fabric other than SingleHost is unsupported. To maintain backward compatibility for released clients the object "deleteRspInput" is used (if the object is empty we assume that it is old client and continue the old behavior).
     * The operation to removes/delete(unregister) a recovery services provider from the vault.
     *
     * @param fabricName Fabric name.
     * @param providerName Recovery services provider name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String fabricName, String providerName);

    /**
     * Gets the list of registered recovery services providers in the vault. This is a view only api.
     * Lists the registered recovery services providers in the vault.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecoveryServicesProvider> listAsync();

    /**
     * Gets the details of a recovery services provider.
     * Gets the details of registered recovery services provider.
     *
     * @param fabricName Fabric name.
     * @param providerName Recovery services provider name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecoveryServicesProvider> getAsync(String fabricName, String providerName);

    /**
     * Gets the list of registered recovery services providers for the fabric.
     * Lists the registered recovery services providers for the specified fabric.
     *
     * @param fabricName Fabric name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecoveryServicesProvider> listByReplicationFabricsAsync(final String fabricName);

    /**
     * Purges recovery service provider from fabric.
     * The operation to purge(force delete) a recovery services provider from the vault.
     *
     * @param fabricName Fabric name.
     * @param providerName Recovery services provider name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable purgeAsync(String fabricName, String providerName);

}
