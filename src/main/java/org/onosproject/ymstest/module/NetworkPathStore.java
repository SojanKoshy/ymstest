package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.network.NetworkPath;

import java.util.Map;

/**
 * Created by sojan on 5/9/16.
 */
public class NetworkPathStore implements NetworkPath {
    @Override
    public String source() {
        return null;
    }

    @Override
    public String destination() {
        return null;
    }

    @Override
    public OnosYangNodeOperationType onosYangNodeOperationType() {
        return null;
    }

    @Override
    public Object yangAugmentedInfo(Class classObject) {
        return null;
    }

    @Override
    public Map<Class<?>, Object> yangAugmentedInfoMap() {
        return null;
    }

    @Override
    public NetworkPath processSubtreeFiltering(NetworkPath networkPath, boolean isSelectAllSchemaChild) {
        return null;
    }

    @Override
    public boolean isLeafValueSet(LeafIdentifier leaf) {
        return false;
    }

    @Override
    public boolean isSelectLeaf(LeafIdentifier leaf) {
        return false;
    }
}
