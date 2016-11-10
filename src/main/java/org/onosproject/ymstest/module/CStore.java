package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.http.example.com.ns.idref.yangautoprefix1.yangautoprefix0.IdentityRef;
import org.onosproject.yang.gen.v1.http.example.com.ns.idref.yangautoprefix1.yangautoprefix0.identityref.C;
import org.onosproject.yang.gen.v1.http.example.com.ns.idref.yangautoprefix1.yangautoprefix0.identityref.DefaultC;
import org.onosproject.yang.gen.v1.http.example.com.ns.idref.yangautoprefix1.yangautoprefix0.identityref.MyType;
import org.onosproject.yang.gen.v1.http.example.com.ns.idref.yangautoprefix1.yangautoprefix0.identityref.c.ChildContainer;
import org.onosproject.yang.gen.v1.http.example.com.ns.idref.yangautoprefix1.yangautoprefix0.identityref.c.ChildList;
import org.onosproject.yang.gen.v1.http.example.com.ns.idref.yangautoprefix1.yangautoprefix0.identityref.c.DefaultChildList;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by root1 on 10/11/16.
 */
public class CStore implements C {

    protected BitSet valueLeafFlags = new BitSet();
    private MyType refLeaf;
    private List<BigDecimal> lLsit = new ArrayList();
    private Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    private ChildContainer childContainer;
    private List<ChildList> childLists = new ArrayList<>();

    public void refLeaf(MyType refLeaf) {
        valueLeafFlags.set(LeafIdentifier.REFLEAF.getLeafIndex());
        this.refLeaf = refLeaf;
    }

    public void lLsit(List<BigDecimal> lLsit) {
        this.lLsit = lLsit;
    }

    public void childContainer(ChildContainer childContainer) {
        this.childContainer = childContainer;
    }

    public void childLists(List<ChildList> childLists) {
        this.childLists = childLists;
    }

    /**
     * Returns the attribute refLeaf.
     *
     * @return refLeaf value of refLeaf
     */
    public MyType refLeaf() {
        return refLeaf;
    }

    /**
     * Returns the attribute llist.
     *
     * @return llist list of llist
     */
    public List<BigDecimal> llist() {
        return lLsit;
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
     * Returns the attribute yangCOpType.
     *
     * @return yangCOpType value of yangCOpType
     */
    public IdentityRef.OnosYangOpType yangCOpType() {
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
     * Returns the attribute childContainer.
     *
     * @return childContainer value of childContainer
     */
    public ChildContainer childContainer() {
        return childContainer;
    }

    /**
     * Returns the attribute childList.
     *
     * @return childList list of childList
     */
    public List<ChildList> childList() {
        return childLists;
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
        return (refLeaf() != null);
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

    public void processEdit(C container) {
        if (!(container instanceof DefaultC)) {
            //Operations are part of the default Node
            throw new RuntimeException("default Node expected");
        }
        DefaultC containerNode = (DefaultC) container;
        if (containerNode.yangCOpType() == null) {
            throw new RuntimeException("No operation set for Node");
        }

        /*
         * Process the leaf list attributes
         */
        processLeafList(container, containerNode.yangCOpType());


        processList(container);


        switch (containerNode.yangCOpType()) {
            case CREATE: {
                refLeaf(containerNode.refLeaf());
                return;
            }
            case DELETE: {
                //do nothing, current stored node will be removed
                return;
            }

            case REPLACE: {
                refLeaf(container.refLeaf());
                return;
            }

            case REMOVE: {
                //do nothing, current stored node will be removed
                return;
            }
            case MERGE: {
                refLeaf(container.refLeaf());
                return;
            }
            case NONE:
            default: {
                //do nothing, child schema is already processed above
                return;
            }
        }

    }


    private void processLeafList(C conatiner,
                                 IdentityRef.OnosYangOpType
                                         yangCOpType) {
        if (conatiner.llist() == null
                || conatiner.llist().isEmpty()) {
            return;
        }
        for (BigDecimal leafListPara : conatiner.llist()) {
            BigDecimal storedLeafListPara = findLeafListIdentifer4(leafListPara);

            switch (yangCOpType) {
                case CREATE: {
                    if (storedLeafListPara != null) {
                        throw new RuntimeException(
                                "nodeProp: " + leafListPara +
                                        " is already created");
                    }
                    addToLeafList(leafListPara);
                    continue; //continue with next node prop
                }
                case DELETE: {
                    if (storedLeafListPara == null) {
                        throw new RuntimeException(
                                "nodeProp: " + leafListPara + " is not in "
                                        + "store");
                    }
                    llist().remove(storedLeafListPara);
                    continue; //continue with next node prop
                }

                case REPLACE: {
                    if (storedLeafListPara != null) {
                        //node prop is already present do nothing
                        continue; //continue with next node prop
                    }
                    llist().add(leafListPara);
                    continue; //continue with next node prop
                }

                case REMOVE: {
                    if (storedLeafListPara == null) {
                        //node prop is not present do nothing
                        continue; //continue with next node prop
                    }
                    llist().remove(storedLeafListPara);
                    continue; //continue with next node prop
                }
                case MERGE: {
                    if (storedLeafListPara == null) {
                        llist().add(leafListPara);
                        continue; //continue with next node prop
                    }

                    //node prop is already present do nothing
                    continue; //continue with next node prop
                }
                case NONE:
                default: {
                    //nothing to be done
                    continue; //continue with next node prop
                }
            }
        }

    }

    private BigDecimal findLeafListIdentifer4(BigDecimal leafList) {
        if (llist().isEmpty()) {
            return null;
        }

        for (BigDecimal leaflistPara : llist()) {
            if (leaflistPara.equals(leafList)) {
                return leaflistPara;
            }
        }
        return null;
    }

    public void addToLeafList(BigDecimal value) {
        llist().add(value);
    }


    private void processList(C container) {
        if (container.childList() == null || container.childList().isEmpty()) {
            return;
        }
        for (ChildList childList : container.childList()) {
            if (!childList.isLeafValueSet(ChildList.LeafIdentifier.K)
                    && !childList.isLeafValueSet(ChildList.LeafIdentifier.I)
                    && childList.k() == null) {
                childLists.clear();
                return;
            }
            ChildList listInStore = findList(childList);

            if (listInStore != null && !(listInStore instanceof ChildListStore)) {
                //stored node is not correct
                throw new RuntimeException("store Node expected");
            }
            ChildListStore store =
                    (ChildListStore) listInStore;

            if (!(childList instanceof DefaultChildList)) {
                //Operations are part of the default Node
                throw new RuntimeException("default Node expected");
            }
            DefaultChildList opNode = (DefaultChildList) childList;
            if (opNode.yangChildListOpType() == null) {
                throw new RuntimeException("No operation set for Node");
            }
            switch (opNode.yangChildListOpType()) {
                case CREATE: {
                    if (store != null) {
                        throw new RuntimeException(
                                "Node: " + childList.k() + childList.i() + " is already " +
                                        "created");
                    }
                    store = new ChildListStore();
                    childList().add(store);
                    store.processEdit(childList);
                    continue; //continue to process the next input node
                }
                case DELETE: {
                    if (store == null) {
                        throw new RuntimeException(
                                "Node: " + childList.k() + childList.i() + " is not in " +
                                        "store");
                    }
                    store.processEdit(childList);
                    childList().remove(store);
                    continue; //continue to process the next input node
                }

                case REPLACE: {
                    if (store != null) {
                        store.processEdit(childList);
                        continue; //continue to process the next input node
                    }
                    store = new ChildListStore();
                    childList().add(store);
                    store.processEdit(childList);
                    continue; //continue to process the next input node
                }

                case REMOVE: {
                    if (store == null) {
                        continue; //continue to process the next input node
                    }
                    store.processEdit(childList);
                    childList().remove(store);
                    continue; //continue to process the next input node
                }
                case MERGE: {
                    if (store == null) {
                        store = new ChildListStore();
                        childList().add(store);
                        store.processEdit(childList);
                        continue; //continue to process the next input node
                    }
                    store.processEdit(childList);
                    continue; //continue to process the next input node
                }
                case NONE: {
                    if (store == null) {
                        if (childList != null) {
                            store = new ChildListStore();
                            childList().add(store);
                            store.processEdit(childList);
                        }
                        continue; //continue to process the next input node
                    }
                    store.processEdit(childList);
                    continue; //continue to process the next input node
                }
                default:
            }
        }
    }

    private ChildList findList(ChildList findNode) {
        for (ChildList node : childList()) {
//            if (node.nodeId() == null) {
//                continue;
//            }
            if (node.k() == findNode.k() && node.i() == findNode.i()) {
                return node;
            }
        }
        return null;
    }
}
