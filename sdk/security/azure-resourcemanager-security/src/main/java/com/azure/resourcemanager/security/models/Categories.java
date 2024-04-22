// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The categories of resource that is at risk when the assessment is unhealthy.
 */
public final class Categories extends ExpandableStringEnum<Categories> {
    /**
     * Static value Compute for Categories.
     */
    public static final Categories COMPUTE = fromString("Compute");

    /**
     * Static value Networking for Categories.
     */
    public static final Categories NETWORKING = fromString("Networking");

    /**
     * Static value Data for Categories.
     */
    public static final Categories DATA = fromString("Data");

    /**
     * Static value IdentityAndAccess for Categories.
     */
    public static final Categories IDENTITY_AND_ACCESS = fromString("IdentityAndAccess");

    /**
     * Static value IoT for Categories.
     */
    public static final Categories IOT = fromString("IoT");

    /**
     * Creates a new instance of Categories value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Categories() {
    }

    /**
     * Creates or finds a Categories from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding Categories.
     */
    @JsonCreator
    public static Categories fromString(String name) {
        return fromString(name, Categories.class);
    }

    /**
     * Gets known Categories values.
     * 
     * @return known Categories values.
     */
    public static Collection<Categories> values() {
        return values(Categories.class);
    }
}
