/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakeanalytics.v2016_11_01.implementation;

import com.microsoft.azure.management.datalakeanalytics.v2016_11_01.StorageAccountInformation;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;

class StorageAccountInformationImpl extends IndexableRefreshableWrapperImpl<StorageAccountInformation, StorageAccountInformationInner> implements StorageAccountInformation {
    private final DataLakeAnalyticsManager manager;
    private String resourceGroupName;
    private String accountName;
    private String storageAccountName;

    StorageAccountInformationImpl(StorageAccountInformationInner inner,  DataLakeAnalyticsManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "accounts");
        this.storageAccountName = IdParsingUtils.getValueFromIdByName(inner.id(), "storageAccounts");
    }

    @Override
    public DataLakeAnalyticsManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<StorageAccountInformationInner> getInnerAsync() {
        StorageAccountsInner client = this.manager().inner().storageAccounts();
        return client.getAsync(this.resourceGroupName, this.accountName, this.storageAccountName);
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
    public String suffix() {
        return this.inner().suffix();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
