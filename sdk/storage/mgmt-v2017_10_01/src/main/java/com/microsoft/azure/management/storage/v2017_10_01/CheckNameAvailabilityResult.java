/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2017_10_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.storage.v2017_10_01.implementation.StorageManager;
import com.microsoft.azure.management.storage.v2017_10_01.implementation.CheckNameAvailabilityResultInner;

/**
 * Type representing CheckNameAvailabilityResult.
 */
public interface CheckNameAvailabilityResult extends HasInner<CheckNameAvailabilityResultInner>, HasManager<StorageManager> {
    /**
     * @return the message value.
     */
    String message();

    /**
     * @return the nameAvailable value.
     */
    Boolean nameAvailable();

    /**
     * @return the reason value.
     */
    Reason reason();

}
