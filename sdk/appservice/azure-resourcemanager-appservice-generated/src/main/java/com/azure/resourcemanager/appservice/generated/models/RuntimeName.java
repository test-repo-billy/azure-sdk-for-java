// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Function app runtime name. Available options: dotnet-isolated, node, java, powershell, python, custom.
 */
public final class RuntimeName extends ExpandableStringEnum<RuntimeName> {
    /**
     * Static value dotnet-isolated for RuntimeName.
     */
    public static final RuntimeName DOTNET_ISOLATED = fromString("dotnet-isolated");

    /**
     * Static value node for RuntimeName.
     */
    public static final RuntimeName NODE = fromString("node");

    /**
     * Static value java for RuntimeName.
     */
    public static final RuntimeName JAVA = fromString("java");

    /**
     * Static value powershell for RuntimeName.
     */
    public static final RuntimeName POWERSHELL = fromString("powershell");

    /**
     * Static value python for RuntimeName.
     */
    public static final RuntimeName PYTHON = fromString("python");

    /**
     * Static value custom for RuntimeName.
     */
    public static final RuntimeName CUSTOM = fromString("custom");

    /**
     * Creates a new instance of RuntimeName value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RuntimeName() {
    }

    /**
     * Creates or finds a RuntimeName from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RuntimeName.
     */
    @JsonCreator
    public static RuntimeName fromString(String name) {
        return fromString(name, RuntimeName.class);
    }

    /**
     * Gets known RuntimeName values.
     * 
     * @return known RuntimeName values.
     */
    public static Collection<RuntimeName> values() {
        return values(RuntimeName.class);
    }
}
