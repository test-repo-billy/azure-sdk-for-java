// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.AzureBackupRestoreRequest;
import com.azure.resourcemanager.dataprotection.models.CrossRegionRestoreDetails;
import com.azure.resourcemanager.dataprotection.models.CrossRegionRestoreRequestObject;
import com.azure.resourcemanager.dataprotection.models.IdentityDetails;
import com.azure.resourcemanager.dataprotection.models.RecoveryOption;
import com.azure.resourcemanager.dataprotection.models.RestoreTargetInfoBase;
import com.azure.resourcemanager.dataprotection.models.SourceDataStoreType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CrossRegionRestoreRequestObjectTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CrossRegionRestoreRequestObject model = BinaryData.fromString(
            "{\"restoreRequestObject\":{\"objectType\":\"AzureBackupRestoreRequest\",\"restoreTargetInfo\":{\"objectType\":\"RestoreTargetInfoBase\",\"recoveryOption\":\"FailIfExists\",\"restoreLocation\":\"xdbabphlwr\"},\"sourceDataStoreType\":\"SnapshotStore\",\"sourceResourceId\":\"ktsthsucocmny\",\"resourceGuardOperationRequests\":[\"t\"],\"identityDetails\":{\"useSystemAssignedIdentity\":false,\"userAssignedIdentityArmUrl\":\"rq\"}},\"crossRegionRestoreDetails\":{\"sourceRegion\":\"uedck\",\"sourceBackupInstanceId\":\"ywbiexzfeyueax\"}}")
            .toObject(CrossRegionRestoreRequestObject.class);
        Assertions.assertEquals(RecoveryOption.FAIL_IF_EXISTS,
            model.restoreRequestObject().restoreTargetInfo().recoveryOption());
        Assertions.assertEquals("xdbabphlwr", model.restoreRequestObject().restoreTargetInfo().restoreLocation());
        Assertions.assertEquals(SourceDataStoreType.SNAPSHOT_STORE, model.restoreRequestObject().sourceDataStoreType());
        Assertions.assertEquals("ktsthsucocmny", model.restoreRequestObject().sourceResourceId());
        Assertions.assertEquals("t", model.restoreRequestObject().resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(false, model.restoreRequestObject().identityDetails().useSystemAssignedIdentity());
        Assertions.assertEquals("rq", model.restoreRequestObject().identityDetails().userAssignedIdentityArmUrl());
        Assertions.assertEquals("uedck", model.crossRegionRestoreDetails().sourceRegion());
        Assertions.assertEquals("ywbiexzfeyueax", model.crossRegionRestoreDetails().sourceBackupInstanceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CrossRegionRestoreRequestObject model
            = new CrossRegionRestoreRequestObject()
                .withRestoreRequestObject(new AzureBackupRestoreRequest()
                    .withRestoreTargetInfo(new RestoreTargetInfoBase().withRecoveryOption(RecoveryOption.FAIL_IF_EXISTS)
                        .withRestoreLocation("xdbabphlwr"))
                    .withSourceDataStoreType(SourceDataStoreType.SNAPSHOT_STORE)
                    .withSourceResourceId("ktsthsucocmny")
                    .withResourceGuardOperationRequests(Arrays.asList("t"))
                    .withIdentityDetails(new IdentityDetails().withUseSystemAssignedIdentity(false)
                        .withUserAssignedIdentityArmUrl("rq")))
                .withCrossRegionRestoreDetails(new CrossRegionRestoreDetails().withSourceRegion("uedck")
                    .withSourceBackupInstanceId("ywbiexzfeyueax"));
        model = BinaryData.fromObject(model).toObject(CrossRegionRestoreRequestObject.class);
        Assertions.assertEquals(RecoveryOption.FAIL_IF_EXISTS,
            model.restoreRequestObject().restoreTargetInfo().recoveryOption());
        Assertions.assertEquals("xdbabphlwr", model.restoreRequestObject().restoreTargetInfo().restoreLocation());
        Assertions.assertEquals(SourceDataStoreType.SNAPSHOT_STORE, model.restoreRequestObject().sourceDataStoreType());
        Assertions.assertEquals("ktsthsucocmny", model.restoreRequestObject().sourceResourceId());
        Assertions.assertEquals("t", model.restoreRequestObject().resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(false, model.restoreRequestObject().identityDetails().useSystemAssignedIdentity());
        Assertions.assertEquals("rq", model.restoreRequestObject().identityDetails().userAssignedIdentityArmUrl());
        Assertions.assertEquals("uedck", model.crossRegionRestoreDetails().sourceRegion());
        Assertions.assertEquals("ywbiexzfeyueax", model.crossRegionRestoreDetails().sourceBackupInstanceId());
    }
}
