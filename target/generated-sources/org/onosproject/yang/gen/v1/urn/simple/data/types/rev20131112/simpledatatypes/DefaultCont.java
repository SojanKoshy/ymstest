/*
 * Copyright 2016-present Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes;

import com.google.common.base.MoreObjects;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.BitSet;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.LfenumEnum;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.Lfunion10Union;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.Lfunion11Union;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.Lfunion14Union;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.Lfunion1Union;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.Lfunion2Union;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.Lfunion4Union;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.Lfunion5Union;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.Lfunion8Union;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.Lfunion9Union;

/**
 * Represents the implementation of cont.
 */
public class DefaultCont implements Cont {

    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected byte lfint8Min;
    protected byte lfint8Max;
    protected short lfint16Min;
    protected short lfint16Max;
    protected int lfint32Min;
    protected int lfint32Max;
    protected long lfint64Min;
    protected long lfint64Max;
    protected short lfuint8Max;
    protected int lfuint16Max;
    protected long lfuint32Max;
    protected BigInteger lfuint64Max;
    protected String lfstr;
    protected String lfstr1;
    protected boolean lfbool1;
    protected boolean lfbool2;
    protected boolean lfbool3;
    protected BigDecimal lfdecimal1;
    protected BigDecimal lfdecimal2;
    protected BigDecimal lfdecimal3;
    protected BigDecimal lfdecimal4;
    protected BigDecimal lfdecimal6;
    protected LfenumEnum lfenum;
    protected BitSet lfbits;
    protected byte[] lfbinary;
    protected String lfref1;
    protected byte lfref2;
    protected boolean lfempty;
    protected Lfunion1Union lfunion1;
    protected Lfunion2Union lfunion2;
    protected Lfunion4Union lfunion4;
    protected Lfunion5Union lfunion5;
    protected Tpdfun3 lfunion7;
    protected Lfunion8Union lfunion8;
    protected Lfunion9Union lfunion9;
    protected Lfunion10Union lfunion10;
    protected Lfunion11Union lfunion11;
    protected Tpdfun2 lfunion12;
    protected Tpdfbit lfunion13;
    protected Lfunion14Union lfunion14;
    protected Iden identityref1;
    protected OnosYangNodeOperationType onosYangNodeOperationType;
    /**
     * Identify the leafs whose value are explicitly set
     * Applicable in protocol edit and query operation
     */
    private BitSet valueLeafFlags = new BitSet();

    /**
     * Identify the leafs to be selected, in a query operation
     */
    private BitSet selectLeafFlags = new BitSet();

    @Override
    public byte lfint8Min() {
        return lfint8Min;
    }

    @Override
    public byte lfint8Max() {
        return lfint8Max;
    }

    @Override
    public short lfint16Min() {
        return lfint16Min;
    }

    @Override
    public short lfint16Max() {
        return lfint16Max;
    }

    @Override
    public int lfint32Min() {
        return lfint32Min;
    }

    @Override
    public int lfint32Max() {
        return lfint32Max;
    }

    @Override
    public long lfint64Min() {
        return lfint64Min;
    }

    @Override
    public long lfint64Max() {
        return lfint64Max;
    }

    @Override
    public short lfuint8Max() {
        return lfuint8Max;
    }

    @Override
    public int lfuint16Max() {
        return lfuint16Max;
    }

    @Override
    public long lfuint32Max() {
        return lfuint32Max;
    }

    @Override
    public BigInteger lfuint64Max() {
        return lfuint64Max;
    }

    @Override
    public String lfstr() {
        return lfstr;
    }

    @Override
    public String lfstr1() {
        return lfstr1;
    }

    @Override
    public boolean lfbool1() {
        return lfbool1;
    }

    @Override
    public boolean lfbool2() {
        return lfbool2;
    }

    @Override
    public boolean lfbool3() {
        return lfbool3;
    }

    @Override
    public BigDecimal lfdecimal1() {
        return lfdecimal1;
    }

    @Override
    public BigDecimal lfdecimal2() {
        return lfdecimal2;
    }

    @Override
    public BigDecimal lfdecimal3() {
        return lfdecimal3;
    }

    @Override
    public BigDecimal lfdecimal4() {
        return lfdecimal4;
    }

    @Override
    public BigDecimal lfdecimal6() {
        return lfdecimal6;
    }

    @Override
    public LfenumEnum lfenum() {
        return lfenum;
    }

    @Override
    public BitSet lfbits() {
        return lfbits;
    }

    @Override
    public byte[] lfbinary() {
        return lfbinary;
    }

    @Override
    public String lfref1() {
        return lfref1;
    }

    @Override
    public byte lfref2() {
        return lfref2;
    }

    @Override
    public boolean lfempty() {
        return lfempty;
    }

    @Override
    public Lfunion1Union lfunion1() {
        return lfunion1;
    }

    @Override
    public Lfunion2Union lfunion2() {
        return lfunion2;
    }

    @Override
    public Lfunion4Union lfunion4() {
        return lfunion4;
    }

    @Override
    public Lfunion5Union lfunion5() {
        return lfunion5;
    }

    @Override
    public Tpdfun3 lfunion7() {
        return lfunion7;
    }

    @Override
    public Lfunion8Union lfunion8() {
        return lfunion8;
    }

    @Override
    public Lfunion9Union lfunion9() {
        return lfunion9;
    }

    @Override
    public Lfunion10Union lfunion10() {
        return lfunion10;
    }

    @Override
    public Lfunion11Union lfunion11() {
        return lfunion11;
    }

    @Override
    public Tpdfun2 lfunion12() {
        return lfunion12;
    }

    @Override
    public Tpdfbit lfunion13() {
        return lfunion13;
    }

    @Override
    public Lfunion14Union lfunion14() {
        return lfunion14;
    }

    @Override
    public Iden identityref1() {
        return identityref1;
    }

    @Override
    public OnosYangNodeOperationType onosYangNodeOperationType() {
        return onosYangNodeOperationType;
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(lfint8Min, lfint8Max, lfint16Min, lfint16Max, lfint32Min, lfint32Max, lfint64Min, lfint64Max,
            lfuint8Max, lfuint16Max, lfuint32Max, lfuint64Max, lfstr, lfstr1, lfbool1, lfbool2, lfbool3, lfdecimal1,
            lfdecimal2, lfdecimal3, lfdecimal4, lfdecimal6, lfenum, lfbits, lfbinary, lfref1, lfref2, lfempty,
            lfunion1,
            lfunion2, lfunion4, lfunion5, lfunion7, lfunion8, lfunion9, lfunion10, lfunion11, lfunion12, lfunion13,
            lfunion14, identityref1, onosYangNodeOperationType);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultCont) {
            DefaultCont other = (DefaultCont) obj;
            return
                 Objects.equals(lfint8Min, other.lfint8Min) &&
                 Objects.equals(lfint8Max, other.lfint8Max) &&
                 Objects.equals(lfint16Min, other.lfint16Min) &&
                 Objects.equals(lfint16Max, other.lfint16Max) &&
                 Objects.equals(lfint32Min, other.lfint32Min) &&
                 Objects.equals(lfint32Max, other.lfint32Max) &&
                 Objects.equals(lfint64Min, other.lfint64Min) &&
                 Objects.equals(lfint64Max, other.lfint64Max) &&
                 Objects.equals(lfuint8Max, other.lfuint8Max) &&
                 Objects.equals(lfuint16Max, other.lfuint16Max) &&
                 Objects.equals(lfuint32Max, other.lfuint32Max) &&
                 Objects.equals(lfuint64Max, other.lfuint64Max) &&
                 Objects.equals(lfstr, other.lfstr) &&
                 Objects.equals(lfstr1, other.lfstr1) &&
                 Objects.equals(lfbool1, other.lfbool1) &&
                 Objects.equals(lfbool2, other.lfbool2) &&
                 Objects.equals(lfbool3, other.lfbool3) &&
                 Objects.equals(lfdecimal1, other.lfdecimal1) &&
                 Objects.equals(lfdecimal2, other.lfdecimal2) &&
                 Objects.equals(lfdecimal3, other.lfdecimal3) &&
                 Objects.equals(lfdecimal4, other.lfdecimal4) &&
                 Objects.equals(lfdecimal6, other.lfdecimal6) &&
                 Objects.equals(lfenum, other.lfenum) &&
                 Objects.equals(lfbits, other.lfbits) &&
                 Objects.equals(lfbinary, other.lfbinary) &&
                 Objects.equals(lfref1, other.lfref1) &&
                 Objects.equals(lfref2, other.lfref2) &&
                 Objects.equals(lfempty, other.lfempty) &&
                 Objects.equals(lfunion1, other.lfunion1) &&
                 Objects.equals(lfunion2, other.lfunion2) &&
                 Objects.equals(lfunion4, other.lfunion4) &&
                 Objects.equals(lfunion5, other.lfunion5) &&
                 Objects.equals(lfunion7, other.lfunion7) &&
                 Objects.equals(lfunion8, other.lfunion8) &&
                 Objects.equals(lfunion9, other.lfunion9) &&
                 Objects.equals(lfunion10, other.lfunion10) &&
                 Objects.equals(lfunion11, other.lfunion11) &&
                 Objects.equals(lfunion12, other.lfunion12) &&
                 Objects.equals(lfunion13, other.lfunion13) &&
                 Objects.equals(lfunion14, other.lfunion14) &&
                 Objects.equals(identityref1, other.identityref1) &&
                 Objects.equals(onosYangNodeOperationType, other.onosYangNodeOperationType);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .add("lfint8Min", lfint8Min)
            .add("lfint8Max", lfint8Max)
            .add("lfint16Min", lfint16Min)
            .add("lfint16Max", lfint16Max)
            .add("lfint32Min", lfint32Min)
            .add("lfint32Max", lfint32Max)
            .add("lfint64Min", lfint64Min)
            .add("lfint64Max", lfint64Max)
            .add("lfuint8Max", lfuint8Max)
            .add("lfuint16Max", lfuint16Max)
            .add("lfuint32Max", lfuint32Max)
            .add("lfuint64Max", lfuint64Max)
            .add("lfstr", lfstr)
            .add("lfstr1", lfstr1)
            .add("lfbool1", lfbool1)
            .add("lfbool2", lfbool2)
            .add("lfbool3", lfbool3)
            .add("lfdecimal1", lfdecimal1)
            .add("lfdecimal2", lfdecimal2)
            .add("lfdecimal3", lfdecimal3)
            .add("lfdecimal4", lfdecimal4)
            .add("lfdecimal6", lfdecimal6)
            .add("lfenum", lfenum)
            .add("lfbits", lfbits)
            .add("lfbinary", lfbinary)
            .add("lfref1", lfref1)
            .add("lfref2", lfref2)
            .add("lfempty", lfempty)
            .add("lfunion1", lfunion1)
            .add("lfunion2", lfunion2)
            .add("lfunion4", lfunion4)
            .add("lfunion5", lfunion5)
            .add("lfunion7", lfunion7)
            .add("lfunion8", lfunion8)
            .add("lfunion9", lfunion9)
            .add("lfunion10", lfunion10)
            .add("lfunion11", lfunion11)
            .add("lfunion12", lfunion12)
            .add("lfunion13", lfunion13)
            .add("lfunion14", lfunion14)
            .add("identityref1", identityref1)
            .add("onosYangNodeOperationType", onosYangNodeOperationType)
            .toString();
    }

    @Override
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }

    @Override
    public Map<Class<?>, Object> yangAugmentedInfoMap() {
        return yangAugmentedInfoMap;
    }

    /**
     * Creates an instance of cont.
     *
     * @param builderObject builder object of cont
     */
    protected DefaultCont(ContBuilder builderObject) {
        this.lfint8Min = builderObject.lfint8Min();
        this.lfint8Max = builderObject.lfint8Max();
        this.lfint16Min = builderObject.lfint16Min();
        this.lfint16Max = builderObject.lfint16Max();
        this.lfint32Min = builderObject.lfint32Min();
        this.lfint32Max = builderObject.lfint32Max();
        this.lfint64Min = builderObject.lfint64Min();
        this.lfint64Max = builderObject.lfint64Max();
        this.lfuint8Max = builderObject.lfuint8Max();
        this.lfuint16Max = builderObject.lfuint16Max();
        this.lfuint32Max = builderObject.lfuint32Max();
        this.lfuint64Max = builderObject.lfuint64Max();
        this.lfstr = builderObject.lfstr();
        this.lfstr1 = builderObject.lfstr1();
        this.lfbool1 = builderObject.lfbool1();
        this.lfbool2 = builderObject.lfbool2();
        this.lfbool3 = builderObject.lfbool3();
        this.lfdecimal1 = builderObject.lfdecimal1();
        this.lfdecimal2 = builderObject.lfdecimal2();
        this.lfdecimal3 = builderObject.lfdecimal3();
        this.lfdecimal4 = builderObject.lfdecimal4();
        this.lfdecimal6 = builderObject.lfdecimal6();
        this.lfenum = builderObject.lfenum();
        this.lfbits = builderObject.lfbits();
        this.lfbinary = builderObject.lfbinary();
        this.lfref1 = builderObject.lfref1();
        this.lfref2 = builderObject.lfref2();
        this.lfempty = builderObject.lfempty();
        this.lfunion1 = builderObject.lfunion1();
        this.lfunion2 = builderObject.lfunion2();
        this.lfunion4 = builderObject.lfunion4();
        this.lfunion5 = builderObject.lfunion5();
        this.lfunion7 = builderObject.lfunion7();
        this.lfunion8 = builderObject.lfunion8();
        this.lfunion9 = builderObject.lfunion9();
        this.lfunion10 = builderObject.lfunion10();
        this.lfunion11 = builderObject.lfunion11();
        this.lfunion12 = builderObject.lfunion12();
        this.lfunion13 = builderObject.lfunion13();
        this.lfunion14 = builderObject.lfunion14();
        this.identityref1 = builderObject.identityref1();
        this.onosYangNodeOperationType = builderObject.onosYangNodeOperationType();
        this.valueLeafFlags = builderObject.getValueLeafFlags();
        this.selectLeafFlags = builderObject.getSelectLeafFlags();
        this.yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
    }

    @Override
    public Cont processSubtreeFiltering(Cont appInstance, boolean isSelectAllSchemaChild) {
        ContBuilder subTreeFilteringResultBuilder = new ContBuilder();
        Boolean isAnySelectOrContainmentNode = false;
        if (!processLeafSubtreeFiltering(appInstance, subTreeFilteringResultBuilder,
            isAnySelectOrContainmentNode, isSelectAllSchemaChild)) {
            return null;
        }
        if (!processChildNodesSubTreeFiltering(appInstance, subTreeFilteringResultBuilder,
            isAnySelectOrContainmentNode, isSelectAllSchemaChild)) {
            return null;
        }
        for (Object yangAugmentedInfo : this.yangAugmentedInfoMap().values()) {
            Object yangAugmentedOpParamInfo = appInstance.yangAugmentedInfo(yangAugmentedInfo.getClass());
            Object processSubtreeFiltering;
            try {
                Class<?>[] interfaces = yangAugmentedInfo.getClass().getInterfaces();
                processSubtreeFiltering = yangAugmentedInfo.getClass()
                    .getMethod("processSubtreeFiltering", interfaces[0]).invoke(yangAugmentedInfo,
                        yangAugmentedOpParamInfo);
                if (processSubtreeFiltering != null) {
                    subTreeFilteringResultBuilder
            .addYangAugmentedInfo(processSubtreeFiltering, processSubtreeFiltering.getClass());
                }
            } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                continue;
            }
        }
        if (!isSelectAllSchemaChild && !isAnySelectOrContainmentNode) {
            return processSubtreeFiltering(appInstance, true);
        }
        return subTreeFilteringResultBuilder.build();
    }
    private boolean processLeafSubtreeFiltering(Cont appInstance, ContBuilder subTreeFilteringResultBuilder,
            Boolean isAnySelectOrContainmentNode, boolean isSelectAllSchemaChild) {
        if (getValueLeafFlags().get(LeafIdentifier.LFINT8MIN.getLeafIndex())) {
            if (appInstance.lfint8Min() != lfint8Min()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfint8Min(appInstance.lfint8Min());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFINT8MIN.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfint8Min(appInstance.lfint8Min());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFINT8MAX.getLeafIndex())) {
            if (appInstance.lfint8Max() != lfint8Max()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfint8Max(appInstance.lfint8Max());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFINT8MAX.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfint8Max(appInstance.lfint8Max());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFINT16MIN.getLeafIndex())) {
            if (appInstance.lfint16Min() != lfint16Min()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfint16Min(appInstance.lfint16Min());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFINT16MIN.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfint16Min(appInstance.lfint16Min());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFINT16MAX.getLeafIndex())) {
            if (appInstance.lfint16Max() != lfint16Max()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfint16Max(appInstance.lfint16Max());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFINT16MAX.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfint16Max(appInstance.lfint16Max());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFINT32MIN.getLeafIndex())) {
            if (appInstance.lfint32Min() != lfint32Min()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfint32Min(appInstance.lfint32Min());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFINT32MIN.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfint32Min(appInstance.lfint32Min());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFINT32MAX.getLeafIndex())) {
            if (appInstance.lfint32Max() != lfint32Max()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfint32Max(appInstance.lfint32Max());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFINT32MAX.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfint32Max(appInstance.lfint32Max());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFINT64MIN.getLeafIndex())) {
            if (appInstance.lfint64Min() != lfint64Min()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfint64Min(appInstance.lfint64Min());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFINT64MIN.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfint64Min(appInstance.lfint64Min());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFINT64MAX.getLeafIndex())) {
            if (appInstance.lfint64Max() != lfint64Max()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfint64Max(appInstance.lfint64Max());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFINT64MAX.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfint64Max(appInstance.lfint64Max());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFUINT8MAX.getLeafIndex())) {
            if (appInstance.lfuint8Max() != lfuint8Max()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfuint8Max(appInstance.lfuint8Max());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFUINT8MAX.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfuint8Max(appInstance.lfuint8Max());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFUINT16MAX.getLeafIndex())) {
            if (appInstance.lfuint16Max() != lfuint16Max()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfuint16Max(appInstance.lfuint16Max());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFUINT16MAX.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfuint16Max(appInstance.lfuint16Max());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFUINT32MAX.getLeafIndex())) {
            if (appInstance.lfuint32Max() != lfuint32Max()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfuint32Max(appInstance.lfuint32Max());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFUINT32MAX.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfuint32Max(appInstance.lfuint32Max());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFUINT64MAX.getLeafIndex())) {
            if (appInstance.lfuint64Max() != lfuint64Max()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfuint64Max(appInstance.lfuint64Max());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFUINT64MAX.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfuint64Max(appInstance.lfuint64Max());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFSTR.getLeafIndex())) {
            if (appInstance.lfstr() == null || !(lfstr().equals(appInstance.lfstr()))) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfstr(appInstance.lfstr());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFSTR.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfstr(appInstance.lfstr());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFSTR1.getLeafIndex())) {
            if (appInstance.lfstr1() == null || !(lfstr1().equals(appInstance.lfstr1()))) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfstr1(appInstance.lfstr1());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFSTR1.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfstr1(appInstance.lfstr1());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFBOOL1.getLeafIndex())) {
            if (appInstance.lfbool1() != lfbool1()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfbool1(appInstance.lfbool1());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFBOOL1.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfbool1(appInstance.lfbool1());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFBOOL2.getLeafIndex())) {
            if (appInstance.lfbool2() != lfbool2()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfbool2(appInstance.lfbool2());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFBOOL2.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfbool2(appInstance.lfbool2());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFBOOL3.getLeafIndex())) {
            if (appInstance.lfbool3() != lfbool3()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfbool3(appInstance.lfbool3());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFBOOL3.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfbool3(appInstance.lfbool3());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFDECIMAL1.getLeafIndex())) {
            if (appInstance.lfdecimal1() != lfdecimal1()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfdecimal1(appInstance.lfdecimal1());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFDECIMAL1.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfdecimal1(appInstance.lfdecimal1());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFDECIMAL2.getLeafIndex())) {
            if (appInstance.lfdecimal2() != lfdecimal2()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfdecimal2(appInstance.lfdecimal2());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFDECIMAL2.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfdecimal2(appInstance.lfdecimal2());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFDECIMAL3.getLeafIndex())) {
            if (appInstance.lfdecimal3() != lfdecimal3()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfdecimal3(appInstance.lfdecimal3());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFDECIMAL3.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfdecimal3(appInstance.lfdecimal3());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFDECIMAL4.getLeafIndex())) {
            if (appInstance.lfdecimal4() != lfdecimal4()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfdecimal4(appInstance.lfdecimal4());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFDECIMAL4.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfdecimal4(appInstance.lfdecimal4());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFDECIMAL6.getLeafIndex())) {
            if (appInstance.lfdecimal6() != lfdecimal6()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfdecimal6(appInstance.lfdecimal6());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFDECIMAL6.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfdecimal6(appInstance.lfdecimal6());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFENUM.getLeafIndex())) {
            if (appInstance.lfenum() == null || !(lfenum().equals(appInstance.lfenum()))) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfenum(appInstance.lfenum());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFENUM.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfenum(appInstance.lfenum());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFBITS.getLeafIndex())) {
            if (appInstance.lfbits() == null || !(lfbits().equals(appInstance.lfbits()))) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfbits(appInstance.lfbits());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFBITS.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfbits(appInstance.lfbits());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFBINARY.getLeafIndex())) {
            if (appInstance.lfbinary() == null || !(lfbinary().equals(appInstance.lfbinary()))) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfbinary(appInstance.lfbinary());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFBINARY.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfbinary(appInstance.lfbinary());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFREF1.getLeafIndex())) {
            if (appInstance.lfref1() == null || !(lfref1().equals(appInstance.lfref1()))) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfref1(appInstance.lfref1());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFREF1.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfref1(appInstance.lfref1());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFREF2.getLeafIndex())) {
            if (appInstance.lfref2() != lfref2()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfref2(appInstance.lfref2());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFREF2.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfref2(appInstance.lfref2());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFEMPTY.getLeafIndex())) {
            if (appInstance.lfempty() != lfempty()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfempty(appInstance.lfempty());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFEMPTY.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfempty(appInstance.lfempty());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFUNION1.getLeafIndex())) {
            if (appInstance.lfunion1() == null || !(lfunion1().equals(appInstance.lfunion1()))) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfunion1(appInstance.lfunion1());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFUNION1.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfunion1(appInstance.lfunion1());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFUNION2.getLeafIndex())) {
            if (appInstance.lfunion2() == null || !(lfunion2().equals(appInstance.lfunion2()))) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfunion2(appInstance.lfunion2());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFUNION2.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfunion2(appInstance.lfunion2());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFUNION4.getLeafIndex())) {
            if (appInstance.lfunion4() == null || !(lfunion4().equals(appInstance.lfunion4()))) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfunion4(appInstance.lfunion4());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFUNION4.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfunion4(appInstance.lfunion4());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFUNION5.getLeafIndex())) {
            if (appInstance.lfunion5() == null || !(lfunion5().equals(appInstance.lfunion5()))) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfunion5(appInstance.lfunion5());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFUNION5.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfunion5(appInstance.lfunion5());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFUNION7.getLeafIndex())) {
            if (appInstance.lfunion7() == null || !(lfunion7().equals(appInstance.lfunion7()))) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfunion7(appInstance.lfunion7());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFUNION7.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfunion7(appInstance.lfunion7());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFUNION8.getLeafIndex())) {
            if (appInstance.lfunion8() == null || !(lfunion8().equals(appInstance.lfunion8()))) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfunion8(appInstance.lfunion8());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFUNION8.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfunion8(appInstance.lfunion8());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFUNION9.getLeafIndex())) {
            if (appInstance.lfunion9() == null || !(lfunion9().equals(appInstance.lfunion9()))) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfunion9(appInstance.lfunion9());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFUNION9.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfunion9(appInstance.lfunion9());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFUNION10.getLeafIndex())) {
            if (appInstance.lfunion10() == null || !(lfunion10().equals(appInstance.lfunion10()))) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfunion10(appInstance.lfunion10());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFUNION10.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfunion10(appInstance.lfunion10());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFUNION11.getLeafIndex())) {
            if (appInstance.lfunion11() == null || !(lfunion11().equals(appInstance.lfunion11()))) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfunion11(appInstance.lfunion11());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFUNION11.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfunion11(appInstance.lfunion11());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFUNION12.getLeafIndex())) {
            if (appInstance.lfunion12() == null || !(lfunion12().equals(appInstance.lfunion12()))) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfunion12(appInstance.lfunion12());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFUNION12.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfunion12(appInstance.lfunion12());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFUNION13.getLeafIndex())) {
            if (appInstance.lfunion13() == null || !(lfunion13().equals(appInstance.lfunion13()))) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfunion13(appInstance.lfunion13());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFUNION13.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfunion13(appInstance.lfunion13());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFUNION14.getLeafIndex())) {
            if (appInstance.lfunion14() == null || !(lfunion14().equals(appInstance.lfunion14()))) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfunion14(appInstance.lfunion14());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFUNION14.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfunion14(appInstance.lfunion14());
        }

        if (getValueLeafFlags().get(LeafIdentifier.IDENTITYREF1.getLeafIndex())) {
            if (appInstance.identityref1() == null || !(identityref1().equals(appInstance.identityref1()))) {
                return false;
            } else {
                subTreeFilteringResultBuilder.identityref1(appInstance.identityref1());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.IDENTITYREF1.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.identityref1(appInstance.identityref1());
        }

        return true;
    }

    private boolean processChildNodesSubTreeFiltering(Cont appInstance, ContBuilder subTreeFilteringResultBuilder,
            Boolean isAnySelectOrContainmentNode, boolean isSelectAllSchemaChild) {
        return true;
    }


    /**
     * Creates an instance of defaultCont.
     */
    protected DefaultCont() {
    }

    /**
     * Returns the attribute ContBuilder.
     *
     * @return value of ContBuilder
     */
    public static ContBuilder builder() {
        return new ContBuilder();
    }

    /**
     * Returns the valueLeafFlags.
     *
     * @return value of valueLeafFlags
     */
    public BitSet getValueLeafFlags() {
        return valueLeafFlags;
    }

    /**
     * Returns the selectLeafFlags.
     *
     * @return value of selectLeafFlags
     */
    public BitSet getSelectLeafFlags() {
        return selectLeafFlags;
    }


    @Override
    public boolean isLeafValueSet(LeafIdentifier leaf) {
        return getValueLeafFlags().get(leaf.getLeafIndex());
    }

    @Override
    public boolean isSelectLeaf(LeafIdentifier leaf) {
        return getSelectLeafFlags().get(leaf.getLeafIndex());
    }


    /**
     * Represents the builder implementation of cont.
     */
    public static class ContBuilder implements Cont.ContBuilder {

        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected byte lfint8Min;
        protected byte lfint8Max;
        protected short lfint16Min;
        protected short lfint16Max;
        protected int lfint32Min;
        protected int lfint32Max;
        protected long lfint64Min;
        protected long lfint64Max;
        protected short lfuint8Max;
        protected int lfuint16Max;
        protected long lfuint32Max;
        protected BigInteger lfuint64Max;
        protected String lfstr;
        protected String lfstr1;
        protected boolean lfbool1;
        protected boolean lfbool2;
        protected boolean lfbool3;
        protected BigDecimal lfdecimal1;
        protected BigDecimal lfdecimal2;
        protected BigDecimal lfdecimal3;
        protected BigDecimal lfdecimal4;
        protected BigDecimal lfdecimal6;
        protected LfenumEnum lfenum;
        protected BitSet lfbits;
        protected byte[] lfbinary;
        protected String lfref1;
        protected byte lfref2;
        protected boolean lfempty;
        protected Lfunion1Union lfunion1;
        protected Lfunion2Union lfunion2;
        protected Lfunion4Union lfunion4;
        protected Lfunion5Union lfunion5;
        protected Tpdfun3 lfunion7;
        protected Lfunion8Union lfunion8;
        protected Lfunion9Union lfunion9;
        protected Lfunion10Union lfunion10;
        protected Lfunion11Union lfunion11;
        protected Tpdfun2 lfunion12;
        protected Tpdfbit lfunion13;
        protected Lfunion14Union lfunion14;
        protected Iden identityref1;
        protected OnosYangNodeOperationType onosYangNodeOperationType;
        /**
         * Identify the leafs whose value are explicitly set
         * Applicable in protocol edit and query operation
         */
        private BitSet valueLeafFlags = new BitSet();

        /**
         * Identify the leafs to be selected, in a query operation
         */
        private BitSet selectLeafFlags = new BitSet();


        @Override
        public byte lfint8Min() {
            return lfint8Min;
        }

        @Override
        public byte lfint8Max() {
            return lfint8Max;
        }

        @Override
        public short lfint16Min() {
            return lfint16Min;
        }

        @Override
        public short lfint16Max() {
            return lfint16Max;
        }

        @Override
        public int lfint32Min() {
            return lfint32Min;
        }

        @Override
        public int lfint32Max() {
            return lfint32Max;
        }

        @Override
        public long lfint64Min() {
            return lfint64Min;
        }

        @Override
        public long lfint64Max() {
            return lfint64Max;
        }

        @Override
        public short lfuint8Max() {
            return lfuint8Max;
        }

        @Override
        public int lfuint16Max() {
            return lfuint16Max;
        }

        @Override
        public long lfuint32Max() {
            return lfuint32Max;
        }

        @Override
        public BigInteger lfuint64Max() {
            return lfuint64Max;
        }

        @Override
        public String lfstr() {
            return lfstr;
        }

        @Override
        public String lfstr1() {
            return lfstr1;
        }

        @Override
        public boolean lfbool1() {
            return lfbool1;
        }

        @Override
        public boolean lfbool2() {
            return lfbool2;
        }

        @Override
        public boolean lfbool3() {
            return lfbool3;
        }

        @Override
        public BigDecimal lfdecimal1() {
            return lfdecimal1;
        }

        @Override
        public BigDecimal lfdecimal2() {
            return lfdecimal2;
        }

        @Override
        public BigDecimal lfdecimal3() {
            return lfdecimal3;
        }

        @Override
        public BigDecimal lfdecimal4() {
            return lfdecimal4;
        }

        @Override
        public BigDecimal lfdecimal6() {
            return lfdecimal6;
        }

        @Override
        public LfenumEnum lfenum() {
            return lfenum;
        }

        @Override
        public BitSet lfbits() {
            return lfbits;
        }

        @Override
        public byte[] lfbinary() {
            return lfbinary;
        }

        @Override
        public String lfref1() {
            return lfref1;
        }

        @Override
        public byte lfref2() {
            return lfref2;
        }

        @Override
        public boolean lfempty() {
            return lfempty;
        }

        @Override
        public Lfunion1Union lfunion1() {
            return lfunion1;
        }

        @Override
        public Lfunion2Union lfunion2() {
            return lfunion2;
        }

        @Override
        public Lfunion4Union lfunion4() {
            return lfunion4;
        }

        @Override
        public Lfunion5Union lfunion5() {
            return lfunion5;
        }

        @Override
        public Tpdfun3 lfunion7() {
            return lfunion7;
        }

        @Override
        public Lfunion8Union lfunion8() {
            return lfunion8;
        }

        @Override
        public Lfunion9Union lfunion9() {
            return lfunion9;
        }

        @Override
        public Lfunion10Union lfunion10() {
            return lfunion10;
        }

        @Override
        public Lfunion11Union lfunion11() {
            return lfunion11;
        }

        @Override
        public Tpdfun2 lfunion12() {
            return lfunion12;
        }

        @Override
        public Tpdfbit lfunion13() {
            return lfunion13;
        }

        @Override
        public Lfunion14Union lfunion14() {
            return lfunion14;
        }

        @Override
        public Iden identityref1() {
            return identityref1;
        }

        @Override
        public OnosYangNodeOperationType onosYangNodeOperationType() {
            return onosYangNodeOperationType;
        }

        @Override
        public ContBuilder lfint8Min(byte lfint8Min) {
            getValueLeafFlags().set(LeafIdentifier.LFINT8MIN.getLeafIndex());
            this.lfint8Min = lfint8Min;
            return this;
        }

        @Override
        public ContBuilder lfint8Max(byte lfint8Max) {
            getValueLeafFlags().set(LeafIdentifier.LFINT8MAX.getLeafIndex());
            this.lfint8Max = lfint8Max;
            return this;
        }

        @Override
        public ContBuilder lfint16Min(short lfint16Min) {
            getValueLeafFlags().set(LeafIdentifier.LFINT16MIN.getLeafIndex());
            this.lfint16Min = lfint16Min;
            return this;
        }

        @Override
        public ContBuilder lfint16Max(short lfint16Max) {
            getValueLeafFlags().set(LeafIdentifier.LFINT16MAX.getLeafIndex());
            this.lfint16Max = lfint16Max;
            return this;
        }

        @Override
        public ContBuilder lfint32Min(int lfint32Min) {
            getValueLeafFlags().set(LeafIdentifier.LFINT32MIN.getLeafIndex());
            this.lfint32Min = lfint32Min;
            return this;
        }

        @Override
        public ContBuilder lfint32Max(int lfint32Max) {
            getValueLeafFlags().set(LeafIdentifier.LFINT32MAX.getLeafIndex());
            this.lfint32Max = lfint32Max;
            return this;
        }

        @Override
        public ContBuilder lfint64Min(long lfint64Min) {
            getValueLeafFlags().set(LeafIdentifier.LFINT64MIN.getLeafIndex());
            this.lfint64Min = lfint64Min;
            return this;
        }

        @Override
        public ContBuilder lfint64Max(long lfint64Max) {
            getValueLeafFlags().set(LeafIdentifier.LFINT64MAX.getLeafIndex());
            this.lfint64Max = lfint64Max;
            return this;
        }

        @Override
        public ContBuilder lfuint8Max(short lfuint8Max) {
            getValueLeafFlags().set(LeafIdentifier.LFUINT8MAX.getLeafIndex());
            this.lfuint8Max = lfuint8Max;
            return this;
        }

        @Override
        public ContBuilder lfuint16Max(int lfuint16Max) {
            getValueLeafFlags().set(LeafIdentifier.LFUINT16MAX.getLeafIndex());
            this.lfuint16Max = lfuint16Max;
            return this;
        }

        @Override
        public ContBuilder lfuint32Max(long lfuint32Max) {
            getValueLeafFlags().set(LeafIdentifier.LFUINT32MAX.getLeafIndex());
            this.lfuint32Max = lfuint32Max;
            return this;
        }

        @Override
        public ContBuilder lfuint64Max(BigInteger lfuint64Max) {
            getValueLeafFlags().set(LeafIdentifier.LFUINT64MAX.getLeafIndex());
            this.lfuint64Max = lfuint64Max;
            return this;
        }

        @Override
        public ContBuilder lfstr(String lfstr) {
            getValueLeafFlags().set(LeafIdentifier.LFSTR.getLeafIndex());
            this.lfstr = lfstr;
            return this;
        }

        @Override
        public ContBuilder lfstr1(String lfstr1) {
            getValueLeafFlags().set(LeafIdentifier.LFSTR1.getLeafIndex());
            this.lfstr1 = lfstr1;
            return this;
        }

        @Override
        public ContBuilder lfbool1(boolean lfbool1) {
            getValueLeafFlags().set(LeafIdentifier.LFBOOL1.getLeafIndex());
            this.lfbool1 = lfbool1;
            return this;
        }

        @Override
        public ContBuilder lfbool2(boolean lfbool2) {
            getValueLeafFlags().set(LeafIdentifier.LFBOOL2.getLeafIndex());
            this.lfbool2 = lfbool2;
            return this;
        }

        @Override
        public ContBuilder lfbool3(boolean lfbool3) {
            getValueLeafFlags().set(LeafIdentifier.LFBOOL3.getLeafIndex());
            this.lfbool3 = lfbool3;
            return this;
        }

        @Override
        public ContBuilder lfdecimal1(BigDecimal lfdecimal1) {
            getValueLeafFlags().set(LeafIdentifier.LFDECIMAL1.getLeafIndex());
            this.lfdecimal1 = lfdecimal1;
            return this;
        }

        @Override
        public ContBuilder lfdecimal2(BigDecimal lfdecimal2) {
            getValueLeafFlags().set(LeafIdentifier.LFDECIMAL2.getLeafIndex());
            this.lfdecimal2 = lfdecimal2;
            return this;
        }

        @Override
        public ContBuilder lfdecimal3(BigDecimal lfdecimal3) {
            getValueLeafFlags().set(LeafIdentifier.LFDECIMAL3.getLeafIndex());
            this.lfdecimal3 = lfdecimal3;
            return this;
        }

        @Override
        public ContBuilder lfdecimal4(BigDecimal lfdecimal4) {
            getValueLeafFlags().set(LeafIdentifier.LFDECIMAL4.getLeafIndex());
            this.lfdecimal4 = lfdecimal4;
            return this;
        }

        @Override
        public ContBuilder lfdecimal6(BigDecimal lfdecimal6) {
            getValueLeafFlags().set(LeafIdentifier.LFDECIMAL6.getLeafIndex());
            this.lfdecimal6 = lfdecimal6;
            return this;
        }

        @Override
        public ContBuilder lfenum(LfenumEnum lfenum) {
            getValueLeafFlags().set(LeafIdentifier.LFENUM.getLeafIndex());
            this.lfenum = lfenum;
            return this;
        }

        @Override
        public ContBuilder lfbits(BitSet lfbits) {
            getValueLeafFlags().set(LeafIdentifier.LFBITS.getLeafIndex());
            this.lfbits = lfbits;
            return this;
        }

        @Override
        public ContBuilder lfbinary(byte[] lfbinary) {
            getValueLeafFlags().set(LeafIdentifier.LFBINARY.getLeafIndex());
            this.lfbinary = lfbinary;
            return this;
        }

        @Override
        public ContBuilder lfref1(String lfref1) {
            getValueLeafFlags().set(LeafIdentifier.LFREF1.getLeafIndex());
            this.lfref1 = lfref1;
            return this;
        }

        @Override
        public ContBuilder lfref2(byte lfref2) {
            getValueLeafFlags().set(LeafIdentifier.LFREF2.getLeafIndex());
            this.lfref2 = lfref2;
            return this;
        }

        @Override
        public ContBuilder lfempty(boolean lfempty) {
            getValueLeafFlags().set(LeafIdentifier.LFEMPTY.getLeafIndex());
            this.lfempty = lfempty;
            return this;
        }

        @Override
        public ContBuilder lfunion1(Lfunion1Union lfunion1) {
            getValueLeafFlags().set(LeafIdentifier.LFUNION1.getLeafIndex());
            this.lfunion1 = lfunion1;
            return this;
        }

        @Override
        public ContBuilder lfunion2(Lfunion2Union lfunion2) {
            getValueLeafFlags().set(LeafIdentifier.LFUNION2.getLeafIndex());
            this.lfunion2 = lfunion2;
            return this;
        }

        @Override
        public ContBuilder lfunion4(Lfunion4Union lfunion4) {
            getValueLeafFlags().set(LeafIdentifier.LFUNION4.getLeafIndex());
            this.lfunion4 = lfunion4;
            return this;
        }

        @Override
        public ContBuilder lfunion5(Lfunion5Union lfunion5) {
            getValueLeafFlags().set(LeafIdentifier.LFUNION5.getLeafIndex());
            this.lfunion5 = lfunion5;
            return this;
        }

        @Override
        public ContBuilder lfunion7(Tpdfun3 lfunion7) {
            getValueLeafFlags().set(LeafIdentifier.LFUNION7.getLeafIndex());
            this.lfunion7 = lfunion7;
            return this;
        }

        @Override
        public ContBuilder lfunion8(Lfunion8Union lfunion8) {
            getValueLeafFlags().set(LeafIdentifier.LFUNION8.getLeafIndex());
            this.lfunion8 = lfunion8;
            return this;
        }

        @Override
        public ContBuilder lfunion9(Lfunion9Union lfunion9) {
            getValueLeafFlags().set(LeafIdentifier.LFUNION9.getLeafIndex());
            this.lfunion9 = lfunion9;
            return this;
        }

        @Override
        public ContBuilder lfunion10(Lfunion10Union lfunion10) {
            getValueLeafFlags().set(LeafIdentifier.LFUNION10.getLeafIndex());
            this.lfunion10 = lfunion10;
            return this;
        }

        @Override
        public ContBuilder lfunion11(Lfunion11Union lfunion11) {
            getValueLeafFlags().set(LeafIdentifier.LFUNION11.getLeafIndex());
            this.lfunion11 = lfunion11;
            return this;
        }

        @Override
        public ContBuilder lfunion12(Tpdfun2 lfunion12) {
            getValueLeafFlags().set(LeafIdentifier.LFUNION12.getLeafIndex());
            this.lfunion12 = lfunion12;
            return this;
        }

        @Override
        public ContBuilder lfunion13(Tpdfbit lfunion13) {
            getValueLeafFlags().set(LeafIdentifier.LFUNION13.getLeafIndex());
            this.lfunion13 = lfunion13;
            return this;
        }

        @Override
        public ContBuilder lfunion14(Lfunion14Union lfunion14) {
            getValueLeafFlags().set(LeafIdentifier.LFUNION14.getLeafIndex());
            this.lfunion14 = lfunion14;
            return this;
        }

        @Override
        public ContBuilder identityref1(Iden identityref1) {
            getValueLeafFlags().set(LeafIdentifier.IDENTITYREF1.getLeafIndex());
            this.identityref1 = identityref1;
            return this;
        }

        @Override
        public ContBuilder onosYangNodeOperationType(OnosYangNodeOperationType onosYangNodeOperationType) {
            this.onosYangNodeOperationType = onosYangNodeOperationType;
            return this;
        }

        /**
         * Returns the valueLeafFlags.
         *
         * @return value of valueLeafFlags
         */
        public BitSet getValueLeafFlags() {
            return valueLeafFlags;
        }

        /**
         * Returns the selectLeafFlags.
         *
         * @return value of selectLeafFlags
         */
        public BitSet getSelectLeafFlags() {
            return selectLeafFlags;
        }



        @Override
        public ContBuilder selectLeaf(LeafIdentifier leaf) {
            getSelectLeafFlags().set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public void addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }

        @Override
        public Map<Class<?>, Object> yangAugmentedInfoMap() {
            return yangAugmentedInfoMap;
        }
        @Override
        public Cont build() {
            return new DefaultCont(this);
        }

        /**
         * Creates an instance of contBuilder.
         */
        public ContBuilder() {
        }
    }
}
