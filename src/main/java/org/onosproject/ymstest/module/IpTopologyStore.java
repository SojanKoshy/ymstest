package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.urn.ip.topo.rev20140101.IpTopology;

/**
 * Created by root1 on 17/10/16.
 */
public class IpTopologyStore implements IpTopology {


    /**
     * Returns the attribute yangIpTopologyOpType.
     *
     * @return yangIpTopologyOpType value of yangIpTopologyOpType
     */
    @Override
    public OnosYangOpType yangIpTopologyOpType(){
        return null;
    }

    /**
     * Checks if the passed IpTopology maps the content match query condition.
     *
     * @param ipTopology ipTopology being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    @Override
    public IpTopology processSubtreeFiltering(IpTopology ipTopology, boolean isSelectAllSchemaChild){
        return null;
    }

}
