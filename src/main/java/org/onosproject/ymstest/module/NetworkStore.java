package org.onosproject.ymstest.module;


import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.Network;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.network.NetworkPath;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.network.Networklist;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/**
 * Created by v70786 on 26/8/16.
 */
public class NetworkStore
        implements Network {

    protected String name;
    protected String surname;
    protected List<Networklist> networklist = new ArrayList<>();
    protected NetworkPathStore networkPathStore = new NetworkPathStore();
    private BitSet valueLeafFlags = new BitSet();

    @Override
    public BitSet valueLeafFlags() {
        return null;
    }

    @Override
    public BitSet selectLeafFlags() {
        return null;
    }

    @Override
    public String name() {
        return name;
    }

    /**
     * Returns the builder object of name.
     *
     * @param name value of name
     * @return builder object of name
     */
    public void name(String name) {
        getValueLeafFlags().set(Network.LeafIdentifier.NAME.getLeafIndex());
        this.name = name;
        return;
    }

    @Override
    public String surname() {
        return surname;
    }

    @Override
    public boolean isHappy() {
        return false;
    }

    @Override
    public OnosYangOpType yangNetworkOpType() {
        return null;
    }

    /**
     * Returns the builder object of surname.
     *
     * @param surname value of surname
     * @return builder object of surname
     */
    public void surname(String surname) {
        getValueLeafFlags().set(LeafIdentifier.SURNAME.getLeafIndex());
        this.surname = surname;
        return;
    }

    @Override
    public List<Networklist> networklist() {
        return networklist;
    }

    @Override
    public NetworkPath networkPath() {
        return networkPathStore;
    }

    public void addToNetworklist(Networklist value) {
        networklist().add(value);
        return;
    }

    /*@Override
    public Network processSubtreeFiltering(Network network, boolean isSelectAllSchemaChild) {
        return null;
    }
*/
    @Override
    public boolean isLeafValueSet(LeafIdentifier leaf) {
        return getValueLeafFlags().get(leaf.getLeafIndex());
    }

    @Override
    public boolean isSelectLeaf(LeafIdentifier leaf) {
        return false;
    }

    /**
     * Returns the valueLeafFlags.
     *
     * @return value of valueLeafFlags
     */
    public BitSet getValueLeafFlags() {
        return valueLeafFlags;
    }
}
