// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The authentication type.
 */
public final class AuthType extends ExpandableStringEnum<AuthType> {
    /**
     * Static value systemAssignedIdentity for AuthType.
     */
    public static final AuthType SYSTEM_ASSIGNED_IDENTITY = fromString("systemAssignedIdentity");

    /**
     * Static value userAssignedIdentity for AuthType.
     */
    public static final AuthType USER_ASSIGNED_IDENTITY = fromString("userAssignedIdentity");

    /**
     * Static value servicePrincipalSecret for AuthType.
     */
    public static final AuthType SERVICE_PRINCIPAL_SECRET = fromString("servicePrincipalSecret");

    /**
     * Static value servicePrincipalCertificate for AuthType.
     */
    public static final AuthType SERVICE_PRINCIPAL_CERTIFICATE = fromString("servicePrincipalCertificate");

    /**
     * Static value secret for AuthType.
     */
    public static final AuthType SECRET = fromString("secret");

    /**
     * Static value accessKey for AuthType.
     */
    public static final AuthType ACCESS_KEY = fromString("accessKey");

    /**
     * Static value userAccount for AuthType.
     */
    public static final AuthType USER_ACCOUNT = fromString("userAccount");

    /**
     * Static value easyAuthMicrosoftEntraID for AuthType.
     */
    public static final AuthType EASY_AUTH_MICROSOFT_ENTRA_ID = fromString("easyAuthMicrosoftEntraID");

    /**
     * Creates a new instance of AuthType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AuthType() {
    }

    /**
     * Creates or finds a AuthType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AuthType.
     */
    @JsonCreator
    public static AuthType fromString(String name) {
        return fromString(name, AuthType.class);
    }

    /**
     * Gets known AuthType values.
     * 
     * @return known AuthType values.
     */
    public static Collection<AuthType> values() {
        return values(AuthType.class);
    }
}
