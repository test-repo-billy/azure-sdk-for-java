/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2018_09_15_preview.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.eventgrid.v2018_09_15_preview.Topic;
import rx.Observable;
import com.microsoft.azure.management.eventgrid.v2018_09_15_preview.TopicProvisioningState;
import com.microsoft.azure.management.eventgrid.v2018_09_15_preview.InputSchema;
import com.microsoft.azure.management.eventgrid.v2018_09_15_preview.InputSchemaMapping;

class TopicImpl extends GroupableResourceCoreImpl<Topic, TopicInner, TopicImpl, EventGridManager> implements Topic, Topic.Definition, Topic.Update {
    TopicImpl(String name, TopicInner inner, EventGridManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<Topic> createResourceAsync() {
        TopicsInner client = this.manager().inner().topics();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Topic> updateResourceAsync() {
        TopicsInner client = this.manager().inner().topics();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<TopicInner> getInnerAsync() {
        TopicsInner client = this.manager().inner().topics();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String endpoint() {
        return this.inner().endpoint();
    }

    @Override
    public InputSchema inputSchema() {
        return this.inner().inputSchema();
    }

    @Override
    public InputSchemaMapping inputSchemaMapping() {
        return this.inner().inputSchemaMapping();
    }

    @Override
    public TopicProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public TopicImpl withInputSchema(InputSchema inputSchema) {
        this.inner().withInputSchema(inputSchema);
        return this;
    }

    @Override
    public TopicImpl withInputSchemaMapping(InputSchemaMapping inputSchemaMapping) {
        this.inner().withInputSchemaMapping(inputSchemaMapping);
        return this;
    }

}
