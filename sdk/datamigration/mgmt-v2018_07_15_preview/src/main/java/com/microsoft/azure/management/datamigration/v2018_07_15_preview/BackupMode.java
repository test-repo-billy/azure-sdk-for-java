/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for BackupMode.
 */
public final class BackupMode extends ExpandableStringEnum<BackupMode> {
    /** Static value CreateBackup for BackupMode. */
    public static final BackupMode CREATE_BACKUP = fromString("CreateBackup");

    /** Static value ExistingBackup for BackupMode. */
    public static final BackupMode EXISTING_BACKUP = fromString("ExistingBackup");

    /**
     * Creates or finds a BackupMode from its string representation.
     * @param name a name to look for
     * @return the corresponding BackupMode
     */
    @JsonCreator
    public static BackupMode fromString(String name) {
        return fromString(name, BackupMode.class);
    }

    /**
     * @return known BackupMode values
     */
    public static Collection<BackupMode> values() {
        return values(BackupMode.class);
    }
}
