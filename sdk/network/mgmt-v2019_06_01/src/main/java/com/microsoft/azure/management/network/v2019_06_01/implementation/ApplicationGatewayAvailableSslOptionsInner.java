/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_06_01.implementation;

import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2019_06_01.ApplicationGatewaySslPolicyName;
import com.microsoft.azure.management.network.v2019_06_01.ApplicationGatewaySslCipherSuite;
import com.microsoft.azure.management.network.v2019_06_01.ApplicationGatewaySslProtocol;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Response for ApplicationGatewayAvailableSslOptions API service call.
 */
@JsonFlatten
@SkipParentValidation
public class ApplicationGatewayAvailableSslOptionsInner extends Resource {
    /**
     * List of available Ssl predefined policy.
     */
    @JsonProperty(value = "properties.predefinedPolicies")
    private List<SubResource> predefinedPolicies;

    /**
     * Name of the Ssl predefined policy applied by default to application
     * gateway. Possible values include: 'AppGwSslPolicy20150501',
     * 'AppGwSslPolicy20170401', 'AppGwSslPolicy20170401S'.
     */
    @JsonProperty(value = "properties.defaultPolicy")
    private ApplicationGatewaySslPolicyName defaultPolicy;

    /**
     * List of available Ssl cipher suites.
     */
    @JsonProperty(value = "properties.availableCipherSuites")
    private List<ApplicationGatewaySslCipherSuite> availableCipherSuites;

    /**
     * List of available Ssl protocols.
     */
    @JsonProperty(value = "properties.availableProtocols")
    private List<ApplicationGatewaySslProtocol> availableProtocols;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get list of available Ssl predefined policy.
     *
     * @return the predefinedPolicies value
     */
    public List<SubResource> predefinedPolicies() {
        return this.predefinedPolicies;
    }

    /**
     * Set list of available Ssl predefined policy.
     *
     * @param predefinedPolicies the predefinedPolicies value to set
     * @return the ApplicationGatewayAvailableSslOptionsInner object itself.
     */
    public ApplicationGatewayAvailableSslOptionsInner withPredefinedPolicies(List<SubResource> predefinedPolicies) {
        this.predefinedPolicies = predefinedPolicies;
        return this;
    }

    /**
     * Get name of the Ssl predefined policy applied by default to application gateway. Possible values include: 'AppGwSslPolicy20150501', 'AppGwSslPolicy20170401', 'AppGwSslPolicy20170401S'.
     *
     * @return the defaultPolicy value
     */
    public ApplicationGatewaySslPolicyName defaultPolicy() {
        return this.defaultPolicy;
    }

    /**
     * Set name of the Ssl predefined policy applied by default to application gateway. Possible values include: 'AppGwSslPolicy20150501', 'AppGwSslPolicy20170401', 'AppGwSslPolicy20170401S'.
     *
     * @param defaultPolicy the defaultPolicy value to set
     * @return the ApplicationGatewayAvailableSslOptionsInner object itself.
     */
    public ApplicationGatewayAvailableSslOptionsInner withDefaultPolicy(ApplicationGatewaySslPolicyName defaultPolicy) {
        this.defaultPolicy = defaultPolicy;
        return this;
    }

    /**
     * Get list of available Ssl cipher suites.
     *
     * @return the availableCipherSuites value
     */
    public List<ApplicationGatewaySslCipherSuite> availableCipherSuites() {
        return this.availableCipherSuites;
    }

    /**
     * Set list of available Ssl cipher suites.
     *
     * @param availableCipherSuites the availableCipherSuites value to set
     * @return the ApplicationGatewayAvailableSslOptionsInner object itself.
     */
    public ApplicationGatewayAvailableSslOptionsInner withAvailableCipherSuites(List<ApplicationGatewaySslCipherSuite> availableCipherSuites) {
        this.availableCipherSuites = availableCipherSuites;
        return this;
    }

    /**
     * Get list of available Ssl protocols.
     *
     * @return the availableProtocols value
     */
    public List<ApplicationGatewaySslProtocol> availableProtocols() {
        return this.availableProtocols;
    }

    /**
     * Set list of available Ssl protocols.
     *
     * @param availableProtocols the availableProtocols value to set
     * @return the ApplicationGatewayAvailableSslOptionsInner object itself.
     */
    public ApplicationGatewayAvailableSslOptionsInner withAvailableProtocols(List<ApplicationGatewaySslProtocol> availableProtocols) {
        this.availableProtocols = availableProtocols;
        return this;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the ApplicationGatewayAvailableSslOptionsInner object itself.
     */
    public ApplicationGatewayAvailableSslOptionsInner withId(String id) {
        this.id = id;
        return this;
    }

}
