package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.http.rob.sh.yang.test.union.rev20140101.Union;
import org.onosproject.yang.gen.v1.http.rob.sh.yang.test.union.rev20140101.UnionOpParam;
import org.onosproject.yang.gen.v1.http.rob.sh.yang.test.union.rev20140101.UnionService;

/**
 * Created by root1 on 25/10/16.
 */
public class UnionManager implements UnionService {
    private UnionStore appStore = new UnionStore();

    public Union getAppStore() {
        return appStore;
    }

    @Override
    public Union getUnion(UnionOpParam moduleIdentifier0) {
        return moduleIdentifier0.processSubtreeFiltering(appStore, false);
    }

    @Override
    public void setUnion(UnionOpParam unionOpParam) {
        try {
            if (unionOpParam.yangUnionOpType() != Union.OnosYangOpType.DELETE) {
                appStore.processEdit(unionOpParam);
            } else {
                appStore = null;
            }
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
