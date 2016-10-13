package org.onosproject.ymstest;


import org.apache.commons.codec.binary.Base64;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.ModuleIdentifier0Service;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.SimpleDataTypes;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.SimpleDataTypesOpParam;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.SimpleDataTypesService;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.Cont;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.DefaultCont;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.Cont2;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.DefaultCont2;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.DefaultList2;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.LfenumEnum;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.Lfunion10Union;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.Lfunion14Union;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.Lfunion1Union;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.Lfunion2Union;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.List2;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.lfunion14union.Lfunion14UnionEnum1;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.Network;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.NetworkOpParam;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.NetworkService;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.network.DefaultNetworkPath;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.network.DefaultNetworklist;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.network.NetworkPath;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.network.Networklist;
import org.onosproject.yang.gen.v1.urn.topo.rev20140101.TopologyService;
import org.onosproject.yang.gen.v1.urn.yms.test.rpc.simple.rev20160826.SimpleRpc;
import org.onosproject.yang.gen.v1.urn.yms.test.ytb.multi.notification.with.container.rev20160826.MultiNotificationService;
import org.onosproject.yms.ych.YangCodecHandler;
import org.onosproject.yms.ych.YangProtocolEncodingFormat;
import org.onosproject.yms.ydt.YmsOperationType;
import org.onosproject.yms.ymsm.YmsService;
import org.onosproject.yms.ynh.YangNotificationService;
import org.onosproject.ymstest.manager.TopologyManager;
import org.onosproject.ymstest.module.LinkListener;
import org.onosproject.ymstest.module.ModuleIdentifier0Manager;
import org.onosproject.ymstest.module.MultiNotificationListener;
import org.onosproject.ymstest.module.MultiNotificationManger;
import org.onosproject.ymstest.module.NetworkManager;
import org.onosproject.ymstest.module.NetworkManagerExt;
import org.onosproject.ymstest.module.SimpleDataTypesManager;
import org.onosproject.ymstest.module.SimpleRpcManager;

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
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.onosproject.cli.AbstractShellCommand.get;

/**
 * Test cases for YMS application testing.
 */
public class YmsTestcases {

    private boolean printEnabled = true;

    private MultiNotificationManger multiNotificationManger = new MultiNotificationManger();
    private MultiNotificationListener multiNotificationListener = new MultiNotificationListener();
    private LinkListener linkListener = new LinkListener();

    /**
     * Enable testcase printing.
     */
    public void enablePrinting() {
        this.printEnabled = true;
    }

    /**
     * Disable testcase printing.
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

        // We need to omit the xml header and set indent to 2
        if (transformer != null) {
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

            // Covert input string to xml pretty format and return
            try {
                transformer.transform(xmlInput, xmlOutput);
            } catch (TransformerException e) {
                e.printStackTrace();
            }
        }
        return xmlOutput.getWriter().toString();
    }

    /**
     * Send RESTconf post request.
     *
     * @param uri  REST request uri
     * @param body REST request body
     */
    private String post(String uri, String body) {
        String output = null;

        try {

            URL url = new URL(uri);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            String userPassword = "karaf:karaf";
            String encoding = new String(new Base64().encode(userPassword.getBytes()));
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

            print("Output from Server ...\n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return output;
    }

    /**
     * Send RESTconf put request.
     *
     * @param uri  REST request uri
     * @param body REST request body
     */
    private String put(String uri, String body) {
        String output = null;

        try {

            URL url = new URL(uri);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            String userPassword = "karaf:karaf";
            String encoding = new String(new Base64().encode(userPassword.getBytes()));
            conn.setRequestProperty("Authorization", "Basic " + encoding);

            conn.setRequestMethod("PUT");
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

            print("Output from Server ...\n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return output;
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
        List<Networklist> networklists = new ArrayList<Networklist>();
        networklists.add(networklist);
        NetworkPath networkPath = DefaultNetworkPath.builder().source("10.1.1.1").build();

        Object object = NetworkOpParam.builder().name("My network").isHappy(true)
                .surname("Surname").networkPath(networkPath).networklist(networklists).build();

        yangModuleList.add(object);

        // Get the XML string and compare
        Map<String, String> tagAttributeLinkedMap = new HashMap<String, String>();
        tagAttributeLinkedMap.put("type", "subtree");

        // Encode JO to XML
        String xmlOutput = yangCodecHandler.encodeOperation("filter", "ydt.filter-type",
                tagAttributeLinkedMap, yangModuleList, YangProtocolEncodingFormat.XML,
                YmsOperationType.RPC_REQUEST);

        if (xmlOutput == null) {
            print("xmlOutput is Null");
        }

        // Verify xml output
        String xmlPrettyOutput = prettyFormat(xmlOutput);
        print(xmlPrettyOutput);

        if (!xmlPrettyOutput.equals("<filter xmlns=\"ydt.filter-type\" type=\"subtree\">\n" +
                "  <network xmlns=\"urn:TBD:params:xml:ns:yang:nodes\">\n" +
                "    <name>My network</name>\n" +
                "    <surname>Surname</surname>\n" +
                "    <isHappy>true</isHappy>\n" +
                "    <networklist>\n" +
                "      <network-id>1000</network-id>\n" +
                "      <server-provided>1000</server-provided>\n" +
                "    </networklist>\n" +
                "    <network-path>\n" +
                "      <source>10.1.1.1</source>\n" +
                "    </network-path>\n" +
                "  </network>\n" +
                "</filter>\n")) {
            result = false;
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

        Cont2 cont2 = new DefaultCont2.Cont2Builder()
                .lfint8Next((byte) 1)
                .build();

        List<List2> lists = new ArrayList<>();
        lists.add(new DefaultList2.List2Builder().networkId("10.1.1.1").build());

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
                .lfuint16Max(-1) //TODO Defect cannot be -ve for unsigned
                .lfuint16Max(65535)
                .lfuint32Max(4294967295L)
                .lfuint64Max(new BigInteger("18446744073709551615"))
                .lfstr("aaaaa")
                .lfstr1("aaa") //TODO Defect verify "length" once it is supported
                .lfbool1(true)
                .lfdecimal1(new BigDecimal("-92233720368547758.08"))
                .lfdecimal2(new BigDecimal("92233720368547758.07"))
                .lfenum(LfenumEnum.ENUM1)
                .lfbits(BitSet.valueOf(new byte[]{0x02})) //TODO Defect not taking value and also printing {}
                .lfref1("ref-string")
                .lfref2((byte) 3)
                .lfempty(false)  //TODO Defect should be null
                .lfunion1(new Lfunion1Union("adarsh"))
                .lfunion2(new Lfunion2Union(new BigDecimal("100000000")))
                .lfunion10(new Lfunion10Union(BitSet.valueOf(new byte[]{0x11}))) // TODO why false is printing
                .lfunion14(new Lfunion14Union(Lfunion14UnionEnum1.ONE))
                        //.lfbinary(new byte[] {0x00, 0x01}) TODO Uncomment this after binary is supported
                .cont2(cont2)
                .list2(lists)
                .build();

        Object object = SimpleDataTypesOpParam.builder().cont(cont).build();

        yangModuleList.add(object);

        // Encode JO to XML
        String xmlOutput = yangCodecHandler.encodeOperation("filter", "ydt.filter-type",
                null, yangModuleList, YangProtocolEncodingFormat.XML,
                YmsOperationType.EDIT_CONFIG_REQUEST);

        if (xmlOutput == null) {
            print("xmlOutput is Null");
        }

        // Verify xml output
        String xmlPrettyOutput = prettyFormat(xmlOutput);
        print(xmlPrettyOutput);

        if (!xmlPrettyOutput.equals("<filter xmlns=\"ydt.filter-type\">\n" +
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
                // "      <lfbinary>[B@792c5006</lfbinary>\n" +
                "    </cont>\n" +
                "  </simple-data-types>\n" +
                "</filter>\n")) {
            result = false;
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

        List<Object> yangModuleDecodedList = yangCodecHandler.decode(xml, YangProtocolEncodingFormat.XML,
                YmsOperationType.RPC_REQUEST);

        if (yangModuleDecodedList == null) {
            print("yangModuleDecodedList is Null");
        } else {
            NetworkOpParam networkOpParam = (NetworkOpParam) yangModuleDecodedList.get(0);

            if (!(networkOpParam.name().equals("My name") &&
                    networkOpParam.surname().equals("My Surname") &&
                    !networkOpParam.isHappy() &&
                    networkOpParam.networklist().size() == 0)) {
                result = false;
                print("Decoded JO output not matching with expected");
            }
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

        try {
            List<Object> yangModuleDecodedList = yangCodecHandler.decode(invalidXml,
                    YangProtocolEncodingFormat.XML, YmsOperationType.RPC_REQUEST);

            if (yangModuleDecodedList != null) {
                result = false;
                print("yangModuleDecodedList is not null");
            }
        } catch (NullPointerException e) {
            // Exception is expected. Nothing to handle.
        }

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

        try {
            List<Object> yangModuleDecodedList2 = yangCodecHandler.decode(invalidXml2,
                    YangProtocolEncodingFormat.XML, YmsOperationType.RPC_REQUEST);

            if (yangModuleDecodedList2 != null) {
                result = false;
                print("yangModuleDecodedList is not null");
            }
        } catch (NullPointerException e) {
            // Exception is expected. Nothing to handle.
        }

        return result;
    }

    /**
     * Test NBI basic register flow.
     *
     * @return Test result
     */
    public boolean testNbiRegister() {
        boolean result = true;

        YmsService ymsService = get(YmsService.class);

        if (ymsService == null) {
            print("ymsService is Null");
        }

        ymsService.registerService(new NetworkManager(), NetworkService.class, null);
        ymsService.registerService(new TopologyManager(), TopologyService.class, null);
        print("Registered network service in YMS");

        // TODO Need to add validation

        return result;
    }

    /**
     * Test NBI basic data types.
     *
     * @return Test result
     */
    public boolean testNbiSimpleDataTypes() {
        boolean result = true;

        YmsService ymsService = get(YmsService.class);

        if (ymsService == null) {
            print("ymsService is Null");
        }

        ymsService.registerService(new SimpleDataTypesManager(), SimpleDataTypesService.class, null);
        ymsService.registerService(new ModuleIdentifier0Manager(), ModuleIdentifier0Service.class, null);

        print("Registered SimpleDataTypes service in YMS");

        // TODO Need to add validation

        return result;
    }

    /**
     * Test NBI register and send restconf request.
     *
     * @return Test result
     */
    public boolean testNbiRestPost() {

        boolean result = true;

        YmsService ymsService = get(YmsService.class);

        if (ymsService == null) {
            print("ymsService is Null");
        }

        ymsService.registerService(new NetworkManager(), NetworkService.class, null);

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

        String responseBody = post(uri, body);
        if (!responseBody.equals("")) {
            result = false;
            print("Response body not matching with expected");
        }

        return result;
    }

    /**
     * Test NBI basic unRegister flow.
     *
     * @return Test result
     */
    public boolean testNbiUnRegister() {
        boolean result = true;

        YmsService ymsService = get(YmsService.class);

        NetworkManager networkManager = new NetworkManager();

        ymsService.registerService(networkManager, NetworkService.class, null);

        ymsService.unRegisterService(networkManager, NetworkService.class);
        print("Unregistered network service from YMS");

        // TODO Need to add validation

        return result;
    }

    /**
     * Test NBI basic notification register and send flow.
     *
     * @return Test result
     */
    public boolean testNbiNotification() {
        boolean result = true;

        YmsService ymsService = get(YmsService.class);

        if (ymsService == null) {
            print("ymsService is Null");
        }

        ymsService.registerService(multiNotificationManger, MultiNotificationService.class, null);
        print("Registered Service");

        YangNotificationService yangNotificationService = ymsService.getYangNotificationService();
        yangNotificationService.addListener(multiNotificationListener);
        yangNotificationService.addListener(linkListener);
        print("Added notification listener");

        try {
            Thread.sleep(500);

            multiNotificationManger.sendNotification();
            print("Notification Send");

            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // TODO Need to add validation

        return result;
    }

    /**
     * Test NBI basic RPC request.
     *
     * @return Test result
     */
    public boolean testNbiSimpleRpc() {
        boolean result = true;

        YmsService ymsService = get(YmsService.class);

        if (ymsService == null) {
            print("ymsService is Null");
        }

        SimpleRpcManager simpleRpcManager = new SimpleRpcManager();
        ymsService.registerService(simpleRpcManager, SimpleRpc.class, null);
        print("Registered Service");

        // TODO Need to add validation

        return result;
    }

    /**
     * Test NBI basic E2Erequest.
     *
     * @return Test result
     */
    public boolean testE2EBasic() {
        boolean result = true;

        YmsService ymsService = get(YmsService.class);
        if (ymsService == null) {
            print("ymsService is Null");
            return false;
        }
        NetworkManagerExt managerExt = new NetworkManagerExt();
        ymsService.registerService(managerExt, NetworkService.class, null);
        print("YmsService Registered");
        // TODO Need to add validation
        // Get YANG codec handler*/
        String uri = "http://127.0.0.1:8181/onos/restconf/data/network";
        String body = "{\n" +
                "  \"name\": \"Huawei\",\n" +
                "  \"surname\": \"Bangalore\"\n" +
                "}";
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        post(uri, body);

        YangCodecHandler yangCodecHandler = ymsService.getYangCodecHandler();


        if (yangCodecHandler == null) {
            print("yangCodecHandler is Null");
        }

        // Add device schema in YMS codec
        yangCodecHandler.addDeviceSchema(NetworkService.class);

        // Build YANG module object
        List<Object> yangModuleList = new ArrayList<>();

        yangModuleList.add(managerExt.getObject());

        // Get the XML string and compare
        Map<String, String> tagAttributeLinkedMap = new HashMap<String, String>();
        tagAttributeLinkedMap.put("type", "subtree");

        // Encode JO to XML
        String xmlOutput = yangCodecHandler.encodeOperation("filter", "ydt.filter-type",
                tagAttributeLinkedMap, yangModuleList, YangProtocolEncodingFormat.XML,
                YmsOperationType.RPC_REQUEST);

        if (xmlOutput == null) {
            print("xmlOutput is Null");
        }

        // Verify xml output
        String xmlPrettyOutput = prettyFormat(xmlOutput);
        print(xmlPrettyOutput);

        if (!xmlPrettyOutput.equals("<filter xmlns=\"ydt.filter-type\" type=\"subtree\">\n" +
                "  <network xmlns=\"urn:TBD:params:xml:ns:yang:nodes\">\n" +
                "    <name>Huawei</name>\n" +
                "    <surname>Bangalore</surname>\n" +
                "  </network>\n" +
                "</filter>\n")) {
            result = false;
            print("Encoded xml output not matching with expected");
        }
        return result;
    }


    /**
     * Test NBI basic SubtreeFiltering.
     *
     * @return Test result
     */
    public boolean testSubtreeFilteringList() {
        boolean result = true;

        YmsService ymsService = get(YmsService.class);
        if (ymsService == null) {
            print("ymsService is Null");
            return false;
        }
        NetworkManager manager = new NetworkManager();
        ymsService.registerService(manager, NetworkService.class, null);
        print("YmsService Registered");
        // TODO Need to add validation
        // Get YANG codec handler*/
        String uri = "http://127.0.0.1:8181/onos/restconf/data/network";
        String body = "{\n" +
                "  \t\t\t\t\"name\": \"Huawei\",\n" +
                "\t\t\t\t\"surname\": \"Bangalore\",\n" +
                "                \"networklist\" : [{\n" +
                "                \t\"network-id\" :\"2.2.2.2\",\n" +
                "                \t\"server-provided\" : \"mysore\"\n" +
                "                }]\n" +
                "}";
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        post(uri, body);
        Network network = manager.getNetwork((NetworkOpParam)
                NetworkOpParam.builder().build());

        if (!network.name().equals("Huawei")) {
            result = false;
        }
        if (!network.surname().equals("Bangalore")) {
            result = false;
        }
        System.out.println(network.name());
        System.out.println(network.surname());
        System.out.println(network.networklist());
        return result;
    }

    /**
     * Test NBI basic SubtreeFiltering.
     *
     * @return Test result
     */
    public boolean testSubtreeFilteringPut() {
        boolean result = true;

        YmsService ymsService = get(YmsService.class);
        if (ymsService == null) {
            print("ymsService is Null");
            return false;
        }
        NetworkManager manager = new NetworkManager();
        ymsService.registerService(manager, NetworkService.class, null);
        print("YmsService Registered");
        // TODO Need to add validation
        // Get YANG codec handler*/
        String uri = "http://127.0.0.1:8181/onos/restconf/data/network";
        String body = "{\n" +
                "  \t\t\t\t\"name\": \"Huawei\",\n" +
                "\t\t\t\t\"surname\": \"Bangalore\"\n" +
                "}";
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        post(uri, body);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Network network = manager.getNetwork((NetworkOpParam)
                NetworkOpParam.builder().build());

        if (!network.name().equals("Huawei")) {
            result = false;
        }
        if (!network.surname().equals("Bangalore")) {
            result = false;
        }
        System.out.println(network.name());
        System.out.println(network.surname());

        body = "{\n" +
                "  \t\t\t\"networklist\" : [{\n" +
                "                \t\"network-id\" :\"2.2.2.2\",\n" +
                "                \t\"server-provided\" : \"mysore\"\n" +
                "                }]\n" +
                "}";
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        put(uri, body);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        network = manager.getNetwork((NetworkOpParam)
                NetworkOpParam.builder().build());
        System.out.println(network.name());
        System.out.println(network.surname());
        System.out.println(network.networklist());
        return result;
    }

    /**
     * Test NBI basic register flow.
     *
     * @return Test result
     */
    public boolean testNbiFullRegister() {
        boolean result = true;

        YmsService ymsService = get(YmsService.class);

        if (ymsService == null) {
            print("ymsService is Null");
        }

        ymsService.registerService(new ModuleIdentifier0Manager(), ModuleIdentifier0Service.class, null);
        print("Registered network service in YMS");

        // TODO Need to add validation

        return result;
    }

    public boolean testNbiModuleIdentifier0() {
        boolean result = true;

        YmsService ymsService = get(YmsService.class);

        if (ymsService == null) {
            print("ymsService is Null");
        }

        ModuleIdentifier0Manager manager= new ModuleIdentifier0Manager();
        ymsService.registerService(manager, ModuleIdentifier0Service.class, null);
        print("Registered network service in YMS");

        // TODO Need to add validation
        // Get YANG codec handler*/
        String uri = "http://127.0.0.1:8181/onos/restconf/data/module-identifier0";
        String body = "{\n" +
                "\t\"container-identifier1\": {\n" +
                "\t\t\"container-identifier2\": {\n" +
                "\t\t\t\"leaf-identifier3\": \"10111011\"\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}\n" +
                "\t\t\t";
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        post(uri, body);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       /*  ModuleIdentifier0 moduleIdentifier0 = manager.getModuleIdentifier0((ModuleIdentifier0OpParam) ModuleIdentifier0OpParam.builder().build());
        byte[] x = {1,0,1,1,0};
        byte[] result1= moduleIdentifier0.containerIdentifier1().containerIdentifier2().leafIdentifier3();
        int i=0 ;
       for(Byte byt : result1) {
                if(!byt.equals(x[i])) {
                    break;
           }
       }
       if(i != x.length-1){
            System.out.println("fail");
       }*/
        return result;
    }

}
