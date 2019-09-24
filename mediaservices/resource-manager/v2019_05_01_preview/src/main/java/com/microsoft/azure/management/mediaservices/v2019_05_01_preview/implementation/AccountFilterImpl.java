/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview.implementation;

import com.microsoft.azure.management.mediaservices.v2019_05_01_preview.AccountFilter;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.mediaservices.v2019_05_01_preview.PresentationTimeRange;
import com.microsoft.azure.management.mediaservices.v2019_05_01_preview.FirstQuality;
import java.util.List;
import com.microsoft.azure.management.mediaservices.v2019_05_01_preview.FilterTrackSelection;

class AccountFilterImpl extends CreatableUpdatableImpl<AccountFilter, AccountFilterInner, AccountFilterImpl> implements AccountFilter, AccountFilter.Definition, AccountFilter.Update {
    private final MediaManager manager;
    private String resourceGroupName;
    private String accountName;
    private String filterName;

    AccountFilterImpl(String name, MediaManager manager) {
        super(name, new AccountFilterInner());
        this.manager = manager;
        // Set resource name
        this.filterName = name;
        //
    }

    AccountFilterImpl(AccountFilterInner inner, MediaManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.filterName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "mediaServices");
        this.filterName = IdParsingUtils.getValueFromIdByName(inner.id(), "accountFilters");
        //
    }

    @Override
    public MediaManager manager() {
        return this.manager;
    }

    @Override
    public Observable<AccountFilter> createResourceAsync() {
        AccountFiltersInner client = this.manager().inner().accountFilters();
        return client.createOrUpdateAsync(this.resourceGroupName, this.accountName, this.filterName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<AccountFilter> updateResourceAsync() {
        AccountFiltersInner client = this.manager().inner().accountFilters();
        return client.updateAsync(this.resourceGroupName, this.accountName, this.filterName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<AccountFilterInner> getInnerAsync() {
        AccountFiltersInner client = this.manager().inner().accountFilters();
        return client.getAsync(this.resourceGroupName, this.accountName, this.filterName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public FirstQuality firstQuality() {
        return this.inner().firstQuality();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public PresentationTimeRange presentationTimeRange() {
        return this.inner().presentationTimeRange();
    }

    @Override
    public List<FilterTrackSelection> tracks() {
        return this.inner().tracks();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public AccountFilterImpl withExistingMediaservice(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    @Override
    public AccountFilterImpl withFirstQuality(FirstQuality firstQuality) {
        this.inner().withFirstQuality(firstQuality);
        return this;
    }

    @Override
    public AccountFilterImpl withPresentationTimeRange(PresentationTimeRange presentationTimeRange) {
        this.inner().withPresentationTimeRange(presentationTimeRange);
        return this;
    }

    @Override
    public AccountFilterImpl withTracks(List<FilterTrackSelection> tracks) {
        this.inner().withTracks(tracks);
        return this;
    }

}
