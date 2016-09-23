package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.listidentifier1.ListIdentifier2;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.listidentifier1.listidentifier2.ContainerIdentifier3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by root1 on 23/9/16.
 */
public class L0Identifier1ListIdentifier2Store implements ListIdentifier2 {
    private String leafIdentifier3;
    private List<String> leafListIdentifier3;
    private ContainerIdentifier3 containerIdentifier3;
    private Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    /**
     * Returns the attribute leafIdentifier3.
     *
     * @return value of leafIdentifier3
     */
    @Override
    public String leafIdentifier3(){
            return leafIdentifier3;
    }

    /**
     * Returns the attribute leafListIdentifier3.
     *
     * @return list of leafListIdentifier3
     */
    @Override
    public  List<String> leafListIdentifier3(){
            return leafListIdentifier3;
    }


    /**
     * Returns the attribute containerIdentifier3.
     *
     * @return value of containerIdentifier3
     */
    @Override
    public ContainerIdentifier3 containerIdentifier3(){
        return containerIdentifier3;
    }

    /**
     * Returns the attribute yangAugmentedInfo.
     *
     * @param classObject value of Augmentedclass
     * @return value of YangAugmentedInfo
     */
    @Override
    public Object yangAugmentedInfo(Class classObject){
            return yangAugmentedInfoMap.get(classObject);
    }

    /**
     * Returns the attribute yangAugmentedInfoMap.
     *
     * @return value of yangAugmentedInfoMap
     */
    @Override
    public Map<Class<?>, Object> yangAugmentedInfoMap(){
        return yangAugmentedInfoMap;
    }

    /**
     * Checks if the passed ListIdentifier2 maps the content match query condition.
     *
     * @param listIdentifier2 listIdentifier2 being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    @Override
    public ListIdentifier2 processSubtreeFiltering(ListIdentifier2 listIdentifier2, boolean isSelectAllSchemaChild){
        return null;
    }

    /**
     * Checks if the leaf value is set.
     *
     * @param leaf leaf whose value status needs to checked
     * @return result of leaf value set in object
     */
    @Override
    public boolean isLeafValueSet(LeafIdentifier leaf){
        return (leafIdentifier3()!=null);
    }

    /**
     * Checks if the leaf is set to be a selected leaf.
     *
     * @param leaf if leaf needs to be selected
     * @return result of leaf value set in object
     */
    @Override
    public boolean isSelectLeaf(LeafIdentifier leaf){
        return false;
    }


}
