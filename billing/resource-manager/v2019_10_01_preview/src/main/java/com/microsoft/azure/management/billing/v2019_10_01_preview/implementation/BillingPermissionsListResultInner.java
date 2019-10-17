/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import java.util.List;
import com.microsoft.azure.management.billing.v2019_10_01_preview.BillingPermissionsProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Result of list billingPermissions a caller has on a billing account.
 */
public class BillingPermissionsListResultInner {
    /**
     * The list of billingPermissions a caller has on a billing account.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<BillingPermissionsProperties> value;

    /**
     * Get the list of billingPermissions a caller has on a billing account.
     *
     * @return the value value
     */
    public List<BillingPermissionsProperties> value() {
        return this.value;
    }

}
