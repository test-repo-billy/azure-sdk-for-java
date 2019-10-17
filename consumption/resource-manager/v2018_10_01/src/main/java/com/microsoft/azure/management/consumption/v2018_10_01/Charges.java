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
 * Type representing Charges.
 */
public interface Charges {
    /**
     * Lists the charges by enrollmentAccountId.
     *
     * @param billingAccountId BillingAccount ID
     * @param enrollmentAccountId EnrollmentAccount ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ChargesListResult> listByEnrollmentAccountAsync(String billingAccountId, String enrollmentAccountId);

    /**
     * Lists the charges based on enrollmentAccountId by billing period.
     *
     * @param billingAccountId BillingAccount ID
     * @param enrollmentAccountId EnrollmentAccount ID
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ChargeSummary> listForBillingPeriodByEnrollmentAccountAsync(String billingAccountId, String enrollmentAccountId, String billingPeriodName);

    /**
     * Lists the charges by departmentId.
     *
     * @param billingAccountId BillingAccount ID
     * @param departmentId Department ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ChargesListResult> listByDepartmentAsync(String billingAccountId, String departmentId);

    /**
     * Lists the charges based on departmentId by billing period.
     *
     * @param billingAccountId BillingAccount ID
     * @param departmentId Department ID
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ChargeSummary> listForBillingPeriodByDepartmentAsync(String billingAccountId, String departmentId, String billingPeriodName);

}
