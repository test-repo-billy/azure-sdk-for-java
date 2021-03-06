// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.implementation.converters;

import com.azure.search.documents.indexes.models.KeywordMarkerTokenFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * A converter between {@link com.azure.search.documents.indexes.implementation.models.KeywordMarkerTokenFilter} and
 * {@link KeywordMarkerTokenFilter}.
 */
public final class KeywordMarkerTokenFilterConverter {
    /**
     * Maps from {@link com.azure.search.documents.indexes.implementation.models.KeywordMarkerTokenFilter} to
     * {@link KeywordMarkerTokenFilter}.
     */
    public static KeywordMarkerTokenFilter map(com.azure.search.documents.indexes.implementation.models.KeywordMarkerTokenFilter obj) {
        if (obj == null) {
            return null;
        }
        KeywordMarkerTokenFilter keywordMarkerTokenFilter = new KeywordMarkerTokenFilter();

        String name = obj.getName();
        keywordMarkerTokenFilter.setName(name);

        if (obj.getKeywords() != null) {
            List<String> keywords = new ArrayList<>(obj.getKeywords());
            keywordMarkerTokenFilter.setKeywords(keywords);
        }

        Boolean ignoreCase = obj.isIgnoreCase();
        keywordMarkerTokenFilter.setCaseIgnored(ignoreCase);
        return keywordMarkerTokenFilter;
    }

    /**
     * Maps from {@link KeywordMarkerTokenFilter} to
     * {@link com.azure.search.documents.indexes.implementation.models.KeywordMarkerTokenFilter}.
     */
    public static com.azure.search.documents.indexes.implementation.models.KeywordMarkerTokenFilter map(KeywordMarkerTokenFilter obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.indexes.implementation.models.KeywordMarkerTokenFilter keywordMarkerTokenFilter =
            new com.azure.search.documents.indexes.implementation.models.KeywordMarkerTokenFilter();

        String name = obj.getName();
        keywordMarkerTokenFilter.setName(name);

        if (obj.getKeywords() != null) {
            List<String> keywords = new ArrayList<>(obj.getKeywords());
            keywordMarkerTokenFilter.setKeywords(keywords);
        }

        Boolean ignoreCase = obj.isCaseIgnored();
        keywordMarkerTokenFilter.setIgnoreCase(ignoreCase);
        return keywordMarkerTokenFilter;
    }

    private KeywordMarkerTokenFilterConverter() {
    }
}
