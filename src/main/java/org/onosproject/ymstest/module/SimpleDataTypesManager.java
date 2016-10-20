package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.SimpleDataTypes;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.SimpleDataTypesOpParam;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.SimpleDataTypesService;

/**
 * Created by sojan on 4/9/16.
 */
public class SimpleDataTypesManager implements SimpleDataTypesService {



    private SimpleDataTypesStore appDataStore = new SimpleDataTypesStore();
    public SimpleDataTypesStore getAppDataStore() {
        return appDataStore;
    }
    @Override
    public SimpleDataTypes getSimpleDataTypes(SimpleDataTypesOpParam simpleDataTypes) {
        return simpleDataTypes.processSubtreeFiltering(appDataStore, false);
    }

    @Override
    public void setSimpleDataTypes(SimpleDataTypesOpParam simpleDataTypes) {
      appDataStore.processEdit(simpleDataTypes);
    }
}
