/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * DatabricksNotebook activity.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = DatabricksNotebookActivity.class)
@JsonTypeName("DatabricksNotebook")
@JsonFlatten
public class DatabricksNotebookActivity extends ExecutionActivity {
    /**
     * The absolute path of the notebook to be run in the Databricks Workspace.
     * This path must begin with a slash. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.notebookPath", required = true)
    private Object notebookPath;

    /**
     * Base parameters to be used for each run of this job.If the notebook
     * takes a parameter that is not specified, the default value from the
     * notebook will be used.
     */
    @JsonProperty(value = "typeProperties.baseParameters")
    private Map<String, Object> baseParameters;

    /**
     * Get the absolute path of the notebook to be run in the Databricks Workspace. This path must begin with a slash. Type: string (or Expression with resultType string).
     *
     * @return the notebookPath value
     */
    public Object notebookPath() {
        return this.notebookPath;
    }

    /**
     * Set the absolute path of the notebook to be run in the Databricks Workspace. This path must begin with a slash. Type: string (or Expression with resultType string).
     *
     * @param notebookPath the notebookPath value to set
     * @return the DatabricksNotebookActivity object itself.
     */
    public DatabricksNotebookActivity withNotebookPath(Object notebookPath) {
        this.notebookPath = notebookPath;
        return this;
    }

    /**
     * Get base parameters to be used for each run of this job.If the notebook takes a parameter that is not specified, the default value from the notebook will be used.
     *
     * @return the baseParameters value
     */
    public Map<String, Object> baseParameters() {
        return this.baseParameters;
    }

    /**
     * Set base parameters to be used for each run of this job.If the notebook takes a parameter that is not specified, the default value from the notebook will be used.
     *
     * @param baseParameters the baseParameters value to set
     * @return the DatabricksNotebookActivity object itself.
     */
    public DatabricksNotebookActivity withBaseParameters(Map<String, Object> baseParameters) {
        this.baseParameters = baseParameters;
        return this;
    }

}
