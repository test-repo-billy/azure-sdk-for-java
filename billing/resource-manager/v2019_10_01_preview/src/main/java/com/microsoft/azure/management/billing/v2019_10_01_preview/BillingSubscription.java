/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.BillingSubscriptionInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.BillingManager;
import java.util.UUID;

/**
 * Type representing BillingSubscription.
 */
public interface BillingSubscription extends HasInner<BillingSubscriptionInner>, HasManager<BillingManager> {
    /**
     * @return the billingProfileDisplayName value.
     */
    String billingProfileDisplayName();

    /**
     * @return the billingProfileId value.
     */
    String billingProfileId();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the invoiceSectionDisplayName value.
     */
    String invoiceSectionDisplayName();

    /**
     * @return the invoiceSectionId value.
     */
    String invoiceSectionId();

    /**
     * @return the lastMonthCharges value.
     */
    Amount lastMonthCharges();

    /**
     * @return the monthToDateCharges value.
     */
    Amount monthToDateCharges();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the skuDescription value.
     */
    String skuDescription();

    /**
     * @return the skuId value.
     */
    String skuId();

    /**
     * @return the subscriptionBillingStatus value.
     */
    BillingSubscriptionStatusType subscriptionBillingStatus();

    /**
     * @return the subscriptionId value.
     */
    UUID subscriptionId();

    /**
     * @return the type value.
     */
    String type();

}
