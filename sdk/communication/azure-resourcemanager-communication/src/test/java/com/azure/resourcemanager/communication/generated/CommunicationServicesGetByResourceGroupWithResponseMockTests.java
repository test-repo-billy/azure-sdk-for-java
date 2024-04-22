// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.communication.CommunicationManager;
import com.azure.resourcemanager.communication.models.CommunicationServiceResource;
import com.azure.resourcemanager.communication.models.ManagedServiceIdentityType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class CommunicationServicesGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Running\",\"hostName\":\"vmkfssxqu\",\"dataLocation\":\"kfplgmgsxnk\",\"notificationHubId\":\"kde\",\"version\":\"pvlopwiyighxpkd\",\"immutableResourceId\":\"baiuebbaumny\",\"linkedDomains\":[\"edeojnabc\"]},\"identity\":{\"principalId\":\"90fdda1a-2423-45b5-b479-d2875d87c96a\",\"tenantId\":\"90b43a81-6830-43c7-95fa-530d23bbd8e2\",\"type\":\"None\",\"userAssignedIdentities\":{\"ebtfhvpesap\":{\"principalId\":\"36b69f17-8df3-4d27-87c9-5b344e36ea49\",\"clientId\":\"a6beacf0-a8b3-42d5-b5e2-90c549cec587\"},\"dqmh\":{\"principalId\":\"639a2178-e33d-4939-8fa0-52a5a9c226aa\",\"clientId\":\"1944f363-64fc-450c-8df0-f000f6bca8df\"},\"htldwk\":{\"principalId\":\"94579b49-d73c-4fef-b4b8-87e7d6301a16\",\"clientId\":\"9af4da14-ac33-4e0a-877a-d9a295dc0d35\"}}},\"location\":\"xuutkncwscwsv\",\"tags\":{\"rupqsxvnmicy\":\"togt\",\"vei\":\"vce\",\"dhbt\":\"ovnotyfjfcnjbkcn\"},\"id\":\"kphywpnvjto\",\"name\":\"nermcl\",\"type\":\"plpho\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        CommunicationManager manager = CommunicationManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        CommunicationServiceResource response = manager.communicationServices()
            .getByResourceGroupWithResponse("ovplw", "bhvgy", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals("xuutkncwscwsv", response.location());
        Assertions.assertEquals("togt", response.tags().get("rupqsxvnmicy"));
        Assertions.assertEquals(ManagedServiceIdentityType.NONE, response.identity().type());
        Assertions.assertEquals("kfplgmgsxnk", response.dataLocation());
        Assertions.assertEquals("edeojnabc", response.linkedDomains().get(0));
    }
}
