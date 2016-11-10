package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.http.example.com.ns.idref.yangautoprefix1.yangautoprefix0.IdentityRef;
import org.onosproject.yang.gen.v1.http.example.com.ns.idref.yangautoprefix1.yangautoprefix0.IdentityRefOpParam;
import org.onosproject.yang.gen.v1.http.example.com.ns.idref.yangautoprefix1.yangautoprefix0.IdentityRefService;

/**
 * Created by root1 on 10/11/16.
 */
public class IdentityRefManager implements IdentityRefService {

    private IdentityRefStore appStore;
    public IdentityRefStore getAppStore() {
        return appStore;
    }

    /**
     * Returns the attribute identityRef.
     *
     * @param identityRef value of identityRef
     * @return identityRef
     */
    public IdentityRef getIdentityRef(IdentityRefOpParam identityRef) {
        return identityRef.processSubtreeFiltering(appStore, false);
    }

    /**
     * Sets the value to attribute identityRef.
     *
     * @param identityRef value of identityRef
     */
    public void setIdentityRef(IdentityRefOpParam identityRef) {
        try {
            if (appStore == null) {
                appStore = new IdentityRefStore();
            }
            if (identityRef.yangIdentityRefOpType() != IdentityRef.OnosYangOpType.DELETE) {
                appStore.processEdit(identityRef);
            } else {
                appStore = null;
            }
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}

