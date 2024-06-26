// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.SkuListResult;

public final class SkuListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SkuListResult model = BinaryData.fromString(
            "{\"value\":[{\"resourceType\":\"wbqpl\",\"locations\":[\"nuuepzlrp\",\"wzsoldweyuqdunv\"],\"capabilities\":[{\"name\":\"wrbiorkt\",\"value\":\"ywjhhgdnhx\"},{\"name\":\"ivfomiloxgg\",\"value\":\"fi\"},{\"name\":\"dieuzaofj\",\"value\":\"vcyy\"}],\"name\":\"s\",\"tier\":\"Standard\",\"size\":\"tcubiipuipwoqonm\",\"family\":\"jeknizshq\",\"capacity\":1591499316},{\"resourceType\":\"pevf\",\"locations\":[\"lrri\"],\"capabilities\":[{\"name\":\"dxsm\",\"value\":\"cwrwfs\"},{\"name\":\"fnynszqujizdvoqy\",\"value\":\"byowbblgyavutp\"}],\"name\":\"hjoxo\",\"tier\":\"Basic\",\"size\":\"ksbpimlqoljx\",\"family\":\"gxxlxsffgcvizq\",\"capacity\":514804559}],\"nextLink\":\"vwlyoup\"}")
            .toObject(SkuListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SkuListResult model = new SkuListResult();
        model = BinaryData.fromObject(model).toObject(SkuListResult.class);
    }
}
