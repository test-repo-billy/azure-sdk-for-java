// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.RecommendationRuleInner;
import com.azure.resourcemanager.appservice.generated.models.Channels;
import com.azure.resourcemanager.appservice.generated.models.NotificationLevel;
import com.azure.resourcemanager.appservice.generated.models.RecommendationRule;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class RecommendationRuleImpl implements RecommendationRule {
    private RecommendationRuleInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    RecommendationRuleImpl(RecommendationRuleInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public String recommendationName() {
        return this.innerModel().recommendationName();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String message() {
        return this.innerModel().message();
    }

    public UUID recommendationId() {
        return this.innerModel().recommendationId();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String actionName() {
        return this.innerModel().actionName();
    }

    public NotificationLevel level() {
        return this.innerModel().level();
    }

    public Channels channels() {
        return this.innerModel().channels();
    }

    public List<String> categoryTags() {
        List<String> inner = this.innerModel().categoryTags();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean isDynamic() {
        return this.innerModel().isDynamic();
    }

    public String extensionName() {
        return this.innerModel().extensionName();
    }

    public String bladeName() {
        return this.innerModel().bladeName();
    }

    public String forwardLink() {
        return this.innerModel().forwardLink();
    }

    public RecommendationRuleInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
