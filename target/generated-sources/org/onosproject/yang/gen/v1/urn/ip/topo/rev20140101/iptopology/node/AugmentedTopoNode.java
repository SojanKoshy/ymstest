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

/**
 * Abstraction of an entity which represents the functionality of augmentedTopoNode.
 */
public interface AugmentedTopoNode {

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
     * Identify the leaf of AugmentedTopoNode.
     */
    public enum LeafIdentifier {

        /**
         * Represents routerId.
         */
        ROUTERID(1);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute routerId.
     *
     * @return value of routerId
     */
    String routerId();

    /**
     * Returns the attribute onosYangNodeOperationType.
     *
     * @return value of onosYangNodeOperationType
     */
    OnosYangNodeOperationType onosYangNodeOperationType();

    /**
     * Checks if the passed AugmentedTopoNode maps the content match query condition.
     *
     * @param augmentedTopoNode augmentedTopoNode being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    AugmentedTopoNode processSubtreeFiltering(AugmentedTopoNode augmentedTopoNode, boolean isSelectAllSchemaChild);

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
     * Builder for augmentedTopoNode.
     */
    interface AugmentedTopoNodeBuilder {

        /**
         * Returns the attribute routerId.
         *
         * @return value of routerId
         */
        String routerId();

        /**
         * Returns the attribute onosYangNodeOperationType.
         *
         * @return value of onosYangNodeOperationType
         */
        OnosYangNodeOperationType onosYangNodeOperationType();

        /**
         * Returns the builder object of routerId.
         *
         * @param routerId value of routerId
         * @return builder object of routerId
         */
        AugmentedTopoNodeBuilder routerId(String routerId);

        /**
         * Returns the builder object of onosYangNodeOperationType.
         *
         * @param onosYangNodeOperationType value of onosYangNodeOperationType
         * @return builder object of onosYangNodeOperationType
         */
        AugmentedTopoNodeBuilder onosYangNodeOperationType(OnosYangNodeOperationType onosYangNodeOperationType);


        /**
         * Set a leaf to be selected.
         *
         * @param leaf leaf needs to be selected
         * @return builder object for select leaf
         */
        AugmentedTopoNodeBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of augmentedTopoNode.
         *
         * @return object of augmentedTopoNode.
         */
        AugmentedTopoNode build();
    }
}
