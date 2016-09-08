package org.onosproject.ymstest.store;

/**
 * Created by v70786 on 3/9/16.
 */
public interface AugmentedOperationProcessor {
    ProcessAugmentedEditOutput processNewAugmentedEdit(Object para);

    ProcessAugmentedEditOutput processAugmentedEdit(Object para);
}
