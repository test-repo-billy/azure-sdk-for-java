// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.ApplicationGatewayWafDynamicManifestsDefaultsClient;
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayWafDynamicManifestResultInner;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayWafDynamicManifestResult;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayWafDynamicManifestsDefaults;

public final class ApplicationGatewayWafDynamicManifestsDefaultsImpl
    implements ApplicationGatewayWafDynamicManifestsDefaults {
    private static final ClientLogger LOGGER
        = new ClientLogger(ApplicationGatewayWafDynamicManifestsDefaultsImpl.class);

    private final ApplicationGatewayWafDynamicManifestsDefaultsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public ApplicationGatewayWafDynamicManifestsDefaultsImpl(
        ApplicationGatewayWafDynamicManifestsDefaultsClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ApplicationGatewayWafDynamicManifestResult> getWithResponse(String locations, Context context) {
        Response<ApplicationGatewayWafDynamicManifestResultInner> inner
            = this.serviceClient().getWithResponse(locations, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ApplicationGatewayWafDynamicManifestResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ApplicationGatewayWafDynamicManifestResult get(String locations) {
        ApplicationGatewayWafDynamicManifestResultInner inner = this.serviceClient().get(locations);
        if (inner != null) {
            return new ApplicationGatewayWafDynamicManifestResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ApplicationGatewayWafDynamicManifestsDefaultsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
