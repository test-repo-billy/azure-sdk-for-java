/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2015_03_20.implementation;

import com.microsoft.azure.management.loganalytics.v2015_03_20.SavedSearchesListResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.loganalytics.v2015_03_20.SearchMetadata;
import java.util.List;

class SavedSearchesListResultImpl extends WrapperImpl<SavedSearchesListResultInner> implements SavedSearchesListResult {
    private final LogAnalyticsManager manager;
    SavedSearchesListResultImpl(SavedSearchesListResultInner inner, LogAnalyticsManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public LogAnalyticsManager manager() {
        return this.manager;
    }

    @Override
    public SearchMetadata metadata() {
        return this.inner().metadata();
    }

    @Override
    public List<SavedSearchInner> value() {
        return this.inner().value();
    }

}
