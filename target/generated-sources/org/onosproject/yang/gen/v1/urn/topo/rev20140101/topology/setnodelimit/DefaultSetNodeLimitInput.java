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

package org.onosproject.yang.gen.v1.urn.topo.rev20140101.topology.setnodelimit;

import com.google.common.base.MoreObjects;
import java.lang.reflect.InvocationTargetException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Represents the implementation of setNodeLimitInput.
 */
public class DefaultSetNodeLimitInput implements SetNodeLimitInput {

    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected short nodeLimit;
    protected OnosYangNodeOperationType onosYangNodeOperationType;
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
    public short nodeLimit() {
        return nodeLimit;
    }

    @Override
    public OnosYangNodeOperationType onosYangNodeOperationType() {
        return onosYangNodeOperationType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeLimit, onosYangNodeOperationType);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultSetNodeLimitInput) {
            DefaultSetNodeLimitInput other = (DefaultSetNodeLimitInput) obj;
            return
                 Objects.equals(nodeLimit, other.nodeLimit) &&
                 Objects.equals(onosYangNodeOperationType, other.onosYangNodeOperationType);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .add("nodeLimit", nodeLimit)
            .add("onosYangNodeOperationType", onosYangNodeOperationType)
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
     * Creates an instance of setNodeLimitInput.
     *
     * @param builderObject builder object of setNodeLimitInput
     */
    protected DefaultSetNodeLimitInput(SetNodeLimitInputBuilder builderObject) {
        this.nodeLimit = builderObject.nodeLimit();
        this.onosYangNodeOperationType = builderObject.onosYangNodeOperationType();
        this.valueLeafFlags = builderObject.getValueLeafFlags();
        this.selectLeafFlags = builderObject.getSelectLeafFlags();
        this.yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
    }

    @Override
    public SetNodeLimitInput processSubtreeFiltering(SetNodeLimitInput appInstance, boolean isSelectAllSchemaChild) {
        SetNodeLimitInputBuilder subTreeFilteringResultBuilder = new SetNodeLimitInputBuilder();
        Boolean isAnySelectOrContainmentNode = false;
        if (!processLeafSubtreeFiltering(appInstance, subTreeFilteringResultBuilder,
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
    private boolean processLeafSubtreeFiltering(SetNodeLimitInput appInstance, SetNodeLimitInputBuilder
            subTreeFilteringResultBuilder,
            Boolean isAnySelectOrContainmentNode, boolean isSelectAllSchemaChild) {
        if (getValueLeafFlags().get(LeafIdentifier.NODELIMIT.getLeafIndex())) {
            if (appInstance.nodeLimit() != nodeLimit()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.nodeLimit(appInstance.nodeLimit());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.NODELIMIT.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.nodeLimit(appInstance.nodeLimit());
        }

        return true;
    }


    /**
     * Creates an instance of defaultSetNodeLimitInput.
     */
    protected DefaultSetNodeLimitInput() {
    }

    /**
     * Returns the attribute SetNodeLimitInputBuilder.
     *
     * @return value of SetNodeLimitInputBuilder
     */
    public static SetNodeLimitInputBuilder builder() {
        return new SetNodeLimitInputBuilder();
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
     * Represents the builder implementation of setNodeLimitInput.
     */
    public static class SetNodeLimitInputBuilder implements SetNodeLimitInput.SetNodeLimitInputBuilder {

        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected short nodeLimit;
        protected OnosYangNodeOperationType onosYangNodeOperationType;
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
        public short nodeLimit() {
            return nodeLimit;
        }

        @Override
        public OnosYangNodeOperationType onosYangNodeOperationType() {
            return onosYangNodeOperationType;
        }

        @Override
        public SetNodeLimitInputBuilder nodeLimit(short nodeLimit) {
            getValueLeafFlags().set(LeafIdentifier.NODELIMIT.getLeafIndex());
            this.nodeLimit = nodeLimit;
            return this;
        }

        @Override
        public SetNodeLimitInputBuilder onosYangNodeOperationType(OnosYangNodeOperationType
            onosYangNodeOperationType) {
            this.onosYangNodeOperationType = onosYangNodeOperationType;
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
        public SetNodeLimitInputBuilder selectLeaf(LeafIdentifier leaf) {
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
        public SetNodeLimitInput build() {
            return new DefaultSetNodeLimitInput(this);
        }

        /**
         * Creates an instance of setNodeLimitInputBuilder.
         */
        public SetNodeLimitInputBuilder() {
        }
    }
}