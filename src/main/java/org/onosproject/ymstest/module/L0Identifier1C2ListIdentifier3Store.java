package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.ModuleIdentifier0;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.listidentifier1.containeridentifier2.DefaultListIdentifier3;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.listidentifier1.containeridentifier2.ListIdentifier3;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.listidentifier1.containeridentifier2.listidentifier3.ContainerIdentifier4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by root1 on 26/9/16.
 */
public class L0Identifier1C2ListIdentifier3Store implements ListIdentifier3 {

    private short leafIdentifier4;
    private List<String> leafListIdentifier4 = new ArrayList<>();
    private ContainerIdentifier4 containerIdentifier4;
    private Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    public void leafIdentifier4(short leafIdentifier4) {
        this.leafIdentifier4 = leafIdentifier4;
    }

    public void leafListIdentifier4(List<String> leafListIdentifier4) {
        this.leafListIdentifier4 = leafListIdentifier4;
    }

    public void containerIdentifier4(ContainerIdentifier4 containerIdentifier4) {
        this.containerIdentifier4 = containerIdentifier4;
    }

    /**
     * Returns the attribute leafIdentifier4.
     *
     * @return value of leafIdentifier4
     */
    @Override
    public short leafIdentifier4() {
        return leafIdentifier4;
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
     * Returns the attribute containerIdentifier4.
     *
     * @return value of containerIdentifier4
     */
    @Override
    public ContainerIdentifier4 containerIdentifier4() {
        return containerIdentifier4;
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
        return (new Short(leafIdentifier4()) != null);
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
        processLeafListIdentifer2Edit(listIdentifier3, listNode.yangListIdentifier3OpType());

        /*
         * Process the child nodes
         */
        processContainerIdentifier4Edit(listIdentifier3,
                listNode.yangListIdentifier3OpType());


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
                if (new Short(listNode.leafIdentifier4()) != null) {
                    throw new RuntimeException("L0Identifier1C2ListIdentifier3Store");
                }
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
                if (new Short(listIdentifier3.leafIdentifier4()) == null) {
                    throw new RuntimeException("L0Identifier1C2ListIdentifier3Store");
                }
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

    private void processContainerIdentifier4Edit(
            ListIdentifier3 listIdentifier3, ModuleIdentifier0.OnosYangOpType
            onosYangNodeOperationType) {
        if (listIdentifier3.containerIdentifier4() == null) {
            return;
        }

        if (containerIdentifier4() != null && !(containerIdentifier4() instanceof
                L0Identifier1C2L3ContainerIdentifier4Store)) {
            //stored node is not correct
            throw new RuntimeException("store termination points expected");
        }

        L0Identifier1C2L3ContainerIdentifier4Store identifier2Store
                = (L0Identifier1C2L3ContainerIdentifier4Store) containerIdentifier4();
        ContainerIdentifier4 containerIdentifier2Para = listIdentifier3.containerIdentifier4();

        switch (onosYangNodeOperationType) {
            case CREATE: {
                if (identifier2Store != null) {
                    throw new RuntimeException("TerminationPointsStore" +
                            " is already " +
                            "created");
                }
                identifier2Store = new L0Identifier1C2L3ContainerIdentifier4Store();
                containerIdentifier4(identifier2Store);
                identifier2Store.processEdit(containerIdentifier2Para);
                return;
            }
            case DELETE: {
                if (identifier2Store == null) {
                    throw new RuntimeException("TerminationPointsStore" +
                            " is not in store");
                }
                identifier2Store.processEdit(containerIdentifier2Para);
                containerIdentifier4(null);
                return;
            }

            case REPLACE: {
                if (identifier2Store != null) {
                    identifier2Store.processEdit(containerIdentifier2Para);
                    return;
                }
                identifier2Store = new L0Identifier1C2L3ContainerIdentifier4Store();
                containerIdentifier4(identifier2Store);
                identifier2Store.processEdit(containerIdentifier2Para);
                return;
            }

            case REMOVE: {
                if (identifier2Store == null) {
                    return;
                }
                identifier2Store.processEdit(containerIdentifier2Para);
                containerIdentifier4(null);
                return;
            }
            case MERGE: {
                if (identifier2Store == null) {
                    identifier2Store = new L0Identifier1C2L3ContainerIdentifier4Store();
                    containerIdentifier4(identifier2Store);
                    identifier2Store.processEdit(containerIdentifier2Para);
                    return;
                }
                identifier2Store.processEdit(containerIdentifier2Para);
                return;
            }
            case NONE: {
                if (identifier2Store == null) {
                    if (containerIdentifier2Para != null) {
                        identifier2Store = new L0Identifier1C2L3ContainerIdentifier4Store();
                        containerIdentifier4(identifier2Store);
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


    private void processLeafListIdentifer2Edit(ListIdentifier3 listIdentifier3,
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
                    leafListIdentifier4().remove(storedLeafListIdentifier4);
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

    public void addToLeafListIdentifer4(String value) {
        leafListIdentifier4().add(value);
    }

}
