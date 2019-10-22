/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_07_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The List service SAS credentials operation response.
 */
public class ListServiceSasResponseInner {
    /**
     * List service SAS credentials of specific resource.
     */
    @JsonProperty(value = "serviceSasToken", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceSasToken;

    /**
     * Get list service SAS credentials of specific resource.
     *
     * @return the serviceSasToken value
     */
    public String serviceSasToken() {
        return this.serviceSasToken;
    }

}
