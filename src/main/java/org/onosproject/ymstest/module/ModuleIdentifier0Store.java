package org.onosproject.ymstest.module;


import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.ModuleIdentifier0;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.ModuleIdentifier0OpParam;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.ContainerIdentifier1;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.DefaultListIdentifier1;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.ListIdentifier1;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/**
 * Created by root1 on 14/9/16.
 */
public class ModuleIdentifier0Store implements ModuleIdentifier0 {
    private ContainerIdentifier1 containerIdentifier1;

    private List<ListIdentifier1> listIdentifier1 = new ArrayList<>();
    private byte leafIdentifier1;
    private List<Byte> leafListIdentifier1 = new ArrayList<>();

    public void listIdentifier1(List<ListIdentifier1> listIdentifier1) {
        this.listIdentifier1 = listIdentifier1;
    }

    public void leafIdentifier1(byte leafIdentifier1) {
        this.leafIdentifier1 = leafIdentifier1;
    }

    public void leafListIdentifier1(List<Byte> leafListIdentifier1) {
        this.leafListIdentifier1 = leafListIdentifier1;
    }

    @Override
    public ContainerIdentifier1 containerIdentifier1() {
        return containerIdentifier1;
    }

    public void containerIdentifier1(ContainerIdentifier1 containerIdentifier1) {
        this.containerIdentifier1 = containerIdentifier1;
    }

    @Override
    public byte leafIdentifier1() {
        return leafIdentifier1;
    }

    @Override
    public List<Byte> leafListIdentifier1() {
        return leafListIdentifier1;
    }

    @Override
    public OnosYangOpType yangModuleIdentifier0OpType() {
        return null;
    }


    @Override
    public List<ListIdentifier1> listIdentifier1() {
        return listIdentifier1;
    }

    /*
        @Override
        public ModuleIdentifier0 processSubtreeFiltering(ModuleIdentifier0 moduleIdentifier0,
                                                         boolean isSelectAllSchemaChild) {
            return null;
        }*/
    @Override
    public BitSet valueLeafFlags() {
        return null;
    }

    @Override
    public BitSet selectLeafFlags() {
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
        processContainerIdentifier1(moduleIdentifier0OpParam, moduleIdentifier0OpParam.yangModuleIdentifier0OpType());
        processListIdentifer1Edit(moduleIdentifier0OpParam);
        processLeafListIdentifer2Edit(moduleIdentifier0OpParam, moduleIdentifier0OpParam.yangModuleIdentifier0OpType());

        System.out.println("yangModuleIdentifier0OpType" +
                moduleIdentifier0OpParam.yangModuleIdentifier0OpType().toString());
        switch (moduleIdentifier0OpParam.yangModuleIdentifier0OpType()) {

            case CREATE: {
                leafIdentifier1(moduleIdentifier0OpParam.leafIdentifier1());
                return;
            }
            case DELETE: {
                //do nothing, current stored node will be removed
                return;
            }

            case REPLACE: {
                leafIdentifier1(moduleIdentifier0OpParam.leafIdentifier1());
                return;
            }

            case REMOVE: {
                //do nothing, current stored node will be removed
                return;
            }
            case MERGE: {
                leafIdentifier1(moduleIdentifier0OpParam.leafIdentifier1());
                return;
            }
            case NONE:
            default: {
                //do nothing, child schema is already processed above
                return;
            }
        }

    }


    private void processContainerIdentifier1(ModuleIdentifier0OpParam moduleIdentifier, OnosYangOpType onosYangOpType) {


        if (moduleIdentifier.containerIdentifier1() == null) {
            return;
        }

        if (containerIdentifier1() != null && !(containerIdentifier1() instanceof
                Level1ContainerIdentifier1Store)) {
            //stored node is not correct
            throw new RuntimeException("store termination points expected");
        }

        Level1ContainerIdentifier1Store storedNode = (Level1ContainerIdentifier1Store) containerIdentifier1();
        ContainerIdentifier1 containerIdentifier1 = moduleIdentifier.containerIdentifier1();
        switch (moduleIdentifier.containerIdentifier1().yangContainerIdentifier1OpType()) {
            case CREATE: {
                if (storedNode != null) {
                    throw new RuntimeException(
                            "Node: is already " +
                                    "created");
                }
                storedNode = new Level1ContainerIdentifier1Store();
                containerIdentifier1(storedNode);
                storedNode.processEdit(containerIdentifier1);
                return;

            }
            case DELETE: {
                if (storedNode == null) {
                    throw new RuntimeException(
                            "Node: is not in " +
                                    "store");
                }
                storedNode.processEdit(containerIdentifier1);
                containerIdentifier1(null);
                return;
            }

            case REPLACE: {
                if (storedNode != null) {
                    storedNode.processEdit(containerIdentifier1);

                }
                storedNode = new Level1ContainerIdentifier1Store();
                containerIdentifier1(storedNode);
                storedNode.processEdit(containerIdentifier1);
                return;
            }

            case REMOVE: {
                if (storedNode == null) {
                    return;
                }
                storedNode.processEdit(containerIdentifier1);
                containerIdentifier1(storedNode);
                return;
            }
            case MERGE: {
                if (storedNode == null) {
                    storedNode = new Level1ContainerIdentifier1Store();
                    containerIdentifier1(storedNode);
                    storedNode.processEdit(containerIdentifier1);

                }
                storedNode.processEdit(containerIdentifier1);
                return;
            }
            case NONE: {
                if (storedNode == null) {
                    if (containerIdentifier1 != null) {
                        storedNode = new Level1ContainerIdentifier1Store();
                        containerIdentifier1(storedNode);
                        storedNode.processEdit(containerIdentifier1);
                    }

                }
                storedNode.processEdit(containerIdentifier1);
                return;
            }
            default:
        }
    }

    private void processListIdentifer1Edit(ModuleIdentifier0OpParam moduleIdentifier0OpParam) {
        if (moduleIdentifier0OpParam.listIdentifier1() == null ||
                moduleIdentifier0OpParam.listIdentifier1().isEmpty()) {
            return;
        }

        for (ListIdentifier1 identifier1 : moduleIdentifier0OpParam.listIdentifier1()) {
            if (!identifier1.isLeafValueSet((ListIdentifier1.LeafIdentifier.LEAFIDENTIFIER2))
                    && identifier1.leafIdentifier2() == 0) {
                listIdentifier1.clear();
                return;
            }
            ListIdentifier1 listInStore = findListIdentifer2InStore(identifier1);

            if (listInStore != null && !(listInStore instanceof Level0ListIdentifier1Store)) {
                //stored node is not correct
                throw new RuntimeException("store Node expected");
            }
            Level0ListIdentifier1Store storedIdentifier2Store = (Level0ListIdentifier1Store) listInStore;

            if (!(identifier1 instanceof DefaultListIdentifier1)) {
                //Operations are part of the default Node
                throw new RuntimeException("default Node expected");
            }
            DefaultListIdentifier1 opNode = (DefaultListIdentifier1) identifier1;
            if (opNode.yangListIdentifier1OpType() == null) {
                throw new RuntimeException("No operation set for Node");
            }
            switch (opNode.yangListIdentifier1OpType()) {
                case CREATE: {
                    if (storedIdentifier2Store != null) {
                        throw new RuntimeException(
                                "Node: " + identifier1.leafIdentifier2() + " is already " +
                                        "created");
                    }
                    storedIdentifier2Store = new Level0ListIdentifier1Store();
                    listIdentifier1().add(storedIdentifier2Store);
                    storedIdentifier2Store.processEdit(identifier1);
                    continue; //continue to process the next input node
                }
                case DELETE: {
                    if (storedIdentifier2Store == null) {
                        throw new RuntimeException(
                                "Node: " + identifier1.leafIdentifier2() + " is not in " +
                                        "store");
                    }
                    storedIdentifier2Store.processEdit(identifier1);
                    listIdentifier1().remove(storedIdentifier2Store);
                    continue; //continue to process the next input node
                }

                case REPLACE: {
                    if (storedIdentifier2Store != null) {
                        storedIdentifier2Store.processEdit(identifier1);
                        continue; //continue to process the next input node
                    }
                    storedIdentifier2Store = new Level0ListIdentifier1Store();
                    listIdentifier1().add(storedIdentifier2Store);
                    storedIdentifier2Store.processEdit(identifier1);
                    continue; //continue to process the next input node
                }

                case REMOVE: {
                    if (storedIdentifier2Store == null) {
                        continue; //continue to process the next input node
                    }
                    storedIdentifier2Store.processEdit(identifier1);
                    listIdentifier1().remove(storedIdentifier2Store);
                    continue; //continue to process the next input node
                }
                case MERGE: {
                    if (storedIdentifier2Store == null) {
                        storedIdentifier2Store = new Level0ListIdentifier1Store();
                        listIdentifier1().add(storedIdentifier2Store);
                        storedIdentifier2Store.processEdit(identifier1);
                        continue; //continue to process the next input node
                    }
                    storedIdentifier2Store.processEdit(identifier1);
                    continue; //continue to process the next input node
                }
                case NONE: {
                    if (storedIdentifier2Store == null) {
                        if (identifier1 != null) {
                            storedIdentifier2Store = new Level0ListIdentifier1Store();
                            listIdentifier1().add(storedIdentifier2Store);
                            storedIdentifier2Store.processEdit(identifier1);
                        }
                        continue; //continue to process the next input node
                    }
                    storedIdentifier2Store.processEdit(identifier1);
                    continue; //continue to process the next input node
                }
                default:
            }
        }
    }

    private ListIdentifier1 findListIdentifer2InStore(ListIdentifier1 findNode) {
        for (ListIdentifier1 node : listIdentifier1) {
//            if (node.nodeId() == null) {
//                continue;
//            }
            if (node.leafIdentifier2() == findNode.leafIdentifier2()) {
                return node;
            }
        }
        return null;
    }

    private void processLeafListIdentifer2Edit(ModuleIdentifier0OpParam moduleIdentifier0OpParam,
                                               OnosYangOpType
                                                       onosYangNodeOperationType) {
        if (moduleIdentifier0OpParam.leafListIdentifier1() == null
                || moduleIdentifier0OpParam.leafListIdentifier1().isEmpty()) {
            return;
        }
        for (Byte leafListIdentifer1Para : moduleIdentifier0OpParam.leafListIdentifier1()) {
            Byte storedLeafListIdentifier1 = findLeafListIdentifer1(leafListIdentifer1Para);

            switch (onosYangNodeOperationType) {
                case CREATE: {
                    if (storedLeafListIdentifier1 != null) {
                        throw new RuntimeException(
                                "nodeProp: " + leafListIdentifer1Para +
                                        " is already created");
                    }
                    addToLeafListIdentifer1(leafListIdentifer1Para);
                    continue; //continue with next node prop
                }
                case DELETE: {
                    if (storedLeafListIdentifier1 == null) {
                        throw new RuntimeException(
                                "nodeProp: " + leafListIdentifer1Para + " is not in "
                                        + "store");
                    }
                    leafListIdentifier1().remove(storedLeafListIdentifier1);
                    continue; //continue with next node prop
                }

                case REPLACE: {
                    if (storedLeafListIdentifier1 != null) {
                        //node prop is already present do nothing
                        continue; //continue with next node prop
                    }
                    leafListIdentifier1().add(leafListIdentifer1Para);
                    continue; //continue with next node prop
                }

                case REMOVE: {
                    if (storedLeafListIdentifier1 == null) {
                        //node prop is not present do nothing
                        continue; //continue with next node prop
                    }
                    leafListIdentifier1().remove(storedLeafListIdentifier1);
                    continue; //continue with next node prop
                }
                case MERGE: {
                    if (storedLeafListIdentifier1 == null) {
                        leafListIdentifier1().add(leafListIdentifer1Para);
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

    private Byte findLeafListIdentifer1(Byte leafListIdentifer) {
        if (leafListIdentifier1().isEmpty()) {
            return null;
        }

        for (Byte leaflistIdentifer2 : leafListIdentifier1()) {
            if (leaflistIdentifer2.equals(leafListIdentifer)) {
                return leaflistIdentifer2;
            }
        }
        return null;
    }

    public void addToLeafListIdentifer1(Byte value) {
        leafListIdentifier1().add(value);
    }

}
