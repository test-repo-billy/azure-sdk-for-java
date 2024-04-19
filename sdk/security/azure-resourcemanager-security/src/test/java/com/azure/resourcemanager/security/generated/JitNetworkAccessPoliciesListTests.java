// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.JitNetworkAccessPolicyInner;
import com.azure.resourcemanager.security.fluent.models.JitNetworkAccessRequestInner;
import com.azure.resourcemanager.security.models.JitNetworkAccessPoliciesList;
import com.azure.resourcemanager.security.models.JitNetworkAccessPolicyVirtualMachine;
import com.azure.resourcemanager.security.models.JitNetworkAccessPortRule;
import com.azure.resourcemanager.security.models.JitNetworkAccessRequestVirtualMachine;
import com.azure.resourcemanager.security.models.Protocol;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class JitNetworkAccessPoliciesListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JitNetworkAccessPoliciesList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"virtualMachines\":[{\"id\":\"arogatmolji\",\"ports\":[{\"number\":2022022413,\"protocol\":\"UDP\",\"maxRequestAccessDuration\":\"inmzvfkne\"},{\"number\":1462600525,\"protocol\":\"TCP\",\"maxRequestAccessDuration\":\"ztrknsj\"}],\"publicIpAddress\":\"ugdybnhrxlel\"}],\"requests\":[{\"virtualMachines\":[{\"id\":\"eizcpih\",\"ports\":[]}],\"startTimeUtc\":\"2021-05-13T08:13:31Z\",\"requestor\":\"miw\",\"justification\":\"kpty\"},{\"virtualMachines\":[{\"id\":\"ydbjzcqymlcf\",\"ports\":[]}],\"startTimeUtc\":\"2021-06-25T21:50:33Z\",\"requestor\":\"hmhsurlgwqkpm\",\"justification\":\"pstauol\"}],\"provisioningState\":\"iubmom\"},\"kind\":\"vvjhvvlrlohewjj\",\"location\":\"jnkdflqion\",\"id\":\"waeqkzfzqxjosho\",\"name\":\"totryegpkhxrme\",\"type\":\"znlw\"},{\"properties\":{\"virtualMachines\":[{\"id\":\"fokxk\",\"ports\":[{\"number\":1693785,\"protocol\":\"TCP\",\"maxRequestAccessDuration\":\"erufgjblcdrmy\"},{\"number\":1595592115,\"protocol\":\"*\",\"maxRequestAccessDuration\":\"mftzgyy\"},{\"number\":33792220,\"protocol\":\"TCP\",\"maxRequestAccessDuration\":\"lugekdfqnhtt\"},{\"number\":500622504,\"protocol\":\"*\",\"maxRequestAccessDuration\":\"wrczfjjnnuxxrk\"}],\"publicIpAddress\":\"hmnulwem\"},{\"id\":\"dcifrhjulrsulwz\",\"ports\":[{\"number\":1744731026,\"protocol\":\"*\",\"maxRequestAccessDuration\":\"snawmhhgzotfri\"}],\"publicIpAddress\":\"gkoekvzwxxyxh\"}],\"requests\":[{\"virtualMachines\":[{\"id\":\"t\",\"ports\":[]},{\"id\":\"bxmolpcqydeyk\",\"ports\":[]},{\"id\":\"skiczd\",\"ports\":[]},{\"id\":\"rjeizik\",\"ports\":[]}],\"startTimeUtc\":\"2021-01-28T05:30:08Z\",\"requestor\":\"aboohxbmsgyc\",\"justification\":\"xrmdvewuyqaeohpj\"},{\"virtualMachines\":[{\"id\":\"ejkbvhhdaurgho\",\"ports\":[]},{\"id\":\"xaex\",\"ports\":[]}],\"startTimeUtc\":\"2021-08-25T17:36:27Z\",\"requestor\":\"hxjxjoezlqxrkdkn\",\"justification\":\"bekt\"},{\"virtualMachines\":[{\"id\":\"o\",\"ports\":[]}],\"startTimeUtc\":\"2021-01-12T01:20:03Z\",\"requestor\":\"m\",\"justification\":\"amicbigwcdgz\"},{\"virtualMachines\":[{\"id\":\"znuxkeuairaabmdl\",\"ports\":[]},{\"id\":\"jbedpfixlhupmomi\",\"ports\":[]}],\"startTimeUtc\":\"2021-07-08T16:12:01Z\",\"requestor\":\"bdnpxpkcd\",\"justification\":\"eyxel\"}],\"provisioningState\":\"cghf\"},\"kind\":\"ufssjyghsfxr\",\"location\":\"hammgmqfmefgv\",\"id\":\"cpdwjgquxwey\",\"name\":\"landkdcdjhunhgh\",\"type\":\"gawnrrnquo\"},{\"properties\":{\"virtualMachines\":[{\"id\":\"otire\",\"ports\":[{\"number\":886080025,\"protocol\":\"UDP\",\"maxRequestAccessDuration\":\"obfsxstc\"},{\"number\":988078128,\"protocol\":\"TCP\",\"maxRequestAccessDuration\":\"bvzmmxcjzlquz\"},{\"number\":2114204984,\"protocol\":\"*\",\"maxRequestAccessDuration\":\"kjxebj\"},{\"number\":4593514,\"protocol\":\"TCP\",\"maxRequestAccessDuration\":\"inzabwmvoglj\"}],\"publicIpAddress\":\"lpgidn\"},{\"id\":\"cehaqi\",\"ports\":[{\"number\":279830620,\"protocol\":\"TCP\",\"maxRequestAccessDuration\":\"l\"},{\"number\":1532369371,\"protocol\":\"UDP\",\"maxRequestAccessDuration\":\"omqo\"}],\"publicIpAddress\":\"epiaeapfsergd\"}],\"requests\":[{\"virtualMachines\":[{\"id\":\"nacyheqwb\",\"ports\":[]},{\"id\":\"qq\",\"ports\":[]}],\"startTimeUtc\":\"2021-03-26T04:05:33Z\",\"requestor\":\"jubkhjozfymcwmb\",\"justification\":\"yvqyvliqiips\"}],\"provisioningState\":\"bsvs\"},\"kind\":\"ieswhddzydisn\",\"location\":\"pywyjlnld\",\"id\":\"xottdiia\",\"name\":\"cqibzj\",\"type\":\"hweebiph\"},{\"properties\":{\"virtualMachines\":[{\"id\":\"vcjwqwoqsratj\",\"ports\":[{\"number\":983426999,\"protocol\":\"*\",\"maxRequestAccessDuration\":\"ybspijhfrzg\"},{\"number\":1963704063,\"protocol\":\"TCP\",\"maxRequestAccessDuration\":\"agvwukhs\"}],\"publicIpAddress\":\"mm\"}],\"requests\":[{\"virtualMachines\":[{\"id\":\"zhwilzzh\",\"ports\":[]},{\"id\":\"ijmri\",\"ports\":[]},{\"id\":\"r\",\"ports\":[]}],\"startTimeUtc\":\"2021-06-23T03:46:35Z\",\"requestor\":\"dneyttlr\",\"justification\":\"ivcbkutpumltwj\"}],\"provisioningState\":\"uxynb\"},\"kind\":\"zlqywauyqn\",\"location\":\"khmocgjs\",\"id\":\"gouarhwvixqq\",\"name\":\"gljkybsj\",\"type\":\"clrvtzqnrbctbh\"}],\"nextLink\":\"hxpcvrdnyeita\"}")
            .toObject(JitNetworkAccessPoliciesList.class);
        Assertions.assertEquals("vvjhvvlrlohewjj", model.value().get(0).kind());
        Assertions.assertEquals("arogatmolji", model.value().get(0).virtualMachines().get(0).id());
        Assertions.assertEquals(2022022413, model.value().get(0).virtualMachines().get(0).ports().get(0).number());
        Assertions.assertEquals(Protocol.UDP, model.value().get(0).virtualMachines().get(0).ports().get(0).protocol());
        Assertions.assertEquals("inmzvfkne",
            model.value().get(0).virtualMachines().get(0).ports().get(0).maxRequestAccessDuration());
        Assertions.assertEquals("ugdybnhrxlel", model.value().get(0).virtualMachines().get(0).publicIpAddress());
        Assertions.assertEquals("eizcpih", model.value().get(0).requests().get(0).virtualMachines().get(0).id());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-13T08:13:31Z"),
            model.value().get(0).requests().get(0).startTimeUtc());
        Assertions.assertEquals("miw", model.value().get(0).requests().get(0).requestor());
        Assertions.assertEquals("kpty", model.value().get(0).requests().get(0).justification());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JitNetworkAccessPoliciesList model = new JitNetworkAccessPoliciesList().withValue(Arrays.asList(
            new JitNetworkAccessPolicyInner().withKind("vvjhvvlrlohewjj")
                .withVirtualMachines(Arrays.asList(new JitNetworkAccessPolicyVirtualMachine().withId("arogatmolji")
                    .withPorts(Arrays.asList(
                        new JitNetworkAccessPortRule().withNumber(2022022413).withProtocol(Protocol.UDP)
                            .withMaxRequestAccessDuration("inmzvfkne"),
                        new JitNetworkAccessPortRule().withNumber(1462600525).withProtocol(Protocol.TCP)
                            .withMaxRequestAccessDuration("ztrknsj")))
                    .withPublicIpAddress("ugdybnhrxlel")))
                .withRequests(
                    Arrays.asList(
                        new JitNetworkAccessRequestInner()
                            .withVirtualMachines(Arrays.asList(new JitNetworkAccessRequestVirtualMachine()
                                .withId("eizcpih").withPorts(Arrays.asList())))
                            .withStartTimeUtc(OffsetDateTime.parse("2021-05-13T08:13:31Z")).withRequestor("miw")
                            .withJustification("kpty"),
                        new JitNetworkAccessRequestInner()
                            .withVirtualMachines(Arrays.asList(new JitNetworkAccessRequestVirtualMachine()
                                .withId("ydbjzcqymlcf").withPorts(Arrays.asList())))
                            .withStartTimeUtc(OffsetDateTime.parse("2021-06-25T21:50:33Z"))
                            .withRequestor("hmhsurlgwqkpm").withJustification("pstauol"))),
            new JitNetworkAccessPolicyInner().withKind("ufssjyghsfxr")
                .withVirtualMachines(Arrays.asList(
                    new JitNetworkAccessPolicyVirtualMachine().withId("fokxk")
                        .withPorts(Arrays.asList(
                            new JitNetworkAccessPortRule().withNumber(1693785).withProtocol(Protocol.TCP)
                                .withMaxRequestAccessDuration("erufgjblcdrmy"),
                            new JitNetworkAccessPortRule().withNumber(1595592115).withProtocol(Protocol.ASTERISK)
                                .withMaxRequestAccessDuration("mftzgyy"),
                            new JitNetworkAccessPortRule().withNumber(33792220).withProtocol(Protocol.TCP)
                                .withMaxRequestAccessDuration("lugekdfqnhtt"),
                            new JitNetworkAccessPortRule().withNumber(500622504).withProtocol(Protocol.ASTERISK)
                                .withMaxRequestAccessDuration("wrczfjjnnuxxrk")))
                        .withPublicIpAddress("hmnulwem"),
                    new JitNetworkAccessPolicyVirtualMachine().withId("dcifrhjulrsulwz")
                        .withPorts(Arrays.asList(new JitNetworkAccessPortRule().withNumber(1744731026)
                            .withProtocol(Protocol.ASTERISK).withMaxRequestAccessDuration("snawmhhgzotfri")))
                        .withPublicIpAddress("gkoekvzwxxyxh")))
                .withRequests(Arrays.asList(
                    new JitNetworkAccessRequestInner()
                        .withVirtualMachines(Arrays.asList(
                            new JitNetworkAccessRequestVirtualMachine().withId("t").withPorts(Arrays.asList()),
                            new JitNetworkAccessRequestVirtualMachine().withId("bxmolpcqydeyk")
                                .withPorts(Arrays.asList()),
                            new JitNetworkAccessRequestVirtualMachine().withId("skiczd").withPorts(Arrays.asList()),
                            new JitNetworkAccessRequestVirtualMachine().withId("rjeizik").withPorts(Arrays.asList())))
                        .withStartTimeUtc(OffsetDateTime.parse("2021-01-28T05:30:08Z")).withRequestor("aboohxbmsgyc")
                        .withJustification("xrmdvewuyqaeohpj"),
                    new JitNetworkAccessRequestInner()
                        .withVirtualMachines(Arrays.asList(
                            new JitNetworkAccessRequestVirtualMachine().withId("ejkbvhhdaurgho")
                                .withPorts(Arrays.asList()),
                            new JitNetworkAccessRequestVirtualMachine().withId("xaex").withPorts(Arrays.asList())))
                        .withStartTimeUtc(OffsetDateTime.parse("2021-08-25T17:36:27Z"))
                        .withRequestor("hxjxjoezlqxrkdkn").withJustification("bekt"),
                    new JitNetworkAccessRequestInner()
                        .withVirtualMachines(Arrays
                            .asList(new JitNetworkAccessRequestVirtualMachine().withId("o").withPorts(Arrays.asList())))
                        .withStartTimeUtc(OffsetDateTime.parse("2021-01-12T01:20:03Z")).withRequestor("m")
                        .withJustification("amicbigwcdgz"),
                    new JitNetworkAccessRequestInner()
                        .withVirtualMachines(Arrays.asList(
                            new JitNetworkAccessRequestVirtualMachine().withId("znuxkeuairaabmdl")
                                .withPorts(Arrays.asList()),
                            new JitNetworkAccessRequestVirtualMachine().withId("jbedpfixlhupmomi")
                                .withPorts(Arrays.asList())))
                        .withStartTimeUtc(OffsetDateTime.parse("2021-07-08T16:12:01Z")).withRequestor("bdnpxpkcd")
                        .withJustification("eyxel"))),
            new JitNetworkAccessPolicyInner().withKind("ieswhddzydisn")
                .withVirtualMachines(Arrays.asList(
                    new JitNetworkAccessPolicyVirtualMachine().withId("otire")
                        .withPorts(Arrays.asList(
                            new JitNetworkAccessPortRule().withNumber(886080025).withProtocol(Protocol.UDP)
                                .withMaxRequestAccessDuration("obfsxstc"),
                            new JitNetworkAccessPortRule().withNumber(988078128).withProtocol(Protocol.TCP)
                                .withMaxRequestAccessDuration("bvzmmxcjzlquz"),
                            new JitNetworkAccessPortRule().withNumber(2114204984).withProtocol(Protocol.ASTERISK)
                                .withMaxRequestAccessDuration("kjxebj"),
                            new JitNetworkAccessPortRule().withNumber(4593514).withProtocol(Protocol.TCP)
                                .withMaxRequestAccessDuration("inzabwmvoglj")))
                        .withPublicIpAddress("lpgidn"),
                    new JitNetworkAccessPolicyVirtualMachine().withId("cehaqi")
                        .withPorts(Arrays.asList(
                            new JitNetworkAccessPortRule().withNumber(279830620).withProtocol(Protocol.TCP)
                                .withMaxRequestAccessDuration("l"),
                            new JitNetworkAccessPortRule().withNumber(1532369371).withProtocol(Protocol.UDP)
                                .withMaxRequestAccessDuration("omqo")))
                        .withPublicIpAddress("epiaeapfsergd")))
                .withRequests(
                    Arrays
                        .asList(new JitNetworkAccessRequestInner()
                            .withVirtualMachines(Arrays.asList(
                                new JitNetworkAccessRequestVirtualMachine().withId("nacyheqwb")
                                    .withPorts(Arrays.asList()),
                                new JitNetworkAccessRequestVirtualMachine().withId("qq").withPorts(Arrays.asList())))
                            .withStartTimeUtc(OffsetDateTime.parse("2021-03-26T04:05:33Z"))
                            .withRequestor("jubkhjozfymcwmb").withJustification("yvqyvliqiips"))),
            new JitNetworkAccessPolicyInner().withKind("zlqywauyqn")
                .withVirtualMachines(Arrays.asList(new JitNetworkAccessPolicyVirtualMachine().withId("vcjwqwoqsratj")
                    .withPorts(Arrays.asList(
                        new JitNetworkAccessPortRule().withNumber(983426999).withProtocol(Protocol.ASTERISK)
                            .withMaxRequestAccessDuration("ybspijhfrzg"),
                        new JitNetworkAccessPortRule().withNumber(1963704063).withProtocol(Protocol.TCP)
                            .withMaxRequestAccessDuration("agvwukhs")))
                    .withPublicIpAddress("mm")))
                .withRequests(
                    Arrays
                        .asList(new JitNetworkAccessRequestInner()
                            .withVirtualMachines(Arrays.asList(
                                new JitNetworkAccessRequestVirtualMachine().withId("zhwilzzh")
                                    .withPorts(Arrays.asList()),
                                new JitNetworkAccessRequestVirtualMachine().withId("ijmri").withPorts(Arrays.asList()),
                                new JitNetworkAccessRequestVirtualMachine().withId("r").withPorts(Arrays.asList())))
                            .withStartTimeUtc(OffsetDateTime.parse("2021-06-23T03:46:35Z")).withRequestor("dneyttlr")
                            .withJustification("ivcbkutpumltwj")))));
        model = BinaryData.fromObject(model).toObject(JitNetworkAccessPoliciesList.class);
        Assertions.assertEquals("vvjhvvlrlohewjj", model.value().get(0).kind());
        Assertions.assertEquals("arogatmolji", model.value().get(0).virtualMachines().get(0).id());
        Assertions.assertEquals(2022022413, model.value().get(0).virtualMachines().get(0).ports().get(0).number());
        Assertions.assertEquals(Protocol.UDP, model.value().get(0).virtualMachines().get(0).ports().get(0).protocol());
        Assertions.assertEquals("inmzvfkne",
            model.value().get(0).virtualMachines().get(0).ports().get(0).maxRequestAccessDuration());
        Assertions.assertEquals("ugdybnhrxlel", model.value().get(0).virtualMachines().get(0).publicIpAddress());
        Assertions.assertEquals("eizcpih", model.value().get(0).requests().get(0).virtualMachines().get(0).id());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-13T08:13:31Z"),
            model.value().get(0).requests().get(0).startTimeUtc());
        Assertions.assertEquals("miw", model.value().get(0).requests().get(0).requestor());
        Assertions.assertEquals("kpty", model.value().get(0).requests().get(0).justification());
    }
}
