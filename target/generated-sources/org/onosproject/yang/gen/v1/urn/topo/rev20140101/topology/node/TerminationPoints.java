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

import java.util.List;
import java.util.Map;
import org.onosproject.yang.gen.v1.urn.topo.rev20140101.topology.node.terminationpoints.TerminationPoint;

/**
 * Abstraction of an entity which represents the functionality of terminationPoints.
 */
public interface TerminationPoints {

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
     * Identify the leaf of TerminationPoints.
     */
    public enum LeafIdentifier {

        /**
         * Represents numberOfTp.
         */
        NUMBEROFTP(1);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute numberOfTp.
     *
     * @return value of numberOfTp
     */
    short numberOfTp();

    /**
     * Returns the attribute onosYangNodeOperationType.
     *
     * @return value of onosYangNodeOperationType
     */
    OnosYangNodeOperationType onosYangNodeOperationType();

    /**
     * Returns the attribute terminationPoint.
     *
     * @return list of terminationPoint
     */
    List<TerminationPoint> terminationPoint();

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
     * Checks if the passed TerminationPoints maps the content match query condition.
     *
     * @param terminationPoints terminationPoints being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    TerminationPoints processSubtreeFiltering(TerminationPoints terminationPoints, boolean isSelectAllSchemaChild);

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
     * Builder for terminationPoints.
     */
    interface TerminationPointsBuilder {


        /**
         * Adds to the list of terminationPoint.
         *
         * @param value value of terminationPoint
         * @return builder object of terminationPoint
         */
        TerminationPointsBuilder addToTerminationPoint(TerminationPoint value);
        /**
         * Returns the attribute numberOfTp.
         *
         * @return value of numberOfTp
         */
        short numberOfTp();

        /**
         * Returns the attribute onosYangNodeOperationType.
         *
         * @return value of onosYangNodeOperationType
         */
        OnosYangNodeOperationType onosYangNodeOperationType();

        /**
         * Returns the attribute terminationPoint.
         *
         * @return list of terminationPoint
         */
        List<TerminationPoint> terminationPoint();

        /**
         * Returns the builder object of numberOfTp.
         *
         * @param numberOfTp value of numberOfTp
         * @return builder object of numberOfTp
         */
        TerminationPointsBuilder numberOfTp(short numberOfTp);

        /**
         * Returns the builder object of onosYangNodeOperationType.
         *
         * @param onosYangNodeOperationType value of onosYangNodeOperationType
         * @return builder object of onosYangNodeOperationType
         */
        TerminationPointsBuilder onosYangNodeOperationType(OnosYangNodeOperationType onosYangNodeOperationType);

        /**
         * Returns the builder object of terminationPoint.
         *
         * @param terminationPoint list of terminationPoint
         * @return builder object of terminationPoint
         */
        TerminationPointsBuilder terminationPoint(List<TerminationPoint> terminationPoint);


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
        TerminationPointsBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of terminationPoints.
         *
         * @return object of terminationPoints.
         */
        TerminationPoints build();
    }
}
