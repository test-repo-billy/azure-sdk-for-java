/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_10_01;

import rx.Observable;

/**
 * Type representing Tags.
 */
public interface Tags {
    /**
     * Get all available tag keys for a billing account.
     *
     * @param billingAccountId BillingAccount ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TagsResult> getAsync(String billingAccountId);

}
