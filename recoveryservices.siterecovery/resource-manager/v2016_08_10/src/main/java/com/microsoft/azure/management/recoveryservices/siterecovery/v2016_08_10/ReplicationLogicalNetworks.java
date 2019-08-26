/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import rx.Observable;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.implementation.ReplicationLogicalNetworksInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ReplicationLogicalNetworks.
 */
public interface ReplicationLogicalNetworks extends HasInner<ReplicationLogicalNetworksInner> {
    /**
     * Gets a logical network with specified server id and logical network name.
     * Gets the details of a logical network.
     *
     * @param fabricName Server Id.
     * @param logicalNetworkName Logical network name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LogicalNetwork> getAsync(String fabricName, String logicalNetworkName);

    /**
     * Gets the list of logical networks under a fabric.
     * Lists all the logical networks of the Azure Site Recovery fabric.
     *
     * @param fabricName Server Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LogicalNetwork> listByReplicationFabricsAsync(final String fabricName);

}
