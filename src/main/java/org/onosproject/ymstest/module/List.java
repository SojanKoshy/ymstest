package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.urn.model.exp1.Exp1;

/**
 * Created by root1 on 25/10/16.
 */
public abstract class List {
    private Object listStore;

    public Object containerStore() {
        return listStore;
    }

    public void containerStore(Object containerStore) {
        this.listStore = containerStore;
    }

    public Object processList(Object listObject, Exp1.OnosYangOpType listOpType,
                              Object listStoreTypeObject) throws Exception {
        return null;
    }
}
