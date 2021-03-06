// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.AzureEnvironment;

/** A builder for creating a new instance of the GraphRbacManagementClient type. */
@ServiceClientBuilder(serviceClients = {GraphRbacManagementClient.class})
public final class GraphRbacManagementClientBuilder {
    /*
     * The tenant ID.
     */
    private String tenantId;

    /**
     * Sets The tenant ID.
     *
     * @param tenantId the tenantId value.
     * @return the GraphRbacManagementClientBuilder.
     */
    public GraphRbacManagementClientBuilder tenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /*
     * server parameter
     */
    private String endpoint;

    /**
     * Sets server parameter.
     *
     * @param endpoint the endpoint value.
     * @return the GraphRbacManagementClientBuilder.
     */
    public GraphRbacManagementClientBuilder endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /*
     * The environment to connect to
     */
    private AzureEnvironment environment;

    /**
     * Sets The environment to connect to.
     *
     * @param environment the environment value.
     * @return the GraphRbacManagementClientBuilder.
     */
    public GraphRbacManagementClientBuilder environment(AzureEnvironment environment) {
        this.environment = environment;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     *
     * @param pipeline the pipeline value.
     * @return the GraphRbacManagementClientBuilder.
     */
    public GraphRbacManagementClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Builds an instance of GraphRbacManagementClient with the provided parameters.
     *
     * @return an instance of GraphRbacManagementClient.
     */
    public GraphRbacManagementClient buildClient() {
        if (endpoint == null) {
            this.endpoint = "https://graph.windows.net";
        }
        if (environment == null) {
            this.environment = AzureEnvironment.AZURE;
        }
        if (pipeline == null) {
            this.pipeline =
                new HttpPipelineBuilder()
                    .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                    .build();
        }
        GraphRbacManagementClient client = new GraphRbacManagementClient(pipeline, environment, tenantId, endpoint);
        return client;
    }
}
