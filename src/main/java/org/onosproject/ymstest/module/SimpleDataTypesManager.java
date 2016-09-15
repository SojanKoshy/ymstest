package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.SimpleDataTypes;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.SimpleDataTypesOpParam;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.SimpleDataTypesService;

/**
 * Created by sojan on 4/9/16.
 */
public class SimpleDataTypesManager implements SimpleDataTypesService {

    private SimpleDataTypesStore appDataStore = new SimpleDataTypesStore();

    @Override
    public SimpleDataTypes getSimpleDataTypes(SimpleDataTypesOpParam simpleDataTypes) {
        return simpleDataTypes.processSubtreeFiltering(appDataStore, false);
    }

    @Override
    public void setSimpleDataTypes(SimpleDataTypesOpParam simpleDataTypes) {
        System.out.println(simpleDataTypes.cont().lfbool1());
        System.out.println(simpleDataTypes.cont().lfint8Min());
        System.out.println(simpleDataTypes.cont().lfint8Max());
        System.out.println(simpleDataTypes.cont().lfint16Min());
        System.out.println(simpleDataTypes.cont().lfint16Max());
        System.out.println(simpleDataTypes.cont().lfint32Min());
        System.out.println(simpleDataTypes.cont().lfint32Max());
        System.out.println(simpleDataTypes.cont().lfint64Min());
        System.out.println(simpleDataTypes.cont().lfuint8Max());
        System.out.println(simpleDataTypes.cont().lfuint16Max());
        System.out.println(simpleDataTypes.cont().lfuint32Max());
        System.out.println(simpleDataTypes.cont().lfuint64Max());
        System.out.println(simpleDataTypes.cont().lfstr());
        System.out.println(simpleDataTypes.cont().lfstr1());
        System.out.println(simpleDataTypes.cont().lfdecimal1());
        System.out.println(simpleDataTypes.cont().lfempty());
    }
}
