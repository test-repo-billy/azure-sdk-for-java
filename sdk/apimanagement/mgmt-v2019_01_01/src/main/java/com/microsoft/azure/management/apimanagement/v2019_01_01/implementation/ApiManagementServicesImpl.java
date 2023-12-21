/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2019_01_01.ApiManagementServices;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.apimanagement.v2019_01_01.ApiManagementServiceResource;
import com.microsoft.azure.management.apimanagement.v2019_01_01.ApiManagementServiceGetSsoTokenResult;
import com.microsoft.azure.management.apimanagement.v2019_01_01.ApiManagementServiceNameAvailabilityResult;
import com.microsoft.azure.management.apimanagement.v2019_01_01.ApiManagementServiceBackupRestoreParameters;
import com.microsoft.azure.management.apimanagement.v2019_01_01.ApiManagementServiceUpdateParameters;

class ApiManagementServicesImpl extends WrapperImpl<ApiManagementServicesInner> implements ApiManagementServices {
    private final ApiManagementManager manager;

    ApiManagementServicesImpl(ApiManagementManager manager) {
        super(manager.inner().apiManagementServices());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ApiManagementServiceResource> restoreAsync(String resourceGroupName, String serviceName, ApiManagementServiceBackupRestoreParameters parameters) {
        ApiManagementServicesInner client = this.inner();
        return client.restoreAsync(resourceGroupName, serviceName, parameters)
        .map(new Func1<ApiManagementServiceResourceInner, ApiManagementServiceResource>() {
            @Override
            public ApiManagementServiceResource call(ApiManagementServiceResourceInner inner) {
                return new ApiManagementServiceResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ApiManagementServiceResource> backupAsync(String resourceGroupName, String serviceName, ApiManagementServiceBackupRestoreParameters parameters) {
        ApiManagementServicesInner client = this.inner();
        return client.backupAsync(resourceGroupName, serviceName, parameters)
        .map(new Func1<ApiManagementServiceResourceInner, ApiManagementServiceResource>() {
            @Override
            public ApiManagementServiceResource call(ApiManagementServiceResourceInner inner) {
                return new ApiManagementServiceResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ApiManagementServiceResource> createOrUpdateAsync(String resourceGroupName, String serviceName, ApiManagementServiceResourceInner parameters) {
        ApiManagementServicesInner client = this.inner();
        return client.createOrUpdateAsync(resourceGroupName, serviceName, parameters)
        .map(new Func1<ApiManagementServiceResourceInner, ApiManagementServiceResource>() {
            @Override
            public ApiManagementServiceResource call(ApiManagementServiceResourceInner inner) {
                return new ApiManagementServiceResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ApiManagementServiceResource> updateAsync(String resourceGroupName, String serviceName, ApiManagementServiceUpdateParameters parameters) {
        ApiManagementServicesInner client = this.inner();
        return client.updateAsync(resourceGroupName, serviceName, parameters)
        .map(new Func1<ApiManagementServiceResourceInner, ApiManagementServiceResource>() {
            @Override
            public ApiManagementServiceResource call(ApiManagementServiceResourceInner inner) {
                return new ApiManagementServiceResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ApiManagementServiceResource> getByResourceGroupAsync(String resourceGroupName, String serviceName) {
        ApiManagementServicesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, serviceName)
        .map(new Func1<ApiManagementServiceResourceInner, ApiManagementServiceResource>() {
            @Override
            public ApiManagementServiceResource call(ApiManagementServiceResourceInner inner) {
                return new ApiManagementServiceResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ApiManagementServiceResource> deleteAsync(String resourceGroupName, String serviceName) {
        ApiManagementServicesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serviceName)
        .map(new Func1<ApiManagementServiceResourceInner, ApiManagementServiceResource>() {
            @Override
            public ApiManagementServiceResource call(ApiManagementServiceResourceInner inner) {
                return new ApiManagementServiceResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ApiManagementServiceGetSsoTokenResult> getSsoTokenAsync(String resourceGroupName, String serviceName) {
        ApiManagementServicesInner client = this.inner();
        return client.getSsoTokenAsync(resourceGroupName, serviceName)
        .map(new Func1<ApiManagementServiceGetSsoTokenResultInner, ApiManagementServiceGetSsoTokenResult>() {
            @Override
            public ApiManagementServiceGetSsoTokenResult call(ApiManagementServiceGetSsoTokenResultInner inner) {
                return new ApiManagementServiceGetSsoTokenResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ApiManagementServiceResource> listByResourceGroupAsync(final String resourceGroupName) {
        ApiManagementServicesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<ApiManagementServiceResourceInner>, Iterable<ApiManagementServiceResourceInner>>() {
            @Override
            public Iterable<ApiManagementServiceResourceInner> call(Page<ApiManagementServiceResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ApiManagementServiceResourceInner, ApiManagementServiceResource>() {
            @Override
            public ApiManagementServiceResource call(ApiManagementServiceResourceInner inner) {
                return new ApiManagementServiceResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ApiManagementServiceResource> listAsync() {
        ApiManagementServicesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ApiManagementServiceResourceInner>, Iterable<ApiManagementServiceResourceInner>>() {
            @Override
            public Iterable<ApiManagementServiceResourceInner> call(Page<ApiManagementServiceResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ApiManagementServiceResourceInner, ApiManagementServiceResource>() {
            @Override
            public ApiManagementServiceResource call(ApiManagementServiceResourceInner inner) {
                return new ApiManagementServiceResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ApiManagementServiceNameAvailabilityResult> checkNameAvailabilityAsync(String name) {
        ApiManagementServicesInner client = this.inner();
        return client.checkNameAvailabilityAsync(name)
        .map(new Func1<ApiManagementServiceNameAvailabilityResultInner, ApiManagementServiceNameAvailabilityResult>() {
            @Override
            public ApiManagementServiceNameAvailabilityResult call(ApiManagementServiceNameAvailabilityResultInner inner) {
                return new ApiManagementServiceNameAvailabilityResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ApiManagementServiceResource> applyNetworkConfigurationUpdatesAsync(String resourceGroupName, String serviceName) {
        ApiManagementServicesInner client = this.inner();
        return client.applyNetworkConfigurationUpdatesAsync(resourceGroupName, serviceName)
        .map(new Func1<ApiManagementServiceResourceInner, ApiManagementServiceResource>() {
            @Override
            public ApiManagementServiceResource call(ApiManagementServiceResourceInner inner) {
                return new ApiManagementServiceResourceImpl(inner, manager());
            }
        });
    }

}
