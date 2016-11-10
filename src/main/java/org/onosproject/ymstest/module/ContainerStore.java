package org.onosproject.ymstest.module;

import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.SimpleDataTypes;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.Cont;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.Iden;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.Tpdfbit;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.Tpdfun2;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.Tpdfun3;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.Cont2;
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
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.List2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by root1 on 18/10/16.
 */
public class ContainerStore implements Cont {
    protected SimpleDataTypes.OnosYangOpType onosYangOpType;
    protected BitSet valueLeafFlags = new BitSet();
    private Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    private byte lfint8Max;
    private byte lfint8Min;
    private short lfint16Min;
    private short lfint16Max;
    private int lfint32Min;
    private int lfint32Max;
    private long lfint64Min;
    private long lfint64Max;
    private short lfuint8Max;
    private int lfuint16Max;
    private long lfuint32Max;
    private String lfstr;
    private BigInteger lfuint64Max;
    private String lfstr1;
    private boolean lfbool1;
    private boolean lfbool2;
    private boolean lfbool3;
    private BigDecimal lfdecimal1;
    private BigDecimal lfdecimal2;
    private BigDecimal lfdecimal3;
    private BigDecimal lfdecimal4;
    private BigDecimal lfdecimal6;
    private LfenumEnum lfenum;
    private BitSet lfbits;
    private byte[] lfbinary;
    private String lfref1;
    private byte lfref2;
    private boolean lfempty;
    private Lfunion1Union lfunion1;
    private Lfunion2Union lfunion2;
    private Lfunion4Union lfunion4;
    private Lfunion5Union lfunion5;
    private Lfunion8Union lfunion8;
    private Lfunion9Union lfunion9;
    private Lfunion10Union lfunion10;
    private Lfunion11Union lfunion11;
    private Tpdfun3 lfunion7;
    private Tpdfun2 lfunion12;
    private Tpdfbit lfunion13;
    private Lfunion14Union lfunion14;
    private Class<? extends Iden> identityref1;
    private Cont2 cont2;
    private List<List2> list2 = new ArrayList<>();

    public void lfint8Max(byte lfint8Max) {
        valueLeafFlags.set(LeafIdentifier.LFINT8MAX.getLeafIndex());
        this.lfint8Max = lfint8Max;
    }

    public void lfint8Min(byte lfint8Min) {
        valueLeafFlags.set(LeafIdentifier.LFINT8MIN.getLeafIndex());
        this.lfint8Min = lfint8Min;
    }

    public void lfint16Min(short lfint16Min) {
        valueLeafFlags.set(LeafIdentifier.LFINT16MIN.getLeafIndex());
        this.lfint16Min = lfint16Min;
    }

    public void lfint16Max(short lfint16Max) {
        valueLeafFlags.set(LeafIdentifier.LFINT16MAX.getLeafIndex());
        this.lfint16Max = lfint16Max;
    }

    public void lfint32Min(int lfint32Min) {
        valueLeafFlags.set(LeafIdentifier.LFINT32MIN.getLeafIndex());
        this.lfint32Min = lfint32Min;
    }

    public void lfint32Max(int lfint32Max) {
        valueLeafFlags.set(LeafIdentifier.LFINT32MAX.getLeafIndex());
        this.lfint32Max = lfint32Max;
    }

    public void lfint64Min(long lfint64Min) {
        valueLeafFlags.set(LeafIdentifier.LFINT64MIN.getLeafIndex());
        this.lfint64Min = lfint64Min;
    }

    public void lfint64Max(long lfint64Max) {
        valueLeafFlags.set(LeafIdentifier.LFINT64MAX.getLeafIndex());
        this.lfint64Max = lfint64Max;
    }

    public void lfuint8Max(short lfuint8Max) {
        valueLeafFlags.set(LeafIdentifier.LFUINT8MAX.getLeafIndex());
        this.lfuint8Max = lfuint8Max;
    }

    public void lfuint16Max(int lfuint16Max) {
        valueLeafFlags.set(LeafIdentifier.LFUINT16MAX.getLeafIndex());
        this.lfuint16Max = lfuint16Max;
    }

    public void lfuint32Max(long lfuint32Max) {
        valueLeafFlags.set(LeafIdentifier.LFUINT32MAX.getLeafIndex());
        this.lfuint32Max = lfuint32Max;
    }

    public void lfstr(String lfstr) {
        valueLeafFlags.set(LeafIdentifier.LFSTR.getLeafIndex());
        this.lfstr = lfstr;
    }

    public void lfuint64Max(BigInteger lfuint64Max) {
        valueLeafFlags.set(LeafIdentifier.LFUINT64MAX.getLeafIndex());
        this.lfuint64Max = lfuint64Max;
    }

    public void lfstr1(String lfstr1) {
        valueLeafFlags.set(LeafIdentifier.LFSTR1.getLeafIndex());
        this.lfstr1 = lfstr1;
    }

    public void lfbool1(boolean lfbool1) {
        valueLeafFlags.set(LeafIdentifier.LFBOOL1.getLeafIndex());
        this.lfbool1 = lfbool1;
    }

    public void lfbool2(boolean lfbool2) {
        valueLeafFlags.set(LeafIdentifier.LFBOOL2.getLeafIndex());
        this.lfbool2 = lfbool2;
    }

    public void lfbool3(boolean lfbool3) {
        valueLeafFlags.set(LeafIdentifier.LFBOOL3.getLeafIndex());
        this.lfbool3 = lfbool3;
    }

    public void lfdecimal1(BigDecimal lfdecimal1) {
        valueLeafFlags.set(LeafIdentifier.LFDECIMAL1.getLeafIndex());
        this.lfdecimal1 = lfdecimal1;
    }

    public void lfdecimal2(BigDecimal lfdecimal2) {
        valueLeafFlags.set(LeafIdentifier.LFDECIMAL2.getLeafIndex());
        this.lfdecimal2 = lfdecimal2;
    }

    public void lfdecimal3(BigDecimal lfdecimal3) {
        valueLeafFlags.set(LeafIdentifier.LFDECIMAL3.getLeafIndex());
        this.lfdecimal3 = lfdecimal3;
    }

    public void lfdecimal4(BigDecimal lfdecimal4) {
        valueLeafFlags.set(LeafIdentifier.LFDECIMAL4.getLeafIndex());
        this.lfdecimal4 = lfdecimal4;
    }

    public void lfdecimal6(BigDecimal lfdecimal6) {
        valueLeafFlags.set(LeafIdentifier.LFDECIMAL6.getLeafIndex());
        this.lfdecimal6 = lfdecimal6;
    }

    public void lfenum(LfenumEnum lfenum) {
        valueLeafFlags.set(LeafIdentifier.LFENUM.getLeafIndex());
        this.lfenum = lfenum;
    }

    public void lfbits(BitSet lfbits) {
        valueLeafFlags.set(LeafIdentifier.LFBITS.getLeafIndex());
        this.lfbits = lfbits;
    }

    public void lfbinary(byte[] lfbinary) {
        valueLeafFlags.set(LeafIdentifier.LFBINARY.getLeafIndex());
        this.lfbinary = lfbinary;
    }

    public void lfref1(String lfref1) {
        valueLeafFlags.set(LeafIdentifier.LFREF1.getLeafIndex());
        this.lfref1 = lfref1;
    }

    public void lfref2(byte lfref2) {
        valueLeafFlags.set(LeafIdentifier.LFREF2.getLeafIndex());
        this.lfref2 = lfref2;
    }

    public void lfempty(boolean lfempty) {
        valueLeafFlags.set(LeafIdentifier.LFEMPTY.getLeafIndex());
        this.lfempty = lfempty;
    }

    public void lfunion1(Lfunion1Union lfunion1) {
        valueLeafFlags.set(LeafIdentifier.LFUNION1.getLeafIndex());
        this.lfunion1 = lfunion1;
    }

    public void lfunion2(Lfunion2Union lfunion2) {
        valueLeafFlags.set(LeafIdentifier.LFUNION2.getLeafIndex());
        this.lfunion2 = lfunion2;
    }

    public void lfunion4(Lfunion4Union lfunion4) {
        valueLeafFlags.set(LeafIdentifier.LFUNION4.getLeafIndex());
        this.lfunion4 = lfunion4;
    }

    public void lfunion5(Lfunion5Union lfunion5) {
        valueLeafFlags.set(LeafIdentifier.LFUNION5.getLeafIndex());
        this.lfunion5 = lfunion5;
    }

    public void lfunion8(Lfunion8Union lfunion8) {
        valueLeafFlags.set(LeafIdentifier.LFUNION5.getLeafIndex());
        this.lfunion8 = lfunion8;
    }

    public void lfunion9(Lfunion9Union lfunion9) {
        valueLeafFlags.set(LeafIdentifier.LFUNION9.getLeafIndex());
        this.lfunion9 = lfunion9;
    }

    public void lfunion10(Lfunion10Union lfunion10) {
        valueLeafFlags.set(LeafIdentifier.LFUNION10.getLeafIndex());
        this.lfunion10 = lfunion10;
    }

    public void lfunion11(Lfunion11Union lfunion11) {
        valueLeafFlags.set(LeafIdentifier.LFUNION11.getLeafIndex());
        this.lfunion11 = lfunion11;
    }

    public void lfunion7(Tpdfun3 lfunion7) {
        valueLeafFlags.set(LeafIdentifier.LFUNION7.getLeafIndex());
        this.lfunion7 = lfunion7;
    }

    public void lfunion12(Tpdfun2 lfunion12) {
        valueLeafFlags.set(LeafIdentifier.LFUNION12.getLeafIndex());
        this.lfunion12 = lfunion12;
    }

    public void lfunion13(Tpdfbit lfunion13) {
        valueLeafFlags.set(LeafIdentifier.LFUNION13.getLeafIndex());
        this.lfunion13 = lfunion13;
    }

    public void lfunion14(Lfunion14Union lfunion14) {
        valueLeafFlags.set(LeafIdentifier.LFUNION14.getLeafIndex());
        this.lfunion14 = lfunion14;
    }

    public void identityref1(Class<? extends Iden> identityref1) {
        valueLeafFlags.set(LeafIdentifier.IDENTITYREF1.getLeafIndex());
        this.identityref1 = identityref1;
    }

    public void cont2(Cont2 cont2) {
        this.cont2 = cont2;
    }

    public void list2(List<List2> list2) {
        this.list2 = list2;
    }


    /**
     * Returns the attribute lfint8Min.
     *
     * @return lfint8Min value of lfint8Min
     */
    public byte lfint8Min() {
        return lfint8Min;
    }

    /**
     * Returns the attribute lfint8Max.
     *
     * @return lfint8Max value of lfint8Max
     */
    public byte lfint8Max() {
        return lfint8Max;
    }

    /**
     * Returns the attribute lfint16Min.
     *
     * @return lfint16Min value of lfint16Min
     */
    public short lfint16Min() {
        return lfint16Min;
    }

    /**
     * Returns the attribute lfint16Max.
     *
     * @return lfint16Max value of lfint16Max
     */
    public short lfint16Max() {
        return lfint16Max;
    }

    /**
     * Returns the attribute lfint32Min.
     *
     * @return lfint32Min value of lfint32Min
     */
    public int lfint32Min() {
        return lfint32Min;
    }

    /**
     * Returns the attribute lfint32Max.
     *
     * @return lfint32Max value of lfint32Max
     */
    public int lfint32Max() {
        return lfint32Max;
    }

    /**
     * Returns the attribute lfint64Min.
     *
     * @return lfint64Min value of lfint64Min
     */
    public long lfint64Min() {
        return lfint64Min;
    }

    /**
     * Returns the attribute lfint64Max.
     *
     * @return lfint64Max value of lfint64Max
     */
    public long lfint64Max() {
        return lfint64Max;
    }

    /**
     * Returns the attribute lfuint8Max.
     *
     * @return lfuint8Max value of lfuint8Max
     */
    public short lfuint8Max() {
        return lfuint8Max;
    }

    /**
     * Returns the attribute lfuint16Max.
     *
     * @return lfuint16Max value of lfuint16Max
     */
    public int lfuint16Max() {
        return lfuint16Max;
    }

    /**
     * Returns the attribute lfuint32Max.
     *
     * @return lfuint32Max value of lfuint32Max
     */
    public long lfuint32Max() {
        return lfuint32Max;
    }

    /**
     * Returns the attribute lfuint64Max.
     *
     * @return lfuint64Max value of lfuint64Max
     */
    public BigInteger lfuint64Max() {
        return lfuint64Max;
    }

    /**
     * Returns the attribute lfstr.
     *
     * @return lfstr value of lfstr
     */
    public String lfstr() {
        return lfstr;
    }

    /**
     * Returns the attribute lfstr1.
     *
     * @return lfstr1 value of lfstr1
     */
    public String lfstr1() {
        return lfstr1;
    }

    /**
     * Returns the attribute lfbool1.
     *
     * @return lfbool1 value of lfbool1
     */
    public boolean lfbool1() {
        return lfbool1;
    }

    /**
     * Returns the attribute lfbool2.
     *
     * @return lfbool2 value of lfbool2
     */
    public boolean lfbool2() {
        return lfbool2;
    }

    /**
     * Returns the attribute lfbool3.
     *
     * @return lfbool3 value of lfbool3
     */
    public boolean lfbool3() {
        return lfbool3;
    }

    /**
     * Returns the attribute lfdecimal1.
     *
     * @return lfdecimal1 value of lfdecimal1
     */
    public BigDecimal lfdecimal1() {
        return lfdecimal1;
    }

    /**
     * Returns the attribute lfdecimal2.
     *
     * @return lfdecimal2 value of lfdecimal2
     */
    public BigDecimal lfdecimal2() {
        return lfdecimal2;
    }

    /**
     * Returns the attribute lfdecimal3.
     *
     * @return lfdecimal3 value of lfdecimal3
     */
    public BigDecimal lfdecimal3() {
        return lfdecimal3;
    }

    /**
     * Returns the attribute lfdecimal4.
     *
     * @return lfdecimal4 value of lfdecimal4
     */
    public BigDecimal lfdecimal4() {
        return lfdecimal4;
    }

    /**
     * Returns the attribute lfdecimal6.
     *
     * @return lfdecimal6 value of lfdecimal6
     */
    public BigDecimal lfdecimal6() {
        return lfdecimal6;
    }

    /**
     * Returns the attribute lfenum.
     *
     * @return lfenum value of lfenum
     */
    public LfenumEnum lfenum() {
        return lfenum;
    }

    /**
     * Returns the attribute lfbits.
     *
     * @return lfbits value of lfbits
     */
    public BitSet lfbits() {
        return lfbits;
    }

    /**
     * Returns the attribute lfbinary.
     *
     * @return lfbinary value of lfbinary
     */
    public byte[] lfbinary() {
        return lfbinary;
    }

    /**
     * Returns the attribute lfref1.
     *
     * @return lfref1 value of lfref1
     */
    public String lfref1() {
        return lfref1;
    }

    /**
     * Returns the attribute lfref2.
     *
     * @return lfref2 value of lfref2
     */
    public byte lfref2() {
        return lfref2;
    }

    /**
     * Returns the attribute lfempty.
     *
     * @return lfempty value of lfempty
     */
    public boolean lfempty() {
        return lfempty;
    }

    /**
     * Returns the attribute lfunion1.
     *
     * @return lfunion1 value of lfunion1
     */
    public Lfunion1Union lfunion1() {
        return lfunion1;
    }

    /**
     * Returns the attribute lfunion2.
     *
     * @return lfunion2 value of lfunion2
     */
    public Lfunion2Union lfunion2() {
        return lfunion2;
    }

    /**
     * Returns the attribute lfunion4.
     *
     * @return lfunion4 value of lfunion4
     */
    public Lfunion4Union lfunion4() {
        return lfunion4;
    }

    /**
     * Returns the attribute lfunion5.
     *
     * @return lfunion5 value of lfunion5
     */
    public Lfunion5Union lfunion5() {
        return lfunion5;
    }

    /**
     * Returns the attribute lfunion7.
     *
     * @return lfunion7 value of lfunion7
     */
    public Tpdfun3 lfunion7() {
        return lfunion7;
    }

    /**
     * Returns the attribute lfunion8.
     *
     * @return lfunion8 value of lfunion8
     */
    public Lfunion8Union lfunion8() {
        return lfunion8;
    }

    /**
     * Returns the attribute lfunion9.
     *
     * @return lfunion9 value of lfunion9
     */
    public Lfunion9Union lfunion9() {
        return lfunion9;
    }

    /**
     * Returns the attribute lfunion10.
     *
     * @return lfunion10 value of lfunion10
     */
    public Lfunion10Union lfunion10() {
        return lfunion10;
    }

    /**
     * Returns the attribute lfunion11.
     *
     * @return lfunion11 value of lfunion11
     */
    public Lfunion11Union lfunion11() {
        return lfunion11;
    }

    /**
     * Returns the attribute lfunion12.
     *
     * @return lfunion12 value of lfunion12
     */
    public Tpdfun2 lfunion12() {
        return lfunion12;
    }

    /**
     * Returns the attribute lfunion13.
     *
     * @return lfunion13 value of lfunion13
     */
    public Tpdfbit lfunion13() {
        return lfunion13;
    }

    /**
     * Returns the attribute lfunion14.
     *
     * @return lfunion14 value of lfunion14
     */
    public Lfunion14Union lfunion14() {
        return lfunion14;
    }

    /**
     * Returns the attribute identityref1.
     *
     * @return identityref1 value of identityref1
     */
    public Class<? extends Iden> identityref1() {
        return identityref1;
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
     * Returns the attribute yangContOpType.
     *
     * @return yangContOpType value of yangContOpType
     */
    public SimpleDataTypes.OnosYangOpType yangContOpType() {
        return onosYangOpType;
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
     * Returns the attribute cont2.
     *
     * @return cont2 value of cont2
     */
    public Cont2 cont2() {
        return cont2;
    }

    /**
     * Returns the attribute list2.
     *
     * @return list2 list of list2
     */
    public List<List2> list2() {
        return list2;
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
     * Checks if the passed Cont maps the content match query condition.
     *
     * @param cont                   cont being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public Cont processSubtreeFiltering(Cont cont, boolean isSelectAllSchemaChild) {
        return null;
    }

    /**
     * Checks if the leaf value is set.
     *
     * @param leaf leaf whose value status needs to checked
     * @return result of leaf value set in object
     */
    public boolean isLeafValueSet(LeafIdentifier leaf) {
        //return valueLeafFlags.get(leaf.getLeafIndex());
        return (new Integer(lfint8Min) != null);
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

    public void processEdit(Cont cont) {
        switch (cont.yangContOpType()) {
            case CREATE: {
                lfint8Max(cont.lfint8Max());
                lfint8Min(cont.lfint8Min());
                lfint16Min(cont.lfint16Min());
                lfint16Max(cont.lfint16Max());
                lfint32Min(cont.lfint32Min());
                lfint32Max(cont.lfint32Max());
                lfint64Min(cont.lfint64Min());
                lfint64Max(cont.lfint64Max());
                lfuint8Max(cont.lfuint8Max());
                lfuint16Max(cont.lfuint16Max());
                lfuint32Max(cont.lfuint32Max());
                lfstr(cont.lfstr());
                lfuint64Max(cont.lfuint64Max());
                lfstr1(cont.lfstr1());
                lfbool1(cont.lfbool1());
                lfbool2(cont.lfbool2());
                lfbool3(cont.lfbool3());
                lfdecimal1(cont.lfdecimal1());
                lfdecimal2(cont.lfdecimal2());
                lfdecimal3(cont.lfdecimal3());
                lfdecimal4(cont.lfdecimal4());
                lfdecimal6(cont.lfdecimal6());
                lfenum(cont.lfenum());
                lfbits(cont.lfbits());
                lfbinary(cont.lfbinary());
                lfref1(cont.lfref1());
                lfref2(cont.lfref2());
                lfempty(cont.lfempty());
                lfunion1(cont.lfunion1());
                lfunion2(cont.lfunion2());
                lfunion4(cont.lfunion4());
                lfunion5(cont.lfunion5());
                lfunion8(cont.lfunion8());
                lfunion9(cont.lfunion9());
                lfunion10(cont.lfunion10());
                lfunion11(cont.lfunion11());
                lfunion7(cont.lfunion7());
                lfunion12(cont.lfunion12());
                lfunion13(cont.lfunion13());
                lfunion14(cont.lfunion14());
                identityref1(cont.identityref1());

                return;
            }
            case DELETE: {
                //do nothing, current stored node will be removed
                return;
            }

            case REPLACE: {
                lfint8Max(cont.lfint8Max());
                lfint8Min(cont.lfint8Min());
                lfint16Min(cont.lfint16Min());
                lfint16Max(cont.lfint16Max());
                lfint32Min(cont.lfint32Min());
                lfint32Max(cont.lfint32Max());
                lfint64Min(cont.lfint64Min());
                lfint64Max(cont.lfint64Max());
                lfuint8Max(cont.lfuint8Max());
                lfuint16Max(cont.lfuint16Max());
                lfuint32Max(cont.lfuint32Max());
                lfstr(cont.lfstr());
                lfuint64Max(cont.lfuint64Max());
                lfstr1(cont.lfstr1());
                lfbool1(cont.lfbool1());
                lfbool2(cont.lfbool2());
                lfbool3(cont.lfbool3());
                lfdecimal1(cont.lfdecimal1());
                lfdecimal2(cont.lfdecimal2());
                lfdecimal3(cont.lfdecimal3());
                lfdecimal4(cont.lfdecimal4());
                lfdecimal6(cont.lfdecimal6());
                lfenum(cont.lfenum());
                lfbits(cont.lfbits());
                lfbinary(cont.lfbinary());
                lfref1(cont.lfref1());
                lfref2(cont.lfref2());
                lfempty(cont.lfempty());
                lfunion1(cont.lfunion1());
                lfunion2(cont.lfunion2());
                lfunion4(cont.lfunion4());
                lfunion5(cont.lfunion5());
                lfunion8(cont.lfunion8());
                lfunion9(cont.lfunion9());
                lfunion10(cont.lfunion10());
                lfunion11(cont.lfunion11());
                lfunion7(cont.lfunion7());
                lfunion12(cont.lfunion12());
                lfunion13(cont.lfunion13());
                lfunion14(cont.lfunion14());
                identityref1(cont.identityref1());
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
}
