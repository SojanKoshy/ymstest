package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160914.ModuleIdentifier0;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160914.moduleidentifier0.ContainerIdentifier1;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160914.moduleidentifier0.ListIdentifier1;

import java.util.List;

/**
 * Created by root1 on 14/9/16.
 */
public class ModuleIdentifier0Store implements ModuleIdentifier0 {

    @Override
    public String leafIdentifier1() {
        return null;
    }

    @Override
    public List<String> leafListIdentifier1() {
        return null;
    }

    @Override
    public ContainerIdentifier1 containerIdentifier1() {
        return null;
    }

    @Override
    public List<ListIdentifier1> listIdentifier1() {
        return null;
    }

    @Override
    public ModuleIdentifier0 processSubtreeFiltering(ModuleIdentifier0 moduleIdentifier0,
                                                     boolean isSelectAllSchemaChild) {
        return null;
    }

    @Override
    public boolean isLeafValueSet(LeafIdentifier leaf) {
        return false;
    }

    @Override
    public boolean isSelectLeaf(LeafIdentifier leaf) {
        return false;
    }
}
