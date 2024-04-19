// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.EndOfSupportStatus;
import com.azure.resourcemanager.security.models.Software;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SoftwareInventoriesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"deviceId\":\"vmfnnbbxn\",\"osPlatform\":\"fkk\",\"vendor\":\"eetxtpwcv\",\"softwareName\":\"fwsunjzijaciwmm\",\"version\":\"tqdonbzzs\",\"endOfSupportStatus\":\"upcomingVersionNoLongerSupported\",\"endOfSupportDate\":\"viiwsuanzhwsyu\",\"numberOfKnownVulnerabilities\":1667641807,\"firstSeenAt\":\"qqhbtfloilmkfbe\"},\"id\":\"iipj\",\"name\":\"ngvyvuoik\",\"type\":\"l\"}";

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

        SecurityManager manager = SecurityManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        Software response = manager.softwareInventories().getWithResponse("cxsvqlcqufylamxo", "bgcjoyutehlkar",
            "tipquks", "iknsgo", "unswhpcek", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals("vmfnnbbxn", response.deviceId());
        Assertions.assertEquals("fkk", response.osPlatform());
        Assertions.assertEquals("eetxtpwcv", response.vendor());
        Assertions.assertEquals("fwsunjzijaciwmm", response.softwareName());
        Assertions.assertEquals("tqdonbzzs", response.version());
        Assertions.assertEquals(EndOfSupportStatus.UPCOMING_VERSION_NO_LONGER_SUPPORTED, response.endOfSupportStatus());
        Assertions.assertEquals("viiwsuanzhwsyu", response.endOfSupportDate());
        Assertions.assertEquals(1667641807, response.numberOfKnownVulnerabilities());
        Assertions.assertEquals("qqhbtfloilmkfbe", response.firstSeenAt());
    }
}
