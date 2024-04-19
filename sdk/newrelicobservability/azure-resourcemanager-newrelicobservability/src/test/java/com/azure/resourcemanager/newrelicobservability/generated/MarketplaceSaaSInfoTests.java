// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.newrelicobservability.models.MarketplaceSaaSInfo;
import org.junit.jupiter.api.Assertions;

public final class MarketplaceSaaSInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MarketplaceSaaSInfo model = BinaryData.fromString(
            "{\"marketplaceSubscriptionId\":\"wlbjnpgacftade\",\"marketplaceSubscriptionName\":\"nltyfsoppusuesnz\",\"marketplaceResourceId\":\"ej\",\"marketplaceStatus\":\"vorxzdmohct\",\"billedAzureSubscriptionId\":\"vudwx\"}")
            .toObject(MarketplaceSaaSInfo.class);
        Assertions.assertEquals("wlbjnpgacftade", model.marketplaceSubscriptionId());
        Assertions.assertEquals("nltyfsoppusuesnz", model.marketplaceSubscriptionName());
        Assertions.assertEquals("ej", model.marketplaceResourceId());
        Assertions.assertEquals("vorxzdmohct", model.marketplaceStatus());
        Assertions.assertEquals("vudwx", model.billedAzureSubscriptionId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MarketplaceSaaSInfo model = new MarketplaceSaaSInfo().withMarketplaceSubscriptionId("wlbjnpgacftade")
            .withMarketplaceSubscriptionName("nltyfsoppusuesnz").withMarketplaceResourceId("ej")
            .withMarketplaceStatus("vorxzdmohct").withBilledAzureSubscriptionId("vudwx");
        model = BinaryData.fromObject(model).toObject(MarketplaceSaaSInfo.class);
        Assertions.assertEquals("wlbjnpgacftade", model.marketplaceSubscriptionId());
        Assertions.assertEquals("nltyfsoppusuesnz", model.marketplaceSubscriptionName());
        Assertions.assertEquals("ej", model.marketplaceResourceId());
        Assertions.assertEquals("vorxzdmohct", model.marketplaceStatus());
        Assertions.assertEquals("vudwx", model.billedAzureSubscriptionId());
    }
}
