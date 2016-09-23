package org.onosproject.ymstest.module;


import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.ModuleIdentifier0;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.ModuleIdentifier0OpParam;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.ContainerIdentifier1;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.DefaultContainerIdentifier1;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.ListIdentifier1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root1 on 14/9/16.
 */
public class ModuleIdentifier0Store implements ModuleIdentifier0 {

    private List<ContainerIdentifier1> nodeStoreList = new ArrayList<>();

    private List<ListIdentifier1> listIdentifier1 = new ArrayList<>();
    private byte leafIdentifier1;
    private List<String> leafListIdentifier1 = new ArrayList<>();

    @Override
    public byte leafIdentifier1() {
        return leafIdentifier1;
    }

    @Override
    public List<String> leafListIdentifier1() {
        return leafListIdentifier1;
    }

    @Override
    public ContainerIdentifier1 containerIdentifier1() {
        return null;
    }

    @Override
    public List<ListIdentifier1> listIdentifier1() {
        return listIdentifier1;
    }

    @Override
    public ModuleIdentifier0 processSubtreeFiltering(ModuleIdentifier0 moduleIdentifier0,
                                                     boolean isSelectAllSchemaChild) {
        return null;
    }

    @Override
    public boolean isLeafValueSet(LeafIdentifier leaf) {
        return false;
    }

    @Override
    public boolean isSelectLeaf(LeafIdentifier leaf) {
        return false;
    }

    public void processEdit(ModuleIdentifier0OpParam moduleIdentifier0OpParam) {
//        if (topology.onosYangNodeOperationType() != TopologyOpParam
//                .OnosYangNodeOperationType.NONE) {
//            throw new RuntimeException("store modification not supported");
//        }
        processContainerIdentifier1(moduleIdentifier0OpParam);
    }


    private void processContainerIdentifier1(ModuleIdentifier0OpParam moduleIdentifier) {
        if (moduleIdentifier.containerIdentifier1() == null) {
            return;
        }
        ContainerIdentifier1 nodePara = moduleIdentifier.containerIdentifier1();
        ContainerIdentifier1 nodeInStore = findNodeInStore(nodePara);

        if (nodeInStore != null && !(nodeInStore instanceof Level1ContainerIdentifier1Store)) {
            //stored node is not correct
            throw new RuntimeException("store Node expected");
        }
        Level1ContainerIdentifier1Store storedNode = (Level1ContainerIdentifier1Store) nodeInStore;

        if (!(nodePara instanceof DefaultContainerIdentifier1)) {
            //Operations are part of the default Node
            throw new RuntimeException("default Node expected");
        }
        DefaultContainerIdentifier1 opNode = (DefaultContainerIdentifier1) nodePara;
        if (opNode.onosYangNodeOperationType() == null) {
            throw new RuntimeException("No operation set for Node");
        }
        switch (opNode.onosYangNodeOperationType()) {
            case CREATE: {
                if (storedNode != null) {
                    throw new RuntimeException(
                            "Node: " + nodePara.leafIdentifier2() + " is already " +
                                    "created");
                }
                storedNode = new Level1ContainerIdentifier1Store();
                nodeStoreList.add(storedNode);
                storedNode.processEdit(nodePara);
                return;

            }
            case DELETE: {
                if (storedNode == null) {
                    throw new RuntimeException(
                            "Node: " + nodePara.leafIdentifier2() + " is not in " +
                                    "store");
                }
                storedNode.processEdit(nodePara);
                nodeStoreList.remove(storedNode);
                return;
            }

            case REPLACE: {
                if (storedNode != null) {
                    storedNode.processEdit(nodePara);

                }
                storedNode = new Level1ContainerIdentifier1Store();
                nodeStoreList.add(storedNode);
                storedNode.processEdit(nodePara);
                return;
            }

            case REMOVE: {
                if (storedNode == null) {
                    return;
                }
                storedNode.processEdit(nodePara);
                nodeStoreList.remove(storedNode);
                return;
            }
            case MERGE: {
                if (storedNode == null) {
                    storedNode = new Level1ContainerIdentifier1Store();
                    nodeStoreList.add(storedNode);
                    storedNode.processEdit(nodePara);

                }
                storedNode.processEdit(nodePara);
                return;
            }
            case NONE: {
                if (storedNode == null) {
                    if (nodePara != null) {
                        storedNode = new Level1ContainerIdentifier1Store();
                        nodeStoreList.add(storedNode);
                        storedNode.processEdit(nodePara);
                    }

                }
                storedNode.processEdit(nodePara);
                return;
            }
            default:
        }
    }

    private ContainerIdentifier1 findNodeInStore(ContainerIdentifier1 findNode) {
        for (ContainerIdentifier1 node : nodeStoreList) {
//            if (node.nodeId() == null) {
//                continue;
//            }
            if (node.leafIdentifier2().equals(findNode.leafIdentifier2())) {
                return node;
            }
        }
        return null;
    }
}
