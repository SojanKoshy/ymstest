package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.http.example.com.augment1.Augment1;
import org.onosproject.yang.gen.v1.http.example.com.augment1.augment1.interfaces.DefaultIfEntry;
import org.onosproject.yang.gen.v1.http.example.com.augment1.augment1.interfaces.IfEntry;
import org.onosproject.ymstest.store.AugmentedOperationProcessor;
import org.onosproject.ymstest.store.ProcessAugmentedEditOutput;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by root1 on 13/10/16.
 */
public class IfEntryListStore implements IfEntry {
    protected Augment1.OnosYangOpType onosYangOpType;
    private Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    private int ifType;
    private int ifMtu;
    private long ifIndex;
    private String ifDescr;
    public void ifType(int ifInt) {
        this.ifType = ifInt;
    }

    public void ifMtu(int ifMtu) {
        this.ifMtu = ifMtu;
    }

    public void ifIndex(long ifIndex) {
        this.ifIndex = ifIndex;
    }

    public void ifDescr(String ifDescr) {
        this.ifDescr = ifDescr;
    }

    /**
     * Returns the attribute ifIndex.
     *
     * @return ifIndex value of ifIndex
     */
    public long ifIndex(){
        return ifIndex;
    }

    /**
     * Returns the attribute ifDescr.
     *
     * @return ifDescr value of ifDescr
     */
   public String ifDescr(){
        return  ifDescr;
    }

    /**
     * Returns the attribute ifType.
     *
     * @return ifType value of ifType
     */
    public int ifType(){
        return ifType;
    }

    /**
     * Returns the attribute ifMtu.
     *
     * @return ifMtu value of ifMtu
     */
    public int ifMtu(){
        return ifMtu;
    }

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    public BitSet valueLeafFlags(){
        return null;
    }

    /**
     * Returns the attribute yangIfEntryOpType.
     *
     * @return yangIfEntryOpType value of yangIfEntryOpType
     */
    public Augment1.OnosYangOpType yangIfEntryOpType(){
        return onosYangOpType;
    }

    /**
     * Returns the attribute selectLeafFlags.
     *
     * @return selectLeafFlags value of selectLeafFlags
     */
   public BitSet selectLeafFlags(){
        return null;
    }

    /**
     * Returns the attribute yangAugmentedInfoMap.
     *
     * @return yangAugmentedInfoMap value of yangAugmentedInfoMap
     */
    public Map<Class<?>, Object> yangAugmentedInfoMap(){
        return yangAugmentedInfoMap;
    }

    public void addYangAugmentedInfo(Object value, Class classObject) {
        yangAugmentedInfoMap.put(classObject, value);
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
     * Checks if the passed IfEntry maps the content match query condition.
     *
     * @param ifEntry ifEntry being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public IfEntry processSubtreeFiltering(IfEntry ifEntry, boolean isSelectAllSchemaChild){
        return null;
    }

    /**
     * Checks if the leaf value is set.
     *
     * @param leaf leaf whose value status needs to checked
     * @return result of leaf value set in object
     */
    public boolean isLeafValueSet(LeafIdentifier leaf){
        return (ifDescr != null);
    }

    /**
     * Checks if the leaf is set to be a selected leaf.
     *
     * @param leaf if leaf needs to be selected
     * @return result of leaf value set in object
     */
   public boolean isSelectLeaf(LeafIdentifier leaf){
        return false;
    }

    public void processEdit(IfEntry ifEntry) {
        if (!(ifEntry instanceof DefaultIfEntry)) {
            //Operations are part of the default Node
            throw new RuntimeException("default Node expected");
        }
        IfEntry entry = (IfEntry) ifEntry;
        if (entry.yangIfEntryOpType() == null) {
            throw new RuntimeException("No operation set for Node");
        }


         // Process the augmented node contents

        for (Map.Entry<Class<?>, Object> entry1
                : ifEntry.yangAugmentedInfoMap().entrySet()) {
            Class<?> augmentClass = entry1.getKey();
            Object augmentObjectPara = entry1.getValue();
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
                storeAugmentedObject = new AugmentedAuIfEntryStore();
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
        }
        switch (entry.yangIfEntryOpType()) {
            case CREATE: {

                ifIndex(entry.ifIndex());
                ifDescr(entry.ifDescr());
                ifType(entry.ifType());
                ifMtu(entry.ifMtu());
                return;
            }
            case DELETE: {
                //do nothing, current stored node will be removed
                return;
            }

            case REPLACE: {

                ifIndex(entry.ifIndex());
                ifDescr(entry.ifDescr());
                ifType(entry.ifType());
                ifMtu(entry.ifMtu());
                return;
            }

            case REMOVE: {
                //do nothing, current stored node will be removed
                return;
            }
            case MERGE: {
                ifIndex(entry.ifIndex());
                ifDescr(entry.ifDescr());
                ifType(entry.ifType());
                ifMtu(entry.ifMtu());
                return;
            }
            case NONE:
            default: {
                //do nothing, child schema is already processed above
                return;
            }
        }

    }
}
