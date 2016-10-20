package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.ModuleIdentifier0;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.containeridentifier1.containeridentifier2.listidentifier3.DefaultListIdentifier4;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.containeridentifier1.containeridentifier2.listidentifier3.ListIdentifier4;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by root1 on 20/9/16.
 */
public class Level1ListIdentifier4Store implements ListIdentifier4 {


    private boolean leafIdentifer5;

    private List<Boolean> leafListIdentifier5 = new ArrayList<>();

    private Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    public void leafIdentifier5(boolean leafIdentifer5) {
        this.leafIdentifer5 = leafIdentifer5;
    }

    public void leafListIdentifier5(List<Boolean> leafListIdentifier5) {
        this.leafListIdentifier5 = leafListIdentifier5;
    }

    public void addToLeafListIdentifer5(Boolean value) {
        leafListIdentifier5().add(value);
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
     * Returns the attribute leafIdentifier5.
     *
     * @return value of leafIdentifier5
     */
    @Override
    public boolean leafIdentifier5() {
        return leafIdentifer5;
    }

    /**
     * Returns the attribute leafListIdentifier5.
     *
     * @return list of leafListIdentifier5
     */
    @Override
    public List<Boolean> leafListIdentifier5() {
        return leafListIdentifier5;
    }

    @Override
    public ModuleIdentifier0.OnosYangOpType yangListIdentifier4OpType() {
        return null;
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
     * Checks if the passed ListIdentifier4 maps the content match query condition.
     *
     * @param listIdentifier4        listIdentifier4 being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    /*@Override
    public ListIdentifier4 processSubtreeFiltering(ListIdentifier4 listIdentifier4, boolean isSelectAllSchemaChild) {
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
        return (leafListIdentifier5() != null);
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

    public void processEdit(ListIdentifier4 listIdentifier4) {
        if (!(listIdentifier4 instanceof DefaultListIdentifier4)) {
            //Operations are part of the default Node
            throw new RuntimeException("default Node expected");
        }
        DefaultListIdentifier4 listNode = (DefaultListIdentifier4) listIdentifier4;
        if (listNode.yangListIdentifier4OpType() == null) {
            throw new RuntimeException("No operation set for Node");
        }

        /*
         * Process the leaf list attributes
         */
        processLeafListIdentifer5Edit(listIdentifier4, listNode.yangListIdentifier4OpType());


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

        switch (listNode.yangListIdentifier4OpType()) {
            case CREATE: {
                leafIdentifier5(listNode.leafIdentifier5());
                return;
            }
            case DELETE: {
                //do nothing, current stored node will be removed
                return;
            }

            case REPLACE: {
                leafIdentifier5(listIdentifier4.leafIdentifier5());
                return;
            }

            case REMOVE: {
                //do nothing, current stored node will be removed
                return;
            }
            case MERGE: {
                leafIdentifier5(listIdentifier4.leafIdentifier5());
                return;
            }
            case NONE:
            default: {
                //do nothing, child schema is already processed above
                return;
            }
        }

    }

    private void processLeafListIdentifer5Edit(ListIdentifier4 listIdentifier4,
                                               ModuleIdentifier0.OnosYangOpType
                                                       onosYangNodeOperationType) {
        if (listIdentifier4.leafListIdentifier5() == null
                || listIdentifier4.leafListIdentifier5().isEmpty()) {
            return;
        }
        for (Boolean leafListIdentifer5Para : listIdentifier4.leafListIdentifier5()) {
            Boolean storedLeafListIdentifier5 = findLeafListIdentifer5(leafListIdentifer5Para);

            switch (onosYangNodeOperationType) {
                case CREATE: {
                    if (storedLeafListIdentifier5 != null) {
                        throw new RuntimeException(
                                "nodeProp: " + leafListIdentifer5Para +
                                        " is already created");
                    }
                    addToLeafListIdentifer5(leafListIdentifer5Para);
                    continue; //continue with next node prop
                }
                case DELETE: {
                    if (storedLeafListIdentifier5 == null) {
                        throw new RuntimeException(
                                "nodeProp: " + leafListIdentifer5Para + " is not in "
                                        + "store");
                    }
                    leafListIdentifier5().remove(storedLeafListIdentifier5);
                    continue; //continue with next node prop
                }

                case REPLACE: {
                    if (storedLeafListIdentifier5 != null) {
                        //node prop is already present do nothing
                        continue; //continue with next node prop
                    }
                    leafListIdentifier5().add(leafListIdentifer5Para);
                    continue; //continue with next node prop
                }

                case REMOVE: {
                    if (storedLeafListIdentifier5 == null) {
                        //node prop is not present do nothing
                        continue; //continue with next node prop
                    }
                    leafListIdentifier5.remove(storedLeafListIdentifier5);
                    continue; //continue with next node prop
                }
                case MERGE: {
                    if (storedLeafListIdentifier5 == null) {
                        leafListIdentifier5().add(leafListIdentifer5Para);
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

    private Boolean findLeafListIdentifer5(Boolean leafListIdentifer) {
        if (leafListIdentifier5().isEmpty()) {
            return null;
        }

        for (Boolean leaflistIdentifer5 : leafListIdentifier5()) {
            if (leaflistIdentifer5.equals(leafListIdentifer)) {
                return leaflistIdentifer5;
            }
        }
        return null;
    }

}