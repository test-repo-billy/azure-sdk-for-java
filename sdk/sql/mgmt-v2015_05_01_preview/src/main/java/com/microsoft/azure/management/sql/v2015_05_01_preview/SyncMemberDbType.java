/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SyncMemberDbType.
 */
public final class SyncMemberDbType extends ExpandableStringEnum<SyncMemberDbType> {
    /** Static value AzureSqlDatabase for SyncMemberDbType. */
    public static final SyncMemberDbType AZURE_SQL_DATABASE = fromString("AzureSqlDatabase");

    /** Static value SqlServerDatabase for SyncMemberDbType. */
    public static final SyncMemberDbType SQL_SERVER_DATABASE = fromString("SqlServerDatabase");

    /**
     * Creates or finds a SyncMemberDbType from its string representation.
     * @param name a name to look for
     * @return the corresponding SyncMemberDbType
     */
    @JsonCreator
    public static SyncMemberDbType fromString(String name) {
        return fromString(name, SyncMemberDbType.class);
    }

    /**
     * @return known SyncMemberDbType values
     */
    public static Collection<SyncMemberDbType> values() {
        return values(SyncMemberDbType.class);
    }
}
