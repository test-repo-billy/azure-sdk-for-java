/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_03_31;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.consumption.v2018_03_31.implementation.ConsumptionManager;
import java.math.BigDecimal;
import org.joda.time.DateTime;
import java.util.UUID;
import com.microsoft.azure.management.consumption.v2018_03_31.implementation.ReservationRecommendationsModelInner;

/**
 * Type representing ReservationRecommendationsModel.
 */
public interface ReservationRecommendationsModel extends HasInner<ReservationRecommendationsModelInner>, Resource, GroupableResourceCore<ConsumptionManager, ReservationRecommendationsModelInner>, HasResourceGroup, HasManager<ConsumptionManager> {
    /**
     * @return the costWithNoReservedInstances value.
     */
    BigDecimal costWithNoReservedInstances();

    /**
     * @return the firstUsageDate value.
     */
    DateTime firstUsageDate();

    /**
     * @return the lookBackPeriod value.
     */
    String lookBackPeriod();

    /**
     * @return the meterId value.
     */
    UUID meterId();

    /**
     * @return the netSavings value.
     */
    BigDecimal netSavings();

    /**
     * @return the recommendedQuantity value.
     */
    BigDecimal recommendedQuantity();

    /**
     * @return the scope value.
     */
    String scope();

    /**
     * @return the sku value.
     */
    String sku();

    /**
     * @return the term value.
     */
    String term();

    /**
     * @return the totalCostWithReservedInstances value.
     */
    BigDecimal totalCostWithReservedInstances();

}
