package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.ModuleIdentifier0;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.containeridentifier1.DefaultListIdentifier2;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.containeridentifier1.ListIdentifier2;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.containeridentifier1.listidentifier2.ContainerIdentifier3;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.containeridentifier1.listidentifier2.LeafIdentifier3Enum;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.containeridentifier1.listidentifier2.ListIdentifier3;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.notificationidentifier1.listidentifier2.DefaultListIdentifier3;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by root1 on 19/9/16.
 */
public class Level1ListIdentifier2Store implements ListIdentifier2 {

    //Stores need to be written
    private List<ListIdentifier3> listIdentifier3 = new ArrayList<>();
    private ContainerIdentifier3 containerIdentifier3;

    private LeafIdentifier3Enum leafIdentifier3;
    private List<String> leafListIdentifier3 = new ArrayList<>();
    private Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    public void listIdentifier3(List<ListIdentifier3> listIdentifier3) {
        this.listIdentifier3 = listIdentifier3;
    }

    public void containerIdentifier3(ContainerIdentifier3 containerIdentifier3) {
        this.containerIdentifier3 = containerIdentifier3;
    }
    @Override
    public BitSet valueLeafFlags(){
        return null;
    }
    @Override
    public BitSet selectLeafFlags(){
        return null;
    }
    public void leafIdentifier3(LeafIdentifier3Enum leafIdentifier3) {
        this.leafIdentifier3 = leafIdentifier3;
    }

    public void leafListIdentifier3(List<String> leafListIdentifier3) {
        this.leafListIdentifier3 = leafListIdentifier3;
    }

    /**
     * Returns the attribute leafIdentifier3.
     *
     * @return value of leafIdentifier3
     */
    @Override
    public LeafIdentifier3Enum leafIdentifier3() {
        return leafIdentifier3;
    }

    /**
     * Returns the attribute leafListIdentifier3.
     *
     * @return list of leafListIdentifier3
     */
    @Override
    public List<String> leafListIdentifier3() {
        return leafListIdentifier3;
    }

    @Override
    public ModuleIdentifier0.OnosYangOpType yangListIdentifier2OpType() {
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
     * Checks if the passed ListIdentifier2 maps the content match query condition.
     *
     * @param listIdentifier2        listIdentifier2 being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    @Override
    public ListIdentifier2 processSubtreeFiltering(ListIdentifier2 listIdentifier2, boolean isSelectAllSchemaChild) {
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
        return (leafIdentifier3 != null);
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

    public void processEdit(ListIdentifier2 listIdentifier2) {
        if (!(listIdentifier2 instanceof DefaultListIdentifier2)) {
            //Operations are part of the default Node
            throw new RuntimeException("default Node expected");
        }
        DefaultListIdentifier2 listNode = (DefaultListIdentifier2) listIdentifier2;
        if (listNode.yangListIdentifier2OpType() == null) {
            throw new RuntimeException("No operation set for Node");
        }

        /*
         * Process the leaf list attributes
         */
        processLeafListIdentifer3Edit(listIdentifier2, listNode.yangListIdentifier2OpType());
        processContainerIdentifier3Edit(listIdentifier2, listNode.yangListIdentifier2OpType());

        processListIdentifer3Edit(listIdentifier2);

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

        switch (listNode.yangListIdentifier2OpType()) {
            case CREATE: {
                leafIdentifier3(listNode.leafIdentifier3());
                return;
            }
            case DELETE: {
                //do nothing, current stored node will be removed
                return;
            }

            case REPLACE: {

                leafIdentifier3(listIdentifier2.leafIdentifier3());
                return;
            }

            case REMOVE: {
                //do nothing, current stored node will be removed
                return;
            }
            case MERGE: {
                leafIdentifier3(listIdentifier2.leafIdentifier3());
                return;
            }
            case NONE:
            default: {
                //do nothing, child schema is already processed above
                return;
            }
        }

    }

    public void addToLeafListIdentifer3(String value) {
        leafListIdentifier3().add(value);
    }

    private void processLeafListIdentifer3Edit(ListIdentifier2 listIdentifier2,
                                               ModuleIdentifier0.OnosYangOpType
                                                       onosYangNodeOperationType) {
        if (listIdentifier2.leafListIdentifier3() == null
                || listIdentifier2.leafListIdentifier3().isEmpty()) {
            return;
        }
        for (String leafListIdentifer3Para : listIdentifier2.leafListIdentifier3()) {
            String storedLeafListIdentifier3 = findLeafListIdentifer3(leafListIdentifer3Para);

            switch (onosYangNodeOperationType) {
                case CREATE: {
                    if (storedLeafListIdentifier3 != null) {
                        throw new RuntimeException(
                                "nodeProp: " + leafListIdentifer3Para +
                                        " is already created");
                    }
                    addToLeafListIdentifer3(leafListIdentifer3Para);
                    continue; //continue with next node prop
                }
                case DELETE: {
                    if (storedLeafListIdentifier3 == null) {
                        throw new RuntimeException(
                                "nodeProp: " + leafListIdentifer3Para + " is not in "
                                        + "store");
                    }
                    leafListIdentifier3().remove(storedLeafListIdentifier3);
                    continue; //continue with next node prop
                }

                case REPLACE: {
                    if (storedLeafListIdentifier3 != null) {
                        //node prop is already present do nothing
                        continue; //continue with next node prop
                    }
                    leafListIdentifier3().add(leafListIdentifer3Para);
                    continue; //continue with next node prop
                }

                case REMOVE: {
                    if (storedLeafListIdentifier3 == null) {
                        //node prop is not present do nothing
                        continue; //continue with next node prop
                    }
                    leafListIdentifier3.remove(storedLeafListIdentifier3);
                    continue; //continue with next node prop
                }
                case MERGE: {
                    if (storedLeafListIdentifier3 == null) {
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

    private String findLeafListIdentifer3(String leafListIdentifer) {
        if (leafListIdentifier3().isEmpty()) {
            return null;
        }

        for (String leaflistIdentifer3 : leafListIdentifier3()) {
            if (leaflistIdentifer3.equals(leafListIdentifer)) {
                return leaflistIdentifer3;
            }
        }
        return null;
    }

    private void processListIdentifer3Edit(ListIdentifier2 listIdentifier2) {
        if (listIdentifier2.listIdentifier3() == null || listIdentifier2.listIdentifier3().isEmpty()) {
            return;
        }
        for (ListIdentifier3 identifier3 : listIdentifier2.listIdentifier3()) {
            ListIdentifier3 listInStore = findListIdentifer3InStore(identifier3);

            if (listInStore != null && !(listInStore instanceof Level1ListIdentifier2Store)) {
                //stored node is not correct
                throw new RuntimeException("store Node expected");
            }
            Level2ListIdentifier3Store storedIdentifier3Store = (Level2ListIdentifier3Store) listInStore;

            if (!(identifier3 instanceof DefaultListIdentifier3)) {
                //Operations are part of the default Node
                throw new RuntimeException("default Node expected");
            }
            DefaultListIdentifier3 opNode = (DefaultListIdentifier3) identifier3;
            if (listInStore.yangListIdentifier3OpType() == null) {
                throw new RuntimeException("No operation set for Node");
            }
            switch (listInStore.yangListIdentifier3OpType()) {
                case CREATE: {
                    if (storedIdentifier3Store != null) {
                        throw new RuntimeException(
                                "Node: " + identifier3.leafListIdentifier4() + " is already " +
                                        "created");
                    }
                    storedIdentifier3Store = new Level2ListIdentifier3Store();
                    listIdentifier3.add(storedIdentifier3Store);
                    storedIdentifier3Store.processEdit(identifier3);
                    continue; //continue to process the next input node
                }
                case DELETE: {
                    if (storedIdentifier3Store == null) {
                        throw new RuntimeException(
                                "Node: " + identifier3.leafListIdentifier4() + " is not in " +
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
                    storedIdentifier3Store = new Level2ListIdentifier3Store();
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
                        storedIdentifier3Store = new Level2ListIdentifier3Store();
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
                            storedIdentifier3Store = new Level2ListIdentifier3Store();
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
            if (node.leafListIdentifier4().equals(findNode.leafListIdentifier4())) {
                return node;
            }
        }
        return null;
    }

    private void processContainerIdentifier3Edit(
            ListIdentifier2 nodePara, ModuleIdentifier0.OnosYangOpType
            onosYangNodeOperationType) {
        if (nodePara.containerIdentifier3() == null) {
            return;
        }

        if (containerIdentifier3() != null && !(containerIdentifier3() instanceof
                Level2ContainerIdentifier3Store)) {
            //stored node is not correct
            throw new RuntimeException("store termination points expected");
        }

        Level2ContainerIdentifier3Store storedTerminationPoints
                = (Level2ContainerIdentifier3Store) containerIdentifier3();
        ContainerIdentifier3 containerIdentifier3Para = nodePara.containerIdentifier3();

        switch (nodePara.containerIdentifier3().yangContainerIdentifier3OpType()) {
            case CREATE: {
                if (storedTerminationPoints != null) {
                    throw new RuntimeException("TerminationPointsStore" +
                            " is already " +
                            "created");
                }
                storedTerminationPoints = new Level2ContainerIdentifier3Store();
                containerIdentifier3(storedTerminationPoints);
                storedTerminationPoints.processEdit(containerIdentifier3Para);
                return;
            }
            case DELETE: {
                if (storedTerminationPoints == null) {
                    throw new RuntimeException("TerminationPointsStore" +
                            " is not in store");
                }
                storedTerminationPoints.processEdit(containerIdentifier3Para);
                containerIdentifier3(null);
                return;
            }

            case REPLACE: {
                if (storedTerminationPoints != null) {
                    storedTerminationPoints.processEdit(containerIdentifier3Para);
                    return;
                }
                storedTerminationPoints = new Level2ContainerIdentifier3Store();
                containerIdentifier3(storedTerminationPoints);
                storedTerminationPoints.processEdit(containerIdentifier3Para);
                return;
            }

            case REMOVE: {
                if (storedTerminationPoints == null) {
                    return;
                }
                storedTerminationPoints.processEdit(containerIdentifier3Para);
                containerIdentifier3(null);
                return;
            }
            case MERGE: {
                if (storedTerminationPoints == null) {
                    storedTerminationPoints = new Level2ContainerIdentifier3Store();
                    containerIdentifier3(storedTerminationPoints);
                    storedTerminationPoints.processEdit(containerIdentifier3Para);
                    return;
                }
                storedTerminationPoints.processEdit(containerIdentifier3Para);
                return;
            }
            case NONE: {
                if (storedTerminationPoints == null) {
                    if (containerIdentifier3Para != null) {
                        storedTerminationPoints = new Level2ContainerIdentifier3Store();
                        containerIdentifier3(storedTerminationPoints);
                        storedTerminationPoints
                                .processEdit(containerIdentifier3Para);
                    }
                    return;
                }
                storedTerminationPoints.processEdit(containerIdentifier3Para);
                return;
            }
            default:
        }
    }
}
