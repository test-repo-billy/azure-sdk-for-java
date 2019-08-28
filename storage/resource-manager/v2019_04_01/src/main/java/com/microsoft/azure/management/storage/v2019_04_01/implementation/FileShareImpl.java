/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_04_01.implementation;

import com.microsoft.azure.management.storage.v2019_04_01.FileShare;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.Map;
import org.joda.time.DateTime;

class FileShareImpl extends CreatableUpdatableImpl<FileShare, FileShareInner, FileShareImpl> implements FileShare, FileShare.Definition, FileShare.Update {
    private final StorageManager manager;
    private String resourceGroupName;
    private String accountName;
    private String shareName;
    private Map<String, String> cmetadata;
    private Integer cshareQuota;
    private Map<String, String> umetadata;
    private Integer ushareQuota;

    FileShareImpl(String name, StorageManager manager) {
        super(name, new FileShareInner());
        this.manager = manager;
        // Set resource name
        this.shareName = name;
        //
    }

    FileShareImpl(FileShareInner inner, StorageManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.shareName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "storageAccounts");
        this.shareName = IdParsingUtils.getValueFromIdByName(inner.id(), "shares");
        //
    }

    @Override
    public StorageManager manager() {
        return this.manager;
    }

    @Override
    public Observable<FileShare> createResourceAsync() {
        FileSharesInner client = this.manager().inner().fileShares();
        return client.createAsync(this.resourceGroupName, this.accountName, this.shareName, this.cmetadata, this.cshareQuota)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<FileShare> updateResourceAsync() {
        FileSharesInner client = this.manager().inner().fileShares();
        return client.updateAsync(this.resourceGroupName, this.accountName, this.shareName, this.umetadata, this.ushareQuota)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<FileShareInner> getInnerAsync() {
        FileSharesInner client = this.manager().inner().fileShares();
        return null; // NOP getInnerAsync implementation as get is not supported
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
    public String id() {
        return this.inner().id();
    }

    @Override
    public DateTime lastModifiedTime() {
        return this.inner().lastModifiedTime();
    }

    @Override
    public Map<String, String> metadata() {
        return this.inner().metadata();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Integer shareQuota() {
        return this.inner().shareQuota();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public FileShareImpl withExistingFileService(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    @Override
    public FileShareImpl withMetadata(Map<String, String> metadata) {
        if (isInCreateMode()) {
            this.cmetadata = metadata;
        } else {
            this.umetadata = metadata;
        }
        return this;
    }

    @Override
    public FileShareImpl withShareQuota(Integer shareQuota) {
        if (isInCreateMode()) {
            this.cshareQuota = shareQuota;
        } else {
            this.ushareQuota = shareQuota;
        }
        return this;
    }

}
