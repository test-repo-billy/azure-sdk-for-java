/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of the payment.
 */
public class PaymentProperties {
    /**
     * The type of payment.
     */
    @JsonProperty(value = "paymentType", access = JsonProperty.Access.WRITE_ONLY)
    private String paymentType;

    /**
     * The paid amount.
     */
    @JsonProperty(value = "amount", access = JsonProperty.Access.WRITE_ONLY)
    private Amount amount;

    /**
     * The date of the payment.
     */
    @JsonProperty(value = "date", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime dateProperty;

    /**
     * Get the type of payment.
     *
     * @return the paymentType value
     */
    public String paymentType() {
        return this.paymentType;
    }

    /**
     * Get the paid amount.
     *
     * @return the amount value
     */
    public Amount amount() {
        return this.amount;
    }

    /**
     * Get the date of the payment.
     *
     * @return the dateProperty value
     */
    public DateTime dateProperty() {
        return this.dateProperty;
    }

}
