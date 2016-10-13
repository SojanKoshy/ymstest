package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.ModuleIdentifier0;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.containeridentifier1.containeridentifier2.DefaultListIdentifier3;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.containeridentifier1.containeridentifier2.ListIdentifier3;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.containeridentifier1.containeridentifier2.listidentifier3.ListIdentifier4;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.rpcidentifier1.rpcidentifier1output.containeridentifier3.DefaultListIdentifier4;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by root1 on 20/9/16.
 */
public class Level1ListIdentifier3Store implements ListIdentifier3 {


    private BitSet leafIdentifer4;

    private List<String> leafListIdentifier4 = new ArrayList<>();

    //store need to be created
    private List<ListIdentifier4> listIdentifier4 = new ArrayList<>();

    private Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();


    public void leafIdentifier4(BitSet leafIdentifer4) {
        this.leafIdentifer4 = leafIdentifer4;
    }

    public void leafListIdentifier4(List<String> leafListIdentifier4) {
        this.leafListIdentifier4 = leafListIdentifier4;
    }
    @Override
    public BitSet valueLeafFlags(){
        return null;
    }
    @Override
    public BitSet selectLeafFlags(){
        return null;
    }
    public void listIdentifier4(List<ListIdentifier4> listIdentifier4) {
        this.listIdentifier4 = listIdentifier4;
    }

    /**
     * Returns the attribute leafIdentifier4.
     *
     * @return value of leafIdentifier4
     */
    @Override
    public BitSet leafIdentifier4() {
        return leafIdentifer4;
    }

    /**
     * Returns the attribute leafListIdentifier4.
     *
     * @return list of leafListIdentifier4
     */
    @Override
    public List<String> leafListIdentifier4() {
        return leafListIdentifier4;
    }

    @Override
    public ModuleIdentifier0.OnosYangOpType yangListIdentifier3OpType() {
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
     * Checks if the passed ListIdentifier3 maps the content match query condition.
     *
     * @param listIdentifier3        listIdentifier3 being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    @Override
    public ListIdentifier3 processSubtreeFiltering(ListIdentifier3 listIdentifier3, boolean isSelectAllSchemaChild) {
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
        return (leafIdentifer4 != null);
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

    public void addToLeafListIdentifer4(String value) {
        leafListIdentifier4().add(value);
    }


    public void processEdit(ListIdentifier3 listIdentifier3) {
        if (!(listIdentifier3 instanceof DefaultListIdentifier3)) {
            //Operations are part of the default Node
            throw new RuntimeException("default Node expected");
        }
        DefaultListIdentifier3 listNode = (DefaultListIdentifier3) listIdentifier3;
        if (listNode.yangListIdentifier3OpType() == null) {
            throw new RuntimeException("No operation set for Node");
        }

        /*
         * Process the leaf list attributes
         */
        processLeafListIdentifer4Edit(listIdentifier3, listNode.yangListIdentifier3OpType());

        processListIdentifer4Edit(listIdentifier3);

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

        switch (listNode.yangListIdentifier3OpType()) {
            case CREATE: {
                leafIdentifier4(listNode.leafIdentifier4());
                return;
            }
            case DELETE: {
                //do nothing, current stored node will be removed
                return;
            }

            case REPLACE: {

                leafIdentifier4(listIdentifier3.leafIdentifier4());
                return;
            }

            case REMOVE: {
                //do nothing, current stored node will be removed
                return;
            }
            case MERGE: {
                leafIdentifier4(listIdentifier3.leafIdentifier4());
                return;
            }
            case NONE:
            default: {
                //do nothing, child schema is already processed above
                return;
            }
        }

    }


    private void processLeafListIdentifer4Edit(ListIdentifier3 listIdentifier3,
                                               ModuleIdentifier0.OnosYangOpType
                                                       onosYangNodeOperationType) {
        if (listIdentifier3.leafListIdentifier4() == null
                || listIdentifier3.leafListIdentifier4().isEmpty()) {
            return;
        }
        for (String leafListIdentifer4Para : listIdentifier3.leafListIdentifier4()) {
            String storedLeafListIdentifier4 = findLeafListIdentifer4(leafListIdentifer4Para);

            switch (onosYangNodeOperationType) {
                case CREATE: {
                    if (storedLeafListIdentifier4 != null) {
                        throw new RuntimeException(
                                "nodeProp: " + leafListIdentifer4Para +
                                        " is already created");
                    }
                    addToLeafListIdentifer4(leafListIdentifer4Para);
                    continue; //continue with next node prop
                }
                case DELETE: {
                    if (storedLeafListIdentifier4 == null) {
                        throw new RuntimeException(
                                "nodeProp: " + leafListIdentifer4Para + " is not in "
                                        + "store");
                    }
                    leafListIdentifier4().remove(storedLeafListIdentifier4);
                    continue; //continue with next node prop
                }

                case REPLACE: {
                    if (storedLeafListIdentifier4 != null) {
                        //node prop is already present do nothing
                        continue; //continue with next node prop
                    }
                    leafListIdentifier4().add(leafListIdentifer4Para);
                    continue; //continue with next node prop
                }

                case REMOVE: {
                    if (storedLeafListIdentifier4 == null) {
                        //node prop is not present do nothing
                        continue; //continue with next node prop
                    }
                    leafListIdentifier4.remove(storedLeafListIdentifier4);
                    continue; //continue with next node prop
                }
                case MERGE: {
                    if (storedLeafListIdentifier4 == null) {
                        leafListIdentifier4().add(leafListIdentifer4Para);
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

    private String findLeafListIdentifer4(String leafListIdentifer) {
        if (leafListIdentifier4().isEmpty()) {
            return null;
        }

        for (String leaflistIdentifer4 : leafListIdentifier4()) {
            if (leaflistIdentifer4.equals(leafListIdentifer)) {
                return leaflistIdentifer4;
            }
        }
        return null;
    }

    private void processListIdentifer4Edit(ListIdentifier3 listIdentifier3) {
        if (listIdentifier3.listIdentifier4() == null || listIdentifier3.listIdentifier4().isEmpty()) {
            return;
        }
        for (ListIdentifier4 identifier4 : listIdentifier3.listIdentifier4()) {
            ListIdentifier4 listInStore = findListIdentifer4InStore(identifier4);

            if (listInStore != null && !(listInStore instanceof Level1ListIdentifier3Store)) {
                //stored node is not correct
                throw new RuntimeException("store Node expected");
            }
            Level1ListIdentifier4Store storedIdentifier4Store = (Level1ListIdentifier4Store) listInStore;

            if (!(identifier4 instanceof DefaultListIdentifier4)) {
                //Operations are part of the default Node
                throw new RuntimeException("default Node expected");
            }
            DefaultListIdentifier3 opNode = (DefaultListIdentifier3) identifier4;
            if (opNode.yangListIdentifier3OpType() == null) {
                throw new RuntimeException("No operation set for Node");
            }
            switch (opNode.yangListIdentifier3OpType()) {
                case CREATE: {
                    if (storedIdentifier4Store != null) {
                        throw new RuntimeException(
                                "Node: " + identifier4.leafListIdentifier5() + " is already " +
                                        "created");
                    }
                    storedIdentifier4Store = new Level1ListIdentifier4Store();
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
                    storedIdentifier4Store = new Level1ListIdentifier4Store();
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
                        storedIdentifier4Store = new Level1ListIdentifier4Store();
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
                            storedIdentifier4Store = new Level1ListIdentifier4Store();
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
