/*
 * Copyright 2015-present Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onosproject.ymstest.cli;

import org.apache.karaf.shell.commands.Argument;
import org.apache.karaf.shell.commands.Command;
import org.onosproject.cli.AbstractShellCommand;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.Network;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.NetworkOpParam;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.network.DefaultNetworklist;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.network.Networklist;
import org.onosproject.yms.ych.YangCodecHandler;
import org.onosproject.yms.ych.YangProtocolEncodingFormat;
import org.onosproject.yms.ydt.YmsOperationType;
import org.onosproject.yms.ymsm.YmsService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CLI command to get the current leader for the Election test application.
 */

@Command(scope = "onos", name = "yms-test",
        description = "YMS test application")
public class YmsTestCommand extends AbstractShellCommand {

    @Argument(index = 0, name = "testcaseName", description = "Test case name.", required = true, multiValued = false)
    String testcaseName = null;

    @Override
    protected void execute() {
        if (testcaseName.equalsIgnoreCase("sbi")) {
            YmsService ymsService = get(YmsService.class);

            if (ymsService == null) {
                print("ymsService is Null");
            }

            YangCodecHandler yangCodecHandler = ymsService.getYangCodecHandler();
            if (yangCodecHandler == null) {
                print("YangCodecHandler is Null");
            }

            yangCodecHandler.addDeviceSchema(Network.class);
            print("SBI App added device Schema in YMS Codec ");

            // Get the xml string and compare
            Map<String, String> tagAttributeLinkedMap = new HashMap<String, String>();
            tagAttributeLinkedMap.put("type", "subtree");

            // Creating the object
            List<Object> yangModuleList = new ArrayList<>();
            Networklist networklist = DefaultNetworklist.builder().networkId("1000").serverProvided("1000").build();

            Object object = NetworkOpParam.builder().name("My network").isHappy(true).build();

            yangModuleList.add(object);


            // Encode JO to XML
            String xmlOutput = yangCodecHandler.encodeOperation("filter", "ydt.filter-type",
                    tagAttributeLinkedMap, yangModuleList, YangProtocolEncodingFormat.XML_ENCODING, YmsOperationType.RPC_REQUEST);

            if (xmlOutput == null) {
                print("xmlOutput is Null");
            }

            // Decode XML to JO
            boolean result = xmlOutput.equals("<network xmlns=\"urn:TBD:params:xml:ns:yang:nodes\"><name>My network</name><surname>My surname</surname><networklist><network-id>1000</network-id><server-provided>1000</server-provided></networklist></network>");

            print(xmlOutput);
            print("Test passed = " + result);
        }
        else if (testcaseName.equalsIgnoreCase("nbi")) {

            YmsService ymsService = get(YmsService.class);

            if (ymsService == null) {
                print("ymsService is Null");
            }

            ymsService.registerService(this, Network.class, null);
            print("Registered Service");


            ymsService.unRegisterService(this, Network.class); /// ISSUE IS THERE

        }
    }
}
