/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_06_01.implementation.NetworkManager;
import com.microsoft.azure.management.network.v2019_06_01.implementation.NextHopResultInner;

/**
 * Type representing NextHopResult.
 */
public interface NextHopResult extends HasInner<NextHopResultInner>, HasManager<NetworkManager> {
    /**
     * @return the nextHopIpAddress value.
     */
    String nextHopIpAddress();

    /**
     * @return the nextHopType value.
     */
    NextHopType nextHopType();

    /**
     * @return the routeTableId value.
     */
    String routeTableId();

}
