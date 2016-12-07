package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.http.example.com.augment1.Augment1;
import org.onosproject.yang.gen.v1.http.example.com.augment1.Augment1OpParam;
import org.onosproject.yang.gen.v1.http.example.com.augment1.Augment1Service;

/**
 * Created by root1 on 13/10/16.
 */
public class Agument1Manager implements Augment1Service {
    private Agument1Store appStore;

    /**
     * Returns the attribute augment1.
     *
     * @param augment1 value of augment1
     * @return augment1
     */
    public Augment1 getAugment1(Augment1OpParam augment1) {
        return augment1.processSubtreeFiltering(appStore, false);
    }

    /**
     * Sets the value to attribute augment1.
     *
     * @param augment1 value of augment1
     */
    public void setAugment1(Augment1OpParam augment1) {
        if (this.appStore == null) {
            this.appStore = new Agument1Store();
        }
        if (augment1.yangAugment1OpType() != Augment1.OnosYangOpType.DELETE) {
            this.appStore.processEdit(augment1);
        } else {
            this.appStore = null;
        }
    }

    /**
     * Returns the attribute augment1.
     *
     * @param augment1 value of augment1
     * @return augment1
     */
    public Augment1 getAugmentedAugment1Interfaces(Augment1OpParam augment1) {
        return augment1.processSubtreeFiltering(appStore, false);
    }

    public Agument1Store getAppStore() {
        return appStore;
    }

    /**
     * Sets the value to attribute augmentedAugment1Interfaces.
     *
     * @param augmentedAugment1Interfaces value of augmentedAugment1Interfaces
     */
    public void setAugmentedAugment1Interfaces(Augment1OpParam augmentedAugment1Interfaces) {
        //noting
    }
}
