// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.fluent.models.PacketCoreControlPlaneVersionPropertiesFormat;
import com.azure.resourcemanager.mobilenetwork.models.ObsoleteVersion;
import com.azure.resourcemanager.mobilenetwork.models.Platform;
import com.azure.resourcemanager.mobilenetwork.models.PlatformType;
import com.azure.resourcemanager.mobilenetwork.models.RecommendedVersion;
import com.azure.resourcemanager.mobilenetwork.models.VersionState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PacketCoreControlPlaneVersionPropertiesFormatTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PacketCoreControlPlaneVersionPropertiesFormat model = BinaryData.fromString(
            "{\"provisioningState\":\"Deleted\",\"platforms\":[{\"platformType\":\"3P-AZURE-STACK-HCI\",\"versionState\":\"Unknown\",\"minimumPlatformSoftwareVersion\":\"bnxknalaulppg\",\"maximumPlatformSoftwareVersion\":\"tpnapnyiropuhpig\",\"recommendedVersion\":\"NotRecommended\",\"obsoleteVersion\":\"Obsolete\"},{\"platformType\":\"AKS-HCI\",\"versionState\":\"Unknown\",\"minimumPlatformSoftwareVersion\":\"xmedjvcsly\",\"maximumPlatformSoftwareVersion\":\"wwncwzzhxgk\",\"recommendedVersion\":\"Recommended\",\"obsoleteVersion\":\"NotObsolete\"},{\"platformType\":\"3P-AZURE-STACK-HCI\",\"versionState\":\"Active\",\"minimumPlatformSoftwareVersion\":\"t\",\"maximumPlatformSoftwareVersion\":\"ellwptfdy\",\"recommendedVersion\":\"NotRecommended\",\"obsoleteVersion\":\"Obsolete\"}]}")
            .toObject(PacketCoreControlPlaneVersionPropertiesFormat.class);
        Assertions.assertEquals(PlatformType.THREE_P_AZURE_STACK_HCI, model.platforms().get(0).platformType());
        Assertions.assertEquals(VersionState.UNKNOWN, model.platforms().get(0).versionState());
        Assertions.assertEquals("bnxknalaulppg", model.platforms().get(0).minimumPlatformSoftwareVersion());
        Assertions.assertEquals("tpnapnyiropuhpig", model.platforms().get(0).maximumPlatformSoftwareVersion());
        Assertions.assertEquals(RecommendedVersion.NOT_RECOMMENDED, model.platforms().get(0).recommendedVersion());
        Assertions.assertEquals(ObsoleteVersion.OBSOLETE, model.platforms().get(0).obsoleteVersion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PacketCoreControlPlaneVersionPropertiesFormat model
            = new PacketCoreControlPlaneVersionPropertiesFormat().withPlatforms(Arrays.asList(
                new Platform().withPlatformType(PlatformType.THREE_P_AZURE_STACK_HCI)
                    .withVersionState(VersionState.UNKNOWN).withMinimumPlatformSoftwareVersion("bnxknalaulppg")
                    .withMaximumPlatformSoftwareVersion("tpnapnyiropuhpig")
                    .withRecommendedVersion(RecommendedVersion.NOT_RECOMMENDED)
                    .withObsoleteVersion(ObsoleteVersion.OBSOLETE),
                new Platform().withPlatformType(PlatformType.AKS_HCI).withVersionState(VersionState.UNKNOWN)
                    .withMinimumPlatformSoftwareVersion("xmedjvcsly").withMaximumPlatformSoftwareVersion("wwncwzzhxgk")
                    .withRecommendedVersion(RecommendedVersion.RECOMMENDED)
                    .withObsoleteVersion(ObsoleteVersion.NOT_OBSOLETE),
                new Platform().withPlatformType(PlatformType.THREE_P_AZURE_STACK_HCI)
                    .withVersionState(VersionState.ACTIVE).withMinimumPlatformSoftwareVersion("t")
                    .withMaximumPlatformSoftwareVersion("ellwptfdy")
                    .withRecommendedVersion(RecommendedVersion.NOT_RECOMMENDED)
                    .withObsoleteVersion(ObsoleteVersion.OBSOLETE)));
        model = BinaryData.fromObject(model).toObject(PacketCoreControlPlaneVersionPropertiesFormat.class);
        Assertions.assertEquals(PlatformType.THREE_P_AZURE_STACK_HCI, model.platforms().get(0).platformType());
        Assertions.assertEquals(VersionState.UNKNOWN, model.platforms().get(0).versionState());
        Assertions.assertEquals("bnxknalaulppg", model.platforms().get(0).minimumPlatformSoftwareVersion());
        Assertions.assertEquals("tpnapnyiropuhpig", model.platforms().get(0).maximumPlatformSoftwareVersion());
        Assertions.assertEquals(RecommendedVersion.NOT_RECOMMENDED, model.platforms().get(0).recommendedVersion());
        Assertions.assertEquals(ObsoleteVersion.OBSOLETE, model.platforms().get(0).obsoleteVersion());
    }
}
