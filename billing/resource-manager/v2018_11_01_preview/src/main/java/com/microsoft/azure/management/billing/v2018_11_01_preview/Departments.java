/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import rx.Observable;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.DepartmentsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Departments.
 */
public interface Departments extends HasInner<DepartmentsInner> {
    /**
     * Lists all departments for a user which he has access to.
     *
     * @param billingAccountName billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DepartmentListResult> listByBillingAccountNameAsync(String billingAccountName);

    /**
     * Get the department by id.
     *
     * @param billingAccountName billing Account Id.
     * @param departmentName Department Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Department> getAsync(String billingAccountName, String departmentName);

}
