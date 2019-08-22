/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.quota.v2019_07_19.implementation;

import com.microsoft.azure.management.quota.v2019_07_19.LocationProviderQuotaRequestDetailsModel;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.quota.v2019_07_19.SubRequest;

class LocationProviderQuotaRequestDetailsModelImpl extends IndexableRefreshableWrapperImpl<LocationProviderQuotaRequestDetailsModel, QuotaRequestDetailsInner> implements LocationProviderQuotaRequestDetailsModel {
    private final CapacityManager manager;
    private String providerId;
    private String location;

    LocationProviderQuotaRequestDetailsModelImpl(QuotaRequestDetailsInner inner,  CapacityManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.providerId = IdParsingUtils.getValueFromIdByName(inner.id(), "providers");
        this.location = IdParsingUtils.getValueFromIdByName(inner.id(), "locations");
    }

    @Override
    public CapacityManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<QuotaRequestDetailsInner> getInnerAsync() {
        QuotaRequestStatusInner client = this.manager().inner().quotaRequestStatus();
        return client.getAsync(this.providerId, this.location);
    }



    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String message() {
        return this.inner().message();
    }

    @Override
    public Object requestStatus() {
        return this.inner().requestStatus();
    }

    @Override
    public DateTime requestSubmitTime() {
        return this.inner().requestSubmitTime();
    }

    @Override
    public List<SubRequest> value() {
        return this.inner().value();
    }

}
