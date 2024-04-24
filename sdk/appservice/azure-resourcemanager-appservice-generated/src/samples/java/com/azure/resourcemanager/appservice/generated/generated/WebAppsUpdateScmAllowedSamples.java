// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.resourcemanager.appservice.generated.fluent.models.CsmPublishingCredentialsPoliciesEntityInner;

/**
 * Samples for WebApps UpdateScmAllowed.
 */
public final class WebAppsUpdateScmAllowedSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/UpdatePublishingCredentialsPolicy.json
     */
    /**
     * Sample code: Update SCM Allowed.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void updateSCMAllowed(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.webApps()
            .updateScmAllowedWithResponse("rg", "testSite",
                new CsmPublishingCredentialsPoliciesEntityInner().withAllow(true), com.azure.core.util.Context.NONE);
    }
}
