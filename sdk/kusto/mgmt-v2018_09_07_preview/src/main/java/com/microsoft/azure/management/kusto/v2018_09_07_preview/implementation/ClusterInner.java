/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2018_09_07_preview.implementation;

import com.microsoft.azure.management.kusto.v2018_09_07_preview.State;
import com.microsoft.azure.management.kusto.v2018_09_07_preview.ProvisioningState;
import java.util.List;
import com.microsoft.azure.management.kusto.v2018_09_07_preview.TrustedExternalTenant;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Class representing a Kusto cluster.
 */
@JsonFlatten
public class ClusterInner extends Resource {
    /**
     * An ETag of the resource created.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * The SKU of the cluster.
     */
    @JsonProperty(value = "sku", required = true)
    private AzureSkuInner sku;

    /**
     * The state of the resource. Possible values include: 'Creating',
     * 'Unavailable', 'Running', 'Deleting', 'Deleted', 'Stopping', 'Stopped',
     * 'Starting'.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private State state;

    /**
     * The provisioned state of the resource. Possible values include:
     * 'Running', 'Creating', 'Deleting', 'Succeeded', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The cluster URI.
     */
    @JsonProperty(value = "properties.uri", access = JsonProperty.Access.WRITE_ONLY)
    private String uri;

    /**
     * The cluster data ingestion URI.
     */
    @JsonProperty(value = "properties.dataIngestionUri", access = JsonProperty.Access.WRITE_ONLY)
    private String dataIngestionUri;

    /**
     * The cluster's external tenants.
     */
    @JsonProperty(value = "properties.trustedExternalTenants")
    private List<TrustedExternalTenant> trustedExternalTenants;

    /**
     * Get an ETag of the resource created.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the SKU of the cluster.
     *
     * @return the sku value
     */
    public AzureSkuInner sku() {
        return this.sku;
    }

    /**
     * Set the SKU of the cluster.
     *
     * @param sku the sku value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withSku(AzureSkuInner sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the state of the resource. Possible values include: 'Creating', 'Unavailable', 'Running', 'Deleting', 'Deleted', 'Stopping', 'Stopped', 'Starting'.
     *
     * @return the state value
     */
    public State state() {
        return this.state;
    }

    /**
     * Get the provisioned state of the resource. Possible values include: 'Running', 'Creating', 'Deleting', 'Succeeded', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the cluster URI.
     *
     * @return the uri value
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Get the cluster data ingestion URI.
     *
     * @return the dataIngestionUri value
     */
    public String dataIngestionUri() {
        return this.dataIngestionUri;
    }

    /**
     * Get the cluster's external tenants.
     *
     * @return the trustedExternalTenants value
     */
    public List<TrustedExternalTenant> trustedExternalTenants() {
        return this.trustedExternalTenants;
    }

    /**
     * Set the cluster's external tenants.
     *
     * @param trustedExternalTenants the trustedExternalTenants value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withTrustedExternalTenants(List<TrustedExternalTenant> trustedExternalTenants) {
        this.trustedExternalTenants = trustedExternalTenants;
        return this;
    }

}
