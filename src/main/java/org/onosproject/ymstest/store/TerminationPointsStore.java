package org.onosproject.ymstest.store;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.onosproject.yang.gen.v1.urn.topo.rev20140101.topology.node
        .DefaultTerminationPoints;
import org.onosproject.yang.gen.v1.urn.topo.rev20140101.topology.node
        .TerminationPoints;
import org.onosproject.yang.gen.v1.urn.topo.rev20140101.topology.node
        .terminationpoints.TerminationPoint;

/**
 * Created by v70786 on 31/8/16.
 */
public class TerminationPointsStore
        implements TerminationPoints {
    private short numberOfTp;
    private boolean isNoOfTpSet;

    private List<TerminationPoint> terminationPoint = new ArrayList<>();
    private Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    @Override
    public short numberOfTp() {
        return numberOfTp;
    }

    @Override
    public OnosYangNodeOperationType onosYangNodeOperationType() {
        return null;
    }

    @Override
    public List<TerminationPoint> terminationPoint() {
        return terminationPoint;
    }

    public void numberOfTp(short numberOfTp) {
        isNoOfTpSet = true;
        this.numberOfTp = numberOfTp;
    }

    public void addToTerminationPoint(TerminationPoint value) {
        terminationPoint().add(value);
    }


    @Override
    public Object yangAugmentedInfo(Class classObject) {
        return null;
    }

    @Override
    public Map<Class<?>, Object> yangAugmentedInfoMap() {
        return null;
    }

    @Override
    public TerminationPoints processSubtreeFiltering(
            TerminationPoints terminationPoints,
            boolean isSelectAllSchemaChild) {
        return null;
    }

    @Override
    public boolean isLeafValueSet(LeafIdentifier leaf) {
        return isNoOfTpSet;
    }

    @Override
    public boolean isSelectLeaf(LeafIdentifier leaf) {
        return false;
    }

    public void processEdit(TerminationPoints terminationPointsPara) {
        if (!(terminationPointsPara instanceof DefaultTerminationPoints)) {
            //Operations are part of the default Node
            throw new RuntimeException("default termination points expected");
        }
        DefaultTerminationPoints opNode
                = (DefaultTerminationPoints) terminationPointsPara;
        if (opNode.onosYangNodeOperationType() == null) {
            throw new RuntimeException("No operation set for termination " +
                                               "points");
        }

        /*
         * Process the child nodes
         */
        processTerminationPointEdit(terminationPointsPara,
                                    opNode.onosYangNodeOperationType());

        /*
         * TODO: Process the augmented node contents
         */

        switch (opNode.onosYangNodeOperationType()) {
            case CREATE: {
                numberOfTp(terminationPointsPara.numberOfTp());
                return;
            }
            case DELETE: {
                //do nothing, current stored node will be removed
                return;
            }

            case REPLACE: {
                numberOfTp(terminationPointsPara.numberOfTp());
                return;
            }

            case REMOVE: {
                //do nothing, current stored node will be removed
                return;
            }
            case MERGE: {
                numberOfTp(terminationPointsPara.numberOfTp());
                return;
            }
            case NONE:
            default: {
                //do nothing, child schema is already processed above
                return;
            }
        }
    }

    private TerminationPoint findTerminationPoint(
            TerminationPoint searchTerminationPoint) {
        if (terminationPoint().isEmpty()
                || searchTerminationPoint.tpId() == null) {
            return null;
        }

        for (TerminationPoint terminationPoint : terminationPoint()) {
//            if (terminationPoint.tpId() == null) {
//                continue;
//            }
            if (!(terminationPoint instanceof TerminationPointStore)) {
                throw new RuntimeException("invalid Termnination point store");
            }

            if (searchTerminationPoint.tpId().equals(terminationPoint.tpId())) {
                return terminationPoint;
            }
        }
        return null;
    }

    private void processTerminationPointEdit(
            TerminationPoints terminationPointsPara,
            DefaultTerminationPoints.OnosYangNodeOperationType
                    onosYangNodeOperationType) {
        if (terminationPointsPara.terminationPoint() == null) {
            return;
        }

        if (!(terminationPoint() instanceof List<?>)) {
            //stored node is not correct
            throw new RuntimeException("store termination point expected");
        }

        for (TerminationPoint terminationPointPara
                : terminationPointsPara.terminationPoint()) {

            TerminationPointStore storedTerminationPoint
                    = (TerminationPointStore) findTerminationPoint(
                    terminationPointPara);

            switch (onosYangNodeOperationType) {
                case CREATE: {
                    if (storedTerminationPoint != null) {
                        throw new RuntimeException("TerminationPointStore" +
                                                           " is already " +
                                                           "created");
                    }
                    storedTerminationPoint = new TerminationPointStore();
                    addToTerminationPoint(storedTerminationPoint);
                    storedTerminationPoint.processEdit(terminationPointPara);
                    continue; //continue to next termination point
                }
                case DELETE: {
                    if (storedTerminationPoint == null) {
                        throw new RuntimeException("TerminationPointStore" +
                                                           " is not in store");
                    }
                    storedTerminationPoint.processEdit(terminationPointPara);
                    terminationPoint().remove(storedTerminationPoint);
                    continue; //continue to next termination point
                }

                case REPLACE: {
                    if (storedTerminationPoint != null) {
                        storedTerminationPoint
                                .processEdit(terminationPointPara);
                        continue; //continue to next termination point
                    }
                    storedTerminationPoint = new TerminationPointStore();
                    addToTerminationPoint(storedTerminationPoint);
                    storedTerminationPoint.processEdit(terminationPointPara);
                    continue; //continue to next termination point
                }

                case REMOVE: {
                    if (storedTerminationPoint == null) {
                        continue; //continue to next termination point
                    }
                    storedTerminationPoint.processEdit(terminationPointPara);
                    terminationPoint().remove(storedTerminationPoint);
                    continue; //continue to next termination point
                }
                case MERGE: {
                    if (storedTerminationPoint == null) {
                        storedTerminationPoint = new TerminationPointStore();
                        addToTerminationPoint(storedTerminationPoint);
                        storedTerminationPoint
                                .processEdit(terminationPointPara);
                        continue; //continue to next termination point
                    }
                    storedTerminationPoint.processEdit(terminationPointPara);
                    continue; //continue to next termination point
                }
                case NONE: {
                    if (storedTerminationPoint == null) {
                        continue; //continue to next termination point
                    }
                    storedTerminationPoint.processEdit(terminationPointPara);
                    continue; //continue to next termination point
                }
                default:
            }
        }
    }
}
