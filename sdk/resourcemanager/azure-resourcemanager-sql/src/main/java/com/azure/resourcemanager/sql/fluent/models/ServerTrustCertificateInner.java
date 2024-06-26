// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Server trust certificate imported from box to enable connection between box and Sql Managed Instance. */
@Fluent
public final class ServerTrustCertificateInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private ServerTrustCertificateProperties innerProperties;

    /** Creates an instance of ServerTrustCertificateInner class. */
    public ServerTrustCertificateInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private ServerTrustCertificateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the publicBlob property: The certificate public blob.
     *
     * @return the publicBlob value.
     */
    public String publicBlob() {
        return this.innerProperties() == null ? null : this.innerProperties().publicBlob();
    }

    /**
     * Set the publicBlob property: The certificate public blob.
     *
     * @param publicBlob the publicBlob value to set.
     * @return the ServerTrustCertificateInner object itself.
     */
    public ServerTrustCertificateInner withPublicBlob(String publicBlob) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerTrustCertificateProperties();
        }
        this.innerProperties().withPublicBlob(publicBlob);
        return this;
    }

    /**
     * Get the thumbprint property: The certificate thumbprint.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.innerProperties() == null ? null : this.innerProperties().thumbprint();
    }

    /**
     * Get the certificateName property: The certificate name.
     *
     * @return the certificateName value.
     */
    public String certificateName() {
        return this.innerProperties() == null ? null : this.innerProperties().certificateName();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
