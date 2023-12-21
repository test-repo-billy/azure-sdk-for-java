/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation;

import com.microsoft.azure.management.applicationinsights.v2015_05_01.ApplicationInsightsComponentWebTestLocation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;

class ApplicationInsightsComponentWebTestLocationImpl extends WrapperImpl<ApplicationInsightsComponentWebTestLocationInner> implements ApplicationInsightsComponentWebTestLocation {
    private final InsightsManager manager;

    ApplicationInsightsComponentWebTestLocationImpl(ApplicationInsightsComponentWebTestLocationInner inner,  InsightsManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public InsightsManager manager() {
        return this.manager;
    }



    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public String tag() {
        return this.inner().tag();
    }

}
