// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.JobTargetGroupInner;
import com.azure.resourcemanager.sql.generated.models.JobTarget;
import com.azure.resourcemanager.sql.generated.models.JobTargetGroup;
import java.util.Collections;
import java.util.List;

public final class JobTargetGroupImpl implements JobTargetGroup, JobTargetGroup.Definition, JobTargetGroup.Update {
    private JobTargetGroupInner innerObject;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public List<JobTarget> members() {
        List<JobTarget> inner = this.innerModel().members();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public JobTargetGroupInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private String jobAgentName;

    private String targetGroupName;

    public JobTargetGroupImpl withExistingJobAgent(String resourceGroupName, String serverName, String jobAgentName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        this.jobAgentName = jobAgentName;
        return this;
    }

    public JobTargetGroup create() {
        this.innerObject
            = serviceManager.serviceClient().getJobTargetGroups().createOrUpdateWithResponse(resourceGroupName,
                serverName, jobAgentName, targetGroupName, this.innerModel(), Context.NONE).getValue();
        return this;
    }

    public JobTargetGroup create(Context context) {
        this.innerObject
            = serviceManager.serviceClient().getJobTargetGroups().createOrUpdateWithResponse(resourceGroupName,
                serverName, jobAgentName, targetGroupName, this.innerModel(), context).getValue();
        return this;
    }

    JobTargetGroupImpl(String name, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = new JobTargetGroupInner();
        this.serviceManager = serviceManager;
        this.targetGroupName = name;
    }

    public JobTargetGroupImpl update() {
        return this;
    }

    public JobTargetGroup apply() {
        this.innerObject
            = serviceManager.serviceClient().getJobTargetGroups().createOrUpdateWithResponse(resourceGroupName,
                serverName, jobAgentName, targetGroupName, this.innerModel(), Context.NONE).getValue();
        return this;
    }

    public JobTargetGroup apply(Context context) {
        this.innerObject
            = serviceManager.serviceClient().getJobTargetGroups().createOrUpdateWithResponse(resourceGroupName,
                serverName, jobAgentName, targetGroupName, this.innerModel(), context).getValue();
        return this;
    }

    JobTargetGroupImpl(JobTargetGroupInner innerObject,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
        this.jobAgentName = Utils.getValueFromIdByName(innerObject.id(), "jobAgents");
        this.targetGroupName = Utils.getValueFromIdByName(innerObject.id(), "targetGroups");
    }

    public JobTargetGroup refresh() {
        this.innerObject = serviceManager.serviceClient().getJobTargetGroups()
            .getWithResponse(resourceGroupName, serverName, jobAgentName, targetGroupName, Context.NONE).getValue();
        return this;
    }

    public JobTargetGroup refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getJobTargetGroups()
            .getWithResponse(resourceGroupName, serverName, jobAgentName, targetGroupName, context).getValue();
        return this;
    }

    public JobTargetGroupImpl withMembers(List<JobTarget> members) {
        this.innerModel().withMembers(members);
        return this;
    }
}
