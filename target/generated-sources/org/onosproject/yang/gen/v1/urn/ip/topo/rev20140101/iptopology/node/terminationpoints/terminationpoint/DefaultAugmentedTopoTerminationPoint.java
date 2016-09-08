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

package org.onosproject.yang.gen.v1.urn.ip.topo.rev20140101.iptopology.node.terminationpoints.terminationpoint;

import com.google.common.base.MoreObjects;
import java.util.BitSet;
import java.util.Objects;

/**
 * Represents the implementation of augmentedTopoTerminationPoint.
 */
public class DefaultAugmentedTopoTerminationPoint implements AugmentedTopoTerminationPoint {

    protected String ipAddress;
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
    public String ipAddress() {
        return ipAddress;
    }

    @Override
    public OnosYangNodeOperationType onosYangNodeOperationType() {
        return onosYangNodeOperationType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipAddress, onosYangNodeOperationType);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultAugmentedTopoTerminationPoint) {
            DefaultAugmentedTopoTerminationPoint other = (DefaultAugmentedTopoTerminationPoint) obj;
            return
                 Objects.equals(ipAddress, other.ipAddress) &&
                 Objects.equals(onosYangNodeOperationType, other.onosYangNodeOperationType);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .add("ipAddress", ipAddress)
            .add("onosYangNodeOperationType", onosYangNodeOperationType)
            .toString();
    }

    /**
     * Creates an instance of augmentedTopoTerminationPoint.
     *
     * @param builderObject builder object of augmentedTopoTerminationPoint
     */
    protected DefaultAugmentedTopoTerminationPoint(AugmentedTopoTerminationPointBuilder builderObject) {
        this.ipAddress = builderObject.ipAddress();
        this.onosYangNodeOperationType = builderObject.onosYangNodeOperationType();
        this.valueLeafFlags = builderObject.getValueLeafFlags();
        this.selectLeafFlags = builderObject.getSelectLeafFlags();
    }

    @Override
    public AugmentedTopoTerminationPoint processSubtreeFiltering(AugmentedTopoTerminationPoint appInstance, boolean
            isSelectAllSchemaChild) {
        AugmentedTopoTerminationPointBuilder subTreeFilteringResultBuilder = new
            AugmentedTopoTerminationPointBuilder();
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
    private boolean processLeafSubtreeFiltering(AugmentedTopoTerminationPoint appInstance,
            AugmentedTopoTerminationPointBuilder subTreeFilteringResultBuilder,
            Boolean isAnySelectOrContainmentNode, boolean isSelectAllSchemaChild) {
        if (getValueLeafFlags().get(LeafIdentifier.IPADDRESS.getLeafIndex())) {
            if (appInstance.ipAddress() == null || !(ipAddress().equals(appInstance.ipAddress()))) {
                return false;
            } else {
                subTreeFilteringResultBuilder.ipAddress(appInstance.ipAddress());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.IPADDRESS.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.ipAddress(appInstance.ipAddress());
        }

        return true;
    }


    /**
     * Creates an instance of defaultAugmentedTopoTerminationPoint.
     */
    protected DefaultAugmentedTopoTerminationPoint() {
    }

    /**
     * Returns the attribute AugmentedTopoTerminationPointBuilder.
     *
     * @return value of AugmentedTopoTerminationPointBuilder
     */
    public static AugmentedTopoTerminationPointBuilder builder() {
        return new AugmentedTopoTerminationPointBuilder();
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
     * Represents the builder implementation of augmentedTopoTerminationPoint.
     */
    public static class AugmentedTopoTerminationPointBuilder implements AugmentedTopoTerminationPoint
            .AugmentedTopoTerminationPointBuilder {

        protected String ipAddress;
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
        public String ipAddress() {
            return ipAddress;
        }

        @Override
        public OnosYangNodeOperationType onosYangNodeOperationType() {
            return onosYangNodeOperationType;
        }

        @Override
        public AugmentedTopoTerminationPointBuilder ipAddress(String ipAddress) {
            getValueLeafFlags().set(LeafIdentifier.IPADDRESS.getLeafIndex());
            this.ipAddress = ipAddress;
            return this;
        }

        @Override
        public AugmentedTopoTerminationPointBuilder onosYangNodeOperationType(OnosYangNodeOperationType
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
        public AugmentedTopoTerminationPointBuilder selectLeaf(LeafIdentifier leaf) {
            getSelectLeafFlags().set(leaf.getLeafIndex());
            return this;
        }
        @Override
        public AugmentedTopoTerminationPoint build() {
            return new DefaultAugmentedTopoTerminationPoint(this);
        }

        /**
         * Creates an instance of augmentedTopoTerminationPointBuilder.
         */
        public AugmentedTopoTerminationPointBuilder() {
        }
    }
}
