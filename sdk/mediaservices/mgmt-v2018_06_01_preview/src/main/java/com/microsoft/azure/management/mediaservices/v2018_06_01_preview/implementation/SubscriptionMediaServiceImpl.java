/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_06_01_preview.implementation;

import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.SubscriptionMediaService;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.UUID;
import java.util.List;
import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.StorageAccount;
import java.util.Map;

class SubscriptionMediaServiceImpl extends WrapperImpl<SubscriptionMediaServiceInner> implements SubscriptionMediaService {
    private final MediaManager manager;
    SubscriptionMediaServiceImpl(SubscriptionMediaServiceInner inner, MediaManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public MediaManager manager() {
        return this.manager;
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public UUID mediaServiceId() {
        return this.inner().mediaServiceId();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<StorageAccount> storageAccounts() {
        return this.inner().storageAccounts();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
