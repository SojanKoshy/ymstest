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

/**
 * Abstraction of an entity which represents the functionality of augmentedTopoTerminationPoint.
 */
public interface AugmentedTopoTerminationPoint {

    /**
     * Specify the node specific operation in protocols like NETCONF.
     * Applicable in protocol edit operation, not applicable in query operation
     */
    public enum OnosYangNodeOperationType {
        MERGE,
        REPLACE,
        CREATE,
        DELETE,
        REMOVE,
        NONE
    }

    /**
     * Identify the leaf of AugmentedTopoTerminationPoint.
     */
    public enum LeafIdentifier {

        /**
         * Represents ipAddress.
         */
        IPADDRESS(1);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute ipAddress.
     *
     * @return value of ipAddress
     */
    String ipAddress();

    /**
     * Returns the attribute onosYangNodeOperationType.
     *
     * @return value of onosYangNodeOperationType
     */
    OnosYangNodeOperationType onosYangNodeOperationType();

    /**
     * Checks if the passed AugmentedTopoTerminationPoint maps the content match query condition.
     *
     * @param augmentedTopoTerminationPoint augmentedTopoTerminationPoint being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    AugmentedTopoTerminationPoint processSubtreeFiltering(AugmentedTopoTerminationPoint
            augmentedTopoTerminationPoint, boolean isSelectAllSchemaChild);

    /**
     * Checks if the leaf value is set.
     *
     * @param leaf leaf whose value status needs to checked
     * @return result of leaf value set in object
     */
    boolean isLeafValueSet(LeafIdentifier leaf);

    /**
     * Checks if the leaf is set to be a selected leaf.
     *
     * @param leaf if leaf needs to be selected
     * @return result of leaf value set in object
     */
    boolean isSelectLeaf(LeafIdentifier leaf);

    /**
     * Builder for augmentedTopoTerminationPoint.
     */
    interface AugmentedTopoTerminationPointBuilder {

        /**
         * Returns the attribute ipAddress.
         *
         * @return value of ipAddress
         */
        String ipAddress();

        /**
         * Returns the attribute onosYangNodeOperationType.
         *
         * @return value of onosYangNodeOperationType
         */
        OnosYangNodeOperationType onosYangNodeOperationType();

        /**
         * Returns the builder object of ipAddress.
         *
         * @param ipAddress value of ipAddress
         * @return builder object of ipAddress
         */
        AugmentedTopoTerminationPointBuilder ipAddress(String ipAddress);

        /**
         * Returns the builder object of onosYangNodeOperationType.
         *
         * @param onosYangNodeOperationType value of onosYangNodeOperationType
         * @return builder object of onosYangNodeOperationType
         */
        AugmentedTopoTerminationPointBuilder onosYangNodeOperationType(OnosYangNodeOperationType
            onosYangNodeOperationType);


        /**
         * Set a leaf to be selected.
         *
         * @param leaf leaf needs to be selected
         * @return builder object for select leaf
         */
        AugmentedTopoTerminationPointBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of augmentedTopoTerminationPoint.
         *
         * @return object of augmentedTopoTerminationPoint.
         */
        AugmentedTopoTerminationPoint build();
    }
}
