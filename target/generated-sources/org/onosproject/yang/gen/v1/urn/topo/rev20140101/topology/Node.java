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

package org.onosproject.yang.gen.v1.urn.topo.rev20140101.topology;

import java.util.List;
import java.util.Map;
import org.onosproject.yang.gen.v1.urn.topo.rev20140101.topology.node.TerminationPoints;

/**
 * Abstraction of an entity which represents the functionality of node.
 */
public interface Node {

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
     * Identify the leaf of Node.
     */
    public enum LeafIdentifier {

        /**
         * Represents nodeId.
         */
        NODEID(1);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute nodeId.
     *
     * @return value of nodeId
     */
    String nodeId();

    /**
     * Returns the attribute nodeProp.
     *
     * @return list of nodeProp
     */
    List<String> nodeProp();

    /**
     * Returns the attribute onosYangNodeOperationType.
     *
     * @return value of onosYangNodeOperationType
     */
    OnosYangNodeOperationType onosYangNodeOperationType();

    /**
     * Returns the attribute terminationPoints.
     *
     * @return value of terminationPoints
     */
    TerminationPoints terminationPoints();

    /**
     * Returns the attribute yangAugmentedInfo.
     *
     * @param classObject value of Augmentedclass
     * @return value of YangAugmentedInfo
     */
    Object yangAugmentedInfo(Class classObject);

    /**
     * Returns the attribute yangAugmentedInfoMap.
     *
     * @return value of yangAugmentedInfoMap
     */
    Map<Class<?>, Object> yangAugmentedInfoMap();

    /**
     * Checks if the passed Node maps the content match query condition.
     *
     * @param node node being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    Node processSubtreeFiltering(Node node, boolean isSelectAllSchemaChild);

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
     * Builder for node.
     */
    interface NodeBuilder {


        /**
         * Adds to the list of nodeProp.
         *
         * @param value value of nodeProp
         * @return builder object of nodeProp
         */
        NodeBuilder addToNodeProp(String value);
        /**
         * Returns the attribute nodeId.
         *
         * @return value of nodeId
         */
        String nodeId();

        /**
         * Returns the attribute nodeProp.
         *
         * @return list of nodeProp
         */
        List<String> nodeProp();

        /**
         * Returns the attribute onosYangNodeOperationType.
         *
         * @return value of onosYangNodeOperationType
         */
        OnosYangNodeOperationType onosYangNodeOperationType();

        /**
         * Returns the attribute terminationPoints.
         *
         * @return value of terminationPoints
         */
        TerminationPoints terminationPoints();

        /**
         * Returns the builder object of nodeId.
         *
         * @param nodeId value of nodeId
         * @return builder object of nodeId
         */
        NodeBuilder nodeId(String nodeId);

        /**
         * Returns the builder object of nodeProp.
         *
         * @param nodeProp list of nodeProp
         * @return builder object of nodeProp
         */
        NodeBuilder nodeProp(List<String> nodeProp);

        /**
         * Returns the builder object of onosYangNodeOperationType.
         *
         * @param onosYangNodeOperationType value of onosYangNodeOperationType
         * @return builder object of onosYangNodeOperationType
         */
        NodeBuilder onosYangNodeOperationType(OnosYangNodeOperationType onosYangNodeOperationType);

        /**
         * Returns the builder object of terminationPoints.
         *
         * @param terminationPoints value of terminationPoints
         * @return builder object of terminationPoints
         */
        NodeBuilder terminationPoints(TerminationPoints terminationPoints);


        /**
         * Sets the value of yangAugmentedInfoMap.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of Augmentedclass
         */
        void addYangAugmentedInfo(Object value, Class classObject);

        /**
         * Returns the attribute yangAugmentedInfo.
         *
         * @param classObject value of Augmentedclass
         * @return value of YangAugmentedInfo
         */
        Object yangAugmentedInfo(Class classObject);

        /**
         * Returns the attribute yangAugmentedInfoMap.
         *
         * @return value of yangAugmentedInfoMap
         */
        Map<Class<?>, Object> yangAugmentedInfoMap();

        /**
         * Set a leaf to be selected.
         *
         * @param leaf leaf needs to be selected
         * @return builder object for select leaf
         */
        NodeBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of node.
         *
         * @return object of node.
         */
        Node build();
    }
}
