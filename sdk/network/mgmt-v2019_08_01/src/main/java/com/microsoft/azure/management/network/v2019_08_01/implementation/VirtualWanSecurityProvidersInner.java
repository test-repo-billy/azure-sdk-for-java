/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_08_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2019_08_01.VirtualWanSecurityProvider;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Collection of SecurityProviders.
 */
public class VirtualWanSecurityProvidersInner {
    /**
     * List of VirtualWAN security providers.
     */
    @JsonProperty(value = "supportedProviders")
    private List<VirtualWanSecurityProvider> supportedProviders;

    /**
     * Get list of VirtualWAN security providers.
     *
     * @return the supportedProviders value
     */
    public List<VirtualWanSecurityProvider> supportedProviders() {
        return this.supportedProviders;
    }

    /**
     * Set list of VirtualWAN security providers.
     *
     * @param supportedProviders the supportedProviders value to set
     * @return the VirtualWanSecurityProvidersInner object itself.
     */
    public VirtualWanSecurityProvidersInner withSupportedProviders(List<VirtualWanSecurityProvider> supportedProviders) {
        this.supportedProviders = supportedProviders;
        return this;
    }

}
