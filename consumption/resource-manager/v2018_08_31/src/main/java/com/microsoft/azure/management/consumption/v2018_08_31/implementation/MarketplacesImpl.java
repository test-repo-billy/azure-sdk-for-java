/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.consumption.v2018_08_31.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.consumption.v2018_08_31.Marketplaces;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.consumption.v2018_08_31.Marketplace;

class MarketplacesImpl extends WrapperImpl<MarketplacesInner> implements Marketplaces {
    private final ConsumptionManager manager;

    MarketplacesImpl(ConsumptionManager manager) {
        super(manager.inner().marketplaces());
        this.manager = manager;
    }

    public ConsumptionManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Marketplace> listByBillingPeriodAsync(final String billingPeriodName) {
        MarketplacesInner client = this.inner();
        return client.listByBillingPeriodAsync(billingPeriodName)
        .flatMapIterable(new Func1<Page<MarketplaceInner>, Iterable<MarketplaceInner>>() {
            @Override
            public Iterable<MarketplaceInner> call(Page<MarketplaceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<MarketplaceInner, Marketplace>() {
            @Override
            public Marketplace call(MarketplaceInner inner) {
                return new MarketplaceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Marketplace> listByBillingAccountAsync(final String billingAccountId) {
        MarketplacesInner client = this.inner();
        return client.listByBillingAccountAsync(billingAccountId)
        .flatMapIterable(new Func1<Page<MarketplaceInner>, Iterable<MarketplaceInner>>() {
            @Override
            public Iterable<MarketplaceInner> call(Page<MarketplaceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<MarketplaceInner, Marketplace>() {
            @Override
            public Marketplace call(MarketplaceInner inner) {
                return new MarketplaceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Marketplace> listForBillingPeriodByBillingAccountAsync(final String billingAccountId, final String billingPeriodName) {
        MarketplacesInner client = this.inner();
        return client.listForBillingPeriodByBillingAccountAsync(billingAccountId, billingPeriodName)
        .flatMapIterable(new Func1<Page<MarketplaceInner>, Iterable<MarketplaceInner>>() {
            @Override
            public Iterable<MarketplaceInner> call(Page<MarketplaceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<MarketplaceInner, Marketplace>() {
            @Override
            public Marketplace call(MarketplaceInner inner) {
                return new MarketplaceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Marketplace> listByDepartmentAsync(final String departmentId) {
        MarketplacesInner client = this.inner();
        return client.listByDepartmentAsync(departmentId)
        .flatMapIterable(new Func1<Page<MarketplaceInner>, Iterable<MarketplaceInner>>() {
            @Override
            public Iterable<MarketplaceInner> call(Page<MarketplaceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<MarketplaceInner, Marketplace>() {
            @Override
            public Marketplace call(MarketplaceInner inner) {
                return new MarketplaceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Marketplace> listForBillingPeriodByDepartmentAsync(final String departmentId, final String billingPeriodName) {
        MarketplacesInner client = this.inner();
        return client.listForBillingPeriodByDepartmentAsync(departmentId, billingPeriodName)
        .flatMapIterable(new Func1<Page<MarketplaceInner>, Iterable<MarketplaceInner>>() {
            @Override
            public Iterable<MarketplaceInner> call(Page<MarketplaceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<MarketplaceInner, Marketplace>() {
            @Override
            public Marketplace call(MarketplaceInner inner) {
                return new MarketplaceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Marketplace> listByEnrollmentAccountAsync(final String enrollmentAccountId) {
        MarketplacesInner client = this.inner();
        return client.listByEnrollmentAccountAsync(enrollmentAccountId)
        .flatMapIterable(new Func1<Page<MarketplaceInner>, Iterable<MarketplaceInner>>() {
            @Override
            public Iterable<MarketplaceInner> call(Page<MarketplaceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<MarketplaceInner, Marketplace>() {
            @Override
            public Marketplace call(MarketplaceInner inner) {
                return new MarketplaceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Marketplace> listForBillingPeriodByEnrollmentAccountAsync(final String enrollmentAccountId, final String billingPeriodName) {
        MarketplacesInner client = this.inner();
        return client.listForBillingPeriodByEnrollmentAccountAsync(enrollmentAccountId, billingPeriodName)
        .flatMapIterable(new Func1<Page<MarketplaceInner>, Iterable<MarketplaceInner>>() {
            @Override
            public Iterable<MarketplaceInner> call(Page<MarketplaceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<MarketplaceInner, Marketplace>() {
            @Override
            public Marketplace call(MarketplaceInner inner) {
                return new MarketplaceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Marketplace> listAsync() {
        MarketplacesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<MarketplaceInner>, Iterable<MarketplaceInner>>() {
            @Override
            public Iterable<MarketplaceInner> call(Page<MarketplaceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<MarketplaceInner, Marketplace>() {
            @Override
            public Marketplace call(MarketplaceInner inner) {
                return new MarketplaceImpl(inner, manager());
            }
        });
    }

}
