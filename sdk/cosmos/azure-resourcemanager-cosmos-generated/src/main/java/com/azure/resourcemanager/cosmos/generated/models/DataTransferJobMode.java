// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Mode of job execution.
 */
public final class DataTransferJobMode extends ExpandableStringEnum<DataTransferJobMode> {
    /**
     * Static value Offline for DataTransferJobMode.
     */
    public static final DataTransferJobMode OFFLINE = fromString("Offline");

    /**
     * Static value Online for DataTransferJobMode.
     */
    public static final DataTransferJobMode ONLINE = fromString("Online");

    /**
     * Creates a new instance of DataTransferJobMode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DataTransferJobMode() {
    }

    /**
     * Creates or finds a DataTransferJobMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DataTransferJobMode.
     */
    @JsonCreator
    public static DataTransferJobMode fromString(String name) {
        return fromString(name, DataTransferJobMode.class);
    }

    /**
     * Gets known DataTransferJobMode values.
     * 
     * @return known DataTransferJobMode values.
     */
    public static Collection<DataTransferJobMode> values() {
        return values(DataTransferJobMode.class);
    }
}
