// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Contact model.
 */
@Fluent
public final class Contact {
    /*
     * Name
     * 
     * Name of the contact.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * URL
     * 
     * URL for the contact.
     */
    @JsonProperty(value = "url")
    private String url;

    /*
     * Email address
     * 
     * Email address of the contact.
     */
    @JsonProperty(value = "email")
    private String email;

    /**
     * Creates an instance of Contact class.
     */
    public Contact() {
    }

    /**
     * Get the name property: Name
     * 
     * Name of the contact.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name
     * 
     * Name of the contact.
     * 
     * @param name the name value to set.
     * @return the Contact object itself.
     */
    public Contact withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the url property: URL
     * 
     * URL for the contact.
     * 
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: URL
     * 
     * URL for the contact.
     * 
     * @param url the url value to set.
     * @return the Contact object itself.
     */
    public Contact withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the email property: Email address
     * 
     * Email address of the contact.
     * 
     * @return the email value.
     */
    public String email() {
        return this.email;
    }

    /**
     * Set the email property: Email address
     * 
     * Email address of the contact.
     * 
     * @param email the email value to set.
     * @return the Contact object itself.
     */
    public Contact withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
