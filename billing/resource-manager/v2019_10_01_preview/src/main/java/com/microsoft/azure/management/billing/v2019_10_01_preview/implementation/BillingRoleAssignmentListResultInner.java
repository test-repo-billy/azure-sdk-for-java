/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Result of get list of role assignments.
 */
public class BillingRoleAssignmentListResultInner {
    /**
     * The list role assignments.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<BillingRoleAssignmentInner> value;

    /**
     * Get the list role assignments.
     *
     * @return the value value
     */
    public List<BillingRoleAssignmentInner> value() {
        return this.value;
    }

}
