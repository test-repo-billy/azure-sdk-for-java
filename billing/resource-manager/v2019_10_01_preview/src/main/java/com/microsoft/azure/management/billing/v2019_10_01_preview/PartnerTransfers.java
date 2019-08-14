/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.PartnerTransfersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing PartnerTransfers.
 */
public interface PartnerTransfers extends HasInner<PartnerTransfersInner> {
    /**
     * Gets the transfer details for given transfer Id.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param customerName Customer name.
     * @param transferName Transfer Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CustomerBillingProfileBillingAccountTransferDetails> getAsync(String billingAccountName, String billingProfileName, String customerName, String transferName);

    /**
     * Cancels the transfer for given transfer Id.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param customerName Customer name.
     * @param transferName Transfer Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable cancelAsync(String billingAccountName, String billingProfileName, String customerName, String transferName);

    /**
     * Initiates the request to transfer the legacy subscriptions or RIs.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param customerName Customer name.
     * @param parameters Parameters supplied to initiate the transfer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<InvoiceSectionBillingProfileBillingAccountTransferDetails> initiateAsync(String billingAccountName, String billingProfileName, String customerName, InitiateTransferRequest parameters);

}
