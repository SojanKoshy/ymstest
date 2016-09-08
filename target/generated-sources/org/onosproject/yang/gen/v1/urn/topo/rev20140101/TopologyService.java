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

import org.onosproject.event.ListenerService;
import org.onosproject.yang.gen.v1.urn.topo.rev20140101.topology.TopologyEvent;
import org.onosproject.yang.gen.v1.urn.topo.rev20140101.topology.TopologyEventListener;
import org.onosproject.yang.gen.v1.urn.topo.rev20140101.topology.setnodelimit.SetNodeLimitInput;

/**
 * Abstraction of an entity which represents the functionality of topologyService.
 */
public interface TopologyService
        extends ListenerService<TopologyEvent, TopologyEventListener> {

    /**
     * Returns the attribute Topology.
     *
     * @param topology value of Topology
     * @return value of Topology
     */
    Topology getTopology(TopologyOpParam topology);

    /**
     * Sets the value to attribute topology.
     *
     * @param topology value of topology
     */
    void setTopology(TopologyOpParam topology);


    /**
     * Service interface of setNodeLimit.
     *
     * @param inputVar input of service interface setNodeLimit
     */
    void setNodeLimit(SetNodeLimitInput inputVar);
}
