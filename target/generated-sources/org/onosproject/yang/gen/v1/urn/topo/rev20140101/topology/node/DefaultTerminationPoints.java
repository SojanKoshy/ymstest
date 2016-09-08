/*
 * Copyright 2016-present Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onosproject.yang.gen.v1.urn.topo.rev20140101.topology.node;

import com.google.common.base.MoreObjects;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.onosproject.yang.gen.v1.urn.topo.rev20140101.topology.node.terminationpoints.TerminationPoint;

/**
 * Represents the implementation of terminationPoints.
 */
public class DefaultTerminationPoints implements TerminationPoints {

    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected short numberOfTp;
    protected OnosYangNodeOperationType onosYangNodeOperationType;
    protected List<TerminationPoint> terminationPoint;
    /**
     * Identify the leafs whose value are explicitly set
     * Applicable in protocol edit and query operation
     */
    private BitSet valueLeafFlags = new BitSet();

    /**
     * Identify the leafs to be selected, in a query operation
     */
    private BitSet selectLeafFlags = new BitSet();

    @Override
    public short numberOfTp() {
        return numberOfTp;
    }

    @Override
    public OnosYangNodeOperationType onosYangNodeOperationType() {
        return onosYangNodeOperationType;
    }

    @Override
    public List<TerminationPoint> terminationPoint() {
        return terminationPoint;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfTp, onosYangNodeOperationType, terminationPoint);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultTerminationPoints) {
            DefaultTerminationPoints other = (DefaultTerminationPoints) obj;
            return
                 Objects.equals(numberOfTp, other.numberOfTp) &&
                 Objects.equals(onosYangNodeOperationType, other.onosYangNodeOperationType) &&
                 Objects.equals(terminationPoint, other.terminationPoint);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .add("numberOfTp", numberOfTp)
            .add("onosYangNodeOperationType", onosYangNodeOperationType)
            .add("terminationPoint", terminationPoint)
            .toString();
    }

    @Override
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }

    @Override
    public Map<Class<?>, Object> yangAugmentedInfoMap() {
        return yangAugmentedInfoMap;
    }

    /**
     * Creates an instance of terminationPoints.
     *
     * @param builderObject builder object of terminationPoints
     */
    protected DefaultTerminationPoints(TerminationPointsBuilder builderObject) {
        this.numberOfTp = builderObject.numberOfTp();
        this.onosYangNodeOperationType = builderObject.onosYangNodeOperationType();
        this.terminationPoint = builderObject.terminationPoint();
        this.valueLeafFlags = builderObject.getValueLeafFlags();
        this.selectLeafFlags = builderObject.getSelectLeafFlags();
        this.yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
    }

    @Override
    public TerminationPoints processSubtreeFiltering(TerminationPoints appInstance, boolean isSelectAllSchemaChild) {
        TerminationPointsBuilder subTreeFilteringResultBuilder = new TerminationPointsBuilder();
        Boolean isAnySelectOrContainmentNode = false;
        if (!processLeafSubtreeFiltering(appInstance, subTreeFilteringResultBuilder,
            isAnySelectOrContainmentNode, isSelectAllSchemaChild)) {
            return null;
        }
        if (!processChildNodesSubTreeFiltering(appInstance, subTreeFilteringResultBuilder,
            isAnySelectOrContainmentNode, isSelectAllSchemaChild)) {
            return null;
        }
        for (Object yangAugmentedInfo : this.yangAugmentedInfoMap().values()) {
            Object yangAugmentedOpParamInfo = appInstance.yangAugmentedInfo(yangAugmentedInfo.getClass());
            Object processSubtreeFiltering;
            try {
                Class<?>[] interfaces = yangAugmentedInfo.getClass().getInterfaces();
                processSubtreeFiltering = yangAugmentedInfo.getClass()
                    .getMethod("processSubtreeFiltering", interfaces[0]).invoke(yangAugmentedInfo,
                        yangAugmentedOpParamInfo);
                if (processSubtreeFiltering != null) {
                    subTreeFilteringResultBuilder
            .addYangAugmentedInfo(processSubtreeFiltering, processSubtreeFiltering.getClass());
                }
            } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                continue;
            }
        }
        if (!isSelectAllSchemaChild && !isAnySelectOrContainmentNode) {
            return processSubtreeFiltering(appInstance, true);
        }
        return subTreeFilteringResultBuilder.build();
    }
    private boolean processLeafSubtreeFiltering(TerminationPoints appInstance, TerminationPointsBuilder
            subTreeFilteringResultBuilder,
            Boolean isAnySelectOrContainmentNode, boolean isSelectAllSchemaChild) {
        if (getValueLeafFlags().get(LeafIdentifier.NUMBEROFTP.getLeafIndex())) {
            if (appInstance.numberOfTp() != numberOfTp()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.numberOfTp(appInstance.numberOfTp());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.NUMBEROFTP.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.numberOfTp(appInstance.numberOfTp());
        }

        return true;
    }

    private boolean processChildNodesSubTreeFiltering(TerminationPoints appInstance, TerminationPointsBuilder
            subTreeFilteringResultBuilder,
            Boolean isAnySelectOrContainmentNode, boolean isSelectAllSchemaChild) {
        if (isSelectAllSchemaChild) {
            for (TerminationPoint terminationPoint : appInstance.terminationPoint()) {
                subTreeFilteringResultBuilder.addToTerminationPoint(terminationPoint);
            }
        } else if (terminationPoint() != null) {
            isAnySelectOrContainmentNode = true;
            if (!terminationPoint().isEmpty()) {
                if (appInstance.terminationPoint() != null && !appInstance.terminationPoint().isEmpty()) {
                    for (TerminationPoint terminationPoint : terminationPoint()) {
                        for (TerminationPoint terminationPoint2 : appInstance.terminationPoint()) {
                            TerminationPoint result = terminationPoint
            .processSubtreeFiltering(terminationPoint2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToTerminationPoint(result);
                            }
                        }
                    }
                }
            } else {
                if (appInstance.terminationPoint() != null && !appInstance.terminationPoint().isEmpty()) {
                    for (TerminationPoint terminationPoint : appInstance.terminationPoint()) {
                        subTreeFilteringResultBuilder.addToTerminationPoint(terminationPoint);
                    }
                }
            }
        }

        return true;
    }


    /**
     * Creates an instance of defaultTerminationPoints.
     */
    protected DefaultTerminationPoints() {
    }

    /**
     * Returns the attribute TerminationPointsBuilder.
     *
     * @return value of TerminationPointsBuilder
     */
    public static TerminationPointsBuilder builder() {
        return new TerminationPointsBuilder();
    }

    /**
     * Returns the valueLeafFlags.
     *
     * @return value of valueLeafFlags
     */
    public BitSet getValueLeafFlags() {
        return valueLeafFlags;
    }

    /**
     * Returns the selectLeafFlags.
     *
     * @return value of selectLeafFlags
     */
    public BitSet getSelectLeafFlags() {
        return selectLeafFlags;
    }


    @Override
    public boolean isLeafValueSet(LeafIdentifier leaf) {
        return getValueLeafFlags().get(leaf.getLeafIndex());
    }

    @Override
    public boolean isSelectLeaf(LeafIdentifier leaf) {
        return getSelectLeafFlags().get(leaf.getLeafIndex());
    }


    /**
     * Represents the builder implementation of terminationPoints.
     */
    public static class TerminationPointsBuilder implements TerminationPoints.TerminationPointsBuilder {

        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected short numberOfTp;
        protected OnosYangNodeOperationType onosYangNodeOperationType;
        protected List<TerminationPoint> terminationPoint;
        /**
         * Identify the leafs whose value are explicitly set
         * Applicable in protocol edit and query operation
         */
        private BitSet valueLeafFlags = new BitSet();

        /**
         * Identify the leafs to be selected, in a query operation
         */
        private BitSet selectLeafFlags = new BitSet();


        @Override
        public short numberOfTp() {
            return numberOfTp;
        }

        @Override
        public OnosYangNodeOperationType onosYangNodeOperationType() {
            return onosYangNodeOperationType;
        }

        @Override
        public List<TerminationPoint> terminationPoint() {
            return terminationPoint;
        }

        @Override
        public TerminationPointsBuilder numberOfTp(short numberOfTp) {
            getValueLeafFlags().set(LeafIdentifier.NUMBEROFTP.getLeafIndex());
            this.numberOfTp = numberOfTp;
            return this;
        }

        @Override
        public TerminationPointsBuilder onosYangNodeOperationType(OnosYangNodeOperationType
            onosYangNodeOperationType) {
            this.onosYangNodeOperationType = onosYangNodeOperationType;
            return this;
        }

        @Override
        public TerminationPointsBuilder terminationPoint(List<TerminationPoint> terminationPoint) {
            this.terminationPoint = terminationPoint;
            return this;
        }

        @Override
        public TerminationPointsBuilder addToTerminationPoint(TerminationPoint value) {
            if (terminationPoint() == null) {
                terminationPoint(new ArrayList<>());
            }
            terminationPoint().add(value);
            return this;
        }

        /**
         * Returns the valueLeafFlags.
         *
         * @return value of valueLeafFlags
         */
        public BitSet getValueLeafFlags() {
            return valueLeafFlags;
        }

        /**
         * Returns the selectLeafFlags.
         *
         * @return value of selectLeafFlags
         */
        public BitSet getSelectLeafFlags() {
            return selectLeafFlags;
        }



        @Override
        public TerminationPointsBuilder selectLeaf(LeafIdentifier leaf) {
            getSelectLeafFlags().set(leaf.getLeafIndex());
            return this;
        }

        @Override
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
        public TerminationPoints build() {
            return new DefaultTerminationPoints(this);
        }

        /**
         * Creates an instance of terminationPointsBuilder.
         */
        public TerminationPointsBuilder() {
        }
    }
}
