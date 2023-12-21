/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_03_31_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ServerLevelPermissionsGroup.
 */
public final class ServerLevelPermissionsGroup extends ExpandableStringEnum<ServerLevelPermissionsGroup> {
    /** Static value Default for ServerLevelPermissionsGroup. */
    public static final ServerLevelPermissionsGroup DEFAULT = fromString("Default");

    /** Static value MigrationFromSqlServerToAzureDB for ServerLevelPermissionsGroup. */
    public static final ServerLevelPermissionsGroup MIGRATION_FROM_SQL_SERVER_TO_AZURE_DB = fromString("MigrationFromSqlServerToAzureDB");

    /**
     * Creates or finds a ServerLevelPermissionsGroup from its string representation.
     * @param name a name to look for
     * @return the corresponding ServerLevelPermissionsGroup
     */
    @JsonCreator
    public static ServerLevelPermissionsGroup fromString(String name) {
        return fromString(name, ServerLevelPermissionsGroup.class);
    }

    /**
     * @return known ServerLevelPermissionsGroup values
     */
    public static Collection<ServerLevelPermissionsGroup> values() {
        return values(ServerLevelPermissionsGroup.class);
    }
}
