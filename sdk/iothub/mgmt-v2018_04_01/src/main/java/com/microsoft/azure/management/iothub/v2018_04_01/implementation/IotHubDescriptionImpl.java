/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_04_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.iothub.v2018_04_01.IotHubDescription;
import rx.Observable;
import com.microsoft.azure.management.iothub.v2018_04_01.IotHubProperties;
import com.microsoft.azure.management.iothub.v2018_04_01.IotHubSkuInfo;

class IotHubDescriptionImpl extends GroupableResourceCoreImpl<IotHubDescription, IotHubDescriptionInner, IotHubDescriptionImpl, IoTHubManager> implements IotHubDescription, IotHubDescription.Definition, IotHubDescription.Update {
    private String cifMatch;
    private String uifMatch;
    IotHubDescriptionImpl(String name, IotHubDescriptionInner inner, IoTHubManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<IotHubDescription> createResourceAsync() {
        IotHubResourcesInner client = this.manager().inner().iotHubResources();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner(), this.cifMatch)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<IotHubDescription> updateResourceAsync() {
        IotHubResourcesInner client = this.manager().inner().iotHubResources();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner(), this.uifMatch)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<IotHubDescriptionInner> getInnerAsync() {
        IotHubResourcesInner client = this.manager().inner().iotHubResources();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public IotHubProperties properties() {
        return this.inner().properties();
    }

    @Override
    public IotHubSkuInfo sku() {
        return this.inner().sku();
    }

    @Override
    public IotHubDescriptionImpl withSku(IotHubSkuInfo sku) {
        this.inner().withSku(sku);
        return this;
    }

    @Override
    public IotHubDescriptionImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.cifMatch = ifMatch;
        } else {
            this.uifMatch = ifMatch;
        }
        return this;
    }

    @Override
    public IotHubDescriptionImpl withEtag(String etag) {
        this.inner().withEtag(etag);
        return this;
    }

    @Override
    public IotHubDescriptionImpl withProperties(IotHubProperties properties) {
        this.inner().withProperties(properties);
        return this;
    }

}
