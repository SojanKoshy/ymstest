package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.urn.yms.test.rpc.simple.rev20160826.SimpleRpc;
import org.onosproject.yang.gen.v1.urn.yms.test.rpc.simple.rev20160826.SimpleRpcOpParam;
import org.onosproject.yang.gen.v1.urn.yms.test.rpc.simple.rev20160826.SimpleRpcService;
import org.onosproject.yang.gen.v1.urn.yms.test.rpc.simple.rev20160826.simplerpc.activatesoftwareimage.ActivateSoftwareImageInput;
import org.onosproject.yang.gen.v1.urn.yms.test.rpc.simple.rev20160826.simplerpc.activatesoftwareimage.ActivateSoftwareImageOutput;

/**
 * Created by sojan on 4/9/16.
 */
public class SimpleRpcManager implements SimpleRpcService {
    SimpleRpcStore appStore = new SimpleRpcStore();

    @Override
    public SimpleRpc getSimpleRpc(SimpleRpcOpParam simpleRpc) {
        return simpleRpc.processSubtreeFiltering(appStore, false);
    }

    @Override
    public void setSimpleRpc(SimpleRpcOpParam simpleRpc) {
        System.out.println("TODO: setSimpleRpc");

    }

    @Override
    public ActivateSoftwareImageOutput activateSoftwareImage(ActivateSoftwareImageInput inputVar) {
        System.out.println(inputVar.imageName());
        return null;
    }
}
