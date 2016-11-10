package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.http.example.com.ns.idref.yangautoprefix1.yangautoprefix0.IdentityRef;
import org.onosproject.yang.gen.v1.http.example.com.ns.idref.yangautoprefix1.yangautoprefix0.identityref.c.ChildList;
import org.onosproject.yang.gen.v1.http.example.com.ns.idref.yangautoprefix1.yangautoprefix0.identityref.c.DefaultChildList;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by root1 on 10/11/16.
 */
public class ChildListStore implements ChildList {

    protected BitSet valueLeafFlags = new BitSet();
    private String k;
    private int i;
    private Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    public void k(String k) {
        valueLeafFlags.set(LeafIdentifier.K.getLeafIndex());
        this.k = k;
    }

    public void i(int i) {
        valueLeafFlags.set(LeafIdentifier.I.getLeafIndex());
        this.i = i;
    }

    /**
     * Returns the attribute k.
     *
     * @return k value of k
     */
    public String k() {
        return k;
    }

    /**
     * Returns the attribute i.
     *
     * @return i value of i
     */
    public int i() {
        return i;
    }

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    public BitSet valueLeafFlags() {
        return null;
    }

    /**
     * Returns the attribute yangChildListOpType.
     *
     * @return yangChildListOpType value of yangChildListOpType
     */
    public IdentityRef.OnosYangOpType yangChildListOpType() {
        return null;
    }

    /**
     * Returns the attribute selectLeafFlags.
     *
     * @return selectLeafFlags value of selectLeafFlags
     */
    public BitSet selectLeafFlags() {
        return null;
    }

    /**
     * Returns the attribute yangAugmentedInfoMap.
     *
     * @return yangAugmentedInfoMap value of yangAugmentedInfoMap
     */
    public Map<Class<?>, Object> yangAugmentedInfoMap() {
        return yangAugmentedInfoMap;
    }


    /**
     * Returns the attribute yangAugmentedInfo.
     *
     * @param classObject value of yangAugmentedInfo
     * @return yangAugmentedInfo
     */
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }

    /**
     * Checks if the leaf value is set.
     *
     * @param leaf leaf whose value status needs to checked
     * @return result of leaf value set in object
     */
    public boolean isLeafValueSet(LeafIdentifier leaf) {
        return (k() != null && new Integer(i()) != null);
    }

    /**
     * Checks if the leaf is set to be a selected leaf.
     *
     * @param leaf if leaf needs to be selected
     * @return result of leaf value set in object
     */
    public boolean isSelectLeaf(LeafIdentifier leaf) {
        return false;
    }

    public void processEdit(ChildList childList) {
        if (!(childList instanceof DefaultChildList)) {
            //Operations are part of the default Node
            throw new RuntimeException("default Node expected");
        }
        DefaultChildList listNode = (DefaultChildList) childList;
        if (listNode.yangChildListOpType() == null) {
            throw new RuntimeException("No operation set for Node");
        }


        switch (listNode.yangChildListOpType()) {
            case CREATE: {
                k(listNode.k());
                i(listNode.i());
                return;
            }
            case DELETE: {
                //do nothing, current stored node will be removed
                return;
            }

            case REPLACE: {
                k(listNode.k());
                i(listNode.i());
                return;
            }

            case REMOVE: {
                //do nothing, current stored node will be removed
                return;
            }
            case MERGE: {
                k(listNode.k());
                i(listNode.i());
                return;
            }
            case NONE:
            default: {
                //do nothing, child schema is already processed above
                return;
            }
        }

    }
}
