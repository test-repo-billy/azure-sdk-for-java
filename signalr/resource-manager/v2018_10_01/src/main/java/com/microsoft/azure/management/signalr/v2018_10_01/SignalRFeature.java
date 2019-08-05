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
     * Kind of feature. Required.
     */
    @JsonProperty(value = "flag", required = true)
    private String flag;

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
     * Creates an instance of SignalRFeature class.
     * @param value value of the feature flag. See Azure SignalR service document https://docs.microsoft.com/en-us/azure/azure-signalr/ for allowed values.
     */
    public SignalRFeature() {
        flag = "ServiceMode";
    }

    /**
     * Get kind of feature. Required.
     *
     * @return the flag value
     */
    public String flag() {
        return this.flag;
    }

    /**
     * Set kind of feature. Required.
     *
     * @param flag the flag value to set
     * @return the SignalRFeature object itself.
     */
    public SignalRFeature withFlag(String flag) {
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
