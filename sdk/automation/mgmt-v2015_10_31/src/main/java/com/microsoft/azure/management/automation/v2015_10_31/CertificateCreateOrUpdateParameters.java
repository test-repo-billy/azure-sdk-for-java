/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The parameters supplied to the create or update or replace certificate
 * operation.
 */
@JsonFlatten
public class CertificateCreateOrUpdateParameters {
    /**
     * Gets or sets the name of the certificate.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Gets or sets the base64 encoded value of the certificate.
     */
    @JsonProperty(value = "properties.base64Value", required = true)
    private String base64Value;

    /**
     * Gets or sets the description of the certificate.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Gets or sets the thumbprint of the certificate.
     */
    @JsonProperty(value = "properties.thumbprint")
    private String thumbprint;

    /**
     * Gets or sets the is exportable flag of the certificate.
     */
    @JsonProperty(value = "properties.isExportable")
    private boolean isExportable;

    /**
     * Get gets or sets the name of the certificate.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set gets or sets the name of the certificate.
     *
     * @param name the name value to set
     * @return the CertificateCreateOrUpdateParameters object itself.
     */
    public CertificateCreateOrUpdateParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get gets or sets the base64 encoded value of the certificate.
     *
     * @return the base64Value value
     */
    public String base64Value() {
        return this.base64Value;
    }

    /**
     * Set gets or sets the base64 encoded value of the certificate.
     *
     * @param base64Value the base64Value value to set
     * @return the CertificateCreateOrUpdateParameters object itself.
     */
    public CertificateCreateOrUpdateParameters withBase64Value(String base64Value) {
        this.base64Value = base64Value;
        return this;
    }

    /**
     * Get gets or sets the description of the certificate.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set gets or sets the description of the certificate.
     *
     * @param description the description value to set
     * @return the CertificateCreateOrUpdateParameters object itself.
     */
    public CertificateCreateOrUpdateParameters withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get gets or sets the thumbprint of the certificate.
     *
     * @return the thumbprint value
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set gets or sets the thumbprint of the certificate.
     *
     * @param thumbprint the thumbprint value to set
     * @return the CertificateCreateOrUpdateParameters object itself.
     */
    public CertificateCreateOrUpdateParameters withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get gets or sets the is exportable flag of the certificate.
     *
     * @return the isExportable value
     */
    public boolean isExportable() {
        return this.isExportable;
    }

    /**
     * Set gets or sets the is exportable flag of the certificate.
     *
     * @param isExportable the isExportable value to set
     * @return the CertificateCreateOrUpdateParameters object itself.
     */
    public CertificateCreateOrUpdateParameters withIsExportable(boolean isExportable) {
        this.isExportable = isExportable;
        return this;
    }

}
