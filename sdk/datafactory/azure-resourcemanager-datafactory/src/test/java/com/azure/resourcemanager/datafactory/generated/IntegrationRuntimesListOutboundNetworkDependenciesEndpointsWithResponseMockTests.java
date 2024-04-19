// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class IntegrationRuntimesListOutboundNetworkDependenciesEndpointsWithResponseMockTests {
    @Test
    public void testListOutboundNetworkDependenciesEndpointsWithResponse() throws Exception {
        String responseStr
            = "{\"value\":[{\"category\":\"xlpmbtmcpwvbp\",\"endpoints\":[{\"domainName\":\"amsgfvuffdvukjy\",\"endpointDetails\":[{},{},{}]},{\"domainName\":\"nrgmjp\",\"endpointDetails\":[{},{}]}]},{\"category\":\"wxc\",\"endpoints\":[{\"domainName\":\"lby\",\"endpointDetails\":[{}]}]},{\"category\":\"skjiiivbvkv\",\"endpoints\":[{\"domainName\":\"slbkrhrnvozj\",\"endpointDetails\":[{},{},{},{}]}]}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataFactoryManager manager = DataFactoryManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponse response = manager.integrationRuntimes()
            .listOutboundNetworkDependenciesEndpointsWithResponse("msybvjfnuyoy", "zafkn", "lasfbpjyv",
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("xlpmbtmcpwvbp", response.value().get(0).category());
        Assertions.assertEquals("amsgfvuffdvukjy", response.value().get(0).endpoints().get(0).domainName());
    }
}
