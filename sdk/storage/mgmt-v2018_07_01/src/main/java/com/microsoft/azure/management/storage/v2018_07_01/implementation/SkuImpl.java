/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.storage.v2018_07_01.implementation;

import com.microsoft.azure.management.storage.v2018_07_01.Sku;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.storage.v2018_07_01.SKUCapability;
import com.microsoft.azure.management.storage.v2018_07_01.Kind;
import com.microsoft.azure.management.storage.v2018_07_01.SkuName;
import com.microsoft.azure.management.storage.v2018_07_01.Restriction;
import com.microsoft.azure.management.storage.v2018_07_01.SkuTier;

class SkuImpl extends WrapperImpl<SkuInner> implements Sku {
    private final StorageManager manager;

    SkuImpl(SkuInner inner,  StorageManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public StorageManager manager() {
        return this.manager;
    }



    @Override
    public List<SKUCapability> capabilities() {
        return this.inner().capabilities();
    }

    @Override
    public Kind kind() {
        return this.inner().kind();
    }

    @Override
    public List<String> locations() {
        return this.inner().locations();
    }

    @Override
    public SkuName name() {
        return this.inner().name();
    }

    @Override
    public String resourceType() {
        return this.inner().resourceType();
    }

    @Override
    public List<Restriction> restrictions() {
        return this.inner().restrictions();
    }

    @Override
    public SkuTier tier() {
        return this.inner().tier();
    }

}
