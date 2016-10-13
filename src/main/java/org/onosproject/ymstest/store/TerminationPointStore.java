package org.onosproject.ymstest.store;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.ModuleIdentifier0;
import org.onosproject.yang.gen.v1.urn.topo.rev20140101.Topology;
import org.onosproject.yang.gen.v1.urn.topo.rev20140101.topology.node
        .terminationpoints.DefaultTerminationPoint;
import org.onosproject.yang.gen.v1.urn.topo.rev20140101.topology.node
        .terminationpoints.TerminationPoint;

/**
 * Created by v70786 on 31/8/16.
 */
public class TerminationPointStore
        implements TerminationPoint {
    @Override
    public BitSet valueLeafFlags(){
        return null;
    }
    @Override
    public BitSet selectLeafFlags(){
        return null;
    }
    private String tpId;
    private Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected Topology.OnosYangOpType yangTerminationPointOpType;

    @Override
    public String tpId() {
        return tpId;
    }

    @Override
    public Topology.OnosYangOpType yangTerminationPointOpType() {
        return yangTerminationPointOpType;
    }

    public void tpId(String tpId) {
        this.tpId = tpId;
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
    public TerminationPoint processSubtreeFiltering(
            TerminationPoint terminationPoint, boolean isSelectAllSchemaChild) {
        return null;
    }

    @Override
    public boolean isLeafValueSet(LeafIdentifier leaf) {
        return (tpId != null);
    }

    @Override
    public boolean isSelectLeaf(LeafIdentifier leaf) {
        return false;
    }

    public void processEdit(TerminationPoint terminationPointPara) {
        if (!(terminationPointPara instanceof DefaultTerminationPoint)) {
            //Operations are part of the default Node
            throw new RuntimeException("default termination point expected");
        }
        DefaultTerminationPoint opNode
                = (DefaultTerminationPoint) terminationPointPara;
        if (opNode.yangTerminationPointOpType() == null) {
            throw new RuntimeException("No operation set for termination " +
                                               "point");
        }

        /*
         * Process the augmented node contents
         */
        for (Map.Entry<Class<?>, Object> entry
                : terminationPointPara.yangAugmentedInfoMap().entrySet()) {
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
                    default:
                }
            } else if (storeAugmentedObject == null) {
                //TODO: the augment class is hard coded, since it is not
                // there in the generated classes, remove it once the YANG
                // tools can support it.
                storeAugmentedObject = new AugmentedTopoTerminationPointStore();
                ProcessAugmentedEditOutput output =
                        ((AugmentedOperationProcessor)
                                storeAugmentedObject).processNewAugmentedEdit(
                                augmentObjectPara);
                switch (output.mapOperate) {
                    case ADD_NEW: {
                        addYangAugmentedInfo(output.newStoreNode, augmentClass);
                    }
                    default:
                }

            }

        }

        switch (opNode.yangTerminationPointOpType()) {
            case CREATE: {
                tpId(terminationPointPara.tpId());
                return;
            }
            case DELETE: {
                //do nothing, current stored node will be removed
                return;
            }

            case REPLACE: {
                tpId(terminationPointPara.tpId());
                return;
            }

            case REMOVE: {
                //do nothing, current stored node will be removed
                return;
            }
            case MERGE: {
                tpId(terminationPointPara.tpId());
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
