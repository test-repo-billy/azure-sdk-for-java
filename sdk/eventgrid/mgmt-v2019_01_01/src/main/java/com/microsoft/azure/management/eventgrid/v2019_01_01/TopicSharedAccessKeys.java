/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2019_01_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.eventgrid.v2019_01_01.implementation.EventGridManager;
import com.microsoft.azure.management.eventgrid.v2019_01_01.implementation.TopicSharedAccessKeysInner;

/**
 * Type representing TopicSharedAccessKeys.
 */
public interface TopicSharedAccessKeys extends HasInner<TopicSharedAccessKeysInner>, HasManager<EventGridManager> {
    /**
     * @return the key1 value.
     */
    String key1();

    /**
     * @return the key2 value.
     */
    String key2();

}
