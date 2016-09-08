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

package org.onosproject.yang.gen.v1.urn.ip.topo.rev20140101.iptopology.node;

import com.google.common.base.MoreObjects;
import java.util.BitSet;
import java.util.Objects;

/**
 * Represents the implementation of augmentedTopoNode.
 */
public class DefaultAugmentedTopoNode implements AugmentedTopoNode {

    protected String routerId;
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
    public String routerId() {
        return routerId;
    }

    @Override
    public OnosYangNodeOperationType onosYangNodeOperationType() {
        return onosYangNodeOperationType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(routerId, onosYangNodeOperationType);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultAugmentedTopoNode) {
            DefaultAugmentedTopoNode other = (DefaultAugmentedTopoNode) obj;
            return
                 Objects.equals(routerId, other.routerId) &&
                 Objects.equals(onosYangNodeOperationType, other.onosYangNodeOperationType);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .add("routerId", routerId)
            .add("onosYangNodeOperationType", onosYangNodeOperationType)
            .toString();
    }

    /**
     * Creates an instance of augmentedTopoNode.
     *
     * @param builderObject builder object of augmentedTopoNode
     */
    protected DefaultAugmentedTopoNode(AugmentedTopoNodeBuilder builderObject) {
        this.routerId = builderObject.routerId();
        this.onosYangNodeOperationType = builderObject.onosYangNodeOperationType();
        this.valueLeafFlags = builderObject.getValueLeafFlags();
        this.selectLeafFlags = builderObject.getSelectLeafFlags();
    }

    @Override
    public AugmentedTopoNode processSubtreeFiltering(AugmentedTopoNode appInstance, boolean isSelectAllSchemaChild) {
        AugmentedTopoNodeBuilder subTreeFilteringResultBuilder = new AugmentedTopoNodeBuilder();
        Boolean isAnySelectOrContainmentNode = false;
        if (!processLeafSubtreeFiltering(appInstance, subTreeFilteringResultBuilder,
            isAnySelectOrContainmentNode, isSelectAllSchemaChild)) {
            return null;
        }
        if (!isSelectAllSchemaChild && !isAnySelectOrContainmentNode) {
            return processSubtreeFiltering(appInstance, true);
        }
        return subTreeFilteringResultBuilder.build();
    }
    private boolean processLeafSubtreeFiltering(AugmentedTopoNode appInstance, AugmentedTopoNodeBuilder
            subTreeFilteringResultBuilder,
            Boolean isAnySelectOrContainmentNode, boolean isSelectAllSchemaChild) {
        if (getValueLeafFlags().get(LeafIdentifier.ROUTERID.getLeafIndex())) {
            if (appInstance.routerId() == null || !(routerId().equals(appInstance.routerId()))) {
                return false;
            } else {
                subTreeFilteringResultBuilder.routerId(appInstance.routerId());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.ROUTERID.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.routerId(appInstance.routerId());
        }

        return true;
    }


    /**
     * Creates an instance of defaultAugmentedTopoNode.
     */
    protected DefaultAugmentedTopoNode() {
    }

    /**
     * Returns the attribute AugmentedTopoNodeBuilder.
     *
     * @return value of AugmentedTopoNodeBuilder
     */
    public static AugmentedTopoNodeBuilder builder() {
        return new AugmentedTopoNodeBuilder();
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
     * Represents the builder implementation of augmentedTopoNode.
     */
    public static class AugmentedTopoNodeBuilder implements AugmentedTopoNode.AugmentedTopoNodeBuilder {

        protected String routerId;
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
        public String routerId() {
            return routerId;
        }

        @Override
        public OnosYangNodeOperationType onosYangNodeOperationType() {
            return onosYangNodeOperationType;
        }

        @Override
        public AugmentedTopoNodeBuilder routerId(String routerId) {
            getValueLeafFlags().set(LeafIdentifier.ROUTERID.getLeafIndex());
            this.routerId = routerId;
            return this;
        }

        @Override
        public AugmentedTopoNodeBuilder onosYangNodeOperationType(OnosYangNodeOperationType
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
        public AugmentedTopoNodeBuilder selectLeaf(LeafIdentifier leaf) {
            getSelectLeafFlags().set(leaf.getLeafIndex());
            return this;
        }
        @Override
        public AugmentedTopoNode build() {
            return new DefaultAugmentedTopoNode(this);
        }

        /**
         * Creates an instance of augmentedTopoNodeBuilder.
         */
        public AugmentedTopoNodeBuilder() {
        }
    }
}
