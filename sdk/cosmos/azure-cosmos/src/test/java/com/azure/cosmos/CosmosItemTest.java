/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License.
 *
 */

package com.azure.cosmos;

import com.azure.cosmos.implementation.CosmosItemProperties;
import com.azure.cosmos.models.CosmosItemRequestOptions;
import com.azure.cosmos.models.CosmosItemResponse;
import com.azure.cosmos.models.CosmosQueryRequestOptions;
import com.azure.cosmos.models.FeedResponse;
import com.azure.cosmos.models.ModelBridgeInternal;
import com.azure.cosmos.models.PartitionKey;
import com.azure.cosmos.models.SqlQuerySpec;
import com.azure.cosmos.rx.TestSuiteBase;
import com.azure.cosmos.implementation.HttpConstants;
import com.azure.cosmos.util.CosmosPagedIterable;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

public class CosmosItemTest extends TestSuiteBase {

    private CosmosClient client;
    private CosmosContainer container;

    @Factory(dataProvider = "clientBuilders")
    public CosmosItemTest(CosmosClientBuilder clientBuilder) {
        super(clientBuilder);
    }

    @BeforeClass(groups = {"simple"}, timeOut = SETUP_TIMEOUT)
    public void before_CosmosItemTest() {
        assertThat(this.client).isNull();
        this.client = getClientBuilder().buildClient();
        CosmosAsyncContainer asyncContainer = getSharedMultiPartitionCosmosContainer(this.client.asyncClient());
        container = client.getDatabase(asyncContainer.getDatabase().getId()).getContainer(asyncContainer.getId());
    }

    @AfterClass(groups = {"simple"}, timeOut = SHUTDOWN_TIMEOUT, alwaysRun = true)
    public void afterClass() {
        assertThat(this.client).isNotNull();
        this.client.close();
    }

    @Test(groups = { "simple" }, timeOut = TIMEOUT)
    public void createItem() throws Exception {
        CosmosItemProperties properties = getDocumentDefinition(UUID.randomUUID().toString());
        CosmosItemResponse<CosmosItemProperties> itemResponse = container.createItem(properties);
        assertThat(itemResponse.getRequestCharge()).isGreaterThan(0);
        validateItemResponse(properties, itemResponse);

        properties = getDocumentDefinition(UUID.randomUUID().toString());
        CosmosItemResponse<CosmosItemProperties> itemResponse1 = container.createItem(properties, new CosmosItemRequestOptions());
        validateItemResponse(properties, itemResponse1);

    }

    @Test(groups = {"simple"}, timeOut = TIMEOUT)
    public void createItem_alreadyExists() throws Exception {
        CosmosItemProperties properties = getDocumentDefinition(UUID.randomUUID().toString());
        CosmosItemResponse<CosmosItemProperties> itemResponse = container.createItem(properties);
        validateItemResponse(properties, itemResponse);

        properties = getDocumentDefinition(UUID.randomUUID().toString());
        CosmosItemResponse<CosmosItemProperties> itemResponse1 = container.createItem(properties, new CosmosItemRequestOptions());
        validateItemResponse(properties, itemResponse1);

        // Test for conflict
        try {
            container.createItem(properties, new CosmosItemRequestOptions());
        } catch (Exception e) {
            assertThat(e).isInstanceOf(CosmosException.class);
            assertThat(((CosmosException) e).getStatusCode()).isEqualTo(HttpConstants.StatusCodes.CONFLICT);
        }
    }

    @Test(groups = { "simple" }, timeOut = TIMEOUT)
    public void readItem() throws Exception {
        CosmosItemProperties properties = getDocumentDefinition(UUID.randomUUID().toString());
        CosmosItemResponse<CosmosItemProperties> itemResponse = container.createItem(properties);

        CosmosItemResponse<CosmosItemProperties> readResponse1 = container.readItem(properties.getId(),
                                                                                    new PartitionKey(ModelBridgeInternal.getObjectFromJsonSerializable(properties, "mypk")),
                                                                                    new CosmosItemRequestOptions(),
                                                                                    CosmosItemProperties.class);
        validateItemResponse(properties, readResponse1);

    }

    @Test(groups = { "simple" }, timeOut = TIMEOUT)
    public void replaceItem() throws Exception{
        CosmosItemProperties properties = getDocumentDefinition(UUID.randomUUID().toString());
        CosmosItemResponse<CosmosItemProperties> itemResponse = container.createItem(properties);

        validateItemResponse(properties, itemResponse);
        String newPropValue = UUID.randomUUID().toString();
        BridgeInternal.setProperty(properties, "newProp", newPropValue);
        CosmosItemRequestOptions options = new CosmosItemRequestOptions();
        ModelBridgeInternal.setPartitionKey(options, new PartitionKey(ModelBridgeInternal.getObjectFromJsonSerializable(properties, "mypk")));
        // replace document
        CosmosItemResponse<CosmosItemProperties> replace = container.replaceItem(properties,
                                                              properties.getId(),
                                                              new PartitionKey(ModelBridgeInternal.getObjectFromJsonSerializable(properties, "mypk")),
                                                              options);
        assertThat(ModelBridgeInternal.getObjectFromJsonSerializable(BridgeInternal.getProperties(replace), "newProp")).isEqualTo(newPropValue);
    }

    @Test(groups = { "simple" }, timeOut = TIMEOUT)
    public void deleteItem() throws Exception {
        CosmosItemProperties properties = getDocumentDefinition(UUID.randomUUID().toString());
        CosmosItemResponse<CosmosItemProperties> itemResponse = container.createItem(properties);
        CosmosItemRequestOptions options = new CosmosItemRequestOptions();

        CosmosItemResponse<?> deleteResponse = container.deleteItem(properties.getId(),
                                                                    new PartitionKey(ModelBridgeInternal.getObjectFromJsonSerializable(properties, "mypk")),
                                                                    options);
        assertThat(deleteResponse.getStatusCode()).isEqualTo(204);
    }


    @Test(groups = { "simple" }, timeOut = TIMEOUT)
    public void readAllItems() throws Exception{
        CosmosItemProperties properties = getDocumentDefinition(UUID.randomUUID().toString());
        CosmosItemResponse<CosmosItemProperties> itemResponse = container.createItem(properties);

        CosmosQueryRequestOptions cosmosQueryRequestOptions = new CosmosQueryRequestOptions();

        CosmosPagedIterable<CosmosItemProperties> feedResponseIterator3 =
                container.readAllItems(cosmosQueryRequestOptions, CosmosItemProperties.class);
        assertThat(feedResponseIterator3.iterator().hasNext()).isTrue();
    }


    @Test(groups = { "simple" }, timeOut = TIMEOUT)
    public void queryItems() throws Exception{
        CosmosItemProperties properties = getDocumentDefinition(UUID.randomUUID().toString());
        CosmosItemResponse<CosmosItemProperties> itemResponse = container.createItem(properties);

        String query = String.format("SELECT * from c where c.id = '%s'", properties.getId());
        CosmosQueryRequestOptions cosmosQueryRequestOptions = new CosmosQueryRequestOptions();

        CosmosPagedIterable<CosmosItemProperties> feedResponseIterator1 =
                container.queryItems(query, cosmosQueryRequestOptions, CosmosItemProperties.class);
        // Very basic validation
        assertThat(feedResponseIterator1.iterator().hasNext()).isTrue();

        SqlQuerySpec querySpec = new SqlQuerySpec(query);
        CosmosPagedIterable<CosmosItemProperties> feedResponseIterator3 =
                container.queryItems(querySpec, cosmosQueryRequestOptions, CosmosItemProperties.class);
        assertThat(feedResponseIterator3.iterator().hasNext()).isTrue();
    }

    @Test(groups = { "simple" }, timeOut = TIMEOUT)
    public void queryItemsWithContinuationTokenAndPageSize() throws Exception{
        List<String> actualIds = new ArrayList<>();
        CosmosItemProperties properties = getDocumentDefinition(UUID.randomUUID().toString());
        container.createItem(properties);
        actualIds.add(properties.getId());
        properties = getDocumentDefinition(UUID.randomUUID().toString());
        container.createItem(properties);
        actualIds.add(properties.getId());
        properties = getDocumentDefinition(UUID.randomUUID().toString());
        container.createItem(properties);
        actualIds.add(properties.getId());


        String query = String.format("SELECT * from c where c.id in ('%s', '%s', '%s')", actualIds.get(0), actualIds.get(1), actualIds.get(2));
        CosmosQueryRequestOptions cosmosQueryRequestOptions = new CosmosQueryRequestOptions();
        String continuationToken = null;
        int pageSize = 1;

        int initialDocumentCount = 3;
        int finalDocumentCount = 0;

        CosmosPagedIterable<CosmosItemProperties> feedResponseIterator1 =
            container.queryItems(query, cosmosQueryRequestOptions, CosmosItemProperties.class);

        do {
            Iterable<FeedResponse<CosmosItemProperties>> feedResponseIterable =
                feedResponseIterator1.iterableByPage(continuationToken, pageSize);
            for (FeedResponse<CosmosItemProperties> fr : feedResponseIterable) {
                int resultSize = fr.getResults().size();
                assertThat(resultSize).isEqualTo(pageSize);
                finalDocumentCount += fr.getResults().size();
                continuationToken = fr.getContinuationToken();
            }
        } while(continuationToken != null);

        assertThat(finalDocumentCount).isEqualTo(initialDocumentCount);

    }


    private CosmosItemProperties getDocumentDefinition(String documentId) {
        final String uuid = UUID.randomUUID().toString();
        final CosmosItemProperties properties =
            new CosmosItemProperties(String.format("{ "
                                                       + "\"id\": \"%s\", "
                                                       + "\"mypk\": \"%s\", "
                                                       + "\"sgmts\": [[6519456, 1471916863], [2498434, 1455671440]]"
                                                       + "}"
                , documentId, uuid));
        return properties;
    }

    private void validateItemResponse(CosmosItemProperties containerProperties,
                                      CosmosItemResponse<CosmosItemProperties> createResponse) {
        // Basic validation
        assertThat(BridgeInternal.getProperties(createResponse).getId()).isNotNull();
        assertThat(BridgeInternal.getProperties(createResponse).getId())
            .as("check Resource Id")
            .isEqualTo(containerProperties.getId());
    }

}
