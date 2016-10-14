package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.ModuleIdentifier0;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.listidentifier1.listidentifier2.ContainerIdentifier3;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.listidentifier1.listidentifier2.DefaultContainerIdentifier3;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.listidentifier1.listidentifier2.containeridentifier3.ContainerIdentifier4;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by root1 on 23/9/16.
 */
public class L0I2L1ContainerIdentifier3Store implements ContainerIdentifier3 {

    private BigInteger leafIdentifier4;
    private List<String> leafListIdentifier4 = new ArrayList<>();
    private ContainerIdentifier4 containerIdentifier4;
    private Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    public void leafIdentifier4(BigInteger leafIdentifier4) {
        this.leafIdentifier4 = leafIdentifier4;
    }

    public void leafListIdentifier4(List<String> leafListIdentifier4) {
        this.leafListIdentifier4 = leafListIdentifier4;
    }

    public void containerIdentifier4(ContainerIdentifier4 containerIdentifier4) {
        this.containerIdentifier4 = containerIdentifier4;
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
    public BigInteger leafIdentifier4() {
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
    public ModuleIdentifier0.OnosYangOpType yangContainerIdentifier3OpType() {
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
        return (leafIdentifier4() != null);
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
        DefaultContainerIdentifier3 conatinetNode = (DefaultContainerIdentifier3) containerIdentifier3;
        if (conatinetNode.yangContainerIdentifier3OpType() == null) {
            throw new RuntimeException("No operation set for Node");
        }

        /*
         * Process the leaf list attributes
         */
        processLeafListIdentifer4Edit(containerIdentifier3, conatinetNode.yangContainerIdentifier3OpType());
        processContainerIdentifier4Edit(containerIdentifier3, conatinetNode.yangContainerIdentifier3OpType());

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

        switch (conatinetNode.yangContainerIdentifier3OpType()) {
            case CREATE: {
                leafIdentifier4(conatinetNode.leafIdentifier4());
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


    private void processLeafListIdentifer4Edit(ContainerIdentifier3 listIdentifier4,
                                               ModuleIdentifier0.OnosYangOpType
                                                       onosYangNodeOperationType) {
        if (listIdentifier4.leafIdentifier4() == null
                || listIdentifier4.leafListIdentifier4().isEmpty()) {
            return;
        }
        for (String leafListIdentifer4Para : listIdentifier4.leafListIdentifier4()) {
            String storedLeafListIdentifier5 = findLeafListIdentifer5(leafListIdentifer4Para);

            switch (onosYangNodeOperationType) {
                case CREATE: {
                    if (storedLeafListIdentifier5 != null) {
                        throw new RuntimeException(
                                "nodeProp: " + leafListIdentifer4Para +
                                        " is already created");
                    }
                    addToLeafListIdentifer4(leafListIdentifer4Para);
                    continue; //continue with next node prop
                }
                case DELETE: {
                    if (storedLeafListIdentifier5 == null) {
                        throw new RuntimeException(
                                "nodeProp: " + leafListIdentifer4Para + " is not in "
                                        + "store");
                    }
                    leafListIdentifier4.remove(storedLeafListIdentifier5);
                    continue; //continue with next node prop
                }

                case REPLACE: {
                    if (storedLeafListIdentifier5 != null) {
                        //node prop is already present do nothing
                        continue; //continue with next node prop
                    }
                    leafListIdentifier4().add(leafListIdentifer4Para);
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

    public void addToLeafListIdentifer4(String value) {
        leafListIdentifier4().add(value);
    }

    private String findLeafListIdentifer5(String leafListIdentifer) {
        if (leafListIdentifer.isEmpty()) {
            return null;
        }

        for (String leaflistIdentifer5 : leafListIdentifier4()) {
            if (leaflistIdentifer5.equals(leafListIdentifer)) {
                return leaflistIdentifer5;
            }
        }
        return null;
    }

    private void processContainerIdentifier4Edit(
            ContainerIdentifier3 containerIdentifier3, ModuleIdentifier0.OnosYangOpType
            onosYangNodeOperationType) {
        if (containerIdentifier3.containerIdentifier4() == null) {
            return;
        }

        if (containerIdentifier4() != null && !(containerIdentifier4() instanceof
                L0I2L2ContainerIdentifier4Store)) {
            //stored node is not correct
            throw new RuntimeException("store termination points expected");
        }

        L0I2L2ContainerIdentifier4Store identifier4Store
                = (L0I2L2ContainerIdentifier4Store) containerIdentifier4();
        ContainerIdentifier4 containerIdentifier4Para = containerIdentifier3.containerIdentifier4();

        switch (onosYangNodeOperationType) {
            case CREATE: {
                if (identifier4Store != null) {
                    throw new RuntimeException("TerminationPointsStore" +
                            " is already " +
                            "created");
                }
                identifier4Store = new L0I2L2ContainerIdentifier4Store();
                containerIdentifier4(identifier4Store);
                identifier4Store.processEdit(containerIdentifier4Para);
                return;
            }
            case DELETE: {
                if (identifier4Store == null) {
                    throw new RuntimeException("TerminationPointsStore" +
                            " is not in store");
                }
                identifier4Store.processEdit(containerIdentifier4Para);
                containerIdentifier4(null);
                return;
            }

            case REPLACE: {
                if (identifier4Store != null) {
                    identifier4Store.processEdit(containerIdentifier4Para);
                    return;
                }
                identifier4Store = new L0I2L2ContainerIdentifier4Store();
                containerIdentifier4(identifier4Store);
                identifier4Store.processEdit(containerIdentifier4Para);
                return;
            }

            case REMOVE: {
                if (identifier4Store == null) {
                    return;
                }
                identifier4Store.processEdit(containerIdentifier4Para);
                containerIdentifier4(null);
                return;
            }
            case MERGE: {
                if (identifier4Store == null) {
                    identifier4Store = new L0I2L2ContainerIdentifier4Store();
                    containerIdentifier4(identifier4Store);
                    identifier4Store.processEdit(containerIdentifier4Para);
                    return;
                }
                identifier4Store.processEdit(containerIdentifier4Para);
                return;
            }
            case NONE: {
                if (identifier4Store == null) {
                    if (containerIdentifier4Para != null) {
                        identifier4Store = new L0I2L2ContainerIdentifier4Store();
                        containerIdentifier4(identifier4Store);
                        identifier4Store
                                .processEdit(containerIdentifier4Para);
                    }
                    return;
                }
                identifier4Store.processEdit(containerIdentifier4Para);
                return;
            }
            default:
        }
    }

}
