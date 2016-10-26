package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.http.example.com.augment1.Augment1;
import org.onosproject.yang.gen.v1.http.example.com.augment1.augment1.DefaultInterfaces;
import org.onosproject.yang.gen.v1.http.example.com.augment1.augment1.Interfaces;
import org.onosproject.yang.gen.v1.http.example.com.augment1.augment1.interfaces.DefaultIfEntry;
import org.onosproject.yang.gen.v1.http.example.com.augment1.augment1.interfaces.IfEntry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by root1 on 12/10/16.
 */
public class InterfacesContainerStore implements Interfaces {
    protected Augment1.OnosYangOpType onosYangOpType;
    private Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    private List<IfEntry> ifEntries = new ArrayList<>();

    /**
     * Returns the attribute yangInterfacesOpType.
     *
     * @return yangInterfacesOpType value of yangInterfacesOpType
     */
    public Augment1.OnosYangOpType yangInterfacesOpType(){
        return onosYangOpType;
    }

    public void ifEntries(List<IfEntry> ifEntries) {
        this.ifEntries = ifEntries;
    }
    /**
     * Returns the attribute yangAugmentedInfoMap.
     *
     * @return yangAugmentedInfoMap value of yangAugmentedInfoMap
     */
    public Map<Class<?>, Object> yangAugmentedInfoMap(){
        return yangAugmentedInfoMap;
    }

    /**
     * Returns the attribute ifEntry.
     *
     * @return ifEntry list of ifEntry
     */
    public List<IfEntry> ifEntry(){
        return ifEntries;
    }


    /**
     * Returns the attribute yangAugmentedInfo.
     *
     * @param classObject value of yangAugmentedInfo
     * @return yangAugmentedInfo
     */
    public Object yangAugmentedInfo(Class classObject){
        return yangAugmentedInfoMap.get(classObject);
    }
    /**
     * Checks if the passed Interfaces maps the content match query condition.
     *
     * @param interfaces interfaces being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public Interfaces processSubtreeFiltering(Interfaces interfaces, boolean isSelectAllSchemaChild){
        return null;
    }

    public void processEdit(Interfaces interfaces) {
        if (!(interfaces instanceof DefaultInterfaces)) {
            //Operations are part of the default Node
            throw new RuntimeException("default Node expected");
        }
        DefaultInterfaces interfacesNode = (DefaultInterfaces) interfaces;

        processListIdentifer2Edit(interfaces);

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

       /* switch (interfacesNode.yangInterfacesOpType()) {
            case CREATE: {
                if (interfacesNode.leafIdentifier2() != null) {
                    throw new RuntimeException("Level1ContainerIdentifier1Store");
                }
                leafIdentifier2(interfacesNode.leafIdentifier2());
                return;
            }
            case DELETE: {
                //do nothing, current stored node will be removed
                return;
            }

            case REPLACE: {

                leafIdentifier2(interfaces.leafIdentifier2());
                return;
            }

            case REMOVE: {
                //do nothing, current stored node will be removed
                return;
            }
            case MERGE: {
                if (interfaces.leafIdentifier2() == null) {
                    throw new RuntimeException("Level1ContainerIdentifier1Store");
                }
                leafIdentifier2(interfaces.leafIdentifier2());
                return;
            }
            case NONE:
            default: {
                //do nothing, child schema is already processed above
                return;
            }
        }*/

    }
    private void processListIdentifer2Edit(Interfaces interfaces) {
        if (interfaces.ifEntry() == null || interfaces.ifEntry().isEmpty()) {
            return;
        }
        for (IfEntry ifEntry : interfaces.ifEntry()) {
            if (!ifEntry.isLeafValueSet((IfEntry.LeafIdentifier.IFINDEX))
                    && ifEntry.ifIndex() == 0) {
                ifEntries.clear();
                return;
            }
            IfEntry listInStore = findListIdentifer2InStore(ifEntry);

            if (listInStore != null && !(listInStore instanceof Level1ListIdentifier2Store)) {
                //stored node is not correct
                throw new RuntimeException("store Node expected");
            }
            IfEntryListStore ifEntryListStore = (IfEntryListStore) listInStore;

            if (!(ifEntry instanceof DefaultIfEntry)) {
                //Operations are part of the default Node
                throw new RuntimeException("default Node expected");
            }
            DefaultIfEntry entry = (DefaultIfEntry) ifEntry;
            if (entry.yangIfEntryOpType() == null) {
                throw new RuntimeException("No operation set for Node");
            }
            switch (entry.yangIfEntryOpType()) {
                case CREATE: {
                    if (ifEntryListStore != null) {
                        throw new RuntimeException(
                                "Node: "  + " is already " +
                                        "created");
                    }
                    ifEntryListStore = new IfEntryListStore();
                    ifEntries.add(ifEntryListStore);
                    ifEntryListStore.processEdit(ifEntry);
                    continue; //continue to process the next input node
                }
                case DELETE: {
                    if (ifEntryListStore == null) {
                        throw new RuntimeException(
                                "Node: " + " is not in " +
                                        "store");
                    }
                    ifEntryListStore.processEdit(ifEntry);
                    ifEntries.remove(ifEntryListStore);
                    continue; //continue to process the next input node
                }

                case REPLACE: {
                    if (ifEntryListStore != null) {
                        ifEntryListStore.processEdit(ifEntry);
                        continue; //continue to process the next input node
                    }
                    ifEntryListStore = new IfEntryListStore();
                    ifEntries.add(ifEntryListStore);
                    ifEntryListStore.processEdit(ifEntry);
                    continue; //continue to process the next input node
                }

                case REMOVE: {
                    if (ifEntryListStore == null) {
                        continue; //continue to process the next input node
                    }
                    ifEntryListStore.processEdit(ifEntry);
                    ifEntries.remove(ifEntryListStore);
                    continue; //continue to process the next input node
                }
                case MERGE: {
                    if (ifEntryListStore == null) {
                        ifEntryListStore = new IfEntryListStore();
                        ifEntries.add(ifEntryListStore);
                        ifEntryListStore.processEdit(ifEntry);
                        continue; //continue to process the next input node
                    }
                    ifEntryListStore.processEdit(ifEntry);
                    continue; //continue to process the next input node
                }
                case NONE: {
                    if (ifEntryListStore == null) {
                        if (ifEntry != null) {
                            ifEntryListStore = new IfEntryListStore();
                            ifEntries.add(ifEntryListStore);
                            ifEntryListStore.processEdit(ifEntry);
                        }
                        continue; //continue to process the next input node
                    }
                    ifEntryListStore.processEdit(ifEntry);
                    continue; //continue to process the next input node
                }
                default:
            }
        }
    }

    private IfEntry findListIdentifer2InStore(IfEntry findNode) {
        for (IfEntry node : ifEntry()) {
//            if (node.nodeId() == null) {
//                continue;
//            }
            if (node.ifIndex() ==(findNode.ifIndex())) {
                return node;
            }
        }
        return null;
    }
}
