// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.ChownMode;
import com.azure.resourcemanager.netapp.models.CoolAccessRetrievalPolicy;
import com.azure.resourcemanager.netapp.models.ExportPolicyRule;
import com.azure.resourcemanager.netapp.models.ServiceLevel;
import com.azure.resourcemanager.netapp.models.SmbAccessBasedEnumeration;
import com.azure.resourcemanager.netapp.models.SmbNonBrowsable;
import com.azure.resourcemanager.netapp.models.VolumePatch;
import com.azure.resourcemanager.netapp.models.VolumePatchPropertiesDataProtection;
import com.azure.resourcemanager.netapp.models.VolumePatchPropertiesExportPolicy;
import com.azure.resourcemanager.netapp.models.VolumeSnapshotProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class VolumePatchTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VolumePatch model = BinaryData.fromString(
            "{\"properties\":{\"serviceLevel\":\"Ultra\",\"usageThreshold\":2245300278286998069,\"exportPolicy\":{\"rules\":[{\"ruleIndex\":1252528512,\"unixReadOnly\":true,\"unixReadWrite\":false,\"kerberos5ReadOnly\":false,\"kerberos5ReadWrite\":true,\"kerberos5iReadOnly\":false,\"kerberos5iReadWrite\":false,\"kerberos5pReadOnly\":true,\"kerberos5pReadWrite\":true,\"cifs\":true,\"nfsv3\":false,\"nfsv41\":false,\"allowedClients\":\"hcaalnjix\",\"hasRootAccess\":false,\"chownMode\":\"Unrestricted\"},{\"ruleIndex\":939698337,\"unixReadOnly\":true,\"unixReadWrite\":true,\"kerberos5ReadOnly\":true,\"kerberos5ReadWrite\":true,\"kerberos5iReadOnly\":false,\"kerberos5iReadWrite\":true,\"kerberos5pReadOnly\":true,\"kerberos5pReadWrite\":false,\"cifs\":true,\"nfsv3\":true,\"nfsv41\":true,\"allowedClients\":\"xhnrztfolhb\",\"hasRootAccess\":true,\"chownMode\":\"Unrestricted\"},{\"ruleIndex\":1904300707,\"unixReadOnly\":false,\"unixReadWrite\":false,\"kerberos5ReadOnly\":true,\"kerberos5ReadWrite\":true,\"kerberos5iReadOnly\":true,\"kerberos5iReadWrite\":true,\"kerberos5pReadOnly\":false,\"kerberos5pReadWrite\":true,\"cifs\":false,\"nfsv3\":false,\"nfsv41\":false,\"allowedClients\":\"vpgylgqgitxmed\",\"hasRootAccess\":false,\"chownMode\":\"Unrestricted\"},{\"ruleIndex\":73392328,\"unixReadOnly\":true,\"unixReadWrite\":false,\"kerberos5ReadOnly\":false,\"kerberos5ReadWrite\":true,\"kerberos5iReadOnly\":false,\"kerberos5iReadWrite\":true,\"kerberos5pReadOnly\":false,\"kerberos5pReadWrite\":true,\"cifs\":true,\"nfsv3\":true,\"nfsv41\":false,\"allowedClients\":\"eoellwptfdygp\",\"hasRootAccess\":false,\"chownMode\":\"Restricted\"}]},\"throughputMibps\":82.87768,\"dataProtection\":{\"snapshot\":{\"snapshotPolicyId\":\"fqrhhuaopppc\"}},\"isDefaultQuotaEnabled\":true,\"defaultUserQuotaInKiBs\":2031358735864920909,\"defaultGroupQuotaInKiBs\":1205860539886844150,\"unixPermissions\":\"zxctobgb\",\"coolAccess\":false,\"coolnessPeriod\":1356840761,\"coolAccessRetrievalPolicy\":\"Default\",\"snapshotDirectoryVisible\":true,\"smbAccessBasedEnumeration\":\"Disabled\",\"smbNonBrowsable\":\"Disabled\"},\"location\":\"cfbu\",\"tags\":{\"xxjyngudivkrtsw\":\"fqjhhkxbpvjymj\",\"vjfdx\":\"xqzvszjfa\",\"qtdo\":\"ivetvtcq\"},\"id\":\"mcbxvwvxysl\",\"name\":\"bhsfxob\",\"type\":\"ytkblmpew\"}")
            .toObject(VolumePatch.class);
        Assertions.assertEquals("cfbu", model.location());
        Assertions.assertEquals("fqjhhkxbpvjymj", model.tags().get("xxjyngudivkrtsw"));
        Assertions.assertEquals(ServiceLevel.ULTRA, model.serviceLevel());
        Assertions.assertEquals(2245300278286998069L, model.usageThreshold());
        Assertions.assertEquals(1252528512, model.exportPolicy().rules().get(0).ruleIndex());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).unixReadOnly());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).unixReadWrite());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).kerberos5ReadOnly());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).kerberos5ReadWrite());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).kerberos5IReadOnly());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).kerberos5IReadWrite());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).kerberos5PReadOnly());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).kerberos5PReadWrite());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).cifs());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).nfsv3());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).nfsv41());
        Assertions.assertEquals("hcaalnjix", model.exportPolicy().rules().get(0).allowedClients());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).hasRootAccess());
        Assertions.assertEquals(ChownMode.UNRESTRICTED, model.exportPolicy().rules().get(0).chownMode());
        Assertions.assertEquals(82.87768F, model.throughputMibps());
        Assertions.assertEquals("fqrhhuaopppc", model.dataProtection().snapshot().snapshotPolicyId());
        Assertions.assertEquals(true, model.isDefaultQuotaEnabled());
        Assertions.assertEquals(2031358735864920909L, model.defaultUserQuotaInKiBs());
        Assertions.assertEquals(1205860539886844150L, model.defaultGroupQuotaInKiBs());
        Assertions.assertEquals("zxctobgb", model.unixPermissions());
        Assertions.assertEquals(false, model.coolAccess());
        Assertions.assertEquals(1356840761, model.coolnessPeriod());
        Assertions.assertEquals(CoolAccessRetrievalPolicy.DEFAULT, model.coolAccessRetrievalPolicy());
        Assertions.assertEquals(true, model.snapshotDirectoryVisible());
        Assertions.assertEquals(SmbAccessBasedEnumeration.DISABLED, model.smbAccessBasedEnumeration());
        Assertions.assertEquals(SmbNonBrowsable.DISABLED, model.smbNonBrowsable());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VolumePatch model = new VolumePatch().withLocation("cfbu")
            .withTags(mapOf("xxjyngudivkrtsw", "fqjhhkxbpvjymj", "vjfdx", "xqzvszjfa", "qtdo", "ivetvtcq"))
            .withServiceLevel(ServiceLevel.ULTRA).withUsageThreshold(2245300278286998069L)
            .withExportPolicy(new VolumePatchPropertiesExportPolicy().withRules(Arrays.asList(
                new ExportPolicyRule().withRuleIndex(1252528512).withUnixReadOnly(true).withUnixReadWrite(false)
                    .withKerberos5ReadOnly(false).withKerberos5ReadWrite(true).withKerberos5IReadOnly(false)
                    .withKerberos5IReadWrite(false).withKerberos5PReadOnly(true).withKerberos5PReadWrite(true)
                    .withCifs(true).withNfsv3(false).withNfsv41(false).withAllowedClients("hcaalnjix")
                    .withHasRootAccess(false).withChownMode(ChownMode.UNRESTRICTED),
                new ExportPolicyRule().withRuleIndex(939698337).withUnixReadOnly(true).withUnixReadWrite(true)
                    .withKerberos5ReadOnly(true).withKerberos5ReadWrite(true).withKerberos5IReadOnly(false)
                    .withKerberos5IReadWrite(true).withKerberos5PReadOnly(true).withKerberos5PReadWrite(false)
                    .withCifs(true).withNfsv3(true).withNfsv41(true).withAllowedClients("xhnrztfolhb")
                    .withHasRootAccess(true).withChownMode(ChownMode.UNRESTRICTED),
                new ExportPolicyRule().withRuleIndex(1904300707).withUnixReadOnly(false).withUnixReadWrite(false)
                    .withKerberos5ReadOnly(true).withKerberos5ReadWrite(true).withKerberos5IReadOnly(true)
                    .withKerberos5IReadWrite(true).withKerberos5PReadOnly(false).withKerberos5PReadWrite(true)
                    .withCifs(false).withNfsv3(false).withNfsv41(false).withAllowedClients("vpgylgqgitxmed")
                    .withHasRootAccess(false).withChownMode(ChownMode.UNRESTRICTED),
                new ExportPolicyRule().withRuleIndex(73392328).withUnixReadOnly(true).withUnixReadWrite(false)
                    .withKerberos5ReadOnly(false).withKerberos5ReadWrite(true).withKerberos5IReadOnly(false)
                    .withKerberos5IReadWrite(true).withKerberos5PReadOnly(false).withKerberos5PReadWrite(true)
                    .withCifs(true).withNfsv3(true).withNfsv41(false).withAllowedClients("eoellwptfdygp")
                    .withHasRootAccess(false).withChownMode(ChownMode.RESTRICTED))))
            .withThroughputMibps(82.87768F)
            .withDataProtection(new VolumePatchPropertiesDataProtection()
                .withSnapshot(new VolumeSnapshotProperties().withSnapshotPolicyId("fqrhhuaopppc")))
            .withIsDefaultQuotaEnabled(true).withDefaultUserQuotaInKiBs(2031358735864920909L)
            .withDefaultGroupQuotaInKiBs(1205860539886844150L).withUnixPermissions("zxctobgb").withCoolAccess(false)
            .withCoolnessPeriod(1356840761).withCoolAccessRetrievalPolicy(CoolAccessRetrievalPolicy.DEFAULT)
            .withSnapshotDirectoryVisible(true).withSmbAccessBasedEnumeration(SmbAccessBasedEnumeration.DISABLED)
            .withSmbNonBrowsable(SmbNonBrowsable.DISABLED);
        model = BinaryData.fromObject(model).toObject(VolumePatch.class);
        Assertions.assertEquals("cfbu", model.location());
        Assertions.assertEquals("fqjhhkxbpvjymj", model.tags().get("xxjyngudivkrtsw"));
        Assertions.assertEquals(ServiceLevel.ULTRA, model.serviceLevel());
        Assertions.assertEquals(2245300278286998069L, model.usageThreshold());
        Assertions.assertEquals(1252528512, model.exportPolicy().rules().get(0).ruleIndex());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).unixReadOnly());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).unixReadWrite());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).kerberos5ReadOnly());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).kerberos5ReadWrite());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).kerberos5IReadOnly());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).kerberos5IReadWrite());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).kerberos5PReadOnly());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).kerberos5PReadWrite());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).cifs());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).nfsv3());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).nfsv41());
        Assertions.assertEquals("hcaalnjix", model.exportPolicy().rules().get(0).allowedClients());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).hasRootAccess());
        Assertions.assertEquals(ChownMode.UNRESTRICTED, model.exportPolicy().rules().get(0).chownMode());
        Assertions.assertEquals(82.87768F, model.throughputMibps());
        Assertions.assertEquals("fqrhhuaopppc", model.dataProtection().snapshot().snapshotPolicyId());
        Assertions.assertEquals(true, model.isDefaultQuotaEnabled());
        Assertions.assertEquals(2031358735864920909L, model.defaultUserQuotaInKiBs());
        Assertions.assertEquals(1205860539886844150L, model.defaultGroupQuotaInKiBs());
        Assertions.assertEquals("zxctobgb", model.unixPermissions());
        Assertions.assertEquals(false, model.coolAccess());
        Assertions.assertEquals(1356840761, model.coolnessPeriod());
        Assertions.assertEquals(CoolAccessRetrievalPolicy.DEFAULT, model.coolAccessRetrievalPolicy());
        Assertions.assertEquals(true, model.snapshotDirectoryVisible());
        Assertions.assertEquals(SmbAccessBasedEnumeration.DISABLED, model.smbAccessBasedEnumeration());
        Assertions.assertEquals(SmbNonBrowsable.DISABLED, model.smbNonBrowsable());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
