package org.onosproject.ymstest;


import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.Network;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.NetworkOpParam;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.network.DefaultNetworklist;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.network.Networklist;
import org.onosproject.yms.ych.YangCodecHandler;
import org.onosproject.yms.ych.YangProtocolEncodingFormat;
import org.onosproject.yms.ydt.YmsOperationType;
import org.onosproject.yms.ymsm.YmsService;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.onosproject.cli.AbstractShellCommand.get;

/**
 * Test cases for YMS application testing.
 */
public class YmsTestcases {

    /**
     * Converts xml string to pretty format.
     *
     * @param input xml string to be converted to pretty format
     */
    public static String prettyFormat(String input) {
        // Prepare input and output stream
        Source xmlInput = new StreamSource(new StringReader(input));
        StringWriter stringWriter = new StringWriter();
        StreamResult xmlOutput = new StreamResult(stringWriter);

        // Create transformer
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = null;

        try {
            transformer = transformerFactory.newTransformer();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        }

        // We need to omit the xml header and set indent to 4
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

        // Covert input string to xml pretty format and return
        try {
            transformer.transform(xmlInput, xmlOutput);
        } catch (TransformerException e) {
            e.printStackTrace();
        }
        return xmlOutput.getWriter().toString();
    }

    /**
     * Prints the arguments using the specified format.
     *
     * @param format format string; see {@link String#format}
     * @param args   arguments
     */
    public void print(String format, Object... args) {
        System.out.println(String.format(format, args));
    }

    /**
     * Test SBI basic encode flow.
     *
     * @return Test result
     */
        public boolean testSbiEncode() {
        boolean result = false;

        // Get YMS service
        YmsService ymsService = get(YmsService.class);

        if (ymsService == null) {
            print("ymsService is Null");
        }

        // Get YANG codec handler
        YangCodecHandler yangCodecHandler = ymsService.getYangCodecHandler();

        if (yangCodecHandler == null) {
            print("yangCodecHandler is Null");
        }

        // Add device schema in YMS codec
        yangCodecHandler.addDeviceSchema(Network.class);

        // Build YANG module object
        List<Object> yangModuleList = new ArrayList<>();
        Networklist networklist = DefaultNetworklist.builder().networkId("1000").serverProvided("1000").build();

        Object object = NetworkOpParam.builder().name("My network").isHappy(true).surname("Surname").build();

        yangModuleList.add(object);

        // Get the XML string and compare
        Map<String, String> tagAttributeLinkedMap = new HashMap<String, String>();
        tagAttributeLinkedMap.put("type", "subtree");

        // Encode JO to XML
        String xmlOutput = yangCodecHandler.encodeOperation("filter", "ydt.filter-type",
                tagAttributeLinkedMap, yangModuleList, YangProtocolEncodingFormat.XML_ENCODING,
                YmsOperationType.RPC_REQUEST);

        if (xmlOutput == null) {
            print("xmlOutput is Null");
        }

        // Verify xml output
        String xmlPrettyOutput = prettyFormat(xmlOutput);
        print(xmlPrettyOutput);

        result = xmlPrettyOutput.equals("<filter xmlns=\"ydt.filter-type\" type=\"subtree\">\n" +
                "    <network xmlns=\"urn:TBD:params:xml:ns:yang:nodes\">\n" +
                "        <name>My network</name>\n" +
                "        <surname>Surname</surname>\n" +
                "        <isHappy>true</isHappy>\n" +
                "    </network>\n" +
                "</filter>\n");

        return result;
    }

    /**
     * Test SBI basic decode valid flow.
     *
     * @return Test result
     */
    public boolean testSbiDecodeValid() {
        boolean result = false;

        // Get YMS service
        YmsService ymsService = get(YmsService.class);

        if (ymsService == null) {
            print("ymsService is Null");
        }

        // Get YANG codec handler
        YangCodecHandler yangCodecHandler = ymsService.getYangCodecHandler();

        if (yangCodecHandler == null) {
            print("yangCodecHandler is Null");
        }

        // Add device schema in YMS codec
        yangCodecHandler.addDeviceSchema(Network.class);

        // Decode XML to JO
        String xml = "<filter xmlns=\"ydt.filter-type\" type=\"subtree\">\n" +
                "    <network xmlns=\"urn:TBD:params:xml:ns:yang:nodes\">\n" +
                "        <name>My name</name>\n" +
                "        <surname>My Surname</surname>\n" +
                "        <isHappy>false</isHappy>\n" +
                "    </network>\n" +
                "</filter>\n";

        List<Object> yangModuleDecodedList = yangCodecHandler.decode(xml, YangProtocolEncodingFormat.XML_ENCODING,
                YmsOperationType.RPC_REQUEST);

        if (yangModuleDecodedList == null) {
            print("yangModuleDecodedList is Null");
        } else {
            result = true;
        }

        // TODO: Validate yangModuleDecodedList

        return result;
    }

    /**
     * Test SBI basic decode invalid flow.
     *
     * @return Test result
     */
    public boolean testSbiDecodeInvalid() {
        boolean result = false;

        // Get YMS service
        YmsService ymsService = get(YmsService.class);

        if (ymsService == null) {
            print("ymsService is Null");
        }

        // Get YANG codec handler
        YangCodecHandler yangCodecHandler = ymsService.getYangCodecHandler();

        if (yangCodecHandler == null) {
            print("yangCodecHandler is Null");
        }

        // Add device schema in YMS codec
        yangCodecHandler.addDeviceSchema(Network.class);

        // Decode invalid XML without root node filter to JO
        String invalidXml = "<network xmlns=\"urn:TBD:params:xml:ns:yang:nodes\">\n" +
                "    <name>My name</name>\n" +
                "    <surname>My Surname</surname>\n" +
                "    <isHappy>false</isHappy>\n" +
                "</network>\n";

        List<Object> yangModuleDecodedList = yangCodecHandler.decode(invalidXml,
                YangProtocolEncodingFormat.XML_ENCODING, YmsOperationType.RPC_REQUEST);

        if (yangModuleDecodedList == null) {
            print("yangModuleDecodedList is Null");
        } else {
            result = true;
        }

        // TODO: Validate yangModuleDecodedList

        // Decode invalid XML with 2 root nodes to JO
        String invalidXml2 = "<network xmlns=\"urn:TBD:params:xml:ns:yang:nodes\">\n" +
                "    <name>My name</name>\n" +
                "    <surname>My Surname</surname>\n" +
                "    <isHappy>false</isHappy>\n" +
                "</network>\n" +
                "<network xmlns=\"urn:TBD:params:xml:ns:yang:nodes\">\n" +
                "    <name>My name</name>\n" +
                "    <surname>My Surname</surname>\n" +
                "    <isHappy>false</isHappy>\n" +
                "</network>\n";


        // FIXME: Below decode() will throw exception as input is invalid

        List<Object> yangModuleDecodedList2 = yangCodecHandler.decode(invalidXml2,
                YangProtocolEncodingFormat.XML_ENCODING, YmsOperationType.RPC_REQUEST);

        if (yangModuleDecodedList2 == null) {
            print("yangModuleDecodedList2 is Null");
        }

        return result;
    }

    /**
     * Test NBI basic register flow.
     *
     * @return Test result
     */
    public boolean testNbiRegister() {

        YmsService ymsService = get(YmsService.class);

        if (ymsService == null) {
            print("ymsService is Null");
        }

        ymsService.registerService(new NetworkManager(), Network.class, null);
        print("Registered Service");
        return true;
    }


    /**
     * Test NBI register and send restconf request.
     *
     * @return Test result
     */
    public boolean testNbiRegisterSendRest() {

        YmsService ymsService = get(YmsService.class);

        if (ymsService == null) {
            print("ymsService is Null");
        }

        ymsService.registerService(new NetworkManager(), Network.class, null);
        print("Registered Service");

        try {

            Client client = Client.create();
            client.addFilter(new HTTPBasicAuthFilter("karaf", "karaf"));

            WebResource webResource = client
                    .resource("http://127.0.01:8181/onos/restconf/data/network");

            String input = "{\n" +
                    "    \"name\": \"Huawei\",\n" +
                    "    \"surname\": \"Bangalore\",\n" +
                    "    \n" +
                    "    \"networklist\": [{\n" +
                    "        \"network-id\": \"123\",\n" +
                    "        \"server-provided\": \"false\"\n" +
                    "    }]\n" +
                    "}";

            ClientResponse response = webResource.accept("application/json").type("application/json")
                    .post(ClientResponse.class, input);

            if (response.getStatus() != 201) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }

            System.out.println("Output from Server .... \n");
            String output = response.getEntity(String.class);
            System.out.println(output);

        } catch (Exception e) {

            e.printStackTrace();

        }

        return true;
    }

    /**
     * Test NBI basic unRegister flow.
     *
     * @return Test result
     */
    public boolean testNbiUnRegister() {

        YmsService ymsService = get(YmsService.class);


        ymsService.unRegisterService(this, Network.class); /// DEFECT IS THERE
        print("Registered Service");


        //TODO: Add REST POST and validate

        return true;
    }
}
