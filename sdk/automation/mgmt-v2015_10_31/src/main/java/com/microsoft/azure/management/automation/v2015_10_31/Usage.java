/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.automation.v2015_10_31.implementation.UsageInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.automation.v2015_10_31.implementation.AutomationManager;

/**
 * Type representing Usage.
 */
public interface Usage extends HasInner<UsageInner>, HasManager<AutomationManager> {
    /**
     * @return the currentValue value.
     */
    Double currentValue();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the limit value.
     */
    Long limit();

    /**
     * @return the name value.
     */
    UsageCounterName name();

    /**
     * @return the throttleStatus value.
     */
    String throttleStatus();

    /**
     * @return the unit value.
     */
    String unit();

}
