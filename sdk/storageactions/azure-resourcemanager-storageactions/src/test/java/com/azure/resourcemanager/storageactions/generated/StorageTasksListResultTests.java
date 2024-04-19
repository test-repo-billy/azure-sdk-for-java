// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageactions.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storageactions.models.StorageTasksListResult;

public final class StorageTasksListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageTasksListResult model = BinaryData.fromString(
            "{\"value\":[{\"identity\":{\"principalId\":\"9a82585b-8c70-457f-be4d-d4a7ff3ebd78\",\"tenantId\":\"f13b9c35-d0be-4219-b0cd-41115cf52d83\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"y\":{\"principalId\":\"8ac2b76d-446c-408f-b2db-d42ff21ce0d6\",\"clientId\":\"a521fd52-3797-459c-9dfb-299f537a9d8a\"},\"jbdlwtgrhpdjpju\":{\"principalId\":\"1aa6ef3f-64ca-47a0-a6f8-4039721c8031\",\"clientId\":\"48ab0012-d1b5-4124-8085-2b83572ddab6\"}}},\"properties\":{\"taskVersion\":4349636942449523138,\"enabled\":false,\"description\":\"jpqyegu\",\"action\":{\"if\":{\"condition\":\"lhbxxhejjzzvdud\",\"operations\":[{\"name\":\"SetBlobImmutabilityPolicy\"},{\"name\":\"SetBlobExpiry\"},{\"name\":\"SetBlobTier\"}]},\"else\":{\"operations\":[{\"name\":\"SetBlobExpiry\"},{\"name\":\"DeleteBlob\"},{\"name\":\"DeleteBlob\"},{\"name\":\"SetBlobTags\"}]}},\"provisioningState\":\"Deleting\",\"creationTimeInUtc\":\"2021-01-27T06:45:01Z\"},\"location\":\"lbjnpgacftadehx\",\"tags\":{\"uesnzwdejbavo\":\"yfsoppu\",\"vudwx\":\"xzdmohctb\",\"gujjugwdkcglh\":\"ndnvo\",\"ofqweykhmenevfye\":\"lazjdyggdtjixhbk\"},\"id\":\"fwhybcibvy\",\"name\":\"dcsi\",\"type\":\"ynnaam\"},{\"identity\":{\"principalId\":\"c9581b8d-e48f-45c2-8ef6-2d0bafae7051\",\"tenantId\":\"6964b505-46ad-4173-84d0-937de7125ca5\",\"type\":\"None\",\"userAssignedIdentities\":{\"scjeypv\":{\"principalId\":\"aa1bba3c-ff2c-4e3c-a503-4acc92b34f8c\",\"clientId\":\"ad3aeb49-2dbc-4bb4-8dfe-062918f5e9fd\"}}},\"properties\":{\"taskVersion\":3144809064731797978,\"enabled\":true,\"description\":\"q\",\"action\":{\"if\":{\"condition\":\"c\",\"operations\":[{\"name\":\"SetBlobTier\"},{\"name\":\"SetBlobLegalHold\"},{\"name\":\"SetBlobTags\"},{\"name\":\"UndeleteBlob\"}]},\"else\":{\"operations\":[{\"name\":\"DeleteBlob\"},{\"name\":\"SetBlobLegalHold\"},{\"name\":\"SetBlobExpiry\"}]}},\"provisioningState\":\"Deleting\",\"creationTimeInUtc\":\"2021-08-20T18:32:02Z\"},\"location\":\"xyqj\",\"tags\":{\"jh\":\"attpngjcrcczsq\",\"ysou\":\"mdajv\",\"canoaeupf\":\"q\",\"tuo\":\"yhltrpmopjmcm\"},\"id\":\"thfuiuaodsfcpkvx\",\"name\":\"dpuozmyz\",\"type\":\"dagfuaxbezyiuok\"},{\"identity\":{\"principalId\":\"7abefcb7-54cb-4c58-80d2-f99814d5bd39\",\"tenantId\":\"7c262389-b77b-436a-9097-9fd2e69bbead\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"ywqsmbsurexim\":{\"principalId\":\"3160fc5c-f952-4c46-9627-c8b67807e8a4\",\"clientId\":\"4d415a62-69e3-4dfc-af79-6df2c81b37ee\"}}},\"properties\":{\"taskVersion\":4342038682597268889,\"enabled\":true,\"description\":\"sfksy\",\"action\":{\"if\":{\"condition\":\"ddystkiiuxhqy\",\"operations\":[{\"name\":\"SetBlobLegalHold\"},{\"name\":\"SetBlobTier\"},{\"name\":\"SetBlobExpiry\"},{\"name\":\"SetBlobTags\"}]},\"else\":{\"operations\":[{\"name\":\"SetBlobImmutabilityPolicy\"},{\"name\":\"SetBlobTags\"},{\"name\":\"DeleteBlob\"},{\"name\":\"SetBlobImmutabilityPolicy\"}]}},\"provisioningState\":\"Canceled\",\"creationTimeInUtc\":\"2021-06-20T18:48:12Z\"},\"location\":\"qrvkdv\",\"tags\":{\"d\":\"lrmv\"},\"id\":\"watkpnpulexxb\",\"name\":\"zwtruwiqzbqjvsov\",\"type\":\"yokacspkw\"},{\"identity\":{\"principalId\":\"100c714d-fbcc-4335-b4d9-914a60339a07\",\"tenantId\":\"e2806682-cf64-4165-87c3-2286899c033b\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"mflbv\":{\"principalId\":\"5b9004d1-5fd8-43cd-8cfb-65c0de1f1893\",\"clientId\":\"53b3ac07-1273-4430-b7d5-a466cd66b1de\"},\"hrk\":{\"principalId\":\"ecfa24f1-189c-4599-bb30-e6e041ef7476\",\"clientId\":\"3c612036-5627-4c9f-b75e-6720f8cd88ca\"},\"wwzjuqkhrsajiwku\":{\"principalId\":\"f494e34c-1fa7-431b-8bd3-5af7990b0bb2\",\"clientId\":\"a5b787e5-07a8-450c-b623-b33f13ecda41\"},\"skghsauuimj\":{\"principalId\":\"e6b7e025-c8d3-4210-97e7-ace78aaadd53\",\"clientId\":\"a4fb3aaf-bf97-4005-ba12-960390de3e86\"}}},\"properties\":{\"taskVersion\":2519768107676496444,\"enabled\":true,\"description\":\"uugidyjrrfby\",\"action\":{\"if\":{\"condition\":\"osvexcsonpclhoc\",\"operations\":[{\"name\":\"SetBlobImmutabilityPolicy\"},{\"name\":\"SetBlobTier\"},{\"name\":\"UndeleteBlob\"}]},\"else\":{\"operations\":[{\"name\":\"DeleteBlob\"},{\"name\":\"SetBlobExpiry\"},{\"name\":\"SetBlobExpiry\"},{\"name\":\"SetBlobExpiry\"}]}},\"provisioningState\":\"ValidateSubscriptionQuotaBegin\",\"creationTimeInUtc\":\"2021-09-05T06:09:57Z\"},\"location\":\"fmvfaxkffeiit\",\"tags\":{\"zy\":\"m\",\"burvjxxjnspy\":\"shxmzsbbzoggigrx\"},\"id\":\"ptkoenkoukn\",\"name\":\"udwtiukbl\",\"type\":\"ngkpocipazy\"}],\"nextLink\":\"egukgjnpiucg\"}")
            .toObject(StorageTasksListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageTasksListResult model = new StorageTasksListResult();
        model = BinaryData.fromObject(model).toObject(StorageTasksListResult.class);
    }
}
