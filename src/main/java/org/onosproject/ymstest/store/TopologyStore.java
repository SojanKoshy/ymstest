package org.onosproject.ymstest.store;

import org.onosproject.yang.gen.v1.urn.topo.rev20140101.Topology;
import org.onosproject.yang.gen.v1.urn.topo.rev20140101.TopologyOpParam;
import org.onosproject.yang.gen.v1.urn.topo.rev20140101.topology.DefaultNode;
import org.onosproject.yang.gen.v1.urn.topo.rev20140101.topology.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by v70786 on 30/8/16.
 */
public class TopologyStore
        implements Topology {

    protected Topology.OnosYangOpType onosYangOpType;

    public TopologyStore() {

    }

    private List<Node> nodeStoreList = new ArrayList<>();

    @Override
    public OnosYangOpType yangTopologyOpType() {
        return onosYangOpType;
    }

    @Override
    public List<Node> node() {
        return nodeStoreList;
    }

    public void addToNode(Node value) {
        node().add(value);
    }

    @Override
    public Topology processSubtreeFiltering(Topology topology,
                                            boolean isSelectAllSchemaChild) {
        return null;
    }

    private Node findNodeInStore(Node findNode) {
        for (Node node : nodeStoreList) {
//            if (node.nodeId() == null) {
//                continue;
//            }
            if (node.nodeId().equals(findNode.nodeId())) {
                return node;
            }
        }
        return null;
    }

    public void processEdit(TopologyOpParam topology) {
//        if (topology.onosYangNodeOperationType() != TopologyOpParam
//                .OnosYangNodeOperationType.NONE) {
//            throw new RuntimeException("store modification not supported");
//        }
        processNodeEdit(topology);
    }

    private void processNodeEdit(TopologyOpParam topology) {
        if (topology.node() == null || topology.node().isEmpty()) {
            return;
        }
        for (Node nodePara : topology.node()) {
            Node nodeInStore = findNodeInStore(nodePara);

            if (nodeInStore != null && !(nodeInStore instanceof NodeStore)) {
                //stored node is not correct
                throw new RuntimeException("store Node expected");
            }
            NodeStore storedNode = (NodeStore) nodeInStore;

            if (!(nodePara instanceof DefaultNode)) {
                //Operations are part of the default Node
                throw new RuntimeException("default Node expected");
            }
            DefaultNode opNode = (DefaultNode) nodePara;
            if (opNode.yangNodeOpType() == null) {
                throw new RuntimeException("No operation set for Node");
            }
            switch (opNode.yangNodeOpType()) {
                case CREATE: {
                    if (storedNode != null) {
                        throw new RuntimeException(
                                "Node: " + nodePara.nodeId() + " is already " +
                                        "created");
                    }
                    storedNode = new NodeStore();
                    nodeStoreList.add(storedNode);
                    storedNode.processEdit(nodePara);
                    continue; //continue to process the next input node
                }
                case DELETE: {
                    if (storedNode == null) {
                        throw new RuntimeException(
                                "Node: " + nodePara.nodeId() + " is not in " +
                                        "store");
                    }
                    storedNode.processEdit(nodePara);
                    nodeStoreList.remove(storedNode);
                    continue; //continue to process the next input node
                }

                case REPLACE: {
                    if (storedNode != null) {
                        storedNode.processEdit(nodePara);
                        continue; //continue to process the next input node
                    }
                    storedNode = new NodeStore();
                    nodeStoreList.add(storedNode);
                    storedNode.processEdit(nodePara);
                    continue; //continue to process the next input node
                }

                case REMOVE: {
                    if (storedNode == null) {
                        continue; //continue to process the next input node
                    }
                    storedNode.processEdit(nodePara);
                    nodeStoreList.remove(storedNode);
                    continue; //continue to process the next input node
                }
                case MERGE: {
                    if (storedNode == null) {
                        storedNode = new NodeStore();
                        nodeStoreList.add(storedNode);
                        storedNode.processEdit(nodePara);
                        continue; //continue to process the next input node
                    }
                    storedNode.processEdit(nodePara);
                    continue; //continue to process the next input node
                }
                case NONE: {
                    if (storedNode == null) {
                        if (nodePara != null) {
                            storedNode = new NodeStore();
                            nodeStoreList.add(storedNode);
                            storedNode.processEdit(nodePara);
                        }
                        continue; //continue to process the next input node
                    }
                    storedNode.processEdit(nodePara);
                    continue; //continue to process the next input node
                }
                default:
            }
        }
    }
}
