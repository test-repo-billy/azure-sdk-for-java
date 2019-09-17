/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Identifies the Azure key vault associated with a Batch account.
 */
public class KeyVaultReference {
    /**
     * The resource ID of the Azure key vault associated with the Batch
     * account.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * The URL of the Azure key vault associated with the Batch account.
     */
    @JsonProperty(value = "url", required = true)
    private String url;

    /**
     * Get the resource ID of the Azure key vault associated with the Batch account.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the resource ID of the Azure key vault associated with the Batch account.
     *
     * @param id the id value to set
     * @return the KeyVaultReference object itself.
     */
    public KeyVaultReference withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the URL of the Azure key vault associated with the Batch account.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the URL of the Azure key vault associated with the Batch account.
     *
     * @param url the url value to set
     * @return the KeyVaultReference object itself.
     */
    public KeyVaultReference withUrl(String url) {
        this.url = url;
        return this;
    }

}
