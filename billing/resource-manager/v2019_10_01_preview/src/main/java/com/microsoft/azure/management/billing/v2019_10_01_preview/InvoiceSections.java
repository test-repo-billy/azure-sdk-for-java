/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Observable;
import rx.Completable;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.InvoiceSectionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing InvoiceSections.
 */
public interface InvoiceSections extends SupportsCreating<InvoiceSection.DefinitionStages.Blank>, HasInner<InvoiceSectionsInner> {
    /**
     * Lists all invoice sections for a user which he has access to.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<InvoiceSectionListResult> listByBillingProfileNameAsync(String billingAccountName, String billingProfileName);

    /**
     * Elevates the caller's access to match their billing profile access.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable elevateToBillingProfileAsync(String billingAccountName, String billingProfileName, String invoiceSectionName);

    /**
     * Get the InvoiceSection by id.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<InvoiceSection> getAsync(String billingAccountName, String billingProfileName, String invoiceSectionName);

}
