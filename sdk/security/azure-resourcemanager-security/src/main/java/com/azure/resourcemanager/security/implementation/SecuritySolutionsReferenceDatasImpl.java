// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.SecuritySolutionsReferenceDatasClient;
import com.azure.resourcemanager.security.fluent.models.SecuritySolutionsReferenceDataListInner;
import com.azure.resourcemanager.security.models.SecuritySolutionsReferenceDataList;
import com.azure.resourcemanager.security.models.SecuritySolutionsReferenceDatas;

public final class SecuritySolutionsReferenceDatasImpl implements SecuritySolutionsReferenceDatas {
    private static final ClientLogger LOGGER = new ClientLogger(SecuritySolutionsReferenceDatasImpl.class);

    private final SecuritySolutionsReferenceDatasClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public SecuritySolutionsReferenceDatasImpl(SecuritySolutionsReferenceDatasClient innerClient,
        com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<SecuritySolutionsReferenceDataList> listWithResponse(Context context) {
        Response<SecuritySolutionsReferenceDataListInner> inner = this.serviceClient().listWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SecuritySolutionsReferenceDataListImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SecuritySolutionsReferenceDataList list() {
        SecuritySolutionsReferenceDataListInner inner = this.serviceClient().list();
        if (inner != null) {
            return new SecuritySolutionsReferenceDataListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SecuritySolutionsReferenceDataList> listByHomeRegionWithResponse(String ascLocation,
        Context context) {
        Response<SecuritySolutionsReferenceDataListInner> inner
            = this.serviceClient().listByHomeRegionWithResponse(ascLocation, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SecuritySolutionsReferenceDataListImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SecuritySolutionsReferenceDataList listByHomeRegion(String ascLocation) {
        SecuritySolutionsReferenceDataListInner inner = this.serviceClient().listByHomeRegion(ascLocation);
        if (inner != null) {
            return new SecuritySolutionsReferenceDataListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private SecuritySolutionsReferenceDatasClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
