package org.onosproject.ymstest.module;

import org.onosproject.event.ListenerRegistry;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.ModuleIdentifier0;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.ModuleIdentifier0OpParam;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.ModuleIdentifier0Service;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.ModuleIdentifier0Event;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.ModuleIdentifier0EventListener;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.rpcidentifier1.RpcIdentifier1Input;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.rpcidentifier1.RpcIdentifier1Output;

/**
 * Created by root1 on 14/9/16.
 */
public class ModuleIdentifier0Manager extends ListenerRegistry<ModuleIdentifier0Event, ModuleIdentifier0EventListener>
        implements ModuleIdentifier0Service {


    private ModuleIdentifier0Store appStore = new ModuleIdentifier0Store();

    public ModuleIdentifier0Store getAppStore() {
        return appStore;
    }

    @Override
    public ModuleIdentifier0 getModuleIdentifier0(ModuleIdentifier0OpParam moduleIdentifier0) {
        return moduleIdentifier0.processSubtreeFiltering(appStore, false);
    }

    @Override
    public void setModuleIdentifier0(ModuleIdentifier0OpParam moduleIdentifier0) {
        if (moduleIdentifier0.yangModuleIdentifier0OpType() != ModuleIdentifier0.OnosYangOpType.DELETE) {
            appStore.processEdit(moduleIdentifier0);
        } else {
            appStore = null;
        }
    }

    @Override
    public RpcIdentifier1Output rpcIdentifier1(RpcIdentifier1Input inputVar) {
        return null;
    }
}
