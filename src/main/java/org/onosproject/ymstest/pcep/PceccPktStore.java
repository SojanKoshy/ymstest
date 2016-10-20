package org.onosproject.ymstest.pcep;

import org.onosproject.yang.gen.v1.urn.ns.yang.pcep.pcecc.rev20161005.Pcecc;
import org.onosproject.yang.gen.v1.urn.ns.yang.pcep.pcecc.rev20161005.pcecc.PceccPkt;
import org.onosproject.yang.gen.v1.urn.ns.yang.pcep.pcecc.rev20161005.pcecc.pceccmsg.Response;
import org.onosproject.yang.gen.v1.urn.ns.yang.pcep.pcecc.rev20161005.pcecc.pceccpkt.Networklist;
import org.onosproject.yang.gen.v1.urn.ns.yang.pcep.pcecc.rev20161005.pcecc.pceccpkt.Responses;
import org.onosproject.yang.gen.v1.urn.ns.yang.pcep.types.rev20161005.pceptypes.endpoints.AddressFamily;
import org.onosproject.yang.gen.v1.urn.ns.yang.pcep.types.rev20161005.pceptypes.requesttlv.Request;

import java.util.BitSet;
import java.util.List;
import java.util.Map;

/**
 * Created by sojan on 17/10/16.
 */
public class PceccPktStore implements PceccPkt {
    @Override
    public short natureOfIssue() {
        return 0;
    }

    @Override
    public boolean unsatisfiedConstraints() {
        return false;
    }

    @Override
    public boolean ignore() {
        return false;
    }

    @Override
    public BitSet valueLeafFlags() {
        return null;
    }

    @Override
    public Pcecc.OnosYangOpType yangPceccPktOpType() {
        return null;
    }

    @Override
    public BitSet selectLeafFlags() {
        return null;
    }

    @Override
    public Map<Class<?>, Object> yangAugmentedInfoMap() {
        return null;
    }

    @Override
    public Responses responses() {
        return null;
    }

    @Override
    public List<Networklist> networklist() {
        return null;
    }

    @Override
    public Response response() {
        return null;
    }

    @Override
    public Request request() {
        return null;
    }

    @Override
    public AddressFamily addressFamily() {
        return null;
    }

    @Override
    public Object yangAugmentedInfo(Class classObject) {
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
