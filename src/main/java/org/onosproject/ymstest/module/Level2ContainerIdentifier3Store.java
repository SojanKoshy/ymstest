package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.ModuleIdentifier0;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.containeridentifier1.listidentifier2.ContainerIdentifier3;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.containeridentifier1.listidentifier2.DefaultContainerIdentifier3;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.containeridentifier1.listidentifier2.containeridentifier3.DefaultListIdentifier4;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.containeridentifier1.listidentifier2.containeridentifier3.ListIdentifier4;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by root1 on 21/9/16.
 */
public class Level2ContainerIdentifier3Store implements ContainerIdentifier3 {

    private boolean leafIdentifier4;
    private List<Boolean> leafListIdentifier4 = new ArrayList<>();

    //need to create store
    private List<ListIdentifier4> listIdentifier4 = new ArrayList<>();


    private Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();


    public void leafIdentifier4(boolean leafIdentifier4) {
        this.leafIdentifier4 = leafIdentifier4;
    }

    public void leafListIdentifier4(List<Boolean> leafListIdentifier4) {
        this.leafListIdentifier4 = leafListIdentifier4;
    }

    public void listIdentifier4(List<ListIdentifier4> listIdentifier4) {
        this.listIdentifier4 = listIdentifier4;
    }
    @Override
    public BitSet valueLeafFlags(){
        return null;
    }
    @Override
    public BitSet selectLeafFlags(){
        return null;
    }

    /**
     * Returns the attribute leafIdentifier4.
     *
     * @return value of leafIdentifier4
     */
    @Override
    public boolean leafIdentifier4() {
        return leafIdentifier4;
    }

    /**
     * Returns the attribute leafListIdentifier4.
     *
     * @return list of leafListIdentifier4
     */
    @Override
    public List<Boolean> leafListIdentifier4() {
        return leafListIdentifier4;
    }

    @Override
    public ModuleIdentifier0.OnosYangOpType yangContainerIdentifier3OpType() {
        return null;
    }

    /**
     * Returns the attribute listIdentifier4.
     *
     * @return list of listIdentifier4
     */
    @Override
    public List<ListIdentifier4> listIdentifier4() {
        return listIdentifier4;
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
     * Checks if the passed ContainerIdentifier3 maps the content match query condition.
     *
     * @param containerIdentifier3   containerIdentifier3 being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    @Override
    public ContainerIdentifier3 processSubtreeFiltering(ContainerIdentifier3 containerIdentifier3, boolean
            isSelectAllSchemaChild) {
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
        return (leafListIdentifier4() != null);
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

    public void processEdit(ContainerIdentifier3 containerIdentifier3) {
        if (!(containerIdentifier3 instanceof DefaultContainerIdentifier3)) {
            //Operations are part of the default Node
            throw new RuntimeException("default Node expected");
        }
        DefaultContainerIdentifier3 containerNode = (DefaultContainerIdentifier3) containerIdentifier3;
        if (containerNode.yangContainerIdentifier3OpType() == null) {
            throw new RuntimeException("No operation set for Node");
        }

        /*
         * Process the leaf list attributes
         */
        processLeafListIdentifer4Edit(containerIdentifier3, containerNode.yangContainerIdentifier3OpType());

        processListIdentifer4Edit(containerIdentifier3);


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

        switch (containerNode.yangContainerIdentifier3OpType()) {
            case CREATE: {
                leafIdentifier4(containerNode.leafIdentifier4());
                return;
            }
            case DELETE: {
                //do nothing, current stored node will be removed
                return;
            }

            case REPLACE: {
                leafIdentifier4(containerIdentifier3.leafIdentifier4());
                return;
            }

            case REMOVE: {
                //do nothing, current stored node will be removed
                return;
            }
            case MERGE: {
                leafIdentifier4(containerIdentifier3.leafIdentifier4());
                return;
            }
            case NONE:
            default: {
                //do nothing, child schema is already processed above
                return;
            }
        }

    }

    private void processLeafListIdentifer4Edit(ContainerIdentifier3 conatinerIdentifier3,
                                               ModuleIdentifier0.OnosYangOpType
                                                       onosYangNodeOperationType) {
        if (conatinerIdentifier3.leafListIdentifier4() == null
                || conatinerIdentifier3.leafListIdentifier4().isEmpty()) {
            return;
        }
        for (Boolean leafListIdentifer5Para : conatinerIdentifier3.leafListIdentifier4()) {
            Boolean storedLeafListIdentifier5 = findLeafListIdentifer4(leafListIdentifer5Para);

            switch (onosYangNodeOperationType) {
                case CREATE: {
                    if (storedLeafListIdentifier5 != null) {
                        throw new RuntimeException(
                                "nodeProp: " + leafListIdentifer5Para +
                                        " is already created");
                    }
                    addToLeafListIdentifer4(leafListIdentifer5Para);
                    continue; //continue with next node prop
                }
                case DELETE: {
                    if (storedLeafListIdentifier5 == null) {
                        throw new RuntimeException(
                                "nodeProp: " + leafListIdentifer5Para + " is not in "
                                        + "store");
                    }
                    leafListIdentifier4().remove(storedLeafListIdentifier5);
                    continue; //continue with next node prop
                }

                case REPLACE: {
                    if (storedLeafListIdentifier5 != null) {
                        //node prop is already present do nothing
                        continue; //continue with next node prop
                    }
                    leafListIdentifier4().add(leafListIdentifer5Para);
                    continue; //continue with next node prop
                }

                case REMOVE: {
                    if (storedLeafListIdentifier5 == null) {
                        //node prop is not present do nothing
                        continue; //continue with next node prop
                    }
                    leafListIdentifier4.remove(storedLeafListIdentifier5);
                    continue; //continue with next node prop
                }
                case MERGE: {
                    if (storedLeafListIdentifier5 == null) {
                        leafListIdentifier4().add(leafListIdentifer5Para);
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

    public void addToLeafListIdentifer4(Boolean value) {
        leafListIdentifier4().add(value);
    }

    private Boolean findLeafListIdentifer4(Boolean leafListIdentifer) {
        if (leafListIdentifier4().isEmpty()) {
            return null;
        }

        for (Boolean leaflistIdentifer4 : leafListIdentifier4()) {
            if (leaflistIdentifer4.equals(leafListIdentifer)) {
                return leaflistIdentifer4;
            }
        }
        return null;
    }

    private void processListIdentifer4Edit(ContainerIdentifier3 containerIdentifier3) {
        if (containerIdentifier3.listIdentifier4() == null || containerIdentifier3.listIdentifier4().isEmpty()) {
            return;
        }
        for (ListIdentifier4 identifier4 : containerIdentifier3.listIdentifier4()) {
            ListIdentifier4 listInStore = findListIdentifer4InStore(identifier4);

            if (listInStore != null && !(listInStore instanceof Level2ListIdentifier4Store)) {
                //stored node is not correct
                throw new RuntimeException("store Node expected");
            }
            Level2ListIdentifier4Store storedIdentifier4Store = (Level2ListIdentifier4Store) listInStore;

            if (!(identifier4 instanceof DefaultListIdentifier4)) {
                //Operations are part of the default Node
                throw new RuntimeException("default Node expected");
            }
            DefaultListIdentifier4 opNode = (DefaultListIdentifier4) identifier4;
            if (opNode.yangListIdentifier4OpType() == null) {
                throw new RuntimeException("No operation set for Node");
            }
            switch (opNode.yangListIdentifier4OpType()) {
                case CREATE: {
                    if (storedIdentifier4Store != null) {
                        throw new RuntimeException(
                                "Node: " + identifier4.leafListIdentifier5() + " is already " +
                                        "created");
                    }
                    storedIdentifier4Store = new Level2ListIdentifier4Store();
                    listIdentifier4.add(storedIdentifier4Store);
                    storedIdentifier4Store.processEdit(identifier4);
                    continue; //continue to process the next input node
                }
                case DELETE: {
                    if (storedIdentifier4Store == null) {
                        throw new RuntimeException(
                                "Node: " + identifier4.leafListIdentifier5() + " is not in " +
                                        "store");
                    }
                    storedIdentifier4Store.processEdit(identifier4);
                    listIdentifier4.remove(storedIdentifier4Store);
                    continue; //continue to process the next input node
                }

                case REPLACE: {
                    if (storedIdentifier4Store != null) {
                        storedIdentifier4Store.processEdit(identifier4);
                        continue; //continue to process the next input node
                    }
                    storedIdentifier4Store = new Level2ListIdentifier4Store();
                    listIdentifier4.add(storedIdentifier4Store);
                    storedIdentifier4Store.processEdit(identifier4);
                    continue; //continue to process the next input node
                }

                case REMOVE: {
                    if (storedIdentifier4Store == null) {
                        continue; //continue to process the next input node
                    }
                    storedIdentifier4Store.processEdit(identifier4);
                    listIdentifier4.remove(storedIdentifier4Store);
                    continue; //continue to process the next input node
                }
                case MERGE: {
                    if (storedIdentifier4Store == null) {
                        storedIdentifier4Store = new Level2ListIdentifier4Store();
                        listIdentifier4.add(storedIdentifier4Store);
                        storedIdentifier4Store.processEdit(identifier4);
                        continue; //continue to process the next input node
                    }
                    storedIdentifier4Store.processEdit(identifier4);
                    continue; //continue to process the next input node
                }
                case NONE: {
                    if (storedIdentifier4Store == null) {
                        if (identifier4 != null) {
                            storedIdentifier4Store = new Level2ListIdentifier4Store();
                            listIdentifier4.add(storedIdentifier4Store);
                            storedIdentifier4Store.processEdit(identifier4);
                        }
                        continue; //continue to process the next input node
                    }
                    storedIdentifier4Store.processEdit(identifier4);
                    continue; //continue to process the next input node
                }
                default:
            }
        }
    }

    private ListIdentifier4 findListIdentifer4InStore(ListIdentifier4 findNode) {
        for (ListIdentifier4 node : listIdentifier4) {
//            if (node.nodeId() == null) {
//                continue;
//            }
            if (node.leafListIdentifier5().equals(findNode.leafListIdentifier5())) {
                return node;
            }
        }
        return null;
    }


}
