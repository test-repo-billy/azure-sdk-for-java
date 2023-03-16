// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager;
import com.azure.resourcemanager.desktopvirtualization.models.ApplicationType;
import com.azure.resourcemanager.desktopvirtualization.models.SessionState;
import com.azure.resourcemanager.desktopvirtualization.models.UserSession;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class UserSessionsListByHostPoolMockTests {
    @Test
    public void testListByHostPool() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"objectId\":\"btijvacvbm\",\"userPrincipalName\":\"bqqxlaj\",\"applicationType\":\"Desktop\",\"sessionState\":\"UserProfileDiskMounted\",\"activeDirectoryUserName\":\"evehjkuyxoaf\",\"createTime\":\"2021-03-08T11:58:40Z\"},\"id\":\"qltfaey\",\"name\":\"inmfgvxirp\",\"type\":\"hriypoqeyhlqhy\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        DesktopVirtualizationManager manager =
            DesktopVirtualizationManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<UserSession> response =
            manager
                .userSessions()
                .listByHostPool(
                    "yhsgz",
                    "czbgomfgbeg",
                    "qgleohibetnluank",
                    416708927,
                    true,
                    1893496735,
                    com.azure.core.util.Context.NONE);

        Assertions.assertEquals("bqqxlaj", response.iterator().next().userPrincipalName());
        Assertions.assertEquals(ApplicationType.DESKTOP, response.iterator().next().applicationType());
        Assertions.assertEquals(SessionState.USER_PROFILE_DISK_MOUNTED, response.iterator().next().sessionState());
        Assertions.assertEquals("evehjkuyxoaf", response.iterator().next().activeDirectoryUsername());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-08T11:58:40Z"), response.iterator().next().createTime());
    }
}
