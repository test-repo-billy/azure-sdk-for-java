// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.models.CustomDnsSuffixProvisioningState;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Full view of the custom domain suffix configuration for ASEv3.
 */
@Fluent
public final class CustomDnsSuffixConfigurationInner extends ProxyOnlyResource {
    /*
     * CustomDnsSuffixConfiguration resource specific properties
     */
    @JsonProperty(value = "properties")
    private CustomDnsSuffixConfigurationProperties innerProperties;

    /**
     * Creates an instance of CustomDnsSuffixConfigurationInner class.
     */
    public CustomDnsSuffixConfigurationInner() {
    }

    /**
     * Get the innerProperties property: CustomDnsSuffixConfiguration resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private CustomDnsSuffixConfigurationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomDnsSuffixConfigurationInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioningState property.
     * 
     * @return the provisioningState value.
     */
    public CustomDnsSuffixProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the provisioningDetails property: The provisioningDetails property.
     * 
     * @return the provisioningDetails value.
     */
    public String provisioningDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningDetails();
    }

    /**
     * Get the dnsSuffix property: The default custom domain suffix to use for all sites deployed on the ASE.
     * 
     * @return the dnsSuffix value.
     */
    public String dnsSuffix() {
        return this.innerProperties() == null ? null : this.innerProperties().dnsSuffix();
    }

    /**
     * Set the dnsSuffix property: The default custom domain suffix to use for all sites deployed on the ASE.
     * 
     * @param dnsSuffix the dnsSuffix value to set.
     * @return the CustomDnsSuffixConfigurationInner object itself.
     */
    public CustomDnsSuffixConfigurationInner withDnsSuffix(String dnsSuffix) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomDnsSuffixConfigurationProperties();
        }
        this.innerProperties().withDnsSuffix(dnsSuffix);
        return this;
    }

    /**
     * Get the certificateUrl property: The URL referencing the Azure Key Vault certificate secret that should be used
     * as the default SSL/TLS certificate for sites with the custom domain suffix.
     * 
     * @return the certificateUrl value.
     */
    public String certificateUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().certificateUrl();
    }

    /**
     * Set the certificateUrl property: The URL referencing the Azure Key Vault certificate secret that should be used
     * as the default SSL/TLS certificate for sites with the custom domain suffix.
     * 
     * @param certificateUrl the certificateUrl value to set.
     * @return the CustomDnsSuffixConfigurationInner object itself.
     */
    public CustomDnsSuffixConfigurationInner withCertificateUrl(String certificateUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomDnsSuffixConfigurationProperties();
        }
        this.innerProperties().withCertificateUrl(certificateUrl);
        return this;
    }

    /**
     * Get the keyVaultReferenceIdentity property: The user-assigned identity to use for resolving the key vault
     * certificate reference. If not specified, the system-assigned ASE identity will be used if available.
     * 
     * @return the keyVaultReferenceIdentity value.
     */
    public String keyVaultReferenceIdentity() {
        return this.innerProperties() == null ? null : this.innerProperties().keyVaultReferenceIdentity();
    }

    /**
     * Set the keyVaultReferenceIdentity property: The user-assigned identity to use for resolving the key vault
     * certificate reference. If not specified, the system-assigned ASE identity will be used if available.
     * 
     * @param keyVaultReferenceIdentity the keyVaultReferenceIdentity value to set.
     * @return the CustomDnsSuffixConfigurationInner object itself.
     */
    public CustomDnsSuffixConfigurationInner withKeyVaultReferenceIdentity(String keyVaultReferenceIdentity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomDnsSuffixConfigurationProperties();
        }
        this.innerProperties().withKeyVaultReferenceIdentity(keyVaultReferenceIdentity);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
