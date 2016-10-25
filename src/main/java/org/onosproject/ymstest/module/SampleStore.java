package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.urn.model.exp1.Exp1;
import org.onosproject.yang.gen.v1.urn.model.exp1.exp1.Sample;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by root1 on 21/10/16.
 */
public class SampleStore extends Container implements Sample {


    private String nodeId;
    private Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    public void nodeId(String nodeId) {
        this.nodeId = nodeId;
    }
    /**
     * Returns the attribute nodeId.
     *
     * @return nodeId value of nodeId
     */
    public String nodeId() {
        return nodeId;
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
     * Returns the attribute yangSampleOpType.
     *
     * @return yangSampleOpType value of yangSampleOpType
     */
    @Override
    public Exp1.OnosYangOpType yangSampleOpType() {
        return null;
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
     * Returns the attribute yangAugmentedInfoMap.
     *
     * @return yangAugmentedInfoMap value of yangAugmentedInfoMap
     */
    public Map<Class<?>, Object> yangAugmentedInfoMap() {
        return yangAugmentedInfoMap;
    }


    /**
     * Returns the attribute yangAugmentedInfo.
     *
     * @param classObject value of yangAugmentedInfo
     * @return yangAugmentedInfo
     */
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }

    /**
     * Checks if the leaf value is set.
     *
     * @param leaf leaf whose value status needs to checked
     * @return result of leaf value set in object
     */
    public boolean isLeafValueSet(LeafIdentifier leaf) {
        return (nodeId() != null);
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

    public void processEdit(Sample sample) {
        System.out.println("inside processEdit");
        switch (sample.yangSampleOpType()) {
            case CREATE: {
                nodeId(sample.nodeId());
                return;
            }
            case DELETE: {
                //do nothing, current stored node will be removed
                return;
            }

            case REPLACE: {
                nodeId(sample.nodeId());
                return;
            }

            case REMOVE: {
                //do nothing, current stored node will be removed
                return;
            }
            case MERGE: {
                nodeId(sample.nodeId());
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
