/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hanaonazure.v2017_11_03_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.hanaonazure.v2017_11_03_preview.implementation.HanaOnAzureManager;
import com.microsoft.azure.management.hanaonazure.v2017_11_03_preview.implementation.OperationInner;

/**
 * Type representing Operation.
 */
public interface Operation extends HasInner<OperationInner>, HasManager<HanaOnAzureManager> {
    /**
     * @return the display value.
     */
    Display display();

    /**
     * @return the name value.
     */
    String name();

}
