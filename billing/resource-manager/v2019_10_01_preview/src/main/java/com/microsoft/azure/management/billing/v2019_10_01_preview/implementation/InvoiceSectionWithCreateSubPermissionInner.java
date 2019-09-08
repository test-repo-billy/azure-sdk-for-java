/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import java.util.List;
import com.microsoft.azure.management.billing.v2019_10_01_preview.AzurePlan;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Invoice section properties with create subscription permission.
 */
public class InvoiceSectionWithCreateSubPermissionInner {
    /**
     * Invoice Section Id.
     */
    @JsonProperty(value = "invoiceSectionId", access = JsonProperty.Access.WRITE_ONLY)
    private String invoiceSectionId;

    /**
     * Invoice Section display name.
     */
    @JsonProperty(value = "invoiceSectionDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String invoiceSectionDisplayName;

    /**
     * Billing profile Id.
     */
    @JsonProperty(value = "billingProfileId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingProfileId;

    /**
     * Billing profile display name.
     */
    @JsonProperty(value = "billingProfileDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String billingProfileDisplayName;

    /**
     * Enabled azure plans for the associated billing profile.
     */
    @JsonProperty(value = "enabledAzurePlans")
    private List<AzurePlan> enabledAzurePlans;

    /**
     * Get invoice Section Id.
     *
     * @return the invoiceSectionId value
     */
    public String invoiceSectionId() {
        return this.invoiceSectionId;
    }

    /**
     * Get invoice Section display name.
     *
     * @return the invoiceSectionDisplayName value
     */
    public String invoiceSectionDisplayName() {
        return this.invoiceSectionDisplayName;
    }

    /**
     * Get billing profile Id.
     *
     * @return the billingProfileId value
     */
    public String billingProfileId() {
        return this.billingProfileId;
    }

    /**
     * Get billing profile display name.
     *
     * @return the billingProfileDisplayName value
     */
    public String billingProfileDisplayName() {
        return this.billingProfileDisplayName;
    }

    /**
     * Get enabled azure plans for the associated billing profile.
     *
     * @return the enabledAzurePlans value
     */
    public List<AzurePlan> enabledAzurePlans() {
        return this.enabledAzurePlans;
    }

    /**
     * Set enabled azure plans for the associated billing profile.
     *
     * @param enabledAzurePlans the enabledAzurePlans value to set
     * @return the InvoiceSectionWithCreateSubPermissionInner object itself.
     */
    public InvoiceSectionWithCreateSubPermissionInner withEnabledAzurePlans(List<AzurePlan> enabledAzurePlans) {
        this.enabledAzurePlans = enabledAzurePlans;
        return this;
    }

}
