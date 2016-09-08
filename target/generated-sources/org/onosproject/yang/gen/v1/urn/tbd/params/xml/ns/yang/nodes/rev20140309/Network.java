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

package org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309;

import java.util.List;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.network.NetworkPath;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.network.Networklist;

/**
 * Abstraction of an entity which represents the functionality of network.
 */
public interface Network {

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
     * Identify the leaf of Network.
     */
    public enum LeafIdentifier {

        /**
         * Represents name.
         */
        NAME(1),
        /**
         * Represents surname.
         */
        SURNAME(2),
        /**
         * Represents isHappy.
         */
        ISHAPPY(3);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute name.
     *
     * @return value of name
     */
    String name();

    /**
     * Returns the attribute surname.
     *
     * @return value of surname
     */
    String surname();

    /**
     * Returns the attribute isHappy.
     *
     * @return value of isHappy
     */
    boolean isHappy();

    /**
     * Returns the attribute onosYangNodeOperationType.
     *
     * @return value of onosYangNodeOperationType
     */
    OnosYangNodeOperationType onosYangNodeOperationType();

    /**
     * Returns the attribute networklist.
     *
     * @return list of networklist
     */
    List<Networklist> networklist();

    /**
     * Returns the attribute networkPath.
     *
     * @return value of networkPath
     */
    NetworkPath networkPath();

    /**
     * Checks if the passed Network maps the content match query condition.
     *
     * @param network network being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    Network processSubtreeFiltering(Network network, boolean isSelectAllSchemaChild);

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
}
