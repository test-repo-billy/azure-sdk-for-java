/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2018_10_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Feature of a SignalR resource, which controls the SignalR runtime behavior.
 */
public class SignalRFeature {
    /**
     * FeatureFlags is the supported features of Azure SignalR service.
     * - ServiceMode: Flag for backend server for SignalR service. Values
     * allowed: "Default": have your own backend server; "Serverless": your
     * application doesn't have a backend server; "Classic": for backward
     * compatibility. Support both Default and Serverless mode but not
     * recommended; "PredefinedOnly": for future use.
     * - EnableConnectivityLogs: "true"/"false", to enable/disable the
     * connectivity log category respectively. Possible values include:
     * 'ServiceMode', 'EnableConnectivityLogs'.
     */
    @JsonProperty(value = "flag", required = true)
    private FeatureFlags flag;

    /**
     * Value of the feature flag. See Azure SignalR service document
     * https://docs.microsoft.com/en-us/azure/azure-signalr/ for allowed
     * values.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Optional properties related to this feature.
     */
    @JsonProperty(value = "properties")
    private Map<String, String> properties;

    /**
     * Get featureFlags is the supported features of Azure SignalR service.
     - ServiceMode: Flag for backend server for SignalR service. Values allowed: "Default": have your own backend server; "Serverless": your application doesn't have a backend server; "Classic": for backward compatibility. Support both Default and Serverless mode but not recommended; "PredefinedOnly": for future use.
     - EnableConnectivityLogs: "true"/"false", to enable/disable the connectivity log category respectively. Possible values include: 'ServiceMode', 'EnableConnectivityLogs'.
     *
     * @return the flag value
     */
    public FeatureFlags flag() {
        return this.flag;
    }

    /**
     * Set featureFlags is the supported features of Azure SignalR service.
     - ServiceMode: Flag for backend server for SignalR service. Values allowed: "Default": have your own backend server; "Serverless": your application doesn't have a backend server; "Classic": for backward compatibility. Support both Default and Serverless mode but not recommended; "PredefinedOnly": for future use.
     - EnableConnectivityLogs: "true"/"false", to enable/disable the connectivity log category respectively. Possible values include: 'ServiceMode', 'EnableConnectivityLogs'.
     *
     * @param flag the flag value to set
     * @return the SignalRFeature object itself.
     */
    public SignalRFeature withFlag(FeatureFlags flag) {
        this.flag = flag;
        return this;
    }

    /**
     * Get value of the feature flag. See Azure SignalR service document https://docs.microsoft.com/en-us/azure/azure-signalr/ for allowed values.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set value of the feature flag. See Azure SignalR service document https://docs.microsoft.com/en-us/azure/azure-signalr/ for allowed values.
     *
     * @param value the value value to set
     * @return the SignalRFeature object itself.
     */
    public SignalRFeature withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get optional properties related to this feature.
     *
     * @return the properties value
     */
    public Map<String, String> properties() {
        return this.properties;
    }

    /**
     * Set optional properties related to this feature.
     *
     * @param properties the properties value to set
     * @return the SignalRFeature object itself.
     */
    public SignalRFeature withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

}
