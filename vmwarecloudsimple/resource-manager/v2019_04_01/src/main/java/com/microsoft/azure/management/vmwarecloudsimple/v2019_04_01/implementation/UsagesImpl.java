/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.Usages;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.Usage;

class UsagesImpl extends WrapperImpl<UsagesInner> implements Usages {
    private final VMwareCloudSimpleManager manager;

    UsagesImpl(VMwareCloudSimpleManager manager) {
        super(manager.inner().usages());
        this.manager = manager;
    }

    public VMwareCloudSimpleManager manager() {
        return this.manager;
    }

    private UsageImpl wrapModel(UsageInner inner) {
        return  new UsageImpl(inner, manager());
    }

    @Override
    public Observable<Usage> listAsync(final String regionId) {
        UsagesInner client = this.inner();
        return client.listAsync(regionId)
        .flatMapIterable(new Func1<Page<UsageInner>, Iterable<UsageInner>>() {
            @Override
            public Iterable<UsageInner> call(Page<UsageInner> page) {
                return page.items();
            }
        })
        .map(new Func1<UsageInner, Usage>() {
            @Override
            public Usage call(UsageInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
