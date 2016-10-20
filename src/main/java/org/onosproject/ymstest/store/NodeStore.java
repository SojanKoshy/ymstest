package org.onosproject.ymstest.store;

import org.onosproject.yang.gen.v1.urn.topo.rev20140101.Topology;
import org.onosproject.yang.gen.v1.urn.topo.rev20140101.topology.DefaultNode;
import org.onosproject.yang.gen.v1.urn.topo.rev20140101.topology.Node;
import org.onosproject.yang.gen.v1.urn.topo.rev20140101.topology.node.TerminationPoints;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by v70786 on 30/8/16.
 */
public class NodeStore
        implements Node {
    private String nodeId;
    private List<String> nodeProp = new ArrayList<>();
    private TerminationPoints terminationPoints;
    private Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    @Override
    public BitSet valueLeafFlags(){
        return null;
    }
    @Override
    public BitSet selectLeafFlags(){
        return null;
    }
    @Override
    public String nodeId() {
        return nodeId;
    }

    public void nodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @Override
    public List<String> nodeProp() {
        return nodeProp;
    }

    @Override
    public Topology.OnosYangOpType yangNodeOpType() {
        return null;
    }


    public void addToNodeProp(String value) {
        nodeProp().add(value);
    }

    @Override
    public TerminationPoints terminationPoints() {
        return terminationPoints;
    }

    public void terminationPoints(TerminationPoints terminationPoints) {
        this.terminationPoints = terminationPoints;
    }


    public void addYangAugmentedInfo(Object value, Class classObject) {
        yangAugmentedInfoMap.put(classObject, value);
    }

    @Override
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }

    @Override
    public Map<Class<?>, Object> yangAugmentedInfoMap() {
        return yangAugmentedInfoMap;
    }
/*
    @Override
    public Node processSubtreeFiltering(Node node,
                                        boolean isSelectAllSchemaChild) {
        return null;
    }*/

    @Override
    public boolean isLeafValueSet(LeafIdentifier leaf) {
        return (nodeId != null);
    }

    @Override
    public boolean isSelectLeaf(LeafIdentifier leaf) {
        return false;
    }

    public void processEdit(Node nodePara) {
        if (!(nodePara instanceof DefaultNode)) {
            //Operations are part of the default Node
            throw new RuntimeException("default Node expected");
        }
        DefaultNode opNode = (DefaultNode) nodePara;
        if (opNode.yangNodeOpType() == null) {
            throw new RuntimeException("No operation set for Node");
        }

        /*
         * Process the leaf list attributes
         */
        processNodePropEdit(nodePara, opNode.yangNodeOpType());

        /*
         * Process the child nodes
         */
        processTerminationPointsEdit(nodePara,
                                     opNode.yangNodeOpType());

        /*
         * Process the augmented node contents
         */
        for (Map.Entry<Class<?>, Object> entry
                : nodePara.yangAugmentedInfoMap().entrySet()) {
            Class<?> augmentClass = entry.getKey();
            Object augmentObjectPara = entry.getValue();
            Object storeAugmentedObject = yangAugmentedInfo(augmentClass);
            if (storeAugmentedObject != null &&
                    storeAugmentedObject instanceof
                            AugmentedOperationProcessor) {
                ProcessAugmentedEditOutput output =
                        ((AugmentedOperationProcessor)
                                storeAugmentedObject)
                                .processAugmentedEdit(augmentObjectPara);
                switch (output.mapOperate) {
                    case DELETE_OLD_ADD_NEW: {
                        yangAugmentedInfoMap().remove(storeAugmentedObject);
                        addYangAugmentedInfo(output.newStoreNode, augmentClass);
                    }
                    case DELETE_OLD: {
                        yangAugmentedInfoMap().remove(storeAugmentedObject);
                    }
                    default: {
                        //do nothing
                    }
                }
            } else if (storeAugmentedObject == null) {
                //TODO: the augment class is hard coded, since it is not
                // there in the generated classes, remove it once the YANG
                // tools can support it.
                storeAugmentedObject = new AugmentedTopoNodeStore();
                ProcessAugmentedEditOutput output =
                        ((AugmentedOperationProcessor)
                                storeAugmentedObject).processNewAugmentedEdit(
                                augmentObjectPara);
                switch (output.mapOperate) {
                    case ADD_NEW: {
                        addYangAugmentedInfo(output.newStoreNode, augmentClass);
                    }
                    default: {
                        //do nothing
                    }
                }

            }
        }

        switch (opNode.yangNodeOpType()) {
            case CREATE: {
                if (nodePara.nodeId() == null) {
                    throw new RuntimeException("Key: node.nodeId() is null");
                }
                nodeId(nodePara.nodeId());
                return;
            }
            case DELETE: {
                //do nothing, current stored node will be removed
                return;
            }

            case REPLACE: {
                nodeId(nodePara.nodeId());
                return;
            }

            case REMOVE: {
                //do nothing, current stored node will be removed
                return;
            }
            case MERGE: {
                if (nodePara.nodeId() == null) {
                    throw new RuntimeException("Key: node.nodeId() is null");
                }
                nodeId(nodePara.nodeId());
                return;
            }
            case NONE:
            default: {
                //do nothing, child schema is already processed above
                return;
            }
        }

    }

    private String findNodeProp(String searchNodeProp) {
        if (nodeProp().isEmpty()) {
            return null;
        }

        for (String nodeProp : nodeProp()) {
            if (nodeProp.equals(searchNodeProp)) {
                return nodeProp;
            }
        }
        return null;
    }

    private void processNodePropEdit(Node nodepara,
                                     Topology.OnosYangOpType
                                             onosYangNodeOperationType) {
        if (nodepara.nodeProp() == null
                || nodepara.nodeProp().isEmpty()) {
            return;
        }
        for (String nodePropPara : nodepara.nodeProp()) {
            String storedNodeProp = findNodeProp(nodePropPara);

            switch (onosYangNodeOperationType) {
                case CREATE: {
                    if (storedNodeProp != null) {
                        throw new RuntimeException(
                                "nodeProp: " + nodePropPara +
                                        " is already created");
                    }
                    addToNodeProp(nodePropPara);
                    continue; //continue with next node prop
                }
                case DELETE: {
                    if (storedNodeProp == null) {
                        throw new RuntimeException(
                                "nodeProp: " + nodePropPara + " is not in "
                                        + "store");
                    }
                    nodeProp().remove(storedNodeProp);
                    continue; //continue with next node prop
                }

                case REPLACE: {
                    if (storedNodeProp != null) {
                        //node prop is already present do nothing
                        continue; //continue with next node prop
                    }
                    nodeProp().add(nodePropPara);
                    continue; //continue with next node prop
                }

                case REMOVE: {
                    if (storedNodeProp == null) {
                        //node prop is not present do nothing
                        continue; //continue with next node prop
                    }
                    nodeProp().remove(storedNodeProp);
                    continue; //continue with next node prop
                }
                case MERGE: {
                    if (storedNodeProp == null) {
                        nodeProp().add(nodePropPara);
                        continue; //continue with next node prop
                    }

                    //node prop is already present do nothing
                    continue; //continue with next node prop
                }
                case NONE:
                default: {
                    //nothing to be done
                    continue; //continue with next node prop
                }
            }
        }

    }

    private void processTerminationPointsEdit(
            Node nodePara, Topology.OnosYangOpType
            onosYangNodeOperationType) {
        if (nodePara.terminationPoints() == null) {
            return;
        }

        if (terminationPoints() != null && !(terminationPoints() instanceof
                TerminationPointsStore)) {
            //stored node is not correct
            throw new RuntimeException("store termination points expected");
        }

        TerminationPointsStore storedTerminationPoints
                = (TerminationPointsStore) terminationPoints();
        TerminationPoints terminationPointsPara = nodePara.terminationPoints();

        switch (nodePara.terminationPoints().yangTerminationPointsOpType()) {
            case CREATE: {
                if (storedTerminationPoints != null) {
                    throw new RuntimeException("TerminationPointsStore" +
                                                       " is already " +
                                                       "created");
                }
                storedTerminationPoints = new TerminationPointsStore();
                terminationPoints(storedTerminationPoints);
                storedTerminationPoints.processEdit(terminationPointsPara);
                return;
            }
            case DELETE: {
                if (storedTerminationPoints == null) {
                    throw new RuntimeException("TerminationPointsStore" +
                                                       " is not in store");
                }
                storedTerminationPoints.processEdit(terminationPointsPara);
                terminationPoints(null);
                return;
            }

            case REPLACE: {
                if (storedTerminationPoints != null) {
                    storedTerminationPoints.processEdit(terminationPointsPara);
                    return;
                }
                storedTerminationPoints = new TerminationPointsStore();
                terminationPoints(storedTerminationPoints);
                storedTerminationPoints.processEdit(terminationPointsPara);
                return;
            }

            case REMOVE: {
                if (storedTerminationPoints == null) {
                    return;
                }
                storedTerminationPoints.processEdit(terminationPointsPara);
                terminationPoints(null);
                return;
            }
            case MERGE: {
                if (storedTerminationPoints == null) {
                    storedTerminationPoints = new TerminationPointsStore();
                    terminationPoints(storedTerminationPoints);
                    storedTerminationPoints.processEdit(terminationPointsPara);
                    return;
                }
                storedTerminationPoints.processEdit(terminationPointsPara);
                return;
            }
            case NONE: {
                if (storedTerminationPoints == null) {
                    if (terminationPointsPara != null) {
                        storedTerminationPoints = new TerminationPointsStore();
                        terminationPoints(storedTerminationPoints);
                        storedTerminationPoints
                                .processEdit(terminationPointsPara);
                    }
                    return;
                }
                storedTerminationPoints.processEdit(terminationPointsPara);
                return;
            }
            default:
        }
    }
}
