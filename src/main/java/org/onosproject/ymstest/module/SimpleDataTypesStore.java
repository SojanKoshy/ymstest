package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.SimpleDataTypes;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.Cont;

/**
 * Created by sojan on 4/9/16.
 */
public class SimpleDataTypesStore implements SimpleDataTypes {
    @Override
    public Cont cont() {
        return null;
    }

    @Override
    public SimpleDataTypes processSubtreeFiltering(SimpleDataTypes simpleDataTypes, boolean isSelectAllSchemaChild) {
        return null;
    }
}
