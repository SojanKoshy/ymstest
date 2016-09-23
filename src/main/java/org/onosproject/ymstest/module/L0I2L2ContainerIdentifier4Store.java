package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.listidentifier1
        .listidentifier2.containeridentifier3.ContainerIdentifier4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by root1 on 23/9/16.
 */
public class L0I2L2ContainerIdentifier4Store implements ContainerIdentifier4{


    private long leafIdentifier5;
    private List<String> leafListIdentifier5;
    private Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    /**
     * Returns the attribute leafIdentifier5.
     *
     * @return value of leafIdentifier5
     */
    @Override
    public long leafIdentifier5(){
            return leafIdentifier5;
    }

    /**
     * Returns the attribute leafListIdentifier5.
     *
     * @return list of leafListIdentifier5
     */
    @Override
    public List<String> leafListIdentifier5(){
            return leafListIdentifier5;
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
     * Checks if the passed ContainerIdentifier4 maps the content match query condition.
     *
     * @param containerIdentifier4 containerIdentifier4 being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    @Override
    public ContainerIdentifier4 processSubtreeFiltering(ContainerIdentifier4 containerIdentifier4, boolean
            isSelectAllSchemaChild){
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
            if(new Long(leafIdentifier5)!=null){
                return true;
            }
        return false;
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