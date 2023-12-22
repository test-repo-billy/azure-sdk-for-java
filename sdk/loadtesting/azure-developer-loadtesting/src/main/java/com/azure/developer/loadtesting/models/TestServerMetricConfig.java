// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.developer.loadtesting.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Test server metrics configuration.
 */
@Immutable
public final class TestServerMetricConfig {
    /*
     * Test identifier
     */
    @Generated
    @JsonProperty(value = "testId", access = JsonProperty.Access.WRITE_ONLY)
    private String testId;

    /*
     * Azure resource metrics collection {metric id : metrics object} (Refer :
     * https://docs.microsoft.com/en-us/rest/api/monitor/metric-definitions/list#metricdefinition
     * for metric id).
     */
    @Generated
    @JsonProperty(value = "metrics")
    private Map<String, ResourceMetric> metrics;

    /*
     * The creation datetime(RFC 3339 literal format).
     */
    @Generated
    @JsonProperty(value = "createdDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdDateTime;

    /*
     * The user that created.
     */
    @Generated
    @JsonProperty(value = "createdBy", access = JsonProperty.Access.WRITE_ONLY)
    private String createdBy;

    /*
     * The last Modified datetime(RFC 3339 literal format).
     */
    @Generated
    @JsonProperty(value = "lastModifiedDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModifiedDateTime;

    /*
     * The user that last modified.
     */
    @Generated
    @JsonProperty(value = "lastModifiedBy", access = JsonProperty.Access.WRITE_ONLY)
    private String lastModifiedBy;

    /**
     * Creates an instance of TestServerMetricConfig class.
     * 
     * @param metrics the metrics value to set.
     */
    @Generated
    @JsonCreator
    public TestServerMetricConfig(@JsonProperty(value = "metrics") Map<String, ResourceMetric> metrics) {
        this.metrics = metrics;
    }

    /**
     * Get the testId property: Test identifier.
     * 
     * @return the testId value.
     */
    @Generated
    public String getTestId() {
        return this.testId;
    }

    /**
     * Get the metrics property: Azure resource metrics collection {metric id : metrics object} (Refer :
     * https://docs.microsoft.com/en-us/rest/api/monitor/metric-definitions/list#metricdefinition
     * for metric id).
     * 
     * @return the metrics value.
     */
    @Generated
    public Map<String, ResourceMetric> getMetrics() {
        return this.metrics;
    }

    /**
     * Get the createdDateTime property: The creation datetime(RFC 3339 literal format).
     * 
     * @return the createdDateTime value.
     */
    @Generated
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Get the createdBy property: The user that created.
     * 
     * @return the createdBy value.
     */
    @Generated
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Get the lastModifiedDateTime property: The last Modified datetime(RFC 3339 literal format).
     * 
     * @return the lastModifiedDateTime value.
     */
    @Generated
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }

    /**
     * Get the lastModifiedBy property: The user that last modified.
     * 
     * @return the lastModifiedBy value.
     */
    @Generated
    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }
}
