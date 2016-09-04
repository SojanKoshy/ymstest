package org.onosproject.ymstest;


import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.SimpleDataTypes;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.SimpleDataTypesOpParam;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.Cont;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.DefaultCont;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.Network;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.NetworkOpParam;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.network.DefaultNetworklist;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.network.Networklist;
import org.onosproject.yang.gen.v1.urn.yms.test.ytb.multi.notification.with.container.rev20160826.MultiNotification;
import org.onosproject.yms.ych.YangCodecHandler;
import org.onosproject.yms.ych.YangProtocolEncodingFormat;
import org.onosproject.yms.ydt.YmsOperationType;
import org.onosproject.yms.ymsm.YmsService;
import org.onosproject.ymstest.module.MultiNotificationManger;
import org.onosproject.ymstest.module.NetworkManager;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.onosproject.cli.AbstractShellCommand.get;

/**
 * Test cases for YMS application testing.
 */
public class YmsTestcases {

    private boolean printEnabled = true;

    /**
     * Enable testcase printing.
     *
     */
    public void enablePrinting() {
        this.printEnabled = true;
    }

    /**
     * Disable testcase printing.
     *
     */
    public void disablePrinting() {
        this.printEnabled = false;
    }

    /**
     * Prints the arguments using the specified format.
     *
     * @param format format string; see {@link String#format}
     * @param args   arguments
     */
    private void print(String format, Object... args) {
        if (printEnabled) {
            System.out.println(String.format(format, args));
        }
    }

    /**
     * Converts xml string to pretty format.
     *
     * @param input xml string to be converted to pretty format
     */
    private String prettyFormat(String input) {
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
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

        // Covert input string to xml pretty format and return
        try {
            transformer.transform(xmlInput, xmlOutput);
        } catch (TransformerException e) {
            e.printStackTrace();
        }
        return xmlOutput.getWriter().toString();
    }

    /**
     * Send RESTconf post request.
     *
     * @param uri REST request uri
     * @param body REST request body
     */
    private void post(String uri, String body) {

        try {

            URL url = new URL(uri);
            HttpURLConnection conn =  (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            String userPassword = "karaf:karaf";
            String encoding = new sun.misc.BASE64Encoder().encode(userPassword.getBytes());
            conn.setRequestProperty("Authorization", "Basic " + encoding);

            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");

            OutputStream os = conn.getOutputStream();
            os.write(body.getBytes());
            os.flush();

            if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Test SBI basic encode flow.
     *
     * @return Test result
     */
    public boolean testSbiEncode() {
        boolean result = true;

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
                "  <network xmlns=\"urn:TBD:params:xml:ns:yang:nodes\">\n" +
                "    <name>My network</name>\n" +
                "    <surname>Surname</surname>\n" +
                "    <isHappy>true</isHappy>\n" +
                "  </network>\n" +
                "</filter>\n");

        if (!result) {
            print("Encoded xml output not matching with expected");
        }

        return result;
    }

    /**
     * Test SBI all data types encode and decode.
     *
     * @return Test result
     */
    public boolean testSbiSimpleDataTypes() {
        boolean result = true;

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
        yangCodecHandler.addDeviceSchema(SimpleDataTypes.class);

        // Build YANG module object
        List<Object> yangModuleList = new ArrayList<>();

        Cont cont = new DefaultCont.ContBuilder()
                .lfint8Min((byte) -128)
                .lfint8Max((byte) 127)
                .lfint16Min((short) -32768)
                .lfint16Max((short) 32767)
                .lfint32Min(-2147483648)
                .lfint32Max(2147483647)
                .lfint64Min(-9223372036854775808L)
                .lfint64Max(9223372036854775807L)
                .lfuint8Max((short) 255)
                .lfuint16Max(65535)
                .lfuint32Max(4294967295L)
                .lfuint64Max(new BigInteger("18446744073709551615"))
                .lfbinary(new byte[] {0x00, 0x01}).build();
        Object object = SimpleDataTypesOpParam.builder().cont(cont).build();

        yangModuleList.add(object);

        // Encode JO to XML
        String xmlOutput = yangCodecHandler.encodeOperation("filter", "ydt.filter-type",
                null, yangModuleList, YangProtocolEncodingFormat.XML_ENCODING,
                YmsOperationType.EDIT_CONFIG_REQUEST);

        if (xmlOutput == null) {
            print("xmlOutput is Null");
        }

        // Verify xml output
        String xmlPrettyOutput = prettyFormat(xmlOutput);
        print(xmlPrettyOutput);

        result = xmlPrettyOutput.equals("<filter xmlns=\"ydt.filter-type\">\n" +
                "  <simple-data-types xmlns=\"urn:simple:data:types\">\n" +
                "    <cont>\n" +
                "      <lfint8Min>-128</lfint8Min>\n" +
                "      <lfint8Max>127</lfint8Max>\n" +
                "      <lfint16Min>-32768</lfint16Min>\n" +
                "      <lfint16Max>32767</lfint16Max>\n" +
                "      <lfint32Min>-2147483648</lfint32Min>\n" +
                "      <lfint32Max>2147483647</lfint32Max>\n" +
                "      <lfint64Min>-9223372036854775808</lfint64Min>\n" +
                "      <lfint64Max>9223372036854775807</lfint64Max>\n" +
                "      <lfuint8Max>255</lfuint8Max>\n" +
                "      <lfuint16Max>65535</lfuint16Max>\n" +
                "      <lfuint32Max>4294967295</lfuint32Max>\n" +
                "      <lfuint64Max>18446744073709551615</lfuint64Max>\n" +
                "      <lfbinary>[B@792c5006</lfbinary>\n" +
                "    </cont>\n" +
                "  </simple-data-types>\n" +
                "</filter>\n");

        if (!result) {
            print("Encoded xml output not matching with expected");
        }

        return result;
    }

    /**
     * Test SBI basic decode valid flow.
     *
     * @return Test result
     */
    public boolean testSbiDecodeValid() {
        boolean result = true;

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
            NetworkOpParam networkOpParam = (NetworkOpParam) yangModuleDecodedList.get(0);
            result = (networkOpParam.name().equals("My name") &&
                    networkOpParam.surname().equals("My Surname") &&
                    networkOpParam.isHappy() &&
                    networkOpParam.networklist().size() == 0);
        }

        if (!result) {
            print("Decoded JO output not matching with expected");
        }

        return result;
    }

    /**
     * Test SBI basic decode invalid flow.
     *
     * @return Test result
     */
    public boolean testSbiDecodeInvalid() {
        boolean result = true;

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

        if (yangModuleDecodedList != null) {
            result = true;
            print("yangModuleDecodedList is not null");
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

        if (yangModuleDecodedList2 != null) {
            result = false;
            print("yangModuleDecodedList is not null");
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
        print("Registered network service in YMS");
        return true;
    }

    /**
     * Test NBI register and send restconf request.
     *
     * @return Test result
     */
    public boolean testNbiRegisterSendRest() {

        boolean result = false;

        YmsService ymsService = get(YmsService.class);

        if (ymsService == null) {
            print("ymsService is Null");
        }

        ymsService.registerService(new NetworkManager(), Network.class, null);

        String uri = "http://127.0.0.1:8181/onos/restconf/data/network";
        String body = "{\n" +
                "  \"name\": \"Huawei\",\n" +
                "  \"surname\": \"Bangalore\",\n" +
                "\n" +
                "  \"networklist\": [{\n" +
                "    \"network-id\": \"123\",\n" +
                "    \"server-provided\": \"false\"\n" +
                "  }]\n" +
                "}";

        post(uri, body);
        return result;
    }

    /**
     * Test NBI basic unRegister flow.
     *
     * @return Test result
     */
    public boolean testNbiUnRegister() {

        YmsService ymsService = get(YmsService.class);


        ymsService.unRegisterService(this, Network.class); /// DEFECT IS THERE
        print("Unregistered network service from YMS");


        //TODO: Add REST POST and validate

        return true;
    }

    /**
     * Test NBI basic register flow.
     *
     * @return Test result
     */
    public boolean testNbiNotification() {

        YmsService ymsService = get(YmsService.class);

        if (ymsService == null) {
            print("ymsService is Null");
        }

        MultiNotificationManger multiNotificationManger = new MultiNotificationManger();
        ymsService.registerService(multiNotificationManger, MultiNotification.class, null);
        print("Registered Service");

        multiNotificationManger.sendNotification();
        print("Notification Send");
        return true;
    }
}