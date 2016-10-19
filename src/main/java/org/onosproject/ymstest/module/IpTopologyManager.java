package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.urn.ip.topo.rev20140101.IpTopologyService;
import org.onosproject.yang.gen.v1.urn.topo.rev20140101.Topology;
import org.onosproject.yang.gen.v1.urn.topo.rev20140101.TopologyOpParam;
import org.onosproject.ymstest.store.TopologyStore;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by root1 on 17/10/16.
 */
public class IpTopologyManager implements IpTopologyService {
    TopologyStore topologyStore = new TopologyStore();
    private Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    /**
     * Returns the attribute yangAugmentedInfoMap.
     *
     * @return yangAugmentedInfoMap value of yangAugmentedInfoMap
     */
    public Map<Class<?>, Object> yangAugmentedInfoMap() {
        return yangAugmentedInfoMap;
    }

    /**
     * Returns the attribute yangAugmentedInfo.
     *
     * @param classObject value of yangAugmentedInfo
     * @return yangAugmentedInfo
     */
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }

    public void addYangAugmentedInfo(Object value, Class classObject) {
        yangAugmentedInfoMap.put(classObject, value);
    }

    /**
     * Returns the attribute topology.
     *
     * @param topology value of topology
     * @return topology
     */
    @Override
    public Topology getAugmentedTopologyNode(TopologyOpParam topology) {
        //
        return topology.processSubtreeFiltering(topologyStore, false);
    }

    /**
     * Sets the value to attribute augmentedTopologyNode.
     *
     * @param augmentedTopologyNode value of augmentedTopologyNode
     */
    @Override
    public void setAugmentedTopologyNode(TopologyOpParam augmentedTopologyNode) {
        topologyStore.processEdit(augmentedTopologyNode);
    }
}
