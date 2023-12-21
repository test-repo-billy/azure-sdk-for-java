/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2018_09_07_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.kusto.v2018_09_07_preview.implementation.KustoManager;
import com.microsoft.azure.management.kusto.v2018_09_07_preview.implementation.CheckNameResultInner;

/**
 * Type representing CheckNameResult.
 */
public interface CheckNameResult extends HasInner<CheckNameResultInner>, HasManager<KustoManager> {
    /**
     * @return the message value.
     */
    String message();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the nameAvailable value.
     */
    Boolean nameAvailable();

}
