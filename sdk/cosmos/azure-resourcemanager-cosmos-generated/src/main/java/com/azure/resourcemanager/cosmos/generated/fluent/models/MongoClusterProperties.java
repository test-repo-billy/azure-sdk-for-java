// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cosmos.generated.models.CreateMode;
import com.azure.resourcemanager.cosmos.generated.models.MongoClusterRestoreParameters;
import com.azure.resourcemanager.cosmos.generated.models.MongoClusterStatus;
import com.azure.resourcemanager.cosmos.generated.models.NodeGroupSpec;
import com.azure.resourcemanager.cosmos.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The properties of a mongo cluster.
 */
@Fluent
public final class MongoClusterProperties {
    /*
     * The mode to create a mongo cluster.
     */
    @JsonProperty(value = "createMode")
    private CreateMode createMode;

    /*
     * Parameters used for restore operations
     */
    @JsonProperty(value = "restoreParameters")
    private MongoClusterRestoreParameters restoreParameters;

    /*
     * The administrator's login for the mongo cluster.
     */
    @JsonProperty(value = "administratorLogin")
    private String administratorLogin;

    /*
     * The password of the administrator login.
     */
    @JsonProperty(value = "administratorLoginPassword")
    private String administratorLoginPassword;

    /*
     * The Mongo DB server version. Defaults to the latest available version if not specified.
     */
    @JsonProperty(value = "serverVersion")
    private String serverVersion;

    /*
     * The default mongo connection string for the cluster.
     */
    @JsonProperty(value = "connectionString", access = JsonProperty.Access.WRITE_ONLY)
    private String connectionString;

    /*
     * Earliest restore timestamp in UTC ISO8601 format.
     */
    @JsonProperty(value = "earliestRestoreTime", access = JsonProperty.Access.WRITE_ONLY)
    private String earliestRestoreTime;

    /*
     * A provisioning state of the mongo cluster.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * A status of the mongo cluster.
     */
    @JsonProperty(value = "clusterStatus", access = JsonProperty.Access.WRITE_ONLY)
    private MongoClusterStatus clusterStatus;

    /*
     * The list of node group specs in the cluster.
     */
    @JsonProperty(value = "nodeGroupSpecs")
    private List<NodeGroupSpec> nodeGroupSpecs;

    /**
     * Creates an instance of MongoClusterProperties class.
     */
    public MongoClusterProperties() {
    }

    /**
     * Get the createMode property: The mode to create a mongo cluster.
     * 
     * @return the createMode value.
     */
    public CreateMode createMode() {
        return this.createMode;
    }

    /**
     * Set the createMode property: The mode to create a mongo cluster.
     * 
     * @param createMode the createMode value to set.
     * @return the MongoClusterProperties object itself.
     */
    public MongoClusterProperties withCreateMode(CreateMode createMode) {
        this.createMode = createMode;
        return this;
    }

    /**
     * Get the restoreParameters property: Parameters used for restore operations.
     * 
     * @return the restoreParameters value.
     */
    public MongoClusterRestoreParameters restoreParameters() {
        return this.restoreParameters;
    }

    /**
     * Set the restoreParameters property: Parameters used for restore operations.
     * 
     * @param restoreParameters the restoreParameters value to set.
     * @return the MongoClusterProperties object itself.
     */
    public MongoClusterProperties withRestoreParameters(MongoClusterRestoreParameters restoreParameters) {
        this.restoreParameters = restoreParameters;
        return this;
    }

    /**
     * Get the administratorLogin property: The administrator's login for the mongo cluster.
     * 
     * @return the administratorLogin value.
     */
    public String administratorLogin() {
        return this.administratorLogin;
    }

    /**
     * Set the administratorLogin property: The administrator's login for the mongo cluster.
     * 
     * @param administratorLogin the administratorLogin value to set.
     * @return the MongoClusterProperties object itself.
     */
    public MongoClusterProperties withAdministratorLogin(String administratorLogin) {
        this.administratorLogin = administratorLogin;
        return this;
    }

    /**
     * Get the administratorLoginPassword property: The password of the administrator login.
     * 
     * @return the administratorLoginPassword value.
     */
    public String administratorLoginPassword() {
        return this.administratorLoginPassword;
    }

    /**
     * Set the administratorLoginPassword property: The password of the administrator login.
     * 
     * @param administratorLoginPassword the administratorLoginPassword value to set.
     * @return the MongoClusterProperties object itself.
     */
    public MongoClusterProperties withAdministratorLoginPassword(String administratorLoginPassword) {
        this.administratorLoginPassword = administratorLoginPassword;
        return this;
    }

    /**
     * Get the serverVersion property: The Mongo DB server version. Defaults to the latest available version if not
     * specified.
     * 
     * @return the serverVersion value.
     */
    public String serverVersion() {
        return this.serverVersion;
    }

    /**
     * Set the serverVersion property: The Mongo DB server version. Defaults to the latest available version if not
     * specified.
     * 
     * @param serverVersion the serverVersion value to set.
     * @return the MongoClusterProperties object itself.
     */
    public MongoClusterProperties withServerVersion(String serverVersion) {
        this.serverVersion = serverVersion;
        return this;
    }

    /**
     * Get the connectionString property: The default mongo connection string for the cluster.
     * 
     * @return the connectionString value.
     */
    public String connectionString() {
        return this.connectionString;
    }

    /**
     * Get the earliestRestoreTime property: Earliest restore timestamp in UTC ISO8601 format.
     * 
     * @return the earliestRestoreTime value.
     */
    public String earliestRestoreTime() {
        return this.earliestRestoreTime;
    }

    /**
     * Get the provisioningState property: A provisioning state of the mongo cluster.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the clusterStatus property: A status of the mongo cluster.
     * 
     * @return the clusterStatus value.
     */
    public MongoClusterStatus clusterStatus() {
        return this.clusterStatus;
    }

    /**
     * Get the nodeGroupSpecs property: The list of node group specs in the cluster.
     * 
     * @return the nodeGroupSpecs value.
     */
    public List<NodeGroupSpec> nodeGroupSpecs() {
        return this.nodeGroupSpecs;
    }

    /**
     * Set the nodeGroupSpecs property: The list of node group specs in the cluster.
     * 
     * @param nodeGroupSpecs the nodeGroupSpecs value to set.
     * @return the MongoClusterProperties object itself.
     */
    public MongoClusterProperties withNodeGroupSpecs(List<NodeGroupSpec> nodeGroupSpecs) {
        this.nodeGroupSpecs = nodeGroupSpecs;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (restoreParameters() != null) {
            restoreParameters().validate();
        }
        if (nodeGroupSpecs() != null) {
            nodeGroupSpecs().forEach(e -> e.validate());
        }
    }
}
