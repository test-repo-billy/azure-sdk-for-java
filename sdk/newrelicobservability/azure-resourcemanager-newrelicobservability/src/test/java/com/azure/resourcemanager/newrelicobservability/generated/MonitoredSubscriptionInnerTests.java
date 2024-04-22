// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.newrelicobservability.fluent.models.MetricRulesInner;
import com.azure.resourcemanager.newrelicobservability.fluent.models.MonitoredSubscriptionInner;
import com.azure.resourcemanager.newrelicobservability.fluent.models.MonitoringTagRulesPropertiesInner;
import com.azure.resourcemanager.newrelicobservability.models.FilteringTag;
import com.azure.resourcemanager.newrelicobservability.models.LogRules;
import com.azure.resourcemanager.newrelicobservability.models.SendAadLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendActivityLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendMetricsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendSubscriptionLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.Status;
import com.azure.resourcemanager.newrelicobservability.models.TagAction;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MonitoredSubscriptionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MonitoredSubscriptionInner model = BinaryData.fromString(
            "{\"subscriptionId\":\"jawgqwg\",\"status\":\"InProgress\",\"error\":\"skxfbk\",\"tagRules\":{\"provisioningState\":\"Accepted\",\"logRules\":{\"sendAadLogs\":\"Enabled\",\"sendSubscriptionLogs\":\"Disabled\",\"sendActivityLogs\":\"Disabled\",\"filteringTags\":[{\"name\":\"uwhvylwzbtdhxujz\",\"value\":\"mpowuwpr\",\"action\":\"Include\"},{\"name\":\"eualupjmkhf\",\"value\":\"bbcswsrtjri\",\"action\":\"Exclude\"},{\"name\":\"pbewtghfgblcgwx\",\"value\":\"lvqhjkbegibtnmx\",\"action\":\"Include\"},{\"name\":\"waloayqcgwr\",\"value\":\"j\",\"action\":\"Include\"}]},\"metricRules\":{\"sendMetrics\":\"Enabled\",\"filteringTags\":[{\"name\":\"xongmtsavjcbpwxq\",\"value\":\"rknftguvriuhprwm\",\"action\":\"Exclude\"},{\"name\":\"qtayri\",\"value\":\"ro\",\"action\":\"Include\"},{\"name\":\"xrmcqibycnojvk\",\"value\":\"e\",\"action\":\"Exclude\"},{\"name\":\"zvahapjy\",\"value\":\"pvgqzcjrvxdjzlm\",\"action\":\"Exclude\"}],\"userEmail\":\"vu\"}}}")
            .toObject(MonitoredSubscriptionInner.class);
        Assertions.assertEquals("jawgqwg", model.subscriptionId());
        Assertions.assertEquals(Status.IN_PROGRESS, model.status());
        Assertions.assertEquals("skxfbk", model.error());
        Assertions.assertEquals(SendAadLogsStatus.ENABLED, model.tagRules().logRules().sendAadLogs());
        Assertions.assertEquals(SendSubscriptionLogsStatus.DISABLED,
            model.tagRules().logRules().sendSubscriptionLogs());
        Assertions.assertEquals(SendActivityLogsStatus.DISABLED, model.tagRules().logRules().sendActivityLogs());
        Assertions.assertEquals("uwhvylwzbtdhxujz", model.tagRules().logRules().filteringTags().get(0).name());
        Assertions.assertEquals("mpowuwpr", model.tagRules().logRules().filteringTags().get(0).value());
        Assertions.assertEquals(TagAction.INCLUDE, model.tagRules().logRules().filteringTags().get(0).action());
        Assertions.assertEquals(SendMetricsStatus.ENABLED, model.tagRules().metricRules().sendMetrics());
        Assertions.assertEquals("xongmtsavjcbpwxq", model.tagRules().metricRules().filteringTags().get(0).name());
        Assertions.assertEquals("rknftguvriuhprwm", model.tagRules().metricRules().filteringTags().get(0).value());
        Assertions.assertEquals(TagAction.EXCLUDE, model.tagRules().metricRules().filteringTags().get(0).action());
        Assertions.assertEquals("vu", model.tagRules().metricRules().userEmail());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MonitoredSubscriptionInner model = new MonitoredSubscriptionInner().withSubscriptionId("jawgqwg")
            .withStatus(Status.IN_PROGRESS).withError("skxfbk")
            .withTagRules(new MonitoringTagRulesPropertiesInner().withLogRules(new LogRules()
                .withSendAadLogs(SendAadLogsStatus.ENABLED)
                .withSendSubscriptionLogs(SendSubscriptionLogsStatus.DISABLED)
                .withSendActivityLogs(SendActivityLogsStatus.DISABLED)
                .withFilteringTags(Arrays.asList(
                    new FilteringTag().withName("uwhvylwzbtdhxujz").withValue("mpowuwpr").withAction(TagAction.INCLUDE),
                    new FilteringTag().withName("eualupjmkhf").withValue("bbcswsrtjri").withAction(TagAction.EXCLUDE),
                    new FilteringTag().withName("pbewtghfgblcgwx").withValue("lvqhjkbegibtnmx")
                        .withAction(TagAction.INCLUDE),
                    new FilteringTag().withName("waloayqcgwr").withValue("j").withAction(TagAction.INCLUDE))))
                .withMetricRules(new MetricRulesInner().withSendMetrics(SendMetricsStatus.ENABLED)
                    .withFilteringTags(Arrays.asList(
                        new FilteringTag().withName("xongmtsavjcbpwxq").withValue("rknftguvriuhprwm")
                            .withAction(TagAction.EXCLUDE),
                        new FilteringTag().withName("qtayri").withValue("ro").withAction(TagAction.INCLUDE),
                        new FilteringTag().withName("xrmcqibycnojvk").withValue("e").withAction(TagAction.EXCLUDE),
                        new FilteringTag().withName("zvahapjy").withValue("pvgqzcjrvxdjzlm")
                            .withAction(TagAction.EXCLUDE)))
                    .withUserEmail("vu")));
        model = BinaryData.fromObject(model).toObject(MonitoredSubscriptionInner.class);
        Assertions.assertEquals("jawgqwg", model.subscriptionId());
        Assertions.assertEquals(Status.IN_PROGRESS, model.status());
        Assertions.assertEquals("skxfbk", model.error());
        Assertions.assertEquals(SendAadLogsStatus.ENABLED, model.tagRules().logRules().sendAadLogs());
        Assertions.assertEquals(SendSubscriptionLogsStatus.DISABLED,
            model.tagRules().logRules().sendSubscriptionLogs());
        Assertions.assertEquals(SendActivityLogsStatus.DISABLED, model.tagRules().logRules().sendActivityLogs());
        Assertions.assertEquals("uwhvylwzbtdhxujz", model.tagRules().logRules().filteringTags().get(0).name());
        Assertions.assertEquals("mpowuwpr", model.tagRules().logRules().filteringTags().get(0).value());
        Assertions.assertEquals(TagAction.INCLUDE, model.tagRules().logRules().filteringTags().get(0).action());
        Assertions.assertEquals(SendMetricsStatus.ENABLED, model.tagRules().metricRules().sendMetrics());
        Assertions.assertEquals("xongmtsavjcbpwxq", model.tagRules().metricRules().filteringTags().get(0).name());
        Assertions.assertEquals("rknftguvriuhprwm", model.tagRules().metricRules().filteringTags().get(0).value());
        Assertions.assertEquals(TagAction.EXCLUDE, model.tagRules().metricRules().filteringTags().get(0).action());
        Assertions.assertEquals("vu", model.tagRules().metricRules().userEmail());
    }
}
