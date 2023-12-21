/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.storage.v2018_02_01.implementation.StorageManager;
import com.microsoft.azure.management.storage.v2018_02_01.implementation.ListAccountSasResponseInner;

/**
 * Type representing ListAccountSasResponse.
 */
public interface ListAccountSasResponse extends HasInner<ListAccountSasResponseInner>, HasManager<StorageManager> {
    /**
     * @return the accountSasToken value.
     */
    String accountSasToken();

}
