// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * User Info of NewRelic Monitor resource.
 */
@Fluent
public final class UserInfo {
    /*
     * First name
     */
    @JsonProperty(value = "firstName")
    private String firstName;

    /*
     * Last name
     */
    @JsonProperty(value = "lastName")
    private String lastName;

    /*
     * User Email
     */
    @JsonProperty(value = "emailAddress")
    private String emailAddress;

    /*
     * Contact phone number
     */
    @JsonProperty(value = "phoneNumber")
    private String phoneNumber;

    /*
     * country if user
     */
    @JsonProperty(value = "country")
    private String country;

    /**
     * Creates an instance of UserInfo class.
     */
    public UserInfo() {
    }

    /**
     * Get the firstName property: First name.
     * 
     * @return the firstName value.
     */
    public String firstName() {
        return this.firstName;
    }

    /**
     * Set the firstName property: First name.
     * 
     * @param firstName the firstName value to set.
     * @return the UserInfo object itself.
     */
    public UserInfo withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Get the lastName property: Last name.
     * 
     * @return the lastName value.
     */
    public String lastName() {
        return this.lastName;
    }

    /**
     * Set the lastName property: Last name.
     * 
     * @param lastName the lastName value to set.
     * @return the UserInfo object itself.
     */
    public UserInfo withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Get the emailAddress property: User Email.
     * 
     * @return the emailAddress value.
     */
    public String emailAddress() {
        return this.emailAddress;
    }

    /**
     * Set the emailAddress property: User Email.
     * 
     * @param emailAddress the emailAddress value to set.
     * @return the UserInfo object itself.
     */
    public UserInfo withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Get the phoneNumber property: Contact phone number.
     * 
     * @return the phoneNumber value.
     */
    public String phoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Set the phoneNumber property: Contact phone number.
     * 
     * @param phoneNumber the phoneNumber value to set.
     * @return the UserInfo object itself.
     */
    public UserInfo withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Get the country property: country if user.
     * 
     * @return the country value.
     */
    public String country() {
        return this.country;
    }

    /**
     * Set the country property: country if user.
     * 
     * @param country the country value to set.
     * @return the UserInfo object itself.
     */
    public UserInfo withCountry(String country) {
        this.country = country;
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
