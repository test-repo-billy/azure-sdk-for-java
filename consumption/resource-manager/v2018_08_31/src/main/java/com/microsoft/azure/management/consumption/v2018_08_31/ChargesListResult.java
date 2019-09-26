/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_08_31;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.consumption.v2018_08_31.implementation.ConsumptionManager;
import com.microsoft.azure.management.consumption.v2018_08_31.implementation.ChargesListResultInner;
import com.microsoft.azure.management.consumption.v2018_08_31.implementation.ChargeSummaryInner;
import java.util.List;

/**
 * Type representing ChargesListResult.
 */
public interface ChargesListResult extends HasInner<ChargesListResultInner>, HasManager<ConsumptionManager> {
    /**
     * @return the value value.
     */
    List<ChargeSummaryInner> value();

}
