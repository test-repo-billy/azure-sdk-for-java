// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.CustomActivity;
import com.azure.resourcemanager.datafactory.models.CustomActivityReferenceObject;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CustomActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomActivity model = BinaryData.fromString(
            "{\"type\":\"jg\",\"typeProperties\":{\"command\":\"datapvealwdltstxro\",\"resourceLinkedService\":{\"referenceName\":\"znkeeeakzysakr\",\"parameters\":{\"kdwpcmy\":\"datatajdfqchj\",\"eedoruiycvourqd\":\"datadrrkfhlaygwxo\"}},\"folderPath\":\"datasitrsppucxi\",\"referenceObjects\":{\"linkedServices\":[{\"referenceName\":\"vtbl\",\"parameters\":{\"ld\":\"datalaldggw\"}},{\"referenceName\":\"elnvcfume\",\"parameters\":{\"apxnoogmfujeci\":\"datahiradklzgiqm\",\"nljy\":\"dataicmezexwzpgy\",\"bcufhkrvxxzhqouo\":\"dataumpydk\"}},{\"referenceName\":\"sczcksjwdwzfdfkg\",\"parameters\":{\"qdotbnfbn\":\"datawvmbsmxh\",\"sgw\":\"dataybotuqzjfkuqvter\",\"q\":\"dataykcvwqyfixw\",\"z\":\"dataxmiw\"}},{\"referenceName\":\"hilypuxbnvquxut\",\"parameters\":{\"nzqnqwk\":\"datasttmvai\",\"tid\":\"dataevbgjhmyzsqov\"}}],\"datasets\":[{\"referenceName\":\"yyajlnotmirg\",\"parameters\":{\"fxmefymdmfrf\":\"datacln\",\"aqzdzkyqqbqbw\":\"dataghn\"}}]},\"extendedProperties\":{\"tdeyoxtlq\":\"datatwmmvbahftkcey\",\"tepzrcqnsjqrgtap\":\"datatx\"},\"retentionTimeInDays\":\"datapzphkmwbtr\",\"autoUserSpecification\":\"datalondbvlq\"},\"linkedServiceName\":{\"referenceName\":\"wzyvxdgten\",\"parameters\":{\"kyctunfukehx\":\"datal\",\"rqfizqamxxp\":\"dataktlrcauadhprjsuw\",\"ftwtepuo\":\"dataylm\",\"hpvohvcaq\":\"datatgwwtaolfdgjrg\"}},\"policy\":{\"timeout\":\"datapkzznarnjueqo\",\"retry\":\"datajgvqzoihtncadrmt\",\"retryIntervalInSeconds\":853348175,\"secureInput\":false,\"secureOutput\":false,\"\":{\"igxndfrxnvwqy\":\"dataazbfrqo\",\"osscpjtiungjbfm\":\"datakl\"}},\"name\":\"esamhxkjjhflrgx\",\"description\":\"ghd\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Failed\",\"dependsOn\":[{\"activity\":\"zyafa\",\"dependencyConditions\":[\"Succeeded\",\"Skipped\"],\"\":{\"nrsrrijcwnt\":\"datazxjjdboxu\",\"u\":\"datatqtbcwtcqjsvlz\",\"lkocjuajclrtssbk\":\"datatzbvdz\",\"iprjahgqzb\":\"datadgwpyljn\"}},{\"activity\":\"icyufnum\",\"dependencyConditions\":[\"Skipped\"],\"\":{\"qhmuryajp\":\"datar\",\"ihbvfallpobzv\":\"datauflvazpizossqm\",\"h\":\"datantsfyntkfziitbw\",\"s\":\"datawwhml\"}},{\"activity\":\"bfg\",\"dependencyConditions\":[\"Skipped\",\"Completed\"],\"\":{\"pdwknxephw\":\"dataenzuu\",\"ymeqiqnjcajmxu\":\"datadwlo\"}},{\"activity\":\"xkvpleooom\",\"dependencyConditions\":[\"Skipped\",\"Skipped\",\"Failed\"],\"\":{\"uc\":\"datazvgog\"}}],\"userProperties\":[{\"name\":\"fobjlqnaxfvs\",\"value\":\"dataustr\"}],\"\":{\"bhgw\":\"dataxbjbknpzhfh\",\"qb\":\"datasl\",\"nepru\":\"datatcjbxochijwps\"}}")
            .toObject(CustomActivity.class);
        Assertions.assertEquals("esamhxkjjhflrgx", model.name());
        Assertions.assertEquals("ghd", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.onInactiveMarkAs());
        Assertions.assertEquals("zyafa", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("fobjlqnaxfvs", model.userProperties().get(0).name());
        Assertions.assertEquals("wzyvxdgten", model.linkedServiceName().referenceName());
        Assertions.assertEquals(853348175, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
        Assertions.assertEquals("znkeeeakzysakr", model.resourceLinkedService().referenceName());
        Assertions.assertEquals("vtbl", model.referenceObjects().linkedServices().get(0).referenceName());
        Assertions.assertEquals("yyajlnotmirg", model.referenceObjects().datasets().get(0).referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomActivity model
            = new CustomActivity().withName("esamhxkjjhflrgx")
                .withDescription("ghd")
                .withState(ActivityState.ACTIVE)
                .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.FAILED)
                .withDependsOn(Arrays.asList(
                    new ActivityDependency().withActivity("zyafa")
                        .withDependencyConditions(
                            Arrays.asList(DependencyCondition.SUCCEEDED, DependencyCondition.SKIPPED))
                        .withAdditionalProperties(mapOf()),
                    new ActivityDependency().withActivity("icyufnum")
                        .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED))
                        .withAdditionalProperties(mapOf()),
                    new ActivityDependency().withActivity("bfg")
                        .withDependencyConditions(
                            Arrays.asList(DependencyCondition.SKIPPED, DependencyCondition.COMPLETED))
                        .withAdditionalProperties(mapOf()),
                    new ActivityDependency().withActivity("xkvpleooom")
                        .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED,
                            DependencyCondition.SKIPPED, DependencyCondition.FAILED))
                        .withAdditionalProperties(mapOf())))
                .withUserProperties(Arrays.asList(new UserProperty().withName("fobjlqnaxfvs").withValue("dataustr")))
                .withLinkedServiceName(new LinkedServiceReference().withReferenceName("wzyvxdgten")
                    .withParameters(mapOf("kyctunfukehx", "datal", "rqfizqamxxp", "dataktlrcauadhprjsuw", "ftwtepuo",
                        "dataylm", "hpvohvcaq", "datatgwwtaolfdgjrg")))
                .withPolicy(new ActivityPolicy().withTimeout("datapkzznarnjueqo")
                    .withRetry("datajgvqzoihtncadrmt")
                    .withRetryIntervalInSeconds(853348175)
                    .withSecureInput(false)
                    .withSecureOutput(false)
                    .withAdditionalProperties(mapOf()))
                .withCommand("datapvealwdltstxro")
                .withResourceLinkedService(new LinkedServiceReference()
                    .withReferenceName("znkeeeakzysakr")
                    .withParameters(mapOf("kdwpcmy", "datatajdfqchj", "eedoruiycvourqd", "datadrrkfhlaygwxo")))
                .withFolderPath("datasitrsppucxi")
                .withReferenceObjects(new CustomActivityReferenceObject()
                    .withLinkedServices(Arrays.asList(
                        new LinkedServiceReference().withReferenceName("vtbl")
                            .withParameters(mapOf("ld", "datalaldggw")),
                        new LinkedServiceReference().withReferenceName("elnvcfume")
                            .withParameters(mapOf("apxnoogmfujeci", "datahiradklzgiqm", "nljy", "dataicmezexwzpgy",
                                "bcufhkrvxxzhqouo", "dataumpydk")),
                        new LinkedServiceReference().withReferenceName("sczcksjwdwzfdfkg")
                            .withParameters(mapOf("qdotbnfbn", "datawvmbsmxh", "sgw", "dataybotuqzjfkuqvter", "q",
                                "dataykcvwqyfixw", "z", "dataxmiw")),
                        new LinkedServiceReference().withReferenceName("hilypuxbnvquxut")
                            .withParameters(mapOf("nzqnqwk", "datasttmvai", "tid", "dataevbgjhmyzsqov"))))
                    .withDatasets(Arrays.asList(new DatasetReference().withReferenceName("yyajlnotmirg")
                        .withParameters(mapOf("fxmefymdmfrf", "datacln", "aqzdzkyqqbqbw", "dataghn")))))
                .withExtendedProperties(mapOf("tdeyoxtlq", "datatwmmvbahftkcey", "tepzrcqnsjqrgtap", "datatx"))
                .withRetentionTimeInDays("datapzphkmwbtr")
                .withAutoUserSpecification("datalondbvlq");
        model = BinaryData.fromObject(model).toObject(CustomActivity.class);
        Assertions.assertEquals("esamhxkjjhflrgx", model.name());
        Assertions.assertEquals("ghd", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.onInactiveMarkAs());
        Assertions.assertEquals("zyafa", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("fobjlqnaxfvs", model.userProperties().get(0).name());
        Assertions.assertEquals("wzyvxdgten", model.linkedServiceName().referenceName());
        Assertions.assertEquals(853348175, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
        Assertions.assertEquals("znkeeeakzysakr", model.resourceLinkedService().referenceName());
        Assertions.assertEquals("vtbl", model.referenceObjects().linkedServices().get(0).referenceName());
        Assertions.assertEquals("yyajlnotmirg", model.referenceObjects().datasets().get(0).referenceName());
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
