package org.onosproject.ymstest.module;


import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.Network;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.NetworkOpParam;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.NetworkService;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.network.DefaultNetworklist;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.network.Networklist;

/**
 * Created by v70786 on 26/8/16.
 */
public class NetworkManager
        implements NetworkService {



    NetworkStore appDataStore = new NetworkStore();

    public NetworkStore getAppDataStore() {
        return appDataStore;
    }

    @Override
    public Network getNetwork(NetworkOpParam network) {
        return network.processSubtreeFiltering(appDataStore, false);
    }

    @Override
    public void setNetwork(NetworkOpParam network) {

        //TODO: Default implementation is for merge, need to implement the code for replace, delete etc

        if (network.valueLeafFlags().get(Network.LeafIdentifier.NAME.getLeafIndex())) {
            appDataStore.name(network.name());
        }

        if (network.valueLeafFlags().get(Network.LeafIdentifier.SURNAME.getLeafIndex())) {
            appDataStore.surname(network.surname());
        }

        Networklist.NetworklistBuilder networkListBuilder;
        if (network.networklist() != null && !network.networklist().isEmpty()) {
            for (Networklist networkListElement : network.networklist()) {
                DefaultNetworklist listElement = (DefaultNetworklist) networkListElement;
                networkListBuilder = DefaultNetworklist.builder();
                if (listElement.valueLeafFlags().get(Networklist.LeafIdentifier.NETWORKID.getLeafIndex())) {
                    networkListBuilder.networkId(listElement.networkId());
                }

                if (listElement.valueLeafFlags().get(Networklist.LeafIdentifier.SERVERPROVIDED.getLeafIndex())) {
                    networkListBuilder.serverProvided(listElement.serverProvided());
                }
                appDataStore.addToNetworklist(networkListBuilder.build());
            }
        }
    }
}
