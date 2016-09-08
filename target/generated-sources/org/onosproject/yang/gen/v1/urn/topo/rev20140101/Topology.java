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

package org.onosproject.yang.gen.v1.urn.topo.rev20140101;

import java.util.List;
import org.onosproject.yang.gen.v1.urn.topo.rev20140101.topology.Node;

/**
 * Abstraction of an entity which represents the functionality of topology.
 */
public interface Topology {

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
     * Returns the attribute onosYangNodeOperationType.
     *
     * @return value of onosYangNodeOperationType
     */
    OnosYangNodeOperationType onosYangNodeOperationType();

    /**
     * Returns the attribute node.
     *
     * @return list of node
     */
    List<Node> node();

    /**
     * Checks if the passed Topology maps the content match query condition.
     *
     * @param topology topology being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    Topology processSubtreeFiltering(Topology topology, boolean isSelectAllSchemaChild);
}
