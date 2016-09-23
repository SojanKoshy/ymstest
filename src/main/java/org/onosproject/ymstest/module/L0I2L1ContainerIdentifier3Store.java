package org.onosproject.ymstest.module;
import  org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.listidentifier1
        .listidentifier2.ContainerIdentifier3;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.listidentifier1.listidentifier2.containeridentifier3.ContainerIdentifier4;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by root1 on 23/9/16.
 */
public class L0I2L1ContainerIdentifier3Store implements ContainerIdentifier3 {

    private BigInteger leafIdentifier4;
    private List<String> leafListIdentifier4;
    private ContainerIdentifier4 containerIdentifier4;
    private Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    /**
     * Returns the attribute leafIdentifier4.
     *
     * @return value of leafIdentifier4
     */
    @Override
    public  BigInteger leafIdentifier4(){
        return leafIdentifier4;
    }

    /**
     * Returns the attribute leafListIdentifier4.
     *
     * @return list of leafListIdentifier4
     */
    @Override
    public  List<String> leafListIdentifier4(){
        return leafListIdentifier4;
    }

    /**
     * Returns the attribute containerIdentifier4.
     *
     * @return value of containerIdentifier4
     */
    @Override
    public ContainerIdentifier4 containerIdentifier4(){
        return containerIdentifier4;
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
     * Checks if the passed ContainerIdentifier3 maps the content match query condition.
     *
     * @param containerIdentifier3 containerIdentifier3 being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    @Override
    public ContainerIdentifier3 processSubtreeFiltering(ContainerIdentifier3 containerIdentifier3, boolean
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
        return (leafIdentifier4()!=null);
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
