package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.root.module.RootModule;
import org.onosproject.yang.gen.v1.root.module.RootModuleOpParam;
import org.onosproject.yang.gen.v1.root.module.RootModuleService;

/**
 * Created by root1 on 9/11/16.
 */
public class RootModuleManager implements RootModuleService {


    private RootMolduleStore appStore;


    public RootMolduleStore getAppStore() {
        return appStore;
    }

    /**
     * Returns the attribute rootModule.
     *
     * @param rootModule value of rootModule
     * @return rootModule
     */
    public RootModule getRootModule(RootModuleOpParam rootModule) {
        return rootModule.processSubtreeFiltering(appStore, false);
    }

    /**
     * Sets the value to attribute rootModule.
     *
     * @param rootModule value of rootModule
     */
    public void setRootModule(RootModuleOpParam rootModule) {
        try {
            if (appStore == null) {
                appStore = new RootMolduleStore();
            }
            if (rootModule.yangRootModuleOpType() != RootModule.OnosYangOpType.DELETE) {
                appStore.processEdit(rootModule);
            } else {
                appStore = null;
            }
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}

