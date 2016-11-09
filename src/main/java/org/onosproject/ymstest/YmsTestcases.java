package org.onosproject.ymstest;


import org.apache.commons.codec.binary.Base64;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.ModuleIdentifier0;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.ModuleIdentifier0Service;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.ContainerIdentifier1;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.ListIdentifier1;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.containeridentifier1.ContainerIdentifier2;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.containeridentifier1.ListIdentifier2;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.containeridentifier1.containeridentifier2.ListIdentifier3;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.containeridentifier1.containeridentifier2.listidentifier3.ListIdentifier4;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.containeridentifier1.listidentifier2.ContainerIdentifier3;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.containeridentifier1.listidentifier2.LeafListIdentifier3Enum;
import org.onosproject.yang.gen.v1.root.module.RootModuleService;
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
import org.onosproject.yang.gen.v1.urn.yms.test.rpc.simple.rev20160826.SimpleRpc;
import org.onosproject.yang.gen.v1.urn.yms.test.ytb.multi.notification.with.container.rev20160826.MultiNotificationService;
import org.onosproject.yang.gen.v1.urn.yms.test.ytb.multi.notification.with.container.rev20160826.multinotification.MultiNotificationEventSubject;
import org.onosproject.yms.ych.YangCodecHandler;
import org.onosproject.yms.ych.YangProtocolEncodingFormat;
import org.onosproject.yms.ydt.YmsOperationType;
import org.onosproject.yms.ymsm.YmsService;
import org.onosproject.yms.ynh.YangNotificationService;
import org.onosproject.ymstest.module.LinkListener;
import org.onosproject.ymstest.module.ModuleIdentifier0Manager;
import org.onosproject.ymstest.module.ModuleIdentifier0Store;
import org.onosproject.ymstest.module.MultiNotificationListener;
import org.onosproject.ymstest.module.MultiNotificationManger;
import org.onosproject.ymstest.module.NetworkManager;
import org.onosproject.ymstest.module.NetworkManagerExt;
import org.onosproject.ymstest.module.RootModuleManager;
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
import java.util.Arrays;
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
                "      <lfstr>aaaaa</lfstr>\n" +
                "      <lfstr1>aaa</lfstr1>\n" +
                "      <lfbool1>true</lfbool1>\n" +
                "      <lfdecimal1>-92233720368547758.08</lfdecimal1>\n" +
                "      <lfdecimal2>92233720368547758.07</lfdecimal2>\n" +
                "      <lfenum>enum1</lfenum>\n" +
                "      <lfbits>bit2</lfbits>\n" +
                "      <lfref1>ref-string</lfref1>\n" +
                "      <lfref2>3</lfref2>\n" +
                "      <lfunion1>adarsh</lfunion1>\n" +
                "      <lfunion2>100000000</lfunion2>\n" +
                "      <lfunion10>bt1</lfunion10>\n" +
                "      <lfunion14>one</lfunion14>\n" +
                "      <cont2>\n" +
                "        <lfint8Next>1</lfint8Next>\n" +
                "      </cont2>\n" +
                "      <list2>\n" +
                "        <network-id>10.1.1.1</network-id>\n" +
                "      </list2>\n" +
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
                    !networkOpParam.isHappy())) {
                result = false;
                print("Decoded JO output not matching with expected");
            }
        }

        return result;
    }


    /**
     * Test NBI basic register flow.
     *
     * @return Test result
     */
  /*  public boolean testNbiRegister() {
        boolean result = true;

        YmsService ymsService = get(YmsService.class);

        if (ymsService == null) {
            print("ymsService is Null");
        }

        ymsService.registerService(new TopologyManager(), TopologyService.class, null);
        ymsService.registerService(new Agument1Manager(), Augment1Service.class, null);
        ymsService.registerService(new IpTopologyManager(), IpTopologyService.class, null);
        ymsService.registerService(new ModuleIdentifier0Manager(), ModuleIdentifier0Service.class, null);
        ymsService.registerService(new SimpleDataTypesManager(), SimpleDataTypesService.class, null);
        ymsService.registerService(new Exp1Manager(), Exp1Service.class, null);
        ymsService.registerService(new NetworkManagerExt(), NetworkService.class, null);
        print("Registered network service in YMS");

        return result;
    }*/

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
        SimpleDataTypesManager manager = new SimpleDataTypesManager();
        ymsService.registerService(manager, SimpleDataTypesService.class, null);

        print("Registered SimpleDataTypes service in YMS");

        // TODO Need to add validation
        String uri = "http://127.0.0.1:8181/onos/restconf/data/simple-data-types";
        String body = "{\n" +
                "\"cont\": {\n" +
                " \"lfint8Min\": \"0\",\n" +
                "      \"lfint8Max\": \"1\",\n" +
                "      \"lfint16Min\": \"0\",\n" +
                "      \"lfint16Max\": \"0\",\n" +
                "      \"lfint32Min\": \"0\",\n" +
                "      \"lfint32Max\": \"0\",\n" +
                "      \"lfint64Min\": \"0\",\n" +
                "      \"lfint64Max\": \"0\",\n" +
                "      \"lfuint8Max\": \"0\",\n" +
                "      \"lfuint16Max\": \"0\",\n" +
                "      \"lfuint32Max\": \"0\",\n" +
                "      \"lfuint64Max\": \"1\",\n" +
                "      \"lfbool1\": \"false\",\n" +
                "      \"lfbool2\": \"false\",\n" +
                "      \"lfbool3\": \"false\",\n" +
                "      \"lfdecimal1\": \"1\",\n" +
                "      \"lfdecimal2\": \"1\",\n" +
                "      \"lfdecimal3\": \"1\",\n" +
                "      \"lfdecimal4\": \"1\",\n" +
                "      \"lfdecimal6\": \"1\",\n" +
                "      \"lfref2\": \"0\"\n" +
                "}\n" +
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
        yangCodecHandler.addDeviceSchema(SimpleDataTypesService.class);

        // Build YANG module object
        List<Object> yangModuleList = new ArrayList<>();

        yangModuleList.add(manager.getAppDataStore());

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
        // ymsService.unRegisterService(manager, SimpleDataTypesService.class);
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
        NetworkManager manager = new NetworkManager();
        ymsService.registerService(manager, NetworkService.class, null);

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
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String responseBody = post(uri, body);
        if (responseBody != null) {
            result = false;
            print("Response body not matching with expected");
        }
        ymsService.unRegisterService(manager, NetworkService.class);
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

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

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

        MultiNotificationEventSubject subject = multiNotificationManger.getSubject();
        if (subject == null) {
            return false;
        }
        //   ymsService.unRegisterService(multiNotificationManger, MultiNotificationService.class);
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
            Thread.sleep(5000);
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
        ymsService.unRegisterService(managerExt, NetworkService.class);
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
        NetworkManager networkManager = new NetworkManager();
        ymsService.registerService(networkManager, NetworkService.class, null);
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
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        post(uri, body);
        Network network = networkManager.getAppDataStore();

        if (!network.name().equals("Huawei")) {
            result = false;
        }
        if (!network.surname().equals("Bangalore")) {
            result = false;
        }
        System.out.println(network.name());
        System.out.println(network.surname());
        System.out.println(network.networklist());
        ymsService.unRegisterService(networkManager, NetworkService.class);
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
            Thread.sleep(5000);
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

        body = "{\n" +
                "  \t\t\t\"networklist\" : [{\n" +
                "                \t\"network-id\" :\"2.2.2.2\",\n" +
                "                \t\"server-provided\" : \"mysore\"\n" +
                "                }]\n" +
                "}";
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        put(uri, body);

        network = manager.getNetwork((NetworkOpParam)
                NetworkOpParam.builder().build());
        System.out.println(network.name());
        System.out.println(network.surname());
        System.out.println(network.networklist());
        ymsService.unRegisterService(manager, NetworkService.class);
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

    /**
     * Test NBI basic register flow.
     *
     * @return Test result
     */
    public boolean testRootModuleE2E() {
        boolean result = true;

        YmsService ymsService = get(YmsService.class);

        if (ymsService == null) {
            print("ymsService is Null");
        }

        RootModuleManager manager = new RootModuleManager();
        ymsService.registerService(manager, RootModuleService.class, null);
        print("Registered network service in YMS");
        String uri = "http://127.0.0.1:8181/onos/restconf/data/root-module";
        String body = "{\n" +
                "\t\"container\": {\n" +
                "\t\t\"u2\":\"xyz\",\n" +
                "\t\t\"u3\":\"123\",\n" +
                "\t\t\"u4\":\"abc\",\n" +
                "\t\t\"u1\":\"123\",\n" +
                "\t\t\"u6\":\"1\",\n" +
                "\t\t\"u7\":\"mno\"\n" +
                "\t}\n" +
                "}";
        try {
            Thread.sleep(5000);
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

        yangModuleList.add(manager.getAppStore());

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

        System.out.println(xmlOutput);
        // Verify xml output
        String xmlPrettyOutput = prettyFormat(xmlOutput);
        print(xmlPrettyOutput);

        return result;
    }

    public boolean testNbiModuleIdentifier0() {
        boolean result = true;

        YmsService ymsService = get(YmsService.class);

        if (ymsService == null) {
            print("ymsService is Null");
        }

        ModuleIdentifier0Manager manager = new ModuleIdentifier0Manager();
        ymsService.registerService(manager, ModuleIdentifier0Service.class, null);
        print("Registered network service in YMS");
        // TODO Need to add validation
        // Get YANG codec handler*/
        String uri = "http://127.0.0.1:8181/onos/restconf/data/module-identifier0";
        String body = "{\n" +
                "\t\"container-identifier1\": {\n" +
                "\t\t\"container-identifier2\": {\n" +
                "\t\t\t\"leaf-identifier3\": \"LQ==\",\n" +
                "\t\t\t\"leaf-list-identifier3\": [\"LQ==\"],\n" +
                "\t\t\t\"list-identifier3\": [{\n" +
                "\t\t\t\t\"leaf-identifier4\": \"bit2\",\n" +
                "\t\t\t\t\"leaf-list-identifier4\": [\"bit1\"],\n" +
                "\n" +
                "\t\t\t\t\"list-identifier4\": [{\n" +
                "\t\t\t\t\t\"leaf-identifier5\": \"false\",\n" +
                "\t\t\t\t\t\"leaf-list-identifier5\": [\"true\"]\n" +
                "\t\t\t\t}]\n" +
                "\t\t\t}]\n" +
                "\n" +
                "\t\t},\n" +
                "\t\t\"leaf-identifier2\": \"-9.999999999999999e11\",\n" +
                "\t\t\"leaf-list-identifier2\": [\"-9.999999999999999e1\"],\n" +
                "\t\t\"list-identifier2\": [{\n" +
                "\t\t\t\"leaf-identifier3\": \"enum1\",\n" +
                "\t\t\t\"leaf-list-identifier3\": [\"enum1\"],\n" +
                "\t\t\t\"container-identifier3\": {\n" +
                "\t\t\t\t\"leaf-identifier4\": \"\",\n" +
                "\t\t\t\t\"leaf-list-identifier4\": [\"\"],\n" +
                "\t\t\t\t\"list-identifier4\": [{\n" +
                "\t\t\t\t\t\"leaf-identifier5\": \"type-pattern-string7\",\n" +
                "\t\t\t\t\t\"leaf-list-identifier5\": [\"type-pattern-string7\"]\n" +
                "\t\t\t\t}]\n" +
                "\t\t\t}\n" +
                "\t\t}, {\t\n" +
                "\t\t\t\"leaf-identifier3\": \"enum2\",\n" +
                "\t\t\t\"list-identifier3\": [{\n" +
                "\t\t\t\t\"leaf-identifier4\": \"myidentity\",\n" +
                "\t\t\t\t\"container-identifier4\": {\t\n" +
                "\t\t\t\t\t\"leaf-identifier5\": \"type-pattern-string7\",\n" +
                "\t\t\t\t\t\"leaf-list-identifier5\": [\"type-pattern-string7\"]\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t\"leaf-list-identifier4\": [\"myidentity\"]\n" +
                "\t\t\t}]\n" +
                "\n" +
                "\t\t}]\n" +
                "\t}\n" +
                "\t}";
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        post(uri, body);
        // Build YANG module object
        List<Object> yangModuleList = new ArrayList<>();

        yangModuleList.add(manager.getAppStore());
        // Get YANG codec handler
        YangCodecHandler yangCodecHandler = ymsService.getYangCodecHandler();

        if (yangCodecHandler == null) {
            print("yangCodecHandler is Null");
        }
        yangCodecHandler.addDeviceSchema(ModuleIdentifier0.class);


        // Get the XML string and compare
        Map<String, String> tagAttributeLinkedMap = new HashMap<String, String>();
        tagAttributeLinkedMap.put("type", "subtree");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
        return result;
    }

    public boolean testE2EModuleIdentifier0() {
        boolean result = true;

        YmsService ymsService = get(YmsService.class);

        if (ymsService == null) {
            print("ymsService is Null");
        }

        ModuleIdentifier0Manager manager = new ModuleIdentifier0Manager();
        ymsService.registerService(manager, ModuleIdentifier0Service.class, null);
        print("Registered network service in YMS");

        // TODO Need to add validation
        // Get YANG codec handler*/
        String uri = "http://127.0.0.1:8181/onos/restconf/data/module-identifier0";
        String body = "{\n" +
                "    \"container-identifier1\": {\n" +
                "        \"container-identifier2\": {\n" +
                "            \"leaf-identifier3\": \"LQ==\",\n" +
                "            \"leaf-list-identifier3\": [\"LQ==\", \"LQ==\", \"LQ==\"],\n" +
                "            \"list-identifier3\": [{\n" +
                "                \"leaf-identifier4\": \"bit2\",\n" +
                "                \"leaf-list-identifier4\": [\"bit1\"],\n" +
                "\n" +
                "                \"list-identifier4\": [{\n" +
                "                    \"leaf-identifier5\": \"false\",\n" +
                "                    \"leaf-list-identifier5\": [\"true\"]\n" +
                "                }]\n" +
                "            }]\n" +
                "\n" +
                "        },\n" +
                "        \"leaf-identifier2\": \"-9.999999999999999e11\",\n" +
                "        \"leaf-list-identifier2\": [\"-9.999999999999999e1\", \"-9.33333\", " +
                "\"-9.999999999999999e2\"]," +
                "\n" +
                "        \"list-identifier2\": [{\n" +
                "            \"leaf-identifier3\": \"enum1\",\n" +
                "            \"leaf-list-identifier3\": [\"enum1\"],\n" +
                "            \"container-identifier3\": {\n" +
                "                \"leaf-identifier4\": \"\",\n" +
                "                \"leaf-list-identifier4\": [\"\"],\n" +
                "                \"list-identifier4\": [{\n" +
                "                    \"leaf-identifier5\": \"type-pattern-string7\",\n" +
                "                    \"leaf-list-identifier5\": [\"type-pattern-string7\", \"type-pattern-string7\", " +
                "\"type-pattern-string7\"]\n" +
                "                }]\n" +
                "            }\n" +
                "        }, {\n" +
                "            \"leaf-identifier3\": \"enum2\",\n" +
                "            \"list-identifier3\": [{\n" +
                "                \"leaf-identifier4\": \"myidentity\",\n" +
                "                \"container-identifier4\": {\n" +
                "                    \"leaf-identifier5\": \"type-pattern-string7\",\n" +
                "                    \"leaf-list-identifier5\": [\"type-pattern-string7\"]\n" +
                "                },\n" +
                "                \"leaf-list-identifier4\": [\"myidentity\"]\n" +
                "            }]\n" +
                "\n" +
                "        }]\n" +
                "    },\n" +
                "\n" +
                "    \"leaf-identifier1\": \"-120\",\n" +
                "    \"leaf-list-identifier1\": [\"-120\"],\n" +
                "    \"list-identifier1\": [{\n" +
                "            \"leaf-identifier2\": \"56692\",\n" +
                "            \"container-identifier2\": {\n" +
                "                \"container-identifier3\": {\n" +
                "                    \"leaf-identifier4\": \"22369\",\n" +
                "                    \"leaf-list-identifier4\": [\"22369\"],\n" +
                "                    \"list-identifier4\": [{\n" +
                "                        \"leaf-identifier5\": \"123456789\",\n" +
                "                        \"leaf-list-identifier5\": [\"123456789\"]\n" +
                "                    }]\n" +
                "                },\n" +
                "                \"leaf-identifier3\": \"8123456789569005\",\n" +
                "                \"leaf-list-identifier3\": [\"8123456789569005\"],\n" +
                "                \"list-identifier3\": [{\n" +
                "                    \"leaf-identifier4\": \"150\",\n" +
                "                    \"leaf-list-identifier4\": [\"150\"],\n" +
                "                    \"container-identifier4\": {\n" +
                "                        \"leaf-identifier5\": \"type-pattern-string7\",\n" +
                "                        \"leaf-list-identifier5\": [\"type-pattern-string7\"]\n" +
                "                    }\n" +
                "\n" +
                "                }]\n" +
                "\n" +
                "            },\n" +
                "            \"leaf-list-identifier2\": [\"56693\"],\n" +
                "            \"list-identifier2\": [{\n" +
                "                \"leaf-identifier3\": \"type-pattern-string5\",\n" +
                "                \"leaf-list-identifier3\": [\"type-pattern-string5\"],\n" +
                "                \"container-identifier3\": {\n" +
                "                    \"container-identifier4\": {\n" +
                "                        \"leaf-identifier5\": \"1234567890\",\n" +
                "                        \"leaf-list-identifier5\": [\"1234567890\"]\n" +
                "                    },\n" +
                "                    \"leaf-identifier4\": \"1234567890567889\",\n" +
                "                    \"leaf-list-identifier4\": [\"1234567890567889\"]\n" +
                "                }\n" +
                "\n" +
                "            }]\n" +
                "        }\n" +
                "\n" +
                "    ]\n" +
                "\n" +
                "\n" +
                "}";
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        post(uri, body);

        if (!appObjectVerificationForE2EModuleIdentifier0(manager.getAppStore())) {
            return false;
        }
        // Get YANG codec handler
        YangCodecHandler yangCodecHandler = ymsService.getYangCodecHandler();

        if (yangCodecHandler == null) {
            print("yangCodecHandler is Null");
        }

        // Add device schema in YMS codec
        yangCodecHandler.addDeviceSchema(ModuleIdentifier0.class);

        // Build YANG module object
        List<Object> yangModuleList = new ArrayList<>();


        yangModuleList.add(manager.getAppStore());

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

       /* try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        List<Object> yangModuleDecodedList =
                yangCodecHandler.decode(xmlPrettyOutput, YangProtocolEncodingFormat.XML, YmsOperationType.RPC_REQUEST);
        System.out.println(yangModuleDecodedList);
        appObjectVerificationForE2EModuleIdentifier0((ModuleIdentifier0Store) yangModuleDecodedList.get(0));
        //   ymsService.unRegisterService(manager, ModuleIdentifier0Service.class);
        return result;
    }

    public boolean appObjectVerificationForE2EModuleIdentifier0(ModuleIdentifier0Store store) {
        ContainerIdentifier1 containerIdentifier1 = store.containerIdentifier1();
        if (!new String("-999999999999.9999").equals(containerIdentifier1.leafIdentifier2().toString())) {
            return false;
        }
        List<BigDecimal> bigDecimals = containerIdentifier1.leafListIdentifier2();
        String[] strings = {"-99.99999999999999", "-9.33333", "-999.9999999999999"};
        List<String> strings1 = Arrays.asList(strings);
        for (BigDecimal bigDecimal : bigDecimals) {
            if (!strings1.contains(bigDecimal.toString())) {
                return false;
            }
        }
        ContainerIdentifier2 containerIdentifier2 = containerIdentifier1.containerIdentifier2();
        if (new String(containerIdentifier2.leafIdentifier3()).equals("LQ==")) {
            return false;
        }
        List<byte[]> list = containerIdentifier2.leafListIdentifier3();
        for (byte[] aByte : list) {
            if (!Base64.encodeBase64String(aByte).equals("LQ==")) {
                return false;
            }
        }

        List<ListIdentifier3> listIdentifier3 = containerIdentifier1.containerIdentifier2().listIdentifier3();
        for (ListIdentifier3 identifier3 : listIdentifier3) {
            BitSet bitSet = identifier3.leafIdentifier4();
            BitSet bitSet2 = new BitSet();
            bitSet2.set(1);
            if (!bitSet.equals(bitSet2)) {
                return false;
            }
            List<BitSet> bitSets = identifier3.leafListIdentifier4();
            for (BitSet bitSet1 : bitSets) {
                BitSet bitSet3 = new BitSet();
                bitSet3.set(0);
                if (!bitSet1.equals(bitSet3)) {
                    return false;
                }
            }
            List<ListIdentifier4> listIdentifier4s = identifier3.listIdentifier4();
            for (ListIdentifier4 listIdentifier4 : listIdentifier4s) {
                if (listIdentifier4.leafIdentifier5()) {
                    return false;
                }
            }

        }
        String[] strings2 = {"enum1", "enum2", "enum3"};
        List<String> strings3 = Arrays.asList(strings2);
        List<ListIdentifier2> list1 = containerIdentifier1.listIdentifier2();
        for (ListIdentifier2 listIdentifier2 : list1) {
            if (!strings3.contains(listIdentifier2.leafIdentifier3().toString())) {
                return false;
            }
            List<LeafListIdentifier3Enum> list2 = listIdentifier2.leafListIdentifier3();
            for (LeafListIdentifier3Enum leafListIdentifier3Enum : list2) {
                if (!strings3.contains(leafListIdentifier3Enum.toString())) {
                    return false;
                }
            }
            ContainerIdentifier3 containerIdentifier3;
            if (listIdentifier2.containerIdentifier3() != null) {
                containerIdentifier3 = listIdentifier2.containerIdentifier3();
                List<Boolean> booleans = containerIdentifier3.leafListIdentifier4();
                List<Boolean> booleans1 = new ArrayList<>();
                booleans1.add(true);
                booleans1.add(false);
                for (Boolean aBoolean : booleans) {
                    if (!booleans1.contains(aBoolean)) {
                        return false;
                    }
                }
                if (!booleans1.contains(containerIdentifier3.leafIdentifier4())) {
                    return false;
                }
            }
        }

        List<ListIdentifier1> listIdentifier1 = store.listIdentifier1();
        for (ListIdentifier1 identifier1 : listIdentifier1) {
            Integer[] integers = {56692, 56693};
            List<Integer> list2 = Arrays.asList(integers);
            list2.contains(identifier1.leafIdentifier2());
            org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.
                    listidentifier1.ContainerIdentifier2
                    identifier2 = identifier1.containerIdentifier2();
            if (identifier2 != null) {
                org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.
                        listidentifier1.containeridentifier2.ContainerIdentifier3
                        identifier3 = identifier2.containerIdentifier3();
                Short[] shorts = {22369};
                List<Short> shortList = Arrays.asList(shorts);
                if (!shortList.contains(identifier3.leafIdentifier4())) {
                    return false;
                }
                List<Short> shortList1 = identifier3.leafListIdentifier4();
                for (Short aShort : shortList1) {
                    if (!shortList.contains(aShort)) {
                        return false;
                    }
                }
                List<org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.listidentifier1.
                        containeridentifier2.containeridentifier3.ListIdentifier4> listIdentifier4 =
                        identifier3.listIdentifier4();
                for (org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.listidentifier1.
                        containeridentifier2.containeridentifier3.ListIdentifier4 identifier4 : listIdentifier4) {
                    Integer[] integers1 = {123456789};
                    List<Integer> list3 = Arrays.asList(integers1);
                    if (!list3.contains(identifier4.leafIdentifier5())) {
                        return false;
                    }
                    List<Integer> list4 = identifier4.leafListIdentifier5();
                    for (Integer integer : list4) {
                        if (!list3.contains(integer)) {
                            return false;
                        }
                    }
                }

            }
        }
        return true;
    }
}
