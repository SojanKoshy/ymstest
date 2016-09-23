package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.ContainerIdentifier1;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.DefaultContainerIdentifier1;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.containeridentifier1.ContainerIdentifier2;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.containeridentifier1.DefaultListIdentifier2;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.containeridentifier1.ListIdentifier2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by root1 on 19/9/16.
 */
public class Level1ContainerIdentifier1Store implements ContainerIdentifier1 {
    // store should be cretaed
    private ContainerIdentifier2 containerIdentifier2;
    private List<ListIdentifier2> listIdentifier2 = new ArrayList<>();
    private List<String> leafListIdentifer2 = new ArrayList();
    private BigDecimal leafIdentifier2;
    private Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    @Override
    public ContainerIdentifier2 containerIdentifier2() {
        return containerIdentifier2;
    }

    public void containerIdentifier2(ContainerIdentifier2 containerIdentifier2) {
        this.containerIdentifier2 = containerIdentifier2;
    }

    @Override
    public List<ListIdentifier2> listIdentifier2() {
        return listIdentifier2;
    }

    public void listIdentifier2(List<ListIdentifier2> listIdentifier2) {
        this.listIdentifier2 = listIdentifier2;
    }

    @Override
    public List<String> leafListIdentifier2() {
        return leafListIdentifer2;
    }

    public void leafListIdentifier2(List<String> leafListIdentifer2) {
        this.leafListIdentifer2 = leafListIdentifer2;
    }

    @Override
    public BigDecimal leafIdentifier2() {
        return leafIdentifier2;
    }

    public void leafIdentifier2(BigDecimal leafIdentifier2) {
        this.leafIdentifier2 = leafIdentifier2;
    }

    public void addToLeafListIdentifer2(String value) {
        leafListIdentifier2().add(value);
    }


    public void addYangAugmentedInfo(Object value, Class classObject) {
        yangAugmentedInfoMap.put(classObject, value);
    }

    @Override
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }

    @Override
    public Map<Class<?>, Object> yangAugmentedInfoMap() {
        return yangAugmentedInfoMap;
    }


    @Override
    public ContainerIdentifier1 processSubtreeFiltering(ContainerIdentifier1 containerIdentifier1,
                                                        boolean isSelectAllSchemaChild) {
        return null;
    }

    @Override
    public boolean isLeafValueSet(LeafIdentifier leaf) {
        return (leafIdentifier2 != null);
    }

    @Override
    public boolean isSelectLeaf(LeafIdentifier leaf) {
        return false;
    }


    public void processEdit(ContainerIdentifier1 containerIdentifier1) {
        if (!(containerIdentifier1 instanceof DefaultContainerIdentifier1)) {
            //Operations are part of the default Node
            throw new RuntimeException("default Node expected");
        }
        DefaultContainerIdentifier1 containerNode = (DefaultContainerIdentifier1) containerIdentifier1;
        if (containerNode.onosYangNodeOperationType() == null) {
            throw new RuntimeException("No operation set for Node");
        }

        /*
         * Process the leaf list attributes
         */
        processLeafListIdentifer2Edit(containerIdentifier1, containerNode.onosYangNodeOperationType());

        /*
         * Process the child nodes
         */
        processContainerIdentifier2Edit(containerIdentifier1,
                containerNode.onosYangNodeOperationType());

        processListIdentifer2Edit(containerIdentifier1);

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

        switch (containerNode.onosYangNodeOperationType()) {
            case CREATE: {
                leafIdentifier2(containerNode.leafIdentifier2());
                return;
            }
            case DELETE: {
                //do nothing, current stored node will be removed
                return;
            }

            case REPLACE: {
                if (containerNode.leafIdentifier2() == null) {
                    throw new RuntimeException("Key: node.nodeId() is null");
                }
                leafIdentifier2(containerIdentifier1.leafIdentifier2());
                return;
            }

            case REMOVE: {
                //do nothing, current stored node will be removed
                return;
            }
            case MERGE: {
                if (containerIdentifier1.leafIdentifier2() == null) {
                    throw new RuntimeException("Key: node.nodeId() is null");
                }
                leafIdentifier2(containerIdentifier1.leafIdentifier2());
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
            ContainerIdentifier1 containerIdentifier1, DefaultContainerIdentifier1.OnosYangNodeOperationType
            onosYangNodeOperationType) {
        if (containerIdentifier1.containerIdentifier2() == null) {
            return;
        }

        if (containerIdentifier2() != null && !(containerIdentifier2() instanceof
                Level1ContainerIdentifier2Store)) {
            //stored node is not correct
            throw new RuntimeException("store termination points expected");
        }

        Level1ContainerIdentifier2Store identifier2Store
                = (Level1ContainerIdentifier2Store) containerIdentifier2();
        ContainerIdentifier2 containerIdentifier2Para = containerIdentifier1.containerIdentifier2();

        switch (onosYangNodeOperationType) {
            case CREATE: {
                if (identifier2Store != null) {
                    throw new RuntimeException("TerminationPointsStore" +
                            " is already " +
                            "created");
                }
                identifier2Store = new Level1ContainerIdentifier2Store();
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
                identifier2Store = new Level1ContainerIdentifier2Store();
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
                    identifier2Store = new Level1ContainerIdentifier2Store();
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
                        identifier2Store = new Level1ContainerIdentifier2Store();
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


    private void processListIdentifer2Edit(ContainerIdentifier1 containerIdentifier1) {
        if (containerIdentifier1.listIdentifier2() == null || containerIdentifier1.listIdentifier2().isEmpty()) {
            return;
        }
        for (ListIdentifier2 identifier2 : containerIdentifier1.listIdentifier2()) {
            ListIdentifier2 listInStore = findListIdentifer2InStore(identifier2);

            if (listInStore != null && !(listInStore instanceof Level1ListIdentifier2Store)) {
                //stored node is not correct
                throw new RuntimeException("store Node expected");
            }
            Level1ListIdentifier2Store storedIdentifier2Store = (Level1ListIdentifier2Store) listInStore;

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
                    storedIdentifier2Store = new Level1ListIdentifier2Store();
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
                    storedIdentifier2Store = new Level1ListIdentifier2Store();
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
                        storedIdentifier2Store = new Level1ListIdentifier2Store();
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
                            storedIdentifier2Store = new Level1ListIdentifier2Store();
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


    private void processLeafListIdentifer2Edit(ContainerIdentifier1 containerIdentifier1,
                                               DefaultContainerIdentifier1.OnosYangNodeOperationType
                                                       onosYangNodeOperationType) {
        if (containerIdentifier1.leafListIdentifier2() == null
                || containerIdentifier1.leafListIdentifier2().isEmpty()) {
            return;
        }
        for (String leafListIdentifer2Para : containerIdentifier1.leafListIdentifier2()) {
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
}
