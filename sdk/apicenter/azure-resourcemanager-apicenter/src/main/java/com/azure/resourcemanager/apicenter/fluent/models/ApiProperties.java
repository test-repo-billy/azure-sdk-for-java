// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apicenter.models.ApiKind;
import com.azure.resourcemanager.apicenter.models.Contact;
import com.azure.resourcemanager.apicenter.models.ExternalDocumentation;
import com.azure.resourcemanager.apicenter.models.License;
import com.azure.resourcemanager.apicenter.models.LifecycleStage;
import com.azure.resourcemanager.apicenter.models.TermsOfService;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * API properties
 * 
 * API properties.
 */
@Fluent
public final class ApiProperties {
    /*
     * API title.
     */
    @JsonProperty(value = "title", required = true)
    private String title;

    /*
     * API kind
     * 
     * Kind of API. For example, REST or GraphQL.
     */
    @JsonProperty(value = "kind", required = true)
    private ApiKind kind;

    /*
     * Description
     * 
     * Description of the API.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Short description of the API.
     */
    @JsonProperty(value = "summary")
    private String summary;

    /*
     * Current lifecycle stage of the API.
     */
    @JsonProperty(value = "lifecycleStage", access = JsonProperty.Access.WRITE_ONLY)
    private LifecycleStage lifecycleStage;

    /*
     * Terms of service
     * 
     * Terms of service for the API.
     */
    @JsonProperty(value = "termsOfService")
    private TermsOfService termsOfService;

    /*
     * The externalDocumentation property.
     */
    @JsonProperty(value = "externalDocumentation")
    private List<ExternalDocumentation> externalDocumentation;

    /*
     * The contacts property.
     */
    @JsonProperty(value = "contacts")
    private List<Contact> contacts;

    /*
     * License
     * 
     * The license information for the API.
     */
    @JsonProperty(value = "license")
    private License license;

    /*
     * The custom metadata defined for API catalog entities.
     */
    @JsonProperty(value = "customProperties")
    private Object customProperties;

    /**
     * Creates an instance of ApiProperties class.
     */
    public ApiProperties() {
    }

    /**
     * Get the title property: API title.
     * 
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: API title.
     * 
     * @param title the title value to set.
     * @return the ApiProperties object itself.
     */
    public ApiProperties withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the kind property: API kind
     * 
     * Kind of API. For example, REST or GraphQL.
     * 
     * @return the kind value.
     */
    public ApiKind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: API kind
     * 
     * Kind of API. For example, REST or GraphQL.
     * 
     * @param kind the kind value to set.
     * @return the ApiProperties object itself.
     */
    public ApiProperties withKind(ApiKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the description property: Description
     * 
     * Description of the API.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description
     * 
     * Description of the API.
     * 
     * @param description the description value to set.
     * @return the ApiProperties object itself.
     */
    public ApiProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the summary property: Short description of the API.
     * 
     * @return the summary value.
     */
    public String summary() {
        return this.summary;
    }

    /**
     * Set the summary property: Short description of the API.
     * 
     * @param summary the summary value to set.
     * @return the ApiProperties object itself.
     */
    public ApiProperties withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Get the lifecycleStage property: Current lifecycle stage of the API.
     * 
     * @return the lifecycleStage value.
     */
    public LifecycleStage lifecycleStage() {
        return this.lifecycleStage;
    }

    /**
     * Get the termsOfService property: Terms of service
     * 
     * Terms of service for the API.
     * 
     * @return the termsOfService value.
     */
    public TermsOfService termsOfService() {
        return this.termsOfService;
    }

    /**
     * Set the termsOfService property: Terms of service
     * 
     * Terms of service for the API.
     * 
     * @param termsOfService the termsOfService value to set.
     * @return the ApiProperties object itself.
     */
    public ApiProperties withTermsOfService(TermsOfService termsOfService) {
        this.termsOfService = termsOfService;
        return this;
    }

    /**
     * Get the externalDocumentation property: The externalDocumentation property.
     * 
     * @return the externalDocumentation value.
     */
    public List<ExternalDocumentation> externalDocumentation() {
        return this.externalDocumentation;
    }

    /**
     * Set the externalDocumentation property: The externalDocumentation property.
     * 
     * @param externalDocumentation the externalDocumentation value to set.
     * @return the ApiProperties object itself.
     */
    public ApiProperties withExternalDocumentation(List<ExternalDocumentation> externalDocumentation) {
        this.externalDocumentation = externalDocumentation;
        return this;
    }

    /**
     * Get the contacts property: The contacts property.
     * 
     * @return the contacts value.
     */
    public List<Contact> contacts() {
        return this.contacts;
    }

    /**
     * Set the contacts property: The contacts property.
     * 
     * @param contacts the contacts value to set.
     * @return the ApiProperties object itself.
     */
    public ApiProperties withContacts(List<Contact> contacts) {
        this.contacts = contacts;
        return this;
    }

    /**
     * Get the license property: License
     * 
     * The license information for the API.
     * 
     * @return the license value.
     */
    public License license() {
        return this.license;
    }

    /**
     * Set the license property: License
     * 
     * The license information for the API.
     * 
     * @param license the license value to set.
     * @return the ApiProperties object itself.
     */
    public ApiProperties withLicense(License license) {
        this.license = license;
        return this;
    }

    /**
     * Get the customProperties property: The custom metadata defined for API catalog entities.
     * 
     * @return the customProperties value.
     */
    public Object customProperties() {
        return this.customProperties;
    }

    /**
     * Set the customProperties property: The custom metadata defined for API catalog entities.
     * 
     * @param customProperties the customProperties value to set.
     * @return the ApiProperties object itself.
     */
    public ApiProperties withCustomProperties(Object customProperties) {
        this.customProperties = customProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (title() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property title in model ApiProperties"));
        }
        if (kind() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property kind in model ApiProperties"));
        }
        if (termsOfService() != null) {
            termsOfService().validate();
        }
        if (externalDocumentation() != null) {
            externalDocumentation().forEach(e -> e.validate());
        }
        if (contacts() != null) {
            contacts().forEach(e -> e.validate());
        }
        if (license() != null) {
            license().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ApiProperties.class);
}
