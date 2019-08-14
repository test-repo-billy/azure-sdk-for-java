/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import rx.Observable;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.RecipientTransfersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing RecipientTransfers.
 */
public interface RecipientTransfers extends HasInner<RecipientTransfersInner> {
    /**
     * Accepts the transfer with given transfer Id.
     *
     * @param transferName Transfer Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecipientTransferDetails> acceptAsync(String transferName);

    /**
     * Declines the transfer with given transfer Id.
     *
     * @param transferName Transfer Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecipientTransferDetails> declineAsync(String transferName);

    /**
     * Gets the transfer with given transfer Id.
     *
     * @param transferName Transfer Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecipientTransferDetails> getAsync(String transferName);

    /**
     * Lists the transfers received by caller.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecipientTransferDetails> listAsync();

}
