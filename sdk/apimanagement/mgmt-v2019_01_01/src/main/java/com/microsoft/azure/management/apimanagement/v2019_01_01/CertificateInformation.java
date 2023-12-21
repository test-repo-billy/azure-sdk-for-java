/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SSL certificate information.
 */
public class CertificateInformation {
    /**
     * Expiration date of the certificate. The date conforms to the following
     * format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     */
    @JsonProperty(value = "expiry", required = true)
    private DateTime expiry;

    /**
     * Thumbprint of the certificate.
     */
    @JsonProperty(value = "thumbprint", required = true)
    private String thumbprint;

    /**
     * Subject of the certificate.
     */
    @JsonProperty(value = "subject", required = true)
    private String subject;

    /**
     * Get expiration date of the certificate. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @return the expiry value
     */
    public DateTime expiry() {
        return this.expiry;
    }

    /**
     * Set expiration date of the certificate. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @param expiry the expiry value to set
     * @return the CertificateInformation object itself.
     */
    public CertificateInformation withExpiry(DateTime expiry) {
        this.expiry = expiry;
        return this;
    }

    /**
     * Get thumbprint of the certificate.
     *
     * @return the thumbprint value
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set thumbprint of the certificate.
     *
     * @param thumbprint the thumbprint value to set
     * @return the CertificateInformation object itself.
     */
    public CertificateInformation withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get subject of the certificate.
     *
     * @return the subject value
     */
    public String subject() {
        return this.subject;
    }

    /**
     * Set subject of the certificate.
     *
     * @param subject the subject value to set
     * @return the CertificateInformation object itself.
     */
    public CertificateInformation withSubject(String subject) {
        this.subject = subject;
        return this;
    }

}
