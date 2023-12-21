/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The information of an AutoApprovedPrivateLinkService.
 */
public class AutoApprovedPrivateLinkServiceInner {
    /**
     * The id of the private link service resource.
     */
    @JsonProperty(value = "privateLinkService")
    private String privateLinkService;

    /**
     * Get the id of the private link service resource.
     *
     * @return the privateLinkService value
     */
    public String privateLinkService() {
        return this.privateLinkService;
    }

    /**
     * Set the id of the private link service resource.
     *
     * @param privateLinkService the privateLinkService value to set
     * @return the AutoApprovedPrivateLinkServiceInner object itself.
     */
    public AutoApprovedPrivateLinkServiceInner withPrivateLinkService(String privateLinkService) {
        this.privateLinkService = privateLinkService;
        return this;
    }

}
