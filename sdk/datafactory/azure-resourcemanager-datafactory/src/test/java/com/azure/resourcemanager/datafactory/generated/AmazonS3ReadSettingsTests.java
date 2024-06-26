// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AmazonS3ReadSettings;

public final class AmazonS3ReadSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AmazonS3ReadSettings model = BinaryData.fromString(
            "{\"type\":\"vvkuzygzrzubdt\",\"recursive\":\"datavb\",\"wildcardFolderPath\":\"dataheyxewcskt\",\"wildcardFileName\":\"datawbprkf\",\"prefix\":\"dataxiikrjamzt\",\"fileListPath\":\"datamrg\",\"enablePartitionDiscovery\":\"dataypuotmkbofu\",\"partitionRootPath\":\"datahk\",\"deleteFilesAfterCompletion\":\"dataouzvegtnphnotr\",\"modifiedDatetimeStart\":\"datayje\",\"modifiedDatetimeEnd\":\"dataovjdunbaetsdufe\",\"maxConcurrentConnections\":\"dataachmhzpurnpkkbx\",\"disableMetricsCollection\":\"datacfiosra\",\"\":{\"cwuafbh\":\"datahdxnlu\",\"l\":\"dataoaqfpqfpkr\",\"oqdnxumefv\":\"datakvqogzaw\"}}")
            .toObject(AmazonS3ReadSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AmazonS3ReadSettings model = new AmazonS3ReadSettings().withMaxConcurrentConnections("dataachmhzpurnpkkbx")
            .withDisableMetricsCollection("datacfiosra")
            .withRecursive("datavb")
            .withWildcardFolderPath("dataheyxewcskt")
            .withWildcardFileName("datawbprkf")
            .withPrefix("dataxiikrjamzt")
            .withFileListPath("datamrg")
            .withEnablePartitionDiscovery("dataypuotmkbofu")
            .withPartitionRootPath("datahk")
            .withDeleteFilesAfterCompletion("dataouzvegtnphnotr")
            .withModifiedDatetimeStart("datayje")
            .withModifiedDatetimeEnd("dataovjdunbaetsdufe");
        model = BinaryData.fromObject(model).toObject(AmazonS3ReadSettings.class);
    }
}
