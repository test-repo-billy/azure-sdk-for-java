/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.healthcareapis.v2019-09-16;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Authentication configuration information.
 */
public class ServiceAuthenticationConfigurationInfo {
    /**
     * The authority url for the service.
     */
    @JsonProperty(value = "authority")
    private String authority;

    /**
     * The audience url for the service.
     */
    @JsonProperty(value = "audience")
    private String audience;

    /**
     * If the SMART on FHIR proxy is enabled.
     */
    @JsonProperty(value = "smartProxyEnabled")
    private Boolean smartProxyEnabled;

    /**
     * Get the authority url for the service.
     *
     * @return the authority value
     */
    public String authority() {
        return this.authority;
    }

    /**
     * Set the authority url for the service.
     *
     * @param authority the authority value to set
     * @return the ServiceAuthenticationConfigurationInfo object itself.
     */
    public ServiceAuthenticationConfigurationInfo withAuthority(String authority) {
        this.authority = authority;
        return this;
    }

    /**
     * Get the audience url for the service.
     *
     * @return the audience value
     */
    public String audience() {
        return this.audience;
    }

    /**
     * Set the audience url for the service.
     *
     * @param audience the audience value to set
     * @return the ServiceAuthenticationConfigurationInfo object itself.
     */
    public ServiceAuthenticationConfigurationInfo withAudience(String audience) {
        this.audience = audience;
        return this;
    }

    /**
     * Get if the SMART on FHIR proxy is enabled.
     *
     * @return the smartProxyEnabled value
     */
    public Boolean smartProxyEnabled() {
        return this.smartProxyEnabled;
    }

    /**
     * Set if the SMART on FHIR proxy is enabled.
     *
     * @param smartProxyEnabled the smartProxyEnabled value to set
     * @return the ServiceAuthenticationConfigurationInfo object itself.
     */
    public ServiceAuthenticationConfigurationInfo withSmartProxyEnabled(Boolean smartProxyEnabled) {
        this.smartProxyEnabled = smartProxyEnabled;
        return this;
    }

}
