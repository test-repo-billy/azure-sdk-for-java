/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.PrivateLinkResources;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.PrivateLinkResourceListResult;

class PrivateLinkResourcesImpl extends WrapperImpl<PrivateLinkResourcesInner> implements PrivateLinkResources {
    private final CognitiveServicesManager manager;

    PrivateLinkResourcesImpl(CognitiveServicesManager manager) {
        super(manager.inner().privateLinkResources());
        this.manager = manager;
    }

    public CognitiveServicesManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PrivateLinkResourceListResult> listAsync(String resourceGroupName, String accountName) {
        PrivateLinkResourcesInner client = this.inner();
        return client.listAsync(resourceGroupName, accountName)
        .map(new Func1<PrivateLinkResourceListResultInner, PrivateLinkResourceListResult>() {
            @Override
            public PrivateLinkResourceListResult call(PrivateLinkResourceListResultInner inner) {
                return new PrivateLinkResourceListResultImpl(inner, manager());
            }
        });
    }

}
