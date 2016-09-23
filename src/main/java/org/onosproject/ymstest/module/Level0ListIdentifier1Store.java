package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.ListIdentifier1;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.listidentifier1.ContainerIdentifier2;
import org.onosproject.yang.gen.v1.module.namespace.uri1.rev20160919.moduleidentifier0.listidentifier1.ListIdentifier2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by root1 on 23/9/16.
 */
public class Level0ListIdentifier1Store implements ListIdentifier1 {


    private List<String> leafListIdentifier2 = new ArrayList<>();

    private int leafIdentifier2;

    private ContainerIdentifier2 containerIdentifier2;

    private List<ListIdentifier2> listIdentifier2 = new ArrayList<>();;

    private Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    public void listIdentifier2(List<ListIdentifier2> listIdentifier2) {
        this.listIdentifier2 = listIdentifier2;
    }

    public void containerIdentifier2(ContainerIdentifier2 containerIdentifier2) {
        this.containerIdentifier2 = containerIdentifier2;
    }

    public void leafListIdentifier2(List<String> leafListIdentifier2) {
        this.leafListIdentifier2 = leafListIdentifier2;
    }

    /**
     * Returns the attribute leafIdentifier2.
     *
     * @return value of leafIdentifier2
     */
    @Override
   public int leafIdentifier2(){
        return leafIdentifier2;
   }

    /**
     * Returns the attribute leafListIdentifier2.
     *
     * @return list of leafListIdentifier2
     */
    @Override
    public List<String> leafListIdentifier2(){
        return  leafListIdentifier2;
    }


    /**
     * Returns the attribute containerIdentifier2.
     *
     * @return value of containerIdentifier2
     */
    @Override
    public ContainerIdentifier2 containerIdentifier2(){
            return  containerIdentifier2;
    }

    /**
     * Returns the attribute listIdentifier2.
     *
     * @return list of listIdentifier2
     */
    @Override
    public List<ListIdentifier2> listIdentifier2(){
            return listIdentifier2;
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
     * Checks if the passed ListIdentifier1 maps the content match query condition.
     *
     * @param listIdentifier1 listIdentifier1 being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    @Override
    public ListIdentifier1 processSubtreeFiltering(ListIdentifier1 listIdentifier1, boolean isSelectAllSchemaChild){
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
        if(new Integer(leafIdentifier2)!=null) {
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
