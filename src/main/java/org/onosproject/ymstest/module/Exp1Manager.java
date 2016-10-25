package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.urn.model.exp1.Exp1;
import org.onosproject.yang.gen.v1.urn.model.exp1.Exp1OpParam;
import org.onosproject.yang.gen.v1.urn.model.exp1.Exp1Service;

/**
 * Created by root1 on 21/10/16.
 */
public class Exp1Manager implements Exp1Service {


    private Exp1Store appStore = new Exp1Store();

    public Exp1 getAppStore() {
        return appStore;
    }

    @Override
    public Exp1 getExp1(Exp1OpParam moduleIdentifier0) {
        return moduleIdentifier0.processSubtreeFiltering(appStore, false);
    }

    @Override
    public void setExp1(Exp1OpParam exp1OpParam) {
        try {
            if (exp1OpParam.yangExp1OpType() != Exp1.OnosYangOpType.DELETE) {
                appStore.processEdit(exp1OpParam);
            } else {
                appStore = null;
            }
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

}
