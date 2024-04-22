// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.newrelicobservability.fluent.models.MetricRulesInner;
import com.azure.resourcemanager.newrelicobservability.fluent.models.TagRuleInner;
import com.azure.resourcemanager.newrelicobservability.models.FilteringTag;
import com.azure.resourcemanager.newrelicobservability.models.LogRules;
import com.azure.resourcemanager.newrelicobservability.models.SendAadLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendActivityLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendMetricsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendSubscriptionLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.TagRuleListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class TagRuleListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TagRuleListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"NotSpecified\",\"logRules\":{\"sendAadLogs\":\"Enabled\",\"sendSubscriptionLogs\":\"Enabled\",\"sendActivityLogs\":\"Enabled\",\"filteringTags\":[{},{}]},\"metricRules\":{\"sendMetrics\":\"Disabled\",\"filteringTags\":[{},{},{},{}],\"userEmail\":\"stkiiuxhqyud\"}},\"id\":\"rrqnbpoczvyifqrv\",\"name\":\"dvjsllrmvvdf\",\"type\":\"atkpnp\"}],\"nextLink\":\"exxbczwtr\"}")
            .toObject(TagRuleListResult.class);
        Assertions.assertEquals(SendAadLogsStatus.ENABLED, model.value().get(0).logRules().sendAadLogs());
        Assertions.assertEquals(SendSubscriptionLogsStatus.ENABLED,
            model.value().get(0).logRules().sendSubscriptionLogs());
        Assertions.assertEquals(SendActivityLogsStatus.ENABLED, model.value().get(0).logRules().sendActivityLogs());
        Assertions.assertEquals(SendMetricsStatus.DISABLED, model.value().get(0).metricRules().sendMetrics());
        Assertions.assertEquals("stkiiuxhqyud", model.value().get(0).metricRules().userEmail());
        Assertions.assertEquals("exxbczwtr", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TagRuleListResult model
            = new TagRuleListResult()
                .withValue(
                    Arrays
                        .asList(
                            new TagRuleInner()
                                .withLogRules(new LogRules().withSendAadLogs(SendAadLogsStatus.ENABLED)
                                    .withSendSubscriptionLogs(SendSubscriptionLogsStatus.ENABLED)
                                    .withSendActivityLogs(SendActivityLogsStatus.ENABLED)
                                    .withFilteringTags(Arrays.asList(new FilteringTag(), new FilteringTag())))
                                .withMetricRules(new MetricRulesInner().withSendMetrics(SendMetricsStatus.DISABLED)
                                    .withFilteringTags(Arrays.asList(new FilteringTag(), new FilteringTag(),
                                        new FilteringTag(), new FilteringTag()))
                                    .withUserEmail("stkiiuxhqyud"))))
                .withNextLink("exxbczwtr");
        model = BinaryData.fromObject(model).toObject(TagRuleListResult.class);
        Assertions.assertEquals(SendAadLogsStatus.ENABLED, model.value().get(0).logRules().sendAadLogs());
        Assertions.assertEquals(SendSubscriptionLogsStatus.ENABLED,
            model.value().get(0).logRules().sendSubscriptionLogs());
        Assertions.assertEquals(SendActivityLogsStatus.ENABLED, model.value().get(0).logRules().sendActivityLogs());
        Assertions.assertEquals(SendMetricsStatus.DISABLED, model.value().get(0).metricRules().sendMetrics());
        Assertions.assertEquals("stkiiuxhqyud", model.value().get(0).metricRules().userEmail());
        Assertions.assertEquals("exxbczwtr", model.nextLink());
    }
}
