package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.ModuleIdentifier0;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.containeridentifier1.listidentifier2.listidentifier3.ContainerIdentifier4;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.containeridentifier1.listidentifier2.listidentifier3.DefaultContainerIdentifier4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by root1 on 22/9/16.
 */
public class Level2ContainerIdentifier4Store implements ContainerIdentifier4 {


    private String leafIdentifier5;
    private List<String> leafListIdentifier5;

    private Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    public void leafIdentifier5(String leafIdentifier5) {
        this.leafIdentifier5 = leafIdentifier5;
    }

    public void leafListIdentifier5(List<String> leafListIdentifier5) {
        this.leafListIdentifier5 = leafListIdentifier5;
    }


    /**
     * Returns the attribute leafIdentifier5.
     *
     * @return value of leafIdentifier5
     */
    @Override
    public String leafIdentifier5() {
        return leafIdentifier5;
    }

    /**
     * Returns the attribute leafListIdentifier5.
     *
     * @return list of leafListIdentifier5
     */
    @Override
    public List<String> leafListIdentifier5() {
        return leafListIdentifier5;
    }

    @Override
    public ModuleIdentifier0.OnosYangOpType yangContainerIdentifier4OpType() {
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
     * Checks if the passed ContainerIdentifier4 maps the content match query condition.
     *
     * @param containerIdentifier4   containerIdentifier4 being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    @Override
    public ContainerIdentifier4 processSubtreeFiltering(ContainerIdentifier4 containerIdentifier4, boolean
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


    public void processEdit(ContainerIdentifier4 containerIdentifier4) {
        if (!(containerIdentifier4 instanceof DefaultContainerIdentifier4)) {
            //Operations are part of the default Node
            throw new RuntimeException("default Node expected");
        }
        DefaultContainerIdentifier4 containerNode = (DefaultContainerIdentifier4) containerIdentifier4;
        if (containerNode.yangContainerIdentifier4OpType() == null) {
            throw new RuntimeException("No operation set for Node");
        }

        /*
         * Process the leaf list attributes
         */
        processLeafListIdentifer5Edit(containerIdentifier4, containerNode.yangContainerIdentifier4OpType());


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

        switch (containerNode.yangContainerIdentifier4OpType()) {
            case CREATE: {
                if (containerNode.leafIdentifier5() != null) {
                    throw new RuntimeException("Level2ContainerIdentifier4Store");
                }
                leafIdentifier5(containerNode.leafIdentifier5());
                return;
            }
            case DELETE: {
                //do nothing, current stored node will be removed
                return;
            }

            case REPLACE: {
                leafIdentifier5(containerIdentifier4.leafIdentifier5());
                return;
            }

            case REMOVE: {
                //do nothing, current stored node will be removed
                return;
            }
            case MERGE: {
                if (containerIdentifier4.leafIdentifier5() == null) {
                    throw new RuntimeException("Level2ContainerIdentifier4Store");
                }
                leafIdentifier5(containerIdentifier4.leafIdentifier5());
                return;
            }
            case NONE:
            default: {
                //do nothing, child schema is already processed above
                return;
            }
        }

    }


    private void processLeafListIdentifer5Edit(ContainerIdentifier4 containerIdentifier4,
                                               ModuleIdentifier0.OnosYangOpType
                                                       onosYangNodeOperationType) {
        if (containerIdentifier4.leafListIdentifier5() == null
                || containerIdentifier4.leafListIdentifier5().isEmpty()) {
            return;
        }
        for (String leafListIdentifer3Para : containerIdentifier4.leafListIdentifier5()) {
            String storedLeafListIdentifier3 = findLeafListIdentifer5(leafListIdentifer3Para);

            switch (onosYangNodeOperationType) {
                case CREATE: {
                    if (storedLeafListIdentifier3 != null) {
                        throw new RuntimeException(
                                "nodeProp: " + leafListIdentifer3Para +
                                        " is already created");
                    }
                    addToLeafListIdentifer5(leafListIdentifer3Para);
                    continue; //continue with next node prop
                }
                case DELETE: {
                    if (storedLeafListIdentifier3 == null) {
                        throw new RuntimeException(
                                "nodeProp: " + leafListIdentifer3Para + " is not in "
                                        + "store");
                    }
                    leafListIdentifier5().remove(storedLeafListIdentifier3);
                    continue; //continue with next node prop
                }

                case REPLACE: {
                    if (storedLeafListIdentifier3 != null) {
                        //node prop is already present do nothing
                        continue; //continue with next node prop
                    }
                    leafListIdentifier5().add(leafListIdentifer3Para);
                    continue; //continue with next node prop
                }

                case REMOVE: {
                    if (storedLeafListIdentifier3 == null) {
                        //node prop is not present do nothing
                        continue; //continue with next node prop
                    }
                    leafListIdentifier5().remove(storedLeafListIdentifier3);
                    continue; //continue with next node prop
                }
                case MERGE: {
                    if (storedLeafListIdentifier3 == null) {
                        leafListIdentifier5().add(leafListIdentifer3Para);
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

    private String findLeafListIdentifer5(String leafListIdentifer) {
        if (leafListIdentifier5().isEmpty()) {
            return null;
        }

        for (String leaflistIdentifer5 : leafListIdentifier5()) {
            if (leaflistIdentifer5.equals(leafListIdentifer)) {
                return leaflistIdentifer5;
            }
        }
        return null;
    }

    public void addToLeafListIdentifer5(String value) {
        leafListIdentifier5().add(value);
    }
}
