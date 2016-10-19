package org.onosproject.ymstest.pcep;

import org.onosproject.yang.gen.v1.urn.ns.yang.pcep.pcecc.rev20161005.Pcecc;
import org.onosproject.yang.gen.v1.urn.ns.yang.pcep.pcecc.rev20161005.PceccOpParam;
import org.onosproject.yang.gen.v1.urn.ns.yang.pcep.pcecc.rev20161005.PceccService;

/**
 * Created by sojan on 15/10/16.
 */
public class PceccManager implements PceccService {

    private PceccStore pceccStore = new PceccStore();

    @Override
    public Pcecc getPcecc(PceccOpParam pcecc) {
        return pcecc.processSubtreeFiltering(pceccStore, false);
    }

    @Override
    public void setPcecc(PceccOpParam pcecc) {
        System.out.println(pcecc.toString());
    }
}
