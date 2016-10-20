package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.http.example.com.augment1.Augment1;
import org.onosproject.yang.gen.v1.http.example.com.augment1.augment1.interfaces.ifentry.AugmentedAuIfEntry;
import org.onosproject.yang.gen.v1.http.example.com.augment1.augment1.interfaces.ifentry.DefaultAugmentedAuIfEntry;
import org.onosproject.ymstest.store.AugmentEditMapOperate;
import org.onosproject.ymstest.store.AugmentedOperationProcessor;
import org.onosproject.ymstest.store.ProcessAugmentedEditOutput;

import java.util.BitSet;

/**
 * Created by root1 on 13/10/16.
 */
public class AugmentedAuIfEntryStore implements AugmentedAuIfEntry, AugmentedOperationProcessor {
    protected Augment1.OnosYangOpType onosYangOpType;
    private byte ifType;
    private int uid;

    public void ifType1(byte ifType) {
        this.ifType = ifType;
    }

    public void uid(int uid) {
        this.uid = uid;
    }

    public boolean isSubTreeFiltered() {
        return false;
    }

    /**
     * Returns the attribute ifType1.
     *
     * @return ifType1 value of ifType1
     */
    public byte ifType1() {
        return ifType;
    }

    /**
     * Returns the attribute uid.
     *
     * @return uid value of uid
     */
    public int uid() {
        return uid;
    }

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    public BitSet valueLeafFlags() {
        return null;
    }

    /**
     * Returns the attribute yangAugmentedAuIfEntryOpType.
     *
     * @return yangAugmentedAuIfEntryOpType value of yangAugmentedAuIfEntryOpType
     */
    public Augment1.OnosYangOpType yangAugmentedAuIfEntryOpType() {
        return onosYangOpType;
    }

    /**
     * Returns the attribute selectLeafFlags.
     *
     * @return selectLeafFlags value of selectLeafFlags
     */
    public BitSet selectLeafFlags() {
        return null;
    }

    /**
     * Checks if the passed AugmentedAuIfEntry maps the content match query condition.
     *
     * @param augmentedAuIfEntry     augmentedAuIfEntry being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public AugmentedAuIfEntry processSubtreeFiltering(AugmentedAuIfEntry augmentedAuIfEntry, boolean
            isSelectAllSchemaChild) {
        return null;
    }

    /**
     * Checks if the leaf value is set.
     *
     * @param leaf leaf whose value status needs to checked
     * @return result of leaf value set in object
     */
    public boolean isLeafValueSet(LeafIdentifier leaf) {
        return (new Byte(ifType1()) != null && new Integer(uid()) != null);
    }

    /**
     * Checks if the leaf is set to be a selected leaf.
     *
     * @param leaf if leaf needs to be selected
     * @return result of leaf value set in object
     */
    public boolean isSelectLeaf(LeafIdentifier leaf) {
        return false;
    }

    @Override
    public ProcessAugmentedEditOutput processNewAugmentedEdit(Object para) {
        DefaultAugmentedAuIfEntry defaultAugmentedAuIfEntry =
                (DefaultAugmentedAuIfEntry) para;
        ProcessAugmentedEditOutput output = new ProcessAugmentedEditOutput();
        switch (defaultAugmentedAuIfEntry.yangAugmentedAuIfEntryOpType()) {
            case CREATE: {
                ifType1(defaultAugmentedAuIfEntry.ifType1());
                uid(defaultAugmentedAuIfEntry.uid());
                output.mapOperate = AugmentEditMapOperate.ADD_NEW;
                output.newStoreNode = this;
                return output;
            }
            case DELETE: {
                throw new RuntimeException("No deleted augmented topo node");
            }

            case REPLACE: {
                ifType1(defaultAugmentedAuIfEntry.ifType1());
                uid(defaultAugmentedAuIfEntry.uid());
                output.mapOperate = AugmentEditMapOperate.ADD_NEW;
                output.newStoreNode = this;
                return output;
            }

            case REMOVE: {
                output.mapOperate = AugmentEditMapOperate.NO_MAP_OPERATION;
                return output;
            }
            case MERGE: {
                ifType1(defaultAugmentedAuIfEntry.ifType1());
                uid(defaultAugmentedAuIfEntry.uid());
                output.mapOperate = AugmentEditMapOperate.ADD_NEW;
                output.newStoreNode = this;
                return output;
            }
            case NONE:
            default: {
                output.mapOperate = AugmentEditMapOperate.NO_MAP_OPERATION;
                return output;
            }
        }
    }

    @Override
    public ProcessAugmentedEditOutput processAugmentedEdit(Object para) {
        DefaultAugmentedAuIfEntry augmentedTopoNodePara =
                (DefaultAugmentedAuIfEntry) para;
        ProcessAugmentedEditOutput output = new ProcessAugmentedEditOutput();
        switch (augmentedTopoNodePara.yangAugmentedAuIfEntryOpType()) {
            case CREATE: {
                throw new RuntimeException("augmented topo node already " +
                        "present");
            }
            case DELETE: {
                if (uid() != augmentedTopoNodePara.uid() && ifType1() != augmentedTopoNodePara.ifType1()) {
                    throw new RuntimeException("No augmented topo node to " +
                            "delete");
                }
                output.mapOperate = AugmentEditMapOperate.DELETE_OLD;
                return output;
            }

            case REPLACE: {
                ifType1(augmentedTopoNodePara.ifType1());
                uid(augmentedTopoNodePara.uid());
                output.mapOperate = AugmentEditMapOperate.NO_MAP_OPERATION;
                output.newStoreNode = this;
                return output;
            }

            case REMOVE: {
                if (uid() != augmentedTopoNodePara.uid() && ifType1() != augmentedTopoNodePara.ifType1()) {
                    output.mapOperate = AugmentEditMapOperate.NO_MAP_OPERATION;
                    return output;
                }
                output.mapOperate = AugmentEditMapOperate.DELETE_OLD;
                return output;

            }
            case MERGE: {
                ifType1(augmentedTopoNodePara.ifType1());
                uid(augmentedTopoNodePara.uid());
                output.mapOperate = AugmentEditMapOperate.NO_MAP_OPERATION;
                output.newStoreNode = this;
                return output;
            }
            case NONE:
            default: {
                output.mapOperate = AugmentEditMapOperate.NO_MAP_OPERATION;
                return output;
            }
        }
    }
}
