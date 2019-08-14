/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The attributes associated with legacy enrollment.
 */
public class EnrollmentPolicies {
    /**
     * The accountOwnerViewCharges flag for Enrollment.
     */
    @JsonProperty(value = "accountOwnerViewCharges", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean accountOwnerViewCharges;

    /**
     * The departmentAdminViewCharges flag for Enrollment.
     */
    @JsonProperty(value = "departmentAdminViewCharges", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean departmentAdminViewCharges;

    /**
     * The marketplaces flag for Enrollment.
     */
    @JsonProperty(value = "marketplacesEnabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean marketplacesEnabled;

    /**
     * The reserved instances flag for Enrollment.
     */
    @JsonProperty(value = "reservedInstancesEnabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean reservedInstancesEnabled;

    /**
     * Get the accountOwnerViewCharges flag for Enrollment.
     *
     * @return the accountOwnerViewCharges value
     */
    public Boolean accountOwnerViewCharges() {
        return this.accountOwnerViewCharges;
    }

    /**
     * Get the departmentAdminViewCharges flag for Enrollment.
     *
     * @return the departmentAdminViewCharges value
     */
    public Boolean departmentAdminViewCharges() {
        return this.departmentAdminViewCharges;
    }

    /**
     * Get the marketplaces flag for Enrollment.
     *
     * @return the marketplacesEnabled value
     */
    public Boolean marketplacesEnabled() {
        return this.marketplacesEnabled;
    }

    /**
     * Get the reserved instances flag for Enrollment.
     *
     * @return the reservedInstancesEnabled value
     */
    public Boolean reservedInstancesEnabled() {
        return this.reservedInstancesEnabled;
    }

}
