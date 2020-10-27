/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.cdn.v2020_04_15.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cdn.v2020_04_15.Endpoints;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.cdn.v2020_04_15.Endpoint;
import com.microsoft.azure.management.cdn.v2020_04_15.ValidateCustomDomainOutput;
import com.microsoft.azure.management.cdn.v2020_04_15.ResourceUsage;
import java.util.List;

class EndpointsImpl extends WrapperImpl<EndpointsInner> implements Endpoints {
    private final CdnManager manager;

    EndpointsImpl(CdnManager manager) {
        super(manager.inner().endpoints());
        this.manager = manager;
    }

    public CdnManager manager() {
        return this.manager;
    }

    @Override
    public EndpointImpl define(String name) {
        return wrapModel(name);
    }

    private EndpointImpl wrapModel(EndpointInner inner) {
        return  new EndpointImpl(inner, manager());
    }

    private EndpointImpl wrapModel(String name) {
        return new EndpointImpl(name, this.manager());
    }

    @Override
    public Observable<Endpoint> startAsync(String resourceGroupName, String profileName, String endpointName) {
        EndpointsInner client = this.inner();
        return client.startAsync(resourceGroupName, profileName, endpointName)
        .map(new Func1<EndpointInner, Endpoint>() {
            @Override
            public Endpoint call(EndpointInner inner) {
                return new EndpointImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Endpoint> stopAsync(String resourceGroupName, String profileName, String endpointName) {
        EndpointsInner client = this.inner();
        return client.stopAsync(resourceGroupName, profileName, endpointName)
        .map(new Func1<EndpointInner, Endpoint>() {
            @Override
            public Endpoint call(EndpointInner inner) {
                return new EndpointImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable purgeContentAsync(String resourceGroupName, String profileName, String endpointName, List<String> contentPaths) {
        EndpointsInner client = this.inner();
        return client.purgeContentAsync(resourceGroupName, profileName, endpointName, contentPaths).toCompletable();
    }

    @Override
    public Completable loadContentAsync(String resourceGroupName, String profileName, String endpointName, List<String> contentPaths) {
        EndpointsInner client = this.inner();
        return client.loadContentAsync(resourceGroupName, profileName, endpointName, contentPaths).toCompletable();
    }

    @Override
    public Observable<ValidateCustomDomainOutput> validateCustomDomainAsync(String resourceGroupName, String profileName, String endpointName, String hostName) {
        EndpointsInner client = this.inner();
        return client.validateCustomDomainAsync(resourceGroupName, profileName, endpointName, hostName)
        .map(new Func1<ValidateCustomDomainOutputInner, ValidateCustomDomainOutput>() {
            @Override
            public ValidateCustomDomainOutput call(ValidateCustomDomainOutputInner inner) {
                return new ValidateCustomDomainOutputImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ResourceUsage> listResourceUsageAsync(final String resourceGroupName, final String profileName, final String endpointName) {
        EndpointsInner client = this.inner();
        return client.listResourceUsageAsync(resourceGroupName, profileName, endpointName)
        .flatMapIterable(new Func1<Page<ResourceUsageInner>, Iterable<ResourceUsageInner>>() {
            @Override
            public Iterable<ResourceUsageInner> call(Page<ResourceUsageInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ResourceUsageInner, ResourceUsage>() {
            @Override
            public ResourceUsage call(ResourceUsageInner inner) {
                return new ResourceUsageImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Endpoint> listByProfileAsync(final String resourceGroupName, final String profileName) {
        EndpointsInner client = this.inner();
        return client.listByProfileAsync(resourceGroupName, profileName)
        .flatMapIterable(new Func1<Page<EndpointInner>, Iterable<EndpointInner>>() {
            @Override
            public Iterable<EndpointInner> call(Page<EndpointInner> page) {
                return page.items();
            }
        })
        .map(new Func1<EndpointInner, Endpoint>() {
            @Override
            public Endpoint call(EndpointInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Endpoint> getAsync(String resourceGroupName, String profileName, String endpointName) {
        EndpointsInner client = this.inner();
        return client.getAsync(resourceGroupName, profileName, endpointName)
        .flatMap(new Func1<EndpointInner, Observable<Endpoint>>() {
            @Override
            public Observable<Endpoint> call(EndpointInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((Endpoint)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String profileName, String endpointName) {
        EndpointsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, profileName, endpointName).toCompletable();
    }

}
