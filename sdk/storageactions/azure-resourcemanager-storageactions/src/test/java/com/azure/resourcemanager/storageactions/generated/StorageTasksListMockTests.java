// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageactions.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.storageactions.StorageActionsManager;
import com.azure.resourcemanager.storageactions.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.storageactions.models.StorageTask;
import com.azure.resourcemanager.storageactions.models.StorageTaskOperationName;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class StorageTasksListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"identity\":{\"principalId\":\"76672872-3d44-4893-86f6-ef537a834634\",\"tenantId\":\"f18d5da8-93b9-4af0-ac74-1eb1ce7bb4eb\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"nmefqsgzvahapj\":{\"principalId\":\"0fe8c224-0e78-465e-ba94-faac2d45d0b9\",\"clientId\":\"27bb0a8f-60c9-4e12-b3ac-c5326922e89e\"}}},\"properties\":{\"taskVersion\":7368048825846520103,\"enabled\":false,\"description\":\"qzcjrvxdj\",\"action\":{\"if\":{\"condition\":\"lmwlxkvugfhzo\",\"operations\":[{\"name\":\"UndeleteBlob\"},{\"name\":\"SetBlobLegalHold\"},{\"name\":\"SetBlobImmutabilityPolicy\"},{\"name\":\"SetBlobTags\"}]},\"else\":{\"operations\":[{\"name\":\"UndeleteBlob\"},{\"name\":\"SetBlobExpiry\"}]}},\"provisioningState\":\"Creating\",\"creationTimeInUtc\":\"2021-09-06T05:22:37Z\"},\"location\":\"rnxipei\",\"tags\":{\"ltskzbbtd\":\"zuaejxd\",\"bsjyofdx\":\"umveekgpwozuhkf\",\"oekqvk\":\"uusdttouwa\",\"vbxwyjsflhh\":\"lns\"},\"id\":\"aalnjixi\",\"name\":\"xyawj\",\"type\":\"yaqcslyjpkiidz\"}]}";

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

        StorageActionsManager manager = StorageActionsManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<StorageTask> response = manager.storageTasks().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("rnxipei", response.iterator().next().location());
        Assertions.assertEquals("zuaejxd", response.iterator().next().tags().get("ltskzbbtd"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, response.iterator().next().identity().type());
        Assertions.assertEquals(false, response.iterator().next().properties().enabled());
        Assertions.assertEquals("qzcjrvxdj", response.iterator().next().properties().description());
        Assertions.assertEquals("lmwlxkvugfhzo",
            response.iterator().next().properties().action().ifProperty().condition());
        Assertions.assertEquals(StorageTaskOperationName.UNDELETE_BLOB,
            response.iterator().next().properties().action().ifProperty().operations().get(0).name());
        Assertions.assertEquals(StorageTaskOperationName.UNDELETE_BLOB,
            response.iterator().next().properties().action().elseProperty().operations().get(0).name());
    }
}
