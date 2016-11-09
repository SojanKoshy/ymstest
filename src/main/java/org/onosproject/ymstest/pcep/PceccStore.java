package org.onosproject.ymstest.pcep;


import org.onosproject.yang.gen.v1.urn.ns.yang.pcep.pcecc.rev20161005.Pcecc;
import org.onosproject.yang.gen.v1.urn.ns.yang.pcep.pcecc.rev20161005.pcecc.IpAddress;
import org.onosproject.yang.gen.v1.urn.ns.yang.pcep.pcecc.rev20161005.pcecc.PceccPkt;

/**
 * Created by sojan on 17/10/16.
 */
public class PceccStore implements Pcecc {

    private PceccPktStore pceccPkt = new PceccPktStore();

    @Override
    public OnosYangOpType yangPceccOpType() {
        return null;
    }

    @Override
    public PceccPkt pceccPkt() {
        return null;
    }

    @Override
    public IpAddress ipAddress() {
        return null;
    }

}
