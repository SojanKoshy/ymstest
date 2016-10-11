package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.DefaultListIdentifier1;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.ListIdentifier1;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.listidentifier1.ContainerIdentifier2;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.listidentifier1.DefaultListIdentifier2;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.listidentifier1.ListIdentifier2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by root1 on 23/9/16.
 */
public class Level0ListIdentifier1Store implements ListIdentifier1 {


    private List<String> leafListIdentifier2 = new ArrayList<>();

    private int leafIdentifier2;

    private ContainerIdentifier2 containerIdentifier2;

    private List<ListIdentifier2> listIdentifier2 = new ArrayList<>();

    private Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    public void leafIdentifier2(int leafIdentifier2) {
        this.leafIdentifier2 = leafIdentifier2;
    }

    public void listIdentifier2(List<ListIdentifier2> listIdentifier2) {
        this.listIdentifier2 = listIdentifier2;
    }

    public void containerIdentifier2(ContainerIdentifier2 containerIdentifier2) {
        this.containerIdentifier2 = containerIdentifier2;
    }

    public void leafListIdentifier2(List<String> leafListIdentifier2) {
        this.leafListIdentifier2 = leafListIdentifier2;
    }

    /**
     * Returns the attribute leafIdentifier2.
     *
     * @return value of leafIdentifier2
     */
    @Override
    public int leafIdentifier2() {
        return leafIdentifier2;
    }

    /**
     * Returns the attribute leafListIdentifier2.
     *
     * @return list of leafListIdentifier2
     */
    @Override
    public List<String> leafListIdentifier2() {
        return leafListIdentifier2;
    }


    /**
     * Returns the attribute containerIdentifier2.
     *
     * @return value of containerIdentifier2
     */
    @Override
    public ContainerIdentifier2 containerIdentifier2() {
        return containerIdentifier2;
    }

    /**
     * Returns the attribute listIdentifier2.
     *
     * @return list of listIdentifier2
     */
    @Override
    public List<ListIdentifier2> listIdentifier2() {
        return listIdentifier2;
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
     * Checks if the passed ListIdentifier1 maps the content match query condition.
     *
     * @param listIdentifier1        listIdentifier1 being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    @Override
    public ListIdentifier1 processSubtreeFiltering(ListIdentifier1 listIdentifier1, boolean isSelectAllSchemaChild) {
        return null;
    }

    /**
     * Checks if the leaf value is set.
     *
     * @param leaf leaf whose value status needs to checked
     * @return result of leaf value set in object
     */
    @Override
    public boolean isLeafValueSet(LeafIdentifier leaf) {
        if (new Integer(leafIdentifier2()) != null) {
            return true;
        }
        return false;
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

    public void processEdit(ListIdentifier1 listIdentifier1) {
        if (!(listIdentifier1 instanceof DefaultListIdentifier1)) {
            //Operations are part of the default Node
            throw new RuntimeException("default Node expected");
        }
        DefaultListIdentifier1 listNode = (DefaultListIdentifier1) listIdentifier1;
        if (listNode.onosYangNodeOperationType() == null) {
            throw new RuntimeException("No operation set for Node");
        }

        /*
         * Process the leaf list attributes
         */
        processLeafListIdentifer2Edit(listIdentifier1, listNode.onosYangNodeOperationType());

        /*
         * Process the child nodes
         */
        processContainerIdentifier2Edit(listIdentifier1,
                listNode.onosYangNodeOperationType());

        processListIdentifer2Edit(listIdentifier1);

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

        switch (listNode.onosYangNodeOperationType()) {
            case CREATE: {
                if (new Integer(listNode.leafIdentifier2()) != null) {
                    throw new RuntimeException("Level0ListIdentifier1Store");
                }
                leafIdentifier2(listNode.leafIdentifier2());
                return;
            }
            case DELETE: {
                //do nothing, current stored node will be removed
                return;
            }

            case REPLACE: {
                leafIdentifier2(listIdentifier1.leafIdentifier2());
                return;
            }

            case REMOVE: {
                //do nothing, current stored node will be removed
                return;
            }
            case MERGE: {
                if (new Integer(listIdentifier1.leafIdentifier2()) == null) {
                    throw new RuntimeException("Level0ListIdentifier1Store");
                }
                leafIdentifier2(listIdentifier1.leafIdentifier2());
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
            ListIdentifier1 listIdentifier1, DefaultListIdentifier1.OnosYangNodeOperationType
            onosYangNodeOperationType) {
        if (listIdentifier1.containerIdentifier2() == null) {
            return;
        }

        if (containerIdentifier2() != null && !(containerIdentifier2() instanceof
                L0Identifier1ContainerIdentifier2Store)) {
            //stored node is not correct
            throw new RuntimeException("store termination points expected");
        }

        L0Identifier1ContainerIdentifier2Store identifier2Store
                = (L0Identifier1ContainerIdentifier2Store) containerIdentifier2();
        ContainerIdentifier2 containerIdentifier2Para = listIdentifier1.containerIdentifier2();

        switch (onosYangNodeOperationType) {
            case CREATE: {
                if (identifier2Store != null) {
                    throw new RuntimeException("TerminationPointsStore" +
                            " is already " +
                            "created");
                }
                identifier2Store = new L0Identifier1ContainerIdentifier2Store();
                containerIdentifier2(identifier2Store);
                identifier2Store.processEdit(containerIdentifier2Para);
                return;
            }
            case DELETE: {
                if (identifier2Store == null) {
                    throw new RuntimeException("TerminationPointsStore" +
                            " is not in store");
                }
                identifier2Store.processEdit(containerIdentifier2Para);
                containerIdentifier2(null);
                return;
            }

            case REPLACE: {
                if (identifier2Store != null) {
                    identifier2Store.processEdit(containerIdentifier2Para);
                    return;
                }
                identifier2Store = new L0Identifier1ContainerIdentifier2Store();
                containerIdentifier2(identifier2Store);
                identifier2Store.processEdit(containerIdentifier2Para);
                return;
            }

            case REMOVE: {
                if (identifier2Store == null) {
                    return;
                }
                identifier2Store.processEdit(containerIdentifier2Para);
                containerIdentifier2(null);
                return;
            }
            case MERGE: {
                if (identifier2Store == null) {
                    identifier2Store = new L0Identifier1ContainerIdentifier2Store();
                    containerIdentifier2(identifier2Store);
                    identifier2Store.processEdit(containerIdentifier2Para);
                    return;
                }
                identifier2Store.processEdit(containerIdentifier2Para);
                return;
            }
            case NONE: {
                if (identifier2Store == null) {
                    if (containerIdentifier2Para != null) {
                        identifier2Store = new L0Identifier1ContainerIdentifier2Store();
                        containerIdentifier2(identifier2Store);
                        identifier2Store
                                .processEdit(containerIdentifier2Para);
                    }
                    return;
                }
                identifier2Store.processEdit(containerIdentifier2Para);
                return;
            }
            default:
        }
    }


    private void processListIdentifer2Edit(ListIdentifier1 listIdentifier1) {
        if (listIdentifier1.listIdentifier2() == null || listIdentifier1.listIdentifier2().isEmpty()) {
            return;
        }
        for (ListIdentifier2 identifier2 : listIdentifier1.listIdentifier2()) {
            ListIdentifier2 listInStore = findListIdentifer2InStore(identifier2);

            if (listInStore != null && !(listInStore instanceof L0Identifier1ListIdentifier2Store)) {
                //stored node is not correct
                throw new RuntimeException("store Node expected");
            }
            L0Identifier1ListIdentifier2Store storedIdentifier2Store = (L0Identifier1ListIdentifier2Store) listInStore;

            if (!(identifier2 instanceof DefaultListIdentifier2)) {
                //Operations are part of the default Node
                throw new RuntimeException("default Node expected");
            }
            DefaultListIdentifier2 opNode = (DefaultListIdentifier2) identifier2;
            if (opNode.onosYangNodeOperationType() == null) {
                throw new RuntimeException("No operation set for Node");
            }
            switch (opNode.onosYangNodeOperationType()) {
                case CREATE: {
                    if (storedIdentifier2Store != null) {
                        throw new RuntimeException(
                                "Node: " + identifier2.leafIdentifier3() + " is already " +
                                        "created");
                    }
                    storedIdentifier2Store = new L0Identifier1ListIdentifier2Store();
                    listIdentifier2.add(storedIdentifier2Store);
                    storedIdentifier2Store.processEdit(identifier2);
                    continue; //continue to process the next input node
                }
                case DELETE: {
                    if (storedIdentifier2Store == null) {
                        throw new RuntimeException(
                                "Node: " + identifier2.leafIdentifier3() + " is not in " +
                                        "store");
                    }
                    storedIdentifier2Store.processEdit(identifier2);
                    listIdentifier2.remove(storedIdentifier2Store);
                    continue; //continue to process the next input node
                }

                case REPLACE: {
                    if (storedIdentifier2Store != null) {
                        storedIdentifier2Store.processEdit(identifier2);
                        continue; //continue to process the next input node
                    }
                    storedIdentifier2Store = new L0Identifier1ListIdentifier2Store();
                    listIdentifier2.add(storedIdentifier2Store);
                    storedIdentifier2Store.processEdit(identifier2);
                    continue; //continue to process the next input node
                }

                case REMOVE: {
                    if (storedIdentifier2Store == null) {
                        continue; //continue to process the next input node
                    }
                    storedIdentifier2Store.processEdit(identifier2);
                    listIdentifier2.remove(storedIdentifier2Store);
                    continue; //continue to process the next input node
                }
                case MERGE: {
                    if (storedIdentifier2Store == null) {
                        storedIdentifier2Store = new L0Identifier1ListIdentifier2Store();
                        listIdentifier2.add(storedIdentifier2Store);
                        storedIdentifier2Store.processEdit(identifier2);
                        continue; //continue to process the next input node
                    }
                    storedIdentifier2Store.processEdit(identifier2);
                    continue; //continue to process the next input node
                }
                case NONE: {
                    if (storedIdentifier2Store == null) {
                        if (identifier2 != null) {
                            storedIdentifier2Store = new L0Identifier1ListIdentifier2Store();
                            listIdentifier2.add(storedIdentifier2Store);
                            storedIdentifier2Store.processEdit(identifier2);
                        }
                        continue; //continue to process the next input node
                    }
                    storedIdentifier2Store.processEdit(identifier2);
                    continue; //continue to process the next input node
                }
                default:
            }
        }
    }

    private ListIdentifier2 findListIdentifer2InStore(ListIdentifier2 findNode) {
        for (ListIdentifier2 node : listIdentifier2) {
//            if (node.nodeId() == null) {
//                continue;
//            }
            if (node.leafIdentifier3().equals(findNode.leafIdentifier3())) {
                return node;
            }
        }
        return null;
    }


    private void processLeafListIdentifer2Edit(ListIdentifier1 listIdentifier1,
                                               DefaultListIdentifier1.OnosYangNodeOperationType
                                                       onosYangNodeOperationType) {
        if (listIdentifier1.leafListIdentifier2() == null
                || listIdentifier1.leafListIdentifier2().isEmpty()) {
            return;
        }
        for (String leafListIdentifer2Para : listIdentifier1.leafListIdentifier2()) {
            String storedLeafListIdentifier2 = findLeafListIdentifer2(leafListIdentifer2Para);

            switch (onosYangNodeOperationType) {
                case CREATE: {
                    if (storedLeafListIdentifier2 != null) {
                        throw new RuntimeException(
                                "nodeProp: " + leafListIdentifer2Para +
                                        " is already created");
                    }
                    addToLeafListIdentifer2(leafListIdentifer2Para);
                    continue; //continue with next node prop
                }
                case DELETE: {
                    if (storedLeafListIdentifier2 == null) {
                        throw new RuntimeException(
                                "nodeProp: " + leafListIdentifer2Para + " is not in "
                                        + "store");
                    }
                    leafListIdentifier2().remove(storedLeafListIdentifier2);
                    continue; //continue with next node prop
                }

                case REPLACE: {
                    if (storedLeafListIdentifier2 != null) {
                        //node prop is already present do nothing
                        continue; //continue with next node prop
                    }
                    leafListIdentifier2().add(leafListIdentifer2Para);
                    continue; //continue with next node prop
                }

                case REMOVE: {
                    if (storedLeafListIdentifier2 == null) {
                        //node prop is not present do nothing
                        continue; //continue with next node prop
                    }
                    leafListIdentifier2().remove(storedLeafListIdentifier2);
                    continue; //continue with next node prop
                }
                case MERGE: {
                    if (storedLeafListIdentifier2 == null) {
                        leafListIdentifier2().add(leafListIdentifer2Para);
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

    private String findLeafListIdentifer2(String leafListIdentifer) {
        if (leafListIdentifier2().isEmpty()) {
            return null;
        }

        for (String leaflistIdentifer2 : leafListIdentifier2()) {
            if (leaflistIdentifer2.equals(leafListIdentifer)) {
                return leaflistIdentifer2;
            }
        }
        return null;
    }

    public void addToLeafListIdentifer2(String value) {
        leafListIdentifier2().add(value);
    }
}
