package org.onosproject.ymstest.manager;

import org.onosproject.event.AbstractListenerManager;
import org.onosproject.yang.gen.v1.urn.topo.rev20140101.Topology;
import org.onosproject.yang.gen.v1.urn.topo.rev20140101.TopologyOpParam;
import org.onosproject.yang.gen.v1.urn.topo.rev20140101.TopologyService;
import org.onosproject.yang.gen.v1.urn.topo.rev20140101.topology.TopologyEvent;
import org.onosproject.yang.gen.v1.urn.topo.rev20140101.topology
        .TopologyEventListener;
import org.onosproject.yang.gen.v1.urn.topo.rev20140101.topology.setnodelimit
        .SetNodeLimitInput;
import org.onosproject.ymstest.store.TopologyStore;

/**
 * Created by v70786 on 30/8/16.
 */
public class TopologyManager
        extends AbstractListenerManager<TopologyEvent, TopologyEventListener>
        implements TopologyService {
        TopologyStore topologyStore = new TopologyStore();

    @Override
    public Topology getTopology(TopologyOpParam topology) {
        return topology.processSubtreeFiltering(topologyStore, false);
    }

    @Override
    public void setTopology(TopologyOpParam topology) {
        topologyStore.processEdit(topology);
    }

    @Override
    public void setNodeLimit(SetNodeLimitInput inputVar) {

    }
}
