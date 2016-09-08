package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.urn.yms.test.rpc.simple.rev20160826.SimpleRpc;

/**
 * Created by sojan on 4/9/16.
 */
public class SimpleRpcStore implements SimpleRpc {
    @Override
    public OnosYangNodeOperationType onosYangNodeOperationType() {
        return null;
    }

    @Override
    public SimpleRpc processSubtreeFiltering(SimpleRpc simpleRpc, boolean isSelectAllSchemaChild) {
        System.out.println("TODO: processSubtreeFiltering");
        return null;
    }
}
