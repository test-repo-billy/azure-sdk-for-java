// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * When matchVariable is a collection, operate on the selector to specify which elements in the collection this rule
 * applies to.
 */
public final class ScrubbingRuleEntryMatchOperator extends ExpandableStringEnum<ScrubbingRuleEntryMatchOperator> {
    /**
     * Static value Equals for ScrubbingRuleEntryMatchOperator.
     */
    public static final ScrubbingRuleEntryMatchOperator EQUALS = fromString("Equals");

    /**
     * Static value EqualsAny for ScrubbingRuleEntryMatchOperator.
     */
    public static final ScrubbingRuleEntryMatchOperator EQUALS_ANY = fromString("EqualsAny");

    /**
     * Creates a new instance of ScrubbingRuleEntryMatchOperator value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ScrubbingRuleEntryMatchOperator() {
    }

    /**
     * Creates or finds a ScrubbingRuleEntryMatchOperator from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ScrubbingRuleEntryMatchOperator.
     */
    @JsonCreator
    public static ScrubbingRuleEntryMatchOperator fromString(String name) {
        return fromString(name, ScrubbingRuleEntryMatchOperator.class);
    }

    /**
     * Gets known ScrubbingRuleEntryMatchOperator values.
     * 
     * @return known ScrubbingRuleEntryMatchOperator values.
     */
    public static Collection<ScrubbingRuleEntryMatchOperator> values() {
        return values(ScrubbingRuleEntryMatchOperator.class);
    }
}
