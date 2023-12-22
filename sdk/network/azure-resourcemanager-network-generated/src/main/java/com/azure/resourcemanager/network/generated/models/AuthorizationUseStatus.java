// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The authorization use status.
 */
public final class AuthorizationUseStatus extends ExpandableStringEnum<AuthorizationUseStatus> {
    /**
     * Static value Available for AuthorizationUseStatus.
     */
    public static final AuthorizationUseStatus AVAILABLE = fromString("Available");

    /**
     * Static value InUse for AuthorizationUseStatus.
     */
    public static final AuthorizationUseStatus IN_USE = fromString("InUse");

    /**
     * Creates a new instance of AuthorizationUseStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AuthorizationUseStatus() {
    }

    /**
     * Creates or finds a AuthorizationUseStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AuthorizationUseStatus.
     */
    @JsonCreator
    public static AuthorizationUseStatus fromString(String name) {
        return fromString(name, AuthorizationUseStatus.class);
    }

    /**
     * Gets known AuthorizationUseStatus values.
     * 
     * @return known AuthorizationUseStatus values.
     */
    public static Collection<AuthorizationUseStatus> values() {
        return values(AuthorizationUseStatus.class);
    }
}
