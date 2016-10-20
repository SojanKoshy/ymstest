package org.onosproject.ymstest.module;


import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.ModuleIdentifier0;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.listidentifier1.ContainerIdentifier2;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.listidentifier1.DefaultContainerIdentifier2;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.listidentifier1.containeridentifier2.ContainerIdentifier3;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.listidentifier1.containeridentifier2.DefaultListIdentifier3;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.listidentifier1.containeridentifier2.ListIdentifier3;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by root1 on 23/9/16.
 */
public class L0Identifier1ContainerIdentifier2Store implements ContainerIdentifier2 {

    private long leafIdenyifier3;
    private List<Long> leafListIdentifier3 = new ArrayList<>();
    private ContainerIdentifier3 containerIdentifier3;
    private List<ListIdentifier3> listIdentifier3 = new ArrayList<>();
    private Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    public void leafIdentifier3(long leafIdenyifier3) {
        this.leafIdenyifier3 = leafIdenyifier3;
    }

    public void leafListIdentifier3(List<Long> leafListIdentifier3) {
        this.leafListIdentifier3 = leafListIdentifier3;
    }
    @Override
    public BitSet valueLeafFlags(){
        return null;
    }
    @Override
    public BitSet selectLeafFlags(){
        return null;
    }
    public void containerIdentifier3(ContainerIdentifier3 containerIdentifier3) {
        this.containerIdentifier3 = containerIdentifier3;
    }

    public void listIdentifier3(List<ListIdentifier3> listIdentifier3) {
        this.listIdentifier3 = listIdentifier3;
    }


    /**
     * Returns the attribute leafIdentifier3.
     *
     * @return value of leafIdentifier3
     */
    @Override
    public long leafIdentifier3() {
        return leafIdenyifier3;
    }

    /**
     * Returns the attribute leafListIdentifier3.
     *
     * @return list of leafListIdentifier3
     */
    @Override
    public List<Long> leafListIdentifier3() {
        return leafListIdentifier3;
    }

    @Override
    public ModuleIdentifier0.OnosYangOpType yangContainerIdentifier2OpType() {
        return null;
    }

    /**
     * Returns the attribute containerIdentifier3.
     *
     * @return value of containerIdentifier3
     */
    @Override
    public ContainerIdentifier3 containerIdentifier3() {
        return containerIdentifier3;
    }

    /**
     * Returns the attribute listIdentifier3.
     *
     * @return list of listIdentifier3
     */
    @Override
    public List<ListIdentifier3> listIdentifier3() {
        return listIdentifier3;
    }

    /**
     * Returns the attribute yangAugmentedInfo.
     *
     * @param classObject value of Augmentedclass
     * @return value of YangAugmentedInfo
     */
    @Override
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }

    /**
     * Returns the attribute yangAugmentedInfoMap.
     *
     * @return value of yangAugmentedInfoMap
     */
    @Override
    public Map<Class<?>, Object> yangAugmentedInfoMap() {
        return yangAugmentedInfoMap;
    }

    /**
     * Checks if the passed ContainerIdentifier2 maps the content match query condition.
     *
     * @param containerIdentifier2   containerIdentifier2 being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
  /*  @Override
    public ContainerIdentifier2 processSubtreeFiltering(ContainerIdentifier2 containerIdentifier2, boolean
            isSelectAllSchemaChild) {
        return null;
    }*/

    /**
     * Checks if the leaf value is set.
     *
     * @param leaf leaf whose value status needs to checked
     * @return result of leaf value set in object
     */
    @Override
    public boolean isLeafValueSet(LeafIdentifier leaf) {
        return (new Long(leafIdentifier3()) != null);
    }

    /**
     * Checks if the leaf is set to be a selected leaf.
     *
     * @param leaf if leaf needs to be selected
     * @return result of leaf value set in object
     */
    @Override
    public boolean isSelectLeaf(LeafIdentifier leaf) {
        return false;
    }

    public void processEdit(ContainerIdentifier2 containerIdentifier2) {
        if (!(containerIdentifier2 instanceof DefaultContainerIdentifier2)) {
            //Operations are part of the default Node
            throw new RuntimeException("default Node expected");
        }
        DefaultContainerIdentifier2 containerNode = (DefaultContainerIdentifier2) containerIdentifier2;
        if (containerNode.yangContainerIdentifier2OpType() == null) {
            throw new RuntimeException("No operation set for Node");
        }

        /*
         * Process the leaf list attributes
         */
        processLeafListIdentifer2Edit(containerIdentifier2, containerNode.yangContainerIdentifier2OpType());

        /*
         * Process the child nodes
         */
        processContainerIdentifier2Edit(containerIdentifier2,
                containerNode.yangContainerIdentifier2OpType());

        processListIdentifer2Edit(containerIdentifier2);

       /* *//*
         * Process the augmented node contents
         *//*
        for (Map.Entry<Class<?>, Object> entry
                : containerIdentifier1.yangAugmentedInfoMap().entrySet()) {
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
*/

        switch (containerNode.yangContainerIdentifier2OpType()) {
            case CREATE: {
                leafIdentifier3(containerNode.leafIdentifier3());
                return;
            }
            case DELETE: {
                //do nothing, current stored node will be removed
                return;
            }

            case REPLACE: {

                leafIdentifier3(containerIdentifier2.leafIdentifier3());
                return;
            }

            case REMOVE: {
                //do nothing, current stored node will be removed
                return;
            }
            case MERGE: {
                leafIdentifier3(containerIdentifier2.leafIdentifier3());
                return;
            }
            case NONE:
            default: {
                //do nothing, child schema is already processed above
                return;
            }
        }

    }

    private void processContainerIdentifier2Edit(
            ContainerIdentifier2 containerIdentifier2, ModuleIdentifier0.OnosYangOpType
            onosYangNodeOperationType) {
        if (containerIdentifier2.containerIdentifier3() == null) {
            return;
        }

        if (containerIdentifier3() != null && !(containerIdentifier3() instanceof
                L0Identifier1C2ContainerIdentifier3Store)) {
            //stored node is not correct
            throw new RuntimeException("store termination points expected");
        }

        L0Identifier1C2ContainerIdentifier3Store identifier3Store
                = (L0Identifier1C2ContainerIdentifier3Store) containerIdentifier3();
        ContainerIdentifier3 containerIdentifier3Para = containerIdentifier2.containerIdentifier3();

        switch (containerIdentifier2.containerIdentifier3().yangContainerIdentifier3OpType()) {
            case CREATE: {
                if (identifier3Store != null) {
                    throw new RuntimeException("TerminationPointsStore" +
                            " is already " +
                            "created");
                }
                identifier3Store = new L0Identifier1C2ContainerIdentifier3Store();
                containerIdentifier3(identifier3Store);
                identifier3Store.processEdit(containerIdentifier3Para);
                return;
            }
            case DELETE: {
                if (identifier3Store == null) {
                    throw new RuntimeException("TerminationPointsStore" +
                            " is not in store");
                }
                identifier3Store.processEdit(containerIdentifier3Para);
                containerIdentifier3(null);
                return;
            }

            case REPLACE: {
                if (identifier3Store != null) {
                    identifier3Store.processEdit(containerIdentifier3Para);
                    return;
                }
                identifier3Store = new L0Identifier1C2ContainerIdentifier3Store();
                containerIdentifier3(identifier3Store);
                identifier3Store.processEdit(containerIdentifier3Para);
                return;
            }

            case REMOVE: {
                if (identifier3Store == null) {
                    return;
                }
                identifier3Store.processEdit(containerIdentifier3Para);
                containerIdentifier3(null);
                return;
            }
            case MERGE: {
                if (identifier3Store == null) {
                    identifier3Store = new L0Identifier1C2ContainerIdentifier3Store();
                    containerIdentifier3(identifier3Store);
                    identifier3Store.processEdit(containerIdentifier3Para);
                    return;
                }
                identifier3Store.processEdit(containerIdentifier3Para);
                return;
            }
            case NONE: {
                if (identifier3Store == null) {
                    if (containerIdentifier3Para != null) {
                        identifier3Store = new L0Identifier1C2ContainerIdentifier3Store();
                        containerIdentifier3(identifier3Store);
                        identifier3Store
                                .processEdit(containerIdentifier3Para);
                    }
                    return;
                }
                identifier3Store.processEdit(containerIdentifier3Para);
                return;
            }
            default:
        }
    }


    private void processListIdentifer2Edit(ContainerIdentifier2 containerIdentifier1) {
        if (containerIdentifier1.listIdentifier3() == null || containerIdentifier1.listIdentifier3().isEmpty()) {
            return;
        }
        for (ListIdentifier3 identifier3 : containerIdentifier1.listIdentifier3()) {
            ListIdentifier3 listInStore = findListIdentifer3InStore(identifier3);

            if (listInStore != null && !(listInStore instanceof L0Identifier1C2ListIdentifier3Store)) {
                //stored node is not correct
                throw new RuntimeException("store Node expected");
            }
            L0Identifier1C2ListIdentifier3Store storedIdentifier3Store = (L0Identifier1C2ListIdentifier3Store) listInStore;

            if (!(identifier3 instanceof DefaultListIdentifier3)) {
                //Operations are part of the default Node
                throw new RuntimeException("default Node expected");
            }
            DefaultListIdentifier3 opNode = (DefaultListIdentifier3) identifier3;
            if (opNode.yangListIdentifier3OpType() == null) {
                throw new RuntimeException("No operation set for Node");
            }
            switch (opNode.yangListIdentifier3OpType()) {
                case CREATE: {
                    if (storedIdentifier3Store != null) {
                        throw new RuntimeException(
                                "Node: " + identifier3.leafIdentifier4() + " is already " +
                                        "created");
                    }
                    storedIdentifier3Store = new L0Identifier1C2ListIdentifier3Store();
                    listIdentifier3.add(storedIdentifier3Store);
                    storedIdentifier3Store.processEdit(identifier3);
                    continue; //continue to process the next input node
                }
                case DELETE: {
                    if (storedIdentifier3Store == null) {
                        throw new RuntimeException(
                                "Node: " + identifier3.leafIdentifier4() + " is not in " +
                                        "store");
                    }
                    storedIdentifier3Store.processEdit(identifier3);
                    listIdentifier3.remove(storedIdentifier3Store);
                    continue; //continue to process the next input node
                }

                case REPLACE: {
                    if (storedIdentifier3Store != null) {
                        storedIdentifier3Store.processEdit(identifier3);
                        continue; //continue to process the next input node
                    }
                    storedIdentifier3Store = new L0Identifier1C2ListIdentifier3Store();
                    listIdentifier3.add(storedIdentifier3Store);
                    storedIdentifier3Store.processEdit(identifier3);
                    continue; //continue to process the next input node
                }

                case REMOVE: {
                    if (storedIdentifier3Store == null) {
                        continue; //continue to process the next input node
                    }
                    storedIdentifier3Store.processEdit(identifier3);
                    listIdentifier3.remove(storedIdentifier3Store);
                    continue; //continue to process the next input node
                }
                case MERGE: {
                    if (storedIdentifier3Store == null) {
                        storedIdentifier3Store = new L0Identifier1C2ListIdentifier3Store();
                        listIdentifier3.add(storedIdentifier3Store);
                        storedIdentifier3Store.processEdit(identifier3);
                        continue; //continue to process the next input node
                    }
                    storedIdentifier3Store.processEdit(identifier3);
                    continue; //continue to process the next input node
                }
                case NONE: {
                    if (storedIdentifier3Store == null) {
                        if (identifier3 != null) {
                            storedIdentifier3Store = new L0Identifier1C2ListIdentifier3Store();
                            listIdentifier3.add(storedIdentifier3Store);
                            storedIdentifier3Store.processEdit(identifier3);
                        }
                        continue; //continue to process the next input node
                    }
                    storedIdentifier3Store.processEdit(identifier3);
                    continue; //continue to process the next input node
                }
                default:
            }
        }
    }

    private ListIdentifier3 findListIdentifer3InStore(ListIdentifier3 findNode) {
        for (ListIdentifier3 node : listIdentifier3) {
//            if (node.nodeId() == null) {
//                continue;
//            }
            if (node.leafIdentifier4() == findNode.leafIdentifier4()) {
                return node;
            }
        }
        return null;
    }


    private void processLeafListIdentifer2Edit(ContainerIdentifier2 containerIdentifier2,
                                               ModuleIdentifier0.OnosYangOpType
                                                       onosYangNodeOperationType) {
        if (containerIdentifier2.leafListIdentifier3() == null
                || containerIdentifier2.leafListIdentifier3().isEmpty()) {
            return;
        }
        for (Long leafListIdentifer3Para : containerIdentifier2.leafListIdentifier3()) {
            Long storedLeafListIdentifier2 = findLeafListIdentifer2(leafListIdentifer3Para);

            switch (onosYangNodeOperationType) {
                case CREATE: {
                    if (storedLeafListIdentifier2 != null) {
                        throw new RuntimeException(
                                "nodeProp: " + leafListIdentifer3Para +
                                        " is already created");
                    }
                    addToLeafListIdentifer3(leafListIdentifer3Para);
                    continue; //continue with next node prop
                }
                case DELETE: {
                    if (storedLeafListIdentifier2 == null) {
                        throw new RuntimeException(
                                "nodeProp: " + leafListIdentifer3Para + " is not in "
                                        + "store");
                    }
                    leafListIdentifier3().remove(storedLeafListIdentifier2);
                    continue; //continue with next node prop
                }

                case REPLACE: {
                    if (storedLeafListIdentifier2 != null) {
                        //node prop is already present do nothing
                        continue; //continue with next node prop
                    }
                    leafListIdentifier3().add(leafListIdentifer3Para);
                    continue; //continue with next node prop
                }

                case REMOVE: {
                    if (storedLeafListIdentifier2 == null) {
                        //node prop is not present do nothing
                        continue; //continue with next node prop
                    }
                    leafListIdentifier3().remove(storedLeafListIdentifier2);
                    continue; //continue with next node prop
                }
                case MERGE: {
                    if (storedLeafListIdentifier2 == null) {
                        leafListIdentifier3().add(leafListIdentifer3Para);
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

    private Long findLeafListIdentifer2(Long leafListIdentifer) {
        if (leafListIdentifier3().isEmpty()) {
            return null;
        }

        for (Long leaflistIdentifer3 : leafListIdentifier3()) {
            if (leaflistIdentifer3.equals(leafListIdentifer)) {
                return leaflistIdentifer3;
            }
        }
        return null;
    }

    public void addToLeafListIdentifer3(Long value) {
        leafListIdentifier3().add(value);
    }
}
