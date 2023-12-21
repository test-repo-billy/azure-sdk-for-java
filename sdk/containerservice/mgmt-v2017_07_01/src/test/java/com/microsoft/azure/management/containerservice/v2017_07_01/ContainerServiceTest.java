/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2017_07_01;
import com.microsoft.azure.arm.core.TestBase;
import com.microsoft.azure.management.containerservice.v2017_07_01.implementation.ContainerServiceManager;
import com.microsoft.azure.management.resources.implementation.ResourceManager;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.arm.utils.SdkContext;
import org.junit.Test;
import org.junit.Assert;
import com.microsoft.azure.arm.resources.Region;
import com.microsoft.azure.management.resources.ResourceGroup;

public class  ContainerServiceTest extends TestBase {
    protected static ResourceManager resourceManager;
    protected static ContainerServiceManager containerServiceManager;
    private static String rgName;
    @Override
    protected void initializeClients(RestClient restClient, String defaultSubscription, String domain) {
        resourceManager = ResourceManager
                .authenticate(restClient)
                .withSubscription(defaultSubscription);
        containerServiceManager = ContainerServiceManager
                .authenticate(restClient, defaultSubscription);
    }
    @Override
    protected void cleanUpResources() {
        resourceManager.resourceGroups().deleteByName(rgName);
    }
    @Test
    public void firstTest() {
        rgName = SdkContext.randomResourceName("rg", 20);
        ResourceGroup group = resourceManager.resourceGroups()
                .define(rgName)
                .withRegion(Region.US_WEST.toString())
                .create();
        Assert.assertNotNull(group);
    }
}
