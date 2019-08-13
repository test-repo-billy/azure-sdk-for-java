/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import rx.Observable;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.ProductsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Products.
 */
public interface Products extends HasInner<ProductsInner> {
    /**
     * Lists products by invoice section name.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProductsListResult> listByInvoiceSectionNameAsync(String billingAccountName, String invoiceSectionName);

    /**
     * Get a single product by name.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param productName Invoice Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProductSummary> getAsync(String billingAccountName, String invoiceSectionName, String productName);

    /**
     * The operation to transfer a Product to another invoice section.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param productName Invoice Id.
     * @param parameters Parameters supplied to the Transfer Product operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProductSummary> transferAsync(String billingAccountName, String invoiceSectionName, String productName, TransferProductRequestProperties parameters);

    /**
     * Validates the transfer of products across invoice sections.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param productName Invoice Id.
     * @param parameters Parameters supplied to the Transfer Products operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ValidateProductTransferEligibilityResult> validateTransferAsync(String billingAccountName, String invoiceSectionName, String productName, TransferProductRequestProperties parameters);

    /**
     * Cancel auto renew for product by product id and billing account name.
     *
     * @param billingAccountName billing Account Id.
     * @param productName Invoice Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<UpdateAutoRenewOperationSummary> updateAutoRenewByBillingAccountNameAsync(String billingAccountName, String productName);

    /**
     * Cancel auto renew for product by product id and invoice section name.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param productName Invoice Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<UpdateAutoRenewOperationSummary> updateAutoRenewByInvoiceSectionNameAsync(String billingAccountName, String invoiceSectionName, String productName);

    /**
     * Lists products by billing account name.
     *
     * @param billingAccountName billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProductSummary> listByBillingAccountNameAsync(final String billingAccountName);

}
