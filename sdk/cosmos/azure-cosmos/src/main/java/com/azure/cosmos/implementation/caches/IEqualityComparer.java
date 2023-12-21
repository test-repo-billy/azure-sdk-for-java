// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.implementation.caches;

interface IEqualityComparer<TValue> {
    boolean areEqual(TValue v1, TValue v2);
}
