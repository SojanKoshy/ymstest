package org.onosproject.ymstest.store;

import org.onosproject.yang.gen.v1.urn.ip.topo.rev20140101.IpTopology;
import org.onosproject.yang.gen.v1.urn.ip.topo.rev20140101.iptopology.node
        .terminationpoints.terminationpoint.AugmentedTopoTerminationPoint;
import org.onosproject.yang.gen.v1.urn.ip.topo.rev20140101.iptopology.node
        .terminationpoints.terminationpoint
        .DefaultAugmentedTopoTerminationPoint;

import java.util.BitSet;

/**
 * Created by v70786 on 1/9/16.
 */
public class AugmentedTopoTerminationPointStore
        implements
        AugmentedTopoTerminationPoint, AugmentedOperationProcessor {
    protected String ipAddress;
    @Override
    public BitSet valueLeafFlags(){
        return null;
    }
    @Override
    public BitSet selectLeafFlags(){
        return null;
    }
    @Override
    public String ipAddress() {
        return ipAddress;
    }

    @Override
    public IpTopology.OnosYangOpType yangAugmentedTopoTerminationPointOpType() {
        return null;
    }

    public void ipAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
/*
    @Override
    public AugmentedTopoTerminationPoint processSubtreeFiltering(
            AugmentedTopoTerminationPoint augmentedTopoTerminationPoint,
            boolean isSelectAllSchemaChild) {
        return null;
    }*/

    @Override
    public boolean isLeafValueSet(
            LeafIdentifier leaf) {
        return (ipAddress != null);
    }

    @Override
    public boolean isSelectLeaf(
            LeafIdentifier leaf) {
        return false;
    }

    @Override
    public ProcessAugmentedEditOutput processNewAugmentedEdit(Object para) {
        DefaultAugmentedTopoTerminationPoint
                defaultAugmentedTopoTerminationPoint =
                (DefaultAugmentedTopoTerminationPoint) para;
        ProcessAugmentedEditOutput output = new ProcessAugmentedEditOutput();
        switch (defaultAugmentedTopoTerminationPoint
                .yangAugmentedTopoTerminationPointOpType()) {
            case CREATE: {
                ipAddress(defaultAugmentedTopoTerminationPoint.ipAddress());
                output.mapOperate = AugmentEditMapOperate.ADD_NEW;
                output.newStoreNode = this;
                return output;
            }
            case DELETE: {
                throw new RuntimeException("No deleted augmented topo link");
            }

            case REPLACE: {
                ipAddress(defaultAugmentedTopoTerminationPoint.ipAddress());
                output.mapOperate = AugmentEditMapOperate.ADD_NEW;
                output.newStoreNode = this;
                return output;
            }

            case REMOVE: {
                output.mapOperate = AugmentEditMapOperate.NO_MAP_OPERATION;
                return output;
            }
            case MERGE: {
                ipAddress(defaultAugmentedTopoTerminationPoint.ipAddress());
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
        DefaultAugmentedTopoTerminationPoint
                defaultAugmentedTopoTerminationPoint =
                (DefaultAugmentedTopoTerminationPoint) para;
        ProcessAugmentedEditOutput output = new ProcessAugmentedEditOutput();
        switch (defaultAugmentedTopoTerminationPoint
                .yangAugmentedTopoTerminationPointOpType()) {
            case CREATE: {
                throw new RuntimeException("augmented topo link already " +
                                                   "present");
            }
            case DELETE: {
                if (ipAddress
                        != defaultAugmentedTopoTerminationPoint.ipAddress()) {
                    throw new RuntimeException("No augmented topo link to " +
                                                       "delete");
                }
                output.mapOperate = AugmentEditMapOperate.DELETE_OLD;
                return output;
            }

            case REPLACE: {
                ipAddress(defaultAugmentedTopoTerminationPoint.ipAddress());
                output.mapOperate = AugmentEditMapOperate.NO_MAP_OPERATION;
                output.newStoreNode = this;
                return output;
            }

            case REMOVE: {
                if (ipAddress !=
                        defaultAugmentedTopoTerminationPoint.ipAddress()) {
                    output.mapOperate = AugmentEditMapOperate.NO_MAP_OPERATION;
                    return output;
                }
                output.mapOperate = AugmentEditMapOperate.DELETE_OLD;
                return output;

            }
            case MERGE: {
                ipAddress(defaultAugmentedTopoTerminationPoint.ipAddress());
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
