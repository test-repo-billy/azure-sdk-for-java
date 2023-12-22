// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewaySslCipherSuite;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewaySslPolicyName;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewaySslProtocol;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Properties of ApplicationGatewayAvailableSslOptions.
 */
@Fluent
public final class ApplicationGatewayAvailableSslOptionsPropertiesFormat {
    /*
     * List of available Ssl predefined policy.
     */
    @JsonProperty(value = "predefinedPolicies")
    private List<SubResource> predefinedPolicies;

    /*
     * Name of the Ssl predefined policy applied by default to application gateway.
     */
    @JsonProperty(value = "defaultPolicy")
    private ApplicationGatewaySslPolicyName defaultPolicy;

    /*
     * List of available Ssl cipher suites.
     */
    @JsonProperty(value = "availableCipherSuites")
    private List<ApplicationGatewaySslCipherSuite> availableCipherSuites;

    /*
     * List of available Ssl protocols.
     */
    @JsonProperty(value = "availableProtocols")
    private List<ApplicationGatewaySslProtocol> availableProtocols;

    /**
     * Creates an instance of ApplicationGatewayAvailableSslOptionsPropertiesFormat class.
     */
    public ApplicationGatewayAvailableSslOptionsPropertiesFormat() {
    }

    /**
     * Get the predefinedPolicies property: List of available Ssl predefined policy.
     * 
     * @return the predefinedPolicies value.
     */
    public List<SubResource> predefinedPolicies() {
        return this.predefinedPolicies;
    }

    /**
     * Set the predefinedPolicies property: List of available Ssl predefined policy.
     * 
     * @param predefinedPolicies the predefinedPolicies value to set.
     * @return the ApplicationGatewayAvailableSslOptionsPropertiesFormat object itself.
     */
    public ApplicationGatewayAvailableSslOptionsPropertiesFormat
        withPredefinedPolicies(List<SubResource> predefinedPolicies) {
        this.predefinedPolicies = predefinedPolicies;
        return this;
    }

    /**
     * Get the defaultPolicy property: Name of the Ssl predefined policy applied by default to application gateway.
     * 
     * @return the defaultPolicy value.
     */
    public ApplicationGatewaySslPolicyName defaultPolicy() {
        return this.defaultPolicy;
    }

    /**
     * Set the defaultPolicy property: Name of the Ssl predefined policy applied by default to application gateway.
     * 
     * @param defaultPolicy the defaultPolicy value to set.
     * @return the ApplicationGatewayAvailableSslOptionsPropertiesFormat object itself.
     */
    public ApplicationGatewayAvailableSslOptionsPropertiesFormat
        withDefaultPolicy(ApplicationGatewaySslPolicyName defaultPolicy) {
        this.defaultPolicy = defaultPolicy;
        return this;
    }

    /**
     * Get the availableCipherSuites property: List of available Ssl cipher suites.
     * 
     * @return the availableCipherSuites value.
     */
    public List<ApplicationGatewaySslCipherSuite> availableCipherSuites() {
        return this.availableCipherSuites;
    }

    /**
     * Set the availableCipherSuites property: List of available Ssl cipher suites.
     * 
     * @param availableCipherSuites the availableCipherSuites value to set.
     * @return the ApplicationGatewayAvailableSslOptionsPropertiesFormat object itself.
     */
    public ApplicationGatewayAvailableSslOptionsPropertiesFormat
        withAvailableCipherSuites(List<ApplicationGatewaySslCipherSuite> availableCipherSuites) {
        this.availableCipherSuites = availableCipherSuites;
        return this;
    }

    /**
     * Get the availableProtocols property: List of available Ssl protocols.
     * 
     * @return the availableProtocols value.
     */
    public List<ApplicationGatewaySslProtocol> availableProtocols() {
        return this.availableProtocols;
    }

    /**
     * Set the availableProtocols property: List of available Ssl protocols.
     * 
     * @param availableProtocols the availableProtocols value to set.
     * @return the ApplicationGatewayAvailableSslOptionsPropertiesFormat object itself.
     */
    public ApplicationGatewayAvailableSslOptionsPropertiesFormat
        withAvailableProtocols(List<ApplicationGatewaySslProtocol> availableProtocols) {
        this.availableProtocols = availableProtocols;
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
