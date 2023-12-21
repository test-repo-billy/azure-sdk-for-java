/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Recipient User details.
 */
@JsonFlatten
public class RecipientUserContractInner extends ProxyResource {
    /**
     * API Management UserId subscribed to notification.
     */
    @JsonProperty(value = "properties.userId")
    private String userId;

    /**
     * Get aPI Management UserId subscribed to notification.
     *
     * @return the userId value
     */
    public String userId() {
        return this.userId;
    }

    /**
     * Set aPI Management UserId subscribed to notification.
     *
     * @param userId the userId value to set
     * @return the RecipientUserContractInner object itself.
     */
    public RecipientUserContractInner withUserId(String userId) {
        this.userId = userId;
        return this;
    }

}
