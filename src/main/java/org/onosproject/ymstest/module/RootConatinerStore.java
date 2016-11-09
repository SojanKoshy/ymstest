package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.imported.module.importedmodule.DerivedUnionIntDefault;
import org.onosproject.yang.gen.v1.root.module.RootModule;
import org.onosproject.yang.gen.v1.root.module.rootmodule.Container;
import org.onosproject.yang.gen.v1.root.module.rootmodule.DerivedUnionType;
import org.onosproject.yang.gen.v1.root.module.rootmodule.TopLevelUnion;
import org.onosproject.yang.gen.v1.root.module.rootmodule.container.U10Union;
import org.onosproject.yang.gen.v1.root.module.rootmodule.container.U12Union;
import org.onosproject.yang.gen.v1.root.module.rootmodule.container.U1Union;
import org.onosproject.yang.gen.v1.root.module.rootmodule.container.U2Union;
import org.onosproject.yang.gen.v1.root.module.rootmodule.container.U3Union;
import org.onosproject.yang.gen.v1.root.module.rootmodule.container.U4Union;
import org.onosproject.yang.gen.v1.root.module.rootmodule.container.U6Union;
import org.onosproject.yang.gen.v1.root.module.rootmodule.container.U9Union;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by root1 on 9/11/16.
 */
public class RootConatinerStore implements Container {
    protected BitSet valueLeafFlags = new BitSet();
    private U2Union u2;
    private U3Union u3;
    private U4Union u4;
    private DerivedUnionIntDefault u8;
    private U1Union u1;
    private TopLevelUnion u11;
    private U12Union u12;
    private U6Union u6;
    private DerivedUnionType u7;
    private List<U9Union> u9 = new ArrayList<>();
    private List<U10Union> u10 = new ArrayList<>();
    private Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    /**
     * Returns the attribute u2.
     *
     * @return u2 value of u2
     */
    public U2Union u2() {
        return u2;
    }

    /**
     * Returns the attribute u3.
     *
     * @return u3 value of u3
     */
    public U3Union u3() {
        return u3;
    }

    /**
     * Returns the attribute u4.
     *
     * @return u4 value of u4
     */
    public U4Union u4() {
        return u4;
    }

    /**
     * Returns the attribute u8.
     *
     * @return u8 value of u8
     */
    public DerivedUnionIntDefault u8() {
        return u8;
    }

    /**
     * Returns the attribute u1.
     *
     * @return u1 value of u1
     */
    public U1Union u1() {
        return u1;
    }

    /**
     * Returns the attribute u6.
     *
     * @return u6 value of u6
     */
    public U6Union u6() {
        return u6;
    }

    /**
     * Returns the attribute u7.
     *
     * @return u7 value of u7
     */
    public DerivedUnionType u7() {
        return u7;
    }

    /**
     * Returns the attribute u11.
     *
     * @return u11 value of u11
     */
    public TopLevelUnion u11() {
        return u11;
    }

    /**
     * Returns the attribute u12.
     *
     * @return u12 value of u12
     */
    public U12Union u12() {
        return u12;
    }

    /**
     * Returns the attribute u9.
     *
     * @return u9 list of u9
     */
    public List<U9Union> u9() {
        return u9;
    }

    /**
     * Returns the attribute u10.
     *
     * @return u10 list of u10
     */
    public List<U10Union> u10() {
        return u10;
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
     * Returns the attribute yangContainerOpType.
     *
     * @return yangContainerOpType value of yangContainerOpType
     */
    public RootModule.OnosYangOpType yangContainerOpType() {
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
        return (u12() != null);
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

    public void u10(List<U10Union> u10) {
        this.u10 = u10;
    }

    public void u2(U2Union u2) {
        valueLeafFlags.set(Container.LeafIdentifier.U2.getLeafIndex());
        this.u2 = u2;
    }

    public void u3(U3Union u3) {
        valueLeafFlags.set(Container.LeafIdentifier.U3.getLeafIndex());
        this.u3 = u3;
    }

    public void u4(U4Union u4) {
        valueLeafFlags.set(Container.LeafIdentifier.U4.getLeafIndex());
        this.u4 = u4;
    }

    public void u8(DerivedUnionIntDefault u8) {
        valueLeafFlags.set(Container.LeafIdentifier.U8.getLeafIndex());
        this.u8 = u8;
    }

    public void u1(U1Union u1) {
        valueLeafFlags.set(Container.LeafIdentifier.U1.getLeafIndex());
        this.u1 = u1;
    }

    public void u11(TopLevelUnion u11) {
        valueLeafFlags.set(Container.LeafIdentifier.U11.getLeafIndex());
        this.u11 = u11;
    }

    public void u12(U12Union u12) {
        valueLeafFlags.set(Container.LeafIdentifier.U12.getLeafIndex());
        this.u12 = u12;
    }

    public void u6(U6Union u6) {
        valueLeafFlags.set(Container.LeafIdentifier.U6.getLeafIndex());
        this.u6 = u6;
    }

    public void u7(DerivedUnionType u7) {
        valueLeafFlags.set(Container.LeafIdentifier.U7.getLeafIndex());
        this.u7 = u7;
    }

    public void u9(List<U9Union> u9) {
        this.u9 = u9;
    }

    public void processEdit(Container container) {
        processLeafListU9(container, container.yangContainerOpType());
        processLeafListU10(container, container.yangContainerOpType());
        switch (container.yangContainerOpType()) {
            case CREATE: {
                u1(container.u1());
                u2(container.u2());
                u3(container.u3());
                u4(container.u4());
                u6(container.u6());
                u7(container.u7());
                u8(container.u8());


                u11(container.u11());
                u12(container.u12());


                return;
            }
            case DELETE: {
                //do nothing, current stored node will be removed
                return;
            }

            case REPLACE: {
                u1(container.u1());
                u2(container.u2());
                u3(container.u3());
                u4(container.u4());
                u6(container.u6());
                u7(container.u7());
                u8(container.u8());


                u11(container.u11());
                u12(container.u12());
                return;
            }

            case REMOVE: {
                //do nothing, current stored node will be removed
                return;
            }
            case MERGE: {
                return;
            }
            case NONE:
            default: {
                //do nothing, child schema is already processed above
                return;
            }
        }
    }

    private void processLeafListU9(Container container,
                                   RootModule.OnosYangOpType
                                           onosYangNodeOperationType) {
        if (container.u9() == null
                || container.u9().isEmpty()) {
            return;
        }
        for (U9Union u9Union : container.u9()) {
            U9Union storedLeafList = findLeafListU9(u9Union);

            switch (onosYangNodeOperationType) {
                case CREATE: {
                    if (storedLeafList != null) {
                        throw new RuntimeException(
                                "nodeProp: " + u9Union +
                                        " is already created");
                    }
                    addToLeafList(u9Union);
                    continue; //continue with next node prop
                }
                case DELETE: {
                    if (storedLeafList == null) {
                        throw new RuntimeException(
                                "nodeProp: " + u9Union + " is not in "
                                        + "store");
                    }
                    u9().remove(storedLeafList);
                    continue; //continue with next node prop
                }

                case REPLACE: {
                    if (storedLeafList != null) {
                        //node prop is already present do nothing
                        continue; //continue with next node prop
                    }
                    u9().add(u9Union);
                    continue; //continue with next node prop
                }

                case REMOVE: {
                    if (storedLeafList == null) {
                        //node prop is not present do nothing
                        continue; //continue with next node prop
                    }
                    u9().remove(storedLeafList);
                    continue; //continue with next node prop
                }
                case MERGE: {
                    if (storedLeafList == null) {
                        u9().add(u9Union);
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

    private U9Union findLeafListU9(U9Union union1) {
        if (u9().isEmpty()) {
            return null;
        }

        for (U9Union union : u9()) {
            if (union.equals(union1)) {
                return union;
            }
        }
        return null;
    }

    public void addToLeafList(U9Union value) {
        u9().add(value);
    }


    private void processLeafListU10(Container container,
                                    RootModule.OnosYangOpType
                                            onosYangNodeOperationType) {
        if (container.u10() == null
                || container.u10().isEmpty()) {
            return;
        }
        for (U10Union u10Union : container.u10()) {
            U10Union storedLeafList = findLeafListU10(u10Union);

            switch (onosYangNodeOperationType) {
                case CREATE: {
                    if (storedLeafList != null) {
                        throw new RuntimeException(
                                "nodeProp: " + u10Union +
                                        " is already created");
                    }
                    addToLeafList(u10Union);
                    continue; //continue with next node prop
                }
                case DELETE: {
                    if (storedLeafList == null) {
                        throw new RuntimeException(
                                "nodeProp: " + u10Union + " is not in "
                                        + "store");
                    }
                    u10().remove(storedLeafList);
                    continue; //continue with next node prop
                }

                case REPLACE: {
                    if (storedLeafList != null) {
                        //node prop is already present do nothing
                        continue; //continue with next node prop
                    }
                    u10().add(u10Union);
                    continue; //continue with next node prop
                }

                case REMOVE: {
                    if (storedLeafList == null) {
                        //node prop is not present do nothing
                        continue; //continue with next node prop
                    }
                    u10().remove(storedLeafList);
                    continue; //continue with next node prop
                }
                case MERGE: {
                    if (storedLeafList == null) {
                        u10().add(u10Union);
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

    private U10Union findLeafListU10(U10Union union1) {
        if (u10().isEmpty()) {
            return null;
        }

        for (U10Union union : u10()) {
            if (union.equals(union1)) {
                return union;
            }
        }
        return null;
    }

    public void addToLeafList(U10Union value) {
        u10().add(value);
    }
}
