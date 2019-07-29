/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity SQL Data Warehouse sink.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SqlDWSink")
public class SqlDWSink extends CopySink {
    /**
     * SQL pre-copy script. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "preCopyScript")
    private Object preCopyScript;

    /**
     * Indicates to use PolyBase to copy data into SQL Data Warehouse when
     * applicable. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "allowPolyBase")
    private Object allowPolyBase;

    /**
     * Specifies PolyBase-related settings when allowPolyBase is true.
     */
    @JsonProperty(value = "polyBaseSettings")
    private PolybaseSettings polyBaseSettings;

    /**
     * Get sQL pre-copy script. Type: string (or Expression with resultType string).
     *
     * @return the preCopyScript value
     */
    public Object preCopyScript() {
        return this.preCopyScript;
    }

    /**
     * Set sQL pre-copy script. Type: string (or Expression with resultType string).
     *
     * @param preCopyScript the preCopyScript value to set
     * @return the SqlDWSink object itself.
     */
    public SqlDWSink withPreCopyScript(Object preCopyScript) {
        this.preCopyScript = preCopyScript;
        return this;
    }

    /**
     * Get indicates to use PolyBase to copy data into SQL Data Warehouse when applicable. Type: boolean (or Expression with resultType boolean).
     *
     * @return the allowPolyBase value
     */
    public Object allowPolyBase() {
        return this.allowPolyBase;
    }

    /**
     * Set indicates to use PolyBase to copy data into SQL Data Warehouse when applicable. Type: boolean (or Expression with resultType boolean).
     *
     * @param allowPolyBase the allowPolyBase value to set
     * @return the SqlDWSink object itself.
     */
    public SqlDWSink withAllowPolyBase(Object allowPolyBase) {
        this.allowPolyBase = allowPolyBase;
        return this;
    }

    /**
     * Get specifies PolyBase-related settings when allowPolyBase is true.
     *
     * @return the polyBaseSettings value
     */
    public PolybaseSettings polyBaseSettings() {
        return this.polyBaseSettings;
    }

    /**
     * Set specifies PolyBase-related settings when allowPolyBase is true.
     *
     * @param polyBaseSettings the polyBaseSettings value to set
     * @return the SqlDWSink object itself.
     */
    public SqlDWSink withPolyBaseSettings(PolybaseSettings polyBaseSettings) {
        this.polyBaseSettings = polyBaseSettings;
        return this;
    }

}
