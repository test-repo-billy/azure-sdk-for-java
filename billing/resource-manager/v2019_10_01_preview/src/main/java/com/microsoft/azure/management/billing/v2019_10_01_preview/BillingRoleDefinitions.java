/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import rx.Observable;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.BillingRoleDefinitionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing BillingRoleDefinitions.
 */
public interface BillingRoleDefinitions extends HasInner<BillingRoleDefinitionsInner> {
    /**
     * Gets the role definition for a role.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param billingRoleDefinitionName role definition id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleDefinition> getByInvoiceSectionNameAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, String billingRoleDefinitionName);

    /**
     * Gets the role definition for a role.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param billingRoleDefinitionName role definition id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleDefinition> getByBillingProfileNameAsync(String billingAccountName, String billingProfileName, String billingRoleDefinitionName);

    /**
     * Lists the role definition for a billing account.
     *
     * @param billingAccountName billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleDefinitionListResult> listByBillingAccountNameAsync(String billingAccountName);

    /**
     * Lists the role definition for an invoice Section.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleDefinitionListResult> listByInvoiceSectionNameAsync(String billingAccountName, String billingProfileName, String invoiceSectionName);

    /**
     * Lists the role definition for a Billing Profile.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleDefinitionListResult> listByBillingProfileNameAsync(String billingAccountName, String billingProfileName);

    /**
     * Gets the role definition for a role.
     *
     * @param billingAccountName billing Account Id.
     * @param billingRoleDefinitionName role definition id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleDefinition> getByBillingAccountNameAsync(String billingAccountName, String billingRoleDefinitionName);

}
