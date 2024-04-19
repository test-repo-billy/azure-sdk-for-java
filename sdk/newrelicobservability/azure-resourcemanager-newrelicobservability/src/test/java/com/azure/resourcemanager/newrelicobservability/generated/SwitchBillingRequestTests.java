// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.newrelicobservability.models.BillingCycle;
import com.azure.resourcemanager.newrelicobservability.models.PlanData;
import com.azure.resourcemanager.newrelicobservability.models.SwitchBillingRequest;
import com.azure.resourcemanager.newrelicobservability.models.UsageType;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class SwitchBillingRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SwitchBillingRequest model = BinaryData.fromString(
            "{\"azureResourceId\":\"jqkwpyeicx\",\"organizationId\":\"ciwqvhk\",\"planData\":{\"usageType\":\"COMMITTED\",\"billingCycle\":\"WEEKLY\",\"planDetails\":\"topbobjogh\",\"effectiveDate\":\"2021-04-17T11:58:30Z\"},\"userEmail\":\"u\"}")
            .toObject(SwitchBillingRequest.class);
        Assertions.assertEquals("jqkwpyeicx", model.azureResourceId());
        Assertions.assertEquals("ciwqvhk", model.organizationId());
        Assertions.assertEquals(UsageType.COMMITTED, model.planData().usageType());
        Assertions.assertEquals(BillingCycle.WEEKLY, model.planData().billingCycle());
        Assertions.assertEquals("topbobjogh", model.planData().planDetails());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-17T11:58:30Z"), model.planData().effectiveDate());
        Assertions.assertEquals("u", model.userEmail());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SwitchBillingRequest model
            = new SwitchBillingRequest().withAzureResourceId("jqkwpyeicx").withOrganizationId("ciwqvhk")
                .withPlanData(new PlanData().withUsageType(UsageType.COMMITTED).withBillingCycle(BillingCycle.WEEKLY)
                    .withPlanDetails("topbobjogh").withEffectiveDate(OffsetDateTime.parse("2021-04-17T11:58:30Z")))
                .withUserEmail("u");
        model = BinaryData.fromObject(model).toObject(SwitchBillingRequest.class);
        Assertions.assertEquals("jqkwpyeicx", model.azureResourceId());
        Assertions.assertEquals("ciwqvhk", model.organizationId());
        Assertions.assertEquals(UsageType.COMMITTED, model.planData().usageType());
        Assertions.assertEquals(BillingCycle.WEEKLY, model.planData().billingCycle());
        Assertions.assertEquals("topbobjogh", model.planData().planDetails());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-17T11:58:30Z"), model.planData().effectiveDate());
        Assertions.assertEquals("u", model.userEmail());
    }
}
