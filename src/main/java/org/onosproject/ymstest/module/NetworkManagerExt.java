package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.Network;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.NetworkOpParam;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.NetworkService;

/**
 * Created by root1 on 6/9/16.
 */
public class NetworkManagerExt implements NetworkService {
    private static Object object;
    NetworkStore appDataStore = new NetworkStore();
    private NetworkOpParam.NetworkBuilder networkBuilder;

    @Override
    public Network getNetwork(NetworkOpParam network) {
        return network.processSubtreeFiltering(appDataStore, false);
    }

    @Override
    public void setNetwork(NetworkOpParam network) {
        networkBuilder = new NetworkOpParam.NetworkBuilder();
        //TODO: Default implementation is for merge, need to implement the code for replace, delete etc

        if (network.valueLeafFlags().get(Network.LeafIdentifier.NAME.getLeafIndex())) {
            networkBuilder.name(network.name());
            appDataStore.name(network.name());
        }

        if (network.valueLeafFlags().get(Network.LeafIdentifier.SURNAME.getLeafIndex())) {
            networkBuilder.surname(network.surname());
            appDataStore.surname(network.surname());
        }
        object = networkBuilder.build();
    }

    public Object getObject() {
        return this.object;
    }
}
