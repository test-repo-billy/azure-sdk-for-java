// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Contact Point Use
 * See: http://hl7.org/fhir/ValueSet/contact-point-use.
 */
public final class ContactPointUse extends ExpandableStringEnum<ContactPointUse> {
    /**
     * Home.
     */
    @Generated
    public static final ContactPointUse HOME = fromString("home");

    /**
     * Work.
     */
    @Generated
    public static final ContactPointUse WORK = fromString("work");

    /**
     * Temp.
     */
    @Generated
    public static final ContactPointUse TEMP = fromString("temp");

    /**
     * Old.
     */
    @Generated
    public static final ContactPointUse OLD = fromString("old");

    /**
     * Mobile.
     */
    @Generated
    public static final ContactPointUse MOBILE = fromString("mobile");

    /**
     * Creates a new instance of ContactPointUse value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public ContactPointUse() {
    }

    /**
     * Creates or finds a ContactPointUse from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ContactPointUse.
     */
    @Generated
    @JsonCreator
    public static ContactPointUse fromString(String name) {
        return fromString(name, ContactPointUse.class);
    }

    /**
     * Gets known ContactPointUse values.
     * 
     * @return known ContactPointUse values.
     */
    @Generated
    public static Collection<ContactPointUse> values() {
        return values(ContactPointUse.class);
    }
}
