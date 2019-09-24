/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.mediaservices.v2018_03_30_preview.StreamingEndpoints;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.mediaservices.v2018_03_30_preview.StreamingEndpoint;

class StreamingEndpointsImpl extends WrapperImpl<StreamingEndpointsInner> implements StreamingEndpoints {
    private final MediaManager manager;

    StreamingEndpointsImpl(MediaManager manager) {
        super(manager.inner().streamingEndpoints());
        this.manager = manager;
    }

    public MediaManager manager() {
        return this.manager;
    }

    @Override
    public StreamingEndpointImpl define(String name) {
        return wrapModel(name);
    }

    private StreamingEndpointImpl wrapModel(StreamingEndpointInner inner) {
        return  new StreamingEndpointImpl(inner, manager());
    }

    private StreamingEndpointImpl wrapModel(String name) {
        return new StreamingEndpointImpl(name, this.manager());
    }

    @Override
    public Completable startAsync(String resourceGroupName, String accountName, String streamingEndpointName) {
        StreamingEndpointsInner client = this.inner();
        return client.startAsync(resourceGroupName, accountName, streamingEndpointName).toCompletable();
    }

    @Override
    public Completable stopAsync(String resourceGroupName, String accountName, String streamingEndpointName) {
        StreamingEndpointsInner client = this.inner();
        return client.stopAsync(resourceGroupName, accountName, streamingEndpointName).toCompletable();
    }

    @Override
    public Completable scaleAsync(String resourceGroupName, String accountName, String streamingEndpointName) {
        StreamingEndpointsInner client = this.inner();
        return client.scaleAsync(resourceGroupName, accountName, streamingEndpointName).toCompletable();
    }

    @Override
    public Observable<StreamingEndpoint> listAsync(final String resourceGroupName, final String accountName) {
        StreamingEndpointsInner client = this.inner();
        return client.listAsync(resourceGroupName, accountName)
        .flatMapIterable(new Func1<Page<StreamingEndpointInner>, Iterable<StreamingEndpointInner>>() {
            @Override
            public Iterable<StreamingEndpointInner> call(Page<StreamingEndpointInner> page) {
                return page.items();
            }
        })
        .map(new Func1<StreamingEndpointInner, StreamingEndpoint>() {
            @Override
            public StreamingEndpoint call(StreamingEndpointInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<StreamingEndpoint> getAsync(String resourceGroupName, String accountName, String streamingEndpointName) {
        StreamingEndpointsInner client = this.inner();
        return client.getAsync(resourceGroupName, accountName, streamingEndpointName)
        .map(new Func1<StreamingEndpointInner, StreamingEndpoint>() {
            @Override
            public StreamingEndpoint call(StreamingEndpointInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String accountName, String streamingEndpointName) {
        StreamingEndpointsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, accountName, streamingEndpointName).toCompletable();
    }

}
