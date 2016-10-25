package org.onosproject.ymstest.store;

import org.onosproject.yang.gen.v1.urn.ip.topo.rev20140101.IpTopology;
import org.onosproject.yang.gen.v1.urn.ip.topo.rev20140101.iptopology.node
        .AugmentedTopoNode;
import org.onosproject.yang.gen.v1.urn.ip.topo.rev20140101.iptopology.node
        .DefaultAugmentedTopoNode;

import java.util.BitSet;

/**
 * Created by v70786 on 31/8/16.
 */
public class AugmentedTopoNodeStore
        implements AugmentedTopoNode, AugmentedOperationProcessor {
    private String routerId;
    @Override
    public BitSet valueLeafFlags(){
        return null;
    }
    @Override
    public BitSet selectLeafFlags(){
        return null;
    }
    @Override
    public String routerId() {
        return routerId;
    }

    @Override
    public IpTopology.OnosYangOpType yangAugmentedTopoNodeOpType() {
        return null;
    }

    public void routerId(String routerId) {
        this.routerId = routerId;
    }

/*

    @Override
    public AugmentedTopoNode processSubtreeFiltering(
            AugmentedTopoNode augmentedTopoNode,
            boolean isSelectAllSchemaChild) {
        return null;
    }
*/

    @Override
    public boolean isLeafValueSet(LeafIdentifier leaf) {
        return (routerId != null);
    }

    @Override
    public boolean isSelectLeaf(LeafIdentifier leaf) {
        return false;
    }

    @Override
    public ProcessAugmentedEditOutput processNewAugmentedEdit(Object para) {
        DefaultAugmentedTopoNode augmentedTopoNodePara =
                (DefaultAugmentedTopoNode) para;
        ProcessAugmentedEditOutput output = new ProcessAugmentedEditOutput();
        switch (augmentedTopoNodePara.yangAugmentedTopoNodeOpType()) {
            case CREATE: {
                routerId(augmentedTopoNodePara.routerId());
                output.mapOperate = AugmentEditMapOperate.ADD_NEW;
                output.newStoreNode = this;
                return output;
            }
            case DELETE: {
                throw new RuntimeException("No deleted augmented topo node");
            }

            case REPLACE: {
                routerId(augmentedTopoNodePara.routerId());
                output.mapOperate = AugmentEditMapOperate.ADD_NEW;
                output.newStoreNode = this;
                return output;
            }

            case REMOVE: {
                output.mapOperate = AugmentEditMapOperate.NO_MAP_OPERATION;
                return output;
            }
            case MERGE: {
                routerId(augmentedTopoNodePara.routerId());
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
        DefaultAugmentedTopoNode augmentedTopoNodePara =
                (DefaultAugmentedTopoNode) para;
        ProcessAugmentedEditOutput output = new ProcessAugmentedEditOutput();
        switch (augmentedTopoNodePara.yangAugmentedTopoNodeOpType()) {
            case CREATE: {
                throw new RuntimeException("augmented topo node already " +
                                                   "present");
            }
            case DELETE: {
                if (routerId != augmentedTopoNodePara.routerId()) {
                    throw new RuntimeException("No augmented topo node to " +
                                                       "delete");
                }
                output.mapOperate = AugmentEditMapOperate.DELETE_OLD;
                return output;
            }

            case REPLACE: {
                routerId(augmentedTopoNodePara.routerId());
                output.mapOperate = AugmentEditMapOperate.NO_MAP_OPERATION;
                output.newStoreNode = this;
                return output;
            }

            case REMOVE: {
                if (routerId != augmentedTopoNodePara.routerId()) {
                    output.mapOperate = AugmentEditMapOperate.NO_MAP_OPERATION;
                    return output;
                }
                output.mapOperate = AugmentEditMapOperate.DELETE_OLD;
                return output;

            }
            case MERGE: {
                routerId(augmentedTopoNodePara.routerId());
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
