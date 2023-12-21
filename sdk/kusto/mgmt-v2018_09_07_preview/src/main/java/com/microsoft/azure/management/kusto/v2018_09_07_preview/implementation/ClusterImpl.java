/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2018_09_07_preview.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.kusto.v2018_09_07_preview.Cluster;
import rx.Observable;
import com.microsoft.azure.management.kusto.v2018_09_07_preview.ClusterUpdate;
import java.util.List;
import com.microsoft.azure.management.kusto.v2018_09_07_preview.State;
import com.microsoft.azure.management.kusto.v2018_09_07_preview.ProvisioningState;
import com.microsoft.azure.management.kusto.v2018_09_07_preview.TrustedExternalTenant;
import com.microsoft.azure.management.kusto.v2018_09_07_preview.AzureSku;
import rx.functions.Func1;

class ClusterImpl extends GroupableResourceCoreImpl<Cluster, ClusterInner, ClusterImpl, KustoManager> implements Cluster, Cluster.Definition, Cluster.Update {
    private ClusterUpdate updateParameter;
    ClusterImpl(String name, ClusterInner inner, KustoManager manager) {
        super(name, inner, manager);
        this.updateParameter = new ClusterUpdate();
    }

    @Override
    public Observable<Cluster> createResourceAsync() {
        ClustersInner client = this.manager().inner().clusters();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<ClusterInner, ClusterInner>() {
               @Override
               public ClusterInner call(ClusterInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Cluster> updateResourceAsync() {
        ClustersInner client = this.manager().inner().clusters();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<ClusterInner, ClusterInner>() {
               @Override
               public ClusterInner call(ClusterInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ClusterInner> getInnerAsync() {
        ClustersInner client = this.manager().inner().clusters();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new ClusterUpdate();
    }

    @Override
    public String dataIngestionUri() {
        return this.inner().dataIngestionUri();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public AzureSku sku() {
        AzureSkuInner inner = this.inner().sku();
        if (inner != null) {
            return  new AzureSkuImpl(inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public State state() {
        return this.inner().state();
    }

    @Override
    public List<TrustedExternalTenant> trustedExternalTenants() {
        return this.inner().trustedExternalTenants();
    }

    @Override
    public String uri() {
        return this.inner().uri();
    }

    @Override
    public ClusterImpl withSku(AzureSkuInner sku) {
        if (isInCreateMode()) {
            this.inner().withSku(sku);
        } else {
            this.updateParameter.withSku(sku);
        }
        return this;
    }

    @Override
    public ClusterImpl withTrustedExternalTenants(List<TrustedExternalTenant> trustedExternalTenants) {
        if (isInCreateMode()) {
            this.inner().withTrustedExternalTenants(trustedExternalTenants);
        } else {
            this.updateParameter.withTrustedExternalTenants(trustedExternalTenants);
        }
        return this;
    }

}
