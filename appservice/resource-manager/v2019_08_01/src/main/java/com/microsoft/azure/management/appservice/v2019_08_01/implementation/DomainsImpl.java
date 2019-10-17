/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.appservice.v2019_08_01.Domains;
import com.microsoft.azure.management.appservice.v2019_08_01.Domain;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.appservice.v2019_08_01.DomainAvailabilityCheckResult;
import com.microsoft.azure.management.appservice.v2019_08_01.DomainControlCenterSsoRequest;
import com.microsoft.azure.management.appservice.v2019_08_01.NameIdentifier;
import com.microsoft.azure.management.appservice.v2019_08_01.DomainRecommendationSearchParameters;
import com.microsoft.azure.management.appservice.v2019_08_01.DomainOwnershipIdentifier;

class DomainsImpl extends GroupableResourcesCoreImpl<Domain, DomainImpl, DomainInner, DomainsInner, CertificateRegistrationManager>  implements Domains {
    protected DomainsImpl(CertificateRegistrationManager manager) {
        super(manager.inner().domains(), manager);
    }

    @Override
    protected Observable<DomainInner> getInnerAsync(String resourceGroupName, String name) {
        DomainsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        DomainsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<Domain> listByResourceGroup(String resourceGroupName) {
        DomainsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<Domain> listByResourceGroupAsync(String resourceGroupName) {
        DomainsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<DomainInner>, Iterable<DomainInner>>() {
            @Override
            public Iterable<DomainInner> call(Page<DomainInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DomainInner, Domain>() {
            @Override
            public Domain call(DomainInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<Domain> list() {
        DomainsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<Domain> listAsync() {
        DomainsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<DomainInner>, Iterable<DomainInner>>() {
            @Override
            public Iterable<DomainInner> call(Page<DomainInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DomainInner, Domain>() {
            @Override
            public Domain call(DomainInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public DomainImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Completable renewAsync(String resourceGroupName, String domainName) {
        DomainsInner client = this.inner();
        return client.renewAsync(resourceGroupName, domainName).toCompletable();
    }

    @Override
    public Observable<DomainAvailabilityCheckResult> checkAvailabilityAsync() {
        DomainsInner client = this.inner();
        return client.checkAvailabilityAsync()
        .map(new Func1<DomainAvailabilityCheckResultInner, DomainAvailabilityCheckResult>() {
            @Override
            public DomainAvailabilityCheckResult call(DomainAvailabilityCheckResultInner inner) {
                return new DomainAvailabilityCheckResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DomainControlCenterSsoRequest> getControlCenterSsoRequestAsync() {
        DomainsInner client = this.inner();
        return client.getControlCenterSsoRequestAsync()
        .map(new Func1<DomainControlCenterSsoRequestInner, DomainControlCenterSsoRequest>() {
            @Override
            public DomainControlCenterSsoRequest call(DomainControlCenterSsoRequestInner inner) {
                return new DomainControlCenterSsoRequestImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<NameIdentifier> listRecommendationsAsync(final DomainRecommendationSearchParameters parameters) {
        DomainsInner client = this.inner();
        return client.listRecommendationsAsync(parameters)
        .flatMapIterable(new Func1<Page<NameIdentifierInner>, Iterable<NameIdentifierInner>>() {
            @Override
            public Iterable<NameIdentifierInner> call(Page<NameIdentifierInner> page) {
                return page.items();
            }
        })
        .map(new Func1<NameIdentifierInner, NameIdentifier>() {
            @Override
            public NameIdentifier call(NameIdentifierInner inner) {
                return new NameIdentifierImpl(inner, manager());
            }
        });
    }

    @Override
    protected DomainImpl wrapModel(DomainInner inner) {
        return  new DomainImpl(inner.name(), inner, manager());
    }

    @Override
    protected DomainImpl wrapModel(String name) {
        return new DomainImpl(name, new DomainInner(), this.manager());
    }

    @Override
    public DomainOwnershipIdentifierImpl defineDomainOwnershipIdentifier(String name) {
        return wrapDomainOwnershipIdentifierModel(name);
    }

    private DomainOwnershipIdentifierImpl wrapDomainOwnershipIdentifierModel(String name) {
        return new DomainOwnershipIdentifierImpl(name, this.manager());
    }

    private DomainOwnershipIdentifierImpl wrapDomainOwnershipIdentifierModel(DomainOwnershipIdentifierInner inner) {
        return  new DomainOwnershipIdentifierImpl(inner, manager());
    }

    private Observable<DomainOwnershipIdentifierInner> getDomainOwnershipIdentifierInnerUsingDomainsInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String domainName = IdParsingUtils.getValueFromIdByName(id, "domains");
        String name = IdParsingUtils.getValueFromIdByName(id, "domainOwnershipIdentifiers");
        DomainsInner client = this.inner();
        return client.getOwnershipIdentifierAsync(resourceGroupName, domainName, name);
    }

    @Override
    public Observable<DomainOwnershipIdentifier> getOwnershipIdentifierAsync(String resourceGroupName, String domainName, String name) {
        DomainsInner client = this.inner();
        return client.getOwnershipIdentifierAsync(resourceGroupName, domainName, name)
        .map(new Func1<DomainOwnershipIdentifierInner, DomainOwnershipIdentifier>() {
            @Override
            public DomainOwnershipIdentifier call(DomainOwnershipIdentifierInner inner) {
                return wrapDomainOwnershipIdentifierModel(inner);
            }
       });
    }

    @Override
    public Observable<DomainOwnershipIdentifier> listOwnershipIdentifiersAsync(final String resourceGroupName, final String domainName) {
        DomainsInner client = this.inner();
        return client.listOwnershipIdentifiersAsync(resourceGroupName, domainName)
        .flatMapIterable(new Func1<Page<DomainOwnershipIdentifierInner>, Iterable<DomainOwnershipIdentifierInner>>() {
            @Override
            public Iterable<DomainOwnershipIdentifierInner> call(Page<DomainOwnershipIdentifierInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DomainOwnershipIdentifierInner, DomainOwnershipIdentifier>() {
            @Override
            public DomainOwnershipIdentifier call(DomainOwnershipIdentifierInner inner) {
                return wrapDomainOwnershipIdentifierModel(inner);
            }
        });
    }

    @Override
    public Completable deleteOwnershipIdentifierAsync(String resourceGroupName, String domainName, String name) {
        DomainsInner client = this.inner();
        return client.deleteOwnershipIdentifierAsync(resourceGroupName, domainName, name).toCompletable();
    }

}
