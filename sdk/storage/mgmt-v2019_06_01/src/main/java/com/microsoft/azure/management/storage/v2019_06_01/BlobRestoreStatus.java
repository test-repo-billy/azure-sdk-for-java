/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.storage.v2019_06_01.implementation.StorageManager;
import com.microsoft.azure.management.storage.v2019_06_01.implementation.BlobRestoreStatusInner;

/**
 * Type representing BlobRestoreStatus.
 */
public interface BlobRestoreStatus extends HasInner<BlobRestoreStatusInner>, HasManager<StorageManager> {
    /**
     * @return the failureReason value.
     */
    String failureReason();

    /**
     * @return the parameters value.
     */
    BlobRestoreParameters parameters();

    /**
     * @return the restoreId value.
     */
    String restoreId();

    /**
     * @return the status value.
     */
    BlobRestoreProgressStatus status();

}
